package l;

/* JADX INFO: renamed from: l.۟֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 455Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C7539 extends AbstractC24188 implements InterfaceC10015 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f24873 = new C0081();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f24874;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte f24875;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte f24876;

    public C7539(EnumC7779 enumC7779, short s, short s2, short s3) {
        super(enumC7779);
        if (s >= 256 || s2 >= 256 || s3 >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f24875 = (byte) s;
        this.f24874 = (byte) s2;
        this.f24876 = (byte) s3;
    }

    public C7539(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f24875 = bArr[i + 1];
        this.f24874 = bArr[i + 2];
        this.f24876 = bArr[i + 3];
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(this.f24875);
        c24166.m54138(this.f24874);
        c24166.m54138(this.f24876);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format23x;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f24875 & 255;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m20603() {
        return this.f24874 & 255;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m20602() {
        return this.f24876 & 255;
    }
}
