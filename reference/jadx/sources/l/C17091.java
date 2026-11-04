package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܺ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S952 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17091 extends Drawable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f55793;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f55794;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f55795;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f55798;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f55800;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f55803;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f55807;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f55808;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Paint f55806 = new Paint(1);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Path f55804 = new Path();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f55802 = 0.5f;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f55801 = 48;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final RectF f55797 = new RectF();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final RectF f55796 = new RectF();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final RectF f55799 = new RectF();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final RectF f55805 = new RectF();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        float f;
        float f2;
        float f3;
        C15243.m36590(rect, "padding");
        float f4 = this.f55795;
        float f5 = this.f55800;
        float f6 = f4 + f5;
        float f7 = f5 + this.f55794;
        int i = this.f55801;
        if (i == 3) {
            f = f6;
            f6 = this.f55807 + f6;
        } else {
            if (i != 5) {
                if (i == 48) {
                    f3 = f7;
                    f7 = this.f55803 + f7;
                } else {
                    if (i != 80) {
                        return false;
                    }
                    f3 = this.f55803 + f7;
                }
                f2 = f3;
                f = f6;
            } else {
                f = this.f55807 + f6;
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
        C15243.m36590(canvas, "canvas");
        Rect bounds = getBounds();
        int i = this.f55801;
        float f = bounds.left;
        if (i == 3) {
            f += this.f55807;
        }
        RectF rectF = this.f55797;
        rectF.left = f;
        float f2 = bounds.top + (i == 48 ? this.f55803 : this.f55808);
        rectF.top = f2;
        float f3 = 2;
        float f4 = this.f55800 * f3;
        rectF.bottom = f4 + f2;
        float f5 = this.f55808;
        rectF.left = f + f5;
        rectF.right = f4 + f + f5;
        Rect bounds2 = getBounds();
        float f6 = bounds2.right;
        if (i == 5) {
            f6 -= this.f55807;
        }
        RectF rectF2 = this.f55796;
        rectF2.right = f6;
        float f7 = bounds2.top + (i == 48 ? this.f55803 : this.f55808);
        rectF2.top = f7;
        float f8 = this.f55800 * f3;
        rectF2.bottom = f8 + f7;
        float f9 = this.f55808;
        rectF2.left = (f6 - f8) - f9;
        rectF2.right = f6 - f9;
        Rect bounds3 = getBounds();
        float f10 = bounds3.right;
        if (i == 5) {
            f10 -= this.f55807;
        }
        RectF rectF3 = this.f55799;
        rectF3.right = f10;
        float f11 = bounds3.bottom;
        if (i == 80) {
            f11 -= this.f55803;
        }
        float f12 = this.f55800 * f3;
        float f13 = this.f55808;
        rectF3.left = (f10 - f12) - f13;
        rectF3.right = f10 - f13;
        rectF3.top = (f11 - f12) - f13;
        rectF3.bottom = f11 - f13;
        Rect bounds4 = getBounds();
        float f14 = bounds4.left;
        if (i == 3) {
            f14 += this.f55807;
        }
        RectF rectF4 = this.f55805;
        rectF4.left = f14;
        float f15 = bounds4.bottom;
        if (i == 80) {
            f15 -= this.f55803;
        }
        float f16 = this.f55800 * f3;
        float f17 = this.f55808;
        rectF4.left = f14 + f17;
        rectF4.right = f16 + f14 + f17;
        rectF4.top = (f15 - f16) - f17;
        rectF4.bottom = f15 - f17;
        Path path = this.f55804;
        path.reset();
        path.moveTo(rectF.left, rectF.bottom - this.f55800);
        path.arcTo(rectF, 180.0f, 90.0f);
        if (i == 48) {
            path.lineTo(((getBounds().width() * this.f55802) + getBounds().left) - (this.f55807 / f3), getBounds().top + this.f55803);
            path.lineTo((getBounds().width() * this.f55802) + getBounds().left, getBounds().top);
            path.lineTo((this.f55807 / f3) + (getBounds().width() * this.f55802) + getBounds().left, getBounds().top + this.f55803);
        }
        path.lineTo(rectF2.left + this.f55800, rectF2.top);
        path.arcTo(rectF2, 270.0f, 90.0f);
        if (i == 5) {
            path.lineTo(rectF2.right, ((getBounds().height() * this.f55802) + getBounds().top) - (this.f55803 / f3));
            path.lineTo(getBounds().right - this.f55808, (getBounds().height() * this.f55802) + getBounds().top);
            path.lineTo(rectF3.right, (this.f55803 / f3) + (getBounds().height() * this.f55802) + getBounds().top);
        }
        path.lineTo(rectF3.right, rectF3.top + this.f55800);
        path.arcTo(rectF3, 0.0f, 90.0f);
        if (i == 80) {
            path.lineTo((this.f55807 / f3) + (getBounds().right - (getBounds().width() * this.f55802)), rectF3.bottom);
            path.lineTo(getBounds().right - (getBounds().width() * this.f55802), getBounds().bottom - this.f55808);
            path.lineTo((getBounds().right - (getBounds().width() * this.f55802)) - (this.f55807 / f3), rectF3.bottom);
        }
        path.lineTo(rectF4.right - this.f55800, rectF4.bottom);
        path.arcTo(rectF4, 90.0f, 90.0f);
        if (i == 3) {
            path.lineTo(rectF4.left, (this.f55803 / f3) + (rectF4.bottom - (getBounds().height() * this.f55802)));
            path.lineTo(getBounds().left, rectF4.bottom - (getBounds().height() * this.f55802));
            path.lineTo(rectF.left, (rectF4.bottom - (getBounds().height() * this.f55802)) - (this.f55803 / f3));
        }
        path.close();
        int i2 = this.f55793;
        Paint paint = this.f55806;
        paint.setColor(i2);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);
        paint.setColor(this.f55798);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f55808 / 2.0f);
        canvas.drawPath(path, paint);
    }

    public C17091() {
        float fM19160 = C6907.m19160(6.0f);
        this.f55807 = fM19160;
        this.f55803 = fM19160;
        this.f55800 = C6907.m19160(4.0f);
        this.f55808 = C6907.m19160(1.0f);
        float fM19161 = C6907.m19160(4.0f);
        float fM19162 = C6907.m19160(2.0f);
        this.f55795 = fM19161;
        this.f55794 = fM19162;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55806.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55806.setColorFilter(colorFilter);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40256(float f) {
        this.f55802 = f;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40257() {
        this.f55798 = -986896;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40255() {
        this.f55793 = -12566464;
    }
}
