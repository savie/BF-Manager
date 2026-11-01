package l;

/* JADX INFO: renamed from: l.ۙܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M70P */
/* JADX INFO: loaded from: classes2.dex */
public final class C4695 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f16589;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f16590;

    public C4695(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        this.f16590 = j;
        this.f16589 = j2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m13012() {
        return this.f16590;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m13010() {
        return this.f16589;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13011(C15432 c15432) {
        return c15432.mo33971() && this.f16590 == c15432.mo33964() && this.f16589 == c15432.mo33991();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4695) {
            C4695 c4695 = (C4695) obj;
            if (this.f16590 == c4695.f16590 && this.f16589 == c4695.f16589) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(Long.valueOf(this.f16590), Long.valueOf(this.f16589));
    }

    public final String toString() {
        return "FileRevision{length=" + this.f16590 + ", lastModified=" + this.f16589 + '}';
    }
}
