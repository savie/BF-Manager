package l;

/* JADX INFO: renamed from: l.ܿۨ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C17327 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f55125;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C13531 f55126;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f55127;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f55128;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f55129;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f55130;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f55131 = "single_value";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f55132;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f55133;

    public C17327(String str, int i, int i2, int i3, int i4, String str2) {
        this.f55129 = i;
        this.f55130 = i2;
        this.f55133 = str;
        this.f55125 = i3;
        this.f55132 = str2;
        this.f55128 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40289(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        if (str.regionMatches(true, 0, "0x", 0, 2)) {
            return C22703.m50295(this.f55129, str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f55133);
        sb.append("/");
        String str2 = this.f55132;
        sb.append(str2);
        return sb.toString().startsWith(str) || str2.startsWith(str);
    }
}
