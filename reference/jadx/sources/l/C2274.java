package l;

/* JADX INFO: renamed from: l.ۖۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2274 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f8122;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f8123;

    public C2274(String str, int i) {
        this.f8123 = str;
        this.f8122 = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && C2274.class == obj.getClass()) {
            C2274 c2274 = (C2274) obj;
            if (this.f8122 == c2274.f8122 && this.f8123.equals(c2274.f8123)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8123.hashCode() * 31) + this.f8122;
    }
}
