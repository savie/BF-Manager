package l;

/* JADX INFO: renamed from: l.۟ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAFC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7452 implements InterfaceC21563 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20858 f24836;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11748 f24837;

    public C7452(C20858 c20858, C11748 c11748) {
        this.f24836 = c20858;
        this.f24837 = c11748;
    }

    @Override // l.InterfaceC21563
    /* JADX INFO: renamed from: ۙ */
    public final Object mo16392(C11748 c11748) {
        C11748 c11749 = this.f24837;
        boolean zM29356 = c11748.m29356(c11749);
        C20858 c20858M46890 = this.f24836;
        if (!zM29356) {
            C20858.f67777.mo12134(c11748.m29355(), "Re-routing the connection to host {}");
            c20858M46890 = c20858M46890.m46890(c11748);
        }
        if (c11748.m29359(c11749)) {
            return null;
        }
        return c20858M46890.m46891(c11748.m29357());
    }
}
