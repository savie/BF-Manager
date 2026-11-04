package l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: X3ZE */
/* JADX INFO: loaded from: classes4.dex */
public final class C15799 extends Drawable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ColorStateList f51401;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ColorStateList f51402;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f51403;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Rect f51404;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f51405;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Paint f51406;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f51407;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final RectF f51409;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f51410 = false;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f51408 = true;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f51411 = PorterDuff.Mode.SRC_IN;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C15799(float f, ColorStateList colorStateList) {
        this.f51403 = f;
        Paint paint = new Paint(5);
        this.f51406 = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f51402 = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f51402.getDefaultColor()));
        this.f51409 = new RectF();
        this.f51404 = new Rect();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37729(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f51402 = colorStateList;
        this.f51406.setColor(colorStateList.getColorForState(getState(), this.f51402.getDefaultColor()));
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37728(float f, boolean z, boolean z2) {
        if (f == this.f51407 && this.f51410 == z && this.f51408 == z2) {
            return;
        }
        this.f51407 = f;
        this.f51410 = z;
        this.f51408 = z2;
        m37725((Rect) null);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m37731() {
        return this.f51407;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f51405;
        Paint paint = this.f51406;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f51405);
            z = true;
        }
        RectF rectF = this.f51409;
        float f = this.f51403;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37725(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        RectF rectF = this.f51409;
        rectF.set(f, f2, f3, f4);
        Rect rect2 = this.f51404;
        rect2.set(rect);
        if (this.f51410) {
            rect2.inset((int) Math.ceil(C23259.m52344(this.f51407, this.f51403, this.f51408)), (int) Math.ceil(C23259.m52345(this.f51407, this.f51403, this.f51408)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m37725(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f51404, this.f51403);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37727(float f) {
        if (f == this.f51403) {
            return;
        }
        this.f51403 = f;
        m37725((Rect) null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f51406.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f51406.setColorFilter(colorFilter);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float m37730() {
        return this.f51403;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m37726() {
        return this.f51402;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f51401 = colorStateList;
        this.f51405 = m37724(colorStateList, this.f51411);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f51411 = mode;
        this.f51405 = m37724(this.f51401, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f51402;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f51406;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f51401;
        if (colorStateList2 == null || (mode = this.f51411) == null) {
            return z;
        }
        this.f51405 = m37724(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f51401;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f51402;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private PorterDuffColorFilter m37724(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
