package l;

/* JADX INFO: renamed from: l.ۨ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: DA0R */
/* JADX INFO: loaded from: classes4.dex */
public final class C12699 extends AbstractC3971 {

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f40672;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f40673;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f40674;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f40675;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f40676;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f40677;

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

    public C12699(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878, (byte) 11);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31494(int i, long j, int i2, byte[] bArr, int i3, int i4) {
        this.f40673 = i;
        this.f40672 = (int) (j & 4294967295L);
        this.f40675 = i2;
        this.f40676 = bArr;
        this.f40677 = i3;
        this.f40674 = i4;
        this.f13583 = null;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        C0481.m2319(this.f40673, i, bArr);
        C0481.m2319(this.f40674, i + 2, bArr);
        C0481.m2323(this.f40672, i + 4, bArr);
        C0481.m2319(this.f40675, i + 8, bArr);
        return (i + 10) - i;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        bArr[i] = 1;
        C0481.m2319(this.f40674, i + 1, bArr);
        int i2 = i + 3;
        System.arraycopy(this.f40676, this.f40677, bArr, i2, this.f40674);
        return (i2 + this.f40674) - i;
    }

    @Override // l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWrite[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f40673);
        sb.append(",count=");
        sb.append(this.f40674);
        sb.append(",offset=");
        sb.append(this.f40672);
        sb.append(",remaining=");
        return new String(C12669.m31437(this.f40675, "]", sb));
    }
}
