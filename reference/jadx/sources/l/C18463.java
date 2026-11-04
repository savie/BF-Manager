package l;

/* JADX INFO: renamed from: l.ܿܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18463 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f60090;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f60091;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f60092;

    public C18463(String str, String str2, String str3) {
        this.f60092 = str;
        this.f60091 = str2;
        this.f60090 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18463.class != obj.getClass()) {
            return false;
        }
        C18463 c18463 = (C18463) obj;
        if (C17359.equals(this.f60091, c18463.f60091)) {
            return C17359.equals(this.f60090, c18463.f60090);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f60091;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f60090;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
