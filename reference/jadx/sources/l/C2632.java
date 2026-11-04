package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C2632 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21287 f8432 = new C21287(4);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8315 f8431 = new C8315(-1, -1, "image/heif");

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
        C9169 c9169 = (C9169) interfaceC19502;
        c9169.mo10077(4, false);
        C21287 c21287 = this.f8432;
        c21287.m48496(4);
        c9169.mo10078(false, 0, 4, c21287.m48497());
        if (c21287.m48485() == 1718909296) {
            c21287.m48496(4);
            c9169.mo10078(false, 0, 4, c21287.m48497());
            if (c21287.m48485() == 1751476579) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f8431.mo2293(interfaceC12789);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) {
        return this.f8431.mo2289(interfaceC19502, c18756);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        this.f8431.mo2292(j, j2);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }
}
