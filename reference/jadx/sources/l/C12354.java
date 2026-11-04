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

/* JADX INFO: renamed from: l.ۨ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: I9N6 */
/* JADX INFO: loaded from: classes3.dex */
public class C12354 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39671 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f39673;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Rect f39674;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f39675;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Drawable f39676;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Drawable f39677;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f39678;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f39679;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3405 f39681;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC20559 f39682;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Runnable f39683;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f39680 = 255;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f39672 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20559 mo30823() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f39676;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f39677;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f39682.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectM47131 = this.f39682.m47131();
        if (rectM47131 != null) {
            rect.set(rectM47131);
            padding = (rectM47131.right | ((rectM47131.left | rectM47131.top) | rectM47131.bottom)) != 0;
        } else {
            Drawable drawable = this.f39676;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (this.f39682.f65807 && C0597.m2701(this) == 1) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f39676;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f39678 && this.f39680 == i) {
            return;
        }
        this.f39678 = true;
        this.f39680 = i;
        Drawable drawable = this.f39676;
        if (drawable != null) {
            if (this.f39679 == 0) {
                drawable.setAlpha(i);
            } else {
                m30826(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f39680;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        AbstractC20559 abstractC20559 = this.f39682;
        if (abstractC20559.f65817 != z) {
            abstractC20559.f65817 = z;
            Drawable drawable = this.f39676;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC20559 abstractC20559 = this.f39682;
        abstractC20559.f65828 = true;
        if (abstractC20559.f65816 != colorFilter) {
            abstractC20559.f65816 = colorFilter;
            Drawable drawable = this.f39676;
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
        AbstractC20559 abstractC20559 = this.f39682;
        abstractC20559.f65824 = true;
        if (abstractC20559.f65804 != colorStateList) {
            abstractC20559.f65804 = colorStateList;
            C0597.m2690(this.f39676, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        AbstractC20559 abstractC20559 = this.f39682;
        abstractC20559.f65801 = true;
        if (abstractC20559.f65812 != mode) {
            abstractC20559.f65812 = mode;
            C0597.m2693(this.f39676, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f39677;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f39676;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        AbstractC20559 abstractC20559 = this.f39682;
        if (abstractC20559.f65807 != z) {
            abstractC20559.f65807 = z;
            Drawable drawable = this.f39676;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f39682.f65807;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f39677;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f39677 = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f39676;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f39678) {
                this.f39676.setAlpha(this.f39680);
            }
        }
        if (this.f39673 != 0) {
            this.f39673 = 0L;
            z = true;
        }
        if (this.f39679 != 0) {
            this.f39679 = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f39676;
        if (drawable != null) {
            C0597.m2688(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f39674;
        if (rect == null) {
            this.f39674 = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f39676;
        if (drawable != null) {
            C0597.m2689(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f39674;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f39677;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f39676;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        AbstractC20559 abstractC20559 = this.f39682;
        int i2 = this.f39672;
        int i3 = abstractC20559.f65825;
        Drawable[] drawableArr = abstractC20559.f65832;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean zM2695 = Build.VERSION.SDK_INT >= 23 ? C0597.m2695(drawable, i) : false;
                if (i4 == i2) {
                    z = zM2695;
                }
            }
        }
        abstractC20559.f65811 = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        AbstractC20559 abstractC20559 = this.f39682;
        if (!abstractC20559.f65831) {
            Drawable drawable = this.f39676;
            if (drawable != null) {
                return drawable.getIntrinsicWidth();
            }
            return -1;
        }
        if (!abstractC20559.f65830) {
            abstractC20559.m47132();
        }
        return abstractC20559.f65805;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        AbstractC20559 abstractC20559 = this.f39682;
        if (!abstractC20559.f65831) {
            Drawable drawable = this.f39676;
            if (drawable != null) {
                return drawable.getIntrinsicHeight();
            }
            return -1;
        }
        if (!abstractC20559.f65830) {
            abstractC20559.m47132();
        }
        return abstractC20559.f65833;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        AbstractC20559 abstractC20559 = this.f39682;
        if (!abstractC20559.f65831) {
            Drawable drawable = this.f39676;
            if (drawable != null) {
                return drawable.getMinimumWidth();
            }
            return 0;
        }
        if (!abstractC20559.f65830) {
            abstractC20559.m47132();
        }
        return abstractC20559.f65823;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        AbstractC20559 abstractC20559 = this.f39682;
        if (!abstractC20559.f65831) {
            Drawable drawable = this.f39676;
            if (drawable != null) {
                return drawable.getMinimumHeight();
            }
            return 0;
        }
        if (!abstractC20559.f65830) {
            abstractC20559.m47132();
        }
        return abstractC20559.f65822;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        AbstractC20559 abstractC20559 = this.f39682;
        if (abstractC20559 != null) {
            abstractC20559.f65820 = false;
            abstractC20559.f65808 = false;
        }
        if (drawable != this.f39676 || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f39676 || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f39676 || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f39677;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f39676;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f39676;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f39682.m47133();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m30828() {
        return this.f39672;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30827(int i) {
        if (i == this.f39672) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f39682.f65819 > 0) {
            Drawable drawable = this.f39677;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f39676;
            if (drawable2 != null) {
                this.f39677 = drawable2;
                this.f39673 = ((long) this.f39682.f65819) + jUptimeMillis;
            } else {
                this.f39677 = null;
                this.f39673 = 0L;
            }
        } else {
            Drawable drawable3 = this.f39676;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            AbstractC20559 abstractC20559 = this.f39682;
            if (i < abstractC20559.f65825) {
                Drawable drawableM47128 = abstractC20559.m47128(i);
                this.f39676 = drawableM47128;
                this.f39672 = i;
                if (drawableM47128 != null) {
                    int i2 = this.f39682.f65806;
                    if (i2 > 0) {
                        this.f39679 = jUptimeMillis + ((long) i2);
                    }
                    m30822(drawableM47128);
                }
            } else {
                this.f39676 = null;
                this.f39672 = -1;
            }
        } else {
            this.f39676 = null;
            this.f39672 = -1;
        }
        if (this.f39679 != 0 || this.f39673 != 0) {
            Runnable runnable = this.f39683;
            if (runnable == null) {
                this.f39683 = new RunnableC23543((C14591) this);
            } else {
                unscheduleSelf(runnable);
            }
            m30826(true);
        }
        invalidateSelf();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30822(Drawable drawable) {
        if (this.f39681 == null) {
            this.f39681 = new C3405();
        }
        C3405 c3405 = this.f39681;
        c3405.m11143(drawable.getCallback());
        drawable.setCallback(c3405);
        try {
            if (this.f39682.f65806 <= 0 && this.f39678) {
                drawable.setAlpha(this.f39680);
            }
            AbstractC20559 abstractC20559 = this.f39682;
            if (abstractC20559.f65828) {
                drawable.setColorFilter(abstractC20559.f65816);
            } else {
                if (abstractC20559.f65824) {
                    C0597.m2690(drawable, abstractC20559.f65804);
                }
                AbstractC20559 abstractC205510 = this.f39682;
                if (abstractC205510.f65801) {
                    C0597.m2693(drawable, abstractC205510.f65812);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f39682.f65817);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C0597.m2695(drawable, C0597.m2701(this));
            }
            drawable.setAutoMirrored(this.f39682.f65807);
            Rect rect = this.f39674;
            if (rect != null) {
                C0597.m2689(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f39681.m11142());
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
    public final void m30826(boolean z) {
        boolean z2;
        Drawable drawable;
        long j;
        boolean z3 = true;
        this.f39678 = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f39676;
        if (drawable2 != null) {
            long j2 = this.f39679;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f39680);
                    this.f39679 = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.f39682.f65806)) * this.f39680) / 255);
                    z2 = true;
                }
            }
            drawable = this.f39677;
            if (drawable != null) {
                j = this.f39673;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f39677 = null;
                        this.f39673 = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f39682.f65819) * this.f39680) / 255);
                    }
                }
                if (z || !z3) {
                }
                scheduleSelf(this.f39683, jUptimeMillis + 16);
                return;
            }
            this.f39673 = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.f39679 = 0L;
        z2 = false;
        drawable = this.f39677;
        if (drawable != null) {
            j = this.f39673;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f39677 = null;
                    this.f39673 = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f39682.f65819) * this.f39680) / 255);
                }
            }
            if (z) {
            }
        }
        this.f39673 = 0L;
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f39676;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30824(Resources resources) {
        AbstractC20559 abstractC20559 = this.f39682;
        if (resources == null) {
            abstractC20559.getClass();
            return;
        }
        abstractC20559.f65813 = resources;
        int i = resources.getDisplayMetrics().densityDpi;
        if (i == 0) {
            i = DHParameters.DEFAULT_MINIMUM_LENGTH;
        }
        int i2 = abstractC20559.f65827;
        abstractC20559.f65827 = i;
        if (i2 != i) {
            abstractC20559.f65830 = false;
            abstractC20559.f65818 = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f39682.m47129(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f39682.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f39682.m47130()) {
            return null;
        }
        this.f39682.f65815 = getChangingConfigurations();
        return this.f39682;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f39675 && super.mutate() == this) {
            AbstractC20559 abstractC20559Mo30823 = mo30823();
            abstractC20559Mo30823.mo6582();
            mo30825(abstractC20559Mo30823);
            this.f39675 = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo30825(AbstractC20559 abstractC20559) {
        this.f39682 = abstractC20559;
        int i = this.f39672;
        if (i >= 0) {
            Drawable drawableM47128 = abstractC20559.m47128(i);
            this.f39676 = drawableM47128;
            if (drawableM47128 != null) {
                m30822(drawableM47128);
            }
        }
        this.f39677 = null;
    }
}
