package l;

/* JADX INFO: renamed from: l.᩺ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N539 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22956 extends AbstractC4465 implements InterfaceC6097 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f74625 = EnumC18057.Format22t;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f74626;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f74627;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", v" + mo1144() + ", " + mo8965();
    }

    public C22956(EnumC10297 enumC10297, int i, int i2, C5171 c5171) {
        super(enumC10297, c5171);
        C13530.m33071(i);
        this.f74627 = i;
        C13530.m33071(i2);
        this.f74626 = i2;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f74627;
    }

    @Override // l.InterfaceC1157
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1144() {
        return this.f74626;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f74625;
    }
}
