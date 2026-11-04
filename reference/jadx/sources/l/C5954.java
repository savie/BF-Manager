package l;

/* JADX INFO: renamed from: l.ۚ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58U */
/* JADX INFO: loaded from: classes3.dex */
public final class C5954 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f20386;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f20387;

    public C5954(String str, String str2) {
        this.f20386 = C7116.m19496(str);
        this.f20387 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5954.class == obj.getClass()) {
            C5954 c5954 = (C5954) obj;
            if (C17359.equals(this.f20386, c5954.f20386) && C17359.equals(this.f20387, c5954.f20387)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f20387.hashCode() * 31;
        String str = this.f20386;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    static {
        C7116.m19499(0);
        C7116.m19499(1);
    }
}
