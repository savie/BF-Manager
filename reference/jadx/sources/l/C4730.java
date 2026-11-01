package l;

/* JADX INFO: renamed from: l.ۙܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58I0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4730 extends AbstractC22370 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f16671;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f16672;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f16673;

    public C4730(String str, String str2, String str3) {
        super("COMM");
        this.f16672 = str;
        this.f16673 = str2;
        this.f16671 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4730.class == obj.getClass()) {
            C4730 c4730 = (C4730) obj;
            if (C13638.equals(this.f16673, c4730.f16673) && C13638.equals(this.f16672, c4730.f16672) && C13638.equals(this.f16671, c4730.f16671)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f16672;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f16673;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f16671;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // l.AbstractC22370
    public final String toString() {
        return this.f73049 + ": language=" + this.f16672 + ", description=" + this.f16673 + ", text=" + this.f16671;
    }
}
