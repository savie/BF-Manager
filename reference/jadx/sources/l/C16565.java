package l;

/* JADX INFO: renamed from: l.ܽۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C4OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16565 extends AbstractC21316 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53195;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12332 f53196;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53197;

    public C16565(C12332 c12332, int i, int i2) {
        this.f53196 = c12332;
        this.f53197 = i;
        this.f53195 = i2;
    }

    @Override // l.AbstractC21316
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3245(int i) {
        C17684 c17684 = this.f53196.f41221;
        return c17684.m41204(c17684.m41166().m42183((i * 2) + this.f53197));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f53195;
    }
}
