package l;

/* JADX INFO: renamed from: l.ۜ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8UQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7502 extends AbstractC19435 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f24805;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f24806;

    public C7502(String str, String str2, String str3) {
        super(str);
        this.f24806 = str2;
        this.f24805 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7502.class == obj.getClass()) {
            C7502 c7502 = (C7502) obj;
            if (this.f62806.equals(c7502.f62806) && C17359.equals(this.f24806, c7502.f24806) && C17359.equals(this.f24805, c7502.f24805)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM30817 = C12351.m30817(527, 31, this.f62806);
        String str = this.f24806;
        int iHashCode = (iM30817 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24805;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // l.AbstractC19435
    public final String toString() {
        return this.f62806 + ": url=" + this.f24805;
    }
}
