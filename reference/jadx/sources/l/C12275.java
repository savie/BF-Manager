package l;

/* JADX INFO: renamed from: l.۫۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 99YG */
/* JADX INFO: loaded from: classes3.dex */
public final class C12275 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f41047;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f41048;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f41049;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f41050;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f41051;

    public C12275(InterfaceC11306 interfaceC11306) {
        String name = interfaceC11306.getName();
        this.f41049 = name.endsWith("/") ? C20630.m46498(1, 0, name) : name;
        this.f41050 = interfaceC11306.mo28308();
        boolean zIsDirectory = interfaceC11306.isDirectory();
        this.f41051 = zIsDirectory;
        this.f41048 = interfaceC11306.mo28310();
        this.f41047 = zIsDirectory ? -1L : interfaceC11306.length();
    }

    public C12275(C17248 c17248) {
        String strM40208 = c17248.m40208();
        this.f41049 = strM40208;
        this.f41050 = -1L;
        this.f41047 = -1L;
        this.f41051 = true;
        this.f41048 = strM40208.startsWith("$");
    }

    public C12275(C21545 c21545) {
        this.f41049 = c21545.m11356();
        this.f41047 = c21545.m48264();
        C1644 c1644M48267 = c21545.m48267();
        c1644M48267 = c1644M48267 == null ? c21545.m48266() : c1644M48267;
        this.f41050 = c1644M48267 != null ? c1644M48267.m5535() : -1L;
        long jM48265 = c21545.m48265();
        this.f41051 = C20799.m46784(jM48265, EnumC4611.FILE_ATTRIBUTE_DIRECTORY);
        this.f41048 = C20799.m46784(jM48265, EnumC4611.FILE_ATTRIBUTE_HIDDEN);
    }
}
