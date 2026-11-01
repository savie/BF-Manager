package l;

/* JADX INFO: renamed from: l.֫ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4NV */
/* JADX INFO: loaded from: classes3.dex */
public final class C1643 extends AbstractC3384 implements InterfaceC18797 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f6567 = EnumC18057.Format11x;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f6568;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140();
    }

    public C1643(int i, EnumC10297 enumC10297) {
        super(enumC10297);
        C13530.m33075(i);
        this.f6568 = i;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f6568;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f6567;
    }
}
