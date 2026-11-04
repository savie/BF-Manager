package l;

/* JADX INFO: renamed from: l.ۧ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11634 implements InterfaceC22024 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f36478;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f36479;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4586 f36477 = new C4586();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f36480 = -9223372036854775807L;

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo14382(long j) {
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14381(int i, C21287 c21287) {
        c21287.m48503(i);
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14385(C21287 c21287, int i, int i2) {
        c21287.m48503(i);
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14384(C15648 c15648) {
        this.f36478 = true;
        this.f36477.getClass();
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final int mo14380(InterfaceC9461 interfaceC9461, int i, boolean z) {
        return this.f36477.mo14386(interfaceC9461, i, z);
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ᩷ */
    public final int mo14386(InterfaceC9461 interfaceC9461, int i, boolean z) {
        return this.f36477.mo14386(interfaceC9461, i, z);
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14383(long j, int i, int i2, int i3, C4870 c4870) {
        if (this.f36480 != -9223372036854775807L) {
            if (c4870 == null) {
                this.f36479 = true;
            }
        } else {
            if (c4870 != null || (i & 1) == 0) {
                return;
            }
            this.f36480 = j;
        }
    }
}
