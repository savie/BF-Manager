package l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAX9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22463 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50646(int i, String str) {
        int length = str.length();
        if (i >= length) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        char cCharAt = "E".charAt(0);
        int i2 = length - 1;
        while (i <= i2) {
            if (!m50650(str.charAt(i), cCharAt)) {
                do {
                    i++;
                    if (i > i2) {
                        break;
                    }
                } while (!m50650(str.charAt(i), cCharAt));
            }
            if (i <= i2) {
                int i3 = i + 1;
                int i4 = i + 1;
                for (int i5 = 1; i3 < i4 && m50650(str.charAt(i3), "E".charAt(i5)); i5++) {
                    i3++;
                }
                if (i3 == i4) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50647(C12479 c12479) {
        int i;
        int i2 = 0;
        int i3 = 0;
        do {
            int iM31002 = c12479.m31002();
            i2 |= (iM31002 & 127) << (i3 * 7);
            i3++;
            i = iM31002 & 128;
            if (i != 128) {
                break;
            }
        } while (i3 < 5);
        if (i != 128) {
            return i2;
        }
        throw new C13817("Invalid LEB128 sequence");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50648(String str, CharSequence... charSequenceArr) {
        StringBuilder sb = new StringBuilder();
        for (CharSequence charSequence : charSequenceArr) {
            if (sb.length() > 0) {
                sb.append((CharSequence) str);
            }
            sb.append(charSequence);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m50649(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C18856.m43744(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50650(char c, char c2) {
        char upperCase;
        char upperCase2;
        if (c < 'a') {
            upperCase = c;
        } else {
            upperCase = c <= 'z' ? (char) (c - ' ') : Character.toUpperCase(c);
        }
        if (c2 < 'a') {
            upperCase2 = c2;
        } else {
            upperCase2 = c2 <= 'z' ? (char) (c2 - ' ') : Character.toUpperCase(c2);
        }
        return upperCase == upperCase2 || m50645(c) == m50645(c2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static char m50645(char c) {
        if (c < 'A') {
            return c;
        }
        if (c < 'a' || c > 'z') {
            return c <= 'Z' ? (char) (c + ' ') : Character.toLowerCase(c);
        }
        return c;
    }
}
