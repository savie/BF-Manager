package l;

/* JADX INFO: renamed from: l.ۚ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SD */
/* JADX INFO: loaded from: classes3.dex */
public final class C5970 extends AbstractC25362 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C2241 f20460;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17902 f20461;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f20462;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f20463;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f20464;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f20465;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f20466;

    public C5970(int i, int i2, int i3, int i4, int i5, C0573 c0573) {
        super(i, i2, i3, i4, c0573);
        this.f20464 = -1;
        this.f20460 = new C2241(i, c0573);
        int i6 = i + 1;
        this.f20462 = i6;
        this.f20463 = c0573.mo2595(i6, false);
        this.f20465 = i6;
        this.f20461 = new C17902(i4 - 1);
        this.f20466 = i5 <= 0 ? (i4 / 4) + 4 : i5;
    }

    @Override // l.AbstractC25362
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17391(C0573 c0573) {
        c0573.mo2593(this.f20463);
        this.f20460.m7645(c0573);
        c0573.mo2592(this.f81884);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private int m17390() {
        int iM56723 = m56723(4);
        if (iM56723 != 0) {
            int i = this.f20465 + 1;
            this.f20465 = i;
            int i2 = this.f20462;
            if (i == Integer.MAX_VALUE) {
                int i3 = Integer.MAX_VALUE - i2;
                this.f20460.m7643(i3);
                AbstractC25362.m56714(i2, i3, this.f20463);
                this.f20465 -= i3;
            }
            int i4 = this.f20464 + 1;
            this.f20464 = i4;
            if (i4 == i2) {
                this.f20464 = 0;
            }
        }
        return iM56723;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c A[DONT_INVERT, PHI: r14
      0x008c: PHI (r14v3 int) = (r14v2 int), (r14v9 int) binds: [B:22:0x007b, B:24:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    @Override // l.AbstractC25362
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17902 mo17392() {
        int iM40309;
        int i;
        int iM403010;
        C17902 c17902 = this.f20461;
        c17902.f58641 = 0;
        int[] iArr = c17902.f58643;
        int[] iArr2 = c17902.f58642;
        int iM17390 = m17390();
        int i2 = this.f81889;
        int i3 = this.f81888;
        if (iM17390 < i2) {
            if (iM17390 != 0) {
                if (i3 > iM17390) {
                    i3 = iM17390;
                }
            }
            return c17902;
        }
        iM17390 = i2;
        int i4 = this.f81887;
        C2241 c2241 = this.f20460;
        byte[] bArr = this.f81884;
        c2241.m7644(i4, bArr);
        int iM7642 = this.f20465 - c2241.m7642();
        int iM7647 = this.f20465 - c2241.m7647();
        int iM7646 = c2241.m7646();
        c2241.m7648(this.f20465);
        int i5 = this.f20464;
        int[] iArr3 = this.f20463;
        iArr3[i5] = iM7646;
        int i6 = this.f20462;
        if (iM7642 < i6) {
            int i7 = this.f81887;
            if (bArr[i7 - iM7642] == bArr[i7]) {
                iM40309 = 2;
                iArr2[0] = 2;
                iArr[0] = iM7642 - 1;
                c17902.f58641 = 1;
            } else {
                iM40309 = 0;
            }
        } else {
            iM40309 = 0;
        }
        if (iM7642 != iM7647 && iM7647 < i6) {
            int i8 = this.f81887;
            if (bArr[i8 - iM7647] == bArr[i8]) {
                int i9 = c17902.f58641;
                c17902.f58641 = i9 + 1;
                iArr[i9] = iM7647 - 1;
                iM40309 = 3;
                iM7642 = iM7647;
            }
        }
        if (c17902.f58641 > 0) {
            iM40309 = C17156.m40309(bArr, this.f81887, iM7642, iM40309, iM17390);
            iArr2[c17902.f58641 - 1] = iM40309;
            if (iM40309 < i3) {
                int i10 = iM40309 >= 3 ? iM40309 : 3;
                i = this.f20466;
                while (true) {
                    int i11 = this.f20465 - iM7646;
                    int i12 = i - 1;
                    if (i == 0 || i11 >= i6) {
                        break;
                    }
                    int i13 = this.f20464;
                    int i14 = iArr3[(i13 - i11) + (i11 > i13 ? i6 : 0)];
                    int i15 = this.f81887;
                    int i16 = i15 + i10;
                    if (bArr[i16 - i11] == bArr[i16] && bArr[i15 - i11] == bArr[i15] && (iM403010 = C17156.m40309(bArr, i15, i11, 1, iM17390)) > i10) {
                        int i17 = c17902.f58641;
                        iArr2[i17] = iM403010;
                        iArr[i17] = i11 - 1;
                        c17902.f58641 = i17 + 1;
                        if (iM403010 >= i3) {
                            break;
                        }
                        i10 = iM403010;
                    }
                    iM7646 = i14;
                    i = i12;
                }
            }
        } else {
            if (iM40309 >= 3) {
            }
            i = this.f20466;
            while (true) {
                int i18 = this.f20465 - iM7646;
                int i19 = i - 1;
                if (i == 0) {
                    break;
                }
                break;
                break;
                iM7646 = i14;
                i = i19;
            }
        }
        return c17902;
    }

    @Override // l.AbstractC25362
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo17393(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            if (m17390() != 0) {
                byte[] bArr = this.f81884;
                int i3 = this.f81887;
                C2241 c2241 = this.f20460;
                c2241.m7644(i3, bArr);
                this.f20463[this.f20464] = c2241.m7646();
                c2241.m7648(this.f20465);
            }
            i = i2;
        }
    }
}
