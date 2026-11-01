package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.᩹᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8O5 */
/* JADX INFO: loaded from: classes.dex */
public final class C22600 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f73640;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5666 f73643;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f73644;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C7077 f73646;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f73647;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f73648;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f73649;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f73650;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f73651;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f73652;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C2460 f73642 = new C2460(4);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2460 f73641 = new C2460(9);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2460 f73653 = new C2460(11);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C2460 f73655 = new C2460();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1432 f73654 = new C1432();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f73645 = 1;

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) throws EOFException, InterruptedIOException {
        C2460 c2460 = this.f73642;
        C14984 c14984 = (C14984) interfaceC7222;
        c14984.mo19219(false, 0, 3, c2460.m7518());
        c2460.m7510(0);
        if (c2460.m7525() == 4607062) {
            c14984.mo19219(false, 0, 2, c2460.m7518());
            c2460.m7510(0);
            if ((c2460.m7519() & 250) == 0) {
                c14984.mo19219(false, 0, 4, c2460.m7518());
                c2460.m7510(0);
                int iM7499 = c2460.m7499();
                c14984.mo19217();
                c14984.mo19218(iM7499, false);
                c14984.mo19219(false, 0, 4, c2460.m7518());
                c2460.m7510(0);
                if (c2460.m7499() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f73647 = interfaceC15690;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        if (j == 0) {
            this.f73645 = 1;
            this.f73640 = false;
        } else {
            this.f73645 = 3;
        }
        this.f73649 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0005 A[SYNTHETIC] */
    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) throws C13428 {
        long j;
        boolean zM15549;
        boolean z;
        long j2;
        C2023.m6508(this.f73647);
        while (true) {
            int i = this.f73645;
            if (i == 1) {
                C2460 c2460 = this.f73641;
                if (!interfaceC7222.mo19212(true, 0, 9, c2460.m7518())) {
                    return -1;
                }
                c2460.m7510(0);
                c2460.m7535(4);
                int iM7516 = c2460.m7516();
                boolean z2 = (iM7516 & 4) != 0;
                boolean z3 = (iM7516 & 1) != 0;
                if (z2 && this.f73643 == null) {
                    this.f73643 = new C5666(this.f73647.mo7684(8, 1));
                }
                if (z3 && this.f73646 == null) {
                    this.f73646 = new C7077(this.f73647.mo7684(9, 2));
                }
                this.f73647.mo7696();
                this.f73649 = c2460.m7499() - 5;
                this.f73645 = 2;
            } else if (i == 2) {
                interfaceC7222.mo19214(this.f73649);
                this.f73649 = 0;
                this.f73645 = 3;
            } else if (i == 3) {
                C2460 c2461 = this.f73653;
                if (!interfaceC7222.mo19212(true, 0, 11, c2461.m7518())) {
                    return -1;
                }
                c2461.m7510(0);
                this.f73652 = c2461.m7516();
                this.f73650 = c2461.m7525();
                this.f73651 = c2461.m7525();
                this.f73651 = (((long) (c2461.m7516() << 24)) | this.f73651) * 1000;
                c2461.m7535(3);
                this.f73645 = 4;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                boolean z4 = this.f73640;
                C1432 c1432 = this.f73654;
                if (z4) {
                    j = this.f73644 + this.f73651;
                } else {
                    j = c1432.m5004() == -9223372036854775807L ? 0L : this.f73651;
                }
                int i2 = this.f73652;
                if (i2 != 8 || this.f73643 == null) {
                    if (i2 != 9 || this.f73646 == null) {
                        if (i2 == 18 && !this.f73648) {
                            C2460 c2460M50099 = m50099(interfaceC7222);
                            c1432.getClass();
                            c1432.m5005(j, c2460M50099);
                            long jM5004 = c1432.m5004();
                            if (jM5004 != -9223372036854775807L) {
                                this.f73647.mo7690(new C2365(jM5004, c1432.m5007(), c1432.m5006()));
                                this.f73648 = true;
                            }
                        } else {
                            interfaceC7222.mo19214(this.f73650);
                            zM15549 = false;
                            z = false;
                        }
                        if (!this.f73640 && zM15549) {
                            this.f73640 = true;
                            if (c1432.m5004() == -9223372036854775807L) {
                                j2 = -this.f73651;
                            } else {
                                j2 = 0;
                            }
                            this.f73644 = j2;
                        }
                        this.f73649 = 4;
                        this.f73645 = 2;
                        if (z) {
                            return 0;
                        }
                    } else {
                        if (!this.f73648) {
                            this.f73647.mo7690(new C3776(-9223372036854775807L));
                            this.f73648 = true;
                        }
                        C7077 c7077 = this.f73646;
                        C2460 c2460M500910 = m50099(interfaceC7222);
                        if (c7077.m18952(c2460M500910) && c7077.m18951(j, c2460M500910)) {
                            zM15549 = true;
                        }
                    }
                    zM15549 = false;
                } else {
                    if (!this.f73648) {
                        this.f73647.mo7690(new C3776(-9223372036854775807L));
                        this.f73648 = true;
                    }
                    C5666 c5666 = this.f73643;
                    C2460 c2460M500911 = m50099(interfaceC7222);
                    c5666.m15550(c2460M500911);
                    zM15549 = c5666.m15549(j, c2460M500911);
                }
                z = true;
                if (!this.f73640) {
                    this.f73640 = true;
                    if (c1432.m5004() == -9223372036854775807L) {
                        j2 = -this.f73651;
                    } else {
                        j2 = 0;
                    }
                    this.f73644 = j2;
                }
                this.f73649 = 4;
                this.f73645 = 2;
                if (z) {
                    return 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C2460 m50099(InterfaceC7222 interfaceC7222) {
        int i = this.f73650;
        C2460 c2460 = this.f73655;
        if (i > c2460.m7521()) {
            c2460.m7508(0, new byte[Math.max(c2460.m7521() * 2, this.f73650)]);
        } else {
            c2460.m7510(0);
        }
        c2460.m7501(this.f73650);
        interfaceC7222.readFully(c2460.m7518(), 0, this.f73650);
        return c2460;
    }
}
