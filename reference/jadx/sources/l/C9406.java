package l;

/* JADX INFO: renamed from: l.ۢۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 84PD */
/* JADX INFO: loaded from: classes4.dex */
public final class C9406 extends AbstractC3384 implements InterfaceC8214 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f31886 = EnumC18057.Format12x;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f31887;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f31888;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", v" + mo1144();
    }

    public C9406(EnumC10297 enumC10297, int i, int i2) {
        super(enumC10297);
        C13530.m33071(i);
        this.f31887 = i;
        C13530.m33071(i2);
        this.f31888 = i2;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f31887;
    }

    @Override // l.InterfaceC1157
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1144() {
        return this.f31888;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f31886;
    }
}
