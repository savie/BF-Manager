package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import l.AbstractC0329;
import l.C22508;

/* JADX INFO: loaded from: classes.dex */
public class TextScale extends AbstractC0329 {
    public static final String PROPNAME_SCALE = "android:textscale:scale";

    @Override // l.AbstractC0329
    public void captureStartValues(C22508 c22508) {
        captureValues(c22508);
    }

    @Override // l.AbstractC0329
    public void captureEndValues(C22508 c22508) {
        captureValues(c22508);
    }

    private void captureValues(C22508 c22508) {
        View view = c22508.f72817;
        if (view instanceof TextView) {
            c22508.f72818.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // l.AbstractC0329
    public Animator createAnimator(ViewGroup viewGroup, C22508 c22508, C22508 c22509) {
        if (c22508 == null || c22509 == null || !(c22508.f72817 instanceof TextView)) {
            return null;
        }
        View view = c22509.f72817;
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        HashMap map = c22508.f72818;
        HashMap map2 = c22509.f72818;
        float fFloatValue = map.get(PROPNAME_SCALE) != null ? ((Float) map.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        float fFloatValue2 = map2.get(PROPNAME_SCALE) != null ? ((Float) map2.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.TextScale.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(fFloatValue3);
                textView.setScaleY(fFloatValue3);
            }
        });
        return valueAnimatorOfFloat;
    }
}
