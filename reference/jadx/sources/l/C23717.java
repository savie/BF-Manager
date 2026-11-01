package l;

/* JADX INFO: renamed from: l.᩻۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SD */
/* JADX INFO: loaded from: classes.dex */
public final class C23717 extends AbstractC9606 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C14545 f76748;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C4396 f76749;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int[] f76750;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f76751;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f76752;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f76753;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f76754;

    public C23717(int i, int i2, int i3, int i4, int i5, C17720 c17720) {
        super(i, i2, i3, i4, c17720);
        this.f76754 = -1;
        this.f76748 = new C14545(i, c17720);
        int i6 = i + 1;
        this.f76751 = i6;
        this.f76750 = c17720.mo25184(i6, false);
        this.f76753 = i6;
        this.f76749 = new C4396(i4 - 1);
        this.f76752 = i5 <= 0 ? (i4 / 4) + 4 : i5;
    }

    @Override // l.AbstractC9606
    /* JADX INFO: renamed from: ۙ */
    public final void mo24491(C17720 c17720) {
        c17720.mo25182(this.f76750);
        this.f76748.m35005(c17720);
        c17720.mo25181(this.f32362);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m52223() {
        int iM24494 = m24494(4);
        if (iM24494 != 0) {
            int i = this.f76753 + 1;
            this.f76753 = i;
            int i2 = this.f76751;
            if (i == Integer.MAX_VALUE) {
                int i3 = Integer.MAX_VALUE - i2;
                this.f76748.m35003(i3);
                AbstractC9606.m24482(i2, i3, this.f76750);
                this.f76753 -= i3;
            }
            int i4 = this.f76754 + 1;
            this.f76754 = i4;
            if (i4 == i2) {
                this.f76754 = 0;
            }
        }
        return iM24494;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c A[DONT_INVERT, PHI: r14
      0x008c: PHI (r14v3 int) = (r14v2 int), (r14v9 int) binds: [B:22:0x007b, B:24:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    @Override // l.AbstractC9606
    /* JADX INFO: renamed from: ܰ */
    public final C4396 mo24496() {
        int iM9734;
        int i;
        int iM9735;
        C4396 c4396 = this.f76749;
        c4396.f15652 = 0;
        int[] iArr = c4396.f15654;
        int[] iArr2 = c4396.f15653;
        int iM52223 = m52223();
        int i2 = this.f32368;
        int i3 = this.f32359;
        if (iM52223 < i2) {
            if (iM52223 != 0) {
                if (i3 > iM52223) {
                    i3 = iM52223;
                }
            }
            return c4396;
        }
        iM52223 = i2;
        int i4 = this.f32364;
        C14545 c14545 = this.f76748;
        byte[] bArr = this.f32362;
        c14545.m35004(i4, bArr);
        int iM35002 = this.f76753 - c14545.m35002();
        int iM35007 = this.f76753 - c14545.m35007();
        int iM35006 = c14545.m35006();
        c14545.m35008(this.f76753);
        int i5 = this.f76754;
        int[] iArr3 = this.f76750;
        iArr3[i5] = iM35006;
        int i6 = this.f76751;
        if (iM35002 < i6) {
            int i7 = this.f32364;
            if (bArr[i7 - iM35002] == bArr[i7]) {
                iM9734 = 2;
                iArr2[0] = 2;
                iArr[0] = iM35002 - 1;
                c4396.f15652 = 1;
            } else {
                iM9734 = 0;
            }
        } else {
            iM9734 = 0;
        }
        if (iM35002 != iM35007 && iM35007 < i6) {
            int i8 = this.f32364;
            if (bArr[i8 - iM35007] == bArr[i8]) {
                int i9 = c4396.f15652;
                c4396.f15652 = i9 + 1;
                iArr[i9] = iM35007 - 1;
                iM9734 = 3;
                iM35002 = iM35007;
            }
        }
        if (c4396.f15652 > 0) {
            iM9734 = C3254.m9734(bArr, this.f32364, iM35002, iM9734, iM52223);
            iArr2[c4396.f15652 - 1] = iM9734;
            if (iM9734 < i3) {
                int i10 = iM9734 >= 3 ? iM9734 : 3;
                i = this.f76752;
                while (true) {
                    int i11 = this.f76753 - iM35006;
                    int i12 = i - 1;
                    if (i == 0 || i11 >= i6) {
                        break;
                    }
                    int i13 = this.f76754;
                    int i14 = iArr3[(i13 - i11) + (i11 > i13 ? i6 : 0)];
                    int i15 = this.f32364;
                    int i16 = i15 + i10;
                    if (bArr[i16 - i11] == bArr[i16] && bArr[i15 - i11] == bArr[i15] && (iM9735 = C3254.m9734(bArr, i15, i11, 1, iM52223)) > i10) {
                        int i17 = c4396.f15652;
                        iArr2[i17] = iM9735;
                        iArr[i17] = i11 - 1;
                        c4396.f15652 = i17 + 1;
                        if (iM9735 >= i3) {
                            break;
                        }
                        i10 = iM9735;
                    }
                    iM35006 = i14;
                    i = i12;
                }
            }
        } else {
            if (iM9734 >= 3) {
            }
            i = this.f76752;
            while (true) {
                int i18 = this.f76753 - iM35006;
                int i19 = i - 1;
                if (i == 0) {
                    break;
                }
                break;
                break;
                iM35006 = i14;
                i = i19;
            }
        }
        return c4396;
    }

    @Override // l.AbstractC9606
    /* JADX INFO: renamed from: ۖ */
    public final void mo24483(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            if (m52223() != 0) {
                byte[] bArr = this.f32362;
                int i3 = this.f32364;
                C14545 c14545 = this.f76748;
                c14545.m35004(i3, bArr);
                this.f76750[this.f76754] = c14545.m35006();
                c14545.m35008(this.f76753);
            }
            i = i2;
        }
    }
}
