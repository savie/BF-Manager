package l;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1CY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8102 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f28373;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f28374;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC4136 f28377;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f28376 = new int[10];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float[] f28375 = new float[10];

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3906(float f, View view);

    public final String toString() {
        String string = this.f28373;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f28374; i++) {
            StringBuilder sbM8976 = C3012.m8976(string, "[");
            sbM8976.append(this.f28376[i]);
            sbM8976.append(" , ");
            sbM8976.append(decimalFormat.format(this.f28375[i]));
            sbM8976.append("] ");
            string = sbM8976.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21319(String str) {
        this.f28373 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m21316(float f) {
        return (float) this.f28377.mo4688(f);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m21320(float f) {
        return (float) this.f28377.mo4692(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo21317(float f, int i) {
        int[] iArr = this.f28376;
        if (iArr.length < this.f28374 + 1) {
            this.f28376 = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f28375;
            this.f28375 = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f28376;
        int i2 = this.f28374;
        iArr2[i2] = i;
        this.f28375[i2] = f;
        this.f28374 = i2 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo21318(int i) {
        int i2 = this.f28374;
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.f28376;
        float[] fArr = this.f28375;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (i3 > 0) {
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
                        float f = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = f;
                        i10++;
                    }
                    i9++;
                }
                int i13 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i13;
                float f2 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = f2;
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
        int i15 = 1;
        for (int i16 = 1; i16 < this.f28374; i16++) {
            int[] iArr3 = this.f28376;
            if (iArr3[i16 - 1] != iArr3[i16]) {
                i15++;
            }
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i15, 1);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f28374; i18++) {
            if (i18 > 0) {
                int[] iArr4 = this.f28376;
                if (iArr4[i18] != iArr4[i18 - 1]) {
                    dArr[i17] = ((double) this.f28376[i18]) * 0.01d;
                    dArr2[i17][0] = this.f28375[i18];
                    i17++;
                }
            } else {
                dArr[i17] = ((double) this.f28376[i18]) * 0.01d;
                dArr2[i17][0] = this.f28375[i18];
                i17++;
            }
        }
        this.f28377 = AbstractC4136.m11763(i, dArr, dArr2);
    }
}
