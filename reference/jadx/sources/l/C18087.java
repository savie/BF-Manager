package l;

/* JADX INFO: renamed from: l.ܿۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4YT */
/* JADX INFO: loaded from: classes5.dex */
public final class C18087 extends AbstractC6419 implements InterfaceC15015 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f59186 = EnumC7011.Format21t;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f59187;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", " + mo11703();
    }

    public C18087(EnumC22631 enumC22631, int i, C21335 c21335) {
        super(enumC22631, c21335);
        C6544.m18435(i);
        this.f59187 = i;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f59187;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f59186;
    }
}
