package l;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15823 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Paint f51210;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float[] f51211;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int[] f51212;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Paint f51214;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float[] f51215;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f51216;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Path f51217;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Paint f51218;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10884 f51220;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Paint f51221;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Paint f51222;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float[] f51223;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Rect f51213 = new Rect();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f51219 = 1;

    public C15823(C10884 c10884) {
        this.f51220 = c10884;
        Paint paint = new Paint();
        this.f51214 = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f51210 = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f51222 = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f51221 = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(c10884.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.f51223 = new float[8];
        Paint paint5 = new Paint();
        this.f51218 = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.f51211 = new float[100];
        this.f51212 = new int[50];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37607(Canvas canvas, HashMap map, int i, int i2) {
        if (map == null || map.size() == 0) {
            return;
        }
        canvas.save();
        C10884 c10884 = this.f51220;
        boolean zIsInEditMode = c10884.isInEditMode();
        Paint paint = this.f51214;
        if (!zIsInEditMode && (i2 & 1) == 2) {
            String str = c10884.getContext().getResources().getResourceName(c10884.f37025) + ":" + c10884.f37028;
            canvas.drawText(str, 10.0f, c10884.getHeight() - 30, this.f51221);
            canvas.drawText(str, 11.0f, c10884.getHeight() - 29, paint);
        }
        for (C8061 c8061 : map.values()) {
            int iM21219 = c8061.m21219();
            if (i2 > 0 && iM21219 == 0) {
                iM21219 = 1;
            }
            if (iM21219 != 0) {
                this.f51216 = c8061.m21220(this.f51211, this.f51212);
                if (iM21219 >= 1) {
                    int i3 = i / 16;
                    float[] fArr = this.f51215;
                    if (fArr == null || fArr.length != i3 * 2) {
                        this.f51215 = new float[i3 * 2];
                        this.f51217 = new Path();
                    }
                    int i4 = this.f51219;
                    float f = i4;
                    canvas.translate(f, f);
                    paint.setColor(1996488704);
                    Paint paint2 = this.f51218;
                    paint2.setColor(1996488704);
                    Paint paint3 = this.f51210;
                    paint3.setColor(1996488704);
                    Paint paint4 = this.f51222;
                    paint4.setColor(1996488704);
                    c8061.m21226(i3, this.f51215);
                    m37606(canvas, iM21219, this.f51216, c8061);
                    paint.setColor(-21965);
                    paint3.setColor(-2067046);
                    paint2.setColor(-2067046);
                    paint4.setColor(-13391360);
                    float f2 = -i4;
                    canvas.translate(f2, f2);
                    m37606(canvas, iM21219, this.f51216, c8061);
                    if (iM21219 == 5) {
                        this.f51217.reset();
                        for (int i5 = 0; i5 <= 50; i5++) {
                            float[] fArr2 = this.f51223;
                            c8061.m21223(i5 / 50, fArr2);
                            this.f51217.moveTo(fArr2[0], fArr2[1]);
                            this.f51217.lineTo(fArr2[2], fArr2[3]);
                            this.f51217.lineTo(fArr2[4], fArr2[5]);
                            this.f51217.lineTo(fArr2[6], fArr2[7]);
                            this.f51217.close();
                        }
                        paint.setColor(1140850688);
                        canvas.translate(2.0f, 2.0f);
                        canvas.drawPath(this.f51217, paint);
                        canvas.translate(-2.0f, -2.0f);
                        paint.setColor(-65536);
                        canvas.drawPath(this.f51217, paint);
                    }
                }
            }
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37606(Canvas canvas, int i, int i2, C8061 c8061) {
        int width;
        int height;
        Paint paint = this.f51222;
        int[] iArr = this.f51212;
        int i3 = 1;
        if (i == 4) {
            boolean z = false;
            boolean z2 = false;
            for (int i4 = 0; i4 < this.f51216; i4++) {
                int i5 = iArr[i4];
                if (i5 == 1) {
                    z = true;
                }
                if (i5 == 2) {
                    z2 = true;
                }
            }
            if (z) {
                float[] fArr = this.f51215;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
            }
            if (z2) {
                m37602(canvas);
            }
        }
        if (i == 2) {
            float[] fArr2 = this.f51215;
            canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], paint);
        }
        if (i == 3) {
            m37602(canvas);
        }
        canvas.drawLines(this.f51215, this.f51214);
        View view = c8061.f28260;
        if (view != null) {
            width = view.getWidth();
            height = c8061.f28260.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i6 = 4;
        int i7 = 1;
        while (i7 < i2 - 1) {
            if (i != i6 || iArr[i7 - 1] != 0) {
                int i8 = i7 * 2;
                float[] fArr3 = this.f51211;
                float f = fArr3[i8];
                float f2 = fArr3[i8 + i3];
                this.f51217.reset();
                this.f51217.moveTo(f, f2 + 10.0f);
                this.f51217.lineTo(f + 10.0f, f2);
                this.f51217.lineTo(f, f2 - 10.0f);
                this.f51217.lineTo(f - 10.0f, f2);
                this.f51217.close();
                int i9 = i7 - 1;
                c8061.m21224(i9);
                Paint paint2 = this.f51218;
                if (i == i6) {
                    int i10 = iArr[i9];
                    if (i10 == i3) {
                        m37605(canvas, f - 0.0f, f2 - 0.0f);
                    } else if (i10 == 2) {
                        m37603(canvas, f - 0.0f, f2 - 0.0f);
                    } else {
                        if (i10 == 3) {
                            m37604(canvas, f - 0.0f, f2 - 0.0f, width, height);
                        }
                        canvas.drawPath(this.f51217, paint2);
                    }
                    canvas.drawPath(this.f51217, paint2);
                } else {
                    paint2 = paint2;
                    f2 = f2;
                    f = f;
                }
                if (i == 2) {
                    m37605(canvas, f - 0.0f, f2 - 0.0f);
                }
                if (i == 3) {
                    m37603(canvas, f - 0.0f, f2 - 0.0f);
                }
                if (i == 6) {
                    m37604(canvas, f - 0.0f, f2 - 0.0f, width, height);
                }
                canvas.drawPath(this.f51217, paint2);
            }
            i7++;
            i6 = 4;
            i3 = 1;
        }
        float[] fArr4 = this.f51215;
        if (fArr4.length > 1) {
            float f3 = fArr4[0];
            float f4 = fArr4[1];
            Paint paint3 = this.f51210;
            canvas.drawCircle(f3, f4, 8.0f, paint3);
            float[] fArr5 = this.f51215;
            canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m37605(Canvas canvas, float f, float f2) {
        float[] fArr = this.f51215;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (fHypot * fHypot);
        float f10 = f3 + (f7 * f9);
        float f11 = f4 + (f9 * f8);
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f10, f11);
        float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
        String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        int length = str.length();
        Paint paint = this.f51221;
        Rect rect = this.f51213;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (rect.width() / 2), -20.0f, paint);
        canvas.drawLine(f, f2, f10, f11, this.f51222);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37602(Canvas canvas) {
        float[] fArr = this.f51215;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        float fMin = Math.min(f, f3);
        float fMax = Math.max(f2, f4);
        float fMax2 = Math.max(f, f3);
        float fMax3 = Math.max(f2, f4);
        Paint paint = this.f51222;
        canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37603(Canvas canvas, float f, float f2) {
        float[] fArr = this.f51215;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float fMin = Math.min(f3, f5);
        float fMax = Math.max(f4, f6);
        float fMin2 = f - Math.min(f3, f5);
        float fMax2 = Math.max(f4, f6) - f2;
        String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
        int length = str.length();
        Paint paint = this.f51221;
        Rect rect = this.f51213;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f2 - 20.0f, paint);
        float fMin3 = Math.min(f3, f5);
        Paint paint2 = this.f51222;
        canvas.drawLine(f, f2, fMin3, f2, paint2);
        String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37604(Canvas canvas, float f, float f2, int i, int i2) {
        StringBuilder sb = new StringBuilder("");
        C10884 c10884 = this.f51220;
        sb.append(((int) (((double) (((f - (i / 2)) * 100.0f) / (c10884.getWidth() - i))) + 0.5d)) / 100.0f);
        String string = sb.toString();
        int length = string.length();
        Paint paint = this.f51221;
        Rect rect = this.f51213;
        paint.getTextBounds(string, 0, length, rect);
        canvas.drawText(string, ((f / 2.0f) - (rect.width() / 2)) + 0.0f, f2 - 20.0f, paint);
        float fMin = Math.min(0.0f, 1.0f);
        Paint paint2 = this.f51222;
        canvas.drawLine(f, f2, fMin, f2, paint2);
        String str = "" + (((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (c10884.getHeight() - i2))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, f + 5.0f, 0.0f - ((f2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), paint2);
    }
}
