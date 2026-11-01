package l;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1CY */
/* JADX INFO: loaded from: classes4.dex */
public final class C13747 extends AbstractC8102 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float[] f45314;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public SparseArray f45315;

    public C13747() {
        throw null;
    }

    @Override // l.AbstractC8102
    /* JADX INFO: renamed from: ۙ */
    public final void mo21318(int i) {
        SparseArray sparseArray = this.f45315;
        int size = sparseArray.size();
        int iM24931 = ((C9824) sparseArray.valueAt(0)).m24931();
        double[] dArr = new double[size];
        this.f45314 = new float[iM24931];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iM24931);
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            C9824 c9824 = (C9824) sparseArray.valueAt(i2);
            dArr[i2] = ((double) iKeyAt) * 0.01d;
            c9824.m24930(this.f45314);
            int i3 = 0;
            while (true) {
                float[] fArr = this.f45314;
                if (i3 < fArr.length) {
                    dArr2[i2][i3] = fArr[i3];
                    i3++;
                }
            }
        }
        this.f28377 = AbstractC4136.m11763(i, dArr, dArr2);
    }

    @Override // l.AbstractC8102
    /* JADX INFO: renamed from: ۙ */
    public final void mo21317(float f, int i) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }

    @Override // l.AbstractC8102
    /* JADX INFO: renamed from: ۙ */
    public final void mo3906(float f, View view) {
        this.f28377.mo4690(f, this.f45314);
        ((C9824) this.f45315.valueAt(0)).m24928(view, this.f45314);
    }
}
