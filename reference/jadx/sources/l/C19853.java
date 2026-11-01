package l;

/* JADX INFO: renamed from: l.᩶֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes4.dex */
public class C19853 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8354 f63673;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f63674;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f63675;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15620 f63676;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f63677;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f63678;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f63679;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f63680;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f63681;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f63682;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f63683;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l2 = (Long) obj;
        long jLongValue = l2.longValue();
        long j = this.f63678;
        if (j > jLongValue) {
            return 1;
        }
        return j < l2.longValue() ? -1 : 0;
    }

    public C19853(String str, C15620 c15620, long j, int i, long j2, C8354 c8354, String str2, String str3, long j3, long j4, boolean z) {
        this.f63674 = str;
        this.f63676 = c15620;
        this.f63680 = j;
        this.f63683 = i;
        this.f63678 = j2;
        this.f63673 = c8354;
        this.f63681 = str2;
        this.f63677 = str3;
        this.f63682 = j3;
        this.f63679 = j4;
        this.f63675 = z;
    }
}
