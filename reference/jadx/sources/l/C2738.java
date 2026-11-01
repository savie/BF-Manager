package l;

/* JADX INFO: renamed from: l.ۖ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8S4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2738 implements InterfaceC15440 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f10517;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f10518;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f10519;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10520;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11634 f10521;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f10522;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C7648 f10523;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f10524;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f10525;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f10526;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f10527;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f10528;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2460 f10529;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f10530;

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2891(boolean z) {
    }

    public C2738(String str) {
        this(null, 0, str);
    }

    public C2738(String str, int i, String str2) {
        C11634 c11634 = new C11634(new byte[128], 128);
        this.f10521 = c11634;
        this.f10529 = new C2460(c11634.f39082);
        this.f10528 = 0;
        this.f10527 = -9223372036854775807L;
        this.f10517 = str;
        this.f10522 = i;
        this.f10525 = str2;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2887() {
        this.f10528 = 0;
        this.f10520 = 0;
        this.f10524 = false;
        this.f10527 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2890(InterfaceC15690 interfaceC15690, C8074 c8074) {
        c8074.m21286();
        this.f10518 = c8074.m21288();
        this.f10519 = interfaceC15690.mo7684(c8074.m21287(), 1);
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2888(int i, long j) {
        this.f10527 = j;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2889(C2460 c2460) {
        C2023.m6508(this.f10519);
        while (c2460.m7503() > 0) {
            int i = this.f10528;
            C2460 c2461 = this.f10529;
            if (i == 0) {
                while (c2460.m7503() > 0) {
                    if (!this.f10524) {
                        this.f10524 = c2460.m7516() == 11;
                    } else {
                        int iM7516 = c2460.m7516();
                        if (iM7516 == 119) {
                            this.f10524 = false;
                            this.f10528 = 1;
                            c2461.m7518()[0] = 11;
                            c2461.m7518()[1] = 119;
                            this.f10520 = 2;
                            break;
                        }
                        this.f10524 = iM7516 == 11;
                    }
                }
            } else if (i == 1) {
                byte[] bArrM7518 = c2461.m7518();
                int iMin = Math.min(c2460.m7503(), 128 - this.f10520);
                c2460.m7507(this.f10520, iMin, bArrM7518);
                int i2 = this.f10520 + iMin;
                this.f10520 = i2;
                if (i2 == 128) {
                    C11634 c11634 = this.f10521;
                    c11634.m29029(0);
                    C11020 c11020M52241 = C23720.m52241(c11634);
                    int i3 = c11020M52241.f37465;
                    int i4 = c11020M52241.f37469;
                    int i5 = c11020M52241.f37468;
                    String str = c11020M52241.f37464;
                    C7648 c7648 = this.f10523;
                    if (c7648 == null || i5 != c7648.f25249 || i4 != c7648.f25260 || !C13638.equals(str, c7648.f25265)) {
                        C10471 c10471 = new C10471();
                        c10471.m26516(this.f10518);
                        c10471.m26521(this.f10525);
                        c10471.m26533(str);
                        c10471.m26494(i5);
                        c10471.m26511(i4);
                        c10471.m26509(this.f10517);
                        c10471.m26513(this.f10522);
                        c10471.m26528(i3);
                        if ("audio/ac3".equals(str)) {
                            c10471.m26515(i3);
                        }
                        C7648 c7648M26497 = c10471.m26497();
                        this.f10523 = c7648M26497;
                        this.f10519.mo8116(c7648M26497);
                    }
                    this.f10526 = c11020M52241.f37467;
                    this.f10530 = (((long) c11020M52241.f37466) * 1000000) / ((long) this.f10523.f25260);
                    c2461.m7510(0);
                    this.f10519.mo8112(128, c2461);
                    this.f10528 = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(c2460.m7503(), this.f10526 - this.f10520);
                this.f10519.mo8112(iMin2, c2460);
                int i6 = this.f10520 + iMin2;
                this.f10520 = i6;
                if (i6 == this.f10526) {
                    C2023.m6510(this.f10527 != -9223372036854775807L);
                    this.f10519.mo8114(this.f10527, 1, this.f10526, 0, null);
                    this.f10527 += this.f10530;
                    this.f10528 = 0;
                }
            }
        }
    }
}
