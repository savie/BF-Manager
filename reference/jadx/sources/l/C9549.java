package l;

/* JADX INFO: renamed from: l.ۡᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8TF */
/* JADX INFO: loaded from: classes3.dex */
public final class C9549 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C9549 f30908 = new C1347().m4978();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f30909;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f30910;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f30911;

    public C9549(C1347 c1347) {
        this.f30909 = c1347.f4811;
        this.f30911 = c1347.f4813;
        this.f30910 = c1347.f4812;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9549.class == obj.getClass()) {
            C9549 c9549 = (C9549) obj;
            if (this.f30909 == c9549.f30909 && this.f30911 == c9549.f30911 && this.f30910 == c9549.f30910) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f30909 ? 1 : 0) << 2) + ((this.f30911 ? 1 : 0) << 1) + (this.f30910 ? 1 : 0);
    }
}
