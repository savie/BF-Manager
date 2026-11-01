package l;

/* JADX INFO: renamed from: l.ܿۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8A6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17248 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f54952;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f54953;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f54954;

    public C17248(String str, int i, String str2) {
        this.f54952 = str;
        this.f54953 = i;
        this.f54954 = str2;
    }

    public final int hashCode() {
        return C13638.hash(Integer.valueOf(this.f54953), this.f54954) + (m40210() * 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m40208() {
        return this.f54952;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m40211() {
        return this.f54953;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m40212(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17248) {
            return m40209(obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m40210() {
        return C13638.hash(this.f54952);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40209(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17248)) {
            return false;
        }
        return C13638.equals(this.f54952, ((C17248) obj).f54952);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17248)) {
            return false;
        }
        C17248 c17248 = (C17248) obj;
        return m40212(obj) && this.f54953 == c17248.f54953 && C13638.equals(this.f54954, c17248.f54954);
    }

    public final String toString() {
        String strM40208 = m40208();
        String strM38890 = strM40208 == null ? "null" : C16523.m38890("\"", strM40208, "\"");
        Integer numValueOf = Integer.valueOf(this.f54953);
        String str = this.f54954;
        return String.format("NetShareInfo1{netName: %s, type: %08x, remark: %s}", strM38890, numValueOf, str != null ? C16523.m38890("\"", str, "\"") : "null");
    }
}
