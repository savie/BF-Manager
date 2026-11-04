package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: A3PC */
/* JADX INFO: loaded from: classes.dex */
public final class C24289 extends Drawable {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final float f78613 = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f78614;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f78615;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Path f78616;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f78617;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f78618;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Paint f78619;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f78620;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f78621;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f78622;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f78623;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f78624;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f78625;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C24289(Context context) {
        Paint paint = new Paint();
        this.f78619 = paint;
        this.f78616 = new Path();
        this.f78621 = false;
        this.f78622 = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C10401.f33083, R.attr.MT_Protector, R.style.MT_Protector);
        m54301(typedArrayObtainStyledAttributes.getColor(3, 0));
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f78620 = (float) (Math.cos(f78613) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f78625 != z) {
            this.f78625 = z;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f78617) {
            this.f78617 = fRound;
            invalidateSelf();
        }
        this.f78618 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f78624 = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f78615 = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f78623 = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54301(int i) {
        Paint paint = this.f78619;
        if (i != paint.getColor()) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54302(boolean z) {
        if (this.f78621 != z) {
            this.f78621 = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z = false;
        int i = this.f78622;
        if (i != 0 && (i == 1 || (i == 3 ? C0597.m2701(this) == 0 : C0597.m2701(this) == 1))) {
            z = true;
        }
        float f = this.f78615;
        float fSqrt = (float) Math.sqrt(f * f * 2.0f);
        float f2 = this.f78614;
        float f3 = this.f78624;
        float fM54299 = m54299(f3, fSqrt, f2);
        float fM542910 = m54299(f3, this.f78623, this.f78614);
        float fRound = Math.round(m54299(0.0f, this.f78620, this.f78614));
        float fM542911 = m54299(0.0f, f78613, this.f78614);
        float fM542912 = m54299(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f78614);
        double d = fM54299;
        double d2 = fM542911;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(Math.sin(d2) * d);
        Path path = this.f78616;
        path.rewind();
        float f4 = this.f78617;
        Paint paint = this.f78619;
        float fM542913 = m54299(f4 + paint.getStrokeWidth(), -this.f78620, this.f78614);
        float f5 = (-fM542910) / 2.0f;
        path.moveTo(f5 + fRound, 0.0f);
        path.rLineTo(fM542910 - (fRound * 2.0f), 0.0f);
        path.moveTo(f5, fM542913);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f5, -fM542913);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f6 = this.f78617;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f6 + ((((int) (fHeight - (2.0f * f6))) / 4) * 2));
        if (this.f78625) {
            canvas.rotate(fM542912 * (this.f78621 ^ z ? -1 : 1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f78619;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f78619.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f78618;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f78618;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54300(float f) {
        if (this.f78614 != f) {
            this.f78614 = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m54299(float f, float f2, float f3) {
        return C19967.m45884(f2, f, f3, f);
    }
}
