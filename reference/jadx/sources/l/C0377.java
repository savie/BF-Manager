package l;

/* JADX INFO: renamed from: l.֡ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4QY */
/* JADX INFO: loaded from: classes3.dex */
public final class C0377 extends AbstractC3384 implements InterfaceC1095 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f1848 = EnumC18057.Format3rms;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f1849;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f1850;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f1851;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " " + C3335.m9931(this) + ", " + mo2110();
    }

    public C0377(int i, int i2, int i3, EnumC10297 enumC10297) {
        super(enumC10297);
        C13530.m33077(i);
        this.f1851 = i;
        C13530.m33059(i2);
        this.f1849 = i2;
        this.f1850 = i3;
    }

    @Override // l.InterfaceC11742
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo2109() {
        return this.f1851;
    }

    @Override // l.InterfaceC13153
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo2107() {
        return this.f1849;
    }

    @Override // l.InterfaceC3979
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int mo2110() {
        return this.f1850;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final EnumC18057 mo2108() {
        return f1848;
    }
}
