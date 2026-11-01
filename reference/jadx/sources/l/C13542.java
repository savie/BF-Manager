package l;

/* JADX INFO: renamed from: l.ܰۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13542 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3144 f44699;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f44700;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m33126() {
        C3144 c3144 = this.f44699;
        if (c3144 == null) {
            return 0;
        }
        return c3144.f11868;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33119() {
        this.f44699 = null;
        this.f44700++;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33129(int i, C14435 c14435) {
        m33104(i);
        C3144 c3144 = this.f44699;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C3144 c3145 = c3144.f11858;
            int i4 = c3145 == null ? 0 : c3145.f11868;
            if (i >= i4 && i < c3144.f11872 + i4) {
                c3144.m9538(i - i4, c14435);
                c14435.f47316 += i2;
                c14435.f47317 += i2;
                c14435.f47319 += i3;
                return;
            }
            i2 += c3144.f11862;
            i3 += c3144.f11874;
            if (i < i4) {
                c3144 = c3145;
            } else {
                i -= i4 + c3144.f11872;
                c3144 = c3144.f11870;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m33127(int i, int i2) {
        int i3;
        int iM9536;
        m33104(i);
        C3144 c3144 = this.f44699;
        int i4 = 0;
        while (true) {
            C3144 c3145 = c3144.f11858;
            i3 = c3145 == null ? 0 : c3145.f11868;
            if (i >= i3 && i < c3144.f11872 + i3) {
                break;
            }
            i4 += i2 == 2 ? c3144.f11874 : c3144.f11862;
            if (i < i3) {
                c3144 = c3145;
            } else {
                i -= i3 + c3144.f11872;
                c3144 = c3144.f11870;
            }
        }
        int i5 = i - i3;
        if (i2 == 2) {
            iM9536 = c3144.m9536(i5) + c3144.f11860;
        } else {
            int iM9528 = c3144.m9528(i5) + c3144.f11861;
            if (i2 == 0) {
                iM9536 = iM9528;
            } else {
                char[] cArr = c3144.f11867;
                iM9536 = (cArr != null ? cArr[i5] : c3144.f11865[i5]) + iM9528;
            }
        }
        return iM9536 + i4;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m33125(int i, C14435 c14435) {
        m33104(i);
        C3144 c3144 = this.f44699;
        m33117(c3144, i, c14435);
        this.f44699 = c3144;
        this.f44700++;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33117(C3144 c3144, int i, C14435 c14435) {
        m33111(c3144);
        C3144 c3145 = c3144.f11858;
        int i2 = c3145 == null ? 0 : c3145.f11868;
        if (i < i2) {
            m33117(c3145, i, c14435);
            return;
        }
        int i3 = c3144.f11872;
        if (i >= i2 + i3) {
            m33117(c3144.f11870, (i - i2) - i3, c14435);
        } else {
            c3144.m9537(i - i2, c14435);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33123(int i, C14435 c14435) {
        if (i < 0 || i > m33126()) {
            throw new IndexOutOfBoundsException();
        }
        this.f44699 = m33100(this.f44699, i, c14435);
        this.f44700++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3144 m33100(C3144 c3144, int i, C14435 c14435) {
        if (c3144 == null) {
            C3144 c3145 = new C3144(8);
            c3145.m9535(c14435);
            return c3145;
        }
        m33111(c3144);
        C3144 c3146 = c3144.f11858;
        int i2 = c3146 == null ? 0 : c3146.f11868;
        if (i < i2) {
            c3144.f11858 = m33100(c3146, i, c14435);
        } else {
            int i3 = c3144.f11872;
            if (i > i2 + i3) {
                c3144.f11870 = m33100(c3144.f11870, (i - i2) - i3, c14435);
            } else if (i3 < 1024) {
                c3144.m9533(i - i2, c14435);
            } else if (i == i3 + i2) {
                c3144.f11870 = m33100(c3144.f11870, 0, c14435);
            } else {
                C3144 c3144M9530 = c3144.m9530(512, 1024);
                C3144 c3147 = c3144.f11870;
                c3144.f11872 = 512;
                c3144.m9526();
                int i4 = i - i2;
                int i5 = c3144.f11872;
                if (i4 <= i5) {
                    c3144.m9533(i4, c14435);
                } else {
                    c3144M9530 = m33100(c3144M9530, i4 - i5, c14435);
                }
                c3144.f11870 = null;
                m33098(c3144);
                return m33102(c3144.f11858, c3144, m33097(c3144M9530, c3147));
            }
        }
        return m33099(c3144);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33128(int i, int i2, C13542 c13542) {
        if (i < 0 || i2 < i || i2 > m33126()) {
            throw new IndexOutOfBoundsException();
        }
        C3144 c3144M33113 = m33113(c13542.f44699);
        C4368 c4368M33103 = m33103(this.f44699, i);
        this.f44699 = m33110(m33110(c4368M33103.f15611, c3144M33113), m33103(c4368M33103.f15612, i2 - i).f15612);
        this.f44700++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33122(int i, int i2, C13542 c13542) {
        if (i < 0 || i2 < i || i2 > c13542.m33126()) {
            throw new IndexOutOfBoundsException();
        }
        this.f44699 = m33110(this.f44699, m33114(c13542.f44699, i, i2));
        this.f44700++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33124(C13542 c13542) {
        if (c13542 == this) {
            throw new IllegalArgumentException("Cannot transfer a line table to itself");
        }
        C3144 c3144 = c13542.f44699;
        if (c3144 == null) {
            return false;
        }
        c13542.m33119();
        this.f44699 = m33110(this.f44699, c3144);
        this.f44700++;
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C3144 m33114(C3144 c3144, int i, int i2) {
        if (i == i2) {
            return null;
        }
        if (i == 0 && i2 == c3144.f11868) {
            return m33113(c3144);
        }
        C3144 c3145 = c3144.f11858;
        int i3 = c3145 == null ? 0 : c3145.f11868;
        int i4 = c3144.f11872 + i3;
        C3144 c3144M33114 = i < i3 ? m33114(c3145, i, Math.min(i3, i2)) : null;
        C3144 c3144M33115 = i2 > i4 ? m33114(c3144.f11870, Math.max(0, i - i4), i2 - i4) : null;
        m33112(c3144M33114, c3144.f11862, c3144.f11874);
        m33112(c3144M33115, c3144.f11862, c3144.f11874);
        int iMax = Math.max(0, i - i3);
        int iMin = Math.min(c3144.f11872, i2 - i3);
        return iMax < iMin ? m33102(c3144M33114, c3144.m9530(iMax, iMin), c3144M33115) : m33097(c3144M33114, c3144M33115);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33121(int i, int i2, int i3, int i4) {
        if (i < 0 || i2 < i || i2 > m33126()) {
            throw new IndexOutOfBoundsException();
        }
        if (i != i2) {
            if (i3 == 0 && i4 == 0) {
                return;
            }
            m33106(this.f44699, i, i2, i3, i4);
            this.f44700++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33106(C3144 c3144, int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == c3144.f11868) {
            m33112(c3144, i3, i4);
            return;
        }
        m33111(c3144);
        C3144 c3145 = c3144.f11858;
        int i5 = c3145 == null ? 0 : c3145.f11868;
        int i6 = c3144.f11872 + i5;
        if (i < i5) {
            m33106(c3145, i, Math.min(i2, i5), i3, i4);
        }
        c3144.m9532(Math.max(0, i - i5), Math.min(c3144.f11872, i2 - i5), i3, i4);
        if (i2 > i6) {
            m33106(c3144.f11870, Math.max(0, i - i6), i2 - i6, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m33104(int i) {
        if (i < 0 || i >= m33126()) {
            throw new IndexOutOfBoundsException(C8479.m22141(i, "Line index: "));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33120(int i, int i2) {
        if (i < 0 || i2 < i || i2 > m33126()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == i2) {
            return;
        }
        m33105(this.f44699, i, i2);
        this.f44700++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33105(C3144 c3144, int i, int i2) {
        C3144 c3145 = c3144.f11858;
        int i3 = c3145 == null ? 0 : c3145.f11868;
        int i4 = c3144.f11872 + i3;
        if (i < i3) {
            m33105(c3145, i, Math.min(i2, i3));
        }
        if (i < i4 && i2 > i3) {
            c3144.m9526();
        }
        if (i2 > i4) {
            m33105(c3144.f11870, Math.max(0, i - i4), i2 - i4);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C3144 m33113(C3144 c3144) {
        if (c3144 == null) {
            return null;
        }
        C3144 c3144M9530 = c3144.m9530(0, c3144.f11872);
        c3144M9530.f11858 = m33113(c3144.f11858);
        c3144M9530.f11870 = m33113(c3144.f11870);
        c3144M9530.f11862 = c3144.f11862;
        c3144M9530.f11874 = c3144.f11874;
        m33098(c3144M9530);
        return c3144M9530;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4368 m33103(C3144 c3144, int i) {
        if (c3144 == null) {
            return new C4368(null, null);
        }
        m33111(c3144);
        C3144 c3144M33102 = c3144.f11858;
        int i2 = c3144M33102 == null ? 0 : c3144M33102.f11868;
        if (i < i2) {
            C4368 c4368M33103 = m33103(c3144M33102, i);
            return new C4368(c4368M33103.f15611, m33102(c4368M33103.f15612, c3144, c3144.f11870));
        }
        int i3 = c3144.f11872;
        if (i > i2 + i3) {
            C4368 c4368M33104 = m33103(c3144.f11870, (i - i2) - i3);
            return new C4368(m33102(c3144.f11858, c3144, c4368M33104.f15611), c4368M33104.f15612);
        }
        int i4 = i - i2;
        if (i4 != 0) {
            c3144M33102 = m33102(c3144M33102, c3144.m9530(0, i4), (C3144) null);
        }
        int i5 = c3144.f11872;
        return new C4368(c3144M33102, i4 == i5 ? c3144.f11870 : m33102((C3144) null, c3144.m9530(i4, i5), c3144.f11870));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C3144 m33110(C3144 c3144, C3144 c3145) {
        if (c3144 == null) {
            return c3145;
        }
        if (c3145 == null) {
            return c3144;
        }
        C3144 c3146 = c3144;
        while (true) {
            C3144 c3147 = c3146.f11870;
            if (c3147 == null) {
                break;
            }
            c3146 = c3147;
        }
        C3144 c3148 = c3145;
        while (true) {
            C3144 c3149 = c3148.f11858;
            if (c3149 == null) {
                break;
            }
            c3148 = c3149;
        }
        int i = c3146.f11872;
        int i2 = c3148.f11872;
        int i3 = i + i2;
        if (i3 > 1024 && i >= 512 && i2 >= 512) {
            return m33097(c3144, c3145);
        }
        C4368 c4368M33103 = m33103(c3144, c3144.f11868 - i);
        C4368 c4368M33104 = m33103(c3145, c3148.f11872);
        C3144 c31410 = c4368M33103.f15612;
        C3144 c31411 = c4368M33104.f15611;
        m33111(c31410);
        m33111(c31411);
        C3144 c31412 = i3 > 1024 ? new C3144((i3 + 1) / 2) : null;
        int i4 = c31412 == null ? i3 : i3 / 2;
        C3144 c31413 = new C3144(i4);
        C14435 c14435 = new C14435();
        int i5 = 0;
        while (i5 < i3) {
            int i6 = c31410.f11872;
            (i5 < i6 ? c31410 : c31411).m9538(i5 < i6 ? i5 : i5 - i6, c14435);
            (i5 < i4 ? c31413 : c31412).m9535(c14435);
            i5++;
        }
        return m33097(m33097(c4368M33103.f15611, c31413), m33097(c31412, c4368M33104.f15612));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C3144 m33097(C3144 c3144, C3144 c3145) {
        if (c3144 == null) {
            return c3145;
        }
        if (c3145 == null) {
            return c3144;
        }
        m33111(c3144);
        C3144 c3146 = c3144.f11870;
        if (c3146 == null) {
            return m33102(c3144.f11858, c3144, c3145);
        }
        C3144 c3144M33097 = m33097(c3146, c3145);
        c3144.f11870 = c3144M33097;
        return m33102(c3144.f11858, c3144, c3144M33097);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3144 m33099(C3144 c3144) {
        m33098(c3144);
        C3144 c3145 = c3144.f11858;
        int i = c3145 == null ? 0 : c3145.f11859;
        C3144 c3146 = c3144.f11870;
        if (i > (c3146 == null ? 0 : c3146.f11859) + 1) {
            C3144 c3147 = c3145.f11858;
            int i2 = c3147 == null ? 0 : c3147.f11859;
            C3144 c3148 = c3145.f11870;
            if (i2 < (c3148 != null ? c3148.f11859 : 0)) {
                m33111(c3145);
                C3144 c3149 = c3145.f11870;
                m33111(c3149);
                c3145.f11870 = c3149.f11858;
                c3149.f11858 = c3145;
                m33098(c3145);
                m33098(c3149);
                c3144.f11858 = c3149;
            }
            m33111(c3144);
            C3144 c31410 = c3144.f11858;
            m33111(c31410);
            c3144.f11858 = c31410.f11870;
            c31410.f11870 = c3144;
            m33098(c3144);
            m33098(c31410);
            return c31410;
        }
        if ((c3146 == null ? 0 : c3146.f11859) <= (c3145 == null ? 0 : c3145.f11859) + 1) {
            return c3144;
        }
        C3144 c31411 = c3146.f11870;
        int i3 = c31411 == null ? 0 : c31411.f11859;
        C3144 c31412 = c3146.f11858;
        if (i3 < (c31412 != null ? c31412.f11859 : 0)) {
            m33111(c3146);
            C3144 c31413 = c3146.f11858;
            m33111(c31413);
            c3146.f11858 = c31413.f11870;
            c31413.f11870 = c3146;
            m33098(c3146);
            m33098(c31413);
            c3144.f11870 = c31413;
        }
        m33111(c3144);
        C3144 c31414 = c3144.f11870;
        m33111(c31414);
        c3144.f11870 = c31414.f11858;
        c31414.f11858 = c3144;
        m33098(c3144);
        m33098(c31414);
        return c31414;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3144 m33102(C3144 c3144, C3144 c3145, C3144 c3146) {
        if ((c3144 == null ? 0 : c3144.f11859) > (c3146 == null ? 0 : c3146.f11859) + 1) {
            m33111(c3144);
            c3144.f11870 = m33102(c3144.f11870, c3145, c3146);
            return m33099(c3144);
        }
        if ((c3146 == null ? 0 : c3146.f11859) > (c3144 != null ? c3144.f11859 : 0) + 1) {
            m33111(c3146);
            c3146.f11858 = m33102(c3144, c3145, c3146.f11858);
            return m33099(c3146);
        }
        c3145.f11858 = c3144;
        c3145.f11870 = c3146;
        m33098(c3145);
        return c3145;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m33098(C3144 c3144) {
        C3144 c3145 = c3144.f11858;
        int i = (c3145 == null ? 0 : c3145.f11868) + c3144.f11872;
        C3144 c3146 = c3144.f11870;
        c3144.f11868 = i + (c3146 == null ? 0 : c3146.f11868);
        c3144.f11859 = Math.max(c3145 == null ? 0 : c3145.f11859, c3146 != null ? c3146.f11859 : 0) + 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m33112(C3144 c3144, int i, int i2) {
        if (c3144 == null) {
            return;
        }
        c3144.f11861 += i;
        c3144.f11860 += i2;
        c3144.f11862 += i;
        c3144.f11874 += i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m33111(C3144 c3144) {
        int i = c3144.f11862;
        if (i == 0 && c3144.f11874 == 0) {
            return;
        }
        m33112(c3144.f11858, i, c3144.f11874);
        m33112(c3144.f11870, c3144.f11862, c3144.f11874);
        c3144.f11874 = 0;
        c3144.f11862 = 0;
    }
}
