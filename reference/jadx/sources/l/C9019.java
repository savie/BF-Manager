package l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.ۡܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9019 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f30818;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9060 f30819;

    public C9019(C9060 c9060, SparseArray sparseArray) {
        this.f30819 = c9060;
        SparseArray sparseArray2 = new SparseArray(c9060.m23393());
        for (int i = 0; i < c9060.m23393(); i++) {
            int iM23396 = c9060.m23396(i);
            C19602 c19602 = (C19602) sparseArray.get(iM23396);
            c19602.getClass();
            sparseArray2.append(iM23396, c19602);
        }
        this.f30818 = sparseArray2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19602 m23349(int i) {
        C19602 c19602 = (C19602) this.f30818.get(i);
        c19602.getClass();
        return c19602;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23348(int i) {
        return this.f30819.m23394(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23347() {
        return this.f30819.m23393();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m23350(int i) {
        return this.f30819.m23396(i);
    }
}
