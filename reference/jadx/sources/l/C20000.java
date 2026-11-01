package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩶ۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: F7KC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20000 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object[] f64016;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f64017;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0243 f64018;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20809 f64019;

    public C20000(C0243 c0243, C20809 c20809, int[] iArr) {
        this.f64018 = c0243;
        this.f64017 = iArr;
        this.f64016 = new Object[iArr.length];
        this.f64019 = c20809;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m45287(int i) {
        int[] iArr = this.f64017;
        if (i <= 0 || i >= iArr.length) {
            C0243 c0243 = this.f64018;
            throw c0243.f1449.m2233("bad.const.pool.index", c0243.f1449.f1975, Integer.valueOf(i), Integer.valueOf(iArr.length));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45288(int i) {
        m45287(i);
        return this.f64017[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m45289(BitSet bitSet, int i) {
        m45287(i);
        Object[] objArr = this.f64016;
        Object obj = objArr[i];
        if (obj != null) {
            return obj;
        }
        boolean z = bitSet.get(m45290(i));
        C0243 c0243 = this.f64018;
        if (!z) {
            throw c0243.f1449.m2233("unexpected.const.pool.tag.at", Integer.valueOf(m45290(i)), Integer.valueOf(m45288(i)));
        }
        Object objM1621 = C0243.m1621(c0243, this.f64019, m45290(i), m45288(i));
        objArr[i] = objM1621;
        return objM1621;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m45290(int i) {
        return this.f64019.f67645[m45288(i) - 1];
    }
}
