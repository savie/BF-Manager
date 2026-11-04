package l;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes.dex */
public final class C1146 {

    /* JADX INFO: renamed from: ۜܳ᩵, reason: not valid java name and contains not printable characters */
    public static int f4234;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f4235;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Path f4237;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f4238;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float[] f4239;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Paint f4240;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Paint f4241;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21855 f4242;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Paint f4244;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Paint f4245;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Paint f4246;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float[] f4247;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float[] f4248;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Rect f4236 = new Rect();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f4243 = 1;

    /* JADX INFO: renamed from: ֡ۚۚ, reason: not valid java name and contains not printable characters */
    public static void m4219(Object obj, Object obj2) {
        ((Throwable) obj).addSuppressed((Throwable) obj2);
    }

    /* JADX INFO: renamed from: ֨֡ܳ, reason: not valid java name and contains not printable characters */
    public static String m4220(Object obj) {
        return ((AbstractC22044) obj).mo4294();
    }

    /* JADX INFO: renamed from: ۖ᩵֡, reason: not valid java name and contains not printable characters */
    public static char m4221(int i, Object obj) {
        return C22313.m50373(i, (String) obj);
    }

    /* JADX INFO: renamed from: ۗ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m4222(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۚ֡ۘ, reason: not valid java name and contains not printable characters */
    public static C10186 m4226(Object obj) {
        return C18282.m42473((Exception) obj);
    }

    /* JADX INFO: renamed from: ۛ᩻᩷, reason: not valid java name and contains not printable characters */
    public static void m4227(Object obj, Object obj2) {
        ((C2361) obj).m8024((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۢܿ᩵, reason: not valid java name and contains not printable characters */
    public static String m4228(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
    }

    /* JADX INFO: renamed from: ۤۗ۟, reason: not valid java name and contains not printable characters */
    public static long m4229(Object obj, int i) {
        return ((C15008) obj).m36138(i);
    }

    /* JADX INFO: renamed from: ۧ᩸᩸, reason: not valid java name and contains not printable characters */
    public static CharSequence m4230(Object obj) {
        return ((TextView) obj).getText();
    }

    /* JADX INFO: renamed from: ۨܽۖ, reason: not valid java name and contains not printable characters */
    public static boolean m4231() {
        return true;
    }

    /* JADX INFO: renamed from: ܳۖۤ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m4232(Object obj, Object obj2) {
        return ((SpannableStringBuilder) obj).append((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܺ᩵۠, reason: not valid java name and contains not printable characters */
    public static void m4233(Object obj) {
        C15243.m36586(obj);
    }

    /* JADX INFO: renamed from: ܽۙۜ, reason: not valid java name and contains not printable characters */
    public static void m4234(Object obj, int i) {
        ((C25179) obj).m56135(i);
    }

    /* JADX INFO: renamed from: ᩵ۘۘ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m4235(Object obj, Object obj2) {
        return ((StringBuilder) obj).append(obj2);
    }

    /* JADX INFO: renamed from: ᩵ܿۢ, reason: not valid java name and contains not printable characters */
    public static int m4236(int i, Object obj) {
        return C6929.m19208(i, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ᩹ۧ۬, reason: not valid java name and contains not printable characters */
    public static String m4238(Object obj, Object obj2) {
        return ((JSONObject) obj).getString((String) obj2);
    }

    public C1146(C21855 c21855) {
        this.f4242 = c21855;
        Paint paint = new Paint();
        this.f4245 = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f4240 = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f4241 = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f4244 = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(c21855.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.f4248 = new float[8];
        Paint paint5 = new Paint();
        this.f4246 = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.f4247 = new float[100];
        this.f4235 = new int[50];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4240(Canvas canvas, HashMap map, int i, int i2) {
        if (map == null || map.size() == 0) {
            return;
        }
        canvas.save();
        C21855 c21855 = this.f4242;
        boolean zIsInEditMode = c21855.isInEditMode();
        Paint paint = this.f4245;
        if (!zIsInEditMode && (i2 & 1) == 2) {
            String str = c21855.getContext().getResources().getResourceName(c21855.f69629) + ":" + c21855.f69653;
            canvas.drawText(str, 10.0f, c21855.getHeight() - 30, this.f4244);
            canvas.drawText(str, 11.0f, c21855.getHeight() - 29, paint);
        }
        for (C21283 c21283 : map.values()) {
            int iM48453 = c21283.m48453();
            if (i2 > 0 && iM48453 == 0) {
                iM48453 = 1;
            }
            if (iM48453 != 0) {
                this.f4238 = c21283.m48454(this.f4247, this.f4235);
                if (iM48453 >= 1) {
                    int i3 = i / 16;
                    float[] fArr = this.f4239;
                    if (fArr == null || fArr.length != i3 * 2) {
                        this.f4239 = new float[i3 * 2];
                        this.f4237 = new Path();
                    }
                    int i4 = this.f4243;
                    float f = i4;
                    canvas.translate(f, f);
                    paint.setColor(1996488704);
                    Paint paint2 = this.f4246;
                    paint2.setColor(1996488704);
                    Paint paint3 = this.f4240;
                    paint3.setColor(1996488704);
                    Paint paint4 = this.f4241;
                    paint4.setColor(1996488704);
                    c21283.m48460(i3, this.f4239);
                    m4239(canvas, iM48453, this.f4238, c21283);
                    paint.setColor(-21965);
                    paint3.setColor(-2067046);
                    paint2.setColor(-2067046);
                    paint4.setColor(-13391360);
                    float f2 = -i4;
                    canvas.translate(f2, f2);
                    m4239(canvas, iM48453, this.f4238, c21283);
                    if (iM48453 == 5) {
                        this.f4237.reset();
                        for (int i5 = 0; i5 <= 50; i5++) {
                            float[] fArr2 = this.f4248;
                            c21283.m48457(i5 / 50, fArr2);
                            this.f4237.moveTo(fArr2[0], fArr2[1]);
                            this.f4237.lineTo(fArr2[2], fArr2[3]);
                            this.f4237.lineTo(fArr2[4], fArr2[5]);
                            this.f4237.lineTo(fArr2[6], fArr2[7]);
                            this.f4237.close();
                        }
                        paint.setColor(1140850688);
                        canvas.translate(2.0f, 2.0f);
                        canvas.drawPath(this.f4237, paint);
                        canvas.translate(-2.0f, -2.0f);
                        paint.setColor(-65536);
                        canvas.drawPath(this.f4237, paint);
                    }
                }
            }
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4239(Canvas canvas, int i, int i2, C21283 c21283) {
        int width;
        int height;
        Paint paint = this.f4241;
        int[] iArr = this.f4235;
        int i3 = 1;
        if (i == 4) {
            boolean z = false;
            boolean z2 = false;
            for (int i4 = 0; i4 < this.f4238; i4++) {
                int i5 = iArr[i4];
                if (i5 == 1) {
                    z = true;
                }
                if (i5 == 2) {
                    z2 = true;
                }
            }
            if (z) {
                float[] fArr = this.f4239;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
            }
            if (z2) {
                m4223(canvas);
            }
        }
        if (i == 2) {
            float[] fArr2 = this.f4239;
            canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], paint);
        }
        if (i == 3) {
            m4223(canvas);
        }
        canvas.drawLines(this.f4239, this.f4245);
        View view = c21283.f67855;
        if (view != null) {
            width = view.getWidth();
            height = c21283.f67855.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i6 = 4;
        int i7 = 1;
        while (i7 < i2 - 1) {
            if (i != i6 || iArr[i7 - 1] != 0) {
                int i8 = i7 * 2;
                float[] fArr3 = this.f4247;
                float f = fArr3[i8];
                float f2 = fArr3[i8 + i3];
                this.f4237.reset();
                this.f4237.moveTo(f, f2 + 10.0f);
                this.f4237.lineTo(f + 10.0f, f2);
                this.f4237.lineTo(f, f2 - 10.0f);
                this.f4237.lineTo(f - 10.0f, f2);
                this.f4237.close();
                int i9 = i7 - 1;
                c21283.m48458(i9);
                Paint paint2 = this.f4246;
                if (i == i6) {
                    int i10 = iArr[i9];
                    if (i10 == i3) {
                        m4237(canvas, f - 0.0f, f2 - 0.0f);
                    } else if (i10 == 2) {
                        m4224(canvas, f - 0.0f, f2 - 0.0f);
                    } else {
                        if (i10 == 3) {
                            m4225(canvas, f - 0.0f, f2 - 0.0f, width, height);
                        }
                        canvas.drawPath(this.f4237, paint2);
                    }
                    canvas.drawPath(this.f4237, paint2);
                } else {
                    paint2 = paint2;
                    f2 = f2;
                    f = f;
                }
                if (i == 2) {
                    m4237(canvas, f - 0.0f, f2 - 0.0f);
                }
                if (i == 3) {
                    m4224(canvas, f - 0.0f, f2 - 0.0f);
                }
                if (i == 6) {
                    m4225(canvas, f - 0.0f, f2 - 0.0f, width, height);
                }
                canvas.drawPath(this.f4237, paint2);
            }
            i7++;
            i6 = 4;
            i3 = 1;
        }
        float[] fArr4 = this.f4239;
        if (fArr4.length > 1) {
            float f3 = fArr4[0];
            float f4 = fArr4[1];
            Paint paint3 = this.f4240;
            canvas.drawCircle(f3, f4, 8.0f, paint3);
            float[] fArr5 = this.f4239;
            canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m4237(Canvas canvas, float f, float f2) {
        float[] fArr = this.f4239;
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
        Paint paint = this.f4244;
        Rect rect = this.f4236;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (rect.width() / 2), -20.0f, paint);
        canvas.drawLine(f, f2, f10, f11, this.f4241);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4223(Canvas canvas) {
        float[] fArr = this.f4239;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        float fMin = Math.min(f, f3);
        float fMax = Math.max(f2, f4);
        float fMax2 = Math.max(f, f3);
        float fMax3 = Math.max(f2, f4);
        Paint paint = this.f4241;
        canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4224(Canvas canvas, float f, float f2) {
        float[] fArr = this.f4239;
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
        Paint paint = this.f4244;
        Rect rect = this.f4236;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f2 - 20.0f, paint);
        float fMin3 = Math.min(f3, f5);
        Paint paint2 = this.f4241;
        canvas.drawLine(f, f2, fMin3, f2, paint2);
        String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4225(Canvas canvas, float f, float f2, int i, int i2) {
        StringBuilder sb = new StringBuilder("");
        C21855 c21855 = this.f4242;
        sb.append(((int) (((double) (((f - (i / 2)) * 100.0f) / (c21855.getWidth() - i))) + 0.5d)) / 100.0f);
        String string = sb.toString();
        int length = string.length();
        Paint paint = this.f4244;
        Rect rect = this.f4236;
        paint.getTextBounds(string, 0, length, rect);
        canvas.drawText(string, ((f / 2.0f) - (rect.width() / 2)) + 0.0f, f2 - 20.0f, paint);
        float fMin = Math.min(0.0f, 1.0f);
        Paint paint2 = this.f4241;
        canvas.drawLine(f, f2, fMin, f2, paint2);
        String str = "" + (((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (c21855.getHeight() - i2))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, f + 5.0f, 0.0f - ((f2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), paint2);
    }
}
