package l;

/* JADX INFO: renamed from: l.ܽۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F8FX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16399 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f52759;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f52760;

    public C16399(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("offset must not be negative");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("numbytes must not be negative");
        }
        this.f52760 = j;
        this.f52759 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16399.class == obj.getClass()) {
            C16399 c16399 = (C16399) obj;
            if (this.f52760 == c16399.f52760 && this.f52759 == c16399.f52759) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m38604() {
        return this.f52759;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m38605() {
        return this.f52760;
    }

    public final int hashCode() {
        return C13638.hash(Long.valueOf(this.f52760), Long.valueOf(this.f52759));
    }

    public final String toString() {
        return "TarArchiveStructSparse{offset=" + this.f52760 + ", numbytes=" + this.f52759 + '}';
    }
}
