package l;

/* JADX INFO: renamed from: l.ۜܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6VC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7280 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f23975;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f23976;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f23977;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f23978;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f23979;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f23980;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f23981;

    public C7280(int[] iArr, long j) {
        this.f23981 = iArr;
        this.f23980 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19918(C4245 c4245) {
        int iM13566 = c4245.m13566();
        if ((iM13566 & 1) != 0) {
            if (!this.f23975) {
                this.f23978 = true;
            } else if (!this.f23977) {
                this.f23979 = true;
            }
        }
        if ((iM13566 & 2) != 0 && !this.f23977) {
            this.f23979 = true;
        }
        if ((iM13566 & 4) != 0) {
            this.f23977 = true;
        }
        this.f23976 = (int) c4245.m13558();
        this.f23975 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19919(long j) {
        boolean z = this.f23978;
        long j2 = this.f23980;
        if (!z || ((int) (j2 >> 32)) == ((int) (j >> 32))) {
            return !this.f23979 || ((int) j2) == ((int) j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m19920(long j) {
        long j2 = this.f23977 ? this.f23976 : (int) j;
        return (j2 & 4294967295L) | (j2 << 32);
    }
}
