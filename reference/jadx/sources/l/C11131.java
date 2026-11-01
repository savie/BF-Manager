package l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4XY */
/* JADX INFO: loaded from: classes4.dex */
public class C11131 extends Drawable implements Drawable.Callback, InterfaceC6191, InterfaceC17480 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f37773 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f37774;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f37775;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f37776;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Drawable f37777;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14659 f37778 = m28063();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f37779;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean mo28064() {
        throw null;
    }

    public C11131(Drawable drawable) {
        mo17200(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f37777.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f37777.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f37777;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.f37777.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C14659 c14659 = this.f37778;
        return changingConfigurations | (c14659 != null ? c14659.getChangingConfigurations() : 0) | this.f37777.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f37777.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f37777.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f37777.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37777.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C14659 c14659;
        ColorStateList colorStateList = (!mo28064() || (c14659 = this.f37778) == null) ? null : c14659.f47922;
        return (colorStateList != null && colorStateList.isStateful()) || this.f37777.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m28062(iArr) || this.f37777.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f37777.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f37777.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f37777.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f37777.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f37777.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f37777.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f37777.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f37777.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f37777.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f37777.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.f37777.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f37777.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return C7603.m20134(this.f37777, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return C7603.m20126(this.f37777);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C14659 c14659 = this.f37778;
        if (c14659 == null || c14659.f47923 == null) {
            return null;
        }
        c14659.f47921 = getChangingConfigurations();
        return this.f37778;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f37775 && super.mutate() == this) {
            this.f37778 = m28063();
            Drawable drawable = this.f37777;
            if (drawable != null) {
                drawable.mutate();
            }
            C14659 c14659 = this.f37778;
            if (c14659 != null) {
                Drawable drawable2 = this.f37777;
                c14659.f47923 = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f37775 = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C14659 m28063() {
        C14659 c14659 = this.f37778;
        C14659 c146510 = new C14659();
        c146510.f47922 = null;
        c146510.f47920 = f37773;
        if (c14659 != null) {
            c146510.f47921 = c14659.f47921;
            c146510.f47923 = c14659.f47923;
            c146510.f47922 = c14659.f47922;
            c146510.f47920 = c14659.f47920;
        }
        return c146510;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f37777.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f37778.f47922 = colorStateList;
        m28062(this.f37777.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f37778.f47920 = mode;
        m28062(this.f37777.getState());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m28062(int[] iArr) {
        if (mo28064()) {
            C14659 c14659 = this.f37778;
            ColorStateList colorStateList = c14659.f47922;
            PorterDuff.Mode mode = c14659.f47920;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f37776 || colorForState != this.f37779 || mode != this.f37774) {
                    setColorFilter(colorForState, mode);
                    this.f37779 = colorForState;
                    this.f37774 = mode;
                    this.f37776 = true;
                    return true;
                }
            } else {
                this.f37776 = false;
                clearColorFilter();
                return false;
            }
        }
        return false;
    }

    @Override // l.InterfaceC6191
    /* JADX INFO: renamed from: ۙ */
    public final Drawable mo17199() {
        return this.f37777;
    }

    @Override // l.InterfaceC6191
    /* JADX INFO: renamed from: ۙ */
    public final void mo17200(Drawable drawable) {
        Drawable drawable2 = this.f37777;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f37777 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C14659 c14659 = this.f37778;
            if (c14659 != null) {
                c14659.f47923 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
