package l;

/* JADX INFO: renamed from: l.᩵ܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78R7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19602 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f62938;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f62939;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f62940;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15274 f62941;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f62942;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f62943;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC16511 f62944;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC16511 f62945;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f62946;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15274 f62947;

    public C19602(long j, AbstractC16511 abstractC16511, int i, C15274 c15274, long j2, AbstractC16511 abstractC16512, int i2, C15274 c15275, long j3, long j4) {
        this.f62938 = j;
        this.f62945 = abstractC16511;
        this.f62943 = i;
        this.f62947 = c15274;
        this.f62942 = j2;
        this.f62944 = abstractC16512;
        this.f62939 = i2;
        this.f62941 = c15275;
        this.f62946 = j3;
        this.f62940 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C19602.class == obj.getClass()) {
            C19602 c19602 = (C19602) obj;
            if (this.f62938 == c19602.f62938 && this.f62943 == c19602.f62943 && this.f62942 == c19602.f62942 && this.f62939 == c19602.f62939 && this.f62946 == c19602.f62946 && this.f62940 == c19602.f62940 && C13638.equals(this.f62945, c19602.f62945) && C13638.equals(this.f62947, c19602.f62947) && C13638.equals(this.f62944, c19602.f62944) && C13638.equals(this.f62941, c19602.f62941)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(Long.valueOf(this.f62938), this.f62945, Integer.valueOf(this.f62943), this.f62947, Long.valueOf(this.f62942), this.f62944, Integer.valueOf(this.f62939), this.f62941, Long.valueOf(this.f62946), Long.valueOf(this.f62940));
    }
}
