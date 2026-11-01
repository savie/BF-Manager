package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import l.AbstractC20847;
import l.AbstractC2220;
import l.C15909;
import l.C20142;
import l.C4449;
import l.InterfaceC8147;

/* JADX INFO: loaded from: classes.dex */
public final class DeterminateDrawable extends DrawableWithAnimatedVisibilityChange {
    public static final float GAP_RAMP_DOWN_THRESHOLD = 0.01f;
    public static final AbstractC20847 INDICATOR_LENGTH_IN_LEVEL = new AbstractC20847("indicatorLevel") { // from class: com.google.android.material.progressindicator.DeterminateDrawable.1
        @Override // l.AbstractC20847
        public float getValue(DeterminateDrawable determinateDrawable) {
            return determinateDrawable.getIndicatorFraction() * 10000.0f;
        }

        @Override // l.AbstractC20847
        public void setValue(DeterminateDrawable determinateDrawable, float f) {
            determinateDrawable.setIndicatorFraction(f / 10000.0f);
        }
    };
    public static final int MAX_DRAWABLE_LEVEL = 10000;
    public static final float SPRING_FORCE_STIFFNESS = 50.0f;
    public final DrawingDelegate.ActiveIndicator activeIndicator;
    public DrawingDelegate drawingDelegate;
    public boolean skipAnimationOnLevelChange;
    public final C15909 springAnimation;
    public final C20142 springForce;

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ void registerAnimationCallback(AbstractC2220 abstractC2220) {
        super.registerAnimationCallback(abstractC2220);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(AbstractC2220 abstractC2220) {
        return super.unregisterAnimationCallback(abstractC2220);
    }

    public DeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, DrawingDelegate drawingDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.skipAnimationOnLevelChange = false;
        setDrawingDelegate(drawingDelegate);
        this.activeIndicator = new DrawingDelegate.ActiveIndicator();
        C20142 c20142 = new C20142();
        this.springForce = c20142;
        c20142.m45501(1.0f);
        c20142.m45503(50.0f);
        C15909 c15909 = new C15909(this, INDICATOR_LENGTH_IN_LEVEL);
        this.springAnimation = c15909;
        c15909.m37818(c20142);
        setGrowFraction(1.0f);
    }

    public static DeterminateDrawable createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return createLinearDrawable(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec));
    }

    public static DeterminateDrawable createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec, LinearDrawingDelegate linearDrawingDelegate) {
        return new DeterminateDrawable(context, linearProgressIndicatorSpec, linearDrawingDelegate);
    }

    public static DeterminateDrawable createCircularDrawable(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return createCircularDrawable(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec));
    }

    public static DeterminateDrawable createCircularDrawable(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec, CircularDrawingDelegate circularDrawingDelegate) {
        return new DeterminateDrawable(context, circularProgressIndicatorSpec, circularDrawingDelegate);
    }

    public void addSpringAnimationEndListener(InterfaceC8147 interfaceC8147) {
        this.springAnimation.m26050(interfaceC8147);
    }

    public void removeSpringAnimationEndListener(InterfaceC8147 interfaceC8147) {
        this.springAnimation.m26053(interfaceC8147);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        float systemAnimatorDurationScale = this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver());
        if (systemAnimatorDurationScale == 0.0f) {
            this.skipAnimationOnLevelChange = true;
            return visibleInternal;
        }
        this.skipAnimationOnLevelChange = false;
        this.springForce.m45503(50.0f / systemAnimatorDurationScale);
        return visibleInternal;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.springAnimation.m37820();
        setIndicatorFraction(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        if (this.skipAnimationOnLevelChange) {
            this.springAnimation.m37820();
            setIndicatorFraction(i / 10000.0f);
            return true;
        }
        this.springAnimation.m26052(getIndicatorFraction() * 10000.0f);
        this.springAnimation.m37819(i);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    public void setLevelByFraction(float f) {
        setLevel((int) (f * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getBounds(), getGrowFraction(), isShowing(), isHiding());
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setAntiAlias(true);
            DrawingDelegate.ActiveIndicator activeIndicator = this.activeIndicator;
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
            activeIndicator.color = baseProgressIndicatorSpec.indicatorColors[0];
            int iM12401 = baseProgressIndicatorSpec.indicatorTrackGapSize;
            if (iM12401 > 0) {
                if (!(this.drawingDelegate instanceof LinearDrawingDelegate)) {
                    iM12401 = (int) ((C4449.m12401(getIndicatorFraction(), 0.0f, 0.01f) * iM12401) / 0.01f);
                }
                this.drawingDelegate.fillTrack(canvas, this.paint, getIndicatorFraction(), 1.0f, this.baseSpec.trackColor, getAlpha(), iM12401);
            } else {
                this.drawingDelegate.fillTrack(canvas, this.paint, 0.0f, 1.0f, baseProgressIndicatorSpec.trackColor, getAlpha(), 0);
            }
            this.drawingDelegate.fillIndicator(canvas, this.paint, this.activeIndicator, getAlpha());
            this.drawingDelegate.drawStopIndicator(canvas, this.paint, this.baseSpec.indicatorColors[0], getAlpha());
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getIndicatorFraction() {
        return this.activeIndicator.endFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndicatorFraction(float f) {
        this.activeIndicator.endFraction = f;
        invalidateSelf();
    }

    public DrawingDelegate getDrawingDelegate() {
        return this.drawingDelegate;
    }

    public void setDrawingDelegate(DrawingDelegate drawingDelegate) {
        this.drawingDelegate = drawingDelegate;
    }
}
