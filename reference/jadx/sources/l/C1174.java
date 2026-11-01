package l;

/* JADX INFO: renamed from: l.֨ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B55V */
/* JADX INFO: loaded from: classes2.dex */
public final class C1174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f5231;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f5232;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f5233;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1174.class != obj.getClass()) {
            return false;
        }
        C1174 c1174 = (C1174) obj;
        if (C13638.equals(this.f5232, c1174.f5232)) {
            return C13638.equals(this.f5231, c1174.f5231);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5232;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f5231;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
