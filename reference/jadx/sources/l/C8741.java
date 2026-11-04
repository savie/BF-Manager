package l;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۠ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47UH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8741 extends Drawable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f28427;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Matrix f28428;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f28429;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11783[] f28430;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f28431;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f28432;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float f28433;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Path f28434;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f28435;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f28436;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C11783[] f28437;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11783[] f28438;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f28439;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Path f28440;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f28441;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Path f28442;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Path f28443;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Paint f28444;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C8741(C11783[] c11783Arr, C11783[] c11783Arr2) {
        Path path = new Path();
        this.f28434 = path;
        this.f28428 = new Matrix();
        this.f28440 = new Path();
        this.f28443 = new Path();
        this.f28427 = 0.0f;
        this.f28429 = -1.0f;
        this.f28441 = -1.0f;
        this.f28439 = -16777216;
        this.f28435 = -16777216;
        this.f28436 = 0.0f;
        Paint paint = new Paint();
        this.f28444 = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        if (!C25210.m56208(c11783Arr, c11783Arr2)) {
            throw new IllegalArgumentException();
        }
        this.f28437 = c11783Arr;
        this.f28438 = c11783Arr2;
        C11783[] c11783ArrM56211 = C25210.m56211(c11783Arr);
        this.f28430 = c11783ArrM56211;
        C25210.m56207(c11783ArrM56211, path);
        float f = 24;
        this.f28433 = f;
        this.f28432 = (int) ((f * C21576.m49055().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23433() {
        this.f28427 = 90.0f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23429(float f) {
        this.f28429 = 1.0f;
        this.f28441 = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m23436(int i) {
        if (this.f28436 == 1.0f) {
            return;
        }
        ValueAnimator valueAnimator = this.f28431;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f28431.cancel();
        }
        if (i == 0) {
            m23434(1.0f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f28431 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(i);
        this.f28431.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۖܺۤ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C8741 c8741 = this.f9153;
                c8741.getClass();
                c8741.m23434(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        this.f28431.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23428() {
        if (this.f28436 == 0.0f) {
            return;
        }
        ValueAnimator valueAnimator = this.f28431;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f28431.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f28431 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300);
        this.f28431.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۡܺۤ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C8741 c8741 = this.f30725;
                c8741.getClass();
                c8741.m23434(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        this.f28431.start();
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
        float f2 = this.f28433;
        float f3 = iHeight;
        float fMin = Math.min(f / f2, f3 / f2);
        float f4 = f / 2.0f;
        float f5 = f3 / 2.0f;
        float f6 = this.f28427;
        float f7 = f6 == 0.0f ? 0.0f : f6 + ((0.0f - f6) * this.f28436);
        int i = this.f28439;
        int i2 = this.f28435;
        Paint paint = this.f28444;
        if (i == i2) {
            paint.setColor(i);
        } else {
            paint.setColor(C19988.m45958(i, i2, this.f28436));
        }
        float f8 = this.f28429;
        float f9 = this.f28441;
        if (f8 != -1.0f && f9 != -1.0f) {
            paint.setAlpha((int) ((((f9 - f8) * this.f28436) + f8) * 255.0f));
        }
        boolean zIsHardwareAccelerated = canvas.isHardwareAccelerated();
        Path path = this.f28434;
        if (!zIsHardwareAccelerated) {
            canvas.translate(f4, f5);
            if (f7 != 0.0f) {
                canvas.rotate(f7);
            }
            canvas.scale(fMin, fMin);
            float f10 = (-f2) / 2.0f;
            canvas.translate(f10, f10);
            Path path2 = this.f28442;
            if (path2 != null) {
                canvas.clipPath(path2);
            }
            canvas.drawPath(path, paint);
        } else {
            float f11 = (-f2) / 2.0f;
            Matrix matrix = this.f28428;
            matrix.setTranslate(f11, f11);
            matrix.postScale(fMin, fMin);
            if (f7 != 0.0f) {
                matrix.postRotate(f7);
            }
            matrix.postTranslate(f4, f5);
            Path path3 = this.f28440;
            path3.reset();
            path.transform(matrix, path3);
            if (this.f28442 != null) {
                Path path4 = this.f28443;
                path4.reset();
                this.f28442.transform(matrix, path4);
                canvas.clipPath(path4);
            }
            canvas.drawPath(path3, paint);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f28432;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f28432;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f28444.setAlpha(i);
        this.f28441 = -1.0f;
        this.f28429 = -1.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28444.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23431(Path path) {
        this.f28442 = path;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23430(int i) {
        this.f28435 = i;
        this.f28439 = i;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23435(int i) {
        this.f28439 = i;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23432(int i) {
        this.f28435 = i;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23434(float f) {
        float fMax = Math.max(0.0f, Math.min(1.0f, f));
        if (this.f28436 != fMax) {
            this.f28436 = fMax;
            C11783[] c11783Arr = this.f28430;
            int length = c11783Arr.length;
            C11783[] c11783Arr2 = this.f28437;
            if (length == c11783Arr2.length) {
                int length2 = c11783Arr2.length;
                C11783[] c11783Arr3 = this.f28438;
                if (length2 == c11783Arr3.length) {
                    if (!C25210.m56208(c11783Arr2, c11783Arr3)) {
                        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                    }
                    for (int i = 0; i < c11783Arr.length; i++) {
                        c11783Arr[i].m29610(c11783Arr2[i], c11783Arr3[i], fMax);
                    }
                    Path path = this.f28434;
                    path.reset();
                    C25210.m56207(c11783Arr, path);
                    invalidateSelf();
                    return;
                }
            }
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
    }

    public final void finalize() throws Throwable {
        ValueAnimator valueAnimator = this.f28431;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f28431.cancel();
        }
        super.finalize();
    }
}
