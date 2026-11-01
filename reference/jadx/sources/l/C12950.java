package l;

/* JADX INFO: renamed from: l.۬ۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8NG */
/* JADX INFO: loaded from: classes3.dex */
public final class C12950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22828 f43052;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22828 f43053;

    public C12950(C22828 c22828, C22828 c22829) {
        this.f43052 = c22828;
        this.f43053 = c22829;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C22828 c22828 = this.f43052;
        sb.append(c22828);
        C22828 c22829 = this.f43053;
        if (c22828.equals(c22829)) {
            str = "";
        } else {
            str = ", " + c22829;
        }
        return C22697.m50267(sb, str, "]");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12950.class == obj.getClass()) {
            C12950 c12950 = (C12950) obj;
            if (this.f43052.equals(c12950.f43052) && this.f43053.equals(c12950.f43053)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43053.hashCode() + (this.f43052.hashCode() * 31);
    }
}
