package l;

/* JADX INFO: renamed from: l.ۖᩴۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 951O */
/* JADX INFO: loaded from: classes3.dex */
public final class C2862 implements InterfaceC3939 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8828 f9436;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9437;

    public C2862(C8828 c8828, int i) {
        this.f9436 = c8828;
        this.f9437 = i;
    }

    @Override // l.InterfaceC3939
    public final int getKey() {
        C8828 c8828 = this.f9436;
        return c8828.f28888.f62313.m55818().mo8725((this.f9437 * 4) + c8828.f28888.f62315 + 4);
    }

    @Override // l.InterfaceC3939
    public final int getOffset() {
        C7337 c7337 = this.f9436.f28888;
        return c7337.f62313.m55818().mo8725((this.f9437 * 4) + (c7337.f24154 * 4) + c7337.f62315 + 4);
    }
}
