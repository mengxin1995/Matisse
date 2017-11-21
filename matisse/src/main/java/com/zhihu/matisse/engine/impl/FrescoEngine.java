package com.zhihu.matisse.engine.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.zhihu.matisse.engine.ImageEngine;
import com.zhihu.matisse.internal.utils.FrecoUtils;

/**
 * Created by mengxin on 2017/11/21.
 */

public class FrescoEngine implements ImageEngine {
    @Override
    public void loadThumbnail(Context context, int resize, Drawable placeholder, SimpleDraweeView imageView, Uri uri) {
        FrecoUtils.displayImage(imageView, uri.toString());
    }

    @Override
    public void loadGifThumbnail(Context context, int resize, Drawable placeholder, SimpleDraweeView imageView, Uri uri) {

    }

    @Override
    public void loadImage(Context context, int resizeX, int resizeY, ImageView imageView, Uri uri) {

    }

    @Override
    public void loadGifImage(Context context, int resizeX, int resizeY, ImageView imageView, Uri uri) {

    }

    @Override
    public boolean supportAnimatedGif() {
        return false;
    }
}
