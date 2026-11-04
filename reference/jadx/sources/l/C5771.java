package l;

/* JADX INFO: renamed from: l.ۚܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8WD */
/* JADX INFO: loaded from: classes3.dex */
public final class C5771 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f19829;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f19830;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f19831;

    public C5771(String str, String str2, boolean z) {
        this.f19831 = str;
        this.f19829 = z;
        this.f19830 = str2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m16854() {
        return this.f19831;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16852() {
        return this.f19829;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m16853() {
        return this.f19830;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataUri{contentType='");
        sb.append(this.f19831);
        sb.append("', base64=");
        sb.append(this.f19829);
        sb.append(", data='");
        return C8947.m23910(sb, this.f19830, "'}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5771.class == obj.getClass()) {
            C5771 c5771 = (C5771) obj;
            String str = c5771.f19830;
            String str2 = c5771.f19831;
            if (this.f19829 != c5771.f19829) {
                return false;
            }
            String str3 = this.f19831;
            if (str3 == null ? str2 != null : !str3.equals(str2)) {
                return false;
            }
            String str4 = this.f19830;
            if (str4 != null) {
                return str4.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19831;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + (this.f19829 ? 1 : 0)) * 31;
        String str2 = this.f19830;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
