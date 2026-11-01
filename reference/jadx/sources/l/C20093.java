package l;

/* JADX INFO: renamed from: l.᩶ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R4MX */
/* JADX INFO: loaded from: classes5.dex */
public final class C20093 extends AbstractC21316 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65271;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0336 f65272;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65273;

    public C20093(C0336 c0336, int i, int i2) {
        this.f65272 = c0336;
        this.f65273 = i;
        this.f65271 = i2;
    }

    @Override // l.AbstractC21316
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3245(int i) {
        C17684 c17684 = this.f65272.f1744;
        return c17684.m41204(c17684.m41166().m42183((i * 2) + this.f65273));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f65271;
    }
}
