package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֨֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0805 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f2856;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14228 f2857;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f2858;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f2855 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f2854 = 0;

    public C0805(ArrayList arrayList) {
        this.f2857 = C14228.m34536("", (C5280) null);
        this.f2858 = 0;
        this.f2856 = arrayList;
        if (arrayList.isEmpty()) {
            return;
        }
        m3227(0, 0);
        C14228 c14228 = (C14228) arrayList.get(0);
        this.f2857 = c14228;
        this.f2858 = c14228.m34537().length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0805 m3226(C20942 c20942) {
        return new C0805(c20942.m47876());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final char m3234() {
        if (this.f2854 < this.f2858) {
            return this.f2857.m34537().charAt(this.f2854);
        }
        return this.f2855 < this.f2856.size() + (-1) ? '\n' : (char) 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m3241() {
        if (this.f2854 >= this.f2858) {
            return this.f2855 < this.f2856.size() + (-1) ? 10 : 0;
        }
        char cCharAt = this.f2857.m34537().charAt(this.f2854);
        if (!Character.isHighSurrogate(cCharAt) || this.f2854 + 1 >= this.f2858) {
            return cCharAt;
        }
        char cCharAt2 = this.f2857.m34537().charAt(this.f2854 + 1);
        return Character.isLowSurrogate(cCharAt2) ? Character.toCodePoint(cCharAt, cCharAt2) : cCharAt;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m3238() {
        int i = this.f2854;
        if (i <= 0) {
            return this.f2855 > 0 ? 10 : 0;
        }
        int i2 = i - 1;
        char cCharAt = this.f2857.m34537().charAt(i2);
        if (Character.isLowSurrogate(cCharAt) && i2 > 0) {
            char cCharAt2 = this.f2857.m34537().charAt(i - 2);
            if (Character.isHighSurrogate(cCharAt2)) {
                return Character.toCodePoint(cCharAt2, cCharAt);
            }
        }
        return cCharAt;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3232() {
        return this.f2854 < this.f2858 || this.f2855 < this.f2856.size() - 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3240() {
        C14228 c14228M34536;
        int i = this.f2854 + 1;
        this.f2854 = i;
        if (i > this.f2858) {
            int i2 = this.f2855 + 1;
            this.f2855 = i2;
            List list = this.f2856;
            if (i2 < list.size()) {
                c14228M34536 = (C14228) list.get(this.f2855);
            } else {
                c14228M34536 = C14228.m34536("", (C5280) null);
            }
            this.f2857 = c14228M34536;
            this.f2858 = c14228M34536.m34537().length();
            this.f2854 = 0;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m3235(char c) {
        if (m3234() != c) {
            return false;
        }
        m3240();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3233(String str) {
        int i = this.f2854;
        if (i < this.f2858 && str.length() + i <= this.f2858) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (this.f2857.m34537().charAt(this.f2854 + i2) == str.charAt(i2)) {
                }
            }
            this.f2854 = str.length() + this.f2854;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m3239(char c) {
        int i = 0;
        while (m3234() == c) {
            i++;
            m3240();
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3229(InterfaceC6245 interfaceC6245) {
        int i = 0;
        while (((C12210) interfaceC6245).m30485(m3234())) {
            i++;
            m3240();
        }
        return i;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m3236() {
        int i = 0;
        while (true) {
            char cM3234 = m3234();
            if (cM3234 != ' ') {
                switch (cM3234) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i;
                }
            }
            i++;
            m3240();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3228(char c) {
        int i = 0;
        while (true) {
            char cM3234 = m3234();
            if (cM3234 == 0) {
                return -1;
            }
            if (cM3234 == c) {
                return i;
            }
            i++;
            m3240();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9753 m3237() {
        return new C9753(this.f2855, this.f2854);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3231(C9753 c9753) {
        int i = c9753.f31467;
        int i2 = c9753.f31466;
        m3227(i, i2);
        int i3 = c9753.f31467;
        this.f2855 = i3;
        this.f2854 = i2;
        C14228 c14228 = (C14228) this.f2856.get(i3);
        this.f2857 = c14228;
        this.f2858 = c14228.m34537().length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20942 m3230(C9753 c9753, C9753 c9754) {
        int i = c9753.f31467;
        int i2 = c9753.f31466;
        int i3 = c9754.f31467;
        int i4 = c9754.f31466;
        List list = this.f2856;
        if (i != i3) {
            C20942 c20942 = new C20942();
            C14228 c14228 = (C14228) list.get(i);
            c20942.m47874(c14228.m34538(i2, c14228.m34537().length()));
            while (true) {
                i++;
                if (i < i3) {
                    c20942.m47874((C14228) list.get(i));
                } else {
                    c20942.m47874(((C14228) list.get(i3)).m34538(0, i4));
                    return c20942;
                }
            }
        } else {
            C14228 c14229 = (C14228) list.get(i);
            CharSequence charSequenceSubSequence = c14229.m34537().subSequence(i2, i4);
            C5280 c5280M34539 = c14229.m34539();
            C14228 c14228M34536 = C14228.m34536(charSequenceSubSequence, c5280M34539 != null ? c5280M34539.m15869(i2, i4) : null);
            C20942 c20943 = new C20942();
            c20943.m47874(c14228M34536);
            return c20943;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3227(int i, int i2) {
        List list = this.f2856;
        if (i < 0 || i >= list.size()) {
            StringBuilder sbM12235 = C3769.m12235(i, "Line index ", " out of range, number of lines: ");
            sbM12235.append(list.size());
            throw new IllegalArgumentException(sbM12235.toString());
        }
        C14228 c14228 = (C14228) list.get(i);
        if (i2 < 0 || i2 > c14228.m34537().length()) {
            StringBuilder sbM12236 = C3769.m12235(i2, "Index ", " out of range, line length: ");
            sbM12236.append(c14228.m34537().length());
            throw new IllegalArgumentException(sbM12236.toString());
        }
    }
}
