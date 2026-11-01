package l;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1D4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8808 extends AbstractC23625 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float[] f30289;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float[] f30290;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public SparseArray f30291;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public SparseArray f30292;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f30293;

    public C8808() {
        throw null;
    }

    @Override // l.AbstractC23625
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22926(int i) {
        SparseArray sparseArray = this.f30292;
        int size = sparseArray.size();
        int iM24931 = ((C9824) sparseArray.valueAt(0)).m24931();
        double[] dArr = new double[size];
        int i2 = iM24931 + 2;
        this.f30290 = new float[i2];
        this.f30289 = new float[iM24931];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
        for (int i3 = 0; i3 < size; i3++) {
            int iKeyAt = sparseArray.keyAt(i3);
            C9824 c9824 = (C9824) sparseArray.valueAt(i3);
            float[] fArr = (float[]) this.f30291.valueAt(i3);
            dArr[i3] = ((double) iKeyAt) * 0.01d;
            c9824.m24930(this.f30290);
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.f30290;
                if (i4 < fArr2.length) {
                    dArr2[i3][i4] = fArr2[i4];
                    i4++;
                }
            }
            double[] dArr3 = dArr2[i3];
            dArr3[iM24931] = fArr[0];
            dArr3[iM24931 + 1] = fArr[1];
        }
        this.f76542 = AbstractC4136.m11763(i, dArr, dArr2);
    }

    @Override // l.AbstractC23625
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22925(float f, float f2, float f3, int i, int i2) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
    }

    @Override // l.AbstractC23625
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2000(float f, long j, View view, C21070 c21070) {
        this.f76542.mo4690(f, this.f30290);
        float[] fArr = this.f30290;
        float f2 = fArr[fArr.length - 2];
        float f3 = fArr[fArr.length - 1];
        long j2 = j - this.f76539;
        if (Float.isNaN(this.f76541)) {
            float fM47477 = c21070.m47477(view, this.f30293);
            this.f76541 = fM47477;
            if (Float.isNaN(fM47477)) {
                this.f76541 = 0.0f;
            }
        }
        float f4 = (float) ((((j2 * 1.0E-9d) * ((double) f2)) + ((double) this.f76541)) % 1.0d);
        this.f76541 = f4;
        this.f76539 = j;
        float fM52089 = m52089(f4);
        this.f76537 = false;
        int i = 0;
        while (true) {
            float[] fArr2 = this.f30289;
            if (i >= fArr2.length) {
                break;
            }
            boolean z = this.f76537;
            float f5 = this.f30290[i];
            this.f76537 = z | (((double) f5) != 0.0d);
            fArr2[i] = (f5 * fM52089) + f3;
            i++;
        }
        ((C9824) this.f30292.valueAt(0)).m24928(view, this.f30289);
        if (f2 != 0.0f) {
            this.f76537 = true;
        }
        return this.f76537;
    }
}
