package l;

/* JADX INFO: renamed from: l.ᩴᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81EW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18923 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f61217;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f61218;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f61219;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f61220;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f61221;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f61222;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f61223;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f61224;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f61225;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f61226;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m43584() {
        return this.f61220;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m43586() {
        return this.f61226;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m43583() {
        return this.f61219;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m43585() {
        return this.f61217;
    }

    public final String toString() {
        return "Attribute{name='" + this.f61220 + "', value='" + this.f61226 + "', nameLine=" + this.f61218 + ", nameColumn=" + this.f61225 + ", nameStartPosition=" + this.f61221 + ", nameEndPosition=" + this.f61223 + ", valueLine=" + this.f61219 + ", valueColumn=" + this.f61217 + ", valueStartPosition=" + this.f61222 + ", valueEndPosition=" + this.f61224 + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18923.class == obj.getClass()) {
            C18923 c18923 = (C18923) obj;
            if (this.f61218 != c18923.f61218 || this.f61225 != c18923.f61225 || this.f61221 != c18923.f61221 || this.f61223 != c18923.f61223 || this.f61219 != c18923.f61219 || this.f61217 != c18923.f61217 || this.f61222 != c18923.f61222 || this.f61224 != c18923.f61224) {
                return false;
            }
            String str = this.f61220;
            if (str == null ? c18923.f61220 != null : !str.equals(c18923.f61220)) {
                return false;
            }
            String str2 = this.f61226;
            String str3 = c18923.f61226;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f61220;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f61226;
        return ((((((((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f61218) * 31) + this.f61225) * 31) + this.f61221) * 31) + this.f61223) * 31) + this.f61219) * 31) + this.f61217) * 31) + this.f61222) * 31) + this.f61224;
    }
}
