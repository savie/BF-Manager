package l;

/* JADX INFO: renamed from: l.ܺۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N5T1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15901 extends AbstractC3384 implements InterfaceC5329, InterfaceC10062 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f51494 = EnumC18057.Format3rc;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC7446 f51495;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f51496;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f51497;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " " + C3335.m9931(this) + ", " + getReference();
    }

    public C15901(EnumC10297 enumC10297, int i, int i2, InterfaceC7446 interfaceC7446) {
        super(enumC10297);
        C13530.m33077(i);
        this.f51496 = i;
        C13530.m33059(i2);
        this.f51497 = i2;
        this.f51495 = interfaceC7446;
    }

    @Override // l.InterfaceC11742
    /* JADX INFO: renamed from: ᩴ */
    public final int mo2109() {
        return this.f51496;
    }

    @Override // l.InterfaceC13153
    /* JADX INFO: renamed from: ֨ */
    public final int mo2107() {
        return this.f51497;
    }

    @Override // l.InterfaceC13859
    public final InterfaceC7446 getReference() {
        return this.f51495;
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        this.f51495 = c8485.m22156(this.f51495);
    }

    @Override // l.InterfaceC13859
    /* JADX INFO: renamed from: ᩵ */
    public final int mo1143() {
        return this.f12506.f35329;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f51494;
    }
}
