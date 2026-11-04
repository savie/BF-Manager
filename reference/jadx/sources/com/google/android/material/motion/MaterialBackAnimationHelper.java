package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import l.C11642;
import l.C18584;
import l.C6411;

/* JADX INFO: loaded from: classes.dex */
public abstract class MaterialBackAnimationHelper {
    public static final int CANCEL_DURATION_DEFAULT = 100;
    public static final int HIDE_DURATION_MAX_DEFAULT = 300;
    public static final int HIDE_DURATION_MIN_DEFAULT = 150;
    public static final String TAG = "MaterialBackHelper";
    public C18584 backEvent;
    public final int cancelDuration;
    public final int hideDurationMax;
    public final int hideDurationMin;
    public final TimeInterpolator progressInterpolator;
    public final View view;

    public MaterialBackAnimationHelper(View view) {
        this.view = view;
        Context context = view.getContext();
        this.progressInterpolator = MotionUtils.resolveThemeInterpolator(context, C11642.f37140, C6411.m18175(0.0f, 0.0f, 0.0f, 1.0f));
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, C11642.f37447, 300);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, C11642.f37174, 150);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, C11642.f36696, 100);
    }

    public float interpolateProgress(float f) {
        return this.progressInterpolator.getInterpolation(f);
    }

    public void onStartBackProgress(C18584 c18584) {
        this.backEvent = c18584;
    }

    public C18584 onUpdateBackProgress(C18584 c18584) {
        C18584 c18585 = this.backEvent;
        this.backEvent = c18584;
        return c18585;
    }

    public C18584 onHandleBackInvoked() {
        C18584 c18584 = this.backEvent;
        this.backEvent = null;
        return c18584;
    }

    public C18584 onCancelBackProgress() {
        C18584 c18584 = this.backEvent;
        this.backEvent = null;
        return c18584;
    }
}
