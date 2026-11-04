package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۧܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56XL */
/* JADX INFO: loaded from: classes.dex */
public class C11678 extends C16285 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C17031 f37827;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f37828 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C5823 f37829;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C3651 f37830;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f37831;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1897 f37832;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C22977 f37833;

    public native C11678(int i, C1897 c1897, C3651 c3651, C22209 c22209, C0580 c0580, C5823 c5823);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native List m29352(C1897 c1897, C3651 c3651, C22209 c22209, C0580 c0580, C5823 c5823);

    static {
        ApplicationC23172.m52091(101);
        f37827 = C17031.m40121("2025-06-18", "2025-03-26");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1897 m29354(C20629 c20629) {
        C11678 c11678 = ServiceC6459.f21713;
        if (c11678 == null) {
            return null;
        }
        return c11678.f37832;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1897 m29353(C3475 c3475) {
        C11678 c11678 = ServiceC6459.f21713;
        if (c11678 == null) {
            return null;
        }
        return c11678.f37832;
    }

    public C11678(int i) {
        C1897 c1897 = new C1897();
        C3651 c3651 = new C3651(new C22209(C20015.m46048(), C20015.m46049()));
        C22209 c22209 = new C22209(C20015.m46048(), C20015.m46049());
        C0580 c0580 = new C0580(c22209);
        this(i, c1897, c3651, c22209, c0580, new C5823(c22209, c0580, C15826.m37762()));
    }

    @Override // l.AbstractC1530
    /* JADX INFO: renamed from: ۙ */
    public final C18683 mo5434(C3767 c3767) {
        if (!c3767.m12228().startsWith("/mcp/files/")) {
            return null;
        }
        if (m38645(c3767)) {
            return this.f37833.m51858(c3767);
        }
        C18683 c18683M5422 = AbstractC1530.m5422(EnumC21667.FORBIDDEN, "text/plain", "Origin is not allowed");
        c18683M5422.m43438();
        return c18683M5422;
    }

    @Override // l.C16285, l.AbstractC1530
    /* JADX INFO: renamed from: ᩷ */
    public final C18683 mo5438(C3767 c3767) {
        if (!c3767.m12228().startsWith("/mcp/files/")) {
            return super.mo5438(c3767);
        }
        if (m38645(c3767)) {
            return this.f37833.m51859(c3767);
        }
        C18683 c18683M5422 = AbstractC1530.m5422(EnumC21667.FORBIDDEN, "text/plain", "Origin is not allowed");
        c18683M5422.m43438();
        return c18683M5422;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m29355() {
        return this.f37831;
    }

    @Override // l.AbstractC1530
    /* JADX INFO: renamed from: ᩸ */
    public final void mo5440() {
        C1897 c1897 = this.f37832;
        C3651 c3651 = this.f37830;
        C20653.m47272("MT MCP server stop requested: port=" + this.f37831 + ", wasStarted=" + m5437() + ", alive=" + m5439() + ", listeningPort=" + m5433(), new Throwable("MT MCP server stop trace"));
        this.f37829.close();
        try {
            super.mo5440();
        } finally {
            c3651.close();
            try {
                c1897.m6557();
            } catch (Exception e) {
                C20653.m47272("MT MCP smali cache shutdown failed", e);
            }
        }
    }
}
