package l;

/* JADX INFO: renamed from: l.ۧ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FE */
/* JADX INFO: loaded from: classes3.dex */
public final class C11617 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9444 f36449;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7954 f36450;

    public C11617(C7954 c7954, C9444 c9444) {
        this.f36450 = c7954;
        this.f36449 = c9444;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0030  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29187(C7954 c7954, C9444 c9444) {
        int iM24820 = c9444.m24820();
        if (iM24820 != 200 && iM24820 != 410 && iM24820 != 414 && iM24820 != 501 && iM24820 != 203 && iM24820 != 204) {
            if (iM24820 == 307) {
                if (c9444.m24817("Expires") == null && c9444.m24827().m31264() == -1 && !c9444.m24827().m31268() && !c9444.m24827().m31262()) {
                    return false;
                }
            } else if (iM24820 != 308 && iM24820 != 404 && iM24820 != 405) {
                switch (iM24820) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        if (c9444.m24817("Expires") == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return (c9444.m24827().m31263() || c7954.m21652().m31263()) ? false : true;
    }
}
