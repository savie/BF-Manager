package l;

import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܶ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77LO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16437 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C13477 f53321 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f53322;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16437 m38994(C4747 c4747) {
        C13477 c13477 = f53321;
        C16437 c16437 = (C16437) c4747.m14643(c13477);
        if (c16437 != null) {
            return c16437;
        }
        C16437 c16438 = new C16437();
        c16438.f53322 = new HashMap();
        c4747.m14646(c13477, c16438);
        return c16438;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3168 m38995(AbstractC22970 abstractC22970) {
        return (C3168) this.f53322.get(abstractC22970);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38997(AbstractC22970 abstractC22970, C3168 c3168) {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3168 m38999(AbstractC22970 abstractC22970) {
        return (C3168) this.f53322.remove(abstractC22970);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Collection m38998() {
        return this.f53322.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38996() {
        this.f53322.clear();
    }
}
