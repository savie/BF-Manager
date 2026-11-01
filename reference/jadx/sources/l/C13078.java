package l;

/* JADX INFO: renamed from: l.۬ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 25QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13078 extends AbstractC3384 implements InterfaceC16681, InterfaceC10062 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f43572 = EnumC18057.Format22c;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC7446 f43573;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f43574;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f43575;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", v" + mo1144() + ", " + getReference();
    }

    public C13078(EnumC10297 enumC10297, int i, int i2, InterfaceC7446 interfaceC7446) {
        super(enumC10297);
        C13530.m33071(i);
        this.f43575 = i;
        C13530.m33071(i2);
        this.f43574 = i2;
        this.f43573 = interfaceC7446;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f43575;
    }

    @Override // l.InterfaceC1157
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1144() {
        return this.f43574;
    }

    @Override // l.InterfaceC13859
    public final InterfaceC7446 getReference() {
        return this.f43573;
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        this.f43573 = c8485.m22156(this.f43573);
    }

    @Override // l.InterfaceC13859
    /* JADX INFO: renamed from: ᩵ */
    public final int mo1143() {
        return this.f12506.f35329;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f43572;
    }
}
