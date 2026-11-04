package l;

import android.os.Bundle;
import android.view.MotionEvent;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC3T */
/* JADX INFO: loaded from: classes5.dex */
public final class C18856 implements InterfaceC13530 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43746(int i) {
        return i >= 1024 && i <= 65535;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m43752(String str) {
        if (str == null) {
            return null;
        }
        return C1402.m5124(1, 1, str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m43755(int i) {
        switch (i) {
            case 35:
                return 23;
            case 36:
            default:
                return -1;
            case 37:
                return 25;
            case 38:
                return 27;
            case 39:
                return 29;
            case 40:
                return 34;
            case 41:
                return 35;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43744(Throwable th, Throwable th2) {
        C15243.m36590(th, "<this>");
        C15243.m36590(th2, "exception");
        if (th != th2) {
            C7062.f23273.mo14339(th, th2);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m43754(int i, byte[] bArr) {
        if (i >= 3) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            if (i2 == 239 && i3 == 187 && i4 == 191) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43743(int i, int i2, CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String) charSequence).substring(i, i2);
        }
        if (i < 0 || i2 < i || i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == i2) {
            return "";
        }
        int i3 = i2 - i;
        char[] cArr = new char[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            cArr[i4] = charSequence.charAt(i + i4);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Integer m43756(String str) {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        try {
            int i = Integer.parseInt(strTrim);
            if (m43746(i)) {
                return Integer.valueOf(i);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43747(int i, byte[] bArr) {
        if (i >= 2) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            if (i2 == 254 && i3 == 255) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43751(String str) {
        char cCharAt;
        if (str != null && !str.isEmpty()) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 < '@') {
                    if (((1 << cCharAt2) & 4294957567L) != 0) {
                        return true;
                    }
                } else if (cCharAt2 < 128) {
                    if (cCharAt2 == 127) {
                        return true;
                    }
                } else if (cCharAt2 < 8203 || cCharAt2 > 8303) {
                    if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                        if ((cCharAt2 >= 57344 && cCharAt2 <= 63743) || cCharAt2 == 65533 || cCharAt2 == 65279) {
                            return true;
                        }
                    } else if (cCharAt2 > 56319 || (i = i + 1) >= length || (cCharAt = str.charAt(i)) < 56320 || cCharAt > 57343 || Character.toCodePoint(cCharAt2, cCharAt) >= 983040) {
                        return true;
                    }
                } else if (cCharAt2 <= 8207 || ((cCharAt2 >= 8232 && cCharAt2 <= 8239) || cCharAt2 >= 8288)) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43748(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            return bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        if (bundle2 == null) {
            return bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        return bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43750(CharSequence charSequence, boolean z, int i, String str, int i2) {
        char upperCase;
        char upperCase2;
        if (i >= 0 && i <= charSequence.length() - i2 && str.length() - i2 >= 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                char cCharAt = charSequence.charAt(i + i3);
                char cCharAt2 = str.charAt(i3);
                if (cCharAt == cCharAt2 || (z && ((upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(cCharAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m43757(int i, byte[] bArr) {
        if (i >= 2) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            if (i2 == 255 && i3 == 254) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43742(String str, CharSequence charSequence, int i) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(str, i);
        }
        if (str.isEmpty()) {
            return Math.min(Math.max(0, i), charSequence.length());
        }
        int length = charSequence.length() - str.length();
        for (int iMax = Math.max(0, i); iMax <= length; iMax++) {
            if (m43750(charSequence, false, iMax, str, str.length())) {
                return iMax;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m43753(int i, byte[] bArr) {
        if (i >= 4) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            int i5 = bArr[3] & 255;
            if (i2 == 0 && i3 == 0 && i4 == 254 && i5 == 255) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m43758(int i, byte[] bArr) {
        if (i >= 4) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            int i5 = bArr[3] & 255;
            if (i2 == 255 && i3 == 254 && i4 == 0 && i5 == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43745(InterfaceC13433 interfaceC13433) {
        if (interfaceC13433 != null) {
            try {
                interfaceC13433.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43749(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
