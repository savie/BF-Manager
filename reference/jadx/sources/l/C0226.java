package l;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1D4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0226 extends AbstractC11191 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float[] f1463;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float[] f1464;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public SparseArray f1465;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public SparseArray f1466;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f1467;

    public C0226() {
        throw null;
    }

    @Override // l.AbstractC11191
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1700(int i) {
        SparseArray sparseArray = this.f1465;
        int size = sparseArray.size();
        int iM36844 = ((C15380) sparseArray.valueAt(0)).m36844();
        double[] dArr = new double[size];
        int i2 = iM36844 + 2;
        this.f1463 = new float[i2];
        this.f1464 = new float[iM36844];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
        for (int i3 = 0; i3 < size; i3++) {
            int iKeyAt = sparseArray.keyAt(i3);
            C15380 c15380 = (C15380) sparseArray.valueAt(i3);
            float[] fArr = (float[]) this.f1466.valueAt(i3);
            dArr[i3] = ((double) iKeyAt) * 0.01d;
            c15380.m36843(this.f1463);
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.f1463;
                if (i4 < fArr2.length) {
                    dArr2[i3][i4] = fArr2[i4];
                    i4++;
                }
            }
            double[] dArr3 = dArr2[i3];
            dArr3[iM36844] = fArr[0];
            dArr3[iM36844 + 1] = fArr[1];
        }
        this.f35300 = AbstractC3624.m11757(i, dArr, dArr2);
    }

    @Override // l.AbstractC11191
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1699(float f, float f2, float f3, int i, int i2) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
    }

    @Override // l.AbstractC11191
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo1701(float f, long j, View view, C10335 c10335) {
        this.f35300.mo11774(f, this.f1463);
        float[] fArr = this.f1463;
        float f2 = fArr[fArr.length - 2];
        float f3 = fArr[fArr.length - 1];
        long j2 = j - this.f35297;
        if (Float.isNaN(this.f35302)) {
            float fM26600 = c10335.m26600(view, this.f1467);
            this.f35302 = fM26600;
            if (Float.isNaN(fM26600)) {
                this.f35302 = 0.0f;
            }
        }
        float f4 = (float) ((((j2 * 1.0E-9d) * ((double) f2)) + ((double) this.f35302)) % 1.0d);
        this.f35302 = f4;
        this.f35297 = j;
        float fM28196 = m28196(f4);
        this.f35301 = false;
        int i = 0;
        while (true) {
            float[] fArr2 = this.f1464;
            if (i >= fArr2.length) {
                break;
            }
            boolean z = this.f35301;
            float f5 = this.f1463[i];
            this.f35301 = z | (((double) f5) != 0.0d);
            fArr2[i] = (f5 * fM28196) + f3;
            i++;
        }
        ((C15380) this.f1465.valueAt(0)).m36841(view, this.f1464);
        if (f2 != 0.0f) {
            this.f35301 = true;
        }
        return this.f35301;
    }
}
