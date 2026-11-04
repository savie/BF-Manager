package l;

/* JADX INFO: renamed from: l.ܳ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9YR */
/* JADX INFO: loaded from: classes5.dex */
public final class C15682 extends AbstractC6209 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f50988;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f50989;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f50990;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f50991;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public long f50992;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f50993;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        return 0;
    }

    public C15682(InterfaceC5878 interfaceC5878, int i, long j, int i2) {
        super(interfaceC5878, (byte) 46, (AbstractC3971) null);
        this.f50989 = i;
        this.f50992 = j;
        this.f50993 = i2;
        this.f50991 = i2;
        this.f50988 = -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37458(int i) {
        this.f50991 = i;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final void m37459() {
        this.f50993 = 1024;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m37461(int i) {
        this.f50988 = i;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final void m37460() {
        this.f50990 = 1024;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        C0481.m2319(this.f50989, i, bArr);
        long j = this.f50992;
        C0481.m2323(j, i + 2, bArr);
        C0481.m2319(this.f50991, i + 6, bArr);
        C0481.m2319(this.f50993, i + 8, bArr);
        C0481.m2323(this.f50988, i + 10, bArr);
        C0481.m2319(this.f50990, i + 14, bArr);
        C0481.m2323(j >> 32, i + 16, bArr);
        return (i + 20) - i;
    }

    @Override // l.AbstractC6209, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComReadAndX[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f50989);
        sb.append(",offset=");
        long j = this.f50992;
        sb.append(j);
        sb.append(",maxCount=");
        sb.append(this.f50991);
        sb.append(",minCount=");
        sb.append(this.f50993);
        sb.append(",openTimeout=");
        sb.append(this.f50988);
        sb.append(",remaining=");
        sb.append(this.f50990);
        sb.append(",offset=");
        sb.append(j);
        sb.append("]");
        return new String(sb.toString());
    }
}
