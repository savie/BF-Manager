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

/* JADX INFO: renamed from: l.ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X3ZE */
/* JADX INFO: loaded from: classes2.dex */
public final class C6628 extends Drawable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Paint f22395;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ColorStateList f22397;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ColorStateList f22398;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f22400;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Rect f22401;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f22402;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RectF f22403;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f22404;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f22396 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f22399 = true;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f22405 = PorterDuff.Mode.SRC_IN;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C6628(float f, ColorStateList colorStateList) {
        this.f22402 = f;
        Paint paint = new Paint(5);
        this.f22395 = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f22398 = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f22398.getDefaultColor()));
        this.f22403 = new RectF();
        this.f22401 = new Rect();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17971(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f22398 = colorStateList;
        this.f22395.setColor(colorStateList.getColorForState(getState(), this.f22398.getDefaultColor()));
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17970(float f, boolean z, boolean z2) {
        if (f == this.f22404 && this.f22396 == z && this.f22399 == z2) {
            return;
        }
        this.f22404 = f;
        this.f22396 = z;
        this.f22399 = z2;
        m17967((Rect) null);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m17973() {
        return this.f22404;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f22400;
        Paint paint = this.f22395;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f22400);
            z = true;
        }
        RectF rectF = this.f22403;
        float f = this.f22402;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17967(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        RectF rectF = this.f22403;
        rectF.set(f, f2, f3, f4);
        Rect rect2 = this.f22401;
        rect2.set(rect);
        if (this.f22396) {
            rect2.inset((int) Math.ceil(C22857.m50606(this.f22404, this.f22402, this.f22399)), (int) Math.ceil(C22857.m50607(this.f22404, this.f22402, this.f22399)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m17967(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f22401, this.f22402);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17969(float f) {
        if (f == this.f22402) {
            return;
        }
        this.f22402 = f;
        m17967((Rect) null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f22395.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22395.setColorFilter(colorFilter);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m17972() {
        return this.f22402;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m17968() {
        return this.f22398;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f22397 = colorStateList;
        this.f22400 = m17966(colorStateList, this.f22405);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f22405 = mode;
        this.f22400 = m17966(this.f22397, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f22398;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f22395;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f22397;
        if (colorStateList2 == null || (mode = this.f22405) == null) {
            return z;
        }
        this.f22400 = m17966(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f22397;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f22398;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private PorterDuffColorFilter m17966(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
