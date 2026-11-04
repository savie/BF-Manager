package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S98Z */
/* JADX INFO: loaded from: classes.dex */
public class C5408 extends C1679 {
    static {
        ApplicationC23172.m52091(60);
    }

    public native C5408(int i, int[] iArr);

    public native C5408(int[] iArr, int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native int[] m16097(int[] iArr, int[] iArr2, int i, int i2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native int[] m16098(int[] iArr, int[] iArr2, int i, long j, int[] iArr3);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native int[] m16099(int[] iArr, int[] iArr2, int[] iArr3, int i, long j, int[] iArr4);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private native C5408 m16104(C5408 c5408, C5408 c5409);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static native int[] m16108(int[] iArr, int[] iArr2, int i, long j, int[] iArr3);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static native int[] m16109(int[] iArr, int[] iArr2, int[] iArr3, int i, long j, int[] iArr4);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native C5408 m16111();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native C5408 m16114(C5408 c5408, C5408 c5409);

    @Override // l.C1679
    /* JADX INFO: renamed from: ۙ */
    public native /* bridge */ /* synthetic */ boolean mo6022(C1679 c1679);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public native C5408 m16115();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public native byte m16117(int i);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public native InterfaceC16594 m16119();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public native C5408 m16120();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public native C5408 m16122();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public native C5408 m16123(C5408 c5408);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public native C5408 m16128(C5408 c5408);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public native C5408 m16133(C5408 c5408);

    public C5408() {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x003a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0042  */
    /* JADX WARN: Code duplicated, block: B:40:0x0047  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0037, code lost:
    
        if (l.C13473.f42873 != 0) goto L41;
     */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m16118(l.C5408 r5) {
        /*
            r4 = this;
            int r0 = l.C0773.f2792
            if (r0 > 0) goto L5
            goto L4d
        L5:
            int r0 = l.C2287.f7432
            if (r0 < 0) goto La
            goto L3a
        La:
            int r0 = l.C2702.f8586
            if (r0 > 0) goto Lf
            goto L47
        Lf:
            int r0 = l.C3690.f12684
            if (r0 > 0) goto L14
            goto L47
        L14:
            int r0 = l.C1321.f4751
            if (r0 < 0) goto L19
            goto L35
        L19:
            int r0 = l.C0950.f3488
            if (r0 < 0) goto L1e
            goto L42
        L1e:
            boolean r0 = l.RunnableC1848.m6360()
            if (r0 == 0) goto L25
            goto L47
        L25:
            int r0 = l.AbstractC0116.f1064
            if (r0 > 0) goto L2a
            goto L3a
        L2a:
            int r0 = l.C23916.f77426
            if (r0 > 0) goto L2f
            goto L4d
        L2f:
            int r0 = r4.f5783
            int r1 = l.C1783.f6087
            if (r1 > 0) goto L55
        L35:
            int r5 = l.C13473.f42873
            if (r5 == 0) goto L3a
            goto L4d
        L3a:
            l.C3099.m10095()
            int r5 = l.C13473.f42873
            if (r5 == 0) goto L42
            goto L47
        L42:
            int r5 = l.C1343.f4799
            if (r5 == 0) goto L47
            goto L4d
        L47:
            l.RunnableC1848.m6360()
            l.C0269.m1775()
        L4d:
            l.C1783.m6232()
            l.C3998.m12920()
            r5 = 0
            return r5
        L55:
            int r1 = r5.f5783
            r2 = 1
            r3 = -1
            if (r0 != r1) goto L6b
            if (r0 == r3) goto L66
            if (r0 == r2) goto L61
            r5 = 0
            return r5
        L61:
            int r5 = r4.m16130(r5)
            return r5
        L66:
            int r5 = r5.m16130(r4)
            return r5
        L6b:
            if (r0 <= r1) goto L6e
            return r2
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5408.m16118(l.ۚۙۚ):int");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5408 m16088(int i, int i2, int[] iArr) {
        if (RunnableC3646.f12471) {
            C2966.m9664();
            if (C1146.f4234 < 0) {
                if (C2878.f9462) {
                    if (C3690.f12684 <= 0) {
                    }
                }
            }
            C1826.m6301();
        } else if (C2419.f7754 < 0) {
            if (Integer.bitCount(i) == 1) {
                return new C5408(m16106(Integer.numberOfTrailingZeros(i), iArr), i2);
            }
            int length = iArr.length;
            int i3 = length + 1;
            if (RunnableC3055.f9898 < 0) {
                int[] iArrCopyOfRange = new int[i3];
                long j = i;
                if (C3099.f10023 > 0) {
                    long j2 = j & 4294967295L;
                    if (C3998.f13671 == 0) {
                        int i4 = length - 1;
                        long j3 = 0;
                        while (true) {
                            if (i4 >= 0) {
                                long j4 = ((long) iArr[i4]) & 4294967295L;
                                if (C2834.f9334 > 0) {
                                    long j5 = j4 * j2;
                                    if (!RunnableC3646.f12471) {
                                        long j6 = j5 + j3;
                                        int i5 = length - 1;
                                        if (!C2023.f6737) {
                                            iArrCopyOfRange[length] = (int) j6;
                                            if (!RunnableC1848.f6235) {
                                                long j7 = j6 >>> 32;
                                                if (C1564.f5401 > 0) {
                                                    i4--;
                                                    length = i5;
                                                    j3 = j7;
                                                }
                                            }
                                        }
                                    }
                                    if (C3690.f12684 <= 0) {
                                    }
                                }
                                C2966.m9664();
                                if (C1146.f4234 < 0) {
                                    if (C2878.f9462) {
                                        if (C3690.f12684 <= 0) {
                                        }
                                    }
                                }
                            } else {
                                if (j3 == 0) {
                                    iArrCopyOfRange = Arrays.copyOfRange(iArrCopyOfRange, 1, i3);
                                } else {
                                    iArrCopyOfRange[length] = (int) j3;
                                }
                                return new C5408(iArrCopyOfRange, i2);
                            }
                        }
                    }
                }
            } else if (C2878.f9462) {
                if (C3690.f12684 <= 0) {
                }
            }
            C1826.m6301();
        }
        C3077.m10041();
        C3448.m11248();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5408 m16083(int i) {
        if (super.m6020() <= i) {
            return this;
        }
        int i2 = i + 31;
        if (C2834.f9334 > 0 && C3448.m11248() == 0) {
            int i3 = i2 >>> 5;
            if (C1564.f5401 <= 0) {
                if (C3492.f12043 > 0) {
                    C0950.m3785();
                    C2288.m7767();
                }
            } else {
                int[] iArr = new int[i3];
                int[] iArr2 = this.f5785;
                int length = iArr2.length;
                if (C11235.f35427 >= 0) {
                    C4282.m13644();
                    if (C2375.f7641 <= 0) {
                        C3077.m10041();
                        if (C0950.m3785() != 0) {
                            if (C3492.f12043 > 0) {
                                C0950.m3785();
                                C2288.m7767();
                            }
                        }
                    }
                } else {
                    C2702.m8882(iArr2, length - i3, iArr, 0, i3);
                    if (C0862.f3233 != 0) {
                        C4282.m13644();
                        if (C2375.f7641 <= 0) {
                            C3077.m10041();
                            if (C0950.m3785() != 0) {
                                if (C3492.f12043 > 0) {
                                    C0950.m3785();
                                    C2288.m7767();
                                }
                            }
                        }
                    } else {
                        int i4 = i3 << 5;
                        if (C0773.m3161() != 0) {
                            C4282.m13644();
                            if (C2375.f7641 <= 0) {
                                C3077.m10041();
                                if (C0950.m3785() != 0) {
                                    if (C3492.f12043 > 0) {
                                        C0950.m3785();
                                        C2288.m7767();
                                    }
                                }
                            }
                        } else {
                            int i5 = i4 - i;
                            long j = iArr[0];
                            if (C0862.f3233 != 0) {
                                C4282.m13644();
                                if (C2375.f7641 <= 0) {
                                }
                            } else {
                                if (C0950.f3488 < 0) {
                                    int i6 = 32 - i5;
                                    if (C0487.f2131 > 0) {
                                        long j2 = j & ((1 << i6) - 1);
                                        if (C3033.f9831 < 0) {
                                            int i7 = (int) j2;
                                            iArr[0] = i7;
                                            return i7 == 0 ? new C5408(1, iArr) : new C5408(iArr, 1);
                                        }
                                    }
                                }
                                C0950.m3785();
                                C2288.m7767();
                            }
                            C3077.m10041();
                            if (C0950.m3785() != 0) {
                                if (C3492.f12043 > 0) {
                                    C0950.m3785();
                                    C2288.m7767();
                                }
                            }
                        }
                    }
                }
            }
        }
        C1519.m5403();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x003d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0042  */
    /* JADX WARN: Code duplicated, block: B:37:0x004a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0054  */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m16131() {
        int iM6020 = super.m6020();
        if (C20932.m47848() == 0 && RunnableC0334.f1808 > 0) {
            if (C1343.m4943()) {
                if (!RunnableC1848.f6235) {
                    if (C0950.f3488 >= 0 || AbstractC0641.m2813() <= 0) {
                        C4282.m13644();
                        if (!C1519.m5403()) {
                            C0862.m3503();
                        }
                    } else if (C23916.m53419() == 0) {
                        if (C3998.f13671 == 0) {
                            if (C2834.f9334 > 0) {
                                if (C0862.f3233 == 0) {
                                    return (iM6020 / 8) + 1;
                                }
                                if (C3077.f9998) {
                                    RunnableC1848.m6360();
                                    if (C1783.f6087 <= 0) {
                                        C4282.m13644();
                                        if (!C1519.m5403()) {
                                            C0862.m3503();
                                        }
                                    }
                                }
                            }
                        } else {
                            C4282.m13644();
                            if (!C1519.m5403()) {
                                C0862.m3503();
                            }
                        }
                    }
                } else if (C3077.f9998) {
                    RunnableC1848.m6360();
                    if (C1783.f6087 <= 0) {
                        C4282.m13644();
                        if (!C1519.m5403()) {
                            C0862.m3503();
                        }
                    }
                }
            }
        } else if (C3077.f9998) {
            RunnableC1848.m6360();
            if (C1783.f6087 <= 0) {
                C4282.m13644();
                if (!C1519.m5403()) {
                    C0862.m3503();
                }
            }
        }
        C1783.m6232();
        C3734.m12152();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0091  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5408 m16089(long j) {
        if (!RunnableC3646.f12471) {
            if (C23916.f77426 <= 0) {
                C2834.m9344();
                if (C0773.f2792 > 0) {
                    if (!C2354.m7983()) {
                        C2023.m6964();
                        C0862.m3503();
                    }
                }
            } else if (C3492.f12043 > 0) {
                if (AbstractC0641.f2496 < 0) {
                    if (C1564.m5509() > 0) {
                        if (j == 0) {
                            return C11373.f35800;
                        }
                        if (j > 0 && j <= 16) {
                            return C11373.f35794[(int) j];
                        }
                        if (j >= 0 || j < -16) {
                            C5408 c5408 = new C5408();
                            if (j < 0) {
                                j = -j;
                                c5408.f5783 = -1;
                            } else {
                                c5408.f5783 = 1;
                            }
                            long j2 = j >>> 32;
                            if (AbstractC3624.f12429 > 0) {
                                int i = (int) j2;
                                if (i == 0) {
                                    int[] iArr = new int[1];
                                    c5408.f5785 = iArr;
                                    if (C2419.m8174() < 0) {
                                        iArr[0] = (int) j;
                                        return c5408;
                                    }
                                } else {
                                    int[] iArr2 = new int[2];
                                    if (C0269.f1558 > 0) {
                                        c5408.f5785 = iArr2;
                                        if (C3033.f9831 < 0) {
                                            iArr2[0] = i;
                                            iArr2[1] = (int) j;
                                            return c5408;
                                        }
                                    }
                                }
                                if (C2310.f7472 < 0) {
                                }
                            }
                        } else {
                            C5408[] c5408Arr = C11373.f35796;
                            long j3 = -j;
                            if (C0950.f3488 < 0) {
                                return c5408Arr[(int) j3];
                            }
                        }
                        C3099.m10095();
                        if (C4238.f15451 >= 0) {
                        }
                    }
                    C2834.m9344();
                    if (C0773.f2792 > 0) {
                    }
                } else {
                    C3099.m10095();
                    if (C4238.f15451 >= 0) {
                        C2834.m9344();
                        if (C0773.f2792 > 0) {
                        }
                    }
                }
                if (!C2354.m7983()) {
                    C2023.m6964();
                    C0862.m3503();
                }
            } else {
                C2023.m6964();
                C0862.m3503();
            }
        }
        C1783.m6232();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x003c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0044  */
    /* JADX WARN: Code duplicated, block: B:40:0x0049  */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m16129() {
        int[] iArr = this.f5785;
        if (RunnableC1848.f6235) {
            if (C2354.f7599 < 0) {
                C1542.m5459();
                C1343.m4943();
            }
        } else if (C0862.f3233 != 0) {
            C1542.m5459();
            C1343.m4943();
        } else if (!C3077.f9998) {
            C2288.m7767();
            if (C4282.f15546 > 0) {
                if (C2354.f7599 < 0) {
                    C1542.m5459();
                    C1343.m4943();
                }
            }
        } else if (C2966.f9654 < 0) {
            if (C1519.f5300 >= 0) {
                C2288.m7767();
                if (C4282.f15546 > 0) {
                    if (C2354.f7599 < 0) {
                        C1542.m5459();
                        C1343.m4943();
                    }
                }
            } else if (C3734.m12152() < 0) {
                if (C3448.f11240 < 0) {
                    if (C4282.f15546 > 0) {
                        if (C1783.m6232()) {
                            if (C3033.f9831 < 0) {
                                if (iArr.length > 67108864 || (iArr.length == 67108864 && iArr[0] < 0)) {
                                    throw new RuntimeException();
                                }
                                return;
                            }
                            if (C20932.f66974 > 0) {
                                C2288.m7767();
                                if (C4282.f15546 > 0) {
                                    if (C2354.f7599 < 0) {
                                        C1542.m5459();
                                        C1343.m4943();
                                    }
                                }
                            }
                        } else if (C2354.f7599 < 0) {
                            C1542.m5459();
                            C1343.m4943();
                        }
                    }
                } else {
                    C1542.m5459();
                    C1343.m4943();
                }
            } else if (C20932.f66974 > 0) {
                C2288.m7767();
                if (C4282.f15546 > 0) {
                    if (C2354.f7599 < 0) {
                        C1542.m5459();
                        C1343.m4943();
                    }
                }
            }
        }
        C2966.m9664();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m16093(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = iArr3;
        if (C3779.f12953 > 0 && C1826.f6190 > 0) {
            if (RunnableC0334.f1808 <= 0) {
                C1783.m6232();
                if (C2966.f9654 >= 0) {
                    C2310.m7813();
                    if (C4238.m13540() <= 0) {
                        RunnableC1848.m6360();
                        if (C1519.f5300 < 0) {
                        }
                    }
                }
            } else {
                int i3 = i - 1;
                int i4 = i2 - 1;
                if (iArr4 == null || iArr4.length < i + i2) {
                    iArr4 = new int[i + i2];
                }
                int i5 = i2 + i3;
                int i6 = i4;
                long j = 0;
                while (true) {
                    if (i6 >= 0) {
                        long j2 = ((long) iArr2[i6]) & 4294967295L;
                        long j3 = iArr[i3];
                        if (C1080.f3865 < 0) {
                            long j4 = (j2 * (4294967295L & j3)) + j;
                            if (C2485.m8357() > 0) {
                                iArr4[i5] = (int) j4;
                                j = j4 >>> 32;
                                if (C3779.m12264()) {
                                    i6--;
                                    i5--;
                                }
                            }
                        }
                    } else {
                        iArr4[i3] = (int) j;
                        for (int i7 = i - 2; i7 >= 0; i7--) {
                            int i8 = i2 + i7;
                            int i9 = i4;
                            long j5 = 0;
                            while (true) {
                                if (i9 >= 0) {
                                    long j6 = ((long) iArr2[i9]) & 4294967295L;
                                    int i10 = iArr[i7];
                                    if (C2485.f7950 != 0) {
                                        C2310.m7813();
                                        if (C4238.m13540() <= 0) {
                                        }
                                    } else {
                                        long j7 = ((long) i10) & 4294967295L;
                                        if (!C2023.f6737) {
                                            long j8 = j6 * j7;
                                            long j9 = ((long) iArr4[i8]) & 4294967295L;
                                            if (C2878.m9491() > 0) {
                                                long j10 = j8 + j9 + j5;
                                                iArr4[i8] = (int) j10;
                                                j5 = j10 >>> 32;
                                                if (C1542.f5343 > 0) {
                                                    i9--;
                                                    i8--;
                                                }
                                            }
                                        }
                                        C1783.m6232();
                                        if (C2966.f9654 >= 0) {
                                            C2310.m7813();
                                            if (C4238.m13540() <= 0) {
                                            }
                                        }
                                    }
                                    RunnableC1848.m6360();
                                    if (C1519.f5300 < 0) {
                                    }
                                } else {
                                    iArr4[i7] = (int) j5;
                                }
                            }
                        }
                        return iArr4;
                    }
                }
            }
            C4282.m13644();
            C3077.m10041();
        } else {
            RunnableC1848.m6360();
            if (C1519.f5300 < 0) {
                C4282.m13644();
                C3077.m10041();
            }
        }
        C3033.m9845();
        RunnableC3646.m11813();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x005c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0064  */
    /* JADX WARN: Code duplicated, block: B:48:0x0069  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0059, code lost:
    
        if (l.C2354.m7983() == false) goto L49;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C5408 m16112(l.C5408 r4) {
        /*
            r3 = this;
            boolean r0 = l.C3779.m12264()
            if (r0 != 0) goto L8
            goto L64
        L8:
            int r0 = l.AbstractC3624.f12429
            if (r0 > 0) goto Ld
            goto L5c
        Ld:
            int r0 = l.C11235.f35427
            if (r0 < 0) goto L12
            goto L6c
        L12:
            boolean r0 = l.C2354.m7983()
            if (r0 != 0) goto L19
            goto L5c
        L19:
            int r0 = l.C3448.m11248()
            if (r0 == 0) goto L20
            goto L52
        L20:
            int r0 = l.C1826.f6190
            if (r0 > 0) goto L25
            goto L64
        L25:
            int r0 = l.C1519.f5300
            if (r0 < 0) goto L2a
            goto L64
        L2a:
            boolean r0 = l.C1783.m6232()
            if (r0 != 0) goto L31
            goto L64
        L31:
            int r0 = r4.f5783
            if (r0 != 0) goto L36
            return r3
        L36:
            int r1 = r3.f5783
            if (r1 != 0) goto L3f
            l.ۚۙۚ r4 = r4.m16124()
            return r4
        L3f:
            if (r0 == r1) goto L7e
            l.ۚۙۚ r0 = new l.ۚۙۚ
            int[] r1 = r3.f5785
            int r2 = l.C2419.f7754
            if (r2 < 0) goto L4a
            goto L5c
        L4a:
            int[] r4 = r4.f5785
            boolean r2 = l.C2288.m7767()
            if (r2 == 0) goto L74
        L52:
            l.RunnableC3646.m11813()
            boolean r4 = l.C2354.m7983()
            if (r4 != 0) goto L5c
            goto L6c
        L5c:
            l.C3033.m9845()
            boolean r4 = l.C2878.f9462
            if (r4 != 0) goto L64
            goto L69
        L64:
            int r4 = l.C0950.f3488
            if (r4 < 0) goto L69
            goto L6c
        L69:
            l.C23916.m53419()
        L6c:
            l.C2834.m9344()
            l.C3033.m9845()
            r4 = 0
            return r4
        L74:
            int[] r4 = m16096(r1, r4)
            int r1 = r3.f5783
            r0.<init>(r4, r1)
            return r0
        L7e:
            int r0 = r3.m16130(r4)
            if (r0 != 0) goto L87
            l.ۚۙۚ r4 = l.C11373.f35800
            return r4
        L87:
            if (r0 <= 0) goto L92
            int[] r1 = r3.f5785
            int[] r4 = r4.f5785
            int[] r4 = m16107(r1, r4)
            goto L9a
        L92:
            int[] r4 = r4.f5785
            int[] r1 = r3.f5785
            int[] r4 = m16107(r4, r1)
        L9a:
            int[] r4 = m16095(r4)
            l.ۚۙۚ r1 = new l.ۚۙۚ
            int r2 = r3.f5783
            if (r0 != r2) goto La6
            r0 = 1
            goto La7
        La6:
            r0 = -1
        La7:
            r1.<init>(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5408.m16112(l.ۚۙۚ):l.ۚۙۚ");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0051  */
    /* JADX WARN: Code duplicated, block: B:42:0x005b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0060  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m16105(int i, int i2, int[] iArr) {
        if (C2287.f7432 >= 0) {
            C0487.m2356();
            if (C4238.m13540() <= 0) {
                C3033.m9845();
                C3734.m12152();
            }
        } else if (C1343.f4799 == 0) {
            if (C2023.f6737) {
                C0487.m2356();
                if (C4238.m13540() <= 0) {
                    C3033.m9845();
                    C3734.m12152();
                }
            } else if (!C17202.m40372() || C0619.m2763()) {
                AbstractC3624.m11755();
                if (C3033.f9831 < 0) {
                    C0487.m2356();
                    if (C4238.m13540() <= 0) {
                        C3033.m9845();
                        C3734.m12152();
                    }
                }
            } else {
                if (i == 0 || i2 == 0) {
                    return;
                }
                int i3 = 32 - i2;
                if (C23916.f77426 > 0) {
                    int i4 = 0;
                    if (C23916.f77426 <= 0) {
                        C3033.m9845();
                        C3734.m12152();
                    } else {
                        int i5 = iArr[0];
                        int i6 = i - 1;
                        while (true) {
                            if (i4 >= i6) {
                                iArr[i6] = iArr[i6] << i2;
                                return;
                            }
                            int i7 = i4 + 1;
                            if (AbstractC0116.f1064 <= 0) {
                                break;
                            }
                            int i8 = iArr[i7];
                            if (C2966.f9654 < 0) {
                                int i9 = i5 << i2;
                                if (C2966.f9654 >= 0) {
                                    break;
                                }
                                iArr[i4] = i9 | (i8 >>> i3);
                                i4 = i7;
                                i5 = i8;
                            }
                        }
                        AbstractC3624.m11755();
                        if (C3033.f9831 < 0) {
                            C0487.m2356();
                            if (C4238.m13540() <= 0 && C4282.f15546 <= 0) {
                                C3033.m9845();
                                C3734.m12152();
                            }
                        }
                    }
                }
            }
        }
        C13473.m33144();
        C3448.m11248();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0050  */
    /* JADX WARN: Code duplicated, block: B:44:0x0055  */
    /* JADX WARN: Code duplicated, block: B:47:0x005d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5408 m16113(C5408 c5408) {
        int[] iArrM16107;
        if (C2834.m9344() < 0 && C3492.f12043 > 0) {
            if (!C2966.m9664()) {
                if (C0269.f1558 > 0) {
                    if (C1343.f4799 != 0) {
                        AbstractC0641.m2813();
                        if (!RunnableC3646.f12471) {
                        }
                    }
                }
                C2354.m7983();
            } else if (!RunnableC1848.f6235 && C2287.m7745() > 0) {
                if (C2419.f7754 < 0) {
                    if (C1826.f6190 <= 0) {
                        AbstractC0641.m2813();
                        if (!RunnableC3646.f12471) {
                            C2354.m7983();
                        }
                    } else if (AbstractC3624.f12429 <= 0) {
                        if (C1343.f4799 != 0) {
                            C2354.m7983();
                        } else {
                            AbstractC0641.m2813();
                            if (!RunnableC3646.f12471) {
                                C2354.m7983();
                            }
                        }
                    } else {
                        int i = c5408.f5783;
                        if (i == 0) {
                            return this;
                        }
                        int i2 = this.f5783;
                        if (i2 == 0) {
                            return c5408;
                        }
                        if (i == i2) {
                            int[] iArr = this.f5785;
                            if (C2419.f7754 < 0) {
                                int[] iArr2 = c5408.f5785;
                                if (C1146.m4231()) {
                                    return new C5408(m16096(iArr, iArr2), this.f5783);
                                }
                                if (C0269.f1558 > 0) {
                                    if (C1343.f4799 != 0) {
                                        AbstractC0641.m2813();
                                        if (!RunnableC3646.f12471) {
                                        }
                                    }
                                }
                                C2354.m7983();
                            }
                        } else {
                            int iM16130 = m16130(c5408);
                            if (iM16130 == 0) {
                                return C11373.f35800;
                            }
                            if (iM16130 > 0) {
                                iArrM16107 = m16107(this.f5785, c5408.f5785);
                            } else {
                                iArrM16107 = m16107(c5408.f5785, this.f5785);
                            }
                            return new C5408(m16095(iArrM16107), iM16130 == this.f5783 ? 1 : -1);
                        }
                    }
                } else if (C1343.f4799 != 0) {
                    C2354.m7983();
                } else {
                    AbstractC0641.m2813();
                    if (!RunnableC3646.f12471) {
                        C2354.m7983();
                    }
                }
            } else {
                C2354.m7983();
            }
        } else if (C1343.f4799 != 0) {
            C2354.m7983();
        } else {
            AbstractC0641.m2813();
            if (!RunnableC3646.f12471) {
                C2354.m7983();
            }
        }
        C0862.m3503();
        AbstractC0116.m1243();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x003a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0042  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16092(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        if (C2310.f7472 < 0) {
            if (C0773.f2792 > 0) {
                if (!C2878.f9462 && C4282.m13644()) {
                    if (C2702.f8586 <= 0) {
                        RunnableC3055.m9933();
                        if (C11235.f35427 >= 0) {
                        }
                    } else if (C1343.f4799 == 0) {
                        if (RunnableC0334.f1808 > 0 && C17202.f56030 && C3492.f12043 > 0) {
                            if (C17202.f56030) {
                                if (i % 2 != 0) {
                                    throw new IllegalArgumentException();
                                }
                                if (i < 1) {
                                    throw new IllegalArgumentException();
                                }
                                if (i > iArr.length || i > iArr2.length || i > iArr3.length || (iArr4 != null && i > iArr4.length)) {
                                    throw new IllegalArgumentException();
                                }
                                return;
                            }
                            if (C0773.m3161() == 0) {
                                RunnableC3055.m9933();
                                if (C11235.f35427 >= 0) {
                                }
                            }
                        }
                    }
                    if (C1321.f4751 < 0) {
                    }
                } else if (C1321.f4751 < 0) {
                }
            }
            C3033.m9845();
            AbstractC3624.m11755();
        } else if (C0773.m3161() == 0) {
            RunnableC3055.m9933();
            if (C11235.f35427 >= 0) {
                if (C1321.f4751 < 0) {
                    C3033.m9845();
                    AbstractC3624.m11755();
                }
            }
        }
        C2878.m9491();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097 A[LOOP:1: B:47:0x007e->B:55:0x0097, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0095 -> B:46:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:47:0x007e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int[] m16107(int[] r14, int[] r15) {
        /*
            int r0 = l.C2419.f7754
            if (r0 < 0) goto L5
            goto L3f
        L5:
            int r0 = r14.length
            boolean r1 = l.C2354.m7983()
            if (r1 != 0) goto Ld
            goto L69
        Ld:
            int[] r1 = new int[r0]
            int r2 = r15.length
            r3 = 0
            r5 = r3
        L13:
            r7 = 32
            if (r2 <= 0) goto L76
            int r0 = r0 + (-1)
            boolean r8 = l.C17202.f56030
            if (r8 != 0) goto L1e
            goto L5c
        L1e:
            r8 = r14[r0]
            boolean r9 = l.C2878.f9462
            if (r9 == 0) goto L26
            goto L8c
        L26:
            long r8 = (long) r8
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r12 = l.C2485.m8357()
            if (r12 > 0) goto L33
            goto L8c
        L33:
            long r8 = r8 & r10
            boolean r12 = l.C17202.f56030
            if (r12 != 0) goto L39
            goto L4f
        L39:
            int r2 = r2 + (-1)
            int r12 = l.C2966.f9654
            if (r12 < 0) goto L47
        L3f:
            l.C2702.m8876()
            int r14 = l.AbstractC3624.f12429
            if (r14 > 0) goto L4f
            goto L64
        L47:
            r12 = r15[r2]
            long r12 = (long) r12
            long r10 = r10 & r12
            int r12 = l.AbstractC0641.f2496
            if (r12 < 0) goto L57
        L4f:
            l.C2878.m9491()
            int r14 = l.RunnableC0334.f1808
            if (r14 > 0) goto L5c
            goto L64
        L57:
            long r8 = r8 - r10
            int r10 = l.C0950.f3488
            if (r10 < 0) goto L70
        L5c:
            l.C0773.m3161()
            int r14 = l.C1783.f6087
            if (r14 <= 0) goto L64
            goto L69
        L64:
            int r14 = l.C20932.f66974
            if (r14 <= 0) goto L69
            goto L8c
        L69:
            l.C0950.m3785()
            l.C2834.m9344()
            goto L8c
        L70:
            long r5 = r5 >> r7
            long r5 = r5 + r8
            int r7 = (int) r5
            r1[r0] = r7
            goto L13
        L76:
            long r5 = r5 >> r7
            r15 = 1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L7d
            goto L97
        L7d:
            r2 = 0
        L7e:
            if (r0 <= 0) goto L99
            if (r2 == 0) goto L99
            int r0 = r0 + (-1)
            r2 = r14[r0]
            int r3 = l.C1826.m6301()
            if (r3 < 0) goto L91
        L8c:
            l.C2419.m8174()
            r14 = 0
            return r14
        L91:
            int r2 = r2 - r15
            r1[r0] = r2
            r3 = -1
            if (r2 != r3) goto L7d
        L97:
            r2 = 1
            goto L7e
        L99:
            if (r0 <= 0) goto La2
            int r0 = r0 + (-1)
            r15 = r14[r0]
            r1[r0] = r15
            goto L99
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5408.m16107(int[], int[]):int[]");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7 A[LOOP:0: B:67:0x00ba->B:71:0x00c7, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x00c5 -> B:66:0x00b9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:67:0x00ba
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m16096(int[] r17, int[] r18) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5408.m16096(int[], int[]):int[]");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x004a  */
    /* JADX WARN: Code duplicated, block: B:39:0x004f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0056  */
    /* JADX WARN: Code duplicated, block: B:45:0x005e  */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5408 m16132(int i) {
        if (C3033.f9831 >= 0) {
            AbstractC0116.m1243();
            if (C3077.f9998) {
                C0950.m3785();
            }
        } else if (C2878.f9462) {
            if (C1080.f3865 >= 0) {
                if (C1321.m4852()) {
                    AbstractC0116.m1243();
                    if (C3077.f9998) {
                        C0950.m3785();
                    }
                }
            }
        } else if (RunnableC1848.f6235) {
            if (C1321.m4852()) {
                AbstractC0116.m1243();
                if (C3077.f9998) {
                    C0950.m3785();
                }
            }
        } else if (C0487.f2131 > 0 && !C2023.f6737) {
            if (C0862.f3233 != 0) {
                C0950.m3785();
            } else if (C3690.m11987()) {
                if (C1080.f3865 >= 0) {
                    if (C1321.m4852()) {
                        AbstractC0116.m1243();
                        if (C3077.f9998) {
                            C0950.m3785();
                        }
                    }
                }
            } else if (C2023.m6964() > 0) {
                if (this.f5783 == 0) {
                    return C11373.f35800;
                }
                if (i <= 0) {
                    return i == 0 ? this : m16101(-i);
                }
                int[] iArr = this.f5785;
                if (C3033.m9845() <= 0) {
                    AbstractC0116.m1243();
                    if (C3077.f9998) {
                        C0950.m3785();
                    }
                } else {
                    int[] iArrM16106 = m16106(i, iArr);
                    if (C2354.m7983()) {
                        return new C5408(iArrM16106, this.f5783);
                    }
                    if (C1080.f3865 >= 0) {
                        if (C1321.m4852()) {
                            AbstractC0116.m1243();
                            if (C3077.f9998) {
                                C0950.m3785();
                            }
                        }
                    }
                }
            }
        } else if (C1080.f3865 >= 0) {
            if (C1321.m4852()) {
                AbstractC0116.m1243();
                if (C3077.f9998) {
                    C0950.m3785();
                }
            }
        }
        C2702.m8876();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x003a  */
    /* JADX WARN: Code duplicated, block: B:37:0x003f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0047  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5408 m16087(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (C3734.f12817 < 0) {
            if (C2878.f9462) {
                if (C0862.f3233 == 0) {
                    if (C2966.f9654 >= 0) {
                        C11235.m28309();
                        if (C0487.f2131 <= 0) {
                        }
                    }
                }
                C1783.m6232();
                if (!C1783.m6232()) {
                }
            } else if (C0862.m3503()) {
                if (C1826.f6190 <= 0) {
                    C11235.m28309();
                    if (C0487.f2131 <= 0) {
                        C1783.m6232();
                        if (!C1783.m6232()) {
                        }
                    }
                } else if (C2288.f7433 > 0) {
                    if (C2419.f7754 < 0) {
                        if (C1542.m5459() < 0) {
                            if (C1542.f5343 > 0) {
                                if (C0773.f2792 > 0) {
                                    if (C20932.f66974 > 0) {
                                        int[] iArr = this.f5785;
                                        int length = iArr.length;
                                        int i7 = i4 - length;
                                        if (i3 == 0) {
                                            i6 = -i7;
                                            i5 = (i2 - 1) - i7;
                                        } else {
                                            int i8 = (((i3 - 1) * i) + i2) - i7;
                                            i5 = (i + i8) - 1;
                                            i6 = i8;
                                        }
                                        if (i6 < 0) {
                                            i6 = 0;
                                        }
                                        if (i5 < 0) {
                                            return C11373.f35800;
                                        }
                                        int i9 = (i5 - i6) + 1;
                                        if (i9 <= 0) {
                                            return C11373.f35800;
                                        }
                                        if (i6 == 0 && i9 >= length) {
                                            return this.f5783 >= 0 ? this : m16124();
                                        }
                                        int[] iArr2 = new int[i9];
                                        C2702.m8882(iArr, i6, iArr2, 0, i9);
                                        return new C5408(m16095(iArr2), 1);
                                    }
                                    if (C0862.f3233 == 0) {
                                        if (C2966.f9654 >= 0) {
                                            C11235.m28309();
                                            if (C0487.f2131 <= 0) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (C2966.f9654 >= 0) {
                            C11235.m28309();
                            if (C0487.f2131 <= 0) {
                            }
                        }
                    } else {
                        C11235.m28309();
                        if (C0487.f2131 <= 0) {
                        }
                    }
                    C1783.m6232();
                    if (!C1783.m6232()) {
                    }
                } else {
                    C1783.m6232();
                    if (!C1783.m6232()) {
                    }
                }
            }
            C4238.m13540();
        } else {
            C4238.m13540();
        }
        C2288.m7767();
        C1783.m6232();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0054  */
    /* JADX WARN: Code duplicated, block: B:36:0x0059  */
    /* JADX WARN: Code duplicated, block: B:39:0x0061  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16084(int i, int i2, int i3, int[] iArr) {
        int i4;
        if (C1343.f4799 == 0) {
            if (C0950.f3488 < 0) {
                if (!C2878.f9462) {
                    if (C13473.m33144()) {
                        if (RunnableC3055.m9933() == 0) {
                            int length = iArr.length;
                            if (C1542.m5459() >= 0) {
                                C1542.m5459();
                                C3779.m12264();
                            } else {
                                int i5 = ((length - 1) - i2) - i;
                                if (C1519.f5300 >= 0) {
                                    C1542.m5459();
                                    C3779.m12264();
                                } else {
                                    long j = iArr[i5];
                                    if (C4238.f15451 >= 0) {
                                        C3734.m12152();
                                        if (RunnableC3646.m11813() != 0) {
                                        }
                                    } else {
                                        long j2 = j & 4294967295L;
                                        long j3 = 4294967295L & ((long) i3);
                                        if (C3998.f13671 == 0) {
                                            long j4 = j2 + j3;
                                            int i6 = (int) j4;
                                            if (C0773.m3161() == 0) {
                                                iArr[i5] = i6;
                                                if ((j4 >>> 32) == 0) {
                                                    return 0;
                                                }
                                                do {
                                                    i2--;
                                                    if (i2 < 0 || (i5 = i5 - 1) < 0) {
                                                        return 1;
                                                    }
                                                    i4 = iArr[i5] + 1;
                                                    iArr[i5] = i4;
                                                } while (i4 == 0);
                                                return 0;
                                            }
                                        }
                                    }
                                    if (C2834.f9334 > 0) {
                                        AbstractC3624.m11755();
                                        if (!C0619.f2439) {
                                            C1542.m5459();
                                            C3779.m12264();
                                        }
                                    }
                                }
                            }
                        }
                    } else if (C2834.f9334 > 0) {
                        AbstractC3624.m11755();
                        if (!C0619.f2439) {
                            C1542.m5459();
                            C3779.m12264();
                        }
                    }
                } else {
                    AbstractC3624.m11755();
                    if (!C0619.f2439) {
                        C1542.m5459();
                        C3779.m12264();
                    }
                }
            } else if (C2834.f9334 > 0) {
                AbstractC3624.m11755();
                if (!C0619.f2439) {
                    C1542.m5459();
                    C3779.m12264();
                }
            }
        } else {
            C1542.m5459();
            C3779.m12264();
        }
        C0950.m3785();
        C2288.m7767();
        return 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5408 m16116(C5408 c5408) {
        return m16090(c5408, false);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x019c  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5408 m16090(C5408 c5408, boolean z) {
        int i;
        int i2 = c5408.f5783;
        if (i2 == 0 || (i = this.f5783) == 0) {
            return C11373.f35800;
        }
        int[] iArr = this.f5785;
        int length = iArr.length;
        if (c5408 != this || length <= 20) {
            int[] iArr2 = c5408.f5785;
            int length2 = iArr2.length;
            if (length >= 80 && length2 >= 80) {
                if (length < 240 && length2 < 240) {
                    int iM8883 = (C2702.m8883(iArr.length, iArr2.length) + 1) / 2;
                    C5408 c5408M16102 = m16102(iM8883);
                    C5408 c5408M16100 = m16100(iM8883);
                    if (!C17202.f56030) {
                        C2023.m6964();
                        if (C3077.f9998) {
                            if (C4282.f15546 <= 0) {
                                if (AbstractC0116.f1064 > 0) {
                                }
                            }
                            C1343.m4943();
                            C3099.m10095();
                            return null;
                        }
                    } else {
                        C5408 c5408M16103 = c5408.m16102(iM8883);
                        C5408 c5408M16101 = c5408.m16100(iM8883);
                        C5408 c5408M16090 = c5408M16100.m16090(c5408M16101, false);
                        C5408 c5408M16091 = c5408M16102.m16090(c5408M16103, false);
                        C5408 c5408M5407 = C1519.m5407(c5408M16100, c5408M16102);
                        if (C13473.f42873 == 0) {
                            C5408 c5408M16092 = c5408M5407.m16090(RunnableC0334.m2064(c5408M16101, c5408M16103), false);
                            int i3 = iM8883 * 32;
                            C5408 c5408M16132 = c5408M16090.m16132(i3);
                            C5408 c5408M9347 = C2834.m9347(c5408M16092, c5408M16090);
                            if (!C3099.m10095()) {
                                C5408 c5408M2064 = RunnableC0334.m2064(C1519.m5407(c5408M16132, C2834.m9347(c5408M9347, c5408M16091)).m16132(i3), c5408M16091);
                                return this.f5783 != c5408.f5783 ? c5408M2064.m16124() : c5408M2064;
                            }
                        }
                        C1343.m4943();
                        C3099.m10095();
                        return null;
                    }
                    if (C3099.f10023 <= 0) {
                    }
                    C1343.m4943();
                    C3099.m10095();
                    return null;
                }
                if (!z) {
                    int iM16086 = m16086(iArr.length, iArr);
                    int[] iArr3 = c5408.f5785;
                    if (iM16086 + m16086(iArr3.length, iArr3) > 2147483648L) {
                        throw new RuntimeException();
                    }
                }
                int iM8884 = C2702.m8883(this.f5785.length, c5408.f5785.length);
                if (!C0619.m2763()) {
                    int i4 = (iM8884 + 2) / 3;
                    if (C3492.f12043 <= 0) {
                        if (C4282.f15546 <= 0) {
                            if (AbstractC0116.f1064 > 0) {
                            }
                        }
                        C1343.m4943();
                        C3099.m10095();
                        return null;
                    }
                    int i5 = iM8884 - (i4 * 2);
                    C5408 c5408M16087 = m16087(i4, i5, 0, iM8884);
                    C5408 c5408M16088 = m16087(i4, i5, 1, iM8884);
                    C5408 c5408M16089 = m16087(i4, i5, 2, iM8884);
                    C5408 c5408M160810 = c5408.m16087(i4, i5, 0, iM8884);
                    C5408 c5408M160811 = c5408.m16087(i4, i5, 1, iM8884);
                    if (C3099.m10095()) {
                        C4238.m13540();
                        if (!RunnableC3646.f12471) {
                        }
                        C1343.m4943();
                        C3099.m10095();
                        return null;
                    }
                    C5408 c5408M160812 = c5408.m16087(i4, i5, 2, iM8884);
                    C5408 c5408M16093 = c5408M16089.m16090(c5408M160812, true);
                    C5408 c5408M2065 = RunnableC0334.m2064(c5408M16087, c5408M16089);
                    C5408 c5408M5408 = C1519.m5407(c5408M160810, c5408M160812);
                    C5408 c5408M16094 = C2834.m9347(c5408M2065, c5408M16088).m16090(C3448.m11258(c5408M5408, c5408M160811), true);
                    C5408 c5408M5409 = C1519.m5407(c5408M2065, c5408M16088);
                    C5408 c5408M54010 = C1519.m5407(c5408M5408, c5408M160811);
                    if (C0773.f2792 <= 0) {
                        if (C4282.f15546 <= 0) {
                            if (AbstractC0116.f1064 > 0) {
                            }
                        }
                        C1343.m4943();
                        C3099.m10095();
                        return null;
                    }
                    C5408 c5408M16095 = c5408M5409.m16090(c5408M54010, true);
                    C5408 c5408M16096 = C2834.m9347(RunnableC0334.m2064(c5408M5409, c5408M16087).m16132(1), c5408M16089).m16090(C2834.m9347(RunnableC0334.m2064(c5408M54010, c5408M160810).m16132(1), c5408M160812), true);
                    C5408 c5408M16097 = c5408M16087.m16090(c5408M160810, true);
                    C5408 c5408M16110 = C2834.m9347(c5408M16096, c5408M16094).m16110();
                    C5408 c5408M16127 = C2834.m9347(c5408M16095, c5408M16094).m16127(1);
                    C5408 c5408M11258 = C3448.m11258(c5408M16095, c5408M16093);
                    C5408 c5408M16128 = C2834.m9347(c5408M16110, c5408M11258).m16127(1);
                    if (!C1343.m4943()) {
                        if (C4282.f15546 <= 0) {
                        }
                        C1343.m4943();
                        C3099.m10095();
                        return null;
                    }
                    C5408 c5408M11259 = C3448.m11258(C3448.m11258(c5408M11258, c5408M16127), c5408M16097);
                    C5408 c5408M112510 = C3448.m11258(c5408M16128, c5408M16097.m16132(1));
                    C5408 c5408M112511 = C3448.m11258(c5408M16127, c5408M112510);
                    if (!RunnableC3646.f12471) {
                        int i6 = i4 * 32;
                        C5408 c5408M2066 = RunnableC0334.m2064(RunnableC0334.m2064(c5408M16097.m16132(i6), c5408M112510).m16132(i6), c5408M11259);
                        if (C3033.f9831 < 0) {
                            C5408 c5408M54011 = C1519.m5407(C1519.m5407(c5408M2066.m16132(i6), c5408M112511).m16132(i6), c5408M16093);
                            return this.f5783 != c5408.f5783 ? c5408M54011.m16124() : c5408M54011;
                        }
                    }
                    C1343.m4943();
                    C3099.m10095();
                    return null;
                    if (AbstractC0116.f1064 > 0) {
                    }
                    C1343.m4943();
                    C3099.m10095();
                    return null;
                    if (C17202.m40372()) {
                        if (AbstractC0116.f1064 > 0) {
                        }
                        C1343.m4943();
                        C3099.m10095();
                        return null;
                    }
                    C2023.m6964();
                    if (C3077.f9998) {
                        if (C4282.f15546 <= 0) {
                            if (AbstractC0116.f1064 > 0) {
                            }
                        }
                        C1343.m4943();
                        C3099.m10095();
                        return null;
                    }
                } else {
                    if (C17202.m40372()) {
                        if (AbstractC0116.f1064 > 0) {
                        }
                        C1343.m4943();
                        C3099.m10095();
                        return null;
                    }
                    C2023.m6964();
                    if (C3077.f9998) {
                        if (C4282.f15546 <= 0) {
                            if (AbstractC0116.f1064 > 0) {
                            }
                        }
                        C1343.m4943();
                        C3099.m10095();
                        return null;
                    }
                }
                if (C3099.f10023 <= 0) {
                }
                C1343.m4943();
                C3099.m10095();
                return null;
                if (C2419.m8174() < 0) {
                    C2287.m7745();
                    RunnableC1848.m6360();
                } else {
                    C2287.m7745();
                    if (C2966.f9654 >= 0) {
                        C2287.m7745();
                        RunnableC1848.m6360();
                    }
                }
                C1343.m4943();
                C3099.m10095();
                return null;
            }
            int i7 = i == i2 ? 1 : -1;
            if (iArr2.length == 1) {
                return m16088(iArr2[0], i7, iArr);
            }
            if (iArr.length == 1) {
                return m16088(iArr[0], i7, iArr2);
            }
            return new C5408(m16095(m16093(length, length2, iArr, iArr2, (int[]) null)), i7);
        }
        return m16091(false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x004c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0054  */
    /* JADX WARN: Code duplicated, block: B:46:0x0063  */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private C5408 m16102(int i) {
        if (AbstractC0116.f1064 <= 0) {
            C0619.m2763();
            C2702.m8876();
        } else if (C11235.m28309() == 0) {
            if (C2878.f9462 || C4282.f15546 <= 0) {
                if (C2834.f9334 > 0) {
                    C0619.m2763();
                    C2702.m8876();
                }
            } else if (C3998.f13671 == 0) {
                if (C2354.f7599 < 0) {
                    int[] iArr = this.f5785;
                    int length = iArr.length;
                    if (length <= i) {
                        return this.f5783 >= 0 ? this : m16124();
                    }
                    int[] iArr2 = new int[i];
                    int i2 = length - i;
                    if (C0862.f3233 == 0) {
                        if (AbstractC0641.f2496 < 0) {
                            C2288.m7765(iArr, i2, iArr2, 0, i);
                            if (C1343.m4943()) {
                                int[] iArrM16095 = m16095(iArr2);
                                if (RunnableC0334.f1808 > 0) {
                                    return new C5408(iArrM16095, 1);
                                }
                                C0619.m2763();
                                C2702.m8876();
                            } else if (C0862.f3233 == 0) {
                                RunnableC3055.m9933();
                                if (C3099.f10023 <= 0) {
                                    if (C2834.f9334 > 0) {
                                        C0619.m2763();
                                        C2702.m8876();
                                    }
                                }
                            }
                        } else {
                            RunnableC3055.m9933();
                            if (C3099.f10023 <= 0) {
                                if (C2834.f9334 > 0) {
                                    C0619.m2763();
                                    C2702.m8876();
                                }
                            }
                        }
                    }
                } else {
                    C0619.m2763();
                    C2702.m8876();
                }
            }
        }
        AbstractC0116.m1243();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (l.C3734.f12817 < 0) goto L63;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] m16094(int r11, int[] r12, int[] r13) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5408.m16094(int, int[], int[]):int[]");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0058  */
    /* JADX WARN: Code duplicated, block: B:46:0x005f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0064  */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C5408 m16127(int i) {
        if (RunnableC3055.f9898 < 0 && C23916.m53419() == 0) {
            if (C2288.f7433 <= 0) {
                if (AbstractC3624.m11755() != 0) {
                    C1519.m5403();
                    C3690.m11987();
                } else {
                    C1519.m5403();
                    C3690.m11987();
                }
            } else if (C2288.m7767() || C3779.f12953 <= 0) {
                C1519.m5403();
                C3690.m11987();
            } else if (C3099.f10023 <= 0) {
                RunnableC1848.m6360();
                if (C4238.f15451 < 0) {
                    if (AbstractC3624.m11755() != 0) {
                        C1519.m5403();
                        C3690.m11987();
                    } else {
                        C1519.m5403();
                        C3690.m11987();
                    }
                }
            } else if (!C0619.m2763()) {
                if (C0619.m2763()) {
                    C1519.m5403();
                    C3690.m11987();
                } else {
                    if (this.f5783 == 0) {
                        return C11373.f35800;
                    }
                    if (i > 0) {
                        return m16101(i);
                    }
                    if (i == 0) {
                        return this;
                    }
                    int[] iArr = this.f5785;
                    if (C20932.f66974 <= 0) {
                        if (AbstractC3624.m11755() != 0 || C3998.f13671 != 0) {
                            C1519.m5403();
                            C3690.m11987();
                        }
                    } else {
                        int i2 = -i;
                        if (!C2878.f9462) {
                            return new C5408(m16106(i2, iArr), this.f5783);
                        }
                        RunnableC1848.m6360();
                        if (C4238.f15451 < 0) {
                            if (AbstractC3624.m11755() != 0) {
                                C1519.m5403();
                                C3690.m11987();
                            } else {
                                C1519.m5403();
                                C3690.m11987();
                            }
                        }
                    }
                }
            }
        } else {
            C1519.m5403();
            C3690.m11987();
        }
        C3077.m10041();
        C4238.m13540();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0043  */
    /* JADX WARN: Code duplicated, block: B:37:0x0056  */
    /* JADX WARN: Code duplicated, block: B:40:0x005d  */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C5408 m16100(int i) {
        if (C3690.m11987() || C13473.f42873 != 0) {
            if (C2310.f7472 < 0) {
                C3077.m10041();
                C1343.m4943();
            }
        } else if (C2702.f8586 > 0) {
            if (C4238.m13540() > 0) {
                if (AbstractC0116.m1243() != 0) {
                    if (C2310.f7472 < 0) {
                    }
                } else {
                    if (C3448.f11240 < 0) {
                        int[] iArr = this.f5785;
                        int length = iArr.length;
                        if (length <= i) {
                            return C11373.f35800;
                        }
                        int i2 = length - i;
                        int[] iArr2 = new int[i2];
                        if (C1783.m6232()) {
                            if (C0950.f3488 < 0) {
                                C2702.m8882(iArr, 0, iArr2, 0, i2);
                                if (C23916.f77426 > 0) {
                                    int[] iArrM16095 = m16095(iArr2);
                                    if (C1343.m4943()) {
                                        return new C5408(iArrM16095, 1);
                                    }
                                } else if (C0619.m2763()) {
                                }
                                if (C1343.m4943()) {
                                }
                            }
                        } else if (C1343.m4943()) {
                        }
                    } else if (C0619.m2763()) {
                        if (C1343.m4943()) {
                        }
                    }
                    if (C2310.f7472 < 0) {
                    }
                }
            }
            C3077.m10041();
            C1343.m4943();
        }
        AbstractC0116.m1243();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C5408 m16110() {
        int[] iArr = this.f5785;
        if (RunnableC1848.f6235) {
            C2310.m7813();
            C3492.m11488();
        } else {
            int length = iArr.length;
            if (RunnableC3646.f12471) {
                if (C3734.m12152() < 0) {
                    C2310.m7813();
                    C3492.m11488();
                }
            } else {
                int[] iArr2 = new int[length];
                if (!C0619.f2439) {
                    int i = length - 1;
                    long j = 0;
                    while (true) {
                        if (i >= 0) {
                            int i2 = this.f5785[i];
                            if (C2287.f7432 < 0) {
                                long j2 = i2;
                                if (C2375.f7641 > 0) {
                                    if (C3734.f12817 < 0) {
                                        long j3 = j2 & 4294967295L;
                                        long j4 = j3 - j;
                                        if (C0269.f1558 > 0) {
                                            j = j > j3 ? 1L : 0L;
                                            long j5 = 4294967295L & (j4 * 2863311531L);
                                            if (C2834.f9334 > 0) {
                                                int i3 = (int) j5;
                                                if (C3779.m12264()) {
                                                    iArr2[i] = i3;
                                                    if (j5 >= 1431655766) {
                                                        j = j5 >= 2863311531L ? j + 2 : 1 + j;
                                                    }
                                                    i--;
                                                }
                                            }
                                        }
                                    }
                                    if (RunnableC3055.f9898 >= 0) {
                                    }
                                }
                                C2310.m7813();
                                C3492.m11488();
                            }
                        } else {
                            int[] iArrM16095 = m16095(iArr2);
                            if (C1321.f4751 < 0) {
                                return new C5408(iArrM16095, this.f5783);
                            }
                        }
                        RunnableC1848.m6360();
                        if (C2375.m8065() <= 0) {
                            C2310.m7813();
                            C3492.m11488();
                        } else if (C3734.m12152() < 0) {
                            C2310.m7813();
                            C3492.m11488();
                        }
                    }
                }
            }
        }
        C3077.m10041();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x005d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x006d  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m16130(C5408 c5408) {
        if (C1826.m6301() >= 0 || C11235.m28309() != 0) {
            RunnableC1848.m6360();
            if (RunnableC0334.f1808 > 0) {
                C13473.m33144();
                if (C3779.f12953 > 0) {
                    C1783.m6232();
                    C2287.m7745();
                }
            }
        } else if (C2288.f7433 <= 0 || RunnableC3646.f12471) {
            C1783.m6232();
            C2287.m7745();
        } else if (C3033.f9831 >= 0) {
            C13473.m33144();
            if (C3779.f12953 > 0) {
                C1783.m6232();
                C2287.m7745();
            }
        } else if (C2485.f7950 == 0) {
            int[] iArr = this.f5785;
            if (!C0619.f2439) {
                int length = iArr.length;
                if (C3033.f9831 < 0) {
                    int[] iArr2 = c5408.f5785;
                    int length2 = iArr2.length;
                    if (length < length2) {
                        return -1;
                    }
                    if (length > length2) {
                        return 1;
                    }
                    for (int i = 0; i < length; i++) {
                        int i2 = iArr[i];
                        int i3 = iArr2[i];
                        if (i2 != i3) {
                            long j = i2;
                            if (C4282.f15546 <= 0) {
                                C13473.m33144();
                                if (C3779.f12953 > 0) {
                                }
                            } else {
                                long j2 = j & 4294967295L;
                                if (C13473.m33144()) {
                                    return j2 < (4294967295L & ((long) i3)) ? -1 : 1;
                                }
                            }
                        }
                    }
                    return 0;
                }
                if (C3033.m9845() > 0) {
                    RunnableC1848.m6360();
                    if (RunnableC0334.f1808 > 0) {
                        C13473.m33144();
                        if (C3779.f12953 > 0) {
                        }
                    }
                }
            }
            C1783.m6232();
            C2287.m7745();
        }
        C3077.m10041();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x004a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0054  */
    /* JADX WARN: Code duplicated, block: B:40:0x0059  */
    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m16103(int i, int[] iArr, int[] iArr2) {
        if (C2966.f9654 < 0) {
            if (C1826.f6190 > 0) {
                if (AbstractC3624.f12429 <= 0) {
                    C0619.m2763();
                    if (!RunnableC0334.m2063()) {
                        C13473.m33144();
                        if (AbstractC0116.f1064 <= 0) {
                            RunnableC0334.m2063();
                        }
                    } else if (C0619.f2439) {
                        C13473.m33144();
                        if (AbstractC0116.f1064 <= 0) {
                            RunnableC0334.m2063();
                        }
                    }
                } else if (!C2023.f6737) {
                    if (AbstractC0641.f2496 < 0) {
                        if (C2966.m9664()) {
                            long j = 0;
                            while (true) {
                                i--;
                                if (i < 0) {
                                    return (int) (j >> 32);
                                }
                                long j2 = iArr[i];
                                if (C2702.f8586 > 0) {
                                    long j3 = j2 & 4294967295L;
                                    if (C1542.f5343 > 0) {
                                        long j4 = iArr2[i];
                                        if (C3099.f10023 > 0) {
                                            long j5 = j3 - (4294967295L & j4);
                                            long j6 = j >> 32;
                                            if (C1146.f4234 < 0) {
                                                j = j6 + j5;
                                                iArr[i] = (int) j;
                                            }
                                        }
                                        C0619.m2763();
                                        if (!RunnableC0334.m2063()) {
                                            C13473.m33144();
                                            if (AbstractC0116.f1064 <= 0) {
                                            }
                                        } else if (C0619.f2439) {
                                            C13473.m33144();
                                            if (AbstractC0116.f1064 <= 0) {
                                            }
                                        }
                                    }
                                } else if (C0619.f2439) {
                                    C13473.m33144();
                                    if (AbstractC0116.f1064 <= 0) {
                                    }
                                }
                            }
                        } else {
                            C0619.m2763();
                            if (!RunnableC0334.m2063()) {
                                C13473.m33144();
                                if (AbstractC0116.f1064 <= 0) {
                                }
                            } else if (C0619.f2439) {
                                C13473.m33144();
                                if (AbstractC0116.f1064 <= 0) {
                                }
                            }
                        }
                        RunnableC0334.m2063();
                    }
                } else {
                    C13473.m33144();
                    if (AbstractC0116.f1064 <= 0) {
                        RunnableC0334.m2063();
                    }
                }
            }
        } else if (C0619.f2439) {
            C13473.m33144();
            if (AbstractC0116.f1064 <= 0) {
                RunnableC0334.m2063();
            }
        }
        C1519.m5403();
        C3690.m11987();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (l.RunnableC1848.m6360() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b6, code lost:
    
        if (l.C1080.f3865 >= 0) goto L77;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C5408 m16121(l.C5408 r13) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5408.m16121(l.ۚۙۚ):l.ۚۙۚ");
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5408 m16091(boolean z) {
        if (this.f5783 == 0) {
            return C11373.f35800;
        }
        int[] iArr = this.f5785;
        int length = iArr.length;
        if (length >= 128) {
            if (length < 216) {
                int length2 = (iArr.length + 1) / 2;
                C5408 c5408M16102 = m16102(length2);
                C5408 c5408M16100 = m16100(length2);
                if (RunnableC3646.m11813() == 0) {
                    C5408 c5408M16091 = c5408M16100.m16091(false);
                    C5408 c5408M16092 = c5408M16102.m16091(false);
                    int i = length2 * 32;
                    if (C1321.f4751 >= 0) {
                        RunnableC3055.m9933();
                        if (!C3779.m12264()) {
                            C2419.m8174();
                        }
                    } else {
                        C5408 c5408M16132 = c5408M16091.m16132(i);
                        C5408 c5408M16093 = RunnableC0334.m2064(c5408M16102, c5408M16100).m16091(false);
                        C5408 c5408M2064 = RunnableC0334.m2064(c5408M16091, c5408M16092);
                        if (C3998.f13671 == 0) {
                            return C1519.m5407(RunnableC0334.m2064(c5408M16132, C2834.m9347(c5408M16093, c5408M2064)).m16132(i), c5408M16092);
                        }
                    }
                }
            } else {
                if (!z && m16086(iArr.length, iArr) > 1073741824) {
                    throw new RuntimeException();
                }
                int length3 = this.f5785.length;
                int i2 = length3 + 2;
                if (C2354.f7599 >= 0) {
                    C2419.m8174();
                } else {
                    int i3 = i2 / 3;
                    if (C3033.f9831 >= 0) {
                        RunnableC3055.m9933();
                        if (!C3779.m12264()) {
                            C2419.m8174();
                        }
                    } else {
                        int i4 = length3 - (i3 * 2);
                        C5408 c5408M16087 = m16087(i3, i4, 0, length3);
                        C5408 c5408M16088 = m16087(i3, i4, 1, length3);
                        if (C2023.f6737) {
                            C20932.m47848();
                            if (C4238.f15451 >= 0) {
                                C3492.m11488();
                                if (AbstractC3624.f12429 > 0) {
                                    RunnableC3055.m9933();
                                    if (!C3779.m12264()) {
                                        C2419.m8174();
                                    }
                                }
                            }
                        } else {
                            C5408 c5408M16089 = m16087(i3, i4, 2, length3);
                            C5408 c5408M16094 = c5408M16089.m16091(true);
                            C5408 c5408M2065 = RunnableC0334.m2064(c5408M16087, c5408M16089);
                            C5408 c5408M16095 = C2834.m9347(c5408M2065, c5408M16088).m16091(true);
                            C5408 c5408M5407 = C1519.m5407(c5408M2065, c5408M16088);
                            if (C1826.f6190 > 0) {
                                C5408 c5408M16096 = c5408M5407.m16091(true);
                                C5408 c5408M16097 = c5408M16087.m16091(true);
                                C5408 c5408M16110 = C3448.m11258(C3448.m11258(C1519.m5407(c5408M5407, c5408M16087).m16132(1), c5408M16089).m16091(true), c5408M16095).m16110();
                                C5408 c5408M16127 = C3448.m11258(c5408M16096, c5408M16095).m16127(1);
                                C5408 c5408M11258 = C3448.m11258(c5408M16096, c5408M16094);
                                C5408 c5408M9347 = C2834.m9347(c5408M16110, c5408M11258);
                                if (C1146.f4234 < 0) {
                                    C5408 c5408M16128 = c5408M9347.m16127(1);
                                    C5408 c5408M11259 = C3448.m11258(C2834.m9347(c5408M11258, c5408M16127), c5408M16097);
                                    C5408 c5408M9348 = C2834.m9347(c5408M16128, c5408M16097.m16132(1));
                                    if (C2287.f7432 >= 0) {
                                        RunnableC3055.m9933();
                                        if (!C3779.m12264()) {
                                        }
                                    } else {
                                        C5408 c5408M9349 = C2834.m9347(c5408M16127, c5408M9348);
                                        int i5 = i3 * 32;
                                        C5408 c5408M16133 = C1519.m5407(c5408M16097.m16132(i5), c5408M9348).m16132(i5);
                                        if (C20932.f66974 > 0) {
                                            return RunnableC0334.m2064(C1519.m5407(C1519.m5407(c5408M16133, c5408M11259).m16132(i5), c5408M9349).m16132(i5), c5408M16094);
                                        }
                                    }
                                    C2419.m8174();
                                }
                            }
                        }
                    }
                }
            }
            C23916.m53419();
            C3998.m12920();
            return null;
        }
        return new C5408(m16095(m16094(length, iArr, (int[]) null)), 1);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0036  */
    /* JADX WARN: Code duplicated, block: B:34:0x003e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0046  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16086(int i, int[] iArr) {
        if (!C2878.f9462 && C20932.f66974 > 0) {
            if (C3448.f11240 >= 0) {
                C4282.m13644();
                if (C2023.f6737) {
                    C1080.m4050();
                    if (C3492.f12043 <= 0) {
                    }
                }
            } else if (C1564.f5401 > 0) {
                if (C2966.f9654 >= 0) {
                    C4282.m13644();
                    if (C2023.f6737) {
                        C1080.m4050();
                        if (C3492.f12043 <= 0) {
                        }
                    }
                } else if (C1783.f6087 <= 0) {
                    C1080.m4050();
                    if (C3492.f12043 <= 0) {
                    }
                } else {
                    if (i == 0) {
                        return 0;
                    }
                    int i2 = i - 1;
                    if (!C17202.f56030) {
                        C4282.m13644();
                        if (C2023.f6737) {
                            C1080.m4050();
                            if (C3492.f12043 <= 0) {
                            }
                        }
                    } else if (C3998.f13671 != 0) {
                        C1080.m4050();
                        if (C3492.f12043 <= 0 || C2966.f9654 < 0) {
                        }
                    } else {
                        int i3 = i2 << 5;
                        int i4 = iArr[0];
                        if (C3690.f12684 <= 0) {
                            C4282.m13644();
                            if (C2023.f6737) {
                                C1080.m4050();
                                if (C3492.f12043 <= 0) {
                                }
                            }
                        } else {
                            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i4);
                            if (C2485.f7950 == 0) {
                                return (32 - iNumberOfLeadingZeros) + i3;
                            }
                        }
                    }
                }
            }
            C0619.m2763();
        }
        C2288.m7767();
        C0269.m1775();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x003b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0040  */
    /* JADX WARN: Code duplicated, block: B:37:0x0048  */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5408 m16124() {
        if (C3998.m12920()) {
            if (C2834.m9344() >= 0) {
                RunnableC3055.m9933();
                if (C23916.f77426 > 0) {
                    if (C23916.f77426 > 0) {
                    }
                }
                C2878.m9491();
                C13473.m33144();
                return null;
            }
            if (AbstractC0116.f1064 > 0) {
                if (C2375.f7641 > 0) {
                    if (C2287.m7745() > 0) {
                        if (C4282.f15546 > 0) {
                            if (C1080.f3865 < 0) {
                                if (C0269.f1558 > 0) {
                                    if (C13473.f42873 != 0) {
                                        RunnableC3055.m9933();
                                        if (C23916.f77426 > 0) {
                                            if (C23916.f77426 > 0) {
                                            }
                                        }
                                    } else {
                                        int[] iArr = this.f5785;
                                        if (C3033.f9831 < 0) {
                                            return new C5408(iArr, -this.f5783);
                                        }
                                        if (C0950.f3488 >= 0) {
                                            RunnableC3055.m9933();
                                            if (C23916.f77426 > 0) {
                                                if (C23916.f77426 > 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (C0950.f3488 >= 0) {
                                RunnableC3055.m9933();
                                if (C23916.f77426 > 0) {
                                    if (C23916.f77426 > 0) {
                                    }
                                }
                            }
                        } else if (C23916.f77426 > 0) {
                        }
                    } else if (C0950.f3488 >= 0) {
                        RunnableC3055.m9933();
                        if (C23916.f77426 > 0) {
                            if (C23916.f77426 > 0) {
                            }
                        }
                    }
                } else if (C23916.f77426 > 0) {
                }
                C2878.m9491();
                C13473.m33144();
                return null;
            }
        } else if (C0950.f3488 >= 0) {
            RunnableC3055.m9933();
            if (C23916.f77426 > 0) {
                if (C23916.f77426 > 0) {
                }
            }
            C2878.m9491();
            C13473.m33144();
            return null;
        }
        RunnableC1848.m6360();
        C3033.m9845();
        C2878.m9491();
        C13473.m33144();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3  */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5408 m16125(C5408 c5408) {
        C20324 c20324;
        C20324 c20325;
        int[] iArr;
        C20324 c20324M46686;
        C5408 c5408M46695;
        if (c5408.f5783 > 0) {
            int[] iArr2 = c5408.f5785;
            if (iArr2.length >= 80) {
                int length = this.f5785.length;
                int length2 = iArr2.length;
                if (C0269.m1775() <= 0) {
                    C1321.m4852();
                    if (C3448.f11240 >= 0) {
                        RunnableC3646.m11813();
                        if (AbstractC3624.f12429 > 0) {
                            C20932.m47848();
                            C3492.m11488();
                        }
                    } else if (C23916.f77426 <= 0) {
                        RunnableC3646.m11813();
                        if (AbstractC3624.f12429 > 0) {
                            C20932.m47848();
                            C3492.m11488();
                        }
                    }
                } else if (length - length2 < 40) {
                    c20324 = new C20324();
                    if (C23916.m53419() == 0) {
                        C1321.m4852();
                        if (C3448.f11240 >= 0) {
                            RunnableC3646.m11813();
                            if (AbstractC3624.f12429 > 0) {
                                C20932.m47848();
                                C3492.m11488();
                            }
                        } else if (C23916.f77426 <= 0) {
                            RunnableC3646.m11813();
                            if (AbstractC3624.f12429 > 0) {
                                C20932.m47848();
                                C3492.m11488();
                            }
                        }
                    } else if (C0773.f2792 > 0) {
                        iArr = this.f5785;
                        if (RunnableC3646.m11813() != 0) {
                            C20932.m47848();
                            C3492.m11488();
                        } else {
                            c20325 = new C20324(iArr);
                            if (C3779.f12953 <= 0) {
                                C1321.m4852();
                                if (C3448.f11240 >= 0) {
                                    if (C23916.f77426 <= 0) {
                                    }
                                }
                            } else {
                                c20324M46686 = c20325.m46686(new C20324(c5408.f5785), c20324);
                                if (C1343.m4943()) {
                                    c5408M46695 = c20324M46686.m46695(this.f5783);
                                    if (c5408M46695.f5783 >= 0) {
                                        return c5408M46695;
                                    }
                                    return RunnableC0334.m2064(c5408M46695, c5408);
                                }
                            }
                            RunnableC3646.m11813();
                            if (AbstractC3624.f12429 > 0) {
                                C20932.m47848();
                                C3492.m11488();
                            }
                        }
                    }
                } else {
                    C20324 c20326 = new C20324();
                    if (C2966.f9654 < 0) {
                        C20324 c20327 = new C20324(this);
                        if (C1564.f5401 > 0) {
                            C20324 c20324M46691 = c20327.m46691(new C20324(c5408), c20326);
                            C5408 c5408M46696 = c20326.m46688() ? C11373.f35800 : c20326.m46695(this.f5783 * c5408.f5783);
                            C5408 c5408M46697 = c20324M46691.m46688() ? C11373.f35800 : c20324M46691.m46695(this.f5783);
                            C5408[] c5408Arr = new C5408[2];
                            if (C1564.f5401 > 0) {
                                c5408Arr[0] = c5408M46696;
                                if (C2966.f9654 < 0) {
                                    c5408Arr[1] = c5408M46697;
                                    c5408M46695 = c5408Arr[1];
                                    if (c5408M46695.f5783 >= 0) {
                                        return c5408M46695;
                                    }
                                    return RunnableC0334.m2064(c5408M46695, c5408);
                                }
                            }
                            C1321.m4852();
                            if (C3448.f11240 >= 0) {
                                RunnableC3646.m11813();
                                if (AbstractC3624.f12429 > 0) {
                                    C20932.m47848();
                                    C3492.m11488();
                                }
                            } else if (C23916.f77426 <= 0) {
                                RunnableC3646.m11813();
                                if (AbstractC3624.f12429 > 0) {
                                    C20932.m47848();
                                    C3492.m11488();
                                }
                            }
                        }
                    } else if (C23916.f77426 <= 0) {
                        RunnableC3646.m11813();
                        if (AbstractC3624.f12429 > 0) {
                            C20932.m47848();
                            C3492.m11488();
                        }
                    }
                }
            } else {
                c20324 = new C20324();
                if (C23916.m53419() == 0) {
                    C1321.m4852();
                    if (C3448.f11240 >= 0) {
                        RunnableC3646.m11813();
                        if (AbstractC3624.f12429 > 0) {
                            C20932.m47848();
                            C3492.m11488();
                        }
                    } else if (C23916.f77426 <= 0) {
                        RunnableC3646.m11813();
                        if (AbstractC3624.f12429 > 0) {
                            C20932.m47848();
                            C3492.m11488();
                        }
                    }
                } else if (C0773.f2792 > 0) {
                    iArr = this.f5785;
                    if (RunnableC3646.m11813() != 0) {
                        C20932.m47848();
                        C3492.m11488();
                    } else {
                        c20325 = new C20324(iArr);
                        if (C3779.f12953 <= 0) {
                            C1321.m4852();
                            if (C3448.f11240 >= 0) {
                                if (C23916.f77426 <= 0) {
                                }
                            }
                        } else {
                            c20324M46686 = c20325.m46686(new C20324(c5408.f5785), c20324);
                            if (C1343.m4943()) {
                                c5408M46695 = c20324M46686.m46695(this.f5783);
                                if (c5408M46695.f5783 >= 0) {
                                    return c5408M46695;
                                }
                                return RunnableC0334.m2064(c5408M46695, c5408);
                            }
                        }
                        RunnableC3646.m11813();
                        if (AbstractC3624.f12429 > 0) {
                            C20932.m47848();
                            C3492.m11488();
                        }
                    }
                }
            }
            C2288.m7767();
            return null;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16085(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (AbstractC0116.f1064 <= 0) {
            C2966.m9664();
            if (C3690.f12684 <= 0) {
                C3099.m10095();
                if (C4238.f15451 >= 0) {
                    C23916.m53419();
                    C23916.m53419();
                } else if (C2966.f9654 >= 0) {
                    C23916.m53419();
                    C23916.m53419();
                }
            } else if (C2966.f9654 >= 0) {
                C23916.m53419();
                C23916.m53419();
            }
        } else if (C4238.m13540() > 0) {
            if (C0773.f2792 <= 0) {
                C3099.m10095();
                if (C4238.f15451 >= 0) {
                    C23916.m53419();
                    C23916.m53419();
                }
            } else if (C1542.f5343 <= 0) {
                C2966.m9664();
                if (C3690.f12684 <= 0) {
                    C3099.m10095();
                    if (C4238.f15451 >= 0) {
                        C23916.m53419();
                        C23916.m53419();
                    }
                }
            } else if (C2287.m7745() > 0) {
                if (C2354.f7599 >= 0) {
                    C2966.m9664();
                    if (C3690.f12684 <= 0) {
                        C3099.m10095();
                        if (C4238.f15451 >= 0) {
                            C23916.m53419();
                            C23916.m53419();
                        }
                    }
                } else {
                    if (i2 > iArr2.length) {
                        throw new IllegalArgumentException();
                    }
                    if (i < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (i > iArr.length - 1) {
                        throw new IllegalArgumentException();
                    }
                    if (i2 > iArr.length - i) {
                        throw new IllegalArgumentException();
                    }
                    long j = ((long) i3) & 4294967295L;
                    int length = iArr.length - i;
                    if (C1519.m5403()) {
                        int i4 = length - 1;
                        int i5 = i2 - 1;
                        long j2 = 0;
                        while (i5 >= 0) {
                            long j3 = (((long) iArr2[i5]) & 4294967295L) * j;
                            int i6 = iArr[i4];
                            if (C1564.f5401 > 0) {
                                long j4 = j3 + (((long) i6) & 4294967295L) + j2;
                                if (!C2023.f6737) {
                                    int i7 = i4 - 1;
                                    iArr[i4] = (int) j4;
                                    if (C2834.f9334 > 0) {
                                        j2 = j4 >>> 32;
                                        i5--;
                                        i4 = i7;
                                    }
                                }
                                C2966.m9664();
                                if (C3690.f12684 <= 0) {
                                    C3099.m10095();
                                    if (C4238.f15451 >= 0) {
                                        C23916.m53419();
                                        C23916.m53419();
                                    }
                                }
                            }
                        }
                        return (int) j2;
                    }
                }
            }
            if (C2966.f9654 >= 0) {
                C23916.m53419();
                C23916.m53419();
            }
        } else {
            C23916.m53419();
            C23916.m53419();
        }
        C0950.m3785();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
    
        if (l.C0487.m2356() >= 0) goto L93;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C5408 m16101(int r13) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5408.m16101(int):l.ۚۙۚ");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0038  */
    /* JADX WARN: Code duplicated, block: B:32:0x0040  */
    /* JADX WARN: Code duplicated, block: B:35:0x0048  */
    /* JADX WARN: Code duplicated, block: B:38:0x004d  */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m16126(int i) {
        if (i < 0) {
            throw new RuntimeException();
        }
        int i2 = i >>> 5;
        if (C2023.f6737) {
            if (C3734.f12817 >= 0) {
                C3690.m11987();
            }
        } else if (C11235.f35427 >= 0 || AbstractC0116.f1064 <= 0 || C1542.f5343 <= 0) {
            C3690.m11987();
        } else if (C1564.m5509() > 0) {
            if (C0862.f3233 != 0) {
                C1321.m4852();
                if (C2966.f9654 < 0) {
                    if (C3734.f12817 >= 0) {
                    }
                }
            } else if (C0862.f3233 == 0) {
                int iM6021 = m6021(i2);
                if (C2878.m9491() > 0 && C13473.f42873 == 0) {
                    int i3 = i & 31;
                    if (C2834.f9334 > 0) {
                        return ((1 << i3) & iM6021) != 0;
                    }
                } else {
                    C17202.m40372();
                    if (C4282.f15546 <= 0) {
                        C1321.m4852();
                        if (C2966.f9654 < 0) {
                            if (C3734.f12817 >= 0) {
                            }
                        }
                    }
                }
            }
            C3690.m11987();
        } else {
            C17202.m40372();
            if (C4282.f15546 <= 0) {
                C1321.m4852();
                if (C2966.f9654 < 0) {
                    if (C3734.f12817 >= 0) {
                    }
                }
            }
            C3690.m11987();
        }
        RunnableC3646.m11813();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x007d  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int[] m16106(int i, int[] iArr) {
        int[] iArr2;
        int i2;
        if (C4238.f15451 < 0 && C1783.f6087 > 0) {
            int i3 = i >>> 5;
            if (AbstractC3624.m11755() == 0) {
                int i4 = i & 31;
                if (AbstractC0116.m1243() != 0) {
                    if (C2485.f7950 == 0) {
                        C1146.m4231();
                        if (C3734.f12817 >= 0) {
                            C1080.m4050();
                        }
                    }
                } else {
                    int length = iArr.length;
                    int i5 = 0;
                    if (i4 != 0) {
                        int i6 = 32 - i4;
                        if (C2310.f7472 < 0) {
                            int i7 = iArr[0] >>> i6;
                            if (i7 != 0) {
                                int i8 = i3 + length;
                                if (C3734.f12817 < 0) {
                                    int i9 = i8 + 1;
                                    if (C0269.f1558 <= 0) {
                                        if (C2287.f7432 < 0) {
                                            if (C2485.f7950 == 0) {
                                                C1146.m4231();
                                                if (C3734.f12817 >= 0) {
                                                    C1080.m4050();
                                                }
                                            }
                                        }
                                    } else {
                                        iArr2 = new int[i9];
                                        iArr2[0] = i7;
                                        i2 = 1;
                                    }
                                }
                            } else {
                                iArr2 = new int[i3 + length];
                                i2 = 0;
                            }
                            while (true) {
                                if (i5 < length - 1) {
                                    int i10 = i2 + 1;
                                    if (C3998.m12920()) {
                                        int i11 = i5 + 1;
                                        int i12 = iArr[i5];
                                        if (C3099.f10023 <= 0) {
                                            break;
                                        }
                                        int i13 = i12 << i4;
                                        int i14 = iArr[i11] >>> i6;
                                        if (RunnableC0334.f1808 <= 0) {
                                            break;
                                        }
                                        iArr2[i2] = i13 | i14;
                                        i2 = i10;
                                        i5 = i11;
                                    }
                                } else {
                                    iArr2[i2] = iArr[i5] << i4;
                                    return iArr2;
                                }
                            }
                            if (C2287.f7432 < 0) {
                                if (C2485.f7950 == 0) {
                                    C1146.m4231();
                                    if (C3734.f12817 >= 0) {
                                        C1080.m4050();
                                    }
                                }
                            }
                        }
                    } else {
                        int[] iArr3 = new int[i3 + length];
                        C2702.m8882(iArr, 0, iArr3, 0, length);
                        return iArr3;
                    }
                }
            }
        } else {
            C1146.m4231();
            if (C3734.f12817 >= 0) {
                C1080.m4050();
            }
        }
        C3998.m12920();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0034  */
    /* JADX WARN: Code duplicated, block: B:34:0x003b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0043  */
    /* JADX WARN: Code duplicated, block: B:40:0x004d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m16095(int[] iArr) {
        int length = iArr.length;
        if (RunnableC3646.m11813() == 0) {
            if (C1826.f6190 > 0) {
                if (AbstractC3624.f12429 <= 0) {
                    C2878.m9491();
                    C1542.m5459();
                } else if (C1080.f3865 < 0 && AbstractC0641.f2496 < 0) {
                    if (C1343.f4799 == 0) {
                        if (C1542.f5343 > 0) {
                            if (C1542.f5343 <= 0) {
                                C3448.m11248();
                                if (!RunnableC1848.f6235) {
                                    C2023.m6964();
                                    if (C4282.m13644()) {
                                    }
                                }
                            } else if (C3099.f10023 > 0) {
                                if (C0269.f1558 > 0) {
                                    int i = 0;
                                    while (i < length && iArr[i] == 0) {
                                        i++;
                                    }
                                    return i == 0 ? iArr : Arrays.copyOfRange(iArr, i, length);
                                }
                                if (C3448.m11248() != 0) {
                                    C2023.m6964();
                                    if (C4282.m13644()) {
                                    }
                                } else {
                                    C3448.m11248();
                                    if (!RunnableC1848.f6235) {
                                        C2023.m6964();
                                        if (C4282.m13644()) {
                                        }
                                    }
                                }
                            }
                        }
                        C2878.m9491();
                        C1542.m5459();
                    }
                } else if (C3448.m11248() != 0) {
                    C2023.m6964();
                    if (C4282.m13644()) {
                        C2878.m9491();
                        C1542.m5459();
                    }
                } else {
                    C3448.m11248();
                    if (!RunnableC1848.f6235) {
                        C2878.m9491();
                        C1542.m5459();
                    } else {
                        C2023.m6964();
                        if (C4282.m13644()) {
                            C2878.m9491();
                            C1542.m5459();
                        }
                    }
                }
            } else if (C3448.m11248() != 0) {
                C2023.m6964();
                if (C4282.m13644()) {
                    C2878.m9491();
                    C1542.m5459();
                }
            } else {
                C3448.m11248();
                if (!RunnableC1848.f6235) {
                    C2878.m9491();
                    C1542.m5459();
                } else {
                    C2023.m6964();
                    if (C4282.m13644()) {
                        C2878.m9491();
                        C1542.m5459();
                    }
                }
            }
        }
        C17202.m40372();
        C2288.m7767();
        return null;
    }
}
