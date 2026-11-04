package l;

/* JADX INFO: renamed from: l.ܺ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17125 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f55868 = new byte[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7509 f55869;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f55870 = true;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0498 f55871;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f55872;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f55873;

    public C17125(C0498 c0498, int i, int i2, InterfaceC7509 interfaceC7509) {
        this.f55871 = c0498;
        this.f55872 = i;
        this.f55873 = i2;
        this.f55869 = interfaceC7509;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40282(int i, byte[] bArr) {
        if (i == 0) {
            return;
        }
        int i2 = this.f55872;
        this.f55871.m2454(i2, this.f55870 ? this.f55873 : i2, bArr, i, this.f55869);
        try {
            long j = ((long) this.f55872) + ((long) i);
            int i3 = (int) j;
            if (j != i3) {
                throw new ArithmeticException();
            }
            this.f55872 = i3;
            this.f55870 = false;
        } catch (ArithmeticException unused) {
            throw new C12562();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40281() {
        if (this.f55870) {
            this.f55871.m2454(this.f55872, this.f55873, f55868, 0, this.f55869);
            this.f55870 = false;
        }
    }
}
