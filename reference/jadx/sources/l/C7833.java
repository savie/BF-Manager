package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I9N6 */
/* JADX INFO: loaded from: classes3.dex */
public class C7833 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25766 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C17710 f25767;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Drawable f25768;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f25769;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f25770;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f25771;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Drawable f25772;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Rect f25773;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f25774 = 255;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f25775 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC18416 f25776;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Runnable f25777;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f25778;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC18416 mo20661() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f25772;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f25768;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f25776.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectM42706 = this.f25776.m42706();
        if (rectM42706 != null) {
            rect.set(rectM42706);
            padding = (rectM42706.right | ((rectM42706.left | rectM42706.top) | rectM42706.bottom)) != 0;
        } else {
            Drawable drawable = this.f25772;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (this.f25776.f58688 && C7603.m20126(this) == 1) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f25772;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f25778 && this.f25774 == i) {
            return;
        }
        this.f25778 = true;
        this.f25774 = i;
        Drawable drawable = this.f25772;
        if (drawable != null) {
            if (this.f25769 == 0) {
                drawable.setAlpha(i);
            } else {
                m20663(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f25774;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        AbstractC18416 abstractC18416 = this.f25776;
        if (abstractC18416.f58694 != z) {
            abstractC18416.f58694 = z;
            Drawable drawable = this.f25772;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC18416 abstractC18416 = this.f25776;
        abstractC18416.f58710 = true;
        if (abstractC18416.f58691 != colorFilter) {
            abstractC18416.f58691 = colorFilter;
            Drawable drawable = this.f25772;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        AbstractC18416 abstractC18416 = this.f25776;
        abstractC18416.f58683 = true;
        if (abstractC18416.f58702 != colorStateList) {
            abstractC18416.f58702 = colorStateList;
            C7603.m20129(this.f25772, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        AbstractC18416 abstractC18416 = this.f25776;
        abstractC18416.f58705 = true;
        if (abstractC18416.f58685 != mode) {
            abstractC18416.f58685 = mode;
            C7603.m20132(this.f25772, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f25768;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f25772;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        AbstractC18416 abstractC18416 = this.f25776;
        if (abstractC18416.f58688 != z) {
            abstractC18416.f58688 = z;
            Drawable drawable = this.f25772;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f25776.f58688;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f25768;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f25768 = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f25772;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f25778) {
                this.f25772.setAlpha(this.f25774);
            }
        }
        if (this.f25771 != 0) {
            this.f25771 = 0L;
            z = true;
        }
        if (this.f25769 != 0) {
            this.f25769 = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f25772;
        if (drawable != null) {
            C7603.m20127(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f25773;
        if (rect == null) {
            this.f25773 = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f25772;
        if (drawable != null) {
            C7603.m20128(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f25773;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f25768;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f25772;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        AbstractC18416 abstractC18416 = this.f25776;
        int i2 = this.f25775;
        int i3 = abstractC18416.f58706;
        Drawable[] drawableArr = abstractC18416.f58692;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean zM20134 = Build.VERSION.SDK_INT >= 23 ? C7603.m20134(drawable, i) : false;
                if (i4 == i2) {
                    z = zM20134;
                }
            }
        }
        abstractC18416.f58699 = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        AbstractC18416 abstractC18416 = this.f25776;
        if (!abstractC18416.f58708) {
            Drawable drawable = this.f25772;
            if (drawable != null) {
                return drawable.getIntrinsicWidth();
            }
            return -1;
        }
        if (!abstractC18416.f58686) {
            abstractC18416.m42707();
        }
        return abstractC18416.f58693;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        AbstractC18416 abstractC18416 = this.f25776;
        if (!abstractC18416.f58708) {
            Drawable drawable = this.f25772;
            if (drawable != null) {
                return drawable.getIntrinsicHeight();
            }
            return -1;
        }
        if (!abstractC18416.f58686) {
            abstractC18416.m42707();
        }
        return abstractC18416.f58714;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        AbstractC18416 abstractC18416 = this.f25776;
        if (!abstractC18416.f58708) {
            Drawable drawable = this.f25772;
            if (drawable != null) {
                return drawable.getMinimumWidth();
            }
            return 0;
        }
        if (!abstractC18416.f58686) {
            abstractC18416.m42707();
        }
        return abstractC18416.f58712;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        AbstractC18416 abstractC18416 = this.f25776;
        if (!abstractC18416.f58708) {
            Drawable drawable = this.f25772;
            if (drawable != null) {
                return drawable.getMinimumHeight();
            }
            return 0;
        }
        if (!abstractC18416.f58686) {
            abstractC18416.m42707();
        }
        return abstractC18416.f58703;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        AbstractC18416 abstractC18416 = this.f25776;
        if (abstractC18416 != null) {
            abstractC18416.f58713 = false;
            abstractC18416.f58700 = false;
        }
        if (drawable != this.f25772 || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f25772 || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f25772 || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f25768;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f25772;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f25772;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f25776.m42701();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m20665() {
        return this.f25775;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20664(int i) {
        if (i == this.f25775) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f25776.f58704 > 0) {
            Drawable drawable = this.f25768;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f25772;
            if (drawable2 != null) {
                this.f25768 = drawable2;
                this.f25771 = ((long) this.f25776.f58704) + jUptimeMillis;
            } else {
                this.f25768 = null;
                this.f25771 = 0L;
            }
        } else {
            Drawable drawable3 = this.f25772;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            AbstractC18416 abstractC18416 = this.f25776;
            if (i < abstractC18416.f58706) {
                Drawable drawableM42703 = abstractC18416.m42703(i);
                this.f25772 = drawableM42703;
                this.f25775 = i;
                if (drawableM42703 != null) {
                    int i2 = this.f25776.f58711;
                    if (i2 > 0) {
                        this.f25769 = jUptimeMillis + ((long) i2);
                    }
                    m20660(drawableM42703);
                }
            } else {
                this.f25772 = null;
                this.f25775 = -1;
            }
        } else {
            this.f25772 = null;
            this.f25775 = -1;
        }
        if (this.f25769 != 0 || this.f25771 != 0) {
            Runnable runnable = this.f25777;
            if (runnable == null) {
                this.f25777 = new RunnableC21238((C7127) this);
            } else {
                unscheduleSelf(runnable);
            }
            m20663(true);
        }
        invalidateSelf();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20660(Drawable drawable) {
        if (this.f25767 == null) {
            this.f25767 = new C17710();
        }
        C17710 c17710 = this.f25767;
        c17710.m41256(drawable.getCallback());
        drawable.setCallback(c17710);
        try {
            if (this.f25776.f58711 <= 0 && this.f25778) {
                drawable.setAlpha(this.f25774);
            }
            AbstractC18416 abstractC18416 = this.f25776;
            if (abstractC18416.f58710) {
                drawable.setColorFilter(abstractC18416.f58691);
            } else {
                if (abstractC18416.f58683) {
                    C7603.m20129(drawable, abstractC18416.f58702);
                }
                AbstractC18416 abstractC18417 = this.f25776;
                if (abstractC18417.f58705) {
                    C7603.m20132(drawable, abstractC18417.f58685);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f25776.f58694);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C7603.m20134(drawable, C7603.m20126(this));
            }
            drawable.setAutoMirrored(this.f25776.f58688);
            Rect rect = this.f25773;
            if (rect != null) {
                C7603.m20128(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f25767.m41255());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20663(boolean z) {
        boolean z2;
        Drawable drawable;
        long j;
        boolean z3 = true;
        this.f25778 = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f25772;
        if (drawable2 != null) {
            long j2 = this.f25769;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f25774);
                    this.f25769 = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.f25776.f58711)) * this.f25774) / 255);
                    z2 = true;
                }
            }
            drawable = this.f25768;
            if (drawable != null) {
                j = this.f25771;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f25768 = null;
                        this.f25771 = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f25776.f58704) * this.f25774) / 255);
                    }
                }
                if (z || !z3) {
                }
                scheduleSelf(this.f25777, jUptimeMillis + 16);
                return;
            }
            this.f25771 = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.f25769 = 0L;
        z2 = false;
        drawable = this.f25768;
        if (drawable != null) {
            j = this.f25771;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f25768 = null;
                    this.f25771 = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f25776.f58704) * this.f25774) / 255);
                }
            }
            if (z) {
            }
        }
        this.f25771 = 0L;
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f25772;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20662(Resources resources) {
        AbstractC18416 abstractC18416 = this.f25776;
        if (resources == null) {
            abstractC18416.getClass();
            return;
        }
        abstractC18416.f58715 = resources;
        int i = resources.getDisplayMetrics().densityDpi;
        if (i == 0) {
            i = DHParameters.DEFAULT_MINIMUM_LENGTH;
        }
        int i2 = abstractC18416.f58709;
        abstractC18416.f58709 = i;
        if (i2 != i) {
            abstractC18416.f58686 = false;
            abstractC18416.f58684 = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f25776.m42704(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f25776.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f25776.m42705()) {
            return null;
        }
        this.f25776.f58698 = getChangingConfigurations();
        return this.f25776;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f25770 && super.mutate() == this) {
            AbstractC18416 abstractC18416Mo20661 = mo20661();
            abstractC18416Mo20661.mo3328();
            mo19029(abstractC18416Mo20661);
            this.f25770 = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo19029(AbstractC18416 abstractC18416) {
        this.f25776 = abstractC18416;
        int i = this.f25775;
        if (i >= 0) {
            Drawable drawableM42703 = abstractC18416.m42703(i);
            this.f25772 = drawableM42703;
            if (drawableM42703 != null) {
                m20660(drawableM42703);
            }
        }
        this.f25768 = null;
    }
}
