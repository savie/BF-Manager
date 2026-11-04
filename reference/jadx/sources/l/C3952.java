package l;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BIC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3952 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f13490;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String[] f13491;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f13492;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f13493;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final StringReader f13494;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final char[] f13495;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f13496;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f13497;

    public C3952(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.f13491 = new String[128];
        if (stringReader.markSupported()) {
            this.f13494 = stringReader;
            this.f13495 = new char[4096];
            m12670();
            return;
        }
        throw new IllegalArgumentException("Must be true");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m12670() {
        StringReader stringReader = this.f13494;
        int i = this.f13492;
        if (i < this.f13497) {
            return;
        }
        try {
            stringReader.skip(i);
            stringReader.mark(4096);
            int i2 = stringReader.read(this.f13495);
            stringReader.reset();
            if (i2 != -1) {
                this.f13490 = i2;
                this.f13493 += this.f13492;
                this.f13492 = 0;
                this.f13496 = 0;
                if (i2 > 3072) {
                    i2 = 3072;
                }
                this.f13497 = i2;
            }
        } catch (IOException e) {
            throw new C3206(e);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m12695() {
        return this.f13493 + this.f13492;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m12696() {
        m12670();
        return this.f13492 >= this.f13490;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char m12681() {
        m12670();
        int i = this.f13492;
        if (i >= this.f13490) {
            return (char) 65535;
        }
        return this.f13495[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char m12689() {
        m12670();
        int i = this.f13492;
        char c = i >= this.f13490 ? (char) 65535 : this.f13495[i];
        this.f13492 = i + 1;
        return c;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m12688() {
        this.f13492--;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12675() {
        this.f13492++;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m12685() {
        this.f13496 = this.f13492;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m12672() {
        this.f13492 = this.f13496;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m12673(char c) {
        char[] cArr;
        int i;
        m12670();
        int i2 = this.f13492;
        while (true) {
            int i3 = this.f13490;
            cArr = this.f13495;
            if (i2 >= i3) {
                i = -1;
                break;
            }
            if (c == cArr[i2]) {
                i = i2 - this.f13492;
                break;
            }
            i2++;
        }
        String[] strArr = this.f13491;
        if (i != -1) {
            String strM12669 = m12669(cArr, strArr, this.f13492, i);
            this.f13492 += i;
            return strM12669;
        }
        m12670();
        int i4 = this.f13492;
        String strM126610 = m12669(cArr, strArr, i4, this.f13490 - i4);
        this.f13492 = this.f13490;
        return strM126610;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m12678(String str) {
        m12670();
        char cCharAt = str.charAt(0);
        int i = this.f13492;
        while (i < this.f13490) {
            char[] cArr = this.f13495;
            if (cCharAt != cArr[i]) {
                do {
                    i++;
                    if (i >= this.f13490) {
                        break;
                    }
                } while (cCharAt != cArr[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.f13490;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == cArr[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f13492;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m12671() {
        int iM12678 = m12678("]]>");
        String[] strArr = this.f13491;
        char[] cArr = this.f13495;
        if (iM12678 != -1) {
            String strM12669 = m12669(cArr, strArr, this.f13492, iM12678);
            this.f13492 += iM12678;
            return strM12669;
        }
        m12670();
        int i = this.f13492;
        String strM126610 = m12669(cArr, strArr, i, this.f13490 - i);
        this.f13492 = this.f13490;
        return strM126610;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m12674(char... cArr) {
        char[] cArr2;
        m12670();
        int i = this.f13492;
        int i2 = this.f13490;
        loop0: while (true) {
            int i3 = this.f13492;
            cArr2 = this.f13495;
            if (i3 >= i2) {
                break;
            }
            for (char c : cArr) {
                if (cArr2[this.f13492] == c) {
                    break loop0;
                }
            }
            this.f13492++;
        }
        int i4 = this.f13492;
        return i4 > i ? m12669(cArr2, this.f13491, i, i4 - i) : "";
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m12690(char... cArr) {
        char[] cArr2;
        m12670();
        int i = this.f13492;
        int i2 = this.f13490;
        while (true) {
            int i3 = this.f13492;
            cArr2 = this.f13495;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                break;
            }
            this.f13492++;
        }
        int i4 = this.f13492;
        return i4 > i ? m12669(cArr2, this.f13491, i, i4 - i) : "";
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m12679() {
        int i;
        char[] cArr;
        char c;
        m12670();
        int i2 = this.f13492;
        int i3 = this.f13490;
        while (true) {
            i = this.f13492;
            cArr = this.f13495;
            if (i >= i3 || (c = cArr[i]) == '&' || c == '<' || c == 0) {
                break;
            }
            this.f13492 = i + 1;
        }
        return i > i2 ? m12669(cArr, this.f13491, i2, i - i2) : "";
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m12677() {
        int i;
        char[] cArr;
        char c;
        m12670();
        int i2 = this.f13492;
        int i3 = this.f13490;
        while (true) {
            i = this.f13492;
            cArr = this.f13495;
            if (i >= i3 || (c = cArr[i]) == '\t' || c == '\n' || c == '\r' || c == '\f' || c == ' ' || c == '/' || c == '>' || c == 0) {
                break;
            }
            this.f13492 = i + 1;
        }
        return i > i2 ? m12669(cArr, this.f13491, i2, i - i2) : "";
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m12683() {
        char[] cArr;
        char c;
        m12670();
        int i = this.f13492;
        while (true) {
            int i2 = this.f13492;
            int i3 = this.f13490;
            cArr = this.f13495;
            if (i2 >= i3 || (((c = cArr[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f13492++;
        }
        return m12669(cArr, this.f13491, i, this.f13492 - i);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m12682() {
        char[] cArr;
        int i;
        char c;
        char c2;
        m12670();
        int i2 = this.f13492;
        while (true) {
            int i3 = this.f13492;
            int i4 = this.f13490;
            cArr = this.f13495;
            if (i3 >= i4 || (((c2 = cArr[i3]) < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !Character.isLetter(c2)))) {
                break;
            }
            this.f13492++;
        }
        while (true) {
            i = this.f13492;
            if (i >= this.f13490 || (c = cArr[i]) < '0' || c > '9') {
                break;
            }
            this.f13492 = i + 1;
        }
        return m12669(cArr, this.f13491, i2, i - i2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m12687() {
        int i;
        char[] cArr;
        char c;
        m12670();
        int i2 = this.f13492;
        while (true) {
            i = this.f13492;
            int i3 = this.f13490;
            cArr = this.f13495;
            if (i >= i3 || (((c = cArr[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f13492 = i + 1;
        }
        return m12669(cArr, this.f13491, i2, i - i2);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m12693() {
        int i;
        char[] cArr;
        char c;
        m12670();
        int i2 = this.f13492;
        while (true) {
            i = this.f13492;
            int i3 = this.f13490;
            cArr = this.f13495;
            if (i >= i3 || (c = cArr[i]) < '0' || c > '9') {
                break;
            }
            this.f13492 = i + 1;
        }
        return m12669(cArr, this.f13491, i2, i - i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m12691(char c) {
        return !m12696() && this.f13495[this.f13492] == c;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m12692(String str) {
        m12670();
        int length = str.length();
        if (length <= this.f13490 - this.f13492) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.f13495[this.f13492 + i])) {
                }
            }
            this.f13492 = str.length() + this.f13492;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m12680(char... cArr) {
        if (!m12696()) {
            m12670();
            char c = this.f13495[this.f13492];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m12694(char[] cArr) {
        m12670();
        return !m12696() && Arrays.binarySearch(cArr, this.f13495[this.f13492]) >= 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m12684() {
        if (m12696()) {
            return false;
        }
        char c = this.f13495[this.f13492];
        if (c < 'A' || c > 'Z') {
            return (c >= 'a' && c <= 'z') || Character.isLetter(c);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m12686() {
        char c;
        return !m12696() && (c = this.f13495[this.f13492]) >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12676(String str) {
        m12670();
        m12670();
        int length = str.length();
        if (length <= this.f13490 - this.f13492) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.f13495[this.f13492 + i]) {
                }
            }
            this.f13492 = str.length() + this.f13492;
            return true;
        }
        return false;
    }

    public final String toString() {
        int i = this.f13492;
        return new String(this.f13495, i, this.f13490 - i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12669(char[] cArr, String[] strArr, int i, int i2) {
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
