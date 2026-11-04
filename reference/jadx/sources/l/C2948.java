package l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.ۖ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: LB1M */
/* JADX INFO: loaded from: classes2.dex */
public final class C2948 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f9632;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C5098 f9633;

    public C2948() {
        this(1);
    }

    public C2948(int i) {
        this.f9632 = new SparseArray(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2948 m9643(int i) {
        SparseArray sparseArray = this.f9632;
        if (sparseArray == null) {
            return null;
        }
        return (C2948) sparseArray.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5098 m9644() {
        return this.f9633;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9645(C5098 c5098, int i, int i2) {
        C2948 c2948M9643 = m9643(c5098.m15411(i));
        if (c2948M9643 == null) {
            c2948M9643 = new C2948();
            this.f9632.put(c5098.m15411(i), c2948M9643);
        }
        if (i2 > i) {
            c2948M9643.m9645(c5098, i + 1, i2);
        } else {
            c2948M9643.f9633 = c5098;
        }
    }
}
