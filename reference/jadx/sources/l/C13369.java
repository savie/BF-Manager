package l;

/* JADX INFO: renamed from: l.۫᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SF */
/* JADX INFO: loaded from: classes4.dex */
public final class C13369 extends AbstractC12384 implements InterfaceC20983 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f42610 = EnumC7011.Format3rmi;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f42611;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f42612;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f42613;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " " + C24018.m53572(this) + ", " + mo18517();
    }

    public C13369(int i, int i2, int i3, EnumC22631 enumC22631) {
        super(enumC22631);
        C6544.m18433(i);
        this.f42612 = i;
        C6544.m18436(i2);
        this.f42611 = i2;
        this.f42613 = i3;
    }

    @Override // l.InterfaceC24077
    /* JADX INFO: renamed from: ᩹ */
    public final int mo2772() {
        return this.f42612;
    }

    @Override // l.InterfaceC0210
    /* JADX INFO: renamed from: ۚ */
    public final int mo1655() {
        return this.f42611;
    }

    @Override // l.InterfaceC15871
    /* JADX INFO: renamed from: ܶ */
    public final int mo18517() {
        return this.f42613;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f42610;
    }
}
