package l;

/* JADX INFO: renamed from: l.ۖ۬۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 079R */
/* JADX INFO: loaded from: classes2.dex */
public final class C2550 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f10096;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f10097;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f10098;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f10099;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f10100;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f10101;

    public C2550(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f10096 = str;
        this.f10100 = str2;
        this.f10097 = str3;
        this.f10098 = str4;
        this.f10099 = str5;
        this.f10101 = str6;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C2550 m7951(String str) {
        return new C2550("entry_text", str, null, null, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2550 m7949(String str) {
        return new C2550("axml", str, null, null, null, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C2550 m7952(String str) {
        return new C2550("dex_class_smali", null, str, null, null, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C2550 m7953(String str, String str2) {
        return new C2550("dex_method_smali", null, str, str2, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2550 m7950(String str, String str2) {
        return new C2550("dex_field_smali", null, str, null, str2, null);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C2550 m7948(String str) {
        return new C2550("resource_item", null, null, null, null, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m7954() {
        String str = this.f10100;
        if (str != null) {
            return str;
        }
        String str2 = this.f10098;
        String str3 = this.f10097;
        if (str2 != null) {
            return str3 + " " + str2;
        }
        String str4 = this.f10099;
        if (str4 != null) {
            return str3 + " " + str4;
        }
        String str5 = this.f10101;
        return str5 != null ? str5 : str3;
    }
}
