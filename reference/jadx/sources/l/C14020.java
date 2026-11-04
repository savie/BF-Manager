package l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4XY */
/* JADX INFO: loaded from: classes4.dex */
public class C14020 extends Drawable implements Drawable.Callback, InterfaceC7309, InterfaceC8800 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f44412 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Drawable f44413;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f44414;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f44415;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f44416;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C21963 f44417 = m34142();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f44418;

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo14829() {
        throw null;
    }

    public C14020(Drawable drawable) {
        mo20016(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f44413.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f44413.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f44413;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.f44413.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C21963 c21963 = this.f44417;
        return changingConfigurations | (c21963 != null ? c21963.getChangingConfigurations() : 0) | this.f44413.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f44413.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f44413.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f44413.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f44413.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C21963 c21963;
        ColorStateList colorStateList = (!mo14829() || (c21963 = this.f44417) == null) ? null : c21963.f70891;
        return (colorStateList != null && colorStateList.isStateful()) || this.f44413.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m34141(iArr) || this.f44413.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f44413.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f44413.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f44413.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f44413.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f44413.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f44413.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f44413.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f44413.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f44413.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f44413.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.f44413.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f44413.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return C0597.m2695(this.f44413, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return C0597.m2701(this.f44413);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C21963 c21963 = this.f44417;
        if (c21963 == null || c21963.f70892 == null) {
            return null;
        }
        c21963.f70890 = getChangingConfigurations();
        return this.f44417;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f44414 && super.mutate() == this) {
            this.f44417 = m34142();
            Drawable drawable = this.f44413;
            if (drawable != null) {
                drawable.mutate();
            }
            C21963 c21963 = this.f44417;
            if (c21963 != null) {
                Drawable drawable2 = this.f44413;
                c21963.f70892 = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f44414 = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C21963 m34142() {
        C21963 c21963 = this.f44417;
        C21963 c21964 = new C21963();
        c21964.f70891 = null;
        c21964.f70893 = f44412;
        if (c21963 != null) {
            c21964.f70890 = c21963.f70890;
            c21964.f70892 = c21963.f70892;
            c21964.f70891 = c21963.f70891;
            c21964.f70893 = c21963.f70893;
        }
        return c21964;
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
        return this.f44413.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f44417.f70891 = colorStateList;
        m34141(this.f44413.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f44417.f70893 = mode;
        m34141(this.f44413.getState());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m34141(int[] iArr) {
        if (mo14829()) {
            C21963 c21963 = this.f44417;
            ColorStateList colorStateList = c21963.f70891;
            PorterDuff.Mode mode = c21963.f70893;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f44415 || colorForState != this.f44418 || mode != this.f44416) {
                    setColorFilter(colorForState, mode);
                    this.f44418 = colorForState;
                    this.f44416 = mode;
                    this.f44415 = true;
                    return true;
                }
            } else {
                this.f44415 = false;
                clearColorFilter();
                return false;
            }
        }
        return false;
    }

    @Override // l.InterfaceC7309
    /* JADX INFO: renamed from: ۙ */
    public final Drawable mo20015() {
        return this.f44413;
    }

    @Override // l.InterfaceC7309
    /* JADX INFO: renamed from: ۙ */
    public final void mo20016(Drawable drawable) {
        Drawable drawable2 = this.f44413;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f44413 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C21963 c21963 = this.f44417;
            if (c21963 != null) {
                c21963.f70892 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
