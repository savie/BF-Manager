package l;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: V1D4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f35295;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f35296;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f35297;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC3624 f35300;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f35298 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int[] f35299 = new int[10];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float[][] f35294 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float[] f35303 = new float[3];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f35301 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f35302 = Float.NaN;

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo1701(float f, long j, View view, C10335 c10335);

    public final String toString() {
        String string = this.f35296;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f35295; i++) {
            StringBuilder sbM10405 = C3188.m10405(string, "[");
            sbM10405.append(this.f35299[i]);
            sbM10405.append(" , ");
            sbM10405.append(decimalFormat.format(this.f35294[i]));
            sbM10405.append("] ");
            string = sbM10405.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28198(String str) {
        this.f35296 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m28197(float f, long j, View view, C10335 c10335) {
        float[] fArr = this.f35303;
        this.f35300.mo11774(f, fArr);
        boolean z = true;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.f35301 = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f35302)) {
            float fM26600 = c10335.m26600(view, this.f35296);
            this.f35302 = fM26600;
            if (Float.isNaN(fM26600)) {
                this.f35302 = 0.0f;
            }
        }
        float f3 = (float) (((((j - this.f35297) * 1.0E-9d) * ((double) f2)) + ((double) this.f35302)) % 1.0d);
        this.f35302 = f3;
        String str = this.f35296;
        HashMap map = c10335.f32936;
        if (!map.containsKey(view)) {
            HashMap map2 = new HashMap();
            map2.put(str, new float[]{f3});
            map.put(view, map2);
        } else {
            HashMap map3 = (HashMap) map.get(view);
            if (!map3.containsKey(str)) {
                map3.put(str, new float[]{f3});
                map.put(view, map3);
            } else {
                float[] fArrCopyOf = (float[]) map3.get(str);
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f3;
                map3.put(str, fArrCopyOf);
            }
        }
        this.f35297 = j;
        float f4 = fArr[0];
        float fM28196 = (m28196(this.f35302) * f4) + fArr[2];
        if (f4 == 0.0f && f2 == 0.0f) {
            z = false;
        }
        this.f35301 = z;
        return fM28196;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m28196(float f) {
        float fAbs;
        switch (this.f35298) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                fAbs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
        return 1.0f - fAbs;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo1699(float f, float f2, float f3, int i, int i2) {
        int i3 = this.f35295;
        this.f35299[i3] = i;
        float[] fArr = this.f35294[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f35298 = Math.max(this.f35298, i2);
        this.f35295++;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo1700(int i) {
        float[][] fArr;
        int i2 = this.f35295;
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.f35299;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (true) {
            fArr = this.f35294;
            if (i3 <= 0) {
                break;
            }
            int i4 = i3 - 1;
            int i5 = iArr2[i4];
            int i6 = i3 - 2;
            int i7 = iArr2[i6];
            if (i5 < i7) {
                int i8 = iArr[i7];
                int i9 = i5;
                int i10 = i9;
                while (i9 < i7) {
                    int i11 = iArr[i9];
                    if (i11 <= i8) {
                        int i12 = iArr[i10];
                        iArr[i10] = i11;
                        iArr[i9] = i12;
                        float[] fArr2 = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = fArr2;
                        i10++;
                    }
                    i9++;
                }
                int i13 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i13;
                float[] fArr3 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = fArr3;
                iArr2[i6] = i10 - 1;
                iArr2[i4] = i5;
                int i14 = i3 + 1;
                iArr2[i3] = i7;
                i3 += 2;
                iArr2[i14] = i10 + 1;
            } else {
                i3 = i6;
            }
        }
        int i15 = 0;
        for (int i16 = 1; i16 < iArr.length; i16++) {
            if (iArr[i16] != iArr[i16 - 1]) {
                i15++;
            }
        }
        if (i15 == 0) {
            i15 = 1;
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i15, 3);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f35295; i18++) {
            if (i18 <= 0 || iArr[i18] != iArr[i18 - 1]) {
                dArr[i17] = ((double) iArr[i18]) * 0.01d;
                double[] dArr3 = dArr2[i17];
                float[] fArr4 = fArr[i18];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i17++;
            }
        }
        this.f35300 = AbstractC3624.m11757(i, dArr, dArr2);
    }
}
