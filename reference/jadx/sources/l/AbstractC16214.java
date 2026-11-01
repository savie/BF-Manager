package l;

import android.graphics.Color;

/* JADX INFO: renamed from: l.ܺ᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: R12P */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16214 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52328;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f52329;

    /* JADX INFO: renamed from: ۖ */
    public abstract int mo4888();

    public AbstractC16214(int i) {
        this.f52329 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int mo38327() {
        return this.f52329;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo38326() {
        if (C20368.f65997) {
            int i = this.f52328;
            if (i != 0) {
                return i;
            }
            float[] fArr = {0.0f, 0.0f, 0.9f};
            C3224.m9667(mo4888(), fArr);
            int iM9664 = C3224.m9664(fArr);
            double[] dArr = new double[3];
            C3224.m9665(Color.red(iM9664), Color.green(iM9664), Color.blue(iM9664), dArr);
            int iM9659 = C3224.m9659(dArr[1], dArr[2]);
            this.f52328 = iM9659;
            return iM9659;
        }
        return mo4888();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int mo38328() {
        if (C20368.f65997) {
            return mo4888();
        }
        return C20368.m45991() ? -922746881 : -1;
    }
}
