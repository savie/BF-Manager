package l;

/* JADX INFO: renamed from: l.ۧ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21RU */
/* JADX INFO: loaded from: classes4.dex */
public final class C11017 extends AbstractC9606 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f37449;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int[] f37450;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f37451;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f37452;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14545 f37453;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C4396 f37454;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f37455;

    public C11017(int i, int i2, int i3, int i4, int i5, C17720 c17720) {
        super(i, i2, i3, i4, c17720);
        this.f37451 = -1;
        int i6 = i + 1;
        this.f37455 = i6;
        this.f37449 = i6;
        this.f37453 = new C14545(i, c17720);
        this.f37450 = c17720.mo25184(i6 * 2, false);
        this.f37454 = new C4396(i4 - 1);
        this.f37452 = i5 <= 0 ? (i4 / 2) + 16 : i5;
    }

    @Override // l.AbstractC9606
    /* JADX INFO: renamed from: ۙ */
    public final void mo24491(C17720 c17720) {
        c17720.mo25182(this.f37450);
        this.f37453.m35005(c17720);
        c17720.mo25181(this.f32362);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m27767() {
        int iM24494 = m24494(this.f32359);
        if (iM24494 != 0) {
            int i = this.f37449 + 1;
            this.f37449 = i;
            int i2 = this.f37455;
            if (i == Integer.MAX_VALUE) {
                int i3 = Integer.MAX_VALUE - i2;
                this.f37453.m35003(i3);
                AbstractC9606.m24482(i2 * 2, i3, this.f37450);
                this.f37449 -= i3;
            }
            int i4 = this.f37451 + 1;
            this.f37451 = i4;
            if (i4 == i2) {
                this.f37451 = 0;
            }
        }
        return iM24494;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    @Override // l.AbstractC9606
    /* JADX INFO: renamed from: ܰ */
    public final C4396 mo24496() {
        int iM9734;
        int i;
        int[] iArr;
        C4396 c4396 = this.f37454;
        c4396.f15652 = 0;
        int[] iArr2 = c4396.f15654;
        int[] iArr3 = c4396.f15653;
        int iM27767 = m27767();
        int i2 = this.f32368;
        int i3 = this.f32359;
        if (iM27767 >= i2) {
            iM27767 = i2;
        } else {
            if (iM27767 == 0) {
                return c4396;
            }
            if (i3 > iM27767) {
                i3 = iM27767;
            }
        }
        int i4 = this.f32364;
        C14545 c14545 = this.f37453;
        byte[] bArr = this.f32362;
        c14545.m35004(i4, bArr);
        int iM35002 = this.f37449 - c14545.m35002();
        int iM35007 = this.f37449 - c14545.m35007();
        int iM35006 = c14545.m35006();
        c14545.m35008(this.f37449);
        int i5 = this.f37455;
        if (iM35002 < i5) {
            int i6 = this.f32364;
            if (bArr[i6 - iM35002] == bArr[i6]) {
                iM9734 = 2;
                iArr3[0] = 2;
                iArr2[0] = iM35002 - 1;
                c4396.f15652 = 1;
            } else {
                iM9734 = 0;
            }
        } else {
            iM9734 = 0;
        }
        if (iM35002 == iM35007 || iM35007 >= i5) {
            i = 0;
        } else {
            int i7 = this.f32364;
            i = 0;
            if (bArr[i7 - iM35007] == bArr[i7]) {
                int i8 = c4396.f15652;
                c4396.f15652 = i8 + 1;
                iArr2[i8] = iM35007 - 1;
                iM9734 = 3;
                iM35002 = iM35007;
            }
        }
        if (c4396.f15652 > 0) {
            iM9734 = C3254.m9734(bArr, this.f32364, iM35002, iM9734, iM27767);
            iArr3[c4396.f15652 - 1] = iM9734;
            if (iM9734 >= i3) {
                m27768(i3, iM35006);
                return c4396;
            }
        }
        int i9 = iM9734 >= 3 ? iM9734 : 3;
        int i10 = this.f37451 << 1;
        int i11 = i10 + 1;
        int i12 = this.f37452;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = this.f37449 - iM35006;
            int i16 = i12 - 1;
            int i17 = iM35006;
            iArr = this.f37450;
            if (i12 == 0 || i15 >= i5) {
                break;
            }
            int i18 = this.f37451;
            int i19 = ((i18 - i15) + (i15 > i18 ? i5 : 0)) << 1;
            int iMin = Math.min(i13, i14);
            int i20 = i5;
            int i21 = this.f32364;
            int i22 = i21 + iMin;
            int i23 = i13;
            int i24 = i14;
            if (bArr[i22 - i15] == bArr[i22]) {
                int iM9735 = C3254.m9734(bArr, i21, i15, iMin + 1, iM27767);
                if (iM9735 > i9) {
                    int i25 = c4396.f15652;
                    iArr3[i25] = iM9735;
                    iArr2[i25] = i15 - 1;
                    c4396.f15652 = i25 + 1;
                    if (iM9735 >= i3) {
                        iArr[i10] = iArr[i19];
                        iArr[i11] = iArr[i19 + 1];
                        return c4396;
                    }
                    i9 = iM9735;
                    iMin = i9;
                } else {
                    iMin = iM9735;
                }
            }
            int i26 = this.f32364 + iMin;
            if ((bArr[i26 - i15] & 255) < (bArr[i26] & 255)) {
                iArr[i10] = i17;
                int i27 = i19 + 1;
                iM35006 = iArr[i27];
                i10 = i27;
                i14 = iMin;
                i13 = i23;
            } else {
                iArr[i11] = i17;
                iM35006 = iArr[i19];
                i11 = i19;
                i13 = iMin;
                i14 = i24;
            }
            i12 = i16;
            i5 = i20;
        }
        iArr[i11] = i;
        iArr[i10] = i;
        return c4396;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m27768(int i, int i2) {
        int[] iArr;
        int i3;
        int i4 = this.f37451;
        int i5 = (i4 << 1) + 1;
        int i6 = i4 << 1;
        int i7 = this.f37452;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = this.f37449 - i2;
            int i11 = i7 - 1;
            iArr = this.f37450;
            if (i7 == 0 || i10 >= (i3 = this.f37455)) {
                break;
            }
            int i12 = this.f37451;
            int i13 = i12 - i10;
            if (i10 <= i12) {
                i3 = 0;
            }
            int i14 = (i13 + i3) << 1;
            int iMin = Math.min(i8, i9);
            int i15 = this.f32364;
            byte[] bArr = this.f32362;
            if (bArr[(i15 + iMin) - i10] == bArr[i15 + iMin] && (iMin = C3254.m9734(bArr, i15, i10, iMin + 1, i)) == i) {
                iArr[i6] = iArr[i14];
                iArr[i5] = iArr[i14 + 1];
                return;
            }
            int i16 = this.f32364;
            if ((bArr[(i16 + iMin) - i10] & 255) < (bArr[i16 + iMin] & 255)) {
                iArr[i6] = i2;
                int i17 = i14 + 1;
                i2 = iArr[i17];
                i6 = i17;
                i9 = iMin;
            } else {
                iArr[i5] = i2;
                i2 = iArr[i14];
                i5 = i14;
                i8 = iMin;
            }
            i7 = i11;
        }
        iArr[i5] = 0;
        iArr[i6] = 0;
    }

    @Override // l.AbstractC9606
    /* JADX INFO: renamed from: ۖ */
    public final void mo24483(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            int iM27767 = m27767();
            int i3 = this.f32359;
            if (iM27767 < i3) {
                if (iM27767 == 0) {
                }
                i = i2;
            } else {
                iM27767 = i3;
            }
            byte[] bArr = this.f32362;
            int i4 = this.f32364;
            C14545 c14545 = this.f37453;
            c14545.m35004(i4, bArr);
            int iM35006 = c14545.m35006();
            c14545.m35008(this.f37449);
            m27768(iM27767, iM35006);
            i = i2;
        }
    }
}
