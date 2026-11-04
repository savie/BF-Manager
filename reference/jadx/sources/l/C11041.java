package l;

/* JADX INFO: renamed from: l.ۤᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11041 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f34844;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8402 f34845;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC24755 f34846;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC24755 f34847;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f34848;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f34849;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C8402 f34850;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f34851;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f34852;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f34853;

    public C11041(long j, AbstractC24755 abstractC24755, int i, C8402 c8402, long j2, AbstractC24755 abstractC24756, int i2, C8402 c8403, long j3, long j4) {
        this.f34849 = j;
        this.f34846 = abstractC24755;
        this.f34848 = i;
        this.f34850 = c8402;
        this.f34851 = j2;
        this.f34847 = abstractC24756;
        this.f34853 = i2;
        this.f34845 = c8403;
        this.f34852 = j3;
        this.f34844 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11041.class == obj.getClass()) {
            C11041 c11041 = (C11041) obj;
            if (this.f34849 == c11041.f34849 && this.f34848 == c11041.f34848 && this.f34851 == c11041.f34851 && this.f34853 == c11041.f34853 && this.f34852 == c11041.f34852 && this.f34844 == c11041.f34844 && C17359.equals(this.f34846, c11041.f34846) && C17359.equals(this.f34850, c11041.f34850) && C17359.equals(this.f34847, c11041.f34847) && C17359.equals(this.f34845, c11041.f34845)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(Long.valueOf(this.f34849), this.f34846, Integer.valueOf(this.f34848), this.f34850, Long.valueOf(this.f34851), this.f34847, Integer.valueOf(this.f34853), this.f34845, Long.valueOf(this.f34852), Long.valueOf(this.f34844));
    }
}
