package l;

/* JADX INFO: renamed from: l.ۜ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N12S */
/* JADX INFO: loaded from: classes3.dex */
public final class C6774 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f22589;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f22590;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f22591;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f22592;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f22593;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f22594;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    public C6774(long j, long j2, String str, String str2) {
        String str3;
        String str4 = "zip";
        if (!str.equals("folder")) {
            String strM23965 = C8969.m23965(".".concat(str));
            strM23965.getClass();
            switch (strM23965) {
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
        this.f22592 = str3;
        if (!str2.equals("folder")) {
            String strM23966 = C8969.m23965(".".concat(str2));
            strM23966.getClass();
            switch (strM23966) {
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
        this.f22591 = str4;
        this.f22589 = str;
        this.f22593 = str2;
        this.f22590 = j;
        this.f22594 = j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18897(String str) {
        return str.equals(this.f22592) && str.equals(this.f22591);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18896() {
        String str = this.f22592;
        boolean zEquals = "zip".equals(str);
        String str2 = this.f22591;
        if (zEquals && "apk".equals(str2)) {
            return true;
        }
        return "apk".equals(str) && "zip".equals(str2);
    }
}
