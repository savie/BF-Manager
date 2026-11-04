package l;

/* JADX INFO: renamed from: l.ܳ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6KC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15699 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37471(boolean z) {
        int i = C21576.f68931.getInt(z ? "mpom" : "hpom", 0);
        if (i < 0 || i > 2) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37472(int i, boolean z) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Invalid preview open mode");
        }
        C21576.f68931.edit().mo3486(i, z ? "mpom" : "hpom").apply();
    }
}
