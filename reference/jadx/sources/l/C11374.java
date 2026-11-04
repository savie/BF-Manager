package l;

/* JADX INFO: renamed from: l.ۧۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5OY */
/* JADX INFO: loaded from: classes4.dex */
public final class C11374 extends AbstractC16113 implements InterfaceC5431, InterfaceC21839 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC22759 f35801;

    @Override // l.InterfaceC10650
    /* JADX INFO: renamed from: ۤ */
    public final int mo4171() {
        return 9;
    }

    public C11374(InterfaceC22759 interfaceC22759) {
        this.f35801 = interfaceC22759;
    }

    @Override // l.InterfaceC5431
    /* JADX INFO: renamed from: ۚ */
    public final String mo16161() {
        InterfaceC22759 interfaceC22759 = this.f35801;
        if (interfaceC22759 == null) {
            return null;
        }
        return interfaceC22759.getString();
    }

    @Override // l.InterfaceC5431
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC22759 mo16162() {
        return this.f35801;
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        InterfaceC22759 interfaceC22759 = this.f35801;
        if (interfaceC22759 != null) {
            this.f35801 = c8850.m23719(interfaceC22759.getString());
        }
    }
}
