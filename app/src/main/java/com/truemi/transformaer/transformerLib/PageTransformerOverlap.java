package com.truemi.transformaer.transformerLib;

import android.view.View;

/**
 * 重叠效果
 */
public class PageTransformerOverlap extends BasePageTransformer {
    private float mMaxScale = 0.75f;

    public PageTransformerOverlap() {
    }
    public PageTransformerOverlap(float maxRotation) {
        setMaxAlpha(maxRotation);
    }

    @Override
    public void touch2Left(View view, float position) {



    }

    @Override
    public void touch2Right(View view, float position) {
        float scaleFactor = mMaxScale+ (1 - mMaxScale) * (1 - Math.abs(position));
        view.setScaleX(scaleFactor);
        view.setScaleY(scaleFactor);
        view.setAlpha(1-position);
        view.setTranslationX(view.getMeasuredWidth() * -position);

    }

    @Override
    public void other(View view, float position) {
        //view.setScaleX(mMaxScale);
       // view.setScaleY(mMaxScale);
    }

    public void setMaxAlpha(float mMaxScale) {
        if (mMaxScale >= 0.0f && mMaxScale <= 1.0f) {
            this.mMaxScale = mMaxScale;
        }
    }

}