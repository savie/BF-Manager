package l;

/* JADX INFO: renamed from: l.ᩴܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7F0 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC18817 {
    Visible("@+"),
    Invisible("@-"),
    VisibleType("@T+"),
    InvisibleType("@T-");


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f60989;

    EnumC18817(String str) {
        this.f60989 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m43426(String str) {
        return str.startsWith(Invisible.f60989) || str.startsWith(Visible.f60989);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m43422(String str) {
        return str.startsWith(InvisibleType.f60989) || str.startsWith(VisibleType.f60989);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43423(String str) {
        return str.startsWith("@");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m43425(String str) {
        return str.endsWith("-");
    }
}
