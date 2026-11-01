package l;

/* JADX INFO: renamed from: l.۬ܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8IW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13198 extends AbstractC22370 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f43915;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f43916;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f43917;

    public C13198(String str, String str2, String str3) {
        super("----");
        this.f43916 = str;
        this.f43917 = str2;
        this.f43915 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13198.class == obj.getClass()) {
            C13198 c13198 = (C13198) obj;
            if (C13638.equals(this.f43917, c13198.f43917) && C13638.equals(this.f43916, c13198.f43916) && C13638.equals(this.f43915, c13198.f43915)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f43916;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f43917;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f43915;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // l.AbstractC22370
    public final String toString() {
        return this.f73049 + ": domain=" + this.f43916 + ", description=" + this.f43917;
    }
}
