package l;

/* JADX INFO: renamed from: l.ۙ۫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAQ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4903 implements InterfaceC19601 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C20528 f17133 = new C20528(200);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17134;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17135;

    @Override // l.InterfaceC10650
    /* JADX INFO: renamed from: ۤ */
    public final int mo4171() {
        return 10;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4903 m15044(int i, int i2) {
        C4903 c4903 = (C4903) f17133.m47061();
        if (c4903 != null) {
            c4903.f17134 = i;
            c4903.f17135 = i2;
            return c4903;
        }
        C4903 c4904 = new C4903();
        c4904.f17134 = i;
        c4904.f17135 = i2;
        return c4904;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m15045() {
        f17133.m47060(this);
    }

    @Override // l.InterfaceC10650
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo15046() {
        return this.f17134;
    }

    @Override // l.InterfaceC19601
    public final int getLineNumber() {
        return this.f17135;
    }
}
