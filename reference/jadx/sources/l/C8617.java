package l;

/* JADX INFO: renamed from: l.ۡۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAQ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8617 implements InterfaceC15707 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static C19805 f29739 = new C19805(200);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f29740;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f29741;

    @Override // l.InterfaceC7239
    /* JADX INFO: renamed from: ۨ */
    public final int mo1599() {
        return 10;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8617 m22392(int i, int i2) {
        C8617 c8617 = (C8617) f29739.m45009();
        if (c8617 != null) {
            c8617.f29740 = i;
            c8617.f29741 = i2;
            return c8617;
        }
        C8617 c8618 = new C8617();
        c8618.f29740 = i;
        c8618.f29741 = i2;
        return c8618;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m22393() {
        f29739.m45011(this);
    }

    @Override // l.InterfaceC7239
    /* JADX INFO: renamed from: ۖ */
    public final int mo17670() {
        return this.f29740;
    }

    @Override // l.InterfaceC15707
    public final int getLineNumber() {
        return this.f29741;
    }
}
