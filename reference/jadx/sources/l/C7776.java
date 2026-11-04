package l;

/* JADX INFO: renamed from: l.۟ۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: WIWC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7776 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f25583;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f25584;

    public C7776(int i, long j) {
        this.f25583 = i;
        this.f25584 = j;
    }

    public C7776(C7776 c7776) {
        this(c7776.f25583, c7776.f25584);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m21147(int i) {
        int i2;
        int i3 = (i * 4) + 16;
        if (i3 < 0 || i3 > (i2 = this.f25583)) {
            throw new C22497("Too many allocated bytes");
        }
        this.f25583 = i2 - i3;
        return new int[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21148(int i) {
        long j = i;
        long j2 = this.f25584;
        if (j > j2) {
            throw new C22497("Too many operations");
        }
        this.f25584 = j2 - j;
    }
}
