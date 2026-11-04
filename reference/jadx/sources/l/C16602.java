package l;

/* JADX INFO: renamed from: l.ܺۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IIRU */
/* JADX INFO: loaded from: classes4.dex */
public final class C16602 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39285(String str) {
        return str.contains("{AN}") || str.contains("{AP}") || str.contains("{AV}") || str.contains("{AC}");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m39286(String str) {
        return str.replace("{A}", "{AN}").replace("{P}", "{AP}").replace("{V}", "{AV}").replace("{C}", "{AC}");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39284(String str, String str2, String str3, String str4, String str5) {
        return str.replace("{AN}", str2).replace("{AP}", str3).replace("{AV}", str4).replace("{AC}", str5);
    }
}
