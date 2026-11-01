package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import l.C0443;
import l.C2387;
import l.C7189;

/* JADX INFO: loaded from: classes.dex */
public abstract class MaterialBackAnimationHelper {
    public static final int CANCEL_DURATION_DEFAULT = 100;
    public static final int HIDE_DURATION_MAX_DEFAULT = 300;
    public static final int HIDE_DURATION_MIN_DEFAULT = 150;
    public static final String TAG = "MaterialBackHelper";
    public C0443 backEvent;
    public final int cancelDuration;
    public final int hideDurationMax;
    public final int hideDurationMin;
    public final TimeInterpolator progressInterpolator;
    public final View view;

    public MaterialBackAnimationHelper(View view) {
        this.view = view;
        Context context = view.getContext();
        this.progressInterpolator = MotionUtils.resolveThemeInterpolator(context, C2387.f8581, C7189.m19121(0.0f, 0.0f, 0.0f, 1.0f));
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, C2387.f9367, 300);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, C2387.f9197, 150);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, C2387.f9435, 100);
    }

    public float interpolateProgress(float f) {
        return this.progressInterpolator.getInterpolation(f);
    }

    public void onStartBackProgress(C0443 c0443) {
        this.backEvent = c0443;
    }

    public C0443 onUpdateBackProgress(C0443 c0443) {
        C0443 c0444 = this.backEvent;
        this.backEvent = c0443;
        return c0444;
    }

    public C0443 onHandleBackInvoked() {
        C0443 c0443 = this.backEvent;
        this.backEvent = null;
        return c0443;
    }

    public C0443 onCancelBackProgress() {
        C0443 c0443 = this.backEvent;
        this.backEvent = null;
        return c0443;
    }
}
