package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import l.C17381;
import l.C3224;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayoutUtils {
    public static final int DEFAULT_SCRIM_COLOR = -1728053248;
    public static final int DEFAULT_SCRIM_ALPHA = Color.alpha(DEFAULT_SCRIM_COLOR);

    public static ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(final C17381 c17381) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.DrawerLayoutUtils$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0(c17381, valueAnimator);
            }
        };
    }

    public static /* synthetic */ void lambda$getScrimCloseAnimatorUpdateListener$0(C17381 c17381, ValueAnimator valueAnimator) {
        c17381.m40495(C3224.m9668(DEFAULT_SCRIM_COLOR, AnimationUtils.lerp(DEFAULT_SCRIM_ALPHA, 0, valueAnimator.getAnimatedFraction())));
    }

    public static Animator.AnimatorListener getScrimCloseAnimatorListener(final C17381 c17381, final View view) {
        return new AnimatorListenerAdapter() { // from class: com.google.android.material.navigation.DrawerLayoutUtils.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                c17381.m40479(view, false);
                c17381.m40495(DrawerLayoutUtils.DEFAULT_SCRIM_COLOR);
            }
        };
    }
}
