package l;

/* JADX INFO: renamed from: l.ۗ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D5R7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3097 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f11684;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C14076 f11685;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f11686;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14076 m9293() {
        return this.f11685;
    }

    public C3097(String str, String str2, String[] strArr, String str3) {
        this.f11686 = str;
        this.f11684 = str2;
        this.f11685 = new C14076(str3, strArr);
    }

    public C3097(String str, String str2, C14076 c14076) {
        this.f11686 = str;
        this.f11684 = str2;
        this.f11685 = c14076;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m9292() {
        return this.f11685.m34049();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m9295() {
        return this.f11684;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m9294() {
        return this.f11686;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String[] m9291() {
        return this.f11685.m34051();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m9296() {
        return this.f11685.m34050();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3097.class != obj.getClass()) {
            return false;
        }
        C3097 c3097 = (C3097) obj;
        String str = c3097.f11686;
        String str2 = c3097.f11684;
        String str3 = this.f11684;
        if (str3 == null ? str2 != null : !str3.equals(str2)) {
            return false;
        }
        String str4 = this.f11686;
        if (str4 == null ? str == null : str4.equals(str)) {
            return this.f11685.equals(c3097.f11685);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11684;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11686;
        return this.f11685.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f11686 + "->" + this.f11684 + this.f11685.m34049();
    }
}
