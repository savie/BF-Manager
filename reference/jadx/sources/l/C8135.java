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

/* JADX INFO: renamed from: l.۠ۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5XC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8135 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Resources f28479;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f28480;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f28481;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18718 f28482;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f28483;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f28484;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final LinearInterpolator f28477 = new LinearInterpolator();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C22819 f28478 = new C22819();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int[] f28476 = {-16777216};

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C8135(Context context) {
        context.getClass();
        this.f28479 = context.getResources();
        C18718 c18718 = new C18718();
        this.f28482 = c18718;
        c18718.f60706 = f28476;
        c18718.m43253(0);
        c18718.f60710 = 2.5f;
        c18718.f60717.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C21540(this, c18718));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f28477);
        valueAnimatorOfFloat.addListener(new C18012(this, c18718));
        this.f28481 = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21439() {
        float f = this.f28479.getDisplayMetrics().density;
        float f2 = 2.5f * f;
        C18718 c18718 = this.f28482;
        c18718.f60710 = f2;
        c18718.f60717.setStrokeWidth(f2);
        c18718.f60722 = 7.5f * f;
        c18718.m43253(0);
        c18718.f60723 = (int) (10.0f * f);
        c18718.f60714 = (int) (f * 5.0f);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21445(float f) {
        this.f28482.f60718 = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f28480, bounds.exactCenterX(), bounds.exactCenterY());
        C18718 c18718 = this.f28482;
        Paint paint = c18718.f60717;
        RectF rectF = c18718.f60721;
        float f = c18718.f60722;
        float fMin = (c18718.f60710 / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c18718.f60723 * c18718.f60708) / 2.0f, c18718.f60710 / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = c18718.f60711;
        float f3 = c18718.f60718;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c18718.f60724 + f3) * 360.0f) - f4;
        paint.setColor(c18718.f60709);
        paint.setAlpha(c18718.f60707);
        float f6 = c18718.f60710 / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c18718.f60704);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = c18718.f60705;
        if (c18718.f60719) {
            Path path = c18718.f60716;
            if (path == null) {
                Path path2 = new Path();
                c18718.f60716 = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (c18718.f60723 * c18718.f60708) / 2.0f;
            c18718.f60716.moveTo(0.0f, 0.0f);
            c18718.f60716.lineTo(c18718.f60723 * c18718.f60708, 0.0f);
            Path path3 = c18718.f60716;
            float f9 = c18718.f60723;
            float f10 = c18718.f60708;
            path3.lineTo((f9 * f10) / 2.0f, c18718.f60714 * f10);
            c18718.f60716.offset((rectF.centerX() + fMin2) - f8, (c18718.f60710 / 2.0f) + rectF.centerY());
            c18718.f60716.close();
            paint2.setColor(c18718.f60709);
            paint2.setAlpha(c18718.f60707);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c18718.f60716, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f28482.f60707 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f28482.f60707;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28482.f60717.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f28481.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f28481.cancel();
        C18718 c18718 = this.f28482;
        float f = c18718.f60711;
        c18718.f60713 = f;
        float f2 = c18718.f60724;
        c18718.f60720 = f2;
        c18718.f60712 = c18718.f60718;
        if (f2 != f) {
            this.f28484 = true;
            this.f28481.setDuration(666L);
            this.f28481.start();
            return;
        }
        c18718.m43253(0);
        c18718.f60713 = 0.0f;
        c18718.f60720 = 0.0f;
        c18718.f60712 = 0.0f;
        c18718.f60711 = 0.0f;
        c18718.f60724 = 0.0f;
        c18718.f60718 = 0.0f;
        this.f28481.setDuration(1332L);
        this.f28481.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f28481.cancel();
        this.f28480 = 0.0f;
        C18718 c18718 = this.f28482;
        if (c18718.f60719) {
            c18718.f60719 = false;
        }
        c18718.m43253(0);
        c18718.f60713 = 0.0f;
        c18718.f60720 = 0.0f;
        c18718.f60712 = 0.0f;
        c18718.f60711 = 0.0f;
        c18718.f60724 = 0.0f;
        c18718.f60718 = 0.0f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21441(float f, C18718 c18718, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f28484) {
            m21438(f, c18718);
            float fFloor = (float) (Math.floor(c18718.f60712 / 0.8f) + 1.0d);
            float f2 = c18718.f60713;
            float f3 = c18718.f60720;
            c18718.f60711 = (((f3 - 0.01f) - f2) * f) + f2;
            c18718.f60724 = f3;
            float f4 = c18718.f60712;
            c18718.f60718 = C0280.m1792(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = c18718.f60712;
            C22819 c22819 = f28478;
            if (f < 0.5f) {
                interpolation = c18718.f60713;
                interpolation2 = (c22819.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = c18718.f60713 + 0.79f;
                interpolation = f6 - (((1.0f - c22819.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.f28483) * 216.0f;
            c18718.f60711 = interpolation;
            c18718.f60724 = interpolation2;
            c18718.f60718 = f7;
            this.f28480 = f8;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21443(int... iArr) {
        C18718 c18718 = this.f28482;
        c18718.f60706 = iArr;
        c18718.m43253(0);
        c18718.m43253(0);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m21444(float f) {
        C18718 c18718 = this.f28482;
        c18718.f60711 = 0.0f;
        c18718.f60724 = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21438(float f, C18718 c18718) {
        int i;
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = c18718.f60706;
            int i2 = c18718.f60715;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            int i5 = (i3 >> 24) & 255;
            int i6 = (i3 >> 16) & 255;
            int i7 = (i3 >> 8) & 255;
            int i8 = i3 & 255;
            i = ((i5 + ((int) ((((i4 >> 24) & 255) - i5) * f2))) << 24) | ((i6 + ((int) ((((i4 >> 16) & 255) - i6) * f2))) << 16) | ((i7 + ((int) ((((i4 >> 8) & 255) - i7) * f2))) << 8) | (i8 + ((int) (f2 * ((i4 & 255) - i8))));
        } else {
            i = c18718.f60706[c18718.f60715];
        }
        c18718.f60709 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21442(boolean z) {
        C18718 c18718 = this.f28482;
        if (c18718.f60719 != z) {
            c18718.f60719 = z;
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21440(float f) {
        C18718 c18718 = this.f28482;
        if (f != c18718.f60708) {
            c18718.f60708 = f;
        }
        invalidateSelf();
    }
}
