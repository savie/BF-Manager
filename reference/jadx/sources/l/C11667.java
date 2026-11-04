package l;

/* JADX INFO: renamed from: l.ۧܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A28 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11667 extends AbstractC12108 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public byte f37809;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f37810;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) throws C19061 {
        if (C0481.m2318(i, bArr) != 24) {
            throw new C19061("Expected structureSize = 24");
        }
        this.f37809 = bArr[i + 2];
        byte[] bArr2 = new byte[16];
        this.f37810 = bArr2;
        System.arraycopy(bArr, i + 8, bArr2, 0, 16);
        return (i + 24) - i;
    }

    @Override // l.AbstractC3159
    public final String toString() {
        StringBuilder sb = new StringBuilder("Smb2OpblockBreakNotification[oplockLevel=");
        sb.append((int) this.f37809);
        sb.append(",fileId=");
        byte[] bArr = this.f37810;
        sb.append(C6033.m17504(bArr, 0, bArr.length));
        sb.append("]");
        return sb.toString();
    }
}
