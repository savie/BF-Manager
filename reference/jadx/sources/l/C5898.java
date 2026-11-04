package l;

/* JADX INFO: renamed from: l.ۚ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5898 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f20191;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC14846 f20192;

    public C5898(int i) {
        byte[] bArr = new byte[i];
        this.f20191 = bArr;
        int i2 = AbstractC14846.f48541;
        this.f20192 = new C6644(bArr, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17084 m17119() {
        if (this.f20192.mo18582() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        return new C11863(this.f20191);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC14846 m17120() {
        return this.f20192;
    }
}
