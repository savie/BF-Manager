package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes3.dex */
public final class C5745 implements InterfaceC6387 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15187 f19538;

    @Override // l.InterfaceC4705
    public final int getLength() {
        return 3;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    public C5745(C15187 c15187) {
        this.f19538 = c15187;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51765((int) EnumC3046.AE_CLASS.m9142());
        this.f19538.mo2341((InterfaceC19275) c23509);
    }

    @Override // l.InterfaceC6387
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4705 mo15810(C12738 c12738) {
        C15187 c15187 = this.f19538;
        C17676.m41157(c15187, c12738);
        this.f19538 = c15187;
        return this;
    }
}
