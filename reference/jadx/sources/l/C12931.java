package l;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۬ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BIC */
/* JADX INFO: loaded from: classes3.dex */
public final class C12931 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f42974;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f42975;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42976;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final char[] f42977;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f42978;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String[] f42979;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f42980;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final StringReader f42981;

    public C12931(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.f42979 = new String[128];
        if (stringReader.markSupported()) {
            this.f42981 = stringReader;
            this.f42977 = new char[4096];
            m32017();
            return;
        }
        throw new IllegalArgumentException("Must be true");
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m32017() {
        StringReader stringReader = this.f42981;
        int i = this.f42978;
        if (i < this.f42975) {
            return;
        }
        try {
            stringReader.skip(i);
            stringReader.mark(4096);
            int i2 = stringReader.read(this.f42977);
            stringReader.reset();
            if (i2 != -1) {
                this.f42976 = i2;
                this.f42974 += this.f42978;
                this.f42978 = 0;
                this.f42980 = 0;
                if (i2 > 3072) {
                    i2 = 3072;
                }
                this.f42975 = i2;
            }
        } catch (IOException e) {
            throw new C11520(e);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m32039() {
        return this.f42974 + this.f42978;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m32043() {
        m32017();
        return this.f42978 >= this.f42976;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final char m32027() {
        m32017();
        int i = this.f42978;
        if (i >= this.f42976) {
            return (char) 65535;
        }
        return this.f42977[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char m32033() {
        m32017();
        int i = this.f42978;
        char c = i >= this.f42976 ? (char) 65535 : this.f42977[i];
        this.f42978 = i + 1;
        return c;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m32040() {
        this.f42978--;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32024() {
        this.f42978++;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m32037() {
        this.f42980 = this.f42978;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m32028() {
        this.f42978 = this.f42980;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m32022(char c) {
        char[] cArr;
        int i;
        m32017();
        int i2 = this.f42978;
        while (true) {
            int i3 = this.f42976;
            cArr = this.f42977;
            if (i2 >= i3) {
                i = -1;
                break;
            }
            if (c == cArr[i2]) {
                i = i2 - this.f42978;
                break;
            }
            i2++;
        }
        String[] strArr = this.f42979;
        if (i != -1) {
            String strM32016 = m32016(cArr, strArr, this.f42978, i);
            this.f42978 += i;
            return strM32016;
        }
        m32017();
        int i4 = this.f42978;
        String strM32017 = m32016(cArr, strArr, i4, this.f42976 - i4);
        this.f42978 = this.f42976;
        return strM32017;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m32029(String str) {
        m32017();
        char cCharAt = str.charAt(0);
        int i = this.f42978;
        while (i < this.f42976) {
            char[] cArr = this.f42977;
            if (cCharAt != cArr[i]) {
                do {
                    i++;
                    if (i >= this.f42976) {
                        break;
                    }
                } while (cCharAt != cArr[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.f42976;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == cArr[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f42978;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m32021() {
        int iM32029 = m32029("]]>");
        String[] strArr = this.f42979;
        char[] cArr = this.f42977;
        if (iM32029 != -1) {
            String strM32016 = m32016(cArr, strArr, this.f42978, iM32029);
            this.f42978 += iM32029;
            return strM32016;
        }
        m32017();
        int i = this.f42978;
        String strM32017 = m32016(cArr, strArr, i, this.f42976 - i);
        this.f42978 = this.f42976;
        return strM32017;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m32023(char... cArr) {
        char[] cArr2;
        m32017();
        int i = this.f42978;
        int i2 = this.f42976;
        loop0: while (true) {
            int i3 = this.f42978;
            cArr2 = this.f42977;
            if (i3 >= i2) {
                break;
            }
            for (char c : cArr) {
                if (cArr2[this.f42978] == c) {
                    break loop0;
                }
            }
            this.f42978++;
        }
        int i4 = this.f42978;
        return i4 > i ? m32016(cArr2, this.f42979, i, i4 - i) : "";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m32034(char... cArr) {
        char[] cArr2;
        m32017();
        int i = this.f42978;
        int i2 = this.f42976;
        while (true) {
            int i3 = this.f42978;
            cArr2 = this.f42977;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                break;
            }
            this.f42978++;
        }
        int i4 = this.f42978;
        return i4 > i ? m32016(cArr2, this.f42979, i, i4 - i) : "";
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m32030() {
        int i;
        char[] cArr;
        char c;
        m32017();
        int i2 = this.f42978;
        int i3 = this.f42976;
        while (true) {
            i = this.f42978;
            cArr = this.f42977;
            if (i >= i3 || (c = cArr[i]) == '&' || c == '<' || c == 0) {
                break;
            }
            this.f42978 = i + 1;
        }
        return i > i2 ? m32016(cArr, this.f42979, i2, i - i2) : "";
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m32032() {
        int i;
        char[] cArr;
        char c;
        m32017();
        int i2 = this.f42978;
        int i3 = this.f42976;
        while (true) {
            i = this.f42978;
            cArr = this.f42977;
            if (i >= i3 || (c = cArr[i]) == '\t' || c == '\n' || c == '\r' || c == '\f' || c == ' ' || c == '/' || c == '>' || c == 0) {
                break;
            }
            this.f42978 = i + 1;
        }
        return i > i2 ? m32016(cArr, this.f42979, i2, i - i2) : "";
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m32042() {
        char[] cArr;
        char c;
        m32017();
        int i = this.f42978;
        while (true) {
            int i2 = this.f42978;
            int i3 = this.f42976;
            cArr = this.f42977;
            if (i2 >= i3 || (((c = cArr[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f42978++;
        }
        return m32016(cArr, this.f42979, i, this.f42978 - i);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m32018() {
        char[] cArr;
        int i;
        char c;
        char c2;
        m32017();
        int i2 = this.f42978;
        while (true) {
            int i3 = this.f42978;
            int i4 = this.f42976;
            cArr = this.f42977;
            if (i3 >= i4 || (((c2 = cArr[i3]) < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !Character.isLetter(c2)))) {
                break;
            }
            this.f42978++;
        }
        while (true) {
            i = this.f42978;
            if (i >= this.f42976 || (c = cArr[i]) < '0' || c > '9') {
                break;
            }
            this.f42978 = i + 1;
        }
        return m32016(cArr, this.f42979, i2, i - i2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m32026() {
        int i;
        char[] cArr;
        char c;
        m32017();
        int i2 = this.f42978;
        while (true) {
            i = this.f42978;
            int i3 = this.f42976;
            cArr = this.f42977;
            if (i >= i3 || (((c = cArr[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f42978 = i + 1;
        }
        return m32016(cArr, this.f42979, i2, i - i2);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m32019() {
        int i;
        char[] cArr;
        char c;
        m32017();
        int i2 = this.f42978;
        while (true) {
            i = this.f42978;
            int i3 = this.f42976;
            cArr = this.f42977;
            if (i >= i3 || (c = cArr[i]) < '0' || c > '9') {
                break;
            }
            this.f42978 = i + 1;
        }
        return m32016(cArr, this.f42979, i2, i - i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m32035(char c) {
        return !m32043() && this.f42977[this.f42978] == c;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m32036(String str) {
        m32017();
        int length = str.length();
        if (length <= this.f42976 - this.f42978) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.f42977[this.f42978 + i])) {
                }
            }
            this.f42978 = str.length() + this.f42978;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m32031(char... cArr) {
        if (!m32043()) {
            m32017();
            char c = this.f42977[this.f42978];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m32020(char[] cArr) {
        m32017();
        return !m32043() && Arrays.binarySearch(cArr, this.f42977[this.f42978]) >= 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m32038() {
        if (m32043()) {
            return false;
        }
        char c = this.f42977[this.f42978];
        if (c < 'A' || c > 'Z') {
            return (c >= 'a' && c <= 'z') || Character.isLetter(c);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m32041() {
        char c;
        return !m32043() && (c = this.f42977[this.f42978]) >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32025(String str) {
        m32017();
        m32017();
        int length = str.length();
        if (length <= this.f42976 - this.f42978) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.f42977[this.f42978 + i]) {
                }
            }
            this.f42978 = str.length() + this.f42978;
            return true;
        }
        return false;
    }

    public final String toString() {
        int i = this.f42978;
        return new String(this.f42977, i, this.f42976 - i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m32016(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = i;
        while (i4 < i2) {
            i5 = (i5 * 31) + cArr[i6];
            i4++;
            i6++;
        }
        int length = i5 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        }
        if (i2 == str.length()) {
            int i7 = i;
            int i8 = i2;
            while (true) {
                int i9 = i8 - 1;
                if (i8 == 0) {
                    return str;
                }
                int i10 = i7 + 1;
                int i11 = i3 + 1;
                if (cArr[i7] == str.charAt(i3)) {
                    i7 = i10;
                    i8 = i9;
                    i3 = i11;
                }
            }
        }
        String str3 = new String(cArr, i, i2);
        strArr[length] = str3;
        return str3;
    }
}
