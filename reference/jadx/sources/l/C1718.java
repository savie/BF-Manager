package l;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.֫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1CY */
/* JADX INFO: loaded from: classes3.dex */
public final class C1718 extends AbstractC21109 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float[] f5874;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public SparseArray f5875;

    public C1718() {
        throw null;
    }

    @Override // l.AbstractC21109
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6086(int i) {
        SparseArray sparseArray = this.f5875;
        int size = sparseArray.size();
        int iM36844 = ((C15380) sparseArray.valueAt(0)).m36844();
        double[] dArr = new double[size];
        this.f5874 = new float[iM36844];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iM36844);
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            C15380 c15380 = (C15380) sparseArray.valueAt(i2);
            dArr[i2] = ((double) iKeyAt) * 0.01d;
            c15380.m36843(this.f5874);
            int i3 = 0;
            while (true) {
                float[] fArr = this.f5874;
                if (i3 < fArr.length) {
                    dArr2[i2][i3] = fArr[i3];
                    i3++;
                }
            }
        }
        this.f67424 = AbstractC3624.m11757(i, dArr, dArr2);
    }

    @Override // l.AbstractC21109
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6084(float f, int i) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }

    @Override // l.AbstractC21109
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6085(float f, View view) {
        this.f67424.mo11774(f, this.f5874);
        ((C15380) this.f5875.valueAt(0)).m36841(view, this.f5874);
    }
}
