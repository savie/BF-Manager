package l;

/* JADX INFO: renamed from: l.ܺ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R4HY */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15798 extends AbstractC7724 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f51147;

    public AbstractC15798(int i, int i2) {
        super(i);
        this.f51147 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC15798 m37571(C21129 c21129, InterfaceC7239 interfaceC7239) {
        int iMo17670 = interfaceC7239.mo17670();
        switch (interfaceC7239.mo1599()) {
            case 3:
                return new C10859(iMo17670, c21129, (InterfaceC12179) interfaceC7239);
            case 4:
            default:
                throw new C20749(null, "Invalid debug item type: %d", Integer.valueOf(interfaceC7239.mo1599()));
            case 5:
                return new C20031(iMo17670, c21129, (InterfaceC20645) interfaceC7239);
            case 6:
                return new C17208(iMo17670, c21129, (InterfaceC0183) interfaceC7239);
            case 7:
                return new C0274(iMo17670, -4);
            case 8:
                return new C20736(iMo17670, -4);
            case 9:
                return new C5919(iMo17670, (InterfaceC16412) interfaceC7239);
            case 10:
                return C16503.m38776(iMo17670, (InterfaceC15707) interfaceC7239);
        }
    }

    @Override // l.AbstractC7724
    /* JADX INFO: renamed from: ܰ */
    public final double mo5599() {
        return this.f51147;
    }
}
