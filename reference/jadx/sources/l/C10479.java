package l;

/* JADX INFO: renamed from: l.ۢ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29EQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10479 implements InterfaceC14164 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f33341 = {-3, 83, 77, 66};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f33342;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f33343;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f33344;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f33345;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f33346;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f33347;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f33348;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f33349;

    public C10479(long j, int i, byte[] bArr) {
        this.f33343 = new byte[16];
        this.f33349 = bArr;
        this.f33347 = i;
        this.f33346 = 0;
        this.f33342 = 1;
        this.f33345 = j;
    }

    public C10479() {
        this.f33343 = new byte[16];
        this.f33349 = new byte[16];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m26908(C7453 c7453) {
        this.f33348 = c7453.m56029();
        c7453.m56007(4, f33341);
        byte[] bArr = this.f33343;
        c7453.m56007(bArr.length, bArr);
        byte[] bArr2 = this.f33349;
        c7453.m56007(bArr2.length, bArr2);
        c7453.m20459(16 - this.f33349.length);
        c7453.m56025(this.f33347);
        c7453.m56023(this.f33346);
        c7453.m56023(this.f33342);
        c7453.m56008(this.f33345);
    }

    @Override // l.InterfaceC14164
    /* JADX INFO: renamed from: ۙ */
    public final void mo4192(C7453 c7453) throws C2013 {
        this.f33348 = c7453.m56029();
        C18684.m43448(c7453, f33341);
        if (this.f33343.length != 16) {
            this.f33343 = new byte[16];
        }
        byte[] bArr = this.f33343;
        c7453.m56024(bArr.length, bArr);
        if (this.f33349.length != 16) {
            this.f33349 = new byte[16];
        }
        byte[] bArr2 = this.f33349;
        c7453.m56024(bArr2.length, bArr2);
        this.f33347 = c7453.m56002();
        this.f33346 = c7453.m56017();
        this.f33342 = c7453.m56017();
        this.f33345 = c7453.m56018();
        this.f33344 = c7453.m56019();
    }

    @Override // l.InterfaceC14164
    /* JADX INFO: renamed from: ۙ */
    public final int mo4190() {
        return this.f33348;
    }

    @Override // l.InterfaceC14164
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4193() {
        return this.f33344;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m26903() {
        return this.f33343;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] m26909() {
        return this.f33349;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m26907() {
        return this.f33347;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m26906() {
        return this.f33346;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m26904() {
        return this.f33342;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long m26905() {
        return this.f33345;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26902(byte[] bArr) {
        return C18684.m43450(bArr, f33341);
    }
}
