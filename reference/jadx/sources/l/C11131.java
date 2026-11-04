package l;

/* JADX INFO: renamed from: l.ۤ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11131 extends AbstractC12384 implements InterfaceC6067, InterfaceC21839 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f35088 = EnumC7011.Format35c;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f35089;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f35090;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f35091;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f35092;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f35093;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC10824 f35094;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f35095;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " " + C24018.m53571(this) + ", " + getReference();
    }

    public C11131(EnumC22631 enumC22631, int i, int i2, int i3, int i4, int i5, int i6, InterfaceC10824 interfaceC10824) {
        super(enumC22631);
        C6544.m18429(i);
        this.f35091 = i;
        if (i > 0) {
            C6544.m18432(i2);
        } else {
            i2 = 0;
        }
        this.f35089 = i2;
        if (i > 1) {
            C6544.m18432(i3);
        } else {
            i3 = 0;
        }
        this.f35095 = i3;
        if (i > 2) {
            C6544.m18432(i4);
        } else {
            i4 = 0;
        }
        this.f35093 = i4;
        if (i > 3) {
            C6544.m18432(i5);
        } else {
            i5 = 0;
        }
        this.f35090 = i5;
        if (i > 4) {
            C6544.m18432(i6);
        } else {
            i6 = 0;
        }
        this.f35092 = i6;
        this.f35094 = interfaceC10824;
    }

    @Override // l.InterfaceC0210
    /* JADX INFO: renamed from: ۚ */
    public final int mo1655() {
        return this.f35091;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩴ */
    public final int mo7063() {
        return this.f35089;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩸ */
    public final int mo7065() {
        return this.f35095;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ۫ */
    public final int mo7061() {
        return this.f35093;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ܳ */
    public final int mo7062() {
        return this.f35090;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩷ */
    public final int mo7064() {
        return this.f35092;
    }

    @Override // l.InterfaceC6177
    public final InterfaceC10824 getReference() {
        return this.f35094;
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        this.f35094 = c8850.m23714(this.f35094);
    }

    @Override // l.InterfaceC6177
    /* JADX INFO: renamed from: ᩵ */
    public final int mo2771() {
        return this.f39756.f73513;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f35088;
    }
}
