package l;

/* JADX INFO: renamed from: l.ۗۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public class C3131 extends AbstractC16579 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC6617 f11789;

    public /* synthetic */ C3131(EnumC6617 enumC6617, AbstractC0618 abstractC0618, C3794 c3794, int i) {
        this(enumC6617, abstractC0618, c3794);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9481() {
        return true;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9482() {
        return true;
    }

    public C3131(EnumC6617 enumC6617) {
        this(enumC6617, null, C3794.f13674);
    }

    public C3131(EnumC6617 enumC6617, AbstractC0618 abstractC0618, C3794 c3794) {
        super(abstractC0618, c3794);
        this.f11789 = enumC6617;
        C6171.m17176(enumC6617.f22297);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public AbstractC16579 mo1929(C3794 c3794) {
        return new C1720(this, this.f11789, this.f53222, c3794);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9484() {
        return this.f11789 != EnumC6617.BOOLEAN;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9480() {
        int i = C18654.f60578[this.f11789.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙۙ */
    public final EnumC6617 mo1933() {
        return this.f11789;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16579 mo1930(Object obj) {
        return new C9483(this.f11789, this.f53222, this.f53221, obj);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final String mo9478() {
        Object objMo24292 = mo24292();
        C6171.m17171(objMo24292);
        EnumC6617 enumC6617 = EnumC6617.BOOLEAN;
        EnumC6617 enumC6618 = this.f11789;
        if (enumC6618 == enumC6617) {
            return ((Integer) objMo24292).intValue() == 0 ? "false" : "true";
        }
        if (enumC6618 == EnumC6617.CHAR) {
            return String.valueOf((char) ((Integer) objMo24292).intValue());
        }
        return objMo24292.toString();
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9479() {
        return this.f11789 == EnumC6617.BOOLEAN && mo24292() != null && ((Integer) mo24292()).intValue() == 0;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9483() {
        return (this.f11789 != EnumC6617.BOOLEAN || mo24292() == null || ((Integer) mo24292()).intValue() == 0) ? false : true;
    }

    @Override // l.AbstractC16579, l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ */
    public final EnumC19688 mo1931() {
        switch (C18654.f60578[this.f11789.ordinal()]) {
            case 1:
                return EnumC19688.CHAR;
            case 2:
                return EnumC19688.BYTE;
            case 3:
                return EnumC19688.SHORT;
            case 4:
                return EnumC19688.INT;
            case 5:
                return EnumC19688.LONG;
            case 6:
                return EnumC19688.FLOAT;
            case 7:
                return EnumC19688.DOUBLE;
            case 8:
                return EnumC19688.BOOLEAN;
            default:
                throw new AssertionError();
        }
    }
}
