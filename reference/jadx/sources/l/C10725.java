package l;

/* JADX INFO: renamed from: l.ۧۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FE */
/* JADX INFO: loaded from: classes3.dex */
public final class C10725 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18485 f36561;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22719 f36562;

    public C10725(C22719 c22719, C18485 c18485) {
        this.f36562 = c22719;
        this.f36561 = c18485;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0030  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26950(C22719 c22719, C18485 c18485) {
        int iM42858 = c18485.m42858();
        if (iM42858 != 200 && iM42858 != 410 && iM42858 != 414 && iM42858 != 501 && iM42858 != 203 && iM42858 != 204) {
            if (iM42858 == 307) {
                if (c18485.m42859("Expires") == null && c18485.m42862().m33482() == -1 && !c18485.m42862().m33484() && !c18485.m42862().m33480()) {
                    return false;
                }
            } else if (iM42858 != 308 && iM42858 != 404 && iM42858 != 405) {
                switch (iM42858) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        if (c18485.m42859("Expires") == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return (c18485.m42862().m33483() || c22719.m50361().m33483()) ? false : true;
    }
}
