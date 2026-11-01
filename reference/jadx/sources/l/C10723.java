package l;

/* JADX INFO: renamed from: l.ۧۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10723 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final byte[] f36555 = new byte[0];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f36556;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5614 f36557;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13807 f36558;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f36559 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f36560;

    public C10723(C13807 c13807, int i, int i2, InterfaceC5614 interfaceC5614) {
        this.f36558 = c13807;
        this.f36560 = i;
        this.f36556 = i2;
        this.f36557 = interfaceC5614;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26949(int i, byte[] bArr) {
        if (i == 0) {
            return;
        }
        int i2 = this.f36560;
        this.f36558.m33605(i2, this.f36559 ? this.f36556 : i2, bArr, i, this.f36557);
        try {
            long j = ((long) this.f36560) + ((long) i);
            int i3 = (int) j;
            if (j != i3) {
                throw new ArithmeticException();
            }
            this.f36560 = i3;
            this.f36559 = false;
        } catch (ArithmeticException unused) {
            throw new C3015();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26948() {
        if (this.f36559) {
            this.f36558.m33605(this.f36560, this.f36556, f36555, 0, this.f36557);
            this.f36559 = false;
        }
    }
}
