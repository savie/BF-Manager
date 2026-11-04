package l;

/* JADX INFO: renamed from: l.ۗۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5R7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3177 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f10305;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C12126 f10306;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f10307;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12126 m10373() {
        return this.f10306;
    }

    public C3177(String str, String str2, String[] strArr, String str3) {
        this.f10307 = str;
        this.f10305 = str2;
        this.f10306 = new C12126(str3, strArr);
    }

    public C3177(String str, String str2, C12126 c12126) {
        this.f10307 = str;
        this.f10305 = str2;
        this.f10306 = c12126;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m10370() {
        return this.f10306.m30290();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m10374() {
        return this.f10305;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m10371() {
        return this.f10307;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String[] m10375() {
        return this.f10306.m30292();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m10372() {
        return this.f10306.m30291();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3177.class != obj.getClass()) {
            return false;
        }
        C3177 c3177 = (C3177) obj;
        String str = c3177.f10307;
        String str2 = c3177.f10305;
        String str3 = this.f10305;
        if (str3 == null ? str2 != null : !str3.equals(str2)) {
            return false;
        }
        String str4 = this.f10307;
        if (str4 == null ? str == null : str4.equals(str)) {
            return this.f10306.equals(c3177.f10306);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10305;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10307;
        return this.f10306.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f10307 + "->" + this.f10305 + this.f10306.m30290();
    }
}
