package l;

/* JADX INFO: renamed from: l.ܿܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77D */
/* JADX INFO: loaded from: classes4.dex */
public final class C17450 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9835 f55549;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9835 f55550;

    public C17450(C9835 c9835, C9835 c9836) {
        this.f55549 = c9835;
        this.f55550 = c9836;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17450) {
            C17450 c17450 = (C17450) obj;
            if (this.f55549 == c17450.f55549 && this.f55550 == c17450.f55550) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f55550) + (System.identityHashCode(this.f55549) * 31);
    }
}
