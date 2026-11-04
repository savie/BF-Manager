package l;

/* JADX INFO: renamed from: l.ۗܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N3OT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3479 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10190 f12025;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11682 f12026;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3479 m11430(String str, String str2, AbstractC10190 abstractC10190) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        StringBuilder sb = new StringBuilder("form-data; name=");
        C20633.m47243(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            C20633.m47243(sb, str2);
        }
        C1988 c1988 = new C1988();
        String string = sb.toString();
        C11682.m29359("Content-Disposition");
        c1988.m6814("Content-Disposition", string);
        C11682 c11682 = new C11682(c1988);
        if (c11682.m29361("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c11682.m29361("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        return new C3479(c11682, abstractC10190);
    }

    public C3479(C11682 c11682, AbstractC10190 abstractC10190) {
        this.f12026 = c11682;
        this.f12025 = abstractC10190;
    }
}
