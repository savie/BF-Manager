package l;

/* JADX INFO: renamed from: l.ܽۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K8M4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17526 implements InterfaceC4848 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4848 f56973;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f56974;

    public C17526(InterfaceC4848 interfaceC4848, long j) {
        this.f56973 = interfaceC4848;
        this.f56974 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC4848 m41143() {
        return this.f56973;
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo14092() {
        return this.f56973.mo14092();
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public final void mo14091() {
        this.f56973.mo14091();
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public final int mo14090(C16461 c16461, C5690 c5690, int i) {
        int iMo14090 = this.f56973.mo14090(c16461, c5690, i);
        if (iMo14090 == -4) {
            c5690.f19652 += this.f56974;
        }
        return iMo14090;
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public final int mo14089(long j) {
        return this.f56973.mo14089(j - this.f56974);
    }
}
