package l;

/* JADX INFO: renamed from: l.ۡۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: O7F0 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9324 {
    Visible("@+"),
    Invisible("@-"),
    VisibleType("@T+"),
    InvisibleType("@T-");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f30303;

    EnumC9324(String str) {
        this.f30303 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m24560(String str) {
        return str.startsWith(Invisible.f30303) || str.startsWith(Visible.f30303);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m24561(String str) {
        return str.startsWith(InvisibleType.f30303) || str.startsWith(VisibleType.f30303);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24557(String str) {
        return str.startsWith("@");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m24559(String str) {
        return str.endsWith("-");
    }
}
