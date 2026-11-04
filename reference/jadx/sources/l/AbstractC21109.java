package l;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1CY */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21109 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f67421;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f67422 = new int[10];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float[] f67423 = new float[10];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC3624 f67424;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f67425;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6085(float f, View view);

    public final String toString() {
        String string = this.f67425;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f67421; i++) {
            StringBuilder sbM10405 = C3188.m10405(string, "[");
            sbM10405.append(this.f67422[i]);
            sbM10405.append(" , ");
            sbM10405.append(decimalFormat.format(this.f67423[i]));
            sbM10405.append("] ");
            string = sbM10405.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48194(String str) {
        this.f67425 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m48193(float f) {
        return (float) this.f67424.mo11772(f);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m48195(float f) {
        return (float) this.f67424.mo11776(f);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo6084(float f, int i) {
        int[] iArr = this.f67422;
        if (iArr.length < this.f67421 + 1) {
            this.f67422 = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f67423;
            this.f67423 = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f67422;
        int i2 = this.f67421;
        iArr2[i2] = i;
        this.f67423[i2] = f;
        this.f67421 = i2 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX INFO: renamed from: ۙ */
    public void mo6086(int i) {
        int i2 = this.f67421;
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.f67422;
        float[] fArr = this.f67423;
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
        for (int i16 = 1; i16 < this.f67421; i16++) {
            int[] iArr3 = this.f67422;
            if (iArr3[i16 - 1] != iArr3[i16]) {
                i15++;
            }
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i15, 1);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f67421; i18++) {
            if (i18 > 0) {
                int[] iArr4 = this.f67422;
                if (iArr4[i18] != iArr4[i18 - 1]) {
                    dArr[i17] = ((double) this.f67422[i18]) * 0.01d;
                    dArr2[i17][0] = this.f67423[i18];
                    i17++;
                }
            } else {
                dArr[i17] = ((double) this.f67422[i18]) * 0.01d;
                dArr2[i17][0] = this.f67423[i18];
                i17++;
            }
        }
        this.f67424 = AbstractC3624.m11757(i, dArr, dArr2);
    }
}
