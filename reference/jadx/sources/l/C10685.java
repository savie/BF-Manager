package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes4.dex */
public final class C10685 implements InterfaceC6387 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15187 f36478;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char f36479;

    @Override // l.InterfaceC4705
    public final int getLength() {
        return 3;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    public C10685(char c, C15187 c15187) {
        this.f36479 = c;
        this.f36478 = c15187;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51765((int) this.f36479);
        this.f36478.mo2341((InterfaceC19275) c23509);
    }

    @Override // l.InterfaceC6387
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4705 mo15810(C12738 c12738) {
        if (!this.f36478.mo32563()) {
            C15187 c15187 = this.f36478;
            C17676.m41157(c15187, c12738);
            this.f36478 = c15187;
            if (!EnumC3046.m9138(this.f36479)) {
                AbstractC21536 abstractC21536 = this.f36478.f49578;
                this.f36479 = abstractC21536 == null ? EnumC3046.AE_NOT_APPLICABLE.m9142() : abstractC21536.f69952.m33534();
            }
        }
        return this;
    }
}
