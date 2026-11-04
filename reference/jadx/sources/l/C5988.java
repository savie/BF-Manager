package l;

/* JADX INFO: renamed from: l.ۚ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9Y3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5988 extends AbstractC3971 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f20502;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public String f20503;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public String f20504;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        return 0;
    }

    public C5988(InterfaceC5878 interfaceC5878, String str, String str2) {
        super(interfaceC5878, (byte) 7);
        this.f20503 = str;
        this.f20504 = str2;
        this.f20502 = 22;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        C0481.m2319(this.f20502, i, bArr);
        return 2;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        int i2 = i + 1;
        bArr[i] = 4;
        int iM12758 = i2 + m12758(this.f20503, i2, bArr);
        int i3 = iM12758 + 1;
        bArr[iM12758] = 4;
        if (m12781()) {
            bArr[i3] = 0;
            i3 = iM12758 + 2;
        }
        return (i3 + m12758(this.f20504, i3, bArr)) - i;
    }

    @Override // l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComRename[");
        sb.append(super.toString());
        sb.append(",searchAttributes=0x");
        C8008.m21876(this.f20502, 4, ",oldFileName=", sb);
        sb.append(this.f20503);
        sb.append(",newFileName=");
        return new String(C8947.m23910(sb, this.f20504, "]"));
    }
}
