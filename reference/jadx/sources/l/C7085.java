package l;

/* JADX INFO: renamed from: l.ۜۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SE */
/* JADX INFO: loaded from: classes3.dex */
public final class C7085 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f23353;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f23354;

    public C7085(long j, long j2) {
        this.f23354 = j;
        this.f23353 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7085)) {
            return false;
        }
        C7085 c7085 = (C7085) obj;
        return this.f23354 == c7085.f23354 && this.f23353 == c7085.f23353;
    }

    public final int hashCode() {
        return (((int) this.f23354) * 31) + ((int) this.f23353);
    }
}
