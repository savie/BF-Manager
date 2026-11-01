package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58LX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3071 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2460 f11566 = new C2460(4);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15067 f11565 = new C15067(-1, -1, "image/avif");

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
        C14984 c14984 = (C14984) interfaceC7222;
        c14984.mo19218(4, false);
        C2460 c2460 = this.f11566;
        c2460.m7517(4);
        c14984.mo19219(false, 0, 4, c2460.m7518());
        if (c2460.m7532() == 1718909296) {
            c2460.m7517(4);
            c14984.mo19219(false, 0, 4, c2460.m7518());
            if (c2460.m7532() == 1635150182) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f11565.mo2753(interfaceC15690);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) {
        return this.f11565.mo2750(interfaceC7222, c0954);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        this.f11565.mo2752(j, j2);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }
}
