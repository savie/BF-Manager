package l;

/* JADX INFO: renamed from: l.ܺۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16628 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f53764 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f53763 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24834 m39348(C14573 c14573, boolean z) throws C2970 {
        int iM35163 = c14573.m35163(5);
        if (iM35163 == 31) {
            iM35163 = c14573.m35163(6) + 32;
        }
        int iM39347 = m39347(c14573);
        int iM35164 = c14573.m35163(4);
        String strM33382 = C13645.m33382(iM35163, "mp4a.40.");
        if (iM35163 == 5 || iM35163 == 29) {
            iM39347 = m39347(c14573);
            int iM35165 = c14573.m35163(5);
            if (iM35165 == 31) {
                iM35165 = c14573.m35163(6) + 32;
            }
            iM35163 = iM35165;
            if (iM35163 == 22) {
                iM35164 = c14573.m35163(4);
            }
        }
        if (z) {
            if (iM35163 != 1 && iM35163 != 2 && iM35163 != 3 && iM35163 != 4 && iM35163 != 6 && iM35163 != 7 && iM35163 != 17) {
                switch (iM35163) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C2970.m9689("Unsupported audio object type: " + iM35163);
                }
            }
            if (c14573.m35162()) {
                C1896.m6517("Unexpected frameLengthFlag = 1");
            }
            if (c14573.m35162()) {
                c14573.m35161(14);
            }
            boolean zM35162 = c14573.m35162();
            if (iM35164 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iM35163 == 6 || iM35163 == 20) {
                c14573.m35161(3);
            }
            if (zM35162) {
                if (iM35163 == 22) {
                    c14573.m35161(16);
                }
                if (iM35163 == 17 || iM35163 == 19 || iM35163 == 20 || iM35163 == 23) {
                    c14573.m35161(3);
                }
                c14573.m35161(1);
            }
            switch (iM35163) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM35166 = c14573.m35163(2);
                    if (iM35166 == 2 || iM35166 == 3) {
                        throw C2970.m9689("Unsupported epConfig: " + iM35166);
                    }
                    break;
            }
        }
        int i = f53763[iM35164];
        if (i != -1) {
            return new C24834(iM39347, i, strM33382);
        }
        throw C2970.m9688((String) null, (Throwable) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39347(C14573 c14573) throws C2970 {
        int iM35163 = c14573.m35163(4);
        if (iM35163 == 15) {
            if (c14573.m35152() < 24) {
                throw C2970.m9688("AAC header insufficient data", (Throwable) null);
            }
            return c14573.m35163(24);
        }
        if (iM35163 < 13) {
            return f53764[iM35163];
        }
        throw C2970.m9688("AAC header wrong Sampling Frequency Index", (Throwable) null);
    }
}
