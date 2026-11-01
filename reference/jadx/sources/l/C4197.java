package l;

/* JADX INFO: renamed from: l.ۘ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E142 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4197 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f15258 = ApplicationC0716.f2992.getBoolean("show_bookmarks_tip", true);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11846() {
        return f15258;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m11847() {
        if (f15258) {
            f15258 = false;
            ApplicationC0716.f2992.edit().putBoolean("show_bookmarks_tip", false).apply();
            C11359.m28442();
        }
    }
}
