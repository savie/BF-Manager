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

/* JADX INFO: renamed from: l.ۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A3PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8539 extends Drawable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final float f29548 = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Paint f29549;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f29550;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f29551;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f29552;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f29553;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f29554;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f29555;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Path f29556;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f29557;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f29558;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f29559;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f29560;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C8539(Context context) {
        Paint paint = new Paint();
        this.f29549 = paint;
        this.f29556 = new Path();
        this.f29558 = false;
        this.f29553 = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C12108.f40533, R.attr.MT_Protector, R.style.MT_Protector);
        m22295(typedArrayObtainStyledAttributes.getColor(3, 0));
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f29559 = (float) (Math.cos(f29548) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f29560 != z) {
            this.f29560 = z;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f29555) {
            this.f29555 = fRound;
            invalidateSelf();
        }
        this.f29554 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f29550 = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f29552 = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f29557 = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22295(int i) {
        Paint paint = this.f29549;
        if (i != paint.getColor()) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22296(boolean z) {
        if (this.f29558 != z) {
            this.f29558 = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z = false;
        int i = this.f29553;
        if (i != 0 && (i == 1 || (i == 3 ? C7603.m20126(this) == 0 : C7603.m20126(this) == 1))) {
            z = true;
        }
        float f = this.f29552;
        float fSqrt = (float) Math.sqrt(f * f * 2.0f);
        float f2 = this.f29551;
        float f3 = this.f29550;
        float fM22293 = m22293(f3, fSqrt, f2);
        float fM22294 = m22293(f3, this.f29557, this.f29551);
        float fRound = Math.round(m22293(0.0f, this.f29559, this.f29551));
        float fM22295 = m22293(0.0f, f29548, this.f29551);
        float fM22296 = m22293(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f29551);
        double d = fM22293;
        double d2 = fM22295;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(Math.sin(d2) * d);
        Path path = this.f29556;
        path.rewind();
        float f4 = this.f29555;
        Paint paint = this.f29549;
        float fM22297 = m22293(f4 + paint.getStrokeWidth(), -this.f29559, this.f29551);
        float f5 = (-fM22294) / 2.0f;
        path.moveTo(f5 + fRound, 0.0f);
        path.rLineTo(fM22294 - (fRound * 2.0f), 0.0f);
        path.moveTo(f5, fM22297);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f5, -fM22297);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f6 = this.f29555;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f6 + ((((int) (fHeight - (2.0f * f6))) / 4) * 2));
        if (this.f29560) {
            canvas.rotate(fM22296 * (this.f29558 ^ z ? -1 : 1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f29549;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29549.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f29554;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f29554;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22294(float f) {
        if (this.f29551 != f) {
            this.f29551 = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m22293(float f, float f2, float f3) {
        return C0280.m1792(f2, f, f3, f);
    }
}
