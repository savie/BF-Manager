package l;

/* JADX INFO: renamed from: l.ܽۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V5UF */
/* JADX INFO: loaded from: classes5.dex */
public final class C16606 extends AbstractC3384 implements InterfaceC13091, InterfaceC10062 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f53286 = EnumC18057.Format45cc;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC7446 f53287;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f53288;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f53289;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f53290;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f53291;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC7446 f53292;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f53293;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f53294;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " " + C3335.m9930(this) + ", " + getReference() + ", " + mo3896();
    }

    public C16606(EnumC10297 enumC10297, int i, int i2, int i3, int i4, int i5, int i6, InterfaceC7446 interfaceC7446, InterfaceC7446 interfaceC7447) {
        super(enumC10297);
        C13530.m33063(i);
        this.f53293 = i;
        if (i > 0) {
            C13530.m33071(i2);
        } else {
            i2 = 0;
        }
        this.f53290 = i2;
        if (i > 1) {
            C13530.m33071(i3);
        } else {
            i3 = 0;
        }
        this.f53288 = i3;
        if (i > 2) {
            C13530.m33071(i4);
        } else {
            i4 = 0;
        }
        this.f53289 = i4;
        if (i > 3) {
            C13530.m33071(i5);
        } else {
            i5 = 0;
        }
        this.f53294 = i5;
        if (i > 4) {
            C13530.m33071(i6);
        } else {
            i6 = 0;
        }
        this.f53291 = i6;
        this.f53287 = interfaceC7446;
        this.f53292 = interfaceC7447;
    }

    @Override // l.InterfaceC13153
    /* JADX INFO: renamed from: ֨ */
    public final int mo2107() {
        return this.f53293;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ۖ */
    public final int mo3085() {
        return this.f53290;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ۨ */
    public final int mo3087() {
        return this.f53288;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ᩹ */
    public final int mo3089() {
        return this.f53289;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ۚ */
    public final int mo3086() {
        return this.f53294;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ܰ */
    public final int mo3088() {
        return this.f53291;
    }

    @Override // l.InterfaceC13859
    public final InterfaceC7446 getReference() {
        return this.f53287;
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        this.f53287 = c8485.m22156(this.f53287);
        this.f53292 = c8485.m22156(this.f53292);
    }

    @Override // l.InterfaceC13859
    /* JADX INFO: renamed from: ᩵ */
    public final int mo1143() {
        return this.f12506.f35329;
    }

    @Override // l.InterfaceC17117
    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC7446 mo3896() {
        return this.f53292;
    }

    @Override // l.InterfaceC17117
    /* JADX INFO: renamed from: ۟ */
    public final int mo3895() {
        return this.f12506.f35325;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f53286;
    }
}
