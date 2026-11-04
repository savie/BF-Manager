package l;

/* JADX INFO: renamed from: l.᩶ᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: N7UA */
/* JADX INFO: loaded from: classes.dex */
public final class C21490 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f68700;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f68701;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f68702;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f68703;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f68704;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f68705;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21490 m48894(int i, AbstractC0148 abstractC0148) {
        if (abstractC0148 instanceof C6574) {
            return new C21490(i, (C6574) abstractC0148);
        }
        throw new RuntimeException();
    }

    public C21490(int i, C6574 c6574) {
        this.f68702 = i;
        this.f68705 = c6574.f22053;
        this.f68703 = c6574.f22051;
        this.f68700 = c6574.f22049;
        this.f68701 = c6574.f22050;
        this.f68704 = c6574.f22052;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21490.class == obj.getClass()) {
            C21490 c21490 = (C21490) obj;
            if (this.f68702 == c21490.f68702 && this.f68704 == c21490.f68704 && this.f68705.equals(c21490.f68705) && this.f68703.equals(c21490.f68703) && this.f68700.equals(c21490.f68700) && this.f68701.equals(c21490.f68701)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12351.m30817(C12351.m30817(C12351.m30817(C12351.m30817(this.f68702 * 31, 31, this.f68705), 31, this.f68703), 31, this.f68700), 31, this.f68701) + (this.f68704 ? 1231 : 1237);
    }
}
