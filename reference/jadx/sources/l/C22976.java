package l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.᩸ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78R7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22976 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f74613;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23108 f74614;

    public C22976(C23108 c23108, SparseArray sparseArray) {
        this.f74614 = c23108;
        SparseArray sparseArray2 = new SparseArray(c23108.m52010());
        for (int i = 0; i < c23108.m52010(); i++) {
            int iM52013 = c23108.m52013(i);
            C11041 c11041 = (C11041) sparseArray.get(iM52013);
            c11041.getClass();
            sparseArray2.append(iM52013, c11041);
        }
        this.f74613 = sparseArray2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11041 m51851(int i) {
        C11041 c11041 = (C11041) this.f74613.get(i);
        c11041.getClass();
        return c11041;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51850(int i) {
        return this.f74614.m52011(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51849() {
        return this.f74614.m52010();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m51852(int i) {
        return this.f74614.m52013(i);
    }
}
