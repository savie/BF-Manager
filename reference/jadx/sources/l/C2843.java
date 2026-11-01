package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8U2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2843 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f10748;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f10749;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12017 f10751;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f10752;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f10753;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f10754;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C0987 f10755;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f10758;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23451 f10760;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f10759 = new byte[42];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2460 f10756 = new C2460(new byte[32768], 0);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f10750 = false;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C16395 f10761 = new C16395();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f10757 = 0;

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
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        C0987 c0987M28713 = new C11539().m28713(interfaceC7222, C5436.f18749);
        if (c0987M28713 != null) {
            c0987M28713.m3789();
        }
        C2460 c2460 = new C2460(4);
        ((C14984) interfaceC7222).mo19219(false, 0, 4, c2460.m7518());
        return c2460.m7532() == 1716281667;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f10752 = interfaceC15690;
        this.f10758 = interfaceC15690.mo7684(0, 1);
        interfaceC15690.mo7696();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) throws C22861 {
        InterfaceC6599 c3776;
        long j;
        boolean zM30250;
        int i = this.f10757;
        C0987 c0987 = null;
        boolean z = true;
        if (i == 0) {
            interfaceC7222.mo19217();
            long jMo19213 = interfaceC7222.mo19213();
            C0987 c0987M28713 = new C11539().m28713(interfaceC7222, !this.f10750 ? null : C5436.f18749);
            if (c0987M28713 != null && c0987M28713.m3789() != 0) {
                c0987 = c0987M28713;
            }
            interfaceC7222.mo19214((int) (interfaceC7222.mo19213() - jMo19213));
            this.f10755 = c0987;
            this.f10757 = 1;
            return 0;
        }
        byte[] bArr = this.f10759;
        if (i == 1) {
            interfaceC7222.mo19210(0, bArr.length, bArr);
            interfaceC7222.mo19217();
            this.f10757 = 2;
            return 0;
        }
        if (i == 2) {
            C2460 c2460 = new C2460(4);
            interfaceC7222.readFully(c2460.m7518(), 0, 4);
            if (c2460.m7532() != 1716281667) {
                throw C22861.m50610("Failed to read FLAC stream marker.", (Throwable) null);
            }
            this.f10757 = 3;
            return 0;
        }
        if (i == 3) {
            C23451 c23451M51687 = this.f10760;
            boolean z2 = false;
            while (!z2) {
                interfaceC7222.mo19217();
                byte[] bArr2 = new byte[4];
                C11634 c11634 = new C11634(bArr2, 4);
                interfaceC7222.mo19210(0, 4, bArr2);
                boolean zM29035 = c11634.m29035();
                int iM29039 = c11634.m29039(7);
                int iM290310 = c11634.m29039(24) + 4;
                if (iM29039 == 0) {
                    byte[] bArr3 = new byte[38];
                    interfaceC7222.readFully(bArr3, 0, 38);
                    c23451M51687 = new C23451(bArr3, 4);
                } else {
                    if (c23451M51687 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iM29039 == 3) {
                        C2460 c2461 = new C2460(iM290310);
                        interfaceC7222.readFully(c2461.m7518(), 0, iM290310);
                        c23451M51687 = c23451M51687.m51688(C17100.m39921(c2461));
                    } else if (iM29039 == 4) {
                        C2460 c2462 = new C2460(iM290310);
                        interfaceC7222.readFully(c2462.m7518(), 0, iM290310);
                        c2462.m7535(4);
                        c23451M51687 = c23451M51687.m51689(Arrays.asList(C15773.m37514(c2462, false, false).f34617));
                    } else if (iM29039 == 6) {
                        C2460 c2463 = new C2460(iM290310);
                        interfaceC7222.readFully(c2463.m7518(), 0, iM290310);
                        c2463.m7535(4);
                        c23451M51687 = c23451M51687.m51687(AbstractC22433.of((Object) C12722.m31570(c2463)));
                    } else {
                        interfaceC7222.mo19214(iM290310);
                    }
                }
                String str = C17983.f57504;
                this.f10760 = c23451M51687;
                z2 = zM29035;
            }
            this.f10760.getClass();
            this.f10753 = Math.max(this.f10760.f75955, 6);
            C7648 c7648M51686 = this.f10760.m51686(bArr, this.f10755);
            InterfaceC8011 interfaceC8011 = this.f10758;
            C10471 c10471M20201 = c7648M51686.m20201();
            c10471M20201.m26521("audio/flac");
            interfaceC8011.mo8116(c10471M20201.m26497());
            this.f10758.mo8113(this.f10760.m51685());
            this.f10757 = 4;
            return 0;
        }
        long j2 = 0;
        if (i == 4) {
            interfaceC7222.mo19217();
            C2460 c2464 = new C2460(2);
            interfaceC7222.mo19210(0, 2, c2464.m7518());
            int iM7519 = c2464.m7519();
            if ((iM7519 >> 2) != 16382) {
                interfaceC7222.mo19217();
                throw C22861.m50610("First frame does not start with sync code.", (Throwable) null);
            }
            interfaceC7222.mo19217();
            this.f10748 = iM7519;
            InterfaceC15690 interfaceC15690 = this.f10752;
            String str2 = C17983.f57504;
            long position = interfaceC7222.getPosition();
            long length = interfaceC7222.getLength();
            this.f10760.getClass();
            C23451 c23451 = this.f10760;
            C10751 c10751 = c23451.f75959;
            if (c10751 != null && c10751.f36652.length > 0) {
                c3776 = new C5811(c23451, position);
            } else if (length == -1 || c23451.f75957 <= 0) {
                c3776 = new C3776(c23451.m51685());
            } else {
                C12017 c12017 = new C12017(c23451, this.f10748, position, length);
                this.f10751 = c12017;
                c3776 = c12017.m3484();
            }
            interfaceC15690.mo7690(c3776);
            this.f10757 = 5;
            return 0;
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        this.f10758.getClass();
        this.f10760.getClass();
        C12017 c12018 = this.f10751;
        if (c12018 != null && c12018.m3486()) {
            return this.f10751.m3483(interfaceC7222, c0954);
        }
        if (this.f10749 == -1) {
            C23451 c23452 = this.f10760;
            interfaceC7222.mo19217();
            interfaceC7222.mo19209(1);
            byte[] bArr4 = new byte[1];
            interfaceC7222.mo19210(0, 1, bArr4);
            boolean z3 = (bArr4[0] & 1) == 1;
            interfaceC7222.mo19209(2);
            int i2 = z3 ? 7 : 6;
            C2460 c2465 = new C2460(i2);
            byte[] bArrM7518 = c2465.m7518();
            int i3 = 0;
            while (i3 < i2) {
                int iMo19216 = interfaceC7222.mo19216(i3, i2 - i3, bArrM7518);
                if (iMo19216 == -1) {
                    break;
                }
                i3 += iMo19216;
            }
            c2465.m7501(i3);
            interfaceC7222.mo19217();
            try {
                long jM7527 = c2465.m7527();
                if (!z3) {
                    jM7527 *= (long) c23452.f75949;
                }
                j2 = jM7527;
            } catch (NumberFormatException unused) {
                z = false;
            }
            if (!z) {
                throw C22861.m50610((String) null, (Throwable) null);
            }
            this.f10749 = j2;
        } else {
            C2460 c2466 = this.f10756;
            int iM7509 = c2466.m7509();
            if (iM7509 < 32768) {
                int i4 = interfaceC7222.read(c2466.m7518(), iM7509, 32768 - iM7509);
                z = i4 == -1;
                if (!z) {
                    c2466.m7501(iM7509 + i4);
                } else if (c2466.m7503() == 0) {
                    long j3 = this.f10749 * 1000000;
                    C23451 c23453 = this.f10760;
                    String str3 = C17983.f57504;
                    this.f10758.mo8114(j3 / ((long) c23453.f75950), 1, this.f10754, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int iM7500 = c2466.m7500();
            int i5 = this.f10754;
            int i6 = this.f10753;
            if (i5 < i6) {
                c2466.m7535(Math.min(i6 - i5, c2466.m7503()));
            }
            this.f10760.getClass();
            int iM7501 = c2466.m7500();
            while (true) {
                int iM75010 = c2466.m7509() - 16;
                C16395 c16395 = this.f10761;
                if (iM7501 > iM75010) {
                    if (z) {
                        while (true) {
                            if (iM7501 <= c2466.m7509() - this.f10753) {
                                c2466.m7510(iM7501);
                                try {
                                    zM30250 = C12162.m30250(c2466, this.f10760, this.f10748, c16395);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zM30250 = false;
                                }
                                if (c2466.m7500() > c2466.m7509()) {
                                    zM30250 = false;
                                }
                                if (zM30250) {
                                    c2466.m7510(iM7501);
                                    j = c16395.f52757;
                                    break;
                                }
                                iM7501++;
                            } else {
                                c2466.m7510(c2466.m7509());
                            }
                        }
                    } else {
                        c2466.m7510(iM7501);
                    }
                    j = -1;
                    break;
                }
                c2466.m7510(iM7501);
                if (C12162.m30250(c2466, this.f10760, this.f10748, c16395)) {
                    c2466.m7510(iM7501);
                    j = c16395.f52757;
                    break;
                }
                iM7501++;
            }
            int iM7502 = c2466.m7500() - iM7500;
            c2466.m7510(iM7500);
            this.f10758.mo8112(iM7502, c2466);
            int i7 = this.f10754 + iM7502;
            this.f10754 = i7;
            if (j != -1) {
                long j4 = this.f10749 * 1000000;
                C23451 c23454 = this.f10760;
                String str4 = C17983.f57504;
                this.f10758.mo8114(j4 / ((long) c23454.f75950), 1, i7, 0, null);
                this.f10754 = 0;
                this.f10749 = j;
            }
            int length2 = c2466.m7518().length - c2466.m7509();
            if (c2466.m7503() < 16 && length2 < 16) {
                int iM7503 = c2466.m7503();
                System.arraycopy(c2466.m7518(), c2466.m7500(), c2466.m7518(), 0, iM7503);
                c2466.m7510(0);
                c2466.m7501(iM7503);
            }
        }
        return 0;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        if (j == 0) {
            this.f10757 = 0;
        } else {
            C12017 c12017 = this.f10751;
            if (c12017 != null) {
                c12017.m3485(j2);
            }
        }
        this.f10749 = j2 != 0 ? -1L : 0L;
        this.f10754 = 0;
        this.f10756.m7517(0);
    }
}
