package l;

/* JADX INFO: renamed from: l.ܺۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 1968 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15923 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C15923 f51599 = new C15923("", "", false);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C15923 f51600 = new C15923("\n", EnumC19730.f63352, true);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f51601;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f51602;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f51603;

    public C15923(String str, String str2, boolean z) {
        C13638.requireNonNull(str, "newline == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f51603 = str;
        this.f51601 = str2;
        this.f51602 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15923 m37886(String str) {
        return new C15923(this.f51603, str, this.f51602);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m37888() {
        return this.f51603;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m37885() {
        return this.f51601;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m37887() {
        return this.f51602;
    }
}
