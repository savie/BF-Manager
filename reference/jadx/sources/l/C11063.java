package l;

/* JADX INFO: renamed from: l.ۧܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8WD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11063 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f37549;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f37550;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f37551;

    public C11063(String str, String str2, boolean z) {
        this.f37551 = str;
        this.f37549 = z;
        this.f37550 = str2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m27884() {
        return this.f37551;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27882() {
        return this.f37549;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m27883() {
        return this.f37550;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataUri{contentType='");
        sb.append(this.f37551);
        sb.append("', base64=");
        sb.append(this.f37549);
        sb.append(", data='");
        return C22697.m50267(sb, this.f37550, "'}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11063.class == obj.getClass()) {
            C11063 c11063 = (C11063) obj;
            String str = c11063.f37550;
            String str2 = c11063.f37551;
            if (this.f37549 != c11063.f37549) {
                return false;
            }
            String str3 = this.f37551;
            if (str3 == null ? str2 != null : !str3.equals(str2)) {
                return false;
            }
            String str4 = this.f37550;
            if (str4 != null) {
                return str4.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f37551;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + (this.f37549 ? 1 : 0)) * 31;
        String str2 = this.f37550;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
