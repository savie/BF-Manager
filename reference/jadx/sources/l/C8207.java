package l;

/* JADX INFO: renamed from: l.۟᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 71RJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8207 extends AbstractC0749 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C17902 f27032;

    public C8207(C7461 c7461, int i, int i2, int i3, int i4, int i5, int i6, int i7, C0573 c0573) {
        super(c7461, AbstractC25362.m56713(i3, Math.max(i4, 1), 272, i5, i6, i7, c0573), i, i2, i3, i5);
        this.f27032 = null;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7 A[LOOP:2: B:75:0x00ec->B:79:0x00f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0103 A[SYNTHETIC] */
    @Override // l.AbstractC0749
    /* JADX INFO: renamed from: ᩴ */
    public final int mo3097() {
        int i;
        int i2;
        int i3;
        int iMax;
        int i4;
        if (this.f2727 == -1) {
            this.f27032 = m3099();
        }
        this.f2740 = -1;
        AbstractC25362 abstractC25362 = this.f2729;
        int iMin = Math.min(abstractC25362.m56716(), 273);
        int i5 = 1;
        if (iMin < 2) {
            return 1;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = this.f2739;
            int[] iArr = this.f66852;
            if (i6 < 4) {
                int iM56726 = abstractC25362.m56726(iArr[i6], iMin);
                if (iM56726 >= 2) {
                    if (iM56726 >= i9) {
                        this.f2740 = i6;
                        m3091(iM56726 - 1);
                        return iM56726;
                    }
                    if (iM56726 > i7) {
                        i8 = i6;
                        i7 = iM56726;
                    }
                }
                i6++;
            } else {
                C17902 c17902 = this.f27032;
                int i10 = c17902.f58641;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    i2 = c17902.f58642[i11];
                    i = c17902.f58643[i11];
                    if (i2 >= i9) {
                        this.f2740 = i + 4;
                        m3091(i2 - 1);
                        return i2;
                    }
                    while (true) {
                        C17902 c17903 = this.f27032;
                        int i12 = c17903.f58641;
                        if (i12 <= i5) {
                            break;
                        }
                        int[] iArr2 = c17903.f58642;
                        int i13 = i12 - 2;
                        if (i2 != iArr2[i13] + 1) {
                            break;
                        }
                        int[] iArr3 = c17903.f58643;
                        if (iArr3[i13] >= (i >>> 7)) {
                            break;
                        }
                        c17903.f58641 = i12 - 1;
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
                    this.f2740 = i8;
                    m3091(i7 - 1);
                    return i7;
                }
                if (i2 >= 2 && iMin > 2) {
                    C17902 c17902M3099 = m3099();
                    this.f27032 = c17902M3099;
                    int i15 = c17902M3099.f58641;
                    if (i15 > 0) {
                        int i16 = i15 - 1;
                        int i17 = c17902M3099.f58642[i16];
                        int i18 = c17902M3099.f58643[i16];
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
                                    if (abstractC25362.m56726(iArr[i4], iMax) == iMax) {
                                    }
                                }
                                this.f2740 = i + 4;
                                m3091(i2 - 2);
                                return i2;
                            }
                        }
                    } else {
                        iMax = Math.max(i2 - 1, 2);
                        while (i4 < 4) {
                            if (abstractC25362.m56726(iArr[i4], iMax) == iMax) {
                            }
                        }
                        this.f2740 = i + 4;
                        m3091(i2 - 2);
                        return i2;
                    }
                }
                return i3;
            }
        }
    }
}
