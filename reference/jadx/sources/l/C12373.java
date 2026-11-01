package l;

/* JADX INFO: renamed from: l.۫ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X4UE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12373 extends AbstractC3384 implements InterfaceC3917, InterfaceC10062 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f41354 = EnumC18057.Format4rcc;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC7446 f41355;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f41356;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC7446 f41357;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f41358;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " " + C3335.m9931(this) + ", " + getReference() + ", " + mo3896();
    }

    public C12373(EnumC10297 enumC10297, int i, int i2, InterfaceC7446 interfaceC7446, InterfaceC7446 interfaceC7447) {
        super(enumC10297);
        C13530.m33077(i);
        this.f41358 = i;
        C13530.m33059(i2);
        this.f41356 = i2;
        this.f41355 = interfaceC7446;
        this.f41357 = interfaceC7447;
    }

    @Override // l.InterfaceC11742
    /* JADX INFO: renamed from: ᩴ */
    public final int mo2109() {
        return this.f41358;
    }

    @Override // l.InterfaceC13153
    /* JADX INFO: renamed from: ֨ */
    public final int mo2107() {
        return this.f41356;
    }

    @Override // l.InterfaceC13859
    public final InterfaceC7446 getReference() {
        return this.f41355;
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        this.f41355 = c8485.m22156(this.f41355);
        this.f41357 = c8485.m22156(this.f41357);
    }

    @Override // l.InterfaceC13859
    /* JADX INFO: renamed from: ᩵ */
    public final int mo1143() {
        return this.f12506.f35329;
    }

    @Override // l.InterfaceC17117
    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC7446 mo3896() {
        return this.f41357;
    }

    @Override // l.InterfaceC17117
    /* JADX INFO: renamed from: ۟ */
    public final int mo3895() {
        return this.f12506.f35325;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f41354;
    }
}
