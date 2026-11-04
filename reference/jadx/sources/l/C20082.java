package l;

/* JADX INFO: renamed from: l.ᩴ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5UP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20082 extends AbstractC12384 implements InterfaceC3829 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f64539 = EnumC7011.Format35ms;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f64540;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f64541;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f64542;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f64543;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f64544;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f64545;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f64546;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " " + C24018.m53571(this) + ", " + mo17155();
    }

    public C20082(EnumC22631 enumC22631, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(enumC22631);
        C6544.m18429(i);
        this.f64540 = i;
        if (i > 0) {
            C6544.m18432(i2);
        } else {
            i2 = 0;
        }
        this.f64545 = i2;
        if (i > 1) {
            C6544.m18432(i3);
        } else {
            i3 = 0;
        }
        this.f64542 = i3;
        if (i > 2) {
            C6544.m18432(i4);
        } else {
            i4 = 0;
        }
        this.f64546 = i4;
        if (i > 3) {
            C6544.m18432(i5);
        } else {
            i5 = 0;
        }
        this.f64544 = i5;
        if (i > 4) {
            C6544.m18432(i6);
        } else {
            i6 = 0;
        }
        this.f64541 = i6;
        this.f64543 = i7;
    }

    @Override // l.InterfaceC0210
    /* JADX INFO: renamed from: ۚ */
    public final int mo1655() {
        return this.f64540;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩴ */
    public final int mo7063() {
        return this.f64545;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩸ */
    public final int mo7065() {
        return this.f64542;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ۫ */
    public final int mo7061() {
        return this.f64546;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ܳ */
    public final int mo7062() {
        return this.f64544;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩷ */
    public final int mo7064() {
        return this.f64541;
    }

    @Override // l.InterfaceC7668
    /* JADX INFO: renamed from: ᩶ */
    public final int mo17155() {
        return this.f64543;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f64539;
    }
}
