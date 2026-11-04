package l;

/* JADX INFO: renamed from: l.ۛᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M70P */
/* JADX INFO: loaded from: classes3.dex */
public final class C6597 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f22079;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f22080;

    public C6597(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        this.f22080 = j;
        this.f22079 = j2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C6597 m18521(C1161 c1161) {
        C17359.requireNonNull(c1161);
        return new C6597(c1161.mo4285(), c1161.mo4286());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m18524() {
        return this.f22080;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m18522() {
        return this.f22079;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18523(C1161 c1161) {
        return c1161.mo4304() && this.f22080 == c1161.mo4285() && this.f22079 == c1161.mo4286();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6597) {
            C6597 c6597 = (C6597) obj;
            if (this.f22080 == c6597.f22080 && this.f22079 == c6597.f22079) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(Long.valueOf(this.f22080), Long.valueOf(this.f22079));
    }

    public final String toString() {
        return "FileRevision{length=" + this.f22080 + ", lastModified=" + this.f22079 + '}';
    }
}
