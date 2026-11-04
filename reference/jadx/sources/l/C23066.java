package l;

/* JADX INFO: renamed from: l.᩸᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4SU */
/* JADX INFO: loaded from: classes2.dex */
public final class C23066 extends AbstractC12384 implements InterfaceC23967 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f74825 = EnumC7011.Format35mi;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f74826;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f74827;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f74828;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f74829;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f74830;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f74831;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f74832;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " " + C24018.m53571(this) + ", " + mo18517();
    }

    public C23066(EnumC22631 enumC22631, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(enumC22631);
        C6544.m18429(i);
        this.f74828 = i;
        if (i > 0) {
            C6544.m18432(i2);
        } else {
            i2 = 0;
        }
        this.f74826 = i2;
        if (i > 1) {
            C6544.m18432(i3);
        } else {
            i3 = 0;
        }
        this.f74832 = i3;
        if (i > 2) {
            C6544.m18432(i4);
        } else {
            i4 = 0;
        }
        this.f74830 = i4;
        if (i > 3) {
            C6544.m18432(i5);
        } else {
            i5 = 0;
        }
        this.f74827 = i5;
        if (i > 4) {
            C6544.m18432(i6);
        } else {
            i6 = 0;
        }
        this.f74829 = i6;
        this.f74831 = i7;
    }

    @Override // l.InterfaceC0210
    /* JADX INFO: renamed from: ۚ */
    public final int mo1655() {
        return this.f74828;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩴ */
    public final int mo7063() {
        return this.f74826;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩸ */
    public final int mo7065() {
        return this.f74832;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ۫ */
    public final int mo7061() {
        return this.f74830;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ܳ */
    public final int mo7062() {
        return this.f74827;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩷ */
    public final int mo7064() {
        return this.f74829;
    }

    @Override // l.InterfaceC15871
    /* JADX INFO: renamed from: ܶ */
    public final int mo18517() {
        return this.f74831;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f74825;
    }
}
