package l;

/* JADX INFO: renamed from: l.᩺ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: P708 */
/* JADX INFO: loaded from: classes.dex */
public final class C24413 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C24413 f79216;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16800 f79217;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20661 f79218;

    static {
        EnumC6513 enumC6513 = EnumC6513.TEXT;
        f79216 = new C24413(null, null);
    }

    public C24413(C16800 c16800, C20661 c20661) {
        this.f79217 = c16800;
        this.f79218 = c20661;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24413 m54612(C16800 c16800) {
        C20661 c20661M47275;
        if (c16800 == null) {
            c20661M47275 = null;
        } else {
            try {
                c20661M47275 = C20661.m47275(c16800);
            } catch (RuntimeException unused) {
                return f79216;
            }
        }
        if (c16800 != null) {
            c16800.m39679(C17941.f58779);
        }
        EnumC6513 enumC6513 = EnumC6513.TEXT;
        return new C24413(c16800, c20661M47275);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16800 m54613() {
        return this.f79217;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20661 m54614() {
        return this.f79218;
    }
}
