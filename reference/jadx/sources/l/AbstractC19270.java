package l;

/* JADX INFO: renamed from: l.ᩳᩴۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46A3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19270 implements InterfaceC23331 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24975 f62313;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumC22631 f62314;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f62315;

    public AbstractC19270(C24975 c24975, EnumC22631 enumC22631, int i) {
        this.f62313 = c24975;
        this.f62314 = enumC22631;
        this.f62315 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC19270 m44604(C24975 c24975, C8565 c8565) {
        AbstractC19270 c19358;
        AbstractC19270 abstractC19270M55785;
        int iM22998 = c8565.m22998();
        if (iM22998 == 0) {
            iM22998 = c8565.m22993();
        }
        EnumC22631 enumC22631M45296 = c24975.mo4326().m45296(iM22998);
        int iM23001 = c8565.m23001();
        if (enumC22631M45296 == null) {
            abstractC19270M55785 = new C14048(c24975, EnumC22631.f73424, iM23001);
        } else {
            switch (C8171.f26954[enumC22631M45296.f73508.ordinal()]) {
                case 1:
                    c19358 = new C19358(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 2:
                    c19358 = new C10407(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 3:
                    c19358 = new C1459(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 4:
                    abstractC19270M55785 = c24975.m55785(iM23001, enumC22631M45296);
                    break;
                case 5:
                    c19358 = new C2950(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 6:
                    c19358 = new C7425(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 7:
                    c19358 = new C14136(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 8:
                    c19358 = new C5100(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 9:
                    c19358 = new C22254(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 10:
                    c19358 = new C11065(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 11:
                    c19358 = new C23000(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 12:
                    c19358 = new C20016(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 13:
                    c19358 = new C15540(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 14:
                    abstractC19270M55785 = c24975.m55815(iM23001, enumC22631M45296);
                    break;
                case 15:
                    c19358 = new C5846(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 16:
                    c19358 = new C2117(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 17:
                    c19358 = new C11811(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 18:
                    c19358 = new C25238(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 19:
                    c19358 = new C17032(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 20:
                    c19358 = new C17778(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 21:
                    c19358 = new C16286(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 22:
                    c19358 = new C23746(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 23:
                    c19358 = new C3608(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 24:
                    c19358 = new C20762(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 25:
                    abstractC19270M55785 = c24975.m55797(iM23001, enumC22631M45296);
                    break;
                case 26:
                    c19358 = new C24492(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 27:
                    c19358 = new C6592(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 28:
                    c19358 = new C4354(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 29:
                    c19358 = new C14794(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 30:
                    c19358 = new C21508(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 31:
                    c19358 = new C18524(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 32:
                    c19358 = new C0625(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 33:
                    c19358 = new C8083(c24975, enumC22631M45296, iM23001);
                    abstractC19270M55785 = c19358;
                    break;
                case 34:
                    abstractC19270M55785 = new C9573(c24975, iM23001);
                    break;
                case 35:
                    abstractC19270M55785 = new C7337(c24975, iM23001);
                    break;
                case 36:
                    abstractC19270M55785 = new C0713(c24975, iM23001);
                    break;
                default:
                    throw new C23044(null, "Unexpected opcode format: %s", enumC22631M45296.f73508.toString());
            }
        }
        c8565.m22984(abstractC19270M55785.mo3033() * 2);
        return abstractC19270M55785;
    }

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۤ */
    public final EnumC22631 mo30864() {
        return this.f62314;
    }

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۨ */
    public int mo3033() {
        return this.f62314.f73508.f23142 / 2;
    }
}
