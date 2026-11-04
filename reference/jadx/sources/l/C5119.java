package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۙ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7KC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5119 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f17828;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22273 f17829;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9002 f17830;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object[] f17831;

    public C5119(C22273 c22273, C9002 c9002, int[] iArr) {
        this.f17829 = c22273;
        this.f17828 = iArr;
        this.f17831 = new Object[iArr.length];
        this.f17830 = c9002;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m15478(int i) {
        int[] iArr = this.f17828;
        if (i <= 0 || i >= iArr.length) {
            C22273 c22273 = this.f17829;
            throw c22273.f72134.m28121("bad.const.pool.index", c22273.f72134.f35182, Integer.valueOf(i), Integer.valueOf(iArr.length));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15479(int i) {
        m15478(i);
        return this.f17828[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m15480(BitSet bitSet, int i) {
        m15478(i);
        Object[] objArr = this.f17831;
        Object obj = objArr[i];
        if (obj != null) {
            return obj;
        }
        boolean z = bitSet.get(m15481(i));
        C22273 c22273 = this.f17829;
        if (!z) {
            throw c22273.f72134.m28121("unexpected.const.pool.tag.at", Integer.valueOf(m15481(i)), Integer.valueOf(m15479(i)));
        }
        Object objM50333 = C22273.m50333(c22273, this.f17830, m15481(i), m15479(i));
        objArr[i] = objM50333;
        return objM50333;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m15481(int i) {
        return this.f17830.f29317[m15479(i) - 1];
    }
}
