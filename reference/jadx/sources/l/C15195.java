package l;

/* JADX INFO: renamed from: l.ܶۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S53J */
/* JADX INFO: loaded from: classes5.dex */
public final class C15195 extends AbstractC3384 implements InterfaceC11037 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f49585 = EnumC18057.Format22x;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f49586;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f49587;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", v" + mo1144();
    }

    public C15195(EnumC10297 enumC10297, int i, int i2) {
        super(enumC10297);
        C13530.m33075(i);
        this.f49586 = i;
        C13530.m33077(i2);
        this.f49587 = i2;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f49586;
    }

    @Override // l.InterfaceC1157
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1144() {
        return this.f49587;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f49585;
    }
}
