package l;

/* JADX INFO: renamed from: l.۟ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J4SU */
/* JADX INFO: loaded from: classes4.dex */
public final class C7433 extends AbstractC3384 implements InterfaceC11680 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f24797 = EnumC18057.Format35mi;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f24798;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f24799;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f24800;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f24801;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f24802;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f24803;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f24804;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " " + C3335.m9930(this) + ", " + mo14567();
    }

    public C7433(EnumC10297 enumC10297, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(enumC10297);
        C13530.m33063(i);
        this.f24801 = i;
        if (i > 0) {
            C13530.m33071(i2);
        } else {
            i2 = 0;
        }
        this.f24802 = i2;
        if (i > 1) {
            C13530.m33071(i3);
        } else {
            i3 = 0;
        }
        this.f24803 = i3;
        if (i > 2) {
            C13530.m33071(i4);
        } else {
            i4 = 0;
        }
        this.f24799 = i4;
        if (i > 3) {
            C13530.m33071(i5);
        } else {
            i5 = 0;
        }
        this.f24800 = i5;
        if (i > 4) {
            C13530.m33071(i6);
        } else {
            i6 = 0;
        }
        this.f24804 = i6;
        this.f24798 = i7;
    }

    @Override // l.InterfaceC13153
    /* JADX INFO: renamed from: ֨ */
    public final int mo2107() {
        return this.f24801;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ۖ */
    public final int mo3085() {
        return this.f24802;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ۨ */
    public final int mo3087() {
        return this.f24803;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ᩹ */
    public final int mo3089() {
        return this.f24799;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ۚ */
    public final int mo3086() {
        return this.f24800;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ܰ */
    public final int mo3088() {
        return this.f24804;
    }

    @Override // l.InterfaceC14296
    /* JADX INFO: renamed from: ᩳ */
    public final int mo14567() {
        return this.f24798;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f24797;
    }
}
