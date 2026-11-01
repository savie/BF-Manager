package l;

/* JADX INFO: renamed from: l.֫᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68HB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2032 implements InterfaceC19363 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f7578;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f7579;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f7580;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f7581;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f7582;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f7584;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC15440 f7585;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f7586;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C6694 f7587;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f7589;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11634 f7588 = new C11634(new byte[10], 10);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f7583 = 0;

    public C2032(InterfaceC15440 interfaceC15440) {
        this.f7585 = interfaceC15440;
    }

    @Override // l.InterfaceC19363
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6528(C6694 c6694, InterfaceC15690 interfaceC15690, C8074 c8074) {
        this.f7587 = c6694;
        this.f7585.mo2890(interfaceC15690, c8074);
    }

    @Override // l.InterfaceC19363
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6526() {
        this.f7583 = 0;
        this.f7581 = 0;
        this.f7580 = false;
        this.f7585.mo2887();
    }

    @Override // l.InterfaceC19363
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6527(int i, C2460 c2460) {
        C2023.m6508(this.f7587);
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        InterfaceC15440 interfaceC15440 = this.f7585;
        if (i2 != 0) {
            int i5 = this.f7583;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    C0303.m1848("Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f7582 != -1) {
                        C0303.m1848("Unexpected start indicator: expected " + this.f7582 + " more bytes");
                    }
                    interfaceC15440.mo2891(c2460.m7509() == 0);
                }
            }
            this.f7583 = 1;
            this.f7581 = 0;
        }
        while (c2460.m7503() > 0) {
            int i6 = this.f7583;
            if (i6 != 0) {
                C11634 c11634 = this.f7588;
                if (i6 != 1) {
                    if (i6 == i4) {
                        if (m6524(c2460, c11634.f39082, Math.min(10, this.f7579)) && m6524(c2460, (byte[]) null, this.f7579)) {
                            c11634.m29029(0);
                            this.f7589 = -9223372036854775807L;
                            if (this.f7578) {
                                c11634.m29034(4);
                                long jM29039 = ((long) c11634.m29039(3)) << 30;
                                c11634.m29034(1);
                                long jM290310 = jM29039 | ((long) (c11634.m29039(15) << 15));
                                c11634.m29034(1);
                                long jM290311 = jM290310 | ((long) c11634.m29039(15));
                                c11634.m29034(1);
                                if (!this.f7580 && this.f7584) {
                                    c11634.m29034(4);
                                    long jM290312 = ((long) c11634.m29039(3)) << 30;
                                    c11634.m29034(1);
                                    long jM290313 = jM290312 | ((long) (c11634.m29039(15) << 15));
                                    c11634.m29034(1);
                                    long jM290314 = jM290313 | ((long) c11634.m29039(15));
                                    c11634.m29034(1);
                                    this.f7587.m18077(jM290314);
                                    this.f7580 = true;
                                }
                                this.f7589 = this.f7587.m18077(jM290311);
                            }
                            i |= this.f7586 ? 4 : 0;
                            interfaceC15440.mo2888(i, this.f7589);
                            this.f7583 = 3;
                            this.f7581 = 0;
                        }
                    } else {
                        if (i6 != 3) {
                            throw new IllegalStateException();
                        }
                        int iM7503 = c2460.m7503();
                        int i7 = this.f7582;
                        int i8 = i7 == i3 ? 0 : iM7503 - i7;
                        if (i8 > 0) {
                            iM7503 -= i8;
                            c2460.m7501(c2460.m7500() + iM7503);
                        }
                        interfaceC15440.mo2889(c2460);
                        int i9 = this.f7582;
                        if (i9 != i3) {
                            int i10 = i9 - iM7503;
                            this.f7582 = i10;
                            if (i10 == 0) {
                                interfaceC15440.mo2891(false);
                                this.f7583 = 1;
                                this.f7581 = 0;
                            }
                        }
                    }
                } else if (m6524(c2460, c11634.f39082, 9)) {
                    this.f7583 = m6525() ? 2 : 0;
                    this.f7581 = 0;
                }
            } else {
                c2460.m7535(c2460.m7503());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6529(boolean z) {
        return this.f7583 == 3 && this.f7582 == -1 && !(z && (this.f7585 instanceof C18261)) && (!z || m6525());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m6524(C2460 c2460, byte[] bArr, int i) {
        int iMin = Math.min(c2460.m7503(), i - this.f7581);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c2460.m7535(iMin);
        } else {
            c2460.m7507(this.f7581, iMin, bArr);
        }
        int i2 = this.f7581 + iMin;
        this.f7581 = i2;
        return i2 == i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m6525() {
        C11634 c11634 = this.f7588;
        c11634.m29029(0);
        int iM29039 = c11634.m29039(24);
        if (iM29039 != 1) {
            C7309.m19506(iM29039, "Unexpected start code prefix: ");
            this.f7582 = -1;
            return false;
        }
        c11634.m29034(8);
        int iM290310 = c11634.m29039(16);
        c11634.m29034(5);
        this.f7586 = c11634.m29035();
        c11634.m29034(2);
        this.f7578 = c11634.m29035();
        this.f7584 = c11634.m29035();
        c11634.m29034(6);
        int iM290311 = c11634.m29039(8);
        this.f7579 = iM290311;
        if (iM290310 == 0) {
            this.f7582 = -1;
            return true;
        }
        int i = (iM290310 - 3) - iM290311;
        this.f7582 = i;
        if (i < 0) {
            C0303.m1848("Found negative packet payload size: " + this.f7582);
            this.f7582 = -1;
        }
        return true;
    }
}
