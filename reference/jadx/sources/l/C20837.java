package l;

/* JADX INFO: renamed from: l.᩵᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes5.dex */
public final class C20837 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f66718;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f66719;

    static {
        new C20837();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20837.class == obj.getClass()) {
            C20837 c20837 = (C20837) obj;
            if (this.f66719 == c20837.f66719 && this.f66718 == c20837.f66718) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(Integer.valueOf(this.f66719), Integer.valueOf(this.f66718));
    }
}
