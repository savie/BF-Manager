package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: J7QN */
/* JADX INFO: loaded from: classes2.dex */
public class C6218 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f21125;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] f21127;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20414 f21128;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f21132 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f21126 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char f21131 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f21129 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f21124 = false;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f21130 = false;

    public C6218(C18213 c18213, char[] cArr, int i) {
        this.f21127 = cArr;
        this.f21125 = i;
        this.f21128 = c18213.f58179;
        m17237();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m17238() {
        return this.f21125;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m17247() {
        return this.f21132 < this.f21125;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m17236() {
        EnumC17507 enumC17507;
        int i = this.f21132 + this.f21126;
        this.f21132 = i;
        boolean z = false;
        this.f21126 = 0;
        char[] cArr = this.f21127;
        int i2 = this.f21125;
        if (i2 <= i) {
            this.f21131 = (char) 26;
        } else {
            this.f21131 = cArr[i];
            this.f21126 = 1;
        }
        if (this.f21131 != '\\' || (this.f21124 && !this.f21130)) {
            this.f21124 = false;
            this.f21130 = false;
        } else {
            int i3 = i + this.f21126;
            this.f21131 = '\\';
            this.f21126 = 1;
            int i4 = i3;
            while (i4 < i2 && cArr[i4] == 'u') {
                i4++;
            }
            if (i4 == i3) {
                enumC17507 = EnumC17507.BACKSLASH;
            } else {
                int iDigit = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    iDigit = (iDigit << 4) | (i4 < i2 ? Character.digit(cArr[i4], 16) : -1);
                    if (iDigit < 0) {
                        break;
                    }
                    i4++;
                }
                this.f21126 = i4 - this.f21132;
                if (iDigit >= 0) {
                    this.f21131 = (char) iDigit;
                    enumC17507 = EnumC17507.VALID_ESCAPE;
                } else {
                    this.f21128.m48188(i4, C23879.f77215);
                    enumC17507 = EnumC17507.BROKEN_ESCAPE;
                }
            }
            int iOrdinal = enumC17507.ordinal();
            if (iOrdinal == 0) {
                this.f21130 = false;
                this.f21124 = !this.f21124;
            } else if (iOrdinal == 1) {
                this.f21130 = true;
                if (this.f21131 == '\\' && !this.f21124) {
                    z = true;
                }
                this.f21124 = z;
            } else if (iOrdinal == 2) {
                m17236();
            }
        }
        this.f21129 = this.f21131;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m17237() {
        m17236();
        if (m17239() || !Character.isHighSurrogate(this.f21131)) {
            return;
        }
        char c = this.f21131;
        int i = this.f21132;
        int i2 = this.f21126;
        m17236();
        char c2 = this.f21131;
        if (Character.isLowSurrogate(c2)) {
            this.f21132 = i;
            this.f21126 += i2;
            this.f21129 = Character.toCodePoint(c, c2);
        } else {
            this.f21132 = i;
            this.f21126 = i2;
            this.f21131 = c;
            this.f21129 = c;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m17240() {
        return this.f21132;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17253(int i) {
        this.f21132 = i;
        this.f21126 = 0;
        this.f21124 = false;
        this.f21130 = false;
        m17237();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m17241() {
        return this.f21131;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m17252() {
        return this.f21129;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m17255() {
        return 65535 < this.f21129;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m17239() {
        return this.f21131 <= 127;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public char mo17251() {
        m17237();
        return this.f21131;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m17249(char c) {
        return this.f21131 == c;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17244(char c, char c2) {
        return m17249(c) || m17249(c2);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m17248() {
        while (true) {
            if (!m17249(' ') && !m17249('\t') && !m17249('\f')) {
                return;
            } else {
                mo17251();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17254(char c) {
        char c2 = this.f21131;
        return '0' <= c2 && c2 <= c;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17243(char c) {
        if (!m17249(c)) {
            return false;
        }
        mo17251();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17245(String str) {
        if (str.length() == 0 || !m17249(str.charAt(0))) {
            return false;
        }
        int i = this.f21132;
        m17237();
        for (int i2 = 1; i2 < str.length(); i2++) {
            if (!m17249(str.charAt(i2))) {
                m17253(i);
                return false;
            }
            m17237();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17242(int i) {
        if (m17254('9')) {
            int i2 = this.f21131 - '0';
            if (i2 < i) {
                return i2;
            }
            return -1;
        }
        int iDigit = m17255() ? Character.digit(this.f21129, i) : Character.digit(this.f21131, i);
        if (iDigit >= 0 && !m17239()) {
            this.f21128.m48188(this.f21132, C23879.f77283);
            this.f21131 = "0123456789abcdef".charAt(iDigit);
        }
        return iDigit;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final char[] m17250() {
        char[] cArr = this.f21127;
        int length = cArr.length;
        int i = this.f21125;
        return i == length ? cArr : Arrays.copyOf(cArr, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] m17246(int i, int i2) {
        return Arrays.copyOfRange(this.f21127, i, i2);
    }
}
