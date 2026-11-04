package l;

import com.alipay.sdk.m.y.q;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.֨᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7P2 */
/* JADX INFO: loaded from: classes2.dex */
public class C1486 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f5175 = 31;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Writer f5182;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final char[] f5177 = {'\\', '\"'};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final char[] f5180 = {'\\', '\\'};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final char[] f5178 = {'\\', 'n'};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final char[] f5181 = {'\\', 'r'};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final char[] f5174 = {'\\', 't'};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f5173 = {'\\', 'u', '2', '0', '2', '8'};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final char[] f5176 = {'\\', 'u', '2', '0', '2', '9'};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final char[] f5179 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public C1486(Writer writer) {
        this.f5182 = writer;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m5306(String str) throws IOException {
        this.f5182.write(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m5308(String str) throws IOException {
        this.f5182.write(str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m5304(String str) throws IOException {
        this.f5182.write(34);
        m5298(str);
        this.f5182.write(34);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo5305() throws IOException {
        this.f5182.write(91);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo5297() throws IOException {
        this.f5182.write(93);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo5299() throws IOException {
        this.f5182.write(44);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void mo5302() throws IOException {
        this.f5182.write(123);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void mo5303() throws IOException {
        this.f5182.write(q.h);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m5300(String str) throws IOException {
        this.f5182.write(34);
        m5298(str);
        this.f5182.write(34);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void mo5307() throws IOException {
        this.f5182.write(58);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void mo5301() throws IOException {
        this.f5182.write(44);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m5298(String str) throws IOException {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char[] cArrM5296 = m5296(str.charAt(i2));
            if (cArrM5296 != null) {
                this.f5182.write(str, i, i2 - i);
                this.f5182.write(cArrM5296);
                i = i2 + 1;
            }
        }
        this.f5182.write(str, i, length - i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static char[] m5296(char c) {
        if (c > '\\') {
            if (c < 8232 || c > 8233) {
                return null;
            }
            return c == 8232 ? f5173 : f5176;
        }
        if (c == '\\') {
            return f5180;
        }
        if (c > '\"') {
            return null;
        }
        if (c == '\"') {
            return f5177;
        }
        if (c > 31) {
            return null;
        }
        if (c == '\n') {
            return f5178;
        }
        if (c == '\r') {
            return f5181;
        }
        if (c == '\t') {
            return f5174;
        }
        char[] cArr = f5179;
        return new char[]{'\\', 'u', '0', '0', cArr[(c >> 4) & 15], cArr[c & 15]};
    }
}
