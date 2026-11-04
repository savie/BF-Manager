package l;

/* JADX INFO: renamed from: l.ᩳۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U9U0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18887 extends AbstractC3971 {

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f61304;

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

    public C18887(String str, InterfaceC5878 interfaceC5878) {
        super(interfaceC5878, (byte) 6, str);
        this.f61304 = 6;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        C0481.m2319(this.f61304, i, bArr);
        return 2;
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
        StringBuilder sb = new StringBuilder("SmbComDelete[");
        sb.append(super.toString());
        sb.append(",searchAttributes=0x");
        C8008.m21876(this.f61304, 4, ",fileName=", sb);
        return new String(C8947.m23910(sb, this.f13608, "]"));
    }
}
