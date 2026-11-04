package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۡۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes3.dex */
public class C9208 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f30022;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f30023;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f30024;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f30025;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C22504 f30026;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24364(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public C9208(String str) {
        this.f30024 = 0;
        this.f30025 = 0;
        this.f30026 = new C22504();
        String strTrim = str.trim();
        this.f30022 = strTrim;
        this.f30025 = strTrim.length();
        this.f30023 = 0;
    }

    public C9208(String str, int i) {
        this.f30025 = 0;
        this.f30026 = new C22504();
        this.f30022 = str;
        this.f30024 = i;
        this.f30025 = str.length();
        while (true) {
            int i2 = this.f30024;
            if (i2 >= this.f30025 || str.charAt(i2) > ' ') {
                break;
            } else {
                this.f30024++;
            }
        }
        while (true) {
            int i3 = this.f30025;
            if (i3 <= this.f30024 || str.charAt(i3 - 1) > ' ') {
                break;
            } else {
                this.f30025--;
            }
        }
        this.f30023 = this.f30024;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m24378() {
        return this.f30024 == this.f30025;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24374() {
        while (true) {
            int i = this.f30024;
            if (i >= this.f30025 || !m24364((int) this.f30022.charAt(i))) {
                return;
            } else {
                this.f30024++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24365() {
        m24374();
        int i = this.f30024;
        if (i == this.f30025 || this.f30022.charAt(i) != ',') {
            return false;
        }
        this.f30024++;
        m24374();
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float m24379() {
        int i = this.f30024;
        int i2 = this.f30025;
        int i3 = this.f30023;
        C22504 c22504 = this.f30026;
        float fM50743 = c22504.m50743(i, i2, i3, this.f30022);
        if (!Float.isNaN(fM50743)) {
            this.f30024 = c22504.m50744();
        }
        return fM50743;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m24366(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        m24365();
        return m24379();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Integer m24373() {
        int i = this.f30024;
        if (i == this.f30025) {
            return null;
        }
        this.f30024 = i + 1;
        return Integer.valueOf(this.f30022.charAt(i));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C18028 m24377() {
        float fM24379 = m24379();
        if (Float.isNaN(fM24379)) {
            return null;
        }
        EnumC15175 enumC15175M24372 = m24372();
        if (enumC15175M24372 == null) {
            return new C18028(fM24379, EnumC15175.px);
        }
        return new C18028(fM24379, enumC15175M24372);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Boolean m24368(Object obj) {
        if (obj == null) {
            return null;
        }
        m24365();
        int i = this.f30024;
        if (i == this.f30025) {
            return null;
        }
        char cCharAt = this.f30022.charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.f30024++;
        return Boolean.valueOf(cCharAt == '1');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24370(char c) {
        int i = this.f30024;
        boolean z = i < this.f30025 && this.f30022.charAt(i) == c;
        if (z) {
            this.f30024++;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24371(String str) {
        int length = str.length();
        int i = this.f30024;
        boolean z = i <= this.f30025 - length && this.f30022.substring(i, i + length).equals(str);
        if (z) {
            this.f30024 += length;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24367() {
        int i = this.f30024;
        int i2 = this.f30025;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.f30024 = i3;
        if (i3 < i2) {
            return this.f30022.charAt(i3);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m24375() {
        return m24369(false, ' ');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24369(boolean z, char c) {
        if (m24378()) {
            return null;
        }
        int i = this.f30024;
        String str = this.f30022;
        char cCharAt = str.charAt(i);
        if ((!z && m24364((int) cCharAt)) || cCharAt == c) {
            return null;
        }
        int i2 = this.f30024;
        int iM24367 = m24367();
        while (iM24367 != -1 && iM24367 != c && (z || !m24364(iM24367))) {
            iM24367 = m24367();
        }
        return str.substring(i2, this.f30024);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC15175 m24372() {
        if (m24378()) {
            return null;
        }
        int i = this.f30024;
        String str = this.f30022;
        if (str.charAt(i) == '%') {
            this.f30024++;
            return EnumC15175.percent;
        }
        int i2 = this.f30024;
        if (i2 > this.f30025 - 2) {
            return null;
        }
        try {
            EnumC15175 enumC15175ValueOf = EnumC15175.valueOf(str.substring(i2, i2 + 2).toLowerCase(Locale.US));
            this.f30024 += 2;
            return enumC15175ValueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m24376() {
        if (m24378()) {
            return null;
        }
        int i = this.f30024;
        String str = this.f30022;
        char cCharAt = str.charAt(i);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iM24367 = m24367();
        while (iM24367 != -1 && iM24367 != cCharAt) {
            iM24367 = m24367();
        }
        if (iM24367 == -1) {
            this.f30024 = i;
            return null;
        }
        int i2 = this.f30024;
        this.f30024 = i2 + 1;
        return str.substring(i + 1, i2);
    }
}
