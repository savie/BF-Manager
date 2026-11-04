package l;

import java.util.List;

/* JADX INFO: renamed from: l.۠ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W8N9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8598 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22486 f28098;

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    public C8598(int i) {
        if ((i & 1) != 0) {
            this.f28098 = new C8315(65496, 2, "image/jpeg");
        } else {
            this.f28098 = new C7107();
        }
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        return this.f28098.mo2294(interfaceC19502);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f28098.mo2293(interfaceC12789);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) {
        return this.f28098.mo2289(interfaceC19502, c18756);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        this.f28098.mo2292(j, j2);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
        this.f28098.mo2291();
    }
}
