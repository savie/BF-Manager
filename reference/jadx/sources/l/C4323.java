package l;

import com.alipay.sdk.m.y.q;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۙ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7P2 */
/* JADX INFO: loaded from: classes2.dex */
public class C4323 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int f15517 = 31;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Writer f15521;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final char[] f15512 = {'\\', '\"'};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final char[] f15519 = {'\\', '\\'};

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final char[] f15520 = {'\\', 'n'};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final char[] f15513 = {'\\', 'r'};

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final char[] f15518 = {'\\', 't'};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final char[] f15514 = {'\\', 'u', '2', '0', '2', '8'};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final char[] f15516 = {'\\', 'u', '2', '0', '2', '9'};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final char[] f15515 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public C4323(Writer writer) {
        this.f15521 = writer;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m12159(String str) throws IOException {
        this.f15521.write(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m12151(String str) throws IOException {
        this.f15521.write(str);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void m12155(String str) throws IOException {
        this.f15521.write(34);
        m12153(str);
        this.f15521.write(34);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo12158() throws IOException {
        this.f15521.write(91);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo12152() throws IOException {
        this.f15521.write(93);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo12156() throws IOException {
        this.f15521.write(44);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void mo12160() throws IOException {
        this.f15521.write(123);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void mo12154() throws IOException {
        this.f15521.write(q.h);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m12157(String str) throws IOException {
        this.f15521.write(34);
        m12153(str);
        this.f15521.write(34);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo12150() throws IOException {
        this.f15521.write(58);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void mo12149() throws IOException {
        this.f15521.write(44);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m12153(String str) throws IOException {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char[] cArrM12148 = m12148(str.charAt(i2));
            if (cArrM12148 != null) {
                this.f15521.write(str, i, i2 - i);
                this.f15521.write(cArrM12148);
                i = i2 + 1;
            }
        }
        this.f15521.write(str, i, length - i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static char[] m12148(char c) {
        if (c > '\\') {
            if (c < 8232 || c > 8233) {
                return null;
            }
            return c == 8232 ? f15514 : f15516;
        }
        if (c == '\\') {
            return f15519;
        }
        if (c > '\"') {
            return null;
        }
        if (c == '\"') {
            return f15512;
        }
        if (c > 31) {
            return null;
        }
        if (c == '\n') {
            return f15520;
        }
        if (c == '\r') {
            return f15513;
        }
        if (c == '\t') {
            return f15518;
        }
        char[] cArr = f15515;
        return new char[]{'\\', 'u', '0', '0', cArr[(c >> 4) & 15], cArr[c & 15]};
    }
}
