package l;

/* JADX INFO: renamed from: l.ۙ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: A593 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5166 extends AbstractC6419 implements InterfaceC20237 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f18013 = EnumC7011.Format31t;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f18014;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", " + mo11703();
    }

    public C5166(EnumC22631 enumC22631, int i, C21335 c21335) {
        super(enumC22631, c21335);
        C6544.m18435(i);
        this.f18014 = i;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f18014;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f18013;
    }
}
