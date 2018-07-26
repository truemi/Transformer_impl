package com.truemi.transformaer.transformerLib;

import android.view.View;

/**
 * 渐变
 */
public class PageTransformerFadeIn extends BasePageTransformer {
    private float mMaxAlpha = 1.0f;

    public PageTransformerFadeIn() {
    }
    public PageTransformerFadeIn(float maxRotation) {
        setMaxAlpha(maxRotation);
    }

    @Override
    public void touch2Left(View view, float position) {
        //设置旋转中心点
        view.setPivotX(view.getMeasuredWidth()* 0.5f);
        view.setPivotY(view.getMeasuredHeight() * 0.5f);
        if (Math.abs(position)<mMaxAlpha){
            view.setAlpha(1-Math.abs(position));
        }else{
            view.setAlpha(mMaxAlpha);
        }


    }

    @Override
    public void touch2Right(View view, float position) {
        //设置旋转中心点
        view.setPivotX(view.getMeasuredWidth()* 0.5f);
        view.setPivotY(view.getMeasuredHeight() * 0.5f);
        view.setAlpha(1-position);
    }

    @Override
    public void other(View view, float position) {

    }

    public void setMaxAlpha(float maxAlpha) {
        if (maxAlpha >= 0.0f && maxAlpha <= 1.0f) {
            mMaxAlpha = maxAlpha;
        }
    }

}