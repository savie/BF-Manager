package l;

/* JADX INFO: renamed from: l.۬ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C13969 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f44293;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24413 f44294;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6711 f44295;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1270 f44296;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f44297;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8246 f44298;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20881 f44299;

    public C13969(C24413 c24413, C1270 c1270, C8246 c8246, C6711 c6711, C20881 c20881, boolean z, boolean z2) {
        C17359.requireNonNull(c24413, "definition");
        this.f44294 = c24413;
        this.f44296 = c1270;
        this.f44298 = c8246;
        this.f44295 = c6711;
        this.f44299 = c20881;
        this.f44297 = z;
        this.f44293 = z2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13969 m34040(C24413 c24413) {
        return new C13969(c24413, null, null, null, null, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13969 m34041(C24413 c24413, C1270 c1270, C8246 c8246, C20881 c20881) {
        return new C13969(c24413, c1270, c8246, null, c20881, true, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13969 m34042(C24413 c24413, C6711 c6711, C20881 c20881) {
        return new C13969(c24413, c6711.m18742(), null, c6711, c20881, true, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24413 m34048() {
        return this.f44294;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1270 m34049() {
        return this.f44296;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8246 m34043() {
        return this.f44298;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6711 m34047() {
        return this.f44295;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20881 m34044() {
        return this.f44299;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m34045() {
        return this.f44297;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m34046() {
        return this.f44293;
    }
}
