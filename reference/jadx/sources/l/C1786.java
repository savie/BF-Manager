package l;

/* JADX INFO: renamed from: l.֫۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes2.dex */
public class C1786 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f6093;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C5515 f6094;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f6095;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f6096;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f6097;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f6098;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f6099;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f6100;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22362 f6101;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f6102;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f6103;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l2 = (Long) obj;
        long jLongValue = l2.longValue();
        long j = this.f6095;
        if (j > jLongValue) {
            return 1;
        }
        return j < l2.longValue() ? -1 : 0;
    }

    public C1786(String str, C5515 c5515, long j, int i, long j2, C22362 c22362, String str2, String str3, long j3, long j4, boolean z) {
        this.f6097 = str;
        this.f6094 = c5515;
        this.f6093 = j;
        this.f6098 = i;
        this.f6095 = j2;
        this.f6101 = c22362;
        this.f6102 = str2;
        this.f6096 = str3;
        this.f6103 = j3;
        this.f6100 = j4;
        this.f6099 = z;
    }
}
