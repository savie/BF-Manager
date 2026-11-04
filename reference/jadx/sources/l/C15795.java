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

/* JADX INFO: renamed from: l.ܶۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R98O */
/* JADX INFO: loaded from: classes4.dex */
public final class C15795 extends Drawable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f51384;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f51385;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float f51386;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f51387;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f51388;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f51389;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ColorFilter f51390;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Paint f51391;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f51392;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float f51393;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f51394;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f51395;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Rect f51396;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public C15795(Context context, int i) {
        Paint paint = new Paint(1);
        this.f51391 = paint;
        this.f51387 = 255;
        Resources.Theme theme = context.getTheme();
        Resources resources = context.getResources();
        this.f51392 = i;
        float f = resources.getDisplayMetrics().density;
        this.f51386 = f;
        if (i == 0) {
            this.f51388 = C23434.m52628(theme, R.attr.textColorPrimary).getDefaultColor();
            this.f51384 = (int) ((f * 2.0f) + 0.5f);
        } else if (i == 1) {
            this.f51388 = C9217.m24386(resources, bin.mt.plus.R.color.MT_Protector, theme);
            this.f51384 = 0;
        } else {
            throw new IllegalArgumentException();
        }
        this.f51394 = C3296.f10738;
        this.f51389 = this.f51388;
        if (i == 0) {
            int i2 = (int) ((4.0f * f) + 0.5f);
            int i3 = (int) ((f * 10.0f) + 0.5f);
            this.f51396 = new Rect(i2, i3, i2, i3);
            paint.setStyle(Paint.Style.FILL);
            this.f51393 = 0.0f;
            this.f51395 = 0.0f;
            return;
        }
        int i4 = (int) ((5.0f * f) + 0.5f);
        this.f51396 = new Rect(i4, i4, i4, i4);
        paint.setStyle(Paint.Style.STROKE);
        float f2 = 2.0f * f;
        this.f51393 = f2;
        this.f51395 = f * 4.0f;
        paint.setStrokeWidth(f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        int i = this.f51389;
        int iAlpha = (Color.alpha(i) * this.f51387) / 255;
        Paint paint = this.f51391;
        paint.setColor((i & 16777215) | (iAlpha << 24));
        paint.setColorFilter(this.f51390);
        if (this.f51392 == 0) {
            float f = bounds.bottom;
            float f2 = this.f51386;
            float f3 = f - (7.0f * f2);
            float f4 = this.f51385 ? f2 * 2.0f : f2;
            int iRound = Math.round(f2 * 2.0f);
            canvas.drawRect(bounds.left + iRound, f3, bounds.right - iRound, f3 + f4, paint);
            return;
        }
        float f5 = bounds.left;
        float f6 = this.f51393;
        float f7 = bounds.top + f6;
        float f8 = bounds.right - f6;
        float f9 = bounds.bottom - f6;
        float f10 = this.f51395;
        canvas.drawRoundRect(f5 + f6, f7, f8, f9, f10, f10, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        rect.set(this.f51396);
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
        int i2 = z3 ? this.f51394 : this.f51388;
        if (this.f51389 == i2 && this.f51385 == z3) {
            return false;
        }
        this.f51389 = i2;
        this.f51385 = z3;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f51387 == i) {
            return;
        }
        this.f51387 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f51390 == colorFilter) {
            return;
        }
        this.f51390 = colorFilter;
        invalidateSelf();
    }
}
