package l;

/* JADX INFO: renamed from: l.ᩳܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6N4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18128 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1900 f57955;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17175 f57956;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f57957;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17175 f57958;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f57959;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 f57960;

    public C18128(InterfaceC2916 interfaceC2916, C1900 c1900, int i, int i2, C17175 c17175, C17175 c17176) {
        this.f57960 = interfaceC2916;
        this.f57955 = c1900;
        this.f57959 = i;
        this.f57957 = i2;
        this.f57958 = c17175;
        this.f57956 = c17176;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42199(Object obj, C1900 c1900, int i, int i2) {
        return this.f57960 == obj && this.f57955 == c1900 && this.f57959 == i && this.f57957 == i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18128 m42198(C17175 c17175) {
        C17175 c17176;
        int i = c17175.f54749;
        int i2 = c17175.f54750;
        C17175 c17177 = this.f57958;
        int i3 = c17177.f54750;
        C7027 c7027 = c17177.f54748;
        int i4 = c17177.f54749;
        if (i > i3 || i4 > i2) {
            c17176 = c17175;
        } else {
            int iMax = Math.max(Math.min(i4, i), i2 - 65536);
            int iMin = (int) Math.min(Math.max(c17177.f54750, i2), ((long) iMax) + 65536);
            C7027 c7027M18855 = C7027.m18855();
            int i5 = c17175.f54749;
            if (iMax < i5) {
                c7027M18855 = c7027.m18866(iMax - i4, i5 - i4);
            }
            C7027 c7027M18862 = c7027M18855.m18862(c17175.f54748);
            if (iMin > i2) {
                c7027M18862 = c7027M18862.m18862(c7027.m18866(i2 - i4, iMin - i4));
            }
            c17176 = new C17175(iMax, c7027M18862);
        }
        return new C18128(this.f57960, this.f57955, this.f57959, this.f57957, c17176, c17175);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18128 m42197(C3498 c3498) {
        if (c3498 != null && c3498.m10284()) {
            C17175 c17175 = this.f57958;
            int i = c17175.f54749;
            int i2 = c17175.f54749;
            int iMax = Math.max(i, c3498.m10292());
            int iMin = Math.min(c17175.f54750, c3498.m10286());
            if (iMax < iMin) {
                C11967 c11967 = new C11967();
                C7027 c7027M10290 = c3498.m10290();
                int iM10292 = iMax - c3498.m10292();
                c7027M10290.getClass();
                C2793 c2793 = new C2793();
                c2793.m8488(c7027M10290);
                c2793.m8489(iM10292);
                do {
                    int iMax2 = Math.max(iMax, c2793.m8492() + c3498.m10292());
                    int iMin2 = Math.min(iMin, c2793.m8487() + c3498.m10292());
                    C15682 c15682M8491 = c2793.m8491();
                    c11967.m29779(iMin2 - iMax2, new C15682(null, c15682M8491.m37368(), 0, c15682M8491.m37374(), 0, 0), false);
                    if (iMin2 == iMin) {
                        break;
                    }
                } while (c2793.m8490());
                return new C18128(this.f57960, this.f57955, this.f57959, this.f57957, new C17175(i2, c17175.f54748.m18861(iMax - i2, iMin - i2, c11967.m29778())), this.f57956);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18128 m42196(InterfaceC0507 interfaceC0507, C1900 c1900, int i, int i2, int i3, int i4, int i5, C15682 c15682) {
        C7027 c7027M18851;
        if (!m42199(interfaceC0507, c1900, i - 1, (i2 - i5) + i4) || i3 < 0 || i4 < 0 || i5 < 0 || ((long) i3) + ((long) i4) > this.f57957) {
            return null;
        }
        int i6 = i3 + i4;
        int i7 = i5 - i4;
        C17175 c17175 = this.f57958;
        int iMin = c17175.f54749;
        C7027 c7027M18861 = c17175.f54748;
        if (i3 < iMin && i6 <= iMin) {
            iMin += i7;
        } else if (i3 < c17175.f54750) {
            int iMax = Math.max(0, i3 - iMin);
            int iMin2 = Math.min(c7027M18861.m18860(), i6 - iMin);
            C15682 c15682M18863 = i3 > iMin ? c7027M18861.m18863(iMax - 1) : c15682;
            if (i5 == 0) {
                c7027M18851 = C7027.m18855();
            } else {
                c7027M18851 = C7027.m18851(i5, new C15682(null, c15682M18863.m37368(), 0, c15682M18863.m37374(), 0, 0), false);
            }
            c7027M18861 = c7027M18861.m18861(iMax, Math.max(iMax, iMin2), c7027M18851);
            iMin = Math.min(iMin, i3);
            if (c7027M18861.m18860() == 0) {
                return null;
            }
            if (c7027M18861.m18860() > 65536) {
                c7027M18861 = c7027M18861.m18866(0, 65536);
            }
        }
        return new C18128(this.f57960, this.f57955, i, i2, new C17175(iMin, c7027M18861), null);
    }
}
