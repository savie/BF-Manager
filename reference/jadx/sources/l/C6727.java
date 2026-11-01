package l;

/* JADX INFO: renamed from: l.ۜۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q574 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6727 extends AbstractC3384 implements InterfaceC17386 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f22653 = EnumC18057.Format22s;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f22654;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f22655;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f22656;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", v" + mo1144() + ", " + mo4062();
    }

    public C6727(int i, int i2, int i3, EnumC10297 enumC10297) {
        super(enumC10297);
        C13530.m33071(i);
        this.f22656 = i;
        C13530.m33071(i2);
        this.f22655 = i2;
        C13530.m33068(i3);
        this.f22654 = i3;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f22656;
    }

    @Override // l.InterfaceC1157
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1144() {
        return this.f22655;
    }

    @Override // l.InterfaceC9357
    /* JADX INFO: renamed from: ᩺ */
    public final int mo4063() {
        return this.f22654;
    }

    @Override // l.InterfaceC6802
    /* JADX INFO: renamed from: ܺ */
    public final long mo4062() {
        return this.f22654;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f22653;
    }
}
