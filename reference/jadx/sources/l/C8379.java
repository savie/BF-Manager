package l;

/* JADX INFO: renamed from: l.۠᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 89WX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8379 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11907 f29101;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11907 f29102;

    public C8379(InterfaceC10601 interfaceC10601, C11907 c11907, C11907 c11908) {
        this.f29101 = new C11907(interfaceC10601, c11907);
        this.f29102 = new C11907(interfaceC10601, c11908);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22008(byte[] bArr) {
        int iM29702 = this.f29101.m29702(4, bArr) + 4;
        int iM29703 = iM29702 + this.f29102.m29702(iM29702, bArr);
        int i = iM29703 - 4;
        bArr[0] = (byte) 129;
        if (i > 65535) {
            bArr[1] = 1;
        }
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        return iM29703;
    }
}
