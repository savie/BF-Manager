package l;

/* JADX INFO: renamed from: l.ܽܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S7O7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16690 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9548 f53468;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f53469;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16690 m39160(int i, int i2, String str) {
        C18304.m42516("startPosition must be non-negative", i >= 0);
        C18304.m42516("startPosition cannot be after endPosition", i <= i2);
        return new C16690(C9548.m24401(Integer.valueOf(i), Integer.valueOf(i2)), str);
    }

    public C16690(C9548 c9548, String str) {
        this.f53468 = c9548;
        C18304.m42513(str, "Null replacementString");
        this.f53469 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9548 m39161() {
        return this.f53468;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m39162() {
        return this.f53469;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16690) {
            C16690 c16690 = (C16690) obj;
            if (this.f53468.equals(c16690.f53468) && this.f53469.equals(c16690.f53469)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(this.f53468, this.f53469);
    }
}
