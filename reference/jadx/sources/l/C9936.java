package l;

/* JADX INFO: renamed from: l.ۢۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F9T1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9936 extends AbstractC3971 {
    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        return 0;
    }

    public C9936(String str, InterfaceC5878 interfaceC5878) {
        super(interfaceC5878, (byte) 1, str);
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        int i2 = i + 1;
        bArr[i] = 4;
        return (i2 + m12758(this.f13608, i2, bArr)) - i;
    }

    @Override // l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComDeleteDirectory[");
        sb.append(super.toString());
        sb.append(",directoryName=");
        return new String(C8947.m23910(sb, this.f13608, "]"));
    }
}
