package l;

/* JADX INFO: renamed from: l.֡᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8897 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0653 extends AbstractC8111 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f2519;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f2520;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f2521;

    public C0653(long j, int i, byte[] bArr) {
        this.f2520 = bArr;
        this.f26776 = j;
        this.f2519 = 0;
        this.f2521 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m2856() {
        return this.f2521 > 0;
    }

    @Override // l.AbstractC8111
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo2857(byte[] bArr) {
        int length = bArr.length;
        int i = this.f2521;
        if (length > i) {
            length = i;
        }
        System.arraycopy(this.f2520, this.f2519, bArr, 0, length);
        this.f2519 += length;
        this.f2521 -= length;
        return length;
    }

    @Override // l.AbstractC8111
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo2855() {
        return this.f2521;
    }
}
