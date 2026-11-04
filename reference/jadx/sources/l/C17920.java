package l;

/* JADX INFO: renamed from: l.ܽ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F9ZZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17920 extends AbstractC3971 {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public long f58704;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f58705;

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

    public C17920(InterfaceC5878 interfaceC5878, String str, int i, long j) {
        super(interfaceC5878, (byte) 9, str);
        this.f58705 = i;
        this.f58704 = j;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        C0481.m2319(this.f58705, i, bArr);
        C0481.m2323(this.f58704 / 1000, i + 2, bArr);
        return (i + 16) - i;
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
        StringBuilder sb = new StringBuilder("SmbComSetInformation[");
        sb.append(super.toString());
        sb.append(",filename=");
        sb.append(this.f13608);
        sb.append(",fileAttributes=");
        sb.append(this.f58705);
        sb.append(",lastWriteTime=");
        return new String(C2764.m9137(sb, this.f58704, "]"));
    }
}
