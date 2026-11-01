package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܰۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13631 implements InterfaceC6387 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15187 f44967;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC4705 f44968;

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    public C13631(C15187 c15187, InterfaceC6387 interfaceC6387) {
        this.f44967 = c15187;
        this.f44968 = interfaceC6387;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        this.f44967.mo2341(interfaceC19275);
        this.f44968.mo2341(interfaceC19275);
    }

    @Override // l.InterfaceC4705
    public final int getLength() {
        return this.f44968.getLength() + 2;
    }

    @Override // l.InterfaceC6387
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4705 mo15810(C12738 c12738) {
        C15187 c15187 = this.f44967;
        C17676.m41157(c15187, c12738);
        this.f44967 = c15187;
        this.f44968 = C17676.m41156(this.f44968, c12738);
        return this;
    }
}
