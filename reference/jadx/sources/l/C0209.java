package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.֡ۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BES */
/* JADX INFO: loaded from: classes2.dex */
public final class C0209 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C4234 f1372;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7265 f1373;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C8469 f1374;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C4940 f1375;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12205 f1376;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1412 f1377;

    public C0209(C1412 c1412, C8469 c8469) {
        if (c1412 == null) {
            throw new NullPointerException("unprocessedInsns == null");
        }
        this.f1377 = c1412;
        this.f1374 = c8469;
        this.f1373 = null;
        this.f1372 = null;
        this.f1375 = null;
        this.f1376 = null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m1557() {
        if (this.f1376 != null) {
            return;
        }
        C12205 c12205M4932 = this.f1377.m4932();
        this.f1376 = c12205M4932;
        this.f1372 = C4234.m11884(c12205M4932);
        C12205 c12205 = this.f1376;
        C4940 c4940 = C4940.f17274;
        int size = c12205.size();
        C3031 c3031 = new C3031(size);
        for (int i = 0; i < size; i++) {
            AbstractC16438 abstractC16438M15276get = c12205.m15276get(i);
            if (abstractC16438M15276get instanceof C14114) {
                c3031.m9045(abstractC16438M15276get.m38698(), ((C14114) abstractC16438M15276get).m34152());
            } else if (abstractC16438M15276get instanceof C11997) {
                c3031.m9044(abstractC16438M15276get.m38698(), ((C11997) abstractC16438M15276get).m29884());
            }
        }
        this.f1375 = c3031.m9042();
        this.f1373 = this.f1374.m22120();
        this.f1377 = null;
        this.f1374 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1562(InterfaceC19966 interfaceC19966) {
        this.f1377.m4935(interfaceC19966);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m1560() {
        return this.f1377.m4931();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m1565() {
        return this.f1377.m4938();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m1558() {
        return this.f1374.m22121();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet m1561() {
        return this.f1374.m22122();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashSet m1564() {
        return this.f1377.m4939();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12205 m1559() {
        m1557();
        return this.f1376;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7265 m1566() {
        m1557();
        return this.f1373;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4234 m1567() {
        m1557();
        return this.f1372;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4940 m1563() {
        m1557();
        return this.f1375;
    }
}
