package l;

/* JADX INFO: renamed from: l.᩵᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7AT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20871 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4245 f66807;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12666 f66808;

    public C20871(C12666 c12666, C4245 c4245) {
        this.f66808 = c12666;
        this.f66807 = c4245;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3717 m47696(CharSequence charSequence, String str) {
        C4245 c4245 = this.f66807;
        c4245.m13568reset(charSequence);
        boolean zMatches = "exact".equals(this.f66808.f40588) ? c4245.matches() : c4245.find();
        m47698();
        if (zMatches) {
            return new C3717(str, c4245.start(), c4245.end(), charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47699(CharSequence charSequence, C10428 c10428) throws C10186 {
        C4245 c4245 = this.f66807;
        c4245.m13568reset(charSequence);
        if ("exact".equals(this.f66808.f40588)) {
            boolean zMatches = c4245.matches();
            m47698();
            if (zMatches) {
                c10428.m26781(new C3717("dexString", c4245.start(), c4245.end(), charSequence));
                return;
            }
            return;
        }
        while (c4245.find()) {
            m47698();
            c10428.m26781(new C3717("dexString", c4245.start(), c4245.end(), charSequence));
        }
        m47698();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3717 m47695(int i, int i2, CharSequence charSequence) throws C10186 {
        C4245 c4245 = this.f66807;
        c4245.m13568reset(charSequence);
        while (c4245.find()) {
            m47698();
            if (c4245.start() < i2 && c4245.end() > i) {
                return new C3717("dexClassName", c4245.start(), c4245.end(), charSequence);
            }
        }
        m47698();
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47698() throws C10186 {
        C4245 c4245 = this.f66807;
        if (c4245.m13557()) {
            throw C10186.m26304(null, "REGEX_TIMEOUT", "Regex matching timed out.", "fatal");
        }
        if (c4245.m13560()) {
            throw C10186.m26304(null, "REGEX_RESOURCE_LIMIT", "Regex matching exceeded its execution memory limit.", "fatal");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4245 m47697(C18459 c18459) {
        C4245 c4245 = this.f66807;
        c4245.m13568reset((CharSequence) c18459);
        return c4245;
    }
}
