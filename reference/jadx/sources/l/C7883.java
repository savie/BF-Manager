package l;

/* JADX INFO: renamed from: l.۠ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C7883 extends AbstractC6471 implements InterfaceC16412, InterfaceC10062 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C3067 f25916;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f25917;

    @Override // l.InterfaceC7239
    /* JADX INFO: renamed from: ۨ */
    public final int mo1599() {
        return 9;
    }

    public C7883(int i, String str) {
        super(i);
        this.f25917 = str;
    }

    @Override // l.InterfaceC16412
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String mo20789() {
        return this.f25917;
    }

    @Override // l.InterfaceC16412
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20852 mo20790() {
        C3067 c3067 = this.f25916;
        if (c3067 != null) {
            return c3067;
        }
        if (this.f25917 == null) {
            return null;
        }
        return new C18466(this);
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        this.f25916 = c8485.m22152(this.f25917);
    }
}
