package l;

/* JADX INFO: renamed from: l.᩶ܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77D */
/* JADX INFO: loaded from: classes5.dex */
public final class C21355 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9861 f68019;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9861 f68020;

    public C21355(C9861 c9861, C9861 c9862) {
        this.f68019 = c9861;
        this.f68020 = c9862;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21355) {
            C21355 c21355 = (C21355) obj;
            if (this.f68019 == c21355.f68019 && this.f68020 == c21355.f68020) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f68020) + (System.identityHashCode(this.f68019) * 31);
    }
}
