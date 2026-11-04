package l;

/* JADX INFO: renamed from: l.ᩳۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18842 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0197 f61207;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f61208;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m43734() {
        C0197 c0197 = this.f61207;
        if (c0197 == null) {
            return 0;
        }
        return c0197.f1331;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43727() {
        this.f61207 = null;
        this.f61208++;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43737(int i, C14366 c14366) {
        m43710(i);
        C0197 c0197 = this.f61207;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C0197 c0198 = c0197.f1324;
            int i4 = c0198 == null ? 0 : c0198.f1331;
            if (i >= i4 && i < c0197.f1330 + i4) {
                c0197.m1582(i - i4, c14366);
                c14366.f45295 += i2;
                c14366.f45294 += i2;
                c14366.f45296 += i3;
                return;
            }
            i2 += c0197.f1329;
            i3 += c0197.f1325;
            if (i < i4) {
                c0197 = c0198;
            } else {
                i -= i4 + c0197.f1330;
                c0197 = c0197.f1326;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m43735(int i, int i2) {
        int i3;
        int iM1580;
        m43710(i);
        C0197 c0197 = this.f61207;
        int i4 = 0;
        while (true) {
            C0197 c0198 = c0197.f1324;
            i3 = c0198 == null ? 0 : c0198.f1331;
            if (i >= i3 && i < c0197.f1330 + i3) {
                break;
            }
            i4 += i2 == 2 ? c0197.f1325 : c0197.f1329;
            if (i < i3) {
                c0197 = c0198;
            } else {
                i -= i3 + c0197.f1330;
                c0197 = c0197.f1326;
            }
        }
        int i5 = i - i3;
        if (i2 == 2) {
            iM1580 = c0197.m1580(i5) + c0197.f1317;
        } else {
            int iM1584 = c0197.m1584(i5) + c0197.f1319;
            if (i2 == 0) {
                iM1580 = iM1584;
            } else {
                char[] cArr = c0197.f1320;
                iM1580 = (cArr != null ? cArr[i5] : c0197.f1323[i5]) + iM1584;
            }
        }
        return iM1580 + i4;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m43733(int i, C14366 c14366) {
        m43710(i);
        C0197 c0197 = this.f61207;
        m43723(c0197, i, c14366);
        this.f61207 = c0197;
        this.f61208++;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m43723(C0197 c0197, int i, C14366 c14366) {
        m43717(c0197);
        C0197 c0198 = c0197.f1324;
        int i2 = c0198 == null ? 0 : c0198.f1331;
        if (i < i2) {
            m43723(c0198, i, c14366);
            return;
        }
        int i3 = c0197.f1330;
        if (i >= i2 + i3) {
            m43723(c0197.f1326, (i - i2) - i3, c14366);
        } else {
            c0197.m1581(i - i2, c14366);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43731(int i, C14366 c14366) {
        if (i < 0 || i > m43734()) {
            throw new IndexOutOfBoundsException();
        }
        this.f61207 = m43706(this.f61207, i, c14366);
        this.f61208++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0197 m43706(C0197 c0197, int i, C14366 c14366) {
        if (c0197 == null) {
            C0197 c0198 = new C0197(8);
            c0198.m1579(c14366);
            return c0198;
        }
        m43717(c0197);
        C0197 c0199 = c0197.f1324;
        int i2 = c0199 == null ? 0 : c0199.f1331;
        if (i < i2) {
            c0197.f1324 = m43706(c0199, i, c14366);
        } else {
            int i3 = c0197.f1330;
            if (i > i2 + i3) {
                c0197.f1326 = m43706(c0197.f1326, (i - i2) - i3, c14366);
            } else if (i3 < 1024) {
                c0197.m1577(i - i2, c14366);
            } else if (i == i3 + i2) {
                c0197.f1326 = m43706(c0197.f1326, 0, c14366);
            } else {
                C0197 c0197M1574 = c0197.m1574(512, 1024);
                C0197 c01910 = c0197.f1326;
                c0197.f1330 = 512;
                c0197.m1570();
                int i4 = i - i2;
                int i5 = c0197.f1330;
                if (i4 <= i5) {
                    c0197.m1577(i4, c14366);
                } else {
                    c0197M1574 = m43706(c0197M1574, i4 - i5, c14366);
                }
                c0197.f1326 = null;
                m43726(c0197);
                return m43708(c0197.f1324, c0197, m43725(c0197M1574, c01910));
            }
        }
        return m43705(c0197);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43736(int i, int i2, C18842 c18842) {
        if (i < 0 || i2 < i || i2 > m43734()) {
            throw new IndexOutOfBoundsException();
        }
        C0197 c0197M43719 = m43719(c18842.f61207);
        C7655 c7655M43709 = m43709(this.f61207, i);
        this.f61207 = m43716(m43716(c7655M43709.f25226, c0197M43719), m43709(c7655M43709.f25227, i2 - i).f25227);
        this.f61208++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43730(int i, int i2, C18842 c18842) {
        if (i < 0 || i2 < i || i2 > c18842.m43734()) {
            throw new IndexOutOfBoundsException();
        }
        this.f61207 = m43716(this.f61207, m43720(c18842.f61207, i, i2));
        this.f61208++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43732(C18842 c18842) {
        if (c18842 == this) {
            throw new IllegalArgumentException("Cannot transfer a line table to itself");
        }
        C0197 c0197 = c18842.f61207;
        if (c0197 == null) {
            return false;
        }
        c18842.m43727();
        this.f61207 = m43716(this.f61207, c0197);
        this.f61208++;
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C0197 m43720(C0197 c0197, int i, int i2) {
        if (i == i2) {
            return null;
        }
        if (i == 0 && i2 == c0197.f1331) {
            return m43719(c0197);
        }
        C0197 c0198 = c0197.f1324;
        int i3 = c0198 == null ? 0 : c0198.f1331;
        int i4 = c0197.f1330 + i3;
        C0197 c0197M43720 = i < i3 ? m43720(c0198, i, Math.min(i3, i2)) : null;
        C0197 c0197M43721 = i2 > i4 ? m43720(c0197.f1326, Math.max(0, i - i4), i2 - i4) : null;
        m43718(c0197M43720, c0197.f1329, c0197.f1325);
        m43718(c0197M43721, c0197.f1329, c0197.f1325);
        int iMax = Math.max(0, i - i3);
        int iMin = Math.min(c0197.f1330, i2 - i3);
        return iMax < iMin ? m43708(c0197M43720, c0197.m1574(iMax, iMin), c0197M43721) : m43725(c0197M43720, c0197M43721);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43729(int i, int i2, int i3, int i4) {
        if (i < 0 || i2 < i || i2 > m43734()) {
            throw new IndexOutOfBoundsException();
        }
        if (i != i2) {
            if (i3 == 0 && i4 == 0) {
                return;
            }
            m43712(this.f61207, i, i2, i3, i4);
            this.f61208++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43712(C0197 c0197, int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == c0197.f1331) {
            m43718(c0197, i3, i4);
            return;
        }
        m43717(c0197);
        C0197 c0198 = c0197.f1324;
        int i5 = c0198 == null ? 0 : c0198.f1331;
        int i6 = c0197.f1330 + i5;
        if (i < i5) {
            m43712(c0198, i, Math.min(i2, i5), i3, i4);
        }
        c0197.m1576(Math.max(0, i - i5), Math.min(c0197.f1330, i2 - i5), i3, i4);
        if (i2 > i6) {
            m43712(c0197.f1326, Math.max(0, i - i6), i2 - i6, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m43710(int i) {
        if (i < 0 || i >= m43734()) {
            throw new IndexOutOfBoundsException(C13645.m33382(i, "Line index: "));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43728(int i, int i2) {
        if (i < 0 || i2 < i || i2 > m43734()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == i2) {
            return;
        }
        m43711(this.f61207, i, i2);
        this.f61208++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43711(C0197 c0197, int i, int i2) {
        C0197 c0198 = c0197.f1324;
        int i3 = c0198 == null ? 0 : c0198.f1331;
        int i4 = c0197.f1330 + i3;
        if (i < i3) {
            m43711(c0198, i, Math.min(i2, i3));
        }
        if (i < i4 && i2 > i3) {
            c0197.m1570();
        }
        if (i2 > i4) {
            m43711(c0197.f1326, Math.max(0, i - i4), i2 - i4);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C0197 m43719(C0197 c0197) {
        if (c0197 == null) {
            return null;
        }
        C0197 c0197M1574 = c0197.m1574(0, c0197.f1330);
        c0197M1574.f1324 = m43719(c0197.f1324);
        c0197M1574.f1326 = m43719(c0197.f1326);
        c0197M1574.f1329 = c0197.f1329;
        c0197M1574.f1325 = c0197.f1325;
        m43726(c0197M1574);
        return c0197M1574;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7655 m43709(C0197 c0197, int i) {
        if (c0197 == null) {
            return new C7655(null, null);
        }
        m43717(c0197);
        C0197 c0197M43708 = c0197.f1324;
        int i2 = c0197M43708 == null ? 0 : c0197M43708.f1331;
        if (i < i2) {
            C7655 c7655M43709 = m43709(c0197M43708, i);
            return new C7655(c7655M43709.f25226, m43708(c7655M43709.f25227, c0197, c0197.f1326));
        }
        int i3 = c0197.f1330;
        if (i > i2 + i3) {
            C7655 c7655M437010 = m43709(c0197.f1326, (i - i2) - i3);
            return new C7655(m43708(c0197.f1324, c0197, c7655M437010.f25226), c7655M437010.f25227);
        }
        int i4 = i - i2;
        if (i4 != 0) {
            c0197M43708 = m43708(c0197M43708, c0197.m1574(0, i4), (C0197) null);
        }
        int i5 = c0197.f1330;
        return new C7655(c0197M43708, i4 == i5 ? c0197.f1326 : m43708((C0197) null, c0197.m1574(i4, i5), c0197.f1326));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C0197 m43716(C0197 c0197, C0197 c0198) {
        if (c0197 == null) {
            return c0198;
        }
        if (c0198 == null) {
            return c0197;
        }
        C0197 c0199 = c0197;
        while (true) {
            C0197 c01910 = c0199.f1326;
            if (c01910 == null) {
                break;
            }
            c0199 = c01910;
        }
        C0197 c01911 = c0198;
        while (true) {
            C0197 c01912 = c01911.f1324;
            if (c01912 == null) {
                break;
            }
            c01911 = c01912;
        }
        int i = c0199.f1330;
        int i2 = c01911.f1330;
        int i3 = i + i2;
        if (i3 > 1024 && i >= 512 && i2 >= 512) {
            return m43725(c0197, c0198);
        }
        C7655 c7655M43709 = m43709(c0197, c0197.f1331 - i);
        C7655 c7655M437010 = m43709(c0198, c01911.f1330);
        C0197 c01913 = c7655M43709.f25227;
        C0197 c01914 = c7655M437010.f25226;
        m43717(c01913);
        m43717(c01914);
        C0197 c01915 = i3 > 1024 ? new C0197((i3 + 1) / 2) : null;
        int i4 = c01915 == null ? i3 : i3 / 2;
        C0197 c01916 = new C0197(i4);
        C14366 c14366 = new C14366();
        int i5 = 0;
        while (i5 < i3) {
            int i6 = c01913.f1330;
            (i5 < i6 ? c01913 : c01914).m1582(i5 < i6 ? i5 : i5 - i6, c14366);
            (i5 < i4 ? c01916 : c01915).m1579(c14366);
            i5++;
        }
        return m43725(m43725(c7655M43709.f25226, c01916), m43725(c01915, c7655M437010.f25227));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C0197 m43725(C0197 c0197, C0197 c0198) {
        if (c0197 == null) {
            return c0198;
        }
        if (c0198 == null) {
            return c0197;
        }
        m43717(c0197);
        C0197 c0199 = c0197.f1326;
        if (c0199 == null) {
            return m43708(c0197.f1324, c0197, c0198);
        }
        C0197 c0197M43725 = m43725(c0199, c0198);
        c0197.f1326 = c0197M43725;
        return m43708(c0197.f1324, c0197, c0197M43725);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0197 m43705(C0197 c0197) {
        m43726(c0197);
        C0197 c0198 = c0197.f1324;
        int i = c0198 == null ? 0 : c0198.f1332;
        C0197 c0199 = c0197.f1326;
        if (i > (c0199 == null ? 0 : c0199.f1332) + 1) {
            C0197 c01910 = c0198.f1324;
            int i2 = c01910 == null ? 0 : c01910.f1332;
            C0197 c01911 = c0198.f1326;
            if (i2 < (c01911 != null ? c01911.f1332 : 0)) {
                m43717(c0198);
                C0197 c01912 = c0198.f1326;
                m43717(c01912);
                c0198.f1326 = c01912.f1324;
                c01912.f1324 = c0198;
                m43726(c0198);
                m43726(c01912);
                c0197.f1324 = c01912;
            }
            m43717(c0197);
            C0197 c01913 = c0197.f1324;
            m43717(c01913);
            c0197.f1324 = c01913.f1326;
            c01913.f1326 = c0197;
            m43726(c0197);
            m43726(c01913);
            return c01913;
        }
        if ((c0199 == null ? 0 : c0199.f1332) <= (c0198 == null ? 0 : c0198.f1332) + 1) {
            return c0197;
        }
        C0197 c01914 = c0199.f1326;
        int i3 = c01914 == null ? 0 : c01914.f1332;
        C0197 c01915 = c0199.f1324;
        if (i3 < (c01915 != null ? c01915.f1332 : 0)) {
            m43717(c0199);
            C0197 c01916 = c0199.f1324;
            m43717(c01916);
            c0199.f1324 = c01916.f1326;
            c01916.f1326 = c0199;
            m43726(c0199);
            m43726(c01916);
            c0197.f1326 = c01916;
        }
        m43717(c0197);
        C0197 c01917 = c0197.f1326;
        m43717(c01917);
        c0197.f1326 = c01917.f1324;
        c01917.f1324 = c0197;
        m43726(c0197);
        m43726(c01917);
        return c01917;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0197 m43708(C0197 c0197, C0197 c0198, C0197 c0199) {
        if ((c0197 == null ? 0 : c0197.f1332) > (c0199 == null ? 0 : c0199.f1332) + 1) {
            m43717(c0197);
            c0197.f1326 = m43708(c0197.f1326, c0198, c0199);
            return m43705(c0197);
        }
        if ((c0199 == null ? 0 : c0199.f1332) > (c0197 != null ? c0197.f1332 : 0) + 1) {
            m43717(c0199);
            c0199.f1324 = m43708(c0197, c0198, c0199.f1324);
            return m43705(c0199);
        }
        c0198.f1324 = c0197;
        c0198.f1326 = c0199;
        m43726(c0198);
        return c0198;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m43726(C0197 c0197) {
        C0197 c0198 = c0197.f1324;
        int i = (c0198 == null ? 0 : c0198.f1331) + c0197.f1330;
        C0197 c0199 = c0197.f1326;
        c0197.f1331 = i + (c0199 == null ? 0 : c0199.f1331);
        c0197.f1332 = Math.max(c0198 == null ? 0 : c0198.f1332, c0199 != null ? c0199.f1332 : 0) + 1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m43718(C0197 c0197, int i, int i2) {
        if (c0197 == null) {
            return;
        }
        c0197.f1319 += i;
        c0197.f1317 += i2;
        c0197.f1329 += i;
        c0197.f1325 += i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m43717(C0197 c0197) {
        int i = c0197.f1329;
        if (i == 0 && c0197.f1325 == 0) {
            return;
        }
        m43718(c0197.f1324, i, c0197.f1325);
        m43718(c0197.f1326, c0197.f1329, c0197.f1325);
        c0197.f1325 = 0;
        c0197.f1329 = 0;
    }
}
