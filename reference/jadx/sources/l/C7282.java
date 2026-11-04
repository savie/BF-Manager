package l;

/* JADX INFO: renamed from: l.ۜܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C8R0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7282 implements InterfaceC22901 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C15772 f23984;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23232 f23986;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f23983 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f23985 = -1;

    public C7282(C23232 c23232, C15772 c15772) {
        this.f23986 = c23232;
        this.f23984 = c15772;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19925(long j) {
        this.f23983 = j;
    }

    @Override // l.InterfaceC22901
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo19922(InterfaceC19502 interfaceC19502) {
        long j = this.f23985;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.f23985 = -1L;
        return j2;
    }

    @Override // l.InterfaceC22901
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19924(long j) {
        long[] jArr = this.f23984.f51350;
        this.f23985 = jArr[C7116.m19505(jArr, j, true)];
    }

    @Override // l.InterfaceC22901
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9060 mo19923() {
        C20782.m47568(this.f23983 != -1);
        return new C17264(this.f23986, this.f23983);
    }
}
