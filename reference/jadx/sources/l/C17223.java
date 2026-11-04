package l;

/* JADX INFO: renamed from: l.ܽ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public class C17223 extends AbstractC22664 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC21172 f56124;

    public /* synthetic */ C17223(EnumC21172 enumC21172, AbstractC22970 abstractC22970, C14458 c14458, int i) {
        this(enumC21172, abstractC22970, c14458);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo40452() {
        return true;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo40456() {
        return true;
    }

    public C17223(EnumC21172 enumC21172) {
        this(enumC21172, null, C14458.f45498);
    }

    public C17223(EnumC21172 enumC21172, AbstractC22970 abstractC22970, C14458 c14458) {
        super(abstractC22970, c14458);
        this.f56124 = enumC21172;
        C11972.m30026(enumC21172.f67612);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public AbstractC22664 mo4934(C14458 c14458) {
        return new C24683(this, this.f56124, this.f73596, c14458);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo40455() {
        return this.f56124 != EnumC21172.BOOLEAN;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo40454() {
        int i = C10289.f32862[this.f56124.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙۙ */
    public final EnumC21172 mo9097() {
        return this.f56124;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22664 mo23624(Object obj) {
        return new C16477(this.f56124, this.f73596, this.f73595, obj);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ܿۙ */
    public final String mo23625() {
        Object objMo39105 = mo39105();
        C11972.m30021(objMo39105);
        EnumC21172 enumC21172 = EnumC21172.BOOLEAN;
        EnumC21172 enumC21173 = this.f56124;
        if (enumC21173 == enumC21172) {
            return ((Integer) objMo39105).intValue() == 0 ? "false" : "true";
        }
        if (enumC21173 == EnumC21172.CHAR) {
            return String.valueOf((char) ((Integer) objMo39105).intValue());
        }
        return objMo39105.toString();
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo40451() {
        return this.f56124 == EnumC21172.BOOLEAN && mo39105() != null && ((Integer) mo39105()).intValue() == 0;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo40453() {
        return (this.f56124 != EnumC21172.BOOLEAN || mo39105() == null || ((Integer) mo39105()).intValue() == 0) ? false : true;
    }

    @Override // l.AbstractC22664, l.InterfaceC9769
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18720 mo5501() {
        switch (C10289.f32862[this.f56124.ordinal()]) {
            case 1:
                return EnumC18720.CHAR;
            case 2:
                return EnumC18720.BYTE;
            case 3:
                return EnumC18720.SHORT;
            case 4:
                return EnumC18720.INT;
            case 5:
                return EnumC18720.LONG;
            case 6:
                return EnumC18720.FLOAT;
            case 7:
                return EnumC18720.DOUBLE;
            case 8:
                return EnumC18720.BOOLEAN;
            default:
                throw new AssertionError();
        }
    }
}
