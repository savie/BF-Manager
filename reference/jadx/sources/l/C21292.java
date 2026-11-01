package l;

/* JADX INFO: renamed from: l.᩸ۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SE */
/* JADX INFO: loaded from: classes4.dex */
public final class C21292 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f69287;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f69288;

    public C21292(long j, long j2) {
        this.f69288 = j;
        this.f69287 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21292)) {
            return false;
        }
        C21292 c21292 = (C21292) obj;
        return this.f69288 == c21292.f69288 && this.f69287 == c21292.f69287;
    }

    public final int hashCode() {
        return (((int) this.f69288) * 31) + ((int) this.f69287);
    }
}
