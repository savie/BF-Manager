package l;

/* JADX INFO: renamed from: l.ۙܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6N4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4999 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23667 f17359;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C23667 f17360;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f17361;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f17362;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f17363;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20661 f17364;

    public C4999(InterfaceC19106 interfaceC19106, C20661 c20661, int i, int i2, C23667 c23667, C23667 c23668) {
        this.f17361 = interfaceC19106;
        this.f17364 = c20661;
        this.f17363 = i;
        this.f17362 = i2;
        this.f17360 = c23667;
        this.f17359 = c23668;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15226(Object obj, C20661 c20661, int i, int i2) {
        return this.f17361 == obj && this.f17364 == c20661 && this.f17363 == i && this.f17362 == i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4999 m15225(C23667 c23667) {
        C23667 c23668;
        int i = c23667.f76756;
        int i2 = c23667.f76757;
        C23667 c23669 = this.f17360;
        int i3 = c23669.f76757;
        C1270 c1270 = c23669.f76755;
        int i4 = c23669.f76756;
        if (i > i3 || i4 > i2) {
            c23668 = c23667;
        } else {
            int iMax = Math.max(Math.min(i4, i), i2 - 65536);
            int iMin = (int) Math.min(Math.max(c23669.f76757, i2), ((long) iMax) + 65536);
            C1270 c1270M4622 = C1270.m4622();
            int i5 = c23667.f76756;
            if (iMax < i5) {
                c1270M4622 = c1270.m4635(iMax - i4, i5 - i4);
            }
            C1270 c1270M4630 = c1270M4622.m4630(c23667.f76755);
            if (iMin > i2) {
                c1270M4630 = c1270M4630.m4630(c1270.m4635(i2 - i4, iMin - i4));
            }
            c23668 = new C23667(iMax, c1270M4630);
        }
        return new C4999(this.f17361, this.f17364, this.f17363, this.f17362, c23668, c23667);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4999 m15223(C6711 c6711) {
        if (c6711 != null && c6711.m18743()) {
            C23667 c23667 = this.f17360;
            int i = c23667.f76756;
            int i2 = c23667.f76756;
            int iMax = Math.max(i, c6711.m18746());
            int iMin = Math.min(c23667.f76757, c6711.m18738());
            if (iMax < iMin) {
                C14693 c14693 = new C14693();
                C1270 c1270M18745 = c6711.m18745();
                int iM18746 = iMax - c6711.m18746();
                c1270M18745.getClass();
                C21407 c21407 = new C21407();
                c21407.m48710(c1270M18745);
                c21407.m48711(iM18746);
                do {
                    int iMax2 = Math.max(iMax, c21407.m48715() + c6711.m18746());
                    int iMin2 = Math.min(iMin, c21407.m48709() + c6711.m18746());
                    C11974 c11974M48712 = c21407.m48712();
                    c14693.m35347(iMin2 - iMax2, new C11974(null, c11974M48712.m30041(), 0, c11974M48712.m30034(), 0, 0), false);
                    if (iMin2 == iMin) {
                        break;
                    }
                } while (c21407.m48714());
                return new C4999(this.f17361, this.f17364, this.f17363, this.f17362, new C23667(i2, c23667.f76755.m4629(iMax - i2, iMin - i2, c14693.m35346())), this.f17359);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4999 m15224(InterfaceC9629 interfaceC9629, C20661 c20661, int i, int i2, int i3, int i4, int i5, C11974 c11974) {
        C1270 c1270M4615;
        if (!m15226(interfaceC9629, c20661, i - 1, (i2 - i5) + i4) || i3 < 0 || i4 < 0 || i5 < 0 || ((long) i3) + ((long) i4) > this.f17362) {
            return null;
        }
        int i6 = i3 + i4;
        int i7 = i5 - i4;
        C23667 c23667 = this.f17360;
        int iMin = c23667.f76756;
        C1270 c1270M4629 = c23667.f76755;
        if (i3 < iMin && i6 <= iMin) {
            iMin += i7;
        } else if (i3 < c23667.f76757) {
            int iMax = Math.max(0, i3 - iMin);
            int iMin2 = Math.min(c1270M4629.m4628(), i6 - iMin);
            C11974 c11974M4631 = i3 > iMin ? c1270M4629.m4631(iMax - 1) : c11974;
            if (i5 == 0) {
                c1270M4615 = C1270.m4622();
            } else {
                c1270M4615 = C1270.m4615(i5, new C11974(null, c11974M4631.m30041(), 0, c11974M4631.m30034(), 0, 0), false);
            }
            c1270M4629 = c1270M4629.m4629(iMax, Math.max(iMax, iMin2), c1270M4615);
            iMin = Math.min(iMin, i3);
            if (c1270M4629.m4628() == 0) {
                return null;
            }
            if (c1270M4629.m4628() > 65536) {
                c1270M4629 = c1270M4629.m4635(0, 65536);
            }
        }
        return new C4999(this.f17361, this.f17364, i, i2, new C23667(iMin, c1270M4629), null);
    }
}
