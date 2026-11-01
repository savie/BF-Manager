package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.֡ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes2.dex */
public class C0354 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C3114 f1781;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f1782;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f1783;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f1784;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f1785;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m2040(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public C0354(String str) {
        this.f1783 = 0;
        this.f1785 = 0;
        this.f1781 = new C3114();
        String strTrim = str.trim();
        this.f1782 = strTrim;
        this.f1785 = strTrim.length();
        this.f1784 = 0;
    }

    public C0354(String str, int i) {
        this.f1785 = 0;
        this.f1781 = new C3114();
        this.f1782 = str;
        this.f1783 = i;
        this.f1785 = str.length();
        while (true) {
            int i2 = this.f1783;
            if (i2 >= this.f1785 || str.charAt(i2) > ' ') {
                break;
            } else {
                this.f1783++;
            }
        }
        while (true) {
            int i3 = this.f1785;
            if (i3 <= this.f1783 || str.charAt(i3 - 1) > ' ') {
                break;
            } else {
                this.f1785--;
            }
        }
        this.f1784 = this.f1783;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m2054() {
        return this.f1783 == this.f1785;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m2051() {
        while (true) {
            int i = this.f1783;
            if (i >= this.f1785 || !m2040((int) this.f1782.charAt(i))) {
                return;
            } else {
                this.f1783++;
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m2043() {
        m2051();
        int i = this.f1783;
        if (i == this.f1785 || this.f1782.charAt(i) != ',') {
            return false;
        }
        this.f1783++;
        m2051();
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m2042() {
        int i = this.f1783;
        int i2 = this.f1785;
        int i3 = this.f1784;
        C3114 c3114 = this.f1781;
        float fM9343 = c3114.m9343(i, i2, i3, this.f1782);
        if (!Float.isNaN(fM9343)) {
            this.f1783 = c3114.m9344();
        }
        return fM9343;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m2044(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        m2043();
        return m2042();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Integer m2052() {
        int i = this.f1783;
        if (i == this.f1785) {
            return null;
        }
        this.f1783 = i + 1;
        return Integer.valueOf(this.f1782.charAt(i));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C10502 m2050() {
        float fM2042 = m2042();
        if (Float.isNaN(fM2042)) {
            return null;
        }
        EnumC3135 enumC3135M2053 = m2053();
        if (enumC3135M2053 == null) {
            return new C10502(fM2042, EnumC3135.px);
        }
        return new C10502(fM2042, enumC3135M2053);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Boolean m2046(Object obj) {
        if (obj == null) {
            return null;
        }
        m2043();
        int i = this.f1783;
        if (i == this.f1785) {
            return null;
        }
        char cCharAt = this.f1782.charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.f1783++;
        return Boolean.valueOf(cCharAt == '1');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2048(char c) {
        int i = this.f1783;
        boolean z = i < this.f1785 && this.f1782.charAt(i) == c;
        if (z) {
            this.f1783++;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2049(String str) {
        int length = str.length();
        int i = this.f1783;
        boolean z = i <= this.f1785 - length && this.f1782.substring(i, i + length).equals(str);
        if (z) {
            this.f1783 += length;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m2045() {
        int i = this.f1783;
        int i2 = this.f1785;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.f1783 = i3;
        if (i3 < i2) {
            return this.f1782.charAt(i3);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m2041() {
        return m2047(false, ' ');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m2047(boolean z, char c) {
        if (m2054()) {
            return null;
        }
        int i = this.f1783;
        String str = this.f1782;
        char cCharAt = str.charAt(i);
        if ((!z && m2040((int) cCharAt)) || cCharAt == c) {
            return null;
        }
        int i2 = this.f1783;
        int iM2045 = m2045();
        while (iM2045 != -1 && iM2045 != c && (z || !m2040(iM2045))) {
            iM2045 = m2045();
        }
        return str.substring(i2, this.f1783);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC3135 m2053() {
        if (m2054()) {
            return null;
        }
        int i = this.f1783;
        String str = this.f1782;
        if (str.charAt(i) == '%') {
            this.f1783++;
            return EnumC3135.percent;
        }
        int i2 = this.f1783;
        if (i2 > this.f1785 - 2) {
            return null;
        }
        try {
            EnumC3135 enumC3135ValueOf = EnumC3135.valueOf(str.substring(i2, i2 + 2).toLowerCase(Locale.US));
            this.f1783 += 2;
            return enumC3135ValueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m2055() {
        if (m2054()) {
            return null;
        }
        int i = this.f1783;
        String str = this.f1782;
        char cCharAt = str.charAt(i);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iM2045 = m2045();
        while (iM2045 != -1 && iM2045 != cCharAt) {
            iM2045 = m2045();
        }
        if (iM2045 == -1) {
            this.f1783 = i;
            return null;
        }
        int i2 = this.f1783;
        this.f1783 = i2 + 1;
        return str.substring(i + 1, i2);
    }
}
