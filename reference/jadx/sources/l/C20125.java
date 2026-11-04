package l;

/* JADX INFO: renamed from: l.ᩴ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20125 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f64672;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f64673;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f64674;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Integer f64675;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f64676;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f64677;

    public C20125(String str, String str2, Integer num, boolean z, boolean z2, String str3) {
        this.f64673 = str;
        this.f64677 = str2;
        this.f64675 = num;
        this.f64674 = z;
        this.f64672 = z2;
        this.f64676 = str3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20125 m46335(int i, String str, String str2) {
        return new C20125(str, str2, Integer.valueOf(i), false, true, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20125 m46334(int i, String str) {
        return new C20125(str, null, Integer.valueOf(i), true, true, "VALUE_XML_TRUNCATED");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20125 m46336(String str) {
        return new C20125(str, null, null, false, false, "VALUE_XML_TOO_LARGE");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20125 m46337(String str, String str2) {
        return new C20125(str, null, null, false, false, str2);
    }
}
