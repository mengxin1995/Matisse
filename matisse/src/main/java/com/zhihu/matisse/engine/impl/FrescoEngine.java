package com.zhihu.matisse.engine.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.zhihu.matisse.engine.ImageEngine;
import com.zhihu.matisse.internal.utils.FrecoUtils;

/**
 * Created by mengxin on 2017/11/21.
 */

public class FrescoEngine implements ImageEngine {
    private static final String TAG = "FrescoEngine";
    @Override
    public void loadThumbnail(Context context, int resize, Drawable placeholder, SimpleDraweeView imageView, Uri uri) {
        FrecoUtils.displayImage(imageView, resize, uri.toString());
        Log.d(TAG, "loadThumbnail: ");
    }

    @Override
    public void loadGifThumbnail(Context context, int resize, Drawable placeholder, SimpleDraweeView imageView, Uri uri) {
        FrecoUtils.displayImage(imageView, resize,uri.toString());
        Log.d(TAG, "loadGifThumbnail: ");
    }

    @Override
    public void loadImage(Context context, int resizeX, int resizeY, ImageView imageView, Uri uri) {
        Log.d(TAG, "loadImage: ");
    }

    @Override
    public void loadGifImage(Context context, int resizeX, int resizeY, ImageView imageView, Uri uri) {
        Log.d(TAG, "loadGifImage: ");
    }

    @Override
    public boolean supportAnimatedGif() {
        return false;
    }
}
