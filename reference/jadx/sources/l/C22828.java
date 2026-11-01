package l;

/* JADX INFO: renamed from: l.᩺ۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8LY */
/* JADX INFO: loaded from: classes.dex */
public final class C22828 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C22828 f74276 = new C22828(0, 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f74277;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f74278;

    public C22828(long j, long j2) {
        this.f74278 = j;
        this.f74277 = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f74278);
        sb.append(", position=");
        return C15037.m36023(sb, this.f74277, "]");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22828.class == obj.getClass()) {
            C22828 c22828 = (C22828) obj;
            if (this.f74278 == c22828.f74278 && this.f74277 == c22828.f74277) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f74278) * 31) + ((int) this.f74277);
    }
}
