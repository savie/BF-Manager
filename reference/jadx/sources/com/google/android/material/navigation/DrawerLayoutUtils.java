package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import l.C19988;
import l.C8147;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayoutUtils {
    public static final int DEFAULT_SCRIM_COLOR = -1728053248;
    public static final int DEFAULT_SCRIM_ALPHA = Color.alpha(DEFAULT_SCRIM_COLOR);

    public static ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(final C8147 c8147) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.DrawerLayoutUtils$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0(c8147, valueAnimator);
            }
        };
    }

    public static /* synthetic */ void lambda$getScrimCloseAnimatorUpdateListener$0(C8147 c8147, ValueAnimator valueAnimator) {
        c8147.m22044(C19988.m45964(DEFAULT_SCRIM_COLOR, AnimationUtils.lerp(DEFAULT_SCRIM_ALPHA, 0, valueAnimator.getAnimatedFraction())));
    }

    public static Animator.AnimatorListener getScrimCloseAnimatorListener(final C8147 c8147, final View view) {
        return new AnimatorListenerAdapter() { // from class: com.google.android.material.navigation.DrawerLayoutUtils.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                c8147.m22039(view, false);
                c8147.m22044(DrawerLayoutUtils.DEFAULT_SCRIM_COLOR);
            }
        };
    }
}
