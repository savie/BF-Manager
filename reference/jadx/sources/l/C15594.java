package l;

/* JADX INFO: renamed from: l.ܳ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 89WX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15594 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19126 f50694;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C19126 f50695;

    public C15594(InterfaceC5878 interfaceC5878, C19126 c19126, C19126 c19127) {
        this.f50694 = new C19126(interfaceC5878, c19126);
        this.f50695 = new C19126(interfaceC5878, c19127);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37326(byte[] bArr) {
        int iM44257 = this.f50694.m44257(4, bArr) + 4;
        int iM44258 = iM44257 + this.f50695.m44257(iM44257, bArr);
        int i = iM44258 - 4;
        bArr[0] = (byte) 129;
        if (i > 65535) {
            bArr[1] = 1;
        }
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        return iM44258;
    }
}
