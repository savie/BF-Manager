package l;

/* JADX INFO: renamed from: l.ۤ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P1RZ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11189 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18428 f35290;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f35289 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f35291 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f35292 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f35293 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract long mo28194();

    public AbstractC11189(C18428 c18428) {
        this.f35290 = c18428;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28192() {
        return (int) (3 & (4 - ((((long) (C5224.m15712(this.f35293) + 1)) + this.f35292) + 4)));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long m28195() {
        return (((long) (C5224.m15712(this.f35293) + 1)) + this.f35292 + 7) & (-4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo28193(long j, long j2) throws C18428 {
        this.f35289 += (3 + j) & (-4);
        this.f35291 += j2;
        this.f35292 += (long) (C5224.m15712(j2) + C5224.m15712(j));
        this.f35293++;
        if (this.f35289 < 0 || this.f35291 < 0 || m28195() > 17179869184L || mo28194() < 0) {
            throw this.f35290;
        }
    }
}
