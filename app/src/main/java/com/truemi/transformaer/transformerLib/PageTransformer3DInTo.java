package com.truemi.transformaer.transformerLib;

import android.view.View;

/**
 * 内侧3D旋转
 */
public class PageTransformer3DInTo extends BasePageTransformer {
//    建议不要大于30.0f,由于旋转视角的原因,大于30.0f可能会造成view消失的问题
    private float mMaxRotation = 30.0f;

    public PageTransformer3DInTo() {
    }
    public PageTransformer3DInTo(float maxRotation) {
        setMaxRotation(maxRotation);
    }

    @Override
    public void touch2Left(View view, float position) {
        if (Math.abs(position)<=0.7f) {
            float positions =(1-Math.abs(position))<0.7f?0.7f:1-Math.abs(position);
            view.setScaleY(positions);
        }else if ((Math.abs(position))>0.7f){
            view.setScaleY((Math.abs(position)));
        }
        view.setPivotX(view.getMeasuredWidth());
        view.setPivotY(view.getMeasuredHeight() * 0.5f);
        view.setRotationY(mMaxRotation *Math.abs(position));
    }

    @Override
    public void touch2Right(View view, float position) {
        view.setPivotX(0);
        view.setPivotY(view.getMeasuredHeight() * 0.5f);
        view.setRotationY((mMaxRotation) *-position);
        if (position>0.3 && position<1) {
            float positions = (position) < 0.7f ? 0.7f : position;
            view.setScaleY(positions);
        }
        else if (position<0.3){
            view.setScaleY(1-position);
        }
    }

    @Override
    public void other(View view, float position) {
    }

    public void setMaxRotation(float maxRotation) {
        if (maxRotation >= 0.0f && maxRotation <= 30.0f) {
            mMaxRotation = maxRotation;
        }
    }

}