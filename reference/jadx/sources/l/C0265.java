package l;

/* JADX INFO: renamed from: l.֡۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0265 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1765(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbM2791 = C0589.m2791("fromIndex: ", i, ", toIndex: ", ", size: ", i2);
            sbM2791.append(i3);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(C2271.m6967("fromIndex: ", i, i2, " > toIndex: "));
        }
    }
}
