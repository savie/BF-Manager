package l;

/* JADX INFO: renamed from: l.ܺܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16930 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f55326;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f55327;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f55328;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16930 m39909(String str) {
        return new C16930(-1, -1, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16930 m39908(int i, int i2, String str) {
        C12128.m30309(i >= 0);
        C12128.m30309(i2 >= 0);
        str.getClass();
        return new C16930(i, i2, str);
    }

    public C16930(int i, int i2, String str) {
        this.f55328 = i;
        this.f55326 = i2;
        this.f55327 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f55328;
        if (i >= 0) {
            sb.append(i);
            sb.append(':');
        }
        int i2 = this.f55326;
        if (i2 >= 0) {
            sb.append(i2);
            sb.append(':');
        }
        if (i >= 0 || i2 >= 0) {
            sb.append(' ');
        }
        sb.append("error: ");
        sb.append(this.f55327);
        return sb.toString();
    }
}
