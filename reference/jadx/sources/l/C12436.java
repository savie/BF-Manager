package l;

/* JADX INFO: renamed from: l.۫۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12436 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f41489;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f41490;

    public C12436(int i) {
        byte[] bArr = new byte[i];
        this.f41489 = bArr;
        int i2 = AbstractC22044.f71447;
        this.f41490 = new C11461(bArr, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23725 m30909() {
        if (this.f41490.mo28606() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        return new C6085(this.f41489);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m30910() {
        return this.f41490;
    }
}
