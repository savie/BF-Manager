package l;

/* JADX INFO: renamed from: l.ۤۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L4S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10256 extends AbstractC3384 implements InterfaceC13797, InterfaceC10062 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f34968 = EnumC18057.Format35c;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC7446 f34969;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f34970;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f34971;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f34972;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f34973;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f34974;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f34975;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " " + C3335.m9930(this) + ", " + getReference();
    }

    public C10256(EnumC10297 enumC10297, int i, int i2, int i3, int i4, int i5, int i6, InterfaceC7446 interfaceC7446) {
        super(enumC10297);
        C13530.m33063(i);
        this.f34972 = i;
        if (i > 0) {
            C13530.m33071(i2);
        } else {
            i2 = 0;
        }
        this.f34973 = i2;
        if (i > 1) {
            C13530.m33071(i3);
        } else {
            i3 = 0;
        }
        this.f34974 = i3;
        if (i > 2) {
            C13530.m33071(i4);
        } else {
            i4 = 0;
        }
        this.f34970 = i4;
        if (i > 3) {
            C13530.m33071(i5);
        } else {
            i5 = 0;
        }
        this.f34971 = i5;
        if (i > 4) {
            C13530.m33071(i6);
        } else {
            i6 = 0;
        }
        this.f34975 = i6;
        this.f34969 = interfaceC7446;
    }

    @Override // l.InterfaceC13153
    /* JADX INFO: renamed from: ֨ */
    public final int mo2107() {
        return this.f34972;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ۖ */
    public final int mo3085() {
        return this.f34973;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ۨ */
    public final int mo3087() {
        return this.f34974;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ᩹ */
    public final int mo3089() {
        return this.f34970;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ۚ */
    public final int mo3086() {
        return this.f34971;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ܰ */
    public final int mo3088() {
        return this.f34975;
    }

    @Override // l.InterfaceC13859
    public final InterfaceC7446 getReference() {
        return this.f34969;
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        this.f34969 = c8485.m22156(this.f34969);
    }

    @Override // l.InterfaceC13859
    /* JADX INFO: renamed from: ᩵ */
    public final int mo1143() {
        return this.f12506.f35329;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f34968;
    }
}
