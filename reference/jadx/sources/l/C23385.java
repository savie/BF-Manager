package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes.dex */
public final class C23385 implements InterfaceC6387 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15187 f75760;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15187 f75761;

    @Override // l.InterfaceC4705
    public final int getLength() {
        return 5;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    public C23385(C15187 c15187, C15187 c15188) {
        this.f75761 = c15187;
        this.f75760 = c15188;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51765((int) EnumC3046.AE_ENUM.m9142());
        this.f75761.mo2341((InterfaceC19275) c23509);
        this.f75760.mo2341((InterfaceC19275) c23509);
    }

    @Override // l.InterfaceC6387
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4705 mo15810(C12738 c12738) {
        C15187 c15187 = this.f75761;
        C17676.m41157(c15187, c12738);
        this.f75761 = c15187;
        C15187 c15188 = this.f75760;
        C17676.m41157(c15188, c12738);
        this.f75760 = c15188;
        return this;
    }
}
