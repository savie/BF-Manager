package l;

/* JADX INFO: renamed from: l.ۡۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 05TY */
/* JADX INFO: loaded from: classes4.dex */
public final class C8845 extends AbstractC3384 implements InterfaceC4623 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f30379 = EnumC18057.Format32x;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f30380;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f30381;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", v" + mo1144();
    }

    public C8845(EnumC10297 enumC10297, int i, int i2) {
        super(enumC10297);
        C13530.m33077(i);
        this.f30380 = i;
        C13530.m33077(i2);
        this.f30381 = i2;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f30380;
    }

    @Override // l.InterfaceC1157
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1144() {
        return this.f30381;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f30379;
    }
}
