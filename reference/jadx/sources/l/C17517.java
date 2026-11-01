package l;

/* JADX INFO: renamed from: l.ܿᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: YAHK */
/* JADX INFO: loaded from: classes4.dex */
public final class C17517 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m40778(C21813 c21813) {
        return (c21813 == null || c21813.isNegative() || c21813.isZero()) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21813 m40777(C21813 c21813, C21813 c21814) {
        if (c21813 != null) {
            return c21813;
        }
        C13638.requireNonNull(c21814, "defaultValue");
        return c21814;
    }
}
