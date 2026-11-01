package l;

/* JADX INFO: renamed from: l.᩺ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 29EQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23060 implements InterfaceC8657 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final byte[] f74908 = {-3, 83, 77, 66};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f74909;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f74910;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74911;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f74912;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f74913;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f74914;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f74915;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f74916;

    public C23060(long j, int i, byte[] bArr) {
        this.f74914 = new byte[16];
        this.f74910 = bArr;
        this.f74912 = i;
        this.f74916 = 0;
        this.f74911 = 1;
        this.f74909 = j;
    }

    public C23060() {
        this.f74914 = new byte[16];
        this.f74910 = new byte[16];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51010(C19240 c19240) {
        this.f74915 = c19240.m27402();
        c19240.m27383(4, f74908);
        byte[] bArr = this.f74914;
        c19240.m27383(bArr.length, bArr);
        byte[] bArr2 = this.f74910;
        c19240.m27383(bArr2.length, bArr2);
        c19240.m44194(16 - this.f74910.length);
        c19240.m27398(this.f74912);
        c19240.m27396(this.f74916);
        c19240.m27396(this.f74911);
        c19240.m27384(this.f74909);
    }

    @Override // l.InterfaceC8657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4333(C19240 c19240) throws C17271 {
        this.f74915 = c19240.m27402();
        C1186.m4322(c19240, f74908);
        if (this.f74914.length != 16) {
            this.f74914 = new byte[16];
        }
        byte[] bArr = this.f74914;
        c19240.m27397(bArr.length, bArr);
        if (this.f74910.length != 16) {
            this.f74910 = new byte[16];
        }
        byte[] bArr2 = this.f74910;
        c19240.m27397(bArr2.length, bArr2);
        this.f74912 = c19240.m27378();
        this.f74916 = c19240.m27375();
        this.f74911 = c19240.m27375();
        this.f74909 = c19240.m27401();
        this.f74913 = c19240.m27400();
    }

    @Override // l.InterfaceC8657
    /* JADX INFO: renamed from: ۙ */
    public final int mo4329() {
        return this.f74915;
    }

    @Override // l.InterfaceC8657
    /* JADX INFO: renamed from: ܰ */
    public final int mo4342() {
        return this.f74913;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] m51009() {
        return this.f74914;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] m51006() {
        return this.f74910;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m51007() {
        return this.f74912;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m51011() {
        return this.f74916;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m51008() {
        return this.f74911;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long m51005() {
        return this.f74909;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51004(byte[] bArr) {
        return C1186.m4324(bArr, f74908);
    }
}
