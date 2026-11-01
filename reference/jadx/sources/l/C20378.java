package l;

/* JADX INFO: renamed from: l.᩶᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8HW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20378 implements InterfaceC15440 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f66050;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f66051 = new C2460(10);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f66052 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f66053;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f66054;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f66055;

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2887() {
        this.f66055 = false;
        this.f66052 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2890(InterfaceC15690 interfaceC15690, C8074 c8074) {
        c8074.m21286();
        InterfaceC8011 interfaceC8011Mo7684 = interfaceC15690.mo7684(c8074.m21287(), 5);
        this.f66054 = interfaceC8011Mo7684;
        C10471 c10471 = new C10471();
        c10471.m26516(c8074.m21288());
        c10471.m26521("video/mp2t");
        c10471.m26533("application/id3");
        interfaceC8011Mo7684.mo8116(c10471.m26497());
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2888(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f66055 = true;
        this.f66052 = j;
        this.f66050 = 0;
        this.f66053 = 0;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2889(C2460 c2460) {
        C2023.m6508(this.f66054);
        if (this.f66055) {
            int iM7503 = c2460.m7503();
            int i = this.f66053;
            if (i < 10) {
                int iMin = Math.min(iM7503, 10 - i);
                byte[] bArrM7518 = c2460.m7518();
                int iM7500 = c2460.m7500();
                C2460 c2461 = this.f66051;
                System.arraycopy(bArrM7518, iM7500, c2461.m7518(), this.f66053, iMin);
                if (this.f66053 + iMin == 10) {
                    c2461.m7510(0);
                    if (73 != c2461.m7516() || 68 != c2461.m7516() || 51 != c2461.m7516()) {
                        C0303.m1848("Discarding invalid ID3 tag");
                        this.f66055 = false;
                        return;
                    } else {
                        c2461.m7535(3);
                        this.f66050 = c2461.m7515() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iM7503, this.f66050 - this.f66053);
            this.f66054.mo8112(iMin2, c2460);
            this.f66053 += iMin2;
        }
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2891(boolean z) {
        int i;
        C2023.m6508(this.f66054);
        if (this.f66055 && (i = this.f66050) != 0 && this.f66053 == i) {
            C2023.m6510(this.f66052 != -9223372036854775807L);
            this.f66054.mo8114(this.f66052, 1, this.f66050, 0, null);
            this.f66055 = false;
        }
    }
}
