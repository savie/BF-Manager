package l;

/* JADX INFO: renamed from: l.᩶۫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8EK */
/* JADX INFO: loaded from: classes5.dex */
public final class C21311 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f67918;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f67919;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f67920;

    public C21311(C0428 c0428, String str, String str2, String str3) {
        this.f67918 = c0428.m2233(str);
        this.f67920 = c0428.m2233(str2);
        this.f67919 = c0428.m2233(str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21311.class == obj.getClass()) {
            C21311 c21311 = (C21311) obj;
            if (this.f67918 == c21311.f67918 && this.f67920 == c21311.f67920 && this.f67919 == c21311.f67919) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f67918 * 31) + this.f67920) * 31) + this.f67919;
    }
}
