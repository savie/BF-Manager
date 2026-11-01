package l;

/* JADX INFO: renamed from: l.ܽ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1RZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16661 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21599 f53415;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f53413 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f53414 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f53416 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f53412 = 0;

    /* JADX INFO: renamed from: ۨ */
    public abstract long mo30887();

    public AbstractC16661(C21599 c21599) {
        this.f53415 = c21599;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39125() {
        return (int) (3 & (4 - ((((long) (C10336.m26217(this.f53412) + 1)) + this.f53416) + 4)));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long m39126() {
        return (((long) (C10336.m26217(this.f53412) + 1)) + this.f53416 + 7) & (-4);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo30885(long j, long j2) throws C21599 {
        this.f53413 += (3 + j) & (-4);
        this.f53414 += j2;
        this.f53416 += (long) (C10336.m26217(j2) + C10336.m26217(j));
        this.f53412++;
        if (this.f53413 < 0 || this.f53414 < 0 || m39126() > 17179869184L || mo30887() < 0) {
            throw this.f53415;
        }
    }
}
