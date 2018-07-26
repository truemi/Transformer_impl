package com.truemi.transformaer.transformerLib;

import android.view.View;

/**
 * 外侧3D旋转
 */
public class PageTransformer3D extends BasePageTransformer {
    private float mMaxRotation = 90.0f;

    public PageTransformer3D() {
    }
    public PageTransformer3D(float maxRotation) {
        setMaxRotation(maxRotation);
    }

    @Override
    public void touch2Left(View view, float position) {
        //设置旋转中心点
        view.setPivotX(view.getMeasuredWidth());
        view.setPivotY(view.getMeasuredHeight() * 0.5f);
        view.setRotationY(mMaxRotation * position);

    }

    @Override
    public void touch2Right(View view, float position) {
        //设置旋转中心点
        view.setPivotX(0);
        view.setPivotY(view.getMeasuredHeight() * 0.5f);
        view.setRotationY(mMaxRotation * position);
    }

    @Override
    public void other(View view, float position) {

    }

    public void setMaxRotation(float maxRotation) {
        if (maxRotation >= 0.0f && maxRotation <= 90.0f) {
            mMaxRotation = maxRotation;
        }
    }

}