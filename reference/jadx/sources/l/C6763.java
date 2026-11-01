package l;

/* JADX INFO: renamed from: l.ۜ۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 274A */
/* JADX INFO: loaded from: classes3.dex */
public final class C6763 implements InterfaceC20723 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 f22846;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 f22847;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1118 f22848;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C1263 f22849;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f22850 = true;

    public C6763(C1263 c1263, InterfaceC20723 interfaceC20723, InterfaceC1118 interfaceC1118) {
        this.f22849 = c1263;
        this.f22847 = interfaceC20723;
        this.f22846 = interfaceC20723;
        this.f22848 = interfaceC1118;
    }

    public C6763(C1263 c1263, C19984 c19984, InterfaceC20723 interfaceC20723, C18267 c18267) {
        this.f22849 = c1263;
        this.f22847 = c19984;
        this.f22846 = interfaceC20723;
        this.f22848 = c18267;
    }

    public C6763(C1263 c1263, InterfaceC20723 interfaceC20723, InterfaceC20723 interfaceC20724, InterfaceC1118 interfaceC1118) {
        this.f22849 = c1263;
        this.f22847 = interfaceC20723;
        this.f22846 = interfaceC20724;
        this.f22848 = interfaceC1118;
    }

    @Override // l.InterfaceC20723
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15785 mo4000() {
        return new C3940(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17588 m18335(C6763 c6763, C15327 c15327) {
        C0654 c0654 = new C0654();
        c0654.m2972(c15327);
        C12650 c12650 = new C12650();
        c12650.m31436(c15327);
        c12650.m31437(c6763.f22847);
        c12650.m31434(c0654);
        c12650.m31435(new C5800(6));
        c12650.m31433(2);
        c12650.m31438();
        return c12650.mo4000();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20723 m18336(C1263 c1263) {
        C15327 c15327M4583 = c1263.m4583();
        if (c15327M4583 == null) {
            return C15473.f50421;
        }
        C12650 c12650 = new C12650();
        c12650.m31436(c15327M4583);
        c12650.m31437((InterfaceC20723) null);
        c12650.m31434((C0654) null);
        c12650.m31435(new C22286());
        c12650.m31433(0);
        c12650.m31438();
        return c12650;
    }
}
