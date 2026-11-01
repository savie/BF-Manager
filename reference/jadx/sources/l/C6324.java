package l;

/* JADX INFO: renamed from: l.ۛ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I9WL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6324 implements InterfaceC1903 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f21359;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f21360;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f21361;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21362;

    @Override // l.InterfaceC1903
    /* JADX INFO: renamed from: ۖ */
    public final long mo6208() {
        return this.f21360 * ((long) this.f21361) * ((long) this.f21362);
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        this.f21361 = C4850.m13549(i + 4, bArr);
        this.f21360 = C4850.m13549(i + 8, bArr);
        this.f21359 = C4850.m13549(i + 12, bArr);
        this.f21362 = C4850.m13545(i + 16, bArr);
        return (i + 20) - i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbInfoAllocation[alloc=");
        sb.append(this.f21360);
        sb.append(",free=");
        sb.append(this.f21359);
        sb.append(",sectPerAlloc=");
        sb.append(this.f21361);
        sb.append(",bytesPerSect=");
        return new String(C12441.m30911(this.f21362, "]", sb));
    }
}
