package l;

/* JADX INFO: renamed from: l.᩸ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2589 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21544 extends AbstractC3384 implements InterfaceC23737 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f69975 = EnumC18057.Format23x;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f69976;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f69977;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f69978;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", v" + mo1144() + ", v" + mo26898();
    }

    public C21544(int i, int i2, int i3, EnumC10297 enumC10297) {
        super(enumC10297);
        C13530.m33075(i);
        this.f69976 = i;
        C13530.m33075(i2);
        this.f69978 = i2;
        C13530.m33075(i3);
        this.f69977 = i3;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f69976;
    }

    @Override // l.InterfaceC1157
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1144() {
        return this.f69978;
    }

    @Override // l.InterfaceC22325
    /* JADX INFO: renamed from: ۖ */
    public final int mo26898() {
        return this.f69977;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f69975;
    }
}
