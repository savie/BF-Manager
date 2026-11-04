package l;

/* JADX INFO: renamed from: l.֫᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5UF */
/* JADX INFO: loaded from: classes3.dex */
public final class C2183 extends AbstractC12384 implements InterfaceC0100, InterfaceC21839 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f7178 = EnumC7011.Format45cc;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC10824 f7179;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f7180;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f7181;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f7182;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f7183;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f7184;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC10824 f7185;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f7186;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " " + C24018.m53571(this) + ", " + getReference() + ", " + mo2769();
    }

    public C2183(EnumC22631 enumC22631, int i, int i2, int i3, int i4, int i5, int i6, InterfaceC10824 interfaceC10824, InterfaceC10824 interfaceC10825) {
        super(enumC22631);
        C6544.m18429(i);
        this.f7186 = i;
        if (i > 0) {
            C6544.m18432(i2);
        } else {
            i2 = 0;
        }
        this.f7182 = i2;
        if (i > 1) {
            C6544.m18432(i3);
        } else {
            i3 = 0;
        }
        this.f7184 = i3;
        if (i > 2) {
            C6544.m18432(i4);
        } else {
            i4 = 0;
        }
        this.f7180 = i4;
        if (i > 3) {
            C6544.m18432(i5);
        } else {
            i5 = 0;
        }
        this.f7183 = i5;
        if (i > 4) {
            C6544.m18432(i6);
        } else {
            i6 = 0;
        }
        this.f7181 = i6;
        this.f7185 = interfaceC10824;
        this.f7179 = interfaceC10825;
    }

    @Override // l.InterfaceC0210
    /* JADX INFO: renamed from: ۚ */
    public final int mo1655() {
        return this.f7186;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩴ */
    public final int mo7063() {
        return this.f7182;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩸ */
    public final int mo7065() {
        return this.f7184;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ۫ */
    public final int mo7061() {
        return this.f7180;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ܳ */
    public final int mo7062() {
        return this.f7183;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩷ */
    public final int mo7064() {
        return this.f7181;
    }

    @Override // l.InterfaceC6177
    public final InterfaceC10824 getReference() {
        return this.f7185;
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        this.f7185 = c8850.m23714(this.f7185);
        this.f7179 = c8850.m23714(this.f7179);
    }

    @Override // l.InterfaceC6177
    /* JADX INFO: renamed from: ᩵ */
    public final int mo2771() {
        return this.f39756.f73513;
    }

    @Override // l.InterfaceC11396
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10824 mo2769() {
        return this.f7179;
    }

    @Override // l.InterfaceC11396
    /* JADX INFO: renamed from: ᩺ */
    public final int mo2773() {
        return this.f39756.f73510;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f7178;
    }
}
