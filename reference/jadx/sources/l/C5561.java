package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8LX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5561 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f19072;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22495 f19071 = new C22495(null, 0, "audio/ac4");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2460 f19073 = new C2460(16384);

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
    public final boolean mo2754(InterfaceC7222 interfaceC7222) throws EOFException, InterruptedIOException {
        C14984 c14984;
        int i;
        C2460 c2460 = new C2460(10);
        int i2 = 0;
        while (true) {
            c14984 = (C14984) interfaceC7222;
            c14984.mo19219(false, 0, 10, c2460.m7518());
            c2460.m7510(0);
            if (c2460.m7525() != 4801587) {
                break;
            }
            c2460.m7535(3);
            int iM7515 = c2460.m7515();
            i2 += iM7515 + 10;
            c14984.mo19218(iM7515, false);
        }
        c14984.mo19217();
        c14984.mo19218(i2, false);
        int i3 = i2;
        loop1: while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                c14984.mo19219(false, 0, 7, c2460.m7518());
                c2460.m7510(0);
                int iM7519 = c2460.m7519();
                if (iM7519 == 44096 || iM7519 == 44097) {
                    i4++;
                    if (i4 >= 4) {
                        return true;
                    }
                    byte[] bArrM7518 = c2460.m7518();
                    if (bArrM7518.length < 7) {
                        i = -1;
                    } else {
                        int i6 = ((bArrM7518[2] & 255) << 8) | (bArrM7518[3] & 255);
                        if (i6 == 65535) {
                            i6 = ((bArrM7518[4] & 255) << 16) | ((bArrM7518[5] & 255) << 8) | (bArrM7518[6] & 255);
                        } else {
                            i5 = 4;
                        }
                        if (iM7519 == 44097) {
                            i5 += 2;
                        }
                        i = i6 + i5;
                    }
                    if (i == -1) {
                        break loop1;
                    }
                    c14984.mo19218(i - 7, false);
                }
            }
            c14984.mo19217();
            i3++;
            if (i3 - i2 >= 8192) {
                break;
            }
            c14984.mo19218(i3, false);
        }
        return false;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f19071.mo2890(interfaceC15690, new C8074(0, 1));
        interfaceC15690.mo7696();
        interfaceC15690.mo7690(new C3776(-9223372036854775807L));
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        this.f19072 = false;
        this.f19071.mo2887();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) {
        C2460 c2460 = this.f19073;
        int i = interfaceC7222.read(c2460.m7518(), 0, 16384);
        if (i == -1) {
            return -1;
        }
        c2460.m7510(0);
        c2460.m7501(i);
        boolean z = this.f19072;
        C22495 c22495 = this.f19071;
        if (!z) {
            c22495.mo2888(4, 0L);
            this.f19072 = true;
        }
        c22495.mo2889(c2460);
        return 0;
    }
}
