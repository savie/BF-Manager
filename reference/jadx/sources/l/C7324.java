package l;

/* JADX INFO: renamed from: l.ۜᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G14L */
/* JADX INFO: loaded from: classes3.dex */
public final class C7324 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f24131;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f24132;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21978 f24133;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f24134;

    public C7324(C21978 c21978, String str, String str2, String str3) {
        this.f24133 = c21978;
        this.f24134 = str;
        this.f24132 = str2;
        this.f24131 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7324.class == obj.getClass()) {
            C7324 c7324 = (C7324) obj;
            String str = c7324.f24131;
            String str2 = c7324.f24132;
            String str3 = c7324.f24134;
            String str4 = this.f24134;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            String str5 = this.f24132;
            if (str5 == null ? str2 != null : !str5.equals(str2)) {
                return false;
            }
            String str6 = this.f24131;
            if (str6 != null) {
                return str6.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f24134;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f24132;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24131;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
