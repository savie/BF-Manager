package l;

/* JADX INFO: renamed from: l.ܰ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 58I0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14959 extends AbstractC19435 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f48863;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f48864;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f48865;

    public C14959(String str, String str2, String str3) {
        super("COMM");
        this.f48863 = str;
        this.f48864 = str2;
        this.f48865 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14959.class == obj.getClass()) {
            C14959 c14959 = (C14959) obj;
            if (C17359.equals(this.f48864, c14959.f48864) && C17359.equals(this.f48863, c14959.f48863) && C17359.equals(this.f48865, c14959.f48865)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f48863;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f48864;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f48865;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // l.AbstractC19435
    public final String toString() {
        return this.f62806 + ": language=" + this.f48863 + ", description=" + this.f48864 + ", text=" + this.f48865;
    }
}
