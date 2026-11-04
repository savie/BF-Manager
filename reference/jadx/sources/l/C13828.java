package l;

/* JADX INFO: renamed from: l.۬ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 079R */
/* JADX INFO: loaded from: classes4.dex */
public final class C13828 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f43891;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f43892;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f43893;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f43894;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f43895;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f43896;

    public C13828(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f43896 = str;
        this.f43895 = str2;
        this.f43891 = str3;
        this.f43894 = str4;
        this.f43892 = str5;
        this.f43893 = str6;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C13828 m33744(String str) {
        return new C13828("entry_text", str, null, null, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13828 m33742(String str) {
        return new C13828("axml", str, null, null, null, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13828 m33745(String str) {
        return new C13828("dex_class_smali", null, str, null, null, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13828 m33746(String str, String str2) {
        return new C13828("dex_method_smali", null, str, str2, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13828 m33743(String str, String str2) {
        return new C13828("dex_field_smali", null, str, null, str2, null);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C13828 m33747(String str) {
        return new C13828("resource_item", null, null, null, null, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m33748() {
        String str = this.f43895;
        if (str != null) {
            return str;
        }
        String str2 = this.f43894;
        String str3 = this.f43891;
        if (str2 != null) {
            return str3 + " " + str2;
        }
        String str4 = this.f43892;
        if (str4 != null) {
            return str3 + " " + str4;
        }
        String str5 = this.f43893;
        return str5 != null ? str5 : str3;
    }
}
