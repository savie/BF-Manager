package l;

/* JADX INFO: renamed from: l.᩹᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88JO */
/* JADX INFO: loaded from: classes.dex */
public final class C22495 implements InterfaceC15440 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C2460 f73425;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f73426;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f73427;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f73428;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f73429;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f73430;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C7648 f73431;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f73432;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f73433;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f73434;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f73435;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f73436;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f73437;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11634 f73438;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f73439;

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2891(boolean z) {
    }

    public C22495(String str, int i, String str2) {
        C11634 c11634 = new C11634(new byte[16], 16);
        this.f73438 = c11634;
        this.f73425 = new C2460(c11634.f39082);
        this.f73435 = 0;
        this.f73428 = 0;
        this.f73427 = false;
        this.f73429 = false;
        this.f73436 = -9223372036854775807L;
        this.f73432 = str;
        this.f73439 = i;
        this.f73433 = str2;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2887() {
        this.f73435 = 0;
        this.f73428 = 0;
        this.f73427 = false;
        this.f73429 = false;
        this.f73436 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2890(InterfaceC15690 interfaceC15690, C8074 c8074) {
        c8074.m21286();
        this.f73426 = c8074.m21288();
        this.f73430 = interfaceC15690.mo7684(c8074.m21287(), 1);
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2888(int i, long j) {
        this.f73436 = j;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2889(C2460 c2460) {
        C2023.m6508(this.f73430);
        while (c2460.m7503() > 0) {
            int i = this.f73435;
            C2460 c2461 = this.f73425;
            if (i == 0) {
                while (c2460.m7503() > 0) {
                    if (!this.f73427) {
                        this.f73427 = c2460.m7516() == 172;
                    } else {
                        int iM7516 = c2460.m7516();
                        this.f73427 = iM7516 == 172;
                        if (iM7516 == 64 || iM7516 == 65) {
                            this.f73429 = iM7516 == 65;
                            this.f73435 = 1;
                            c2461.m7518()[0] = -84;
                            c2461.m7518()[1] = (byte) (this.f73429 ? 65 : 64);
                            this.f73428 = 2;
                            break;
                        }
                    }
                }
            } else if (i == 1) {
                byte[] bArrM7518 = c2461.m7518();
                int iMin = Math.min(c2460.m7503(), 16 - this.f73428);
                c2460.m7507(this.f73428, iMin, bArrM7518);
                int i2 = this.f73428 + iMin;
                this.f73428 = i2;
                if (i2 == 16) {
                    C11634 c11634 = this.f73438;
                    c11634.m29029(0);
                    C1846 c1846M24509 = C9609.m24509(c11634);
                    int i3 = c1846M24509.f7058;
                    C7648 c7648 = this.f73431;
                    if (c7648 == null || 2 != c7648.f25249 || i3 != c7648.f25260 || !"audio/ac4".equals(c7648.f25265)) {
                        C10471 c10471 = new C10471();
                        c10471.m26516(this.f73426);
                        c10471.m26521(this.f73433);
                        c10471.m26533("audio/ac4");
                        c10471.m26494(2);
                        c10471.m26511(i3);
                        c10471.m26509(this.f73432);
                        c10471.m26513(this.f73439);
                        C7648 c7648M26497 = c10471.m26497();
                        this.f73431 = c7648M26497;
                        this.f73430.mo8116(c7648M26497);
                    }
                    this.f73437 = c1846M24509.f7057;
                    this.f73434 = (((long) c1846M24509.f7059) * 1000000) / ((long) this.f73431.f25260);
                    c2461.m7510(0);
                    this.f73430.mo8112(16, c2461);
                    this.f73435 = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(c2460.m7503(), this.f73437 - this.f73428);
                this.f73430.mo8112(iMin2, c2460);
                int i4 = this.f73428 + iMin2;
                this.f73428 = i4;
                if (i4 == this.f73437) {
                    C2023.m6510(this.f73436 != -9223372036854775807L);
                    this.f73430.mo8114(this.f73436, 1, this.f73437, 0, null);
                    this.f73436 += this.f73434;
                    this.f73435 = 0;
                }
            }
        }
    }
}
