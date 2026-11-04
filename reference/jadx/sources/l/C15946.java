package l;

/* JADX INFO: renamed from: l.ܶ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15946 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38063(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbM5126 = C1402.m5126("fromIndex: ", i, ", toIndex: ", ", size: ", i2);
            sbM5126.append(i3);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(C6934.m19217("fromIndex: ", i, i2, " > toIndex: "));
        }
    }
}
