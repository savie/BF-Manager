package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8IZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1327 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f5616;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f5617;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C13323 f5618;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f5619;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f5620;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2460 f5621;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f5622;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2460 f5623;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f5624;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f5625;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f5626;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C11634 f5627;

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

    public C1327(int i) {
        this.f5620 = (i & 2) != 0 ? i | 1 : i;
        this.f5618 = new C13323(null, 0, "audio/mp4a-latm", true);
        this.f5623 = new C2460(2048);
        this.f5619 = -1;
        this.f5622 = -1L;
        C2460 c2460 = new C2460(10);
        this.f5621 = c2460;
        byte[] bArrM7518 = c2460.m7518();
        this.f5627 = new C11634(bArrM7518, bArrM7518.length);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) throws EOFException, InterruptedIOException {
        int iM4725 = m4725(interfaceC7222);
        int i = 0;
        int i2 = 0;
        int i3 = iM4725;
        do {
            C2460 c2460 = this.f5621;
            C14984 c14984 = (C14984) interfaceC7222;
            c14984.mo19219(false, 0, 2, c2460.m7518());
            c2460.m7510(0);
            if ((c2460.m7519() & 65526) == 65520) {
                i++;
                if (i >= 4 && i2 > 188) {
                    return true;
                }
                c14984.mo19219(false, 0, 4, c2460.m7518());
                C11634 c11634 = this.f5627;
                c11634.m29029(14);
                int iM29039 = c11634.m29039(13);
                if (iM29039 > 6) {
                    c14984.mo19218(iM29039 - 6, false);
                    i2 += iM29039;
                } else {
                    i3++;
                    c14984.mo19217();
                }
            } else {
                i3++;
                c14984.mo19217();
            }
            c14984.mo19218(i3, false);
            i = 0;
            i2 = 0;
        } while (i3 - iM4725 < 8192);
        return false;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f5624 = interfaceC15690;
        this.f5618.mo2890(interfaceC15690, new C8074(0, 1));
        interfaceC15690.mo7696();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        this.f5625 = false;
        this.f5618.mo2887();
        this.f5617 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00df  */
    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) throws C22861 {
        int i;
        boolean z;
        C13323 c13323;
        C2023.m6508(this.f5624);
        long length = interfaceC7222.getLength();
        int i2 = this.f5620;
        int i3 = i2 & 2;
        if (i3 != 0 || ((i2 & 1) != 0 && length != -1)) {
            C11634 c11634 = this.f5627;
            C2460 c2460 = this.f5621;
            if (!this.f5626) {
                this.f5619 = -1;
                interfaceC7222.mo19217();
                long j = 0;
                if (interfaceC7222.getPosition() == 0) {
                    m4725(interfaceC7222);
                }
                int i4 = 0;
                for (int i5 = 0; interfaceC7222.mo19219(true, i5, 2, c2460.m7518()); i5 = 0) {
                    try {
                        c2460.m7510(i5);
                        if (!((c2460.m7519() & 65526) == 65520)) {
                            i4 = 0;
                            break;
                        }
                        if (!interfaceC7222.mo19219(true, i5, 4, c2460.m7518())) {
                            break;
                        }
                        c11634.m29029(14);
                        int iM29039 = c11634.m29039(13);
                        if (iM29039 <= 6) {
                            this.f5626 = true;
                            throw C22861.m50610("Malformed ADTS stream", (Throwable) null);
                        }
                        j += (long) iM29039;
                        i4++;
                        if (i4 == 1000 || !interfaceC7222.mo19218(iM29039 - 6, true)) {
                            break;
                            break;
                        }
                    } catch (EOFException unused) {
                    }
                }
                interfaceC7222.mo19217();
                if (i4 > 0) {
                    this.f5619 = (int) (j / ((long) i4));
                } else {
                    this.f5619 = -1;
                }
                this.f5626 = true;
            }
        }
        C2460 c2461 = this.f5623;
        int i6 = interfaceC7222.read(c2461.m7518(), 0, 2048);
        boolean z2 = i6 == -1;
        boolean z3 = this.f5616;
        C13323 c13324 = this.f5618;
        if (z3) {
            i = -1;
            c13324 = c13324;
            z = true;
        } else {
            boolean z4 = (i2 & 1) != 0 && this.f5619 > 0;
            if (z4 && c13324.m32835() == -9223372036854775807L && !z2) {
                i = -1;
                c13324 = c13324;
                z = true;
            } else {
                if (z4 && c13324.m32835() != -9223372036854775807L) {
                    this.f5624.mo7690(new C22745((int) ((((long) this.f5619) * 8000000) / c13324.m32835()), this.f5619, length, this.f5622, i3 != 0));
                    i = -1;
                } else {
                    i = -1;
                    this.f5624.mo7690(new C3776(-9223372036854775807L));
                }
                z = true;
                this.f5616 = true;
            }
        }
        if (z2) {
            return i;
        }
        c2461.m7510(0);
        c2461.m7501(i6);
        if (this.f5625) {
            c13323 = c13324;
        } else {
            c13323 = c13324;
            c13323.mo2888(4, this.f5617);
            this.f5625 = z;
        }
        c13323.mo2889(c2461);
        return 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m4725(InterfaceC7222 interfaceC7222) {
        int i = 0;
        while (true) {
            C2460 c2460 = this.f5621;
            interfaceC7222.mo19210(0, 10, c2460.m7518());
            c2460.m7510(0);
            if (c2460.m7525() != 4801587) {
                break;
            }
            c2460.m7535(3);
            int iM7515 = c2460.m7515();
            i += iM7515 + 10;
            interfaceC7222.mo19209(iM7515);
        }
        interfaceC7222.mo19217();
        interfaceC7222.mo19209(i);
        if (this.f5622 == -1) {
            this.f5622 = i;
        }
        return i;
    }
}
