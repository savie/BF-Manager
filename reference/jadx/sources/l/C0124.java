package l;

/* JADX INFO: renamed from: l.֡ۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0124 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f1109;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f1110;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Integer f1111;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f1112;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f1113;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f1114;

    public C0124(String str, String str2, Integer num, boolean z, boolean z2, String str3) {
        this.f1112 = str;
        this.f1109 = str2;
        this.f1111 = num;
        this.f1114 = z;
        this.f1110 = z2;
        this.f1113 = str3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0124 m1185(int i, String str, String str2) {
        return new C0124(str, str2, Integer.valueOf(i), false, true, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0124 m1184(int i, String str) {
        return new C0124(str, null, Integer.valueOf(i), true, true, "VALUE_XML_TRUNCATED");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0124 m1186(String str) {
        return new C0124(str, null, null, false, false, "VALUE_XML_TOO_LARGE");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0124 m1187(String str, String str2) {
        return new C0124(str, null, null, false, false, str2);
    }
}
