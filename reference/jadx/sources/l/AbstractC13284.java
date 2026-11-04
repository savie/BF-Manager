package l;

/* JADX INFO: renamed from: l.۫ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4HY */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13284 extends AbstractC19734 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f42437;

    public AbstractC13284(int i, int i2) {
        super(i);
        this.f42437 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC13284 m32826(C15258 c15258, InterfaceC10650 interfaceC10650) {
        int iMo15046 = interfaceC10650.mo15046();
        switch (interfaceC10650.mo4171()) {
            case 3:
                return new C16267(iMo15046, c15258, (InterfaceC1702) interfaceC10650);
            case 4:
            default:
                throw new C23044(null, "Invalid debug item type: %d", Integer.valueOf(interfaceC10650.mo4171()));
            case 5:
                return new C5827(iMo15046, c15258, (InterfaceC22585) interfaceC10650);
            case 6:
                return new C17013(iMo15046, c15258, (InterfaceC12888) interfaceC10650);
            case 7:
                return new C2098(iMo15046, -4);
            case 8:
                return new C15521(iMo15046, -4);
            case 9:
                return new C17759(iMo15046, (InterfaceC5431) interfaceC10650);
            case 10:
                return C11792.m29628(iMo15046, (InterfaceC19601) interfaceC10650);
        }
    }

    @Override // l.AbstractC19734
    /* JADX INFO: renamed from: ᩸ */
    public final double mo13837() {
        return this.f42437;
    }
}
