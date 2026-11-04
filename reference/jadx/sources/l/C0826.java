package l;

/* JADX INFO: renamed from: l.֨֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6782 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0826 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m3317(String str) {
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
        throw C21203.m48365((RuntimeException) new IllegalArgumentException("invalid sort method"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9774 m3316(String str) {
        Integer num = (Integer) C17423.f56652.get("local:" + str);
        if (num == null) {
            return null;
        }
        return new C9774(C14118.m34280(num.intValue()), C14118.m34290(num.intValue()));
    }
}
