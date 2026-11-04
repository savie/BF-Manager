package l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: l.᩸֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D5XC */
/* JADX INFO: loaded from: classes.dex */
public final class C22464 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final LinearInterpolator f72693 = new LinearInterpolator();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C1874 f72694 = new C1874();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int[] f72695 = {-16777216};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C10529 f72696;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f72697;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f72698;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Resources f72699;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f72700;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f72701;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C22464(Context context) {
        context.getClass();
        this.f72699 = context.getResources();
        C10529 c10529 = new C10529();
        this.f72696 = c10529;
        c10529.f33478 = f72695;
        c10529.m26978(0);
        c10529.f33497 = 2.5f;
        c10529.f33490.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C4564(this, c10529));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f72693);
        valueAnimatorOfFloat.addListener(new C21718(this, c10529));
        this.f72698 = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50652() {
        float f = this.f72699.getDisplayMetrics().density;
        float f2 = 2.5f * f;
        C10529 c10529 = this.f72696;
        c10529.f33497 = f2;
        c10529.f33490.setStrokeWidth(f2);
        c10529.f33491 = 7.5f * f;
        c10529.m26978(0);
        c10529.f33488 = (int) (10.0f * f);
        c10529.f33484 = (int) (f * 5.0f);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50658(float f) {
        this.f72696.f33489 = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f72697, bounds.exactCenterX(), bounds.exactCenterY());
        C10529 c10529 = this.f72696;
        Paint paint = c10529.f33490;
        RectF rectF = c10529.f33480;
        float f = c10529.f33491;
        float fMin = (c10529.f33497 / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c10529.f33488 * c10529.f33492) / 2.0f, c10529.f33497 / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = c10529.f33479;
        float f3 = c10529.f33489;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c10529.f33498 + f3) * 360.0f) - f4;
        paint.setColor(c10529.f33485);
        paint.setAlpha(c10529.f33481);
        float f6 = c10529.f33497 / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c10529.f33487);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = c10529.f33495;
        if (c10529.f33496) {
            Path path = c10529.f33494;
            if (path == null) {
                Path path2 = new Path();
                c10529.f33494 = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (c10529.f33488 * c10529.f33492) / 2.0f;
            c10529.f33494.moveTo(0.0f, 0.0f);
            c10529.f33494.lineTo(c10529.f33488 * c10529.f33492, 0.0f);
            Path path3 = c10529.f33494;
            float f9 = c10529.f33488;
            float f10 = c10529.f33492;
            path3.lineTo((f9 * f10) / 2.0f, c10529.f33484 * f10);
            c10529.f33494.offset((rectF.centerX() + fMin2) - f8, (c10529.f33497 / 2.0f) + rectF.centerY());
            c10529.f33494.close();
            paint2.setColor(c10529.f33485);
            paint2.setAlpha(c10529.f33481);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c10529.f33494, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f72696.f33481 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f72696.f33481;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f72696.f33490.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f72698.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f72698.cancel();
        C10529 c10529 = this.f72696;
        float f = c10529.f33479;
        c10529.f33483 = f;
        float f2 = c10529.f33498;
        c10529.f33493 = f2;
        c10529.f33486 = c10529.f33489;
        if (f2 != f) {
            this.f72701 = true;
            this.f72698.setDuration(666L);
            this.f72698.start();
            return;
        }
        c10529.m26978(0);
        c10529.f33483 = 0.0f;
        c10529.f33493 = 0.0f;
        c10529.f33486 = 0.0f;
        c10529.f33479 = 0.0f;
        c10529.f33498 = 0.0f;
        c10529.f33489 = 0.0f;
        this.f72698.setDuration(1332L);
        this.f72698.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f72698.cancel();
        this.f72697 = 0.0f;
        C10529 c10529 = this.f72696;
        if (c10529.f33496) {
            c10529.f33496 = false;
        }
        c10529.m26978(0);
        c10529.f33483 = 0.0f;
        c10529.f33493 = 0.0f;
        c10529.f33486 = 0.0f;
        c10529.f33479 = 0.0f;
        c10529.f33498 = 0.0f;
        c10529.f33489 = 0.0f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50654(float f, C10529 c10529, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f72701) {
            m50651(f, c10529);
            float fFloor = (float) (Math.floor(c10529.f33486 / 0.8f) + 1.0d);
            float f2 = c10529.f33483;
            float f3 = c10529.f33493;
            c10529.f33479 = (((f3 - 0.01f) - f2) * f) + f2;
            c10529.f33498 = f3;
            float f4 = c10529.f33486;
            c10529.f33489 = C19967.m45884(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = c10529.f33486;
            C1874 c1874 = f72694;
            if (f < 0.5f) {
                interpolation = c10529.f33483;
                interpolation2 = (c1874.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = c10529.f33483 + 0.79f;
                interpolation = f6 - (((1.0f - c1874.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.f72700) * 216.0f;
            c10529.f33479 = interpolation;
            c10529.f33498 = interpolation2;
            c10529.f33489 = f7;
            this.f72697 = f8;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50656(int... iArr) {
        C10529 c10529 = this.f72696;
        c10529.f33478 = iArr;
        c10529.m26978(0);
        c10529.m26978(0);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50657(float f) {
        C10529 c10529 = this.f72696;
        c10529.f33479 = 0.0f;
        c10529.f33498 = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50651(float f, C10529 c10529) {
        int i;
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = c10529.f33478;
            int i2 = c10529.f33482;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            int i5 = (i3 >> 24) & 255;
            int i6 = (i3 >> 16) & 255;
            int i7 = (i3 >> 8) & 255;
            int i8 = i3 & 255;
            i = ((i5 + ((int) ((((i4 >> 24) & 255) - i5) * f2))) << 24) | ((i6 + ((int) ((((i4 >> 16) & 255) - i6) * f2))) << 16) | ((i7 + ((int) ((((i4 >> 8) & 255) - i7) * f2))) << 8) | (i8 + ((int) (f2 * ((i4 & 255) - i8))));
        } else {
            i = c10529.f33478[c10529.f33482];
        }
        c10529.f33485 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50655(boolean z) {
        C10529 c10529 = this.f72696;
        if (c10529.f33496 != z) {
            c10529.f33496 = z;
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50653(float f) {
        C10529 c10529 = this.f72696;
        if (f != c10529.f33492) {
            c10529.f33492 = f;
        }
        invalidateSelf();
    }
}
