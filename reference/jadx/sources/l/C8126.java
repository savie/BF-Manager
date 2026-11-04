package l;

import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: l.۟᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6XM */
/* JADX INFO: loaded from: classes3.dex */
public final class C8126 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] f26809 = new char[8192];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f26810;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f26811;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InputStreamReader f26812;

    public C8126(InputStreamReader inputStreamReader) {
        this.f26812 = inputStreamReader;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m22009(C8126 c8126) throws IOException {
        int iM22007 = c8126.m22007();
        if (iM22007 < 0) {
            return -1;
        }
        char c = (char) iM22007;
        if (Character.isLowSurrogate(c)) {
            throw new C10362();
        }
        if (!Character.isHighSurrogate(c)) {
            return iM22007;
        }
        int iM22008 = c8126.m22007();
        if (iM22008 >= 0) {
            char c2 = (char) iM22008;
            if (Character.isLowSurrogate(c2)) {
                return Character.toCodePoint(c, c2);
            }
        }
        throw new C10362();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22007() throws IOException {
        int i;
        do {
            int i2 = this.f26810;
            int i3 = this.f26811;
            char[] cArr = this.f26809;
            if (i2 >= i3) {
                i = this.f26812.read(cArr);
                this.f26811 = i;
                this.f26810 = 0;
            } else {
                this.f26810 = i2 + 1;
                return cArr[i2];
            }
        } while (i >= 0);
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22008(C8126 c8126) throws IOException {
        char c;
        char[] cArr = c8126.f26809;
        do {
            boolean z = false;
            while (true) {
                int i = c8126.f26810;
                if (i < c8126.f26811) {
                    c8126.f26810 = i + 1;
                    c = cArr[i];
                    if (z) {
                        break;
                    }
                    if (Character.isLowSurrogate(c)) {
                        throw new C10362();
                    }
                    if (Character.isHighSurrogate(c)) {
                        z = true;
                    }
                } else {
                    int i2 = c8126.f26812.read(cArr);
                    c8126.f26811 = i2;
                    c8126.f26810 = 0;
                    if (i2 < 0) {
                        if (z) {
                            throw new C10362();
                        }
                        return;
                    }
                }
            }
        } while (Character.isLowSurrogate(c));
        throw new C10362();
    }
}
