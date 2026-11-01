package l;

/* JADX INFO: renamed from: l.ۜۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 46A3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6686 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EnumC10297 f22551;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17684 f22552;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f22553;

    public AbstractC6686(C17684 c17684, EnumC10297 enumC10297, int i) {
        this.f22552 = c17684;
        this.f22551 = enumC10297;
        this.f22553 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC6686 m18062(C17684 c17684, C18825 c18825) {
        AbstractC6686 c6458;
        AbstractC6686 abstractC6686M41170;
        int iM43439 = c18825.m43439();
        if (iM43439 == 0) {
            iM43439 = c18825.m43454();
        }
        EnumC10297 enumC10297M19966 = c17684.mo34147().m19966(iM43439);
        int iM43447 = c18825.m43447();
        if (enumC10297M19966 == null) {
            abstractC6686M41170 = new C19387(c17684, EnumC10297.f35298, iM43447);
        } else {
            switch (C3635.f13343[enumC10297M19966.f35328.ordinal()]) {
                case 1:
                    c6458 = new C6458(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 2:
                    c6458 = new C22687(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 3:
                    c6458 = new C14926(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 4:
                    abstractC6686M41170 = c17684.m41170(iM43447, enumC10297M19966);
                    break;
                case 5:
                    c6458 = new C17747(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 6:
                    c6458 = new C7870(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 7:
                    c6458 = new C19159(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 8:
                    c6458 = new C8576(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 9:
                    c6458 = new C9987(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 10:
                    c6458 = new C7164(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 11:
                    c6458 = new C20570(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 12:
                    c6458 = new C15632(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 13:
                    c6458 = new C19865(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 14:
                    abstractC6686M41170 = c17684.m41191(iM43447, enumC10297M19966);
                    break;
                case 15:
                    c6458 = new C16337(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 16:
                    c6458 = new C12104(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 17:
                    c6458 = new C17042(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 18:
                    c6458 = new C5753(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 19:
                    c6458 = new C10693(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 20:
                    c6458 = new C23393(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 21:
                    c6458 = new C14221(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 22:
                    c6458 = new C1519(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 23:
                    c6458 = new C9282(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 24:
                    c6458 = new C2930(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 25:
                    abstractC6686M41170 = c17684.m41185(iM43447, enumC10297M19966);
                    break;
                case 26:
                    c6458 = new C11626(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 27:
                    c6458 = new C13743(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 28:
                    c6458 = new C2452(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 29:
                    c6458 = new C5275(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 30:
                    c6458 = new C22209(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 31:
                    c6458 = new C1041(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 32:
                    c6458 = new C13037(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 33:
                    c6458 = new C3863(c17684, enumC10297M19966, iM43447);
                    abstractC6686M41170 = c6458;
                    break;
                case 34:
                    abstractC6686M41170 = new C21503(c17684, iM43447);
                    break;
                case 35:
                    abstractC6686M41170 = new C8098(c17684, iM43447);
                    break;
                case 36:
                    abstractC6686M41170 = new C12809(c17684, iM43447);
                    break;
                default:
                    throw new C20749(null, "Unexpected opcode format: %s", enumC10297M19966.f35328.toString());
            }
        }
        c18825.m43437(abstractC6686M41170.mo5436() * 2);
        return abstractC6686M41170;
    }

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۜ */
    public final EnumC10297 mo5435() {
        return this.f22551;
    }

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۡ */
    public int mo5436() {
        return this.f22551.f35328.f57758 / 2;
    }
}
