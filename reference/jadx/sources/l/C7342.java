package l;

/* JADX INFO: renamed from: l.۟۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A28 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7342 extends AbstractC6240 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public byte f24395;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public byte[] f24396;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) throws C2796 {
        if (C4850.m13545(i, bArr) != 24) {
            throw new C2796("Expected structureSize = 24");
        }
        this.f24395 = bArr[i + 2];
        byte[] bArr2 = new byte[16];
        this.f24396 = bArr2;
        System.arraycopy(bArr, i + 8, bArr2, 0, 16);
        return (i + 24) - i;
    }

    @Override // l.AbstractC12591
    public final String toString() {
        StringBuilder sb = new StringBuilder("Smb2OpblockBreakNotification[oplockLevel=");
        sb.append((int) this.f24395);
        sb.append(",fileId=");
        byte[] bArr = this.f24396;
        sb.append(C5993.m16281(bArr, 0, bArr.length));
        sb.append("]");
        return sb.toString();
    }
}
