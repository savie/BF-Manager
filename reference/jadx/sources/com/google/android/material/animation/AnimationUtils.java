package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import l.C0280;
import l.C15058;
import l.C22819;
import l.C6590;

/* JADX INFO: loaded from: classes.dex */
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new C22819();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new C6590();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new C15058();
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static float lerp(float f, float f2, float f3) {
        return C0280.m1792(f2, f, f3, f);
    }

    public static int lerp(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }

    public static float lerp(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : lerp(f, f2, (f5 - f3) / (f4 - f3));
    }
}
