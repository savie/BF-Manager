package l;

/* JADX INFO: renamed from: l.ܿۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17069 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54486;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f54487;

    static {
        new C17069();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17069.class == obj.getClass()) {
            C17069 c17069 = (C17069) obj;
            if (this.f54487 == c17069.f54487 && this.f54486 == c17069.f54486) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(Integer.valueOf(this.f54487), Integer.valueOf(this.f54486));
    }
}
