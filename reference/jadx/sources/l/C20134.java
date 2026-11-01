package l;

/* JADX INFO: renamed from: l.᩶ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20134 extends AbstractC3384 implements InterfaceC22263 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f65366 = EnumC18057.Format3rmi;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f65367;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f65368;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f65369;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " " + C3335.m9931(this) + ", " + mo14567();
    }

    public C20134(int i, int i2, int i3, EnumC10297 enumC10297) {
        super(enumC10297);
        C13530.m33077(i);
        this.f65368 = i;
        C13530.m33059(i2);
        this.f65369 = i2;
        this.f65367 = i3;
    }

    @Override // l.InterfaceC11742
    /* JADX INFO: renamed from: ᩴ */
    public final int mo2109() {
        return this.f65368;
    }

    @Override // l.InterfaceC13153
    /* JADX INFO: renamed from: ֨ */
    public final int mo2107() {
        return this.f65369;
    }

    @Override // l.InterfaceC14296
    /* JADX INFO: renamed from: ᩳ */
    public final int mo14567() {
        return this.f65367;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f65366;
    }
}
