package l;

/* JADX INFO: renamed from: l.᩷ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R9RN */
/* JADX INFO: loaded from: classes.dex */
public final class C21829 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f69575;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f69576;

    public C21829(int i, int i2) {
        this.f69575 = i;
        this.f69576 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21829.class == obj.getClass()) {
            C21829 c21829 = (C21829) obj;
            if (this.f69575 == c21829.f69575 && this.f69576 == c21829.f69576) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f69575 * 31) + this.f69576;
    }
}
