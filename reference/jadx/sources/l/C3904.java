package l;

/* JADX INFO: renamed from: l.ۘۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P5O2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3904 extends AbstractC3384 implements InterfaceC12448 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f14592 = EnumC18057.Format22cs;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f14593;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f14594;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f14595;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", v" + mo1144() + ", " + mo11355();
    }

    public C3904(int i, int i2, int i3, EnumC10297 enumC10297) {
        super(enumC10297);
        C13530.m33071(i);
        this.f14595 = i;
        C13530.m33071(i2);
        this.f14594 = i2;
        this.f14593 = i3;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f14595;
    }

    @Override // l.InterfaceC1157
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1144() {
        return this.f14594;
    }

    @Override // l.InterfaceC5828
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int mo11355() {
        return this.f14593;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f14592;
    }
}
