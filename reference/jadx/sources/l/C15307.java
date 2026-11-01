package l;

/* JADX INFO: renamed from: l.ܶܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6VC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15307 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f49873;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f49874;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f49875;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f49876;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f49877;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f49878;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f49879;

    public C15307(int[] iArr, long j) {
        this.f49874 = iArr;
        this.f49878 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36649(C6222 c6222) {
        int iM17259 = c6222.m17259();
        if ((iM17259 & 1) != 0) {
            if (!this.f49875) {
                this.f49879 = true;
            } else if (!this.f49873) {
                this.f49876 = true;
            }
        }
        if ((iM17259 & 2) != 0 && !this.f49873) {
            this.f49876 = true;
        }
        if ((iM17259 & 4) != 0) {
            this.f49873 = true;
        }
        this.f49877 = (int) c6222.m17269();
        this.f49875 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36650(long j) {
        boolean z = this.f49879;
        long j2 = this.f49878;
        if (!z || ((int) (j2 >> 32)) == ((int) (j >> 32))) {
            return !this.f49876 || ((int) j2) == ((int) j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m36651(long j) {
        long j2 = this.f49873 ? this.f49877 : (int) j;
        return (j2 & 4294967295L) | (j2 << 32);
    }
}
