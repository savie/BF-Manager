package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98TO */
/* JADX INFO: loaded from: classes4.dex */
public final class C11912 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f39999;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2738 f39998 = new C2738("audio/ac3");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2460 f40000 = new C2460(2786);

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
        C2460 c2460 = new C2460(10);
        int i = 0;
        while (true) {
            c14984 = (C14984) interfaceC7222;
            c14984.mo19219(false, 0, 10, c2460.m7518());
            c2460.m7510(0);
            if (c2460.m7525() != 4801587) {
                break;
            }
            c2460.m7535(3);
            int iM7515 = c2460.m7515();
            i += iM7515 + 10;
            c14984.mo19218(iM7515, false);
        }
        c14984.mo19217();
        c14984.mo19218(i, false);
        int i2 = i;
        loop1: while (true) {
            int i3 = 0;
            while (true) {
                c14984.mo19219(false, 0, 6, c2460.m7518());
                c2460.m7510(0);
                if (c2460.m7519() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int iM52239 = C23720.m52239(c2460.m7518());
                if (iM52239 == -1) {
                    break loop1;
                }
                c14984.mo19218(iM52239 - 6, false);
            }
            c14984.mo19217();
            i2++;
            if (i2 - i >= 8192) {
                break;
            }
            c14984.mo19218(i2, false);
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
        this.f39998.mo2890(interfaceC15690, new C8074(0, 1));
        interfaceC15690.mo7696();
        interfaceC15690.mo7690(new C3776(-9223372036854775807L));
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        this.f39999 = false;
        this.f39998.mo2887();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) {
        C2460 c2460 = this.f40000;
        int i = interfaceC7222.read(c2460.m7518(), 0, 2786);
        if (i == -1) {
            return -1;
        }
        c2460.m7510(0);
        c2460.m7501(i);
        boolean z = this.f39999;
        C2738 c2738 = this.f39998;
        if (!z) {
            c2738.mo2888(4, 0L);
            this.f39999 = true;
        }
        c2738.mo2889(c2460);
        return 0;
    }
}
