package l;

/* JADX INFO: renamed from: l.ܳۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 66M9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15294 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f50003;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f50004;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f50005;

    public C15294(String str, long j, long j2) {
        C17359.requireNonNull(str);
        this.f50003 = str;
        if (j < -1) {
            throw new IllegalArgumentException("Invalid source size");
        }
        this.f50004 = j;
        this.f50005 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15294)) {
            return false;
        }
        C15294 c15294 = (C15294) obj;
        return this.f50004 == c15294.f50004 && this.f50005 == c15294.f50005 && this.f50003.equals(c15294.f50003);
    }

    public final int hashCode() {
        return C17359.hash(this.f50003, Long.valueOf(this.f50004), Long.valueOf(this.f50005));
    }
}
