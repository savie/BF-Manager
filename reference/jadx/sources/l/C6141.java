package l;

import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: l.ۛܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6XM */
/* JADX INFO: loaded from: classes2.dex */
public final class C6141 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InputStreamReader f20953;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] f20954 = new char[8192];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f20955;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f20956;

    public C6141(InputStreamReader inputStreamReader) {
        this.f20953 = inputStreamReader;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m17123(C6141 c6141) throws IOException {
        int iM17121 = c6141.m17121();
        if (iM17121 < 0) {
            return -1;
        }
        char c = (char) iM17121;
        if (Character.isLowSurrogate(c)) {
            throw new C23781();
        }
        if (!Character.isHighSurrogate(c)) {
            return iM17121;
        }
        int iM17122 = c6141.m17121();
        if (iM17122 >= 0) {
            char c2 = (char) iM17122;
            if (Character.isLowSurrogate(c2)) {
                return Character.toCodePoint(c, c2);
            }
        }
        throw new C23781();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m17121() throws IOException {
        int i;
        do {
            int i2 = this.f20955;
            int i3 = this.f20956;
            char[] cArr = this.f20954;
            if (i2 >= i3) {
                i = this.f20953.read(cArr);
                this.f20956 = i;
                this.f20955 = 0;
            } else {
                this.f20955 = i2 + 1;
                return cArr[i2];
            }
        } while (i >= 0);
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17122(C6141 c6141) throws IOException {
        char c;
        char[] cArr = c6141.f20954;
        do {
            boolean z = false;
            while (true) {
                int i = c6141.f20955;
                if (i < c6141.f20956) {
                    c6141.f20955 = i + 1;
                    c = cArr[i];
                    if (z) {
                        break;
                    }
                    if (Character.isLowSurrogate(c)) {
                        throw new C23781();
                    }
                    if (Character.isHighSurrogate(c)) {
                        z = true;
                    }
                } else {
                    int i2 = c6141.f20953.read(cArr);
                    c6141.f20956 = i2;
                    c6141.f20955 = 0;
                    if (i2 < 0) {
                        if (z) {
                            throw new C23781();
                        }
                        return;
                    }
                }
            }
        } while (Character.isLowSurrogate(c));
        throw new C23781();
    }
}
