package l;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۚ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47UH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5622 extends Drawable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Path f19233;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Path f19234;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f19235;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f19236;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f19237;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f19238;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Matrix f19239;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final float f19240;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f19241;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5486[] f19242;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f19243;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C5486[] f19244;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f19245;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Path f19246;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Path f19247;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5486[] f19248;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f19249;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Paint f19250;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C5622(C5486[] c5486Arr, C5486[] c5486Arr2) {
        Path path = new Path();
        this.f19233 = path;
        this.f19239 = new Matrix();
        this.f19247 = new Path();
        this.f19246 = new Path();
        this.f19235 = 0.0f;
        this.f19236 = -1.0f;
        this.f19243 = -1.0f;
        this.f19237 = -16777216;
        this.f19249 = -16777216;
        this.f19245 = 0.0f;
        Paint paint = new Paint();
        this.f19250 = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        if (!C22420.m49739(c5486Arr, c5486Arr2)) {
            throw new IllegalArgumentException();
        }
        this.f19244 = c5486Arr;
        this.f19248 = c5486Arr2;
        C5486[] c5486ArrM49742 = C22420.m49742(c5486Arr);
        this.f19242 = c5486ArrM49742;
        C22420.m49738(c5486ArrM49742, path);
        float f = 24;
        this.f19240 = f;
        this.f19238 = (int) ((f * C16737.m39279().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15509() {
        this.f19235 = 90.0f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15505(float f) {
        this.f19236 = 1.0f;
        this.f19243 = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m15503(int i) {
        if (this.f19245 == 1.0f) {
            return;
        }
        ValueAnimator valueAnimator = this.f19241;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f19241.cancel();
        }
        if (i == 0) {
            m15510(1.0f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f19241 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(i);
        this.f19241.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۖ᩸ۨ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C5622 c5622 = this.f10653;
                c5622.getClass();
                c5622.m15510(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        this.f19241.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15504() {
        if (this.f19245 == 0.0f) {
            return;
        }
        ValueAnimator valueAnimator = this.f19241;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f19241.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f19241 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300);
        this.f19241.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۨ᩸ۨ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C5622 c5622 = this.f40113;
                c5622.getClass();
                c5622.m15510(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        this.f19241.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth <= 0 || iHeight <= 0) {
            return;
        }
        canvas.save();
        float f = iWidth;
        float f2 = this.f19240;
        float f3 = iHeight;
        float fMin = Math.min(f / f2, f3 / f2);
        float f4 = f / 2.0f;
        float f5 = f3 / 2.0f;
        float f6 = this.f19235;
        float f7 = f6 == 0.0f ? 0.0f : f6 + ((0.0f - f6) * this.f19245);
        int i = this.f19237;
        int i2 = this.f19249;
        Paint paint = this.f19250;
        if (i == i2) {
            paint.setColor(i);
        } else {
            paint.setColor(C3224.m9662(i, i2, this.f19245));
        }
        float f8 = this.f19236;
        float f9 = this.f19243;
        if (f8 != -1.0f && f9 != -1.0f) {
            paint.setAlpha((int) ((((f9 - f8) * this.f19245) + f8) * 255.0f));
        }
        boolean zIsHardwareAccelerated = canvas.isHardwareAccelerated();
        Path path = this.f19233;
        if (!zIsHardwareAccelerated) {
            canvas.translate(f4, f5);
            if (f7 != 0.0f) {
                canvas.rotate(f7);
            }
            canvas.scale(fMin, fMin);
            float f10 = (-f2) / 2.0f;
            canvas.translate(f10, f10);
            Path path2 = this.f19234;
            if (path2 != null) {
                canvas.clipPath(path2);
            }
            canvas.drawPath(path, paint);
        } else {
            float f11 = (-f2) / 2.0f;
            Matrix matrix = this.f19239;
            matrix.setTranslate(f11, f11);
            matrix.postScale(fMin, fMin);
            if (f7 != 0.0f) {
                matrix.postRotate(f7);
            }
            matrix.postTranslate(f4, f5);
            Path path3 = this.f19247;
            path3.reset();
            path.transform(matrix, path3);
            if (this.f19234 != null) {
                Path path4 = this.f19246;
                path4.reset();
                this.f19234.transform(matrix, path4);
                canvas.clipPath(path4);
            }
            canvas.drawPath(path3, paint);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f19238;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f19238;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f19250.setAlpha(i);
        this.f19243 = -1.0f;
        this.f19236 = -1.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19250.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15507(Path path) {
        this.f19234 = path;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15506(int i) {
        this.f19249 = i;
        this.f19237 = i;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15511(int i) {
        this.f19237 = i;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m15508(int i) {
        this.f19249 = i;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15510(float f) {
        float fMax = Math.max(0.0f, Math.min(1.0f, f));
        if (this.f19245 != fMax) {
            this.f19245 = fMax;
            C5486[] c5486Arr = this.f19242;
            int length = c5486Arr.length;
            C5486[] c5486Arr2 = this.f19244;
            if (length == c5486Arr2.length) {
                int length2 = c5486Arr2.length;
                C5486[] c5486Arr3 = this.f19248;
                if (length2 == c5486Arr3.length) {
                    if (!C22420.m49739(c5486Arr2, c5486Arr3)) {
                        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                    }
                    for (int i = 0; i < c5486Arr.length; i++) {
                        c5486Arr[i].m15153(c5486Arr2[i], c5486Arr3[i], fMax);
                    }
                    Path path = this.f19233;
                    path.reset();
                    C22420.m49738(c5486Arr, path);
                    invalidateSelf();
                    return;
                }
            }
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
    }

    public final void finalize() throws Throwable {
        ValueAnimator valueAnimator = this.f19241;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f19241.cancel();
        }
        super.finalize();
    }
}
