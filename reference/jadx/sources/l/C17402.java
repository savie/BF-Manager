package l;

/* JADX INFO: renamed from: l.ܿܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7M5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17402 implements InterfaceC13503 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6113 f55382;

    public C17402(C6113 c6113) {
        this.f55382 = c6113;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40548() {
        C6113 c6113 = this.f55382;
        int i = c6113.f20868 - 1;
        c6113.f20868 = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (C5035 c5035 : c6113.f20857) {
            i2 += c5035.m14034().f76614;
        }
        C17216[] c17216Arr = new C17216[i2];
        int i3 = 0;
        for (C5035 c5036 : c6113.f20857) {
            int i4 = c5036.m14034().f76614;
            int i5 = 0;
            while (i5 < i4) {
                c17216Arr[i3] = c5036.m14034().m52136(i5);
                i5++;
                i3++;
            }
        }
        c6113.f20865 = new C23679(c17216Arr);
        c6113.f20860.mo2529((InterfaceC6806) c6113);
    }

    @Override // l.InterfaceC8156
    /* JADX INFO: renamed from: ۙ */
    public final void mo2532(InterfaceC19445 interfaceC19445) {
        C6113 c6113 = this.f55382;
        c6113.f20860.mo2532((InterfaceC19445) c6113);
    }
}
