package l;

/* JADX INFO: renamed from: l.ۚܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81EW */
/* JADX INFO: loaded from: classes2.dex */
public final class C5737 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f19744;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f19745;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f19746;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f19747;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f19748;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f19749;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f19750;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f19751;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f19752;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f19753;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m16796() {
        return this.f19745;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m16798() {
        return this.f19750;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m16799() {
        return this.f19744;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m16797() {
        return this.f19749;
    }

    public final String toString() {
        return "Attribute{name='" + this.f19745 + "', value='" + this.f19750 + "', nameLine=" + this.f19753 + ", nameColumn=" + this.f19752 + ", nameStartPosition=" + this.f19751 + ", nameEndPosition=" + this.f19747 + ", valueLine=" + this.f19744 + ", valueColumn=" + this.f19749 + ", valueStartPosition=" + this.f19748 + ", valueEndPosition=" + this.f19746 + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5737.class == obj.getClass()) {
            C5737 c5737 = (C5737) obj;
            if (this.f19753 != c5737.f19753 || this.f19752 != c5737.f19752 || this.f19751 != c5737.f19751 || this.f19747 != c5737.f19747 || this.f19744 != c5737.f19744 || this.f19749 != c5737.f19749 || this.f19748 != c5737.f19748 || this.f19746 != c5737.f19746) {
                return false;
            }
            String str = this.f19745;
            if (str == null ? c5737.f19745 != null : !str.equals(c5737.f19745)) {
                return false;
            }
            String str2 = this.f19750;
            String str3 = c5737.f19750;
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
        String str = this.f19745;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19750;
        return ((((((((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f19753) * 31) + this.f19752) * 31) + this.f19751) * 31) + this.f19747) * 31) + this.f19744) * 31) + this.f19749) * 31) + this.f19748) * 31) + this.f19746;
    }
}
