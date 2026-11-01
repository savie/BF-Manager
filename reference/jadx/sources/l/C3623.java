package l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.ۘ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7MO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3623 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f13315 = new SparseArray();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6694 m10726(int i) {
        SparseArray sparseArray = this.f13315;
        C6694 c6694 = (C6694) sparseArray.get(i);
        if (c6694 != null) {
            return c6694;
        }
        C6694 c6695 = new C6694(9223372036854775806L);
        sparseArray.put(i, c6695);
        return c6695;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10727() {
        this.f13315.clear();
    }
}
