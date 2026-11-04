package l;

/* JADX INFO: renamed from: l.ۨ᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1968 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12587 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f40412;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f40413;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f40414;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C12587 f40411 = new C12587("", "", false);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C12587 f40410 = new C12587("\n", EnumC7687.f25319, true);

    public C12587(String str, String str2, boolean z) {
        C17359.requireNonNull(str, "newline == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f40414 = str;
        this.f40412 = str2;
        this.f40413 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12587 m31298(String str) {
        return new C12587(this.f40414, str, this.f40413);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m31300() {
        return this.f40414;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m31297() {
        return this.f40412;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m31299() {
        return this.f40413;
    }
}
