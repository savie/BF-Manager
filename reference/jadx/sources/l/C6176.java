package l;

/* JADX INFO: renamed from: l.ۛܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G14L */
/* JADX INFO: loaded from: classes2.dex */
public final class C6176 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f21043;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f21044;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f21045;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14644 f21046;

    public C6176(C14644 c14644, String str, String str2, String str3) {
        this.f21046 = c14644;
        this.f21043 = str;
        this.f21045 = str2;
        this.f21044 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6176.class == obj.getClass()) {
            C6176 c6176 = (C6176) obj;
            String str = c6176.f21044;
            String str2 = c6176.f21045;
            String str3 = c6176.f21043;
            String str4 = this.f21043;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            String str5 = this.f21045;
            if (str5 == null ? str2 != null : !str5.equals(str2)) {
                return false;
            }
            String str6 = this.f21044;
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
        String str = this.f21043;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f21045;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f21044;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
