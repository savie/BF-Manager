package l;

/* JADX INFO: renamed from: l.ܺᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58U */
/* JADX INFO: loaded from: classes4.dex */
public final class C16115 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f52097;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f52098;

    public C16115(String str, String str2) {
        this.f52097 = C17983.m41850(str);
        this.f52098 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16115.class == obj.getClass()) {
            C16115 c16115 = (C16115) obj;
            if (C13638.equals(this.f52097, c16115.f52097) && C13638.equals(this.f52098, c16115.f52098)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f52098.hashCode() * 31;
        String str = this.f52097;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    static {
        C17983.m41806(0);
        C17983.m41806(1);
    }
}
