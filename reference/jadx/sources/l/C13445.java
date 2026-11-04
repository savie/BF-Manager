package l;

/* JADX INFO: renamed from: l.۫᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F9Z8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13445 extends AbstractC6209 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f42813;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public byte[] f42814;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f42815;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f42816;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f42817;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
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

    public C13445(int i, InterfaceC5878 interfaceC5878, byte[] bArr) {
        super(interfaceC5878);
        this.f42814 = bArr;
        this.f42813 = i;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m33088() {
        return this.f42814;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final int m33090() {
        return this.f42813;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33086(int i) {
        this.f42813 += i;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final int m33089() {
        return this.f42817;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int m33087() {
        return this.f42816;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        this.f42815 = C0481.m2318(i + 2, bArr);
        this.f42817 = C0481.m2318(i + 6, bArr);
        this.f42816 = C0481.m2318(i + 8, bArr);
        return (i + 20) - i;
    }

    @Override // l.AbstractC6209, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComReadAndXResponse[");
        sb.append(super.toString());
        sb.append(",dataCompactionMode=");
        sb.append(this.f42815);
        sb.append(",dataLength=");
        sb.append(this.f42817);
        sb.append(",dataOffset=");
        return new String(C12669.m31437(this.f42816, "]", sb));
    }
}
