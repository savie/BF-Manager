package l;

/* JADX INFO: renamed from: l.ۖ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8LY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2349 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C2349 f7572 = new C2349(0, 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f7573;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f7574;

    public C2349(long j, long j2) {
        this.f7574 = j;
        this.f7573 = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f7574);
        sb.append(", position=");
        return C2764.m9137(sb, this.f7573, "]");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2349.class == obj.getClass()) {
            C2349 c2349 = (C2349) obj;
            if (this.f7574 == c2349.f7574 && this.f7573 == c2349.f7573) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7574) * 31) + ((int) this.f7573);
    }
}
