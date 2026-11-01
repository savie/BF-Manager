package l;

/* JADX INFO: renamed from: l.᩹᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N12S */
/* JADX INFO: loaded from: classes.dex */
public final class C22501 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f73452;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f73453;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f73454;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f73455;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f73456;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f73457;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    public C22501(long j, long j2, String str, String str2) {
        String str3;
        String str4 = "zip";
        if (!str.equals("folder")) {
            String strM48172 = C21512.m48172(".".concat(str));
            strM48172.getClass();
            switch (strM48172) {
                case "application/vnd.android.package-archives":
                case "application/x-jar":
                case "application/zip":
                    str3 = "zip";
                    break;
                case "application/vnd.android.package-archive":
                    str3 = "apk";
                    break;
                default:
                    str3 = str;
                    break;
            }
        } else {
            str3 = str;
        }
        this.f73454 = str3;
        if (!str2.equals("folder")) {
            String strM48173 = C21512.m48172(".".concat(str2));
            strM48173.getClass();
            switch (strM48173) {
                case "application/vnd.android.package-archives":
                case "application/x-jar":
                case "application/zip":
                    break;
                case "application/vnd.android.package-archive":
                    str4 = "apk";
                    break;
                default:
                    str4 = str2;
                    break;
            }
        } else {
            str4 = str2;
        }
        this.f73457 = str4;
        this.f73453 = str;
        this.f73456 = str2;
        this.f73455 = j;
        this.f73452 = j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50018(String str) {
        return str.equals(this.f73454) && str.equals(this.f73457);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50017() {
        String str = this.f73454;
        boolean zEquals = "zip".equals(str);
        String str2 = this.f73457;
        if (zEquals && "apk".equals(str2)) {
            return true;
        }
        return "apk".equals(str) && "zip".equals(str2);
    }
}
