package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۡۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S952 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8641 extends Drawable {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f29803;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f29804;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f29806;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f29807;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f29813;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f29814;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f29815;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f29816;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Paint f29802 = new Paint(1);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Path f29805 = new Path();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f29811 = 0.5f;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f29812 = 48;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final RectF f29808 = new RectF();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final RectF f29809 = new RectF();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final RectF f29801 = new RectF();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RectF f29810 = new RectF();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        float f;
        float f2;
        float f3;
        C13465.m32966(rect, "padding");
        float f4 = this.f29804;
        float f5 = this.f29815;
        float f6 = f4 + f5;
        float f7 = f5 + this.f29807;
        int i = this.f29812;
        if (i == 3) {
            f = f6;
            f6 = this.f29813 + f6;
        } else {
            if (i != 5) {
                if (i == 48) {
                    f3 = f7;
                    f7 = this.f29814 + f7;
                } else {
                    if (i != 80) {
                        return false;
                    }
                    f3 = this.f29814 + f7;
                }
                f2 = f3;
                f = f6;
            } else {
                f = this.f29813 + f6;
            }
            rect.set((int) f6, (int) f7, (int) f, (int) f2);
            return true;
        }
        f2 = f7;
        rect.set((int) f6, (int) f7, (int) f, (int) f2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C13465.m32966(canvas, "canvas");
        Rect bounds = getBounds();
        int i = this.f29812;
        float f = bounds.left;
        if (i == 3) {
            f += this.f29813;
        }
        RectF rectF = this.f29808;
        rectF.left = f;
        float f2 = bounds.top + (i == 48 ? this.f29814 : this.f29816);
        rectF.top = f2;
        float f3 = 2;
        float f4 = this.f29815 * f3;
        rectF.bottom = f4 + f2;
        float f5 = this.f29816;
        rectF.left = f + f5;
        rectF.right = f4 + f + f5;
        Rect bounds2 = getBounds();
        float f6 = bounds2.right;
        if (i == 5) {
            f6 -= this.f29813;
        }
        RectF rectF2 = this.f29809;
        rectF2.right = f6;
        float f7 = bounds2.top + (i == 48 ? this.f29814 : this.f29816);
        rectF2.top = f7;
        float f8 = this.f29815 * f3;
        rectF2.bottom = f8 + f7;
        float f9 = this.f29816;
        rectF2.left = (f6 - f8) - f9;
        rectF2.right = f6 - f9;
        Rect bounds3 = getBounds();
        float f10 = bounds3.right;
        if (i == 5) {
            f10 -= this.f29813;
        }
        RectF rectF3 = this.f29801;
        rectF3.right = f10;
        float f11 = bounds3.bottom;
        if (i == 80) {
            f11 -= this.f29814;
        }
        float f12 = this.f29815 * f3;
        float f13 = this.f29816;
        rectF3.left = (f10 - f12) - f13;
        rectF3.right = f10 - f13;
        rectF3.top = (f11 - f12) - f13;
        rectF3.bottom = f11 - f13;
        Rect bounds4 = getBounds();
        float f14 = bounds4.left;
        if (i == 3) {
            f14 += this.f29813;
        }
        RectF rectF4 = this.f29810;
        rectF4.left = f14;
        float f15 = bounds4.bottom;
        if (i == 80) {
            f15 -= this.f29814;
        }
        float f16 = this.f29815 * f3;
        float f17 = this.f29816;
        rectF4.left = f14 + f17;
        rectF4.right = f16 + f14 + f17;
        rectF4.top = (f15 - f16) - f17;
        rectF4.bottom = f15 - f17;
        Path path = this.f29805;
        path.reset();
        path.moveTo(rectF.left, rectF.bottom - this.f29815);
        path.arcTo(rectF, 180.0f, 90.0f);
        if (i == 48) {
            path.lineTo(((getBounds().width() * this.f29811) + getBounds().left) - (this.f29813 / f3), getBounds().top + this.f29814);
            path.lineTo((getBounds().width() * this.f29811) + getBounds().left, getBounds().top);
            path.lineTo((this.f29813 / f3) + (getBounds().width() * this.f29811) + getBounds().left, getBounds().top + this.f29814);
        }
        path.lineTo(rectF2.left + this.f29815, rectF2.top);
        path.arcTo(rectF2, 270.0f, 90.0f);
        if (i == 5) {
            path.lineTo(rectF2.right, ((getBounds().height() * this.f29811) + getBounds().top) - (this.f29814 / f3));
            path.lineTo(getBounds().right - this.f29816, (getBounds().height() * this.f29811) + getBounds().top);
            path.lineTo(rectF3.right, (this.f29814 / f3) + (getBounds().height() * this.f29811) + getBounds().top);
        }
        path.lineTo(rectF3.right, rectF3.top + this.f29815);
        path.arcTo(rectF3, 0.0f, 90.0f);
        if (i == 80) {
            path.lineTo((this.f29813 / f3) + (getBounds().right - (getBounds().width() * this.f29811)), rectF3.bottom);
            path.lineTo(getBounds().right - (getBounds().width() * this.f29811), getBounds().bottom - this.f29816);
            path.lineTo((getBounds().right - (getBounds().width() * this.f29811)) - (this.f29813 / f3), rectF3.bottom);
        }
        path.lineTo(rectF4.right - this.f29815, rectF4.bottom);
        path.arcTo(rectF4, 90.0f, 90.0f);
        if (i == 3) {
            path.lineTo(rectF4.left, (this.f29814 / f3) + (rectF4.bottom - (getBounds().height() * this.f29811)));
            path.lineTo(getBounds().left, rectF4.bottom - (getBounds().height() * this.f29811));
            path.lineTo(rectF.left, (rectF4.bottom - (getBounds().height() * this.f29811)) - (this.f29814 / f3));
        }
        path.close();
        int i2 = this.f29803;
        Paint paint = this.f29802;
        paint.setColor(i2);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);
        paint.setColor(this.f29806);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f29816 / 2.0f);
        canvas.drawPath(path, paint);
    }

    public C8641() {
        float fM33769 = C13932.m33769(6.0f);
        this.f29813 = fM33769;
        this.f29814 = fM33769;
        this.f29815 = C13932.m33769(4.0f);
        this.f29816 = C13932.m33769(1.0f);
        float fM337610 = C13932.m33769(4.0f);
        float fM337611 = C13932.m33769(2.0f);
        this.f29804 = fM337610;
        this.f29807 = fM337611;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f29802.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29802.setColorFilter(colorFilter);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22444(float f) {
        this.f29811 = f;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22445() {
        this.f29806 = -986896;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22443() {
        this.f29803 = -12566464;
    }
}
