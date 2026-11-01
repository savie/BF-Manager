package l;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ۖۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BIC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2424 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f9715;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f9716;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f9718;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public char[] f9719;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f9720;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f9721;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f9724;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f9726;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public StringReader f9727;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f9723 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String[] f9725 = new String[512];

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f9717 = null;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f9722 = 1;

    public C2424(StringReader stringReader, int i) {
        C5557.m15344(stringReader.markSupported());
        this.f9727 = stringReader;
        this.f9719 = new char[Math.min(i, 32768)];
        m7364();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m7388() {
        StringReader stringReader = this.f9727;
        if (stringReader == null) {
            return;
        }
        try {
            stringReader.close();
        } catch (IOException unused) {
        } finally {
            this.f9727 = null;
            this.f9719 = null;
            this.f9725 = null;
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m7364() {
        int i;
        int i2;
        boolean z;
        if (this.f9720 || (i = this.f9721) < this.f9716) {
            return;
        }
        int i3 = this.f9723;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.f9727.skip(j);
            this.f9727.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                StringReader stringReader = this.f9727;
                char[] cArr = this.f9719;
                int i5 = stringReader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.f9720 = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.f9727.reset();
            if (i4 > 0) {
                if (jSkip != j) {
                    z = false;
                }
                C5557.m15344(z);
                this.f9718 = i4;
                this.f9724 += i;
                this.f9721 = i2;
                if (this.f9723 != -1) {
                    this.f9723 = 0;
                }
                this.f9716 = Math.min(i4, 24576);
            }
            m7361();
            this.f9715 = null;
        } catch (IOException e) {
            throw new C14025(e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m7381() {
        return this.f9724 + this.f9721;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m7389(boolean z) {
        if (z && this.f9717 == null) {
            this.f9717 = new ArrayList(409);
            m7361();
        } else {
            if (z) {
                return;
            }
            this.f9717 = null;
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m7361() {
        ArrayList arrayList = this.f9717;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                int iM7363 = m7363(this.f9724);
                if (iM7363 == -1) {
                    iM7363 = 0;
                }
                Integer num = (Integer) this.f9717.get(iM7363);
                num.getClass();
                this.f9722 += iM7363;
                this.f9717.clear();
                this.f9717.add(num);
            }
            for (int i = this.f9721; i < this.f9718; i++) {
                if (this.f9719[i] == '\n') {
                    this.f9717.add(Integer.valueOf(this.f9724 + 1 + i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m7363(int i) {
        ArrayList arrayList = this.f9717;
        if (arrayList == null) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7370(int i) {
        int iM7363;
        if (this.f9717 != null && (iM7363 = m7363(i)) != -1) {
            i -= ((Integer) this.f9717.get(iM7363)).intValue();
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m7386(int i) {
        if (this.f9717 == null) {
            return 1;
        }
        int iM7363 = m7363(i);
        if (iM7363 == -1) {
            return this.f9722;
        }
        return iM7363 + this.f9722 + 1;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m7398() {
        return m7386(m7381()) + ":" + m7370(m7381());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m7394() {
        m7364();
        return this.f9721 >= this.f9718;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final char m7392() {
        m7364();
        int i = this.f9721;
        if (i >= this.f9718) {
            return (char) 65535;
        }
        return this.f9719[i];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final char m7382() {
        m7364();
        int i = this.f9721;
        char c = i >= this.f9718 ? (char) 65535 : this.f9719[i];
        this.f9721 = i + 1;
        return c;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7397() {
        int i = this.f9721;
        if (i < 1) {
            throw new C14025(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f9721 = i - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7374() {
        this.f9721++;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m7395() {
        if (this.f9718 - this.f9721 < 1024) {
            this.f9716 = 0;
        }
        m7364();
        this.f9723 = this.f9721;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m7393() {
        this.f9723 = -1;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m7378() {
        int i = this.f9723;
        if (i == -1) {
            throw new C14025(new IOException("Mark invalid"));
        }
        this.f9721 = i;
        this.f9723 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m7371(char c) {
        int i;
        m7364();
        int i2 = this.f9721;
        while (true) {
            if (i2 >= this.f9718) {
                i = -1;
                break;
            }
            if (c == this.f9719[i2]) {
                i = i2 - this.f9721;
                break;
            }
            i2++;
        }
        if (i != -1) {
            String strM7362 = m7362(this.f9719, this.f9725, this.f9721, i);
            this.f9721 += i;
            return strM7362;
        }
        m7364();
        char[] cArr = this.f9719;
        String[] strArr = this.f9725;
        int i3 = this.f9721;
        String strM7363 = m7362(cArr, strArr, i3, this.f9718 - i3);
        this.f9721 = this.f9718;
        return strM7363;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m7366(String str) {
        m7364();
        char cCharAt = str.charAt(0);
        int i = this.f9721;
        while (i < this.f9718) {
            if (cCharAt != this.f9719[i]) {
                do {
                    i++;
                    if (i >= this.f9718) {
                        break;
                    }
                } while (cCharAt != this.f9719[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.f9718;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == this.f9719[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f9721;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m7400() {
        int iM7366 = m7366("]]>");
        if (iM7366 != -1) {
            String strM7362 = m7362(this.f9719, this.f9725, this.f9721, iM7366);
            this.f9721 += iM7366;
            return strM7362;
        }
        int i = this.f9718;
        int i2 = this.f9721;
        if (i - i2 >= 3) {
            int i3 = i - 2;
            String strM7363 = m7362(this.f9719, this.f9725, i2, i3 - i2);
            this.f9721 = i3;
            return strM7363;
        }
        m7364();
        char[] cArr = this.f9719;
        String[] strArr = this.f9725;
        int i4 = this.f9721;
        String strM7364 = m7362(cArr, strArr, i4, this.f9718 - i4);
        this.f9721 = this.f9718;
        return strM7364;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m7373(char... cArr) {
        m7364();
        int i = this.f9721;
        int i2 = this.f9718;
        char[] cArr2 = this.f9719;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f9721 = i3;
        return i3 > i ? m7362(this.f9719, this.f9725, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m7387(char... cArr) {
        m7364();
        int i = this.f9721;
        int i2 = this.f9718;
        char[] cArr2 = this.f9719;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f9721 = i3;
        return i3 > i ? m7362(this.f9719, this.f9725, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m7367() {
        int i = this.f9721;
        int i2 = this.f9718;
        char[] cArr = this.f9719;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f9721 = i3;
        return i3 > i ? m7362(this.f9719, this.f9725, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m7372(boolean z) {
        int i = this.f9721;
        int i2 = this.f9718;
        char[] cArr = this.f9719;
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
        this.f9721 = i3;
        return i3 > i ? m7362(this.f9719, this.f9725, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m7369() {
        int i = this.f9721;
        int i2 = this.f9718;
        char[] cArr = this.f9719;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.f9721 = i3;
        return i3 > i ? m7362(this.f9719, this.f9725, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m7377() {
        m7364();
        int i = this.f9721;
        int i2 = this.f9718;
        char[] cArr = this.f9719;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '<' || c == '>') {
                break;
            }
            i3++;
        }
        this.f9721 = i3;
        return i3 > i ? m7362(this.f9719, this.f9725, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m7365() {
        char c;
        m7364();
        int i = this.f9721;
        while (true) {
            int i2 = this.f9721;
            if (i2 >= this.f9718 || (((c = this.f9719[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f9721++;
        }
        return m7362(this.f9719, this.f9725, i, this.f9721 - i);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m7385() {
        int i;
        char c;
        char c2;
        m7364();
        int i2 = this.f9721;
        while (true) {
            int i3 = this.f9721;
            if (i3 >= this.f9718 || (((c2 = this.f9719[i3]) < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !Character.isLetter(c2)))) {
                break;
            }
            this.f9721++;
        }
        while (true) {
            i = this.f9721;
            if (i >= this.f9718 || (c = this.f9719[i]) < '0' || c > '9') {
                break;
            }
            this.f9721 = i + 1;
        }
        return m7362(this.f9719, this.f9725, i2, i - i2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m7399() {
        int i;
        char c;
        m7364();
        int i2 = this.f9721;
        while (true) {
            i = this.f9721;
            if (i >= this.f9718 || (((c = this.f9719[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f9721 = i + 1;
        }
        return m7362(this.f9719, this.f9725, i2, i - i2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m7376() {
        int i;
        char c;
        m7364();
        int i2 = this.f9721;
        while (true) {
            i = this.f9721;
            if (i >= this.f9718 || (c = this.f9719[i]) < '0' || c > '9') {
                break;
            }
            this.f9721 = i + 1;
        }
        return m7362(this.f9719, this.f9725, i2, i - i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m7390(char c) {
        return !m7394() && this.f9719[this.f9721] == c;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m7383(String str) {
        m7364();
        int length = str.length();
        if (length <= this.f9718 - this.f9721) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.f9719[this.f9721 + i])) {
                }
            }
            this.f9721 = str.length() + this.f9721;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m7384(char... cArr) {
        if (!m7394()) {
            m7364();
            char c = this.f9719[this.f9721];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m7368(char[] cArr) {
        m7364();
        return !m7394() && Arrays.binarySearch(cArr, this.f9719[this.f9721]) >= 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m7380() {
        if (m7394()) {
            return false;
        }
        char c = this.f9719[this.f9721];
        if (c < 'A' || c > 'Z') {
            return (c >= 'a' && c <= 'z') || Character.isLetter(c);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m7379() {
        if (m7394()) {
            return false;
        }
        char c = this.f9719[this.f9721];
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m7396() {
        char c;
        return !m7394() && (c = this.f9719[this.f9721]) >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m7391(String str) {
        m7364();
        m7364();
        int length = str.length();
        if (length <= this.f9718 - this.f9721) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.f9719[this.f9721 + i]) {
                }
            }
            this.f9721 = str.length() + this.f9721;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m7375(String str) {
        if (str.equals(this.f9715)) {
            int i = this.f9726;
            if (i == -1) {
                return false;
            }
            if (i >= this.f9721) {
                return true;
            }
        }
        this.f9715 = str;
        Locale locale = Locale.ENGLISH;
        int iM7366 = m7366(str.toLowerCase(locale));
        if (iM7366 > -1) {
            this.f9726 = this.f9721 + iM7366;
            return true;
        }
        int iM7367 = m7366(str.toUpperCase(locale));
        boolean z = iM7367 > -1;
        this.f9726 = z ? this.f9721 + iM7367 : -1;
        return z;
    }

    public final String toString() {
        int i = this.f9718;
        int i2 = this.f9721;
        return i - i2 < 0 ? "" : new String(this.f9719, i2, i - i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m7362(char[] cArr, String[] strArr, int i, int i2) {
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
