package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۡܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1V7 */
/* JADX INFO: loaded from: classes4.dex */
public class C9448 implements InterfaceC7140 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7140 f30642;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24404 f30643;

    public C9448(C24404 c24404, InterfaceC7140 interfaceC7140) {
        this.f30643 = c24404;
        this.f30642 = interfaceC7140;
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ۚ */
    public final int mo2841() {
        return this.f30642.mo2841();
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ֫ */
    public final List mo2839() {
        return C19906.m45836((InterfaceC4288) this.f30643.m54578(), this.f30642.mo2839());
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ۧ */
    public final Iterable mo2842() {
        return C19906.m45834(this.f30642.mo2842(), this.f30643.m54588());
    }
}
