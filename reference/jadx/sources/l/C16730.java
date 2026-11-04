package l;

/* JADX INFO: renamed from: l.ܺۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E142 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16730 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f54024 = ApplicationC17729.f58258.getBoolean("show_bookmarks_tip", true);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39495() {
        return f54024;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m39496() {
        if (f54024) {
            f54024 = false;
            ApplicationC17729.f58258.edit().putBoolean("show_bookmarks_tip", false).apply();
            C1750.m6151();
        }
    }
}
