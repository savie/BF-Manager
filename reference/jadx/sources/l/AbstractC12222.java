package l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۨ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 96B4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12222 extends Drawable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f39269;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ColorStateList f39270;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ColorFilter f39274;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f39271 = 255;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f39273 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20427 f39272 = new C20427(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo30500(Canvas canvas, int i, int i2);

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f39271 != i) {
            this.f39271 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f39274 = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f39270 = colorStateList;
        if (m30499()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f39273 = mode;
        if (m30499()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f39270;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return m30499();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m30499() {
        ColorStateList colorStateList = this.f39270;
        if (colorStateList == null || this.f39273 == null) {
            boolean z = this.f39269 != null;
            this.f39269 = null;
            return z;
        }
        this.f39269 = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.f39273);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        mo30500(canvas, bounds.width(), bounds.height());
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f39272;
    }
}
