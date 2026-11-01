package l;

/* JADX INFO: renamed from: l.ᩳۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71RJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17802 extends AbstractC21330 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C4396 f56420;

    public C17802(C20625 c20625, int i, int i2, int i3, int i4, int i5, int i6, int i7, C17720 c17720) {
        super(c20625, AbstractC9606.m24481(i3, Math.max(i4, 1), 272, i5, i6, i7, c17720), i, i2, i3, i5);
        this.f56420 = null;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7 A[LOOP:2: B:75:0x00ec->B:79:0x00f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0103 A[SYNTHETIC] */
    @Override // l.AbstractC21330
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo41381() {
        int i;
        int i2;
        int i3;
        int iMax;
        int i4;
        if (this.f69424 == -1) {
            this.f56420 = m47847();
        }
        this.f69427 = -1;
        AbstractC9606 abstractC9606 = this.f69430;
        int iMin = Math.min(abstractC9606.m24485(), 273);
        int i5 = 1;
        if (iMin < 2) {
            return 1;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = this.f69429;
            int[] iArr = this.f17788;
            if (i6 < 4) {
                int iM24495 = abstractC9606.m24495(iArr[i6], iMin);
                if (iM24495 >= 2) {
                    if (iM24495 >= i9) {
                        this.f69427 = i6;
                        m47851(iM24495 - 1);
                        return iM24495;
                    }
                    if (iM24495 > i7) {
                        i8 = i6;
                        i7 = iM24495;
                    }
                }
                i6++;
            } else {
                C4396 c4396 = this.f56420;
                int i10 = c4396.f15652;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    i2 = c4396.f15653[i11];
                    i = c4396.f15654[i11];
                    if (i2 >= i9) {
                        this.f69427 = i + 4;
                        m47851(i2 - 1);
                        return i2;
                    }
                    while (true) {
                        C4396 c4397 = this.f56420;
                        int i12 = c4397.f15652;
                        if (i12 <= i5) {
                            break;
                        }
                        int[] iArr2 = c4397.f15653;
                        int i13 = i12 - 2;
                        if (i2 != iArr2[i13] + 1) {
                            break;
                        }
                        int[] iArr3 = c4397.f15654;
                        if (iArr3[i13] >= (i >>> 7)) {
                            break;
                        }
                        c4397.f15652 = i12 - 1;
                        int i14 = i12 - 2;
                        i2 = iArr2[i14];
                        i = iArr3[i14];
                        i5 = 1;
                    }
                    i3 = 1;
                    if (i2 == 2 && i >= 128) {
                        i2 = 1;
                    }
                } else {
                    i = 0;
                    i2 = 0;
                    i3 = 1;
                }
                if (i7 >= 2 && (i7 + 1 >= i2 || ((i7 + 2 >= i2 && i >= 512) || (i7 + 3 >= i2 && i >= 32768)))) {
                    this.f69427 = i8;
                    m47851(i7 - 1);
                    return i7;
                }
                if (i2 >= 2 && iMin > 2) {
                    C4396 c4396M47847 = m47847();
                    this.f56420 = c4396M47847;
                    int i15 = c4396M47847.f15652;
                    if (i15 > 0) {
                        int i16 = i15 - 1;
                        int i17 = c4396M47847.f15653[i16];
                        int i18 = c4396M47847.f15654[i16];
                        if (i17 < i2 || i18 >= i) {
                            int i19 = i2 + 1;
                            if (i17 == i19 && i >= (i18 >>> 7)) {
                                return i3;
                            }
                            if (i17 <= i19) {
                                if (i17 + 1 >= i2 && i2 >= 3 && i18 < (i >>> 7)) {
                                    return i3;
                                }
                                iMax = Math.max(i2 - 1, 2);
                                for (i4 = 0; i4 < 4; i4++) {
                                    if (abstractC9606.m24495(iArr[i4], iMax) == iMax) {
                                    }
                                }
                                this.f69427 = i + 4;
                                m47851(i2 - 2);
                                return i2;
                            }
                        }
                    } else {
                        iMax = Math.max(i2 - 1, 2);
                        while (i4 < 4) {
                            if (abstractC9606.m24495(iArr[i4], iMax) == iMax) {
                            }
                        }
                        this.f69427 = i + 4;
                        m47851(i2 - 2);
                        return i2;
                    }
                }
                return i3;
            }
        }
    }
}
