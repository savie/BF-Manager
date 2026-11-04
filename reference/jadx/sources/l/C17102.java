package l;

/* JADX INFO: renamed from: l.ܺ᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C1US */
/* JADX INFO: loaded from: classes4.dex */
public final class C17102 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f55820;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f55821;

    public C17102(long j, long j2) {
        this.f55821 = j;
        this.f55820 = j2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m40264() {
        return this.f55821;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m40263() {
        return this.f55820;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17102.class == obj.getClass()) {
            C17102 c17102 = (C17102) obj;
            if (this.f55821 == c17102.f55821 && this.f55820 == c17102.f55820) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f55821;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f55820;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }
}
