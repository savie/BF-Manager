package l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩷ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes.dex */
public final class C22143 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set f71324;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1304 f71325;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f71326;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3497 f71327;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f71328;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f71329;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C3497 f71330;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3497 f71331;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C13192 f71332;

    public C22143(C1304 c1304, int i, String str, String str2, Set set) {
        this.f71325 = c1304;
        this.f71326 = i;
        this.f71328 = str;
        this.f71329 = str2;
        this.f71324 = set;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17667 m50101() {
        String str;
        C13192 c13192 = this.f71332;
        String str2 = this.f71328;
        if (c13192 == null) {
            return new C17667(str2, true, null, null, null, null, null, false);
        }
        C3497 c3497 = this.f71330;
        if (c3497 == null && (c3497 = this.f71331) == null) {
            c3497 = this.f71327;
        }
        if (c3497 != null) {
            String str3 = c3497.f12068;
            String strM4316 = ("item_list".equals(str3) || "null_value".equals(str3) || "unparsed".equals(str3) || (str = c3497.f12061) == null) ? null : C1173.m4316(0, str.length(), 300, str);
            C13192 c13193 = this.f71332;
            return new C17667(str2, false, c13193.f42136, c13193.f42138, c3497.f12055, str3, strM4316, c3497.f12063);
        }
        return new C17667(str2, false, c13192.f42136, c13192.f42138, null, "null_value", null, false);
    }
}
