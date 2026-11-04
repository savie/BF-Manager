package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8LX */
/* JADX INFO: loaded from: classes4.dex */
public final class C7613 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f25136;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18800 f25135 = new C18800(null, 0, "audio/ac4");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21287 f25137 = new C21287(16384);

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) throws EOFException, InterruptedIOException {
        C9169 c9169;
        int i;
        C21287 c21287 = new C21287(10);
        int i2 = 0;
        while (true) {
            c9169 = (C9169) interfaceC19502;
            c9169.mo10078(false, 0, 10, c21287.m48497());
            c21287.m48510(0);
            if (c21287.m48501() != 4801587) {
                break;
            }
            c21287.m48503(3);
            int iM48499 = c21287.m48499();
            i2 += iM48499 + 10;
            c9169.mo10077(iM48499, false);
        }
        c9169.mo10076();
        c9169.mo10077(i2, false);
        int i3 = i2;
        loop1: while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                c9169.mo10078(false, 0, 7, c21287.m48497());
                c21287.m48510(0);
                int iM48494 = c21287.m48494();
                if (iM48494 == 44096 || iM48494 == 44097) {
                    i4++;
                    if (i4 >= 4) {
                        return true;
                    }
                    byte[] bArrM48497 = c21287.m48497();
                    if (bArrM48497.length < 7) {
                        i = -1;
                    } else {
                        int i6 = ((bArrM48497[2] & 255) << 8) | (bArrM48497[3] & 255);
                        if (i6 == 65535) {
                            i6 = ((bArrM48497[4] & 255) << 16) | ((bArrM48497[5] & 255) << 8) | (bArrM48497[6] & 255);
                        } else {
                            i5 = 4;
                        }
                        if (iM48494 == 44097) {
                            i5 += 2;
                        }
                        i = i6 + i5;
                    }
                    if (i == -1) {
                        break loop1;
                    }
                    c9169.mo10077(i - 7, false);
                }
            }
            c9169.mo10076();
            i3++;
            if (i3 - i2 >= 8192) {
                break;
            }
            c9169.mo10077(i3, false);
        }
        return false;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f25135.mo1351(interfaceC12789, new C10857(0, 1));
        interfaceC12789.mo16661();
        interfaceC12789.mo16659(new C0857(-9223372036854775807L));
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        this.f25136 = false;
        this.f25135.mo1349();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) {
        C21287 c21287 = this.f25137;
        int i = interfaceC19502.read(c21287.m48497(), 0, 16384);
        if (i == -1) {
            return -1;
        }
        c21287.m48510(0);
        c21287.m48517(i);
        boolean z = this.f25136;
        C18800 c18800 = this.f25135;
        if (!z) {
            c18800.mo1350(4, 0L);
            this.f25136 = true;
        }
        c18800.mo1352(c21287);
        return 0;
    }
}
