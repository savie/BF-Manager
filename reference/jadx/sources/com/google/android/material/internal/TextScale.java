package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import l.AbstractC11766;
import l.C8238;

/* JADX INFO: loaded from: classes.dex */
public class TextScale extends AbstractC11766 {
    public static final String PROPNAME_SCALE = "android:textscale:scale";

    @Override // l.AbstractC11766
    public void captureStartValues(C8238 c8238) {
        captureValues(c8238);
    }

    @Override // l.AbstractC11766
    public void captureEndValues(C8238 c8238) {
        captureValues(c8238);
    }

    private void captureValues(C8238 c8238) {
        View view = c8238.f28685;
        if (view instanceof TextView) {
            c8238.f28686.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // l.AbstractC11766
    public Animator createAnimator(ViewGroup viewGroup, C8238 c8238, C8238 c8239) {
        if (c8238 == null || c8239 == null || !(c8238.f28685 instanceof TextView)) {
            return null;
        }
        View view = c8239.f28685;
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        HashMap map = c8238.f28686;
        HashMap map2 = c8239.f28686;
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
