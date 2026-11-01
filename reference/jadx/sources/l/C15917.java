package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ܺۨ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15917 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f51577;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C17327 f51578;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Set f51579;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18738 f51580;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13531 f51581;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13531 f51582;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f51583;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13531 f51584;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f51585;

    public C15917(C18738 c18738, int i, String str, String str2, Set set) {
        this.f51580 = c18738;
        this.f51583 = i;
        this.f51577 = str;
        this.f51585 = str2;
        this.f51579 = set;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9567 m37868() {
        String str;
        C17327 c17327 = this.f51578;
        String str2 = this.f51577;
        if (c17327 == null) {
            return new C9567(str2, true, null, null, null, null, null, false);
        }
        C13531 c13531 = this.f51581;
        if (c13531 == null && (c13531 = this.f51584) == null) {
            c13531 = this.f51582;
        }
        if (c13531 != null) {
            String str3 = c13531.f44684;
            String strM20035 = ("item_list".equals(str3) || "null_value".equals(str3) || "unparsed".equals(str3) || (str = c13531.f44683) == null) ? null : C7521.m20035(0, str.length(), 300, str);
            C17327 c17328 = this.f51578;
            return new C9567(str2, false, c17328.f55133, c17328.f55132, c13531.f44678, str3, strM20035, c13531.f44686);
        }
        return new C9567(str2, false, c17327.f55133, c17327.f55132, null, "null_value", null, false);
    }
}
