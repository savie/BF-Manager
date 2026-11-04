package l;

/* JADX INFO: renamed from: l.᩺ۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7O7 */
/* JADX INFO: loaded from: classes.dex */
public final class C24019 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2346 f77673;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f77674;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24019 m53573(int i, int i2, String str) {
        C12128.m30308("startPosition must be non-negative", i >= 0);
        C12128.m30308("startPosition cannot be after endPosition", i <= i2);
        return new C24019(C2346.m7914(Integer.valueOf(i), Integer.valueOf(i2)), str);
    }

    public C24019(C2346 c2346, String str) {
        this.f77673 = c2346;
        C12128.m30305(str, "Null replacementString");
        this.f77674 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2346 m53574() {
        return this.f77673;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m53575() {
        return this.f77674;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24019) {
            C24019 c24019 = (C24019) obj;
            if (this.f77673.equals(c24019.f77673) && this.f77674.equals(c24019.f77674)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(this.f77673, this.f77674);
    }
}
