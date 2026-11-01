package l;

/* JADX INFO: renamed from: l.۠ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7908 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f25990;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f25991;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f25992;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7908 m20923(String str) {
        return new C7908(-1, -1, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7908 m20922(int i, int i2, String str) {
        C18304.m42517(i >= 0);
        C18304.m42517(i2 >= 0);
        str.getClass();
        return new C7908(i, i2, str);
    }

    public C7908(int i, int i2, String str) {
        this.f25992 = i;
        this.f25990 = i2;
        this.f25991 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f25992;
        if (i >= 0) {
            sb.append(i);
            sb.append(':');
        }
        int i2 = this.f25990;
        if (i2 >= 0) {
            sb.append(i2);
            sb.append(':');
        }
        if (i >= 0 || i2 >= 0) {
            sb.append(' ');
        }
        sb.append("error: ");
        sb.append(this.f25991);
        return sb.toString();
    }
}
