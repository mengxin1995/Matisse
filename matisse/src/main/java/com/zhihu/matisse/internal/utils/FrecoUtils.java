package com.zhihu.matisse.internal.utils;

import android.net.Uri;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

/**
 * Created by mengxin on 2017/11/21.
 */

public class FrecoUtils {
    public static void displayImage(SimpleDraweeView simpleDraweeView, int resId) {
        displayImage(simpleDraweeView, "res:///" + resId, null);
    }

    public static void displayImage(SimpleDraweeView simpleDraweeView, String url) {
        displayImage(simpleDraweeView, url, "");
    }

    public static void displayImage(SimpleDraweeView simpleDraweeView, String path, String imageSize) {
        //本地图片
        if (path.startsWith("/storage/")) {
            path = "file://" + path;
        }
        ImageRequest request = ImageRequestBuilder.newBuilderWithSource(Uri.parse((imageSize == null || imageSize.equals("")) ? path : path + imageSize))
                .setProgressiveRenderingEnabled(true)
                .build();
        DraweeController draweeController = Fresco.newDraweeControllerBuilder()
                .setImageRequest(request)
                .setAutoPlayAnimations(true)
                .build();
        simpleDraweeView.setController(draweeController);
    }

}
