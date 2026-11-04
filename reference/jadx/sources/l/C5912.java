package l;

/* JADX INFO: renamed from: l.ۚ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4QY */
/* JADX INFO: loaded from: classes3.dex */
public final class C5912 extends AbstractC12384 implements InterfaceC17999 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f20227 = EnumC7011.Format3rms;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f20228;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f20229;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f20230;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " " + C24018.m53572(this) + ", " + mo17155();
    }

    public C5912(int i, int i2, int i3, EnumC22631 enumC22631) {
        super(enumC22631);
        C6544.m18433(i);
        this.f20228 = i;
        C6544.m18436(i2);
        this.f20230 = i2;
        this.f20229 = i3;
    }

    @Override // l.InterfaceC24077
    /* JADX INFO: renamed from: ᩹ */
    public final int mo2772() {
        return this.f20228;
    }

    @Override // l.InterfaceC0210
    /* JADX INFO: renamed from: ۚ */
    public final int mo1655() {
        return this.f20230;
    }

    @Override // l.InterfaceC7668
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int mo17155() {
        return this.f20229;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f20227;
    }
}
