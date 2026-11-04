package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7QN */
/* JADX INFO: loaded from: classes3.dex */
public class C10603 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] f33654;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7312 f33659;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f33661;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f33658 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f33653 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public char f33660 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f33656 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f33657 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f33655 = false;

    public C10603(C21637 c21637, char[] cArr, int i) {
        this.f33654 = cArr;
        this.f33661 = i;
        this.f33659 = c21637.f69085;
        m27052();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m27063() {
        return this.f33661;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m27065() {
        return this.f33658 < this.f33661;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m27051() {
        EnumC21792 enumC21792;
        int i = this.f33658 + this.f33653;
        this.f33658 = i;
        boolean z = false;
        this.f33653 = 0;
        char[] cArr = this.f33654;
        int i2 = this.f33661;
        if (i2 <= i) {
            this.f33660 = (char) 26;
        } else {
            this.f33660 = cArr[i];
            this.f33653 = 1;
        }
        if (this.f33660 != '\\' || (this.f33657 && !this.f33655)) {
            this.f33657 = false;
            this.f33655 = false;
        } else {
            int i3 = i + this.f33653;
            this.f33660 = '\\';
            this.f33653 = 1;
            int i4 = i3;
            while (i4 < i2 && cArr[i4] == 'u') {
                i4++;
            }
            if (i4 == i3) {
                enumC21792 = EnumC21792.BACKSLASH;
            } else {
                int iDigit = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    iDigit = (iDigit << 4) | (i4 < i2 ? Character.digit(cArr[i4], 16) : -1);
                    if (iDigit < 0) {
                        break;
                    }
                    i4++;
                }
                this.f33653 = i4 - this.f33658;
                if (iDigit >= 0) {
                    this.f33660 = (char) iDigit;
                    enumC21792 = EnumC21792.VALID_ESCAPE;
                } else {
                    this.f33659.m34517(i4, C22843.f74171);
                    enumC21792 = EnumC21792.BROKEN_ESCAPE;
                }
            }
            int iOrdinal = enumC21792.ordinal();
            if (iOrdinal == 0) {
                this.f33655 = false;
                this.f33657 = !this.f33657;
            } else if (iOrdinal == 1) {
                this.f33655 = true;
                if (this.f33660 == '\\' && !this.f33657) {
                    z = true;
                }
                this.f33657 = z;
            } else if (iOrdinal == 2) {
                m27051();
            }
        }
        this.f33656 = this.f33660;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m27052() {
        m27051();
        if (m27069() || !Character.isHighSurrogate(this.f33660)) {
            return;
        }
        char c = this.f33660;
        int i = this.f33658;
        int i2 = this.f33653;
        m27051();
        char c2 = this.f33660;
        if (Character.isLowSurrogate(c2)) {
            this.f33658 = i;
            this.f33653 += i2;
            this.f33656 = Character.toCodePoint(c, c2);
        } else {
            this.f33658 = i;
            this.f33653 = i2;
            this.f33660 = c;
            this.f33656 = c;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27053() {
        return this.f33658;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27067(int i) {
        this.f33658 = i;
        this.f33653 = 0;
        this.f33657 = false;
        this.f33655 = false;
        m27052();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m27054() {
        return this.f33660;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m27066() {
        return this.f33656;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m27064() {
        return 65535 < this.f33656;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m27069() {
        return this.f33660 <= 127;
    }

    /* JADX INFO: renamed from: ۚ */
    public char mo14465() {
        m27052();
        return this.f33660;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m27060(char c) {
        return this.f33660 == c;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27057(char c, char c2) {
        return m27060(c) || m27060(c2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27062() {
        while (true) {
            if (!m27060(' ') && !m27060('\t') && !m27060('\f')) {
                return;
            } else {
                mo14465();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m27068(char c) {
        char c2 = this.f33660;
        return '0' <= c2 && c2 <= c;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27056(char c) {
        if (!m27060(c)) {
            return false;
        }
        mo14465();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27058(String str) {
        if (str.length() == 0 || !m27060(str.charAt(0))) {
            return false;
        }
        int i = this.f33658;
        m27052();
        for (int i2 = 1; i2 < str.length(); i2++) {
            if (!m27060(str.charAt(i2))) {
                m27067(i);
                return false;
            }
            m27052();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27055(int i) {
        if (m27068('9')) {
            int i2 = this.f33660 - '0';
            if (i2 < i) {
                return i2;
            }
            return -1;
        }
        int iDigit = m27064() ? Character.digit(this.f33656, i) : Character.digit(this.f33660, i);
        if (iDigit >= 0 && !m27069()) {
            this.f33659.m34517(this.f33658, C22843.f74043);
            this.f33660 = "0123456789abcdef".charAt(iDigit);
        }
        return iDigit;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final char[] m27061() {
        char[] cArr = this.f33654;
        int length = cArr.length;
        int i = this.f33661;
        return i == length ? cArr : Arrays.copyOf(cArr, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] m27059(int i, int i2) {
        return Arrays.copyOfRange(this.f33654, i, i2);
    }
}
