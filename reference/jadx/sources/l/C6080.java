package l;

/* JADX INFO: renamed from: l.ۛ۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UK */
/* JADX INFO: loaded from: classes2.dex */
public final class C6080 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f20594 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f20593 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17369 m16484(C11634 c11634, boolean z) {
        int iM29039 = c11634.m29039(5);
        if (iM29039 == 31) {
            iM29039 = c11634.m29039(6) + 32;
        }
        int iM16483 = m16483(c11634);
        int iM290310 = c11634.m29039(4);
        String strM22141 = C8479.m22141(iM29039, "mp4a.40.");
        if (iM29039 == 5 || iM29039 == 29) {
            iM16483 = m16483(c11634);
            int iM290311 = c11634.m29039(5);
            if (iM290311 == 31) {
                iM290311 = c11634.m29039(6) + 32;
            }
            iM29039 = iM290311;
            if (iM29039 == 22) {
                iM290310 = c11634.m29039(4);
            }
        }
        if (z) {
            if (iM29039 != 1 && iM29039 != 2 && iM29039 != 3 && iM29039 != 4 && iM29039 != 6 && iM29039 != 7 && iM29039 != 17) {
                switch (iM29039) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C22861.m50611("Unsupported audio object type: " + iM29039);
                }
            }
            if (c11634.m29035()) {
                C0303.m1848("Unexpected frameLengthFlag = 1");
            }
            if (c11634.m29035()) {
                c11634.m29034(14);
            }
            boolean zM29035 = c11634.m29035();
            if (iM290310 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iM29039 == 6 || iM29039 == 20) {
                c11634.m29034(3);
            }
            if (zM29035) {
                if (iM29039 == 22) {
                    c11634.m29034(16);
                }
                if (iM29039 == 17 || iM29039 == 19 || iM29039 == 20 || iM29039 == 23) {
                    c11634.m29034(3);
                }
                c11634.m29034(1);
            }
            switch (iM29039) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM290312 = c11634.m29039(2);
                    if (iM290312 == 2 || iM290312 == 3) {
                        throw C22861.m50611("Unsupported epConfig: " + iM290312);
                    }
                    break;
            }
        }
        int i = f20593[iM290310];
        if (i != -1) {
            return new C17369(iM16483, i, strM22141);
        }
        throw C22861.m50610((String) null, (Throwable) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16483(C11634 c11634) throws C22861 {
        int iM29039 = c11634.m29039(4);
        if (iM29039 == 15) {
            if (c11634.m29030() < 24) {
                throw C22861.m50610("AAC header insufficient data", (Throwable) null);
            }
            return c11634.m29039(24);
        }
        if (iM29039 < 13) {
            return f20594[iM29039];
        }
        throw C22861.m50610("AAC header wrong Sampling Frequency Index", (Throwable) null);
    }
}
