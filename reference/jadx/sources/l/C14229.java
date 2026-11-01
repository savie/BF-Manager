package l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.ܳۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: LB1M */
/* JADX INFO: loaded from: classes3.dex */
public final class C14229 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f46620;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4432 f46621;

    public C14229() {
        this(1);
    }

    public C14229(int i) {
        this.f46620 = new SparseArray(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14229 m34332(int i) {
        SparseArray sparseArray = this.f46620;
        if (sparseArray == null) {
            return null;
        }
        return (C14229) sparseArray.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4432 m34331() {
        return this.f46621;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34333(C4432 c4432, int i, int i2) {
        C14229 c14229M34332 = m34332(c4432.m12369(i));
        if (c14229M34332 == null) {
            c14229M34332 = new C14229();
            this.f46620.put(c4432.m12369(i), c14229M34332);
        }
        if (i2 > i) {
            c14229M34332.m34333(c4432, i + 1, i2);
        } else {
            c14229M34332.f46621 = c4432;
        }
    }
}
