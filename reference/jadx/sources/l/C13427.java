package l;

/* JADX INFO: renamed from: l.۫᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 21RU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13427 extends AbstractC25362 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f42759;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f42760;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f42761;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f42762;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f42763;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C17902 f42764;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2241 f42765;

    public C13427(int i, int i2, int i3, int i4, int i5, C0573 c0573) {
        super(i, i2, i3, i4, c0573);
        this.f42762 = -1;
        int i6 = i + 1;
        this.f42763 = i6;
        this.f42759 = i6;
        this.f42765 = new C2241(i, c0573);
        this.f42760 = c0573.mo2595(i6 * 2, false);
        this.f42764 = new C17902(i4 - 1);
        this.f42761 = i5 <= 0 ? (i4 / 2) + 16 : i5;
    }

    @Override // l.AbstractC25362
    /* JADX INFO: renamed from: ۙ */
    public final void mo17391(C0573 c0573) {
        c0573.mo2593(this.f42760);
        this.f42765.m7645(c0573);
        c0573.mo2592(this.f81884);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private int m33065() {
        int iM56723 = m56723(this.f81888);
        if (iM56723 != 0) {
            int i = this.f42759 + 1;
            this.f42759 = i;
            int i2 = this.f42763;
            if (i == Integer.MAX_VALUE) {
                int i3 = Integer.MAX_VALUE - i2;
                this.f42765.m7643(i3);
                AbstractC25362.m56714(i2 * 2, i3, this.f42760);
                this.f42759 -= i3;
            }
            int i4 = this.f42762 + 1;
            this.f42762 = i4;
            if (i4 == i2) {
                this.f42762 = 0;
            }
        }
        return iM56723;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    @Override // l.AbstractC25362
    /* JADX INFO: renamed from: ᩷ */
    public final C17902 mo17392() {
        int iM40309;
        int i;
        int[] iArr;
        C17902 c17902 = this.f42764;
        c17902.f58641 = 0;
        int[] iArr2 = c17902.f58643;
        int[] iArr3 = c17902.f58642;
        int iM33065 = m33065();
        int i2 = this.f81889;
        int i3 = this.f81888;
        if (iM33065 >= i2) {
            iM33065 = i2;
        } else {
            if (iM33065 == 0) {
                return c17902;
            }
            if (i3 > iM33065) {
                i3 = iM33065;
            }
        }
        int i4 = this.f81887;
        C2241 c2241 = this.f42765;
        byte[] bArr = this.f81884;
        c2241.m7644(i4, bArr);
        int iM7642 = this.f42759 - c2241.m7642();
        int iM7647 = this.f42759 - c2241.m7647();
        int iM7646 = c2241.m7646();
        c2241.m7648(this.f42759);
        int i5 = this.f42763;
        if (iM7642 < i5) {
            int i6 = this.f81887;
            if (bArr[i6 - iM7642] == bArr[i6]) {
                iM40309 = 2;
                iArr3[0] = 2;
                iArr2[0] = iM7642 - 1;
                c17902.f58641 = 1;
            } else {
                iM40309 = 0;
            }
        } else {
            iM40309 = 0;
        }
        if (iM7642 == iM7647 || iM7647 >= i5) {
            i = 0;
        } else {
            int i7 = this.f81887;
            i = 0;
            if (bArr[i7 - iM7647] == bArr[i7]) {
                int i8 = c17902.f58641;
                c17902.f58641 = i8 + 1;
                iArr2[i8] = iM7647 - 1;
                iM40309 = 3;
                iM7642 = iM7647;
            }
        }
        if (c17902.f58641 > 0) {
            iM40309 = C17156.m40309(bArr, this.f81887, iM7642, iM40309, iM33065);
            iArr3[c17902.f58641 - 1] = iM40309;
            if (iM40309 >= i3) {
                m33064(i3, iM7646);
                return c17902;
            }
        }
        int i9 = iM40309 >= 3 ? iM40309 : 3;
        int i10 = this.f42762 << 1;
        int i11 = i10 + 1;
        int i12 = this.f42761;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = this.f42759 - iM7646;
            int i16 = i12 - 1;
            int i17 = iM7646;
            iArr = this.f42760;
            if (i12 == 0 || i15 >= i5) {
                break;
            }
            int i18 = this.f42762;
            int i19 = ((i18 - i15) + (i15 > i18 ? i5 : 0)) << 1;
            int iMin = Math.min(i13, i14);
            int i20 = i5;
            int i21 = this.f81887;
            int i22 = i21 + iMin;
            int i23 = i13;
            int i24 = i14;
            if (bArr[i22 - i15] == bArr[i22]) {
                int iM403010 = C17156.m40309(bArr, i21, i15, iMin + 1, iM33065);
                if (iM403010 > i9) {
                    int i25 = c17902.f58641;
                    iArr3[i25] = iM403010;
                    iArr2[i25] = i15 - 1;
                    c17902.f58641 = i25 + 1;
                    if (iM403010 >= i3) {
                        iArr[i10] = iArr[i19];
                        iArr[i11] = iArr[i19 + 1];
                        return c17902;
                    }
                    i9 = iM403010;
                    iMin = i9;
                } else {
                    iMin = iM403010;
                }
            }
            int i26 = this.f81887 + iMin;
            if ((bArr[i26 - i15] & 255) < (bArr[i26] & 255)) {
                iArr[i10] = i17;
                int i27 = i19 + 1;
                iM7646 = iArr[i27];
                i10 = i27;
                i14 = iMin;
                i13 = i23;
            } else {
                iArr[i11] = i17;
                iM7646 = iArr[i19];
                i11 = i19;
                i13 = iMin;
                i14 = i24;
            }
            i12 = i16;
            i5 = i20;
        }
        iArr[i11] = i;
        iArr[i10] = i;
        return c17902;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m33064(int i, int i2) {
        int[] iArr;
        int i3;
        int i4 = this.f42762;
        int i5 = (i4 << 1) + 1;
        int i6 = i4 << 1;
        int i7 = this.f42761;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = this.f42759 - i2;
            int i11 = i7 - 1;
            iArr = this.f42760;
            if (i7 == 0 || i10 >= (i3 = this.f42763)) {
                break;
            }
            int i12 = this.f42762;
            int i13 = i12 - i10;
            if (i10 <= i12) {
                i3 = 0;
            }
            int i14 = (i13 + i3) << 1;
            int iMin = Math.min(i8, i9);
            int i15 = this.f81887;
            byte[] bArr = this.f81884;
            if (bArr[(i15 + iMin) - i10] == bArr[i15 + iMin] && (iMin = C17156.m40309(bArr, i15, i10, iMin + 1, i)) == i) {
                iArr[i6] = iArr[i14];
                iArr[i5] = iArr[i14 + 1];
                return;
            }
            int i16 = this.f81887;
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

    @Override // l.AbstractC25362
    /* JADX INFO: renamed from: ᩸ */
    public final void mo17393(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            int iM33065 = m33065();
            int i3 = this.f81888;
            if (iM33065 < i3) {
                if (iM33065 == 0) {
                }
                i = i2;
            } else {
                iM33065 = i3;
            }
            byte[] bArr = this.f81884;
            int i4 = this.f81887;
            C2241 c2241 = this.f42765;
            c2241.m7644(i4, bArr);
            int iM7646 = c2241.m7646();
            c2241.m7648(this.f42759);
            m33064(iM33065, iM7646);
            i = i2;
        }
    }
}
