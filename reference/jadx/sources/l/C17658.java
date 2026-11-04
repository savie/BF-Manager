package l;

/* JADX INFO: renamed from: l.ܽܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D6JB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17658 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f58046 = {".tar", ".tar.gz", ".taz", ".tgz", ".tar.xz", ".txz", ".tar.zst", ".tar.zstd", ".tar.bz2", ".tbz2", ".tbz", ".tar.lz4"};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C16912 m41323(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return null;
        }
        boolean z = true;
        if (iLastIndexOf == str.length() - 1) {
            return null;
        }
        int i = iLastIndexOf + 1;
        int length = str.length() - i;
        char cM50373 = C22313.m50373(1, str);
        if (cM50373 < '0' || cM50373 > '9') {
            if (length < 6 || !m41321(i, str, "part")) {
                return null;
            }
            for (int i2 = iLastIndexOf + 5; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                }
                if (cCharAt < 'a' || cCharAt > 'z') {
                    return null;
                }
            }
            String strSubstring = str.substring(0, iLastIndexOf);
            if (m41322(strSubstring)) {
                return new C16912(strSubstring, EnumC25118.TAR);
            }
            return null;
        }
        if (length == 3) {
            int i3 = i;
            while (true) {
                if (i3 >= str.length()) {
                    if (str.charAt(i) != '0' || str.charAt(iLastIndexOf + 2) != '0' || cM50373 != '0') {
                        if (!m41321(iLastIndexOf - 4, str, ".zip")) {
                            if (!m41321(iLastIndexOf - 3, str, ".7z")) {
                                break;
                            }
                            return new C16912(str.substring(0, iLastIndexOf), EnumC25118.SEVEN_ZIP);
                        }
                        return new C16912(str.substring(0, iLastIndexOf), EnumC25118.ZIP);
                    }
                    break;
                }
                char cCharAt2 = str.charAt(i3);
                if (cCharAt2 < '0' || cCharAt2 > '9') {
                    break;
                }
                i3++;
            }
        }
        if (length < 3) {
            return null;
        }
        char cCharAt3 = str.charAt(i);
        if (cCharAt3 >= 'A' && cCharAt3 <= 'Z') {
            cCharAt3 = (char) (cCharAt3 + ' ');
        }
        if (cCharAt3 != 'z') {
            return null;
        }
        int i4 = iLastIndexOf + 2;
        for (int i5 = i4; i5 < str.length(); i5++) {
            char cCharAt4 = str.charAt(i5);
            if (cCharAt4 < '0' || cCharAt4 > '9') {
                z = false;
                break;
            }
        }
        if (!z) {
            return null;
        }
        if (str.charAt(i4) == '0' && (length != 3 || cM50373 == '0')) {
            return null;
        }
        return new C16912(str.substring(0, iLastIndexOf) + ".zip", EnumC25118.ZIP);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41322(String str) {
        for (int i = 0; i < 12; i++) {
            String str2 = f58046[i];
            if (m41321(str.length() - str2.length(), str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41321(int i, String str, String str2) {
        if (i >= 0 && str2.length() + i <= str.length()) {
            for (int i2 = 0; i2 < str2.length(); i2++) {
                char cCharAt = str.charAt(i + i2);
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                }
                if (cCharAt == str2.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }
}
