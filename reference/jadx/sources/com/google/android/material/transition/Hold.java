package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import l.AbstractC21016;
import l.C22508;

/* JADX INFO: loaded from: classes.dex */
public final class Hold extends AbstractC21016 {
    @Override // l.AbstractC21016
    public Animator onAppear(ViewGroup viewGroup, View view, C22508 c22508, C22508 c22509) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // l.AbstractC21016
    public Animator onDisappear(ViewGroup viewGroup, View view, C22508 c22508, C22508 c22509) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
