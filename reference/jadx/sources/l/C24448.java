package l;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.᩺ܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BIC */
/* JADX INFO: loaded from: classes.dex */
public final class C24448 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f79362;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f79364;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f79365;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f79366;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f79367;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f79368;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public char[] f79370;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f79372;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public StringReader f79373;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f79371 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String[] f79369 = new String[512];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f79361 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f79363 = 1;

    public C24448(StringReader stringReader, int i) {
        C14838.m35757(stringReader.markSupported());
        this.f79373 = stringReader;
        this.f79370 = new char[Math.min(i, 32768)];
        m54657();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54684() {
        StringReader stringReader = this.f79373;
        if (stringReader == null) {
            return;
        }
        try {
            stringReader.close();
        } catch (IOException unused) {
        } finally {
            this.f79373 = null;
            this.f79370 = null;
            this.f79369 = null;
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m54657() {
        int i;
        int i2;
        boolean z;
        if (this.f79365 || (i = this.f79364) < this.f79372) {
            return;
        }
        int i3 = this.f79371;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.f79373.skip(j);
            this.f79373.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                StringReader stringReader = this.f79373;
                char[] cArr = this.f79370;
                int i5 = stringReader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.f79365 = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.f79373.reset();
            if (i4 > 0) {
                if (jSkip != j) {
                    z = false;
                }
                C14838.m35757(z);
                this.f79362 = i4;
                this.f79368 += i;
                this.f79364 = i2;
                if (this.f79371 != -1) {
                    this.f79371 = 0;
                }
                this.f79372 = Math.min(i4, 24576);
            }
            m54656();
            this.f79366 = null;
        } catch (IOException e) {
            throw new C6636(e);
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m54668() {
        return this.f79368 + this.f79364;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54685(boolean z) {
        if (z && this.f79361 == null) {
            this.f79361 = new ArrayList(409);
            m54656();
        } else {
            if (z) {
                return;
            }
            this.f79361 = null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m54655(int i) {
        ArrayList arrayList = this.f79361;
        if (arrayList == null) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m54656() {
        ArrayList arrayList = this.f79361;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                int iM54655 = m54655(this.f79368);
                if (iM54655 == -1) {
                    iM54655 = 0;
                }
                Integer num = (Integer) this.f79361.get(iM54655);
                num.getClass();
                this.f79363 += iM54655;
                this.f79361.clear();
                this.f79361.add(num);
            }
            for (int i = this.f79364; i < this.f79362; i++) {
                if (this.f79370[i] == '\n') {
                    this.f79361.add(Integer.valueOf(this.f79368 + 1 + i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m54661(int i) {
        int iM54655;
        if (this.f79361 != null && (iM54655 = m54655(i)) != -1) {
            i -= ((Integer) this.f79361.get(iM54655)).intValue();
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m54682(int i) {
        if (this.f79361 == null) {
            return 1;
        }
        int iM54655 = m54655(i);
        if (iM54655 == -1) {
            return this.f79363;
        }
        return iM54655 + this.f79363 + 1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m54679() {
        return m54682(m54668()) + ":" + m54661(m54668());
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m54677() {
        m54657();
        return this.f79364 >= this.f79362;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char m54678() {
        m54657();
        int i = this.f79364;
        if (i >= this.f79362) {
            return (char) 65535;
        }
        return this.f79370[i];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final char m54669() {
        m54657();
        int i = this.f79364;
        char c = i >= this.f79362 ? (char) 65535 : this.f79370[i];
        this.f79364 = i + 1;
        return c;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m54660() {
        int i = this.f79364;
        if (i < 1) {
            throw new C6636(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f79364 = i - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54665() {
        this.f79364++;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m54691() {
        if (this.f79362 - this.f79364 < 1024) {
            this.f79372 = 0;
        }
        m54657();
        this.f79371 = this.f79364;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m54675() {
        this.f79371 = -1;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m54692() {
        int i = this.f79371;
        if (i == -1) {
            throw new C6636(new IOException("Mark invalid"));
        }
        this.f79364 = i;
        this.f79371 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m54662(char c) {
        int i;
        m54657();
        int i2 = this.f79364;
        while (true) {
            if (i2 >= this.f79362) {
                i = -1;
                break;
            }
            if (c == this.f79370[i2]) {
                i = i2 - this.f79364;
                break;
            }
            i2++;
        }
        if (i != -1) {
            String strM54654 = m54654(this.f79370, this.f79369, this.f79364, i);
            this.f79364 += i;
            return strM54654;
        }
        m54657();
        char[] cArr = this.f79370;
        String[] strArr = this.f79369;
        int i3 = this.f79364;
        String strM54655 = m54654(cArr, strArr, i3, this.f79362 - i3);
        this.f79364 = this.f79362;
        return strM54655;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m54688(String str) {
        m54657();
        char cCharAt = str.charAt(0);
        int i = this.f79364;
        while (i < this.f79362) {
            if (cCharAt != this.f79370[i]) {
                do {
                    i++;
                    if (i >= this.f79362) {
                        break;
                    }
                } while (cCharAt != this.f79370[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.f79362;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == this.f79370[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f79364;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m54693() {
        int iM54688 = m54688("]]>");
        if (iM54688 != -1) {
            String strM54654 = m54654(this.f79370, this.f79369, this.f79364, iM54688);
            this.f79364 += iM54688;
            return strM54654;
        }
        int i = this.f79362;
        int i2 = this.f79364;
        if (i - i2 >= 3) {
            int i3 = i - 2;
            String strM54655 = m54654(this.f79370, this.f79369, i2, i3 - i2);
            this.f79364 = i3;
            return strM54655;
        }
        m54657();
        char[] cArr = this.f79370;
        String[] strArr = this.f79369;
        int i4 = this.f79364;
        String strM54656 = m54654(cArr, strArr, i4, this.f79362 - i4);
        this.f79364 = this.f79362;
        return strM54656;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m54664(char... cArr) {
        m54657();
        int i = this.f79364;
        int i2 = this.f79362;
        char[] cArr2 = this.f79370;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f79364 = i3;
        return i3 > i ? m54654(this.f79370, this.f79369, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m54683(char... cArr) {
        m54657();
        int i = this.f79364;
        int i2 = this.f79362;
        char[] cArr2 = this.f79370;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f79364 = i3;
        return i3 > i ? m54654(this.f79370, this.f79369, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m54689() {
        int i = this.f79364;
        int i2 = this.f79362;
        char[] cArr = this.f79370;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f79364 = i3;
        return i3 > i ? m54654(this.f79370, this.f79369, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m54663(boolean z) {
        int i = this.f79364;
        int i2 = this.f79362;
        char[] cArr = this.f79370;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&') {
                    break;
                }
                if (c == '\'') {
                    if (!z) {
                        break;
                    }
                    break;
                }
                continue;
                i3++;
            }
            if (!z) {
                break;
            }
            i3++;
        }
        this.f79364 = i3;
        return i3 > i ? m54654(this.f79370, this.f79369, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m54658() {
        int i = this.f79364;
        int i2 = this.f79362;
        char[] cArr = this.f79370;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.f79364 = i3;
        return i3 > i ? m54654(this.f79370, this.f79369, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m54672() {
        m54657();
        int i = this.f79364;
        int i2 = this.f79362;
        char[] cArr = this.f79370;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '<' || c == '>') {
                break;
            }
            i3++;
        }
        this.f79364 = i3;
        return i3 > i ? m54654(this.f79370, this.f79369, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m54674() {
        char c;
        m54657();
        int i = this.f79364;
        while (true) {
            int i2 = this.f79364;
            if (i2 >= this.f79362 || (((c = this.f79370[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f79364++;
        }
        return m54654(this.f79370, this.f79369, i, this.f79364 - i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m54667() {
        int i;
        char c;
        char c2;
        m54657();
        int i2 = this.f79364;
        while (true) {
            int i3 = this.f79364;
            if (i3 >= this.f79362 || (((c2 = this.f79370[i3]) < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !Character.isLetter(c2)))) {
                break;
            }
            this.f79364++;
        }
        while (true) {
            i = this.f79364;
            if (i >= this.f79362 || (c = this.f79370[i]) < '0' || c > '9') {
                break;
            }
            this.f79364 = i + 1;
        }
        return m54654(this.f79370, this.f79369, i2, i - i2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m54676() {
        int i;
        char c;
        m54657();
        int i2 = this.f79364;
        while (true) {
            i = this.f79364;
            if (i >= this.f79362 || (((c = this.f79370[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f79364 = i + 1;
        }
        return m54654(this.f79370, this.f79369, i2, i - i2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m54680() {
        int i;
        char c;
        m54657();
        int i2 = this.f79364;
        while (true) {
            i = this.f79364;
            if (i >= this.f79362 || (c = this.f79370[i]) < '0' || c > '9') {
                break;
            }
            this.f79364 = i + 1;
        }
        return m54654(this.f79370, this.f79369, i2, i - i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54686(char c) {
        return !m54677() && this.f79370[this.f79364] == c;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m54670(String str) {
        m54657();
        int length = str.length();
        if (length <= this.f79362 - this.f79364) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.f79370[this.f79364 + i])) {
                }
            }
            this.f79364 = str.length() + this.f79364;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m54671(char... cArr) {
        if (!m54677()) {
            m54657();
            char c = this.f79370[this.f79364];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m54690(char[] cArr) {
        m54657();
        return !m54677() && Arrays.binarySearch(cArr, this.f79370[this.f79364]) >= 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m54673() {
        if (m54677()) {
            return false;
        }
        char c = this.f79370[this.f79364];
        if (c < 'A' || c > 'Z') {
            return (c >= 'a' && c <= 'z') || Character.isLetter(c);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m54659() {
        if (m54677()) {
            return false;
        }
        char c = this.f79370[this.f79364];
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m54681() {
        char c;
        return !m54677() && (c = this.f79370[this.f79364]) >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54687(String str) {
        m54657();
        m54657();
        int length = str.length();
        if (length <= this.f79362 - this.f79364) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.f79370[this.f79364 + i]) {
                }
            }
            this.f79364 = str.length() + this.f79364;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54666(String str) {
        if (str.equals(this.f79366)) {
            int i = this.f79367;
            if (i == -1) {
                return false;
            }
            if (i >= this.f79364) {
                return true;
            }
        }
        this.f79366 = str;
        Locale locale = Locale.ENGLISH;
        int iM54688 = m54688(str.toLowerCase(locale));
        if (iM54688 > -1) {
            this.f79367 = this.f79364 + iM54688;
            return true;
        }
        int iM54689 = m54688(str.toUpperCase(locale));
        boolean z = iM54689 > -1;
        this.f79367 = z ? this.f79364 + iM54689 : -1;
        return z;
    }

    public final String toString() {
        int i = this.f79362;
        int i2 = this.f79364;
        return i - i2 < 0 ? "" : new String(this.f79370, i2, i - i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m54654(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + cArr[i + i5];
        }
        int i6 = i4 & SecP521R1Field.P16;
        String str = strArr[i6];
        if (str != null && i2 == str.length()) {
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
        String str2 = new String(cArr, i, i2);
        strArr[i6] = str2;
        return str2;
    }
}
