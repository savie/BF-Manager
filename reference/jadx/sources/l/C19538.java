package l;

/* JADX INFO: renamed from: l.ᩴۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8FX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19538 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f63011;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f63012;

    public C19538(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("offset must not be negative");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("numbytes must not be negative");
        }
        this.f63012 = j;
        this.f63011 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C19538.class == obj.getClass()) {
            C19538 c19538 = (C19538) obj;
            if (this.f63012 == c19538.f63012 && this.f63011 == c19538.f63011) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m45069() {
        return this.f63011;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m45070() {
        return this.f63012;
    }

    public final int hashCode() {
        return C17359.hash(Long.valueOf(this.f63012), Long.valueOf(this.f63011));
    }

    public final String toString() {
        return "TarArchiveStructSparse{offset=" + this.f63012 + ", numbytes=" + this.f63011 + '}';
    }
}
