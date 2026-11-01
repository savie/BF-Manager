package l;

/* JADX INFO: renamed from: l.ܶܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8UQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15315 extends AbstractC22370 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f49895;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f49896;

    public C15315(String str, String str2, String str3) {
        super(str);
        this.f49896 = str2;
        this.f49895 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15315.class == obj.getClass()) {
            C15315 c15315 = (C15315) obj;
            if (this.f73049.equals(c15315.f73049) && C13638.equals(this.f49896, c15315.f49896) && C13638.equals(this.f49895, c15315.f49895)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM33812 = C13958.m33812(527, 31, this.f73049);
        String str = this.f49896;
        int iHashCode = (iM33812 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f49895;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // l.AbstractC22370
    public final String toString() {
        return this.f73049 + ": url=" + this.f49895;
    }
}
