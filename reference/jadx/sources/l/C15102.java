package l;

/* JADX INFO: renamed from: l.ܶ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6782 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15102 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m36179(String str) {
        if ("name".equals(str)) {
            return 0;
        }
        if ("date".equals(str)) {
            return 1;
        }
        if ("size".equals(str)) {
            return 2;
        }
        if ("type".equals(str)) {
            return 3;
        }
        throw C13316.m32827((RuntimeException) new IllegalArgumentException("invalid sort method"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22863 m36178(String str) {
        Integer num = (Integer) C0674.f2833.get("local:" + str);
        if (num == null) {
            return null;
        }
        return new C22863(C3386.m10039(num.intValue()), C3386.m10049(num.intValue()));
    }
}
