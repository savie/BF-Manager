package l;

import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 77LO */
/* JADX INFO: loaded from: classes3.dex */
public final class C11492 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C16576 f38662 = new C16576();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f38663;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11492 m28677(C12343 c12343) {
        C16576 c16576 = f38662;
        C11492 c11492 = (C11492) c12343.m30656(c16576);
        if (c11492 != null) {
            return c11492;
        }
        C11492 c11493 = new C11492();
        c11493.f38663 = new HashMap();
        c12343.m30659(c16576, c11493);
        return c11493;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4603 m28678(AbstractC0618 abstractC0618) {
        return (C4603) this.f38663.get(abstractC0618);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28680(AbstractC0618 abstractC0618, C4603 c4603) {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4603 m28682(AbstractC0618 abstractC0618) {
        return (C4603) this.f38663.remove(abstractC0618);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Collection m28681() {
        return this.f38663.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28679() {
        this.f38663.clear();
    }
}
