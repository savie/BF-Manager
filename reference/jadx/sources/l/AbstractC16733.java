package l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܽܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 96B4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16733 extends Drawable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ColorStateList f53590;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f53592;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ColorFilter f53594;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f53591 = 255;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f53593 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C0504 f53589 = new C0504(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo39248(Canvas canvas, int i, int i2);

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f53591 != i) {
            this.f53591 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f53594 = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f53590 = colorStateList;
        if (m39247()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f53593 = mode;
        if (m39247()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f53590;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return m39247();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m39247() {
        ColorStateList colorStateList = this.f53590;
        if (colorStateList == null || this.f53593 == null) {
            boolean z = this.f53592 != null;
            this.f53592 = null;
            return z;
        }
        this.f53592 = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.f53593);
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
        mo39248(canvas, bounds.width(), bounds.height());
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f53589;
    }
}
