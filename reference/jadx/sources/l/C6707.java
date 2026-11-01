package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes2.dex */
public final class C6707 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f22602;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f22604;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11647 f22606;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f22605 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f22603 = 0;

    public C6707(ArrayList arrayList) {
        this.f22606 = C11647.m29101("", (C0316) null);
        this.f22602 = 0;
        this.f22604 = arrayList;
        if (arrayList.isEmpty()) {
            return;
        }
        m18125(0, 0);
        C11647 c11647 = (C11647) arrayList.get(0);
        this.f22606 = c11647;
        this.f22602 = c11647.m29102().length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6707 m18124(C2473 c2473) {
        return new C6707(c2473.m7586());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final char m18135() {
        if (this.f22603 < this.f22602) {
            return this.f22606.m29102().charAt(this.f22603);
        }
        return this.f22605 < this.f22604.size() + (-1) ? '\n' : (char) 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m18127() {
        if (this.f22603 >= this.f22602) {
            return this.f22605 < this.f22604.size() + (-1) ? 10 : 0;
        }
        char cCharAt = this.f22606.m29102().charAt(this.f22603);
        if (!Character.isHighSurrogate(cCharAt) || this.f22603 + 1 >= this.f22602) {
            return cCharAt;
        }
        char cCharAt2 = this.f22606.m29102().charAt(this.f22603 + 1);
        return Character.isLowSurrogate(cCharAt2) ? Character.toCodePoint(cCharAt, cCharAt2) : cCharAt;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m18134() {
        int i = this.f22603;
        if (i <= 0) {
            return this.f22605 > 0 ? 10 : 0;
        }
        int i2 = i - 1;
        char cCharAt = this.f22606.m29102().charAt(i2);
        if (Character.isLowSurrogate(cCharAt) && i2 > 0) {
            char cCharAt2 = this.f22606.m29102().charAt(i - 2);
            if (Character.isHighSurrogate(cCharAt2)) {
                return Character.toCodePoint(cCharAt2, cCharAt);
            }
        }
        return cCharAt;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18132() {
        return this.f22603 < this.f22602 || this.f22605 < this.f22604.size() - 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18138() {
        C11647 c11647M29101;
        int i = this.f22603 + 1;
        this.f22603 = i;
        if (i > this.f22602) {
            int i2 = this.f22605 + 1;
            this.f22605 = i2;
            List list = this.f22604;
            if (i2 < list.size()) {
                c11647M29101 = (C11647) list.get(this.f22605);
            } else {
                c11647M29101 = C11647.m29101("", (C0316) null);
            }
            this.f22606 = c11647M29101;
            this.f22602 = c11647M29101.m29102().length();
            this.f22603 = 0;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m18136(char c) {
        if (m18135() != c) {
            return false;
        }
        m18138();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18133(String str) {
        int i = this.f22603;
        if (i < this.f22602 && str.length() + i <= this.f22602) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (this.f22606.m29102().charAt(this.f22603 + i2) == str.charAt(i2)) {
                }
            }
            this.f22603 = str.length() + this.f22603;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m18137(char c) {
        int i = 0;
        while (m18135() == c) {
            i++;
            m18138();
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m18129(InterfaceC3179 interfaceC3179) {
        int i = 0;
        while (((C9531) interfaceC3179).m24377(m18135())) {
            i++;
            m18138();
        }
        return i;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m18126() {
        int i = 0;
        while (true) {
            char cM18135 = m18135();
            if (cM18135 != ' ') {
                switch (cM18135) {
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
            m18138();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m18128(char c) {
        int i = 0;
        while (true) {
            char cM18135 = m18135();
            if (cM18135 == 0) {
                return -1;
            }
            if (cM18135 == c) {
                return i;
            }
            i++;
            m18138();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3884 m18139() {
        return new C3884(this.f22605, this.f22603);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18131(C3884 c3884) {
        int i = c3884.f14514;
        int i2 = c3884.f14513;
        m18125(i, i2);
        int i3 = c3884.f14514;
        this.f22605 = i3;
        this.f22603 = i2;
        C11647 c11647 = (C11647) this.f22604.get(i3);
        this.f22606 = c11647;
        this.f22602 = c11647.m29102().length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2473 m18130(C3884 c3884, C3884 c3885) {
        int i = c3884.f14514;
        int i2 = c3884.f14513;
        int i3 = c3885.f14514;
        int i4 = c3885.f14513;
        List list = this.f22604;
        if (i != i3) {
            C2473 c2473 = new C2473();
            C11647 c11647 = (C11647) list.get(i);
            c2473.m7584(c11647.m29103(i2, c11647.m29102().length()));
            while (true) {
                i++;
                if (i < i3) {
                    c2473.m7584((C11647) list.get(i));
                } else {
                    c2473.m7584(((C11647) list.get(i3)).m29103(0, i4));
                    return c2473;
                }
            }
        } else {
            C11647 c11648 = (C11647) list.get(i);
            CharSequence charSequenceSubSequence = c11648.m29102().subSequence(i2, i4);
            C0316 c0316M29104 = c11648.m29104();
            C11647 c11647M29101 = C11647.m29101(charSequenceSubSequence, c0316M29104 != null ? c0316M29104.m1951(i2, i4) : null);
            C2473 c2474 = new C2473();
            c2474.m7584(c11647M29101);
            return c2474;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18125(int i, int i2) {
        List list = this.f22604;
        if (i < 0 || i >= list.size()) {
            StringBuilder sbM40153 = C17214.m40153(i, "Line index ", " out of range, number of lines: ");
            sbM40153.append(list.size());
            throw new IllegalArgumentException(sbM40153.toString());
        }
        C11647 c11647 = (C11647) list.get(i);
        if (i2 < 0 || i2 > c11647.m29102().length()) {
            StringBuilder sbM40154 = C17214.m40153(i2, "Index ", " out of range, line length: ");
            sbM40154.append(c11647.m29102().length());
            throw new IllegalArgumentException(sbM40154.toString());
        }
    }
}
