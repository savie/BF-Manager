package l;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۛۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R98O */
/* JADX INFO: loaded from: classes2.dex */
public final class C6008 extends Drawable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f20409;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f20410;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f20411;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20412;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float f20413;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f20414;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f20415;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final float f20416;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f20417;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Paint f20418;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f20419;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ColorFilter f20420;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Rect f20421;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public C6008(Context context, int i) {
        Paint paint = new Paint(1);
        this.f20418 = paint;
        this.f20415 = 255;
        Resources.Theme theme = context.getTheme();
        Resources resources = context.getResources();
        this.f20419 = i;
        float f = resources.getDisplayMetrics().density;
        this.f20416 = f;
        if (i == 0) {
            this.f20414 = C16135.m38189(theme, R.attr.textColorPrimary).getDefaultColor();
            this.f20411 = (int) ((f * 2.0f) + 0.5f);
        } else if (i == 1) {
            this.f20414 = C16631.m39095(resources, bin.mt.plus.R.color.MT_Protector, theme);
            this.f20411 = 0;
        } else {
            throw new IllegalArgumentException();
        }
        this.f20417 = C20368.f65970;
        this.f20409 = this.f20414;
        if (i == 0) {
            int i2 = (int) ((4.0f * f) + 0.5f);
            int i3 = (int) ((f * 10.0f) + 0.5f);
            this.f20421 = new Rect(i2, i3, i2, i3);
            paint.setStyle(Paint.Style.FILL);
            this.f20413 = 0.0f;
            this.f20410 = 0.0f;
            return;
        }
        int i4 = (int) ((5.0f * f) + 0.5f);
        this.f20421 = new Rect(i4, i4, i4, i4);
        paint.setStyle(Paint.Style.STROKE);
        float f2 = 2.0f * f;
        this.f20413 = f2;
        this.f20410 = f * 4.0f;
        paint.setStrokeWidth(f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        int i = this.f20409;
        int iAlpha = (Color.alpha(i) * this.f20415) / 255;
        Paint paint = this.f20418;
        paint.setColor((i & 16777215) | (iAlpha << 24));
        paint.setColorFilter(this.f20420);
        if (this.f20419 == 0) {
            float f = bounds.bottom;
            float f2 = this.f20416;
            float f3 = f - (7.0f * f2);
            if (this.f20412) {
                f2 *= 2.0f;
            }
            canvas.drawRect(bounds.left, f3, bounds.right, f3 + f2, paint);
            return;
        }
        float f4 = bounds.left;
        float f5 = this.f20413;
        float f6 = bounds.top + f5;
        float f7 = bounds.right - f5;
        float f8 = bounds.bottom - f5;
        float f9 = this.f20410;
        canvas.drawRoundRect(f4 + f5, f6, f7, f8, f9, f9, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        rect.set(this.f20421);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z = true;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == -16842910) {
                z = false;
            } else if (i == 16842908 || i == 16842919) {
                z2 = true;
            }
        }
        boolean z3 = z && z2;
        int i2 = z3 ? this.f20417 : this.f20414;
        if (this.f20409 == i2 && this.f20412 == z3) {
            return false;
        }
        this.f20409 = i2;
        this.f20412 = z3;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f20415 == i) {
            return;
        }
        this.f20415 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f20420 == colorFilter) {
            return;
        }
        this.f20420 = colorFilter;
        invalidateSelf();
    }
}
