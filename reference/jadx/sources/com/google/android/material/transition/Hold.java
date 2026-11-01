package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import l.AbstractC4337;
import l.C8238;

/* JADX INFO: loaded from: classes.dex */
public final class Hold extends AbstractC4337 {
    @Override // l.AbstractC4337
    public Animator onAppear(ViewGroup viewGroup, View view, C8238 c8238, C8238 c8239) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // l.AbstractC4337
    public Animator onDisappear(ViewGroup viewGroup, View view, C8238 c8238, C8238 c8239) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
