package l;

/* JADX INFO: renamed from: l.֨᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W8IW */
/* JADX INFO: loaded from: classes3.dex */
public final class C1536 extends AbstractC19435 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f5336;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f5337;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f5338;

    public C1536(String str, String str2, String str3) {
        super("----");
        this.f5336 = str;
        this.f5337 = str2;
        this.f5338 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1536.class == obj.getClass()) {
            C1536 c1536 = (C1536) obj;
            if (C17359.equals(this.f5337, c1536.f5337) && C17359.equals(this.f5336, c1536.f5336) && C17359.equals(this.f5338, c1536.f5338)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5336;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f5337;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5338;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // l.AbstractC19435
    public final String toString() {
        return this.f62806 + ": domain=" + this.f5336 + ", description=" + this.f5337;
    }
}
