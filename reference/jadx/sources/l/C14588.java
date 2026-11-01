package l;

/* JADX INFO: renamed from: l.ܳܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 66M9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14588 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f47738;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f47739;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f47740;

    public C14588(String str, long j, long j2) {
        C13638.requireNonNull(str);
        this.f47738 = str;
        if (j < -1) {
            throw new IllegalArgumentException("Invalid source size");
        }
        this.f47739 = j;
        this.f47740 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14588)) {
            return false;
        }
        C14588 c14588 = (C14588) obj;
        return this.f47739 == c14588.f47739 && this.f47740 == c14588.f47740 && this.f47738.equals(c14588.f47738);
    }

    public final int hashCode() {
        return C13638.hash(this.f47738, Long.valueOf(this.f47739), Long.valueOf(this.f47740));
    }
}
