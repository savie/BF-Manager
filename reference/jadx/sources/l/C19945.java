package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R790 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19945 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f64141;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C10994 f64142;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13955 f64143;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22183 f64144;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f64145 = C25227.FOREVER_NS;

    public C19945(InterfaceC1278 interfaceC1278) {
        this.f64143 = new C13955(interfaceC1278);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:68:0x018b  */
    /* JADX WARN: Code duplicated, block: B:69:0x018f  */
    /* JADX WARN: Code duplicated, block: B:71:0x019c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01da  */
    /* JADX WARN: Code duplicated, block: B:86:0x01de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [l.ۚܽ֫] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [l.ۚܽ֫] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r4v33, types: [l.ᩳۚ᩷] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18866 m45871() {
        C22183 c22183;
        C22183 c22184;
        long jM40011;
        long jM40012;
        int i;
        ArrayList arrayListM27838;
        ArrayList arrayListM27839;
        C5775 c5775;
        ?? r1;
        List<C15469> list;
        C22183 c22185;
        ?? r19;
        int i2;
        int[] iArr;
        long[] jArr;
        HashMap map;
        ?? r110;
        int i3;
        int[] iArr2;
        long[] jArr2;
        HashMap map2;
        ?? r111;
        int i4;
        Iterator it;
        HashMap map3;
        long j;
        C22183 c22186;
        long[] jArr3;
        long[] jArr4;
        Iterator it2;
        C5775 c5776;
        C13955 c13955 = this.f64143;
        this.f64141 = C13955.m34024(c13955);
        this.f64145 = C25227.FOREVER_NS;
        C10994 c10994M45877 = m45877();
        this.f64142 = c10994M45877;
        if (c10994M45877 == null || C10994.m27837(c10994M45877)) {
            return null;
        }
        long j2 = this.f64141;
        int i5 = 1;
        if (j2 >= 16) {
            C7244 c7244M45869 = m45869(j2 - 16, j2);
            if (c7244M45869.f23887 == C16961.f55450 && c7244M45869.f23890 == 16) {
                long j3 = c7244M45869.f23885;
                long j4 = this.f64141;
                if (j3 != j4) {
                    c22183 = null;
                } else {
                    long jM40013 = C16961.m40011(0, C13955.m34025(c13955, j4 - 4, 4));
                    if (jM40013 <= 0 || jM40013 > 4194304) {
                        c22183 = null;
                    } else {
                        long j5 = this.f64141;
                        if (jM40013 > j5) {
                            c22183 = null;
                        } else {
                            long j6 = j5 - jM40013;
                            C7244 c7244M458610 = m45869(j6, j5);
                            if (c7244M458610.f23887 == C16961.f55452 && c7244M458610.f23885 == this.f64141) {
                                byte[] bArrM34025 = C13955.m34025(c13955, c7244M458610.f23886, (int) C7244.m19870(c7244M458610));
                                C22183 c22187 = new C22183(j6);
                                int i6 = 4096;
                                int i7 = 2;
                                for (C8735 c8735 : C16961.m40008(0, bArrM34025.length, bArrM34025)) {
                                    if (c8735.f28410 == C16961.f55439) {
                                        int i8 = c8735.f28411;
                                        int i9 = bArrM34025[i8] & 255;
                                        if (i9 != 0 && i9 != i5) {
                                            throw new C25167();
                                        }
                                        int iM40001 = C16961.m40001(i8 + 4, bArrM34025);
                                        byte b = bArrM34025[i8 + 11];
                                        int i10 = b & 255;
                                        int i11 = ((i10 >> 4) & 3) + 1;
                                        int i12 = ((i10 >> i7) & 3) + i5;
                                        int i13 = (b & 3) + i5;
                                        int iM40002 = C16961.m40001(i8 + 12, bArrM34025);
                                        int i14 = i8 + 16;
                                        if (iM40002 < 0 || iM40002 > i6) {
                                            throw new C25167();
                                        }
                                        List list2 = (List) C11392.computeIfAbsent(c22187.f71474, Integer.valueOf(iM40001), new C6360(2));
                                        int i15 = 0;
                                        while (i15 < iM40002) {
                                            if (i9 == i5) {
                                                jM40011 = C16961.m39994(i14, bArrM34025);
                                                jM40012 = C16961.m39994(i14 + 8, bArrM34025);
                                                i = i14 + 16;
                                            } else {
                                                jM40011 = C16961.m40011(i14, bArrM34025);
                                                jM40012 = C16961.m40011(i14 + 4, bArrM34025);
                                                i = i14 + 8;
                                            }
                                            long j7 = jM40011;
                                            long j8 = jM40012;
                                            int iM40010 = C16961.m40010(i, i11, bArrM34025);
                                            int i16 = i + i11;
                                            int iM40011 = C16961.m40010(i16, i12, bArrM34025);
                                            int i17 = i16 + i12;
                                            int iM40012 = C16961.m40010(i17, i13, bArrM34025);
                                            i14 = i17 + i13;
                                            if (j7 < 0 || j8 < 0 || iM40010 <= 0 || iM40011 <= 0 || iM40012 <= 0) {
                                                throw new C25167();
                                            }
                                            list2.add(new C15469(j7, iM40010 - 1, iM40011 - 1, iM40012 - 1, j8));
                                            i15++;
                                            i5 = 1;
                                        }
                                    }
                                    i6 = 4096;
                                    i7 = 2;
                                    i5 = 1;
                                }
                                c22183 = c22187;
                            } else {
                                c22183 = null;
                            }
                        }
                    }
                }
            } else {
                c22183 = null;
            }
            c22184 = c22183;
            this.f64144 = c22183;
            if (c22183 == null) {
                r1 = c5775;
                r1 = c5776;
                r1 = c5776;
                r1 = c5776;
                r1 = c5776;
                c22185 = c22184;
            } else {
                arrayListM27838 = C10994.m27838(this.f64142, 1);
                if (!arrayListM27838.isEmpty()) {
                    arrayListM27839 = C10994.m27838(this.f64142, 2);
                    if (arrayListM27839.size() == 1 || !m45875((C5775) arrayListM27839.get(0))) {
                        r1 = c22184;
                    } else {
                        c5775 = (C5775) arrayListM27839.get(0);
                    }
                } else if (arrayListM27838.size() == 1 || !m45875((C5775) arrayListM27838.get(0))) {
                    r1 = c22184;
                } else {
                    c5776 = (C5775) arrayListM27838.get(0);
                }
                if (r1 == 0) {
                    r1 = c5775;
                    r1 = c5776;
                    r1 = c5776;
                    r1 = c5776;
                    r1 = c5776;
                    c22185 = c22184;
                } else {
                    r1 = c5775;
                    list = (List) this.f64144.f71474.get(Integer.valueOf(r1.f19839));
                    if (list != null || list.isEmpty() || list.size() > 4096) {
                        r1 = c5775;
                        r1 = c5776;
                        r1 = c5776;
                        r1 = c5776;
                        r1 = c5776;
                        c22185 = c22184;
                    } else {
                        r1 = c5776;
                        ArrayList arrayList = new ArrayList();
                        long j9 = Long.MIN_VALUE;
                        long j10 = Long.MIN_VALUE;
                        for (C15469 c15469 : list) {
                            if (c15469.f50378 <= j9 || c15469.f50377 <= 0 || c15469.f50377 >= this.f64144.f71475) {
                                throw new C25167();
                            }
                            if (c15469.f50377 < j10) {
                                throw new C25167();
                            }
                            j9 = c15469.f50378;
                            if (c15469.f50377 != j10) {
                                arrayList.add(c15469);
                                j10 = c15469.f50377;
                            }
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            C16961.m40007(((C15469) it3.next()).f50378, r1.f19841);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int[] iArr3 = new int[size];
                            long[] jArr5 = new long[size];
                            long[] jArr6 = new long[size];
                            long[] jArr7 = new long[size];
                            HashMap map4 = new HashMap();
                            long jMin = C25227.FOREVER_NS;
                            for (Iterator it4 = this.f64142.m27830().iterator(); it4.hasNext(); it4 = it2) {
                                C5775 c5777 = (C5775) it4.next();
                                if (c5777.f19839 == r1.f19839) {
                                    C15469 c15469M45878 = m45878(c5777);
                                    if (c15469M45878 == null) {
                                        throw new C25167();
                                    }
                                    c22186 = c22184;
                                    jArr3 = jArr6;
                                    jArr4 = jArr7;
                                    it2 = it4;
                                    map4.put(Integer.valueOf(c5777.f19839), new C13232(c5777, c15469M45878.f50377, 0));
                                    jMin = Math.min(jMin, c15469M45878.f50377);
                                } else {
                                    c22186 = c22184;
                                    jArr3 = jArr6;
                                    jArr4 = jArr7;
                                    it2 = it4;
                                    long j11 = c5777.f19842;
                                    if (j11 > 0) {
                                        map4.put(Integer.valueOf(c5777.f19839), C13232.m32779(c5777, j11));
                                    } else {
                                        C15469 c15469M45879 = m45878(c5777);
                                        if (c15469M45879 == null) {
                                            throw new C25167();
                                        }
                                        map4.put(Integer.valueOf(c5777.f19839), new C13232(c5777, c15469M45879.f50377, 0));
                                        jMin = Math.min(jMin, c15469M45879.f50377);
                                    }
                                    c22184 = c22186;
                                    jArr6 = jArr3;
                                    jArr7 = jArr4;
                                }
                                c22184 = c22186;
                                jArr6 = jArr3;
                                jArr7 = jArr4;
                            }
                            c22185 = c22184;
                            long[] jArr8 = jArr6;
                            long[] jArr9 = jArr7;
                            int i18 = 0;
                            ?? r2 = r1;
                            if (jMin != C25227.FOREVER_NS) {
                                while (jMin < this.f64144.f71475) {
                                    C7244 c7244M458611 = m45869(jMin, this.f64144.f71475);
                                    if (c7244M458611.f23887 == C16961.f55431) {
                                        C22929 c22929M45873 = m45873(jMin);
                                        Iterator it5 = map4.values().iterator();
                                        ?? r3 = r2;
                                        while (it5.hasNext()) {
                                            C13232 c13232 = (C13232) it5.next();
                                            if (!C13232.m32782(c13232) || jMin < c13232.f42293) {
                                                r111 = r3;
                                                i4 = size;
                                                it = it5;
                                                map3 = map4;
                                                j = jMin;
                                            } else {
                                                List list3 = (List) c22929M45873.f74502.get(Integer.valueOf(c13232.f42292.f19839));
                                                if (list3 == null || list3.size() != 1) {
                                                    throw new C25167();
                                                }
                                                C2046 c2046 = (C2046) list3.get(i18);
                                                if (!c2046.f6807) {
                                                    throw new C25167();
                                                }
                                                long j12 = c13232.f42294;
                                                Iterator it6 = ((ArrayList) c2046.f6804).iterator();
                                                long jMax = Long.MIN_VALUE;
                                                ?? r4 = r3;
                                                while (it6.hasNext()) {
                                                    C11740 c11740 = (C11740) it6.next();
                                                    ?? r112 = r4;
                                                    int i19 = size;
                                                    C2046 c2047 = c2046;
                                                    Iterator it7 = it5;
                                                    long jM39972 = C16961.m39972(c2046.f6803, c11740.f37968);
                                                    int i20 = 0;
                                                    while (i20 < c11740.f37966) {
                                                        jMax = Math.max(jMax, C16961.m39972(C16961.m39972(jM39972, c11740.f37965[i20]), c11740.f37971[i20]));
                                                        jM39972 = C16961.m39972(jM39972, c11740.f37971[i20]);
                                                        i20++;
                                                        map4 = map4;
                                                        it6 = it6;
                                                        jMin = jMin;
                                                    }
                                                    r4 = r112;
                                                    size = i19;
                                                    it5 = it7;
                                                    c2046 = c2047;
                                                }
                                                r111 = r4;
                                                i4 = size;
                                                it = it5;
                                                map3 = map4;
                                                j = jMin;
                                                if (jMax < 0) {
                                                    throw new C25167();
                                                }
                                                c13232.f42294 = Math.max(j12, jMax);
                                                i18 = 0;
                                            }
                                            c22929M45873 = c22929M45873;
                                            r3 = r111;
                                            iArr3 = iArr3;
                                            jArr5 = jArr5;
                                            size = i4;
                                            it5 = it;
                                            map4 = map3;
                                            jMin = j;
                                        }
                                        r110 = r3;
                                        i3 = size;
                                        iArr2 = iArr3;
                                        jArr2 = jArr5;
                                        map2 = map4;
                                    } else {
                                        r110 = r2;
                                        i3 = size;
                                        iArr2 = iArr3;
                                        jArr2 = jArr5;
                                        map2 = map4;
                                        int unused = C16961.f55429;
                                    }
                                    jMin = c7244M458611.f23885;
                                    i18 = 0;
                                    r2 = r110;
                                    iArr3 = iArr2;
                                    jArr5 = jArr2;
                                    size = i3;
                                    map4 = map2;
                                }
                                r19 = r2;
                                i2 = size;
                                iArr = iArr3;
                                jArr = jArr5;
                                map = map4;
                                if (jMin != this.f64144.f71475) {
                                    throw new C25167();
                                }
                            } else {
                                r19 = r1;
                                i2 = size;
                                iArr = iArr3;
                                jArr = jArr5;
                                map = map4;
                            }
                            Iterator it8 = map.values().iterator();
                            long jMax2 = 0;
                            while (it8.hasNext()) {
                                long jM32784 = C13232.m32784((C13232) it8.next());
                                if (jM32784 <= 0) {
                                    throw new C25167();
                                }
                                jMax2 = Math.max(jMax2, jM32784);
                            }
                            int i21 = 0;
                            int i22 = i2;
                            while (i21 < i22) {
                                C15469 c154610 = (C15469) arrayList.get(i21);
                                int i23 = i21 + 1;
                                long j13 = i23 < i22 ? ((C15469) arrayList.get(i23)).f50377 : this.f64144.f71475;
                                long j14 = j13 - c154610.f50377;
                                if (j14 > 0 && j14 <= 2147483647L) {
                                    C22929 c22929M45874 = m45873(c154610.f50377);
                                    if (c154610.f50381 < 0 || c154610.f50381 >= c22929M45874.f74503.size()) {
                                        throw new C25167();
                                    }
                                    C2046 c2048 = (C2046) c22929M45874.f74503.get(c154610.f50381);
                                    if (c2048.f6806 != r19.f19839) {
                                        throw new C25167();
                                    }
                                    List list4 = (List) c22929M45874.f74502.get(Integer.valueOf(r19.f19839));
                                    if (list4 == null || list4.size() != 1) {
                                        throw new C25167();
                                    }
                                    if (c154610.f50379 < 0 || c154610.f50379 >= ((ArrayList) c2048.f6804).size()) {
                                        throw new C25167();
                                    }
                                    C11740 c11741 = (C11740) ((ArrayList) c2048.f6804).get(c154610.f50379);
                                    if (c154610.f50380 < 0 || c154610.f50380 >= c11741.f37966) {
                                        throw new C25167();
                                    }
                                    m45874(c2048, c154610.f50377, j13);
                                    if (!c11741.f37967[c154610.f50380]) {
                                        throw new C25167();
                                    }
                                    jArr[i21] = c154610.f50377;
                                    iArr[i21] = (int) j14;
                                    long jM40007 = C16961.m40007(c154610.f50378, r19.f19841);
                                    jArr8[i21] = jM40007;
                                    if (i21 <= 0 || jM40007 > jArr8[i21 - 1]) {
                                        i21 = i23;
                                    }
                                }
                            }
                            int i24 = 0;
                            while (i24 < i22) {
                                int i25 = i24 + 1;
                                long j15 = (i25 < i22 ? jArr8[i25] : jMax2) - jArr8[i24];
                                if (j15 > 0) {
                                    jArr9[i24] = j15;
                                    i24 = i25;
                                }
                            }
                            return new C18866(iArr, jArr, jArr9, jArr8);
                        }
                        r1 = c5775;
                        r1 = c5776;
                        r1 = c5776;
                        r1 = c5776;
                        r1 = c5776;
                        c22185 = c22184;
                    }
                }
            }
            return c22185;
        }
        c22183 = null;
        c22184 = null;
        this.f64144 = c22183;
        if (c22183 == null) {
            r1 = c5775;
            r1 = c5776;
            r1 = c5776;
            r1 = c5776;
            r1 = c5776;
            c22185 = c22184;
        } else {
            arrayListM27838 = C10994.m27838(this.f64142, 1);
            if (!arrayListM27838.isEmpty()) {
                arrayListM27839 = C10994.m27838(this.f64142, 2);
                if (arrayListM27839.size() == 1) {
                    r1 = c22184;
                } else {
                    r1 = c22184;
                }
            } else if (arrayListM27838.size() == 1) {
                r1 = c22184;
            } else {
                r1 = c22184;
            }
            if (r1 == 0) {
                r1 = c5775;
                r1 = c5776;
                r1 = c5776;
                r1 = c5776;
                r1 = c5776;
                c22185 = c22184;
            } else {
                r1 = c5775;
                list = (List) this.f64144.f71474.get(Integer.valueOf(r1.f19839));
                if (list != null) {
                    r1 = c5775;
                    r1 = c5776;
                    r1 = c5776;
                    r1 = c5776;
                    r1 = c5776;
                    c22185 = c22184;
                } else {
                    r1 = c5775;
                    r1 = c5776;
                    r1 = c5776;
                    r1 = c5776;
                    r1 = c5776;
                    c22185 = c22184;
                }
            }
        }
        return c22185;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2769 m45876(C19945 c19945) {
        C18866 c18866M45871 = c19945.m45871();
        if (c18866M45871 == null || c18866M45871.f61253 == 0) {
            return null;
        }
        long j = c18866M45871.f61257[0];
        if (j <= 0 || j > 16777216) {
            return null;
        }
        return new C2769(c18866M45871, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17707 m45870(C19945 c19945, long j) {
        List list;
        ArrayList arrayList;
        long j2;
        C19945 c19946 = c19945;
        long j3 = j;
        long jM34024 = C13955.m34024(c19946.f64143);
        c19946.f64141 = jM34024;
        if (j3 <= 0 || j3 >= jM34024 || j3 > 16777216) {
            return null;
        }
        c19946.f64145 = j3;
        C10994 c10994M45877 = c19945.m45877();
        c19946.f64142 = c10994M45877;
        if (c10994M45877 == null || C10994.m27837(c10994M45877)) {
            return null;
        }
        ArrayList arrayListM27838 = C10994.m27838(c19946.f64142, 1);
        if (arrayListM27838.size() != 1) {
            return null;
        }
        C5775 c5775 = (C5775) arrayListM27838.get(0);
        c19946.f64144 = new C22183(c19946.f64141);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        while (true) {
            long j4 = c19946.f64141;
            if (j3 < j4) {
                C7244 c7244M45869 = c19946.m45869(j3, j4);
                if (c7244M45869.f23887 == C16961.f55431) {
                    arrayList2.add(Long.valueOf(j3));
                } else if (c7244M45869.f23887 == C16961.f55429) {
                    arrayList3.add(c7244M45869);
                } else if (c7244M45869.f23887 != C16961.f55441) {
                    return null;
                }
                j3 = c7244M45869.f23885;
            } else {
                if (j3 != j4 || arrayList2.isEmpty()) {
                    return null;
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                long j5 = Long.MIN_VALUE;
                int i = 0;
                while (i < arrayList2.size()) {
                    Long l2 = (Long) arrayList2.get(i);
                    long jLongValue = l2.longValue();
                    int i2 = i + 1;
                    long jLongValue2 = i2 < arrayList2.size() ? ((Long) arrayList2.get(i2)).longValue() : c19946.f64141;
                    long j6 = j5;
                    long j7 = jLongValue2 - jLongValue;
                    if (j7 <= 0 || j7 > 2147483647L || (list = (List) c19946.m45873(jLongValue).f74502.get(Integer.valueOf(c5775.f19839))) == null) {
                        return null;
                    }
                    ArrayList arrayList7 = arrayList2;
                    if (list.size() != 1) {
                        return null;
                    }
                    C2046 c2046 = (C2046) list.get(0);
                    if (!c2046.f6807 || !c2046.f6808) {
                        return null;
                    }
                    m45874(c2046, jLongValue, jLongValue2);
                    Iterator it = ((ArrayList) c2046.f6804).iterator();
                    while (it.hasNext()) {
                        C11740 c11740 = (C11740) it.next();
                        Iterator it2 = it;
                        ArrayList arrayList8 = arrayList6;
                        int i3 = 0;
                        long j8 = j7;
                        long j9 = c11740.f37970;
                        while (i3 < c11740.f37966) {
                            int i4 = i2;
                            long jM39972 = C16961.m39972(j9, c11740.f37969[i3]);
                            Iterator it3 = arrayList3.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    throw new C25167();
                                }
                                C7244 c7244 = (C7244) it3.next();
                                if (c7244.f23888 < jLongValue || c7244.f23885 > jLongValue2 || j9 < c7244.f23886 || jM39972 > c7244.f23885) {
                                }
                            }
                            i3++;
                            j9 = jM39972;
                            i2 = i4;
                        }
                        arrayList6 = arrayList8;
                        j7 = j8;
                        it = it2;
                    }
                    ArrayList arrayList9 = arrayList6;
                    long j10 = j7;
                    int i5 = i2;
                    Iterator it4 = ((ArrayList) c2046.f6804).iterator();
                    j5 = j6;
                    while (it4.hasNext()) {
                        C11740 c11741 = (C11740) it4.next();
                        ArrayList arrayList10 = arrayList3;
                        long jM39973 = C16961.m39972(c2046.f6803, c11741.f37968);
                        int i6 = 0;
                        while (i6 < c11741.f37966) {
                            if (c11741.f37967[i6]) {
                                long jM40007 = C16961.m40007(C16961.m39972(jM39973, c11741.f37965[i6]), c5775.f19841);
                                if (jM40007 <= j5) {
                                    return null;
                                }
                                arrayList4.add(Long.valueOf(jM40007));
                                arrayList5.add(l2);
                                j2 = j10;
                                arrayList = arrayList9;
                                arrayList.add(Integer.valueOf((int) j2));
                                j5 = jM40007;
                            } else {
                                arrayList = arrayList9;
                                j2 = j10;
                            }
                            jM39973 = C16961.m39972(jM39973, c11741.f37971[i6]);
                            i6++;
                            it4 = it4;
                            j10 = j2;
                            c5775 = c5775;
                            arrayList9 = arrayList;
                        }
                        arrayList3 = arrayList10;
                    }
                    c19946 = c19945;
                    arrayList6 = arrayList9;
                    arrayList2 = arrayList7;
                    i = i5;
                }
                ArrayList arrayList11 = arrayList6;
                if (arrayList4.isEmpty()) {
                    return null;
                }
                int size = arrayList4.size();
                long[] jArr = new long[size];
                long[] jArr2 = new long[size];
                int[] iArr = new int[size];
                for (int i7 = 0; i7 < size; i7++) {
                    jArr[i7] = ((Long) arrayList4.get(i7)).longValue();
                    jArr2[i7] = ((Long) arrayList5.get(i7)).longValue();
                    iArr[i7] = ((Integer) arrayList11.get(i7)).intValue();
                }
                return new C17707(jArr, jArr2, iArr);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C10994 m45877() {
        long jMin = Math.min(Math.min(this.f64141, 16777216L), this.f64145);
        long j = 0;
        while (j < jMin) {
            C7244 c7244M45869 = m45869(j, this.f64141);
            if (c7244M45869.f23887 == C16961.f55464) {
                return null;
            }
            if (c7244M45869.f23887 == C16961.f55457) {
                if (C7244.m19870(c7244M45869) > 4194304) {
                    return null;
                }
                byte[] bArrM34025 = C13955.m34025(this.f64143, c7244M45869.f23886, (int) C7244.m19870(c7244M45869));
                C10994 c10994 = new C10994();
                int i = 0;
                for (C8735 c8735 : C16961.m40008(0, bArrM34025.length, bArrM34025)) {
                    int i2 = 1;
                    if (c8735.f28410 == C16961.f55436) {
                        int i3 = c8735.f28411;
                        int i4 = bArrM34025[i3] & 255;
                        if (i4 != 0 && i4 != 1) {
                            throw new C25167();
                        }
                        if (i4 == 1) {
                            c10994.f34742 = C16961.m40011(i3 + 20, bArrM34025);
                        } else {
                            c10994.f34742 = C16961.m40011(i3 + 12, bArrM34025);
                        }
                    } else if (c8735.f28410 == C16961.f55434) {
                        C5775 c5775 = new C5775(i);
                        for (C8735 c8736 : C16961.m40008(c8735.f28411, c8735.f28409, bArrM34025)) {
                            int i5 = 8;
                            int i6 = 4;
                            if (c8736.f28410 == C16961.f55437) {
                                int i7 = c8736.f28411;
                                int i8 = bArrM34025[i7] & 255;
                                if (i8 != 0 && i8 != i2) {
                                    throw new C25167();
                                }
                                if (i8 == i2) {
                                    c5775.f19839 = C16961.m40001(i7 + 20, bArrM34025);
                                    c5775.f19840 = C16961.m39988(i7 + 28, 8, bArrM34025);
                                } else {
                                    c5775.f19839 = C16961.m40001(i7 + 12, bArrM34025);
                                    c5775.f19840 = C16961.m39988(i7 + 20, 4, bArrM34025);
                                }
                            } else if (c8736.f28410 == C16961.f55465) {
                                for (C8735 c8737 : C16961.m40008(c8736.f28411, c8736.f28409, bArrM34025)) {
                                    if (c8737.f28410 == C16961.f55444) {
                                        int i9 = c8737.f28411;
                                        int i10 = bArrM34025[i9] & 255;
                                        if (i10 != 0 && i10 != i2) {
                                            throw new C25167();
                                        }
                                        if (i10 == i2) {
                                            c5775.f19841 = C16961.m40011(i9 + 20, bArrM34025);
                                            c5775.f19844 = C16961.m39988(i9 + 24, i5, bArrM34025);
                                        } else {
                                            c5775.f19841 = C16961.m40011(i9 + 12, bArrM34025);
                                            c5775.f19844 = C16961.m39988(i9 + 16, i6, bArrM34025);
                                        }
                                    } else if (c8737.f28410 == C16961.f55435) {
                                        int iM40001 = C16961.m40001(c8737.f28411 + i5, bArrM34025);
                                        if (iM40001 == C16961.f55456) {
                                            c5775.f19838 = i2;
                                        } else if (iM40001 == C16961.f55427) {
                                            c5775.f19838 = 2;
                                        }
                                    } else if (c8737.f28410 == C16961.f55463) {
                                        for (C8735 c8738 : C16961.m40008(c8737.f28411, c8737.f28409, bArrM34025)) {
                                            if (c8738.f28410 == C16961.f55438) {
                                                for (C8735 c8739 : C16961.m40008(c8738.f28411, c8738.f28409, bArrM34025)) {
                                                    if (c8739.f28410 == C16961.f55454) {
                                                        int i11 = c8739.f28411;
                                                        int iM40002 = C16961.m40001(i11 + 4, bArrM34025);
                                                        int i12 = i11 + i5;
                                                        for (int i13 = 0; i13 < iM40002 && i12 < c8739.f28409; i13++) {
                                                            C8735 c8735M40002 = C16961.m40002(i12, c8739.f28409, bArrM34025);
                                                            if (c8735M40002.f28410 == C16961.f55446 || c8735M40002.f28410 == C16961.f55449 || C16961.m39977(c8735M40002.f28411, bArrM34025, c8735M40002.f28409, C16961.f55453) || C16961.m39977(c8735M40002.f28411, bArrM34025, c8735M40002.f28409, C16961.f55428)) {
                                                                c5775.f19837 = true;
                                                            }
                                                            i12 = c8735M40002.f28409;
                                                        }
                                                    }
                                                    i5 = 8;
                                                }
                                            }
                                            i5 = 8;
                                        }
                                    }
                                    i2 = 1;
                                    i5 = 8;
                                    i6 = 4;
                                }
                            } else if (c8736.f28410 == C16961.f55461 || c8736.f28410 == C16961.f55455) {
                                c5775.f19843 = true;
                            }
                            i2 = 1;
                        }
                        if (c5775.f19839 == 0 || c5775.f19838 == 0) {
                            c5775 = null;
                        }
                        if (c5775 != null) {
                            C10994.m27834(c10994, c5775);
                        }
                    } else if (c8735.f28410 == C16961.f55445) {
                        for (C8735 c87310 : C16961.m40008(c8735.f28411, c8735.f28409, bArrM34025)) {
                            if (c87310.f28410 == C16961.f55451) {
                                int i14 = c87310.f28411;
                                int i15 = bArrM34025[i14] & 255;
                                if (i15 != 0 && i15 != 1) {
                                    throw new C25167();
                                }
                                int i16 = i14 + 4;
                                c10994.f34739 = i15 == 1 ? C16961.m39994(i16, bArrM34025) : C16961.m40011(i16, bArrM34025);
                            } else if (c87310.f28410 == C16961.f55460) {
                                int i17 = c87310.f28411;
                                c10994.f34738.put(Integer.valueOf(C16961.m40001(i17 + 4, bArrM34025)), new C5029(C16961.m40001(i17 + 8, bArrM34025) - 1, C16961.m39987(i17 + 12, bArrM34025), C16961.m39987(i17 + 16, bArrM34025), C16961.m40001(i17 + 20, bArrM34025)));
                            }
                        }
                    } else if (c8735.f28410 == C16961.f55464) {
                        c10994.f34741 = true;
                    }
                    i = 0;
                }
                C10994.m27841(c10994);
                return c10994;
            }
            j = c7244M45869.f23885;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m45875(C5775 c5775) {
        List list = (List) this.f64144.f71474.get(Integer.valueOf(c5775.f19839));
        return (list == null || list.isEmpty() || list.size() > 4096) ? false : true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C15469 m45878(C5775 c5775) {
        List list = (List) this.f64144.f71474.get(Integer.valueOf(c5775.f19839));
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (C15469) C7750.m21093(1, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45874(C2046 c2046, long j, long j2) {
        for (C11740 c11740 : (ArrayList) c2046.f6804) {
            long j3 = c11740.f37970;
            int i = 0;
            while (i < c11740.f37966) {
                long j4 = c11740.f37969[i];
                long jM39972 = C16961.m39972(j3, j4);
                if (j3 < j || j4 < 0 || jM39972 > j2) {
                    throw new C25167();
                }
                i++;
                j3 = jM39972;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22929 m45873(long j) {
        C2046 c2046M7046;
        C19945 c19945 = this;
        long j2 = j;
        C7244 c7244M45869 = c19945.m45869(j2, c19945.f64141);
        if (c7244M45869.f23887 != C16961.f55431 || C7244.m19870(c7244M45869) > 4194304 || c7244M45869.f23885 > c19945.f64144.f71475) {
            throw new C25167();
        }
        byte[] bArrM34025 = C13955.m34025(c19945.f64143, j2, (int) c7244M45869.f23890);
        C22929 c22929 = new C22929();
        Iterator it = C16961.m40008((int) c7244M45869.f23889, bArrM34025.length, bArrM34025).iterator();
        while (it.hasNext()) {
            C8735 c8735 = (C8735) it.next();
            if (c8735.f28410 == C16961.f55447) {
                ArrayList<C8735> arrayList = new ArrayList();
                C8735 c8736 = null;
                C8735 c8737 = null;
                for (C8735 c8738 : C16961.m40008(c8735.f28411, c8735.f28409, bArrM34025)) {
                    if (c8738.f28410 == C16961.f55430) {
                        c8736 = c8738;
                    } else if (c8738.f28410 == C16961.f55440) {
                        c8737 = c8738;
                    } else if (c8738.f28410 == C16961.f55443) {
                        arrayList.add(c8738);
                    } else if (C16961.m39976(c8738.f28410) || (c8738.f28410 == C16961.f55462 && C16961.m39978(bArrM34025, c8738))) {
                        throw new C25167();
                    }
                }
                if (c8736 == null || arrayList.isEmpty()) {
                    throw new C25167();
                }
                int i = c8736.f28411;
                int iM40001 = C16961.m40001(i, bArrM34025);
                int iM40002 = C16961.m40001(i + 4, bArrM34025);
                int i2 = i + 8;
                C5775 c5775 = (C5775) c19945.f64142.f34740.get(Integer.valueOf(iM40002));
                if (c5775 == null) {
                    c2046M7046 = C2046.m7046(iM40002);
                } else {
                    C5029 c5029M27832 = C10994.m27832(c19945.f64142, iM40002);
                    if (c5029M27832 == null) {
                        throw new C25167();
                    }
                    long unused = c5775.f19841;
                    C2046 c2046 = new C2046(iM40002, 0);
                    c2046.f6809 = j2;
                    int i3 = iM40001 & 1;
                    if (i3 != 0) {
                        c2046.f6809 = C16961.m39994(i2, bArrM34025);
                        i2 = i + 16;
                    }
                    c2046.f6808 = i3 == 0 && (131072 & iM40001) != 0;
                    int iM40003 = c5029M27832.f17432;
                    int iM39987 = c5029M27832.f17431;
                    int iM39988 = c5029M27832.f17434;
                    int iM40004 = c5029M27832.f17433;
                    if ((iM40001 & 2) != 0) {
                        iM40003 = C16961.m40001(i2, bArrM34025) - 1;
                        i2 += 4;
                    }
                    if ((iM40001 & 8) != 0) {
                        iM39987 = C16961.m39987(i2, bArrM34025);
                        i2 += 4;
                    }
                    if ((iM40001 & 16) != 0) {
                        iM39988 = C16961.m39987(i2, bArrM34025);
                        i2 += 4;
                    }
                    if ((iM40001 & 32) != 0) {
                        iM40004 = C16961.m40001(i2, bArrM34025);
                    }
                    c2046.f6805 = new C5029(iM40003, iM39987, iM39988, iM40004);
                    c2046M7046 = c2046;
                }
                if (!c2046M7046.f6810) {
                    if (c8737 != null) {
                        c2046M7046.f6807 = true;
                        int i4 = c8737.f28411;
                        int i5 = bArrM34025[i4] & 255;
                        if (i5 != 0 && i5 != 1) {
                            throw new C25167();
                        }
                        int i6 = i4 + 4;
                        c2046M7046.f6803 = i5 == 1 ? C16961.m39994(i6, bArrM34025) : C16961.m40011(i6, bArrM34025);
                    }
                    long jM39972 = 0;
                    int i7 = 0;
                    for (C8735 c8739 : arrayList) {
                        int iM39989 = C16961.m39987(c8739.f28411 + 4, bArrM34025);
                        if (iM39989 <= 0 || iM39989 > 4096 || i7 > 4096 - iM39989) {
                            throw new C25167();
                        }
                        int i8 = c8739.f28411;
                        int iM40005 = C16961.m40001(i8, bArrM34025);
                        int iM399810 = C16961.m39987(i8 + 4, bArrM34025);
                        int i9 = i8 + 8;
                        if (iM399810 <= 0 || iM399810 > 4096) {
                            throw new C25167();
                        }
                        C11740 c11740 = new C11740(iM399810);
                        c11740.f37968 = jM39972;
                        c11740.f37970 = c2046M7046.f6809;
                        if ((iM40005 & 1) != 0) {
                            c11740.f37970 = C16961.m39972(c11740.f37970, C16961.m40001(i9, bArrM34025));
                            i9 = i8 + 12;
                        }
                        boolean z = (iM40005 & 4) != 0;
                        int iM40006 = c2046M7046.f6805.f17433;
                        if (z) {
                            iM40006 = C16961.m40001(i9, bArrM34025);
                            i9 += 4;
                        }
                        boolean z2 = (iM40005 & 256) != 0;
                        boolean z3 = (iM40005 & 512) != 0;
                        boolean z4 = (iM40005 & 1024) != 0;
                        boolean z5 = (iM40005 & 2048) != 0;
                        int i10 = iM40006;
                        for (int i11 = 0; i11 < iM399810; i11++) {
                            c11740.f37971[i11] = z2 ? C16961.m39987(i9, bArrM34025) : c2046M7046.f6805.f17431;
                            if (z2) {
                                i9 += 4;
                            }
                            c11740.f37969[i11] = z3 ? C16961.m39987(i9, bArrM34025) : c2046M7046.f6805.f17434;
                            if (z3) {
                                i9 += 4;
                            }
                            int iM40007 = z4 ? C16961.m40001(i9, bArrM34025) : (i7 + i11 == 0 && z) ? i10 : c2046M7046.f6805.f17433;
                            if (z4) {
                                i9 += 4;
                            }
                            if (z5) {
                                c11740.f37965[i11] = C16961.m40001(i9, bArrM34025);
                                i9 += 4;
                            }
                            c11740.f37967[i11] = ((iM40007 >> 16) & 1) == 0;
                        }
                        jM39972 = C16961.m39972(jM39972, C11740.m29485(c11740));
                        i7 += c11740.f37966;
                        ((ArrayList) c2046M7046.f6804).add(c11740);
                        it = it;
                    }
                }
                Iterator it2 = it;
                c22929.f74503.add(c2046M7046);
                if (!c2046M7046.f6810) {
                    ((List) C11392.computeIfAbsent(c22929.f74502, Integer.valueOf(c2046M7046.f6806), new C18964(1))).add(c2046M7046);
                }
                c19945 = this;
                j2 = j;
                it = it2;
            }
        }
        return c22929;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C7244 m45869(long j, long j2) {
        long jM39994;
        if (j >= 0) {
            long j3 = 8;
            long j4 = j + 8;
            if (j4 <= j2) {
                C13955 c13955 = this.f64143;
                byte[] bArrM34025 = C13955.m34025(c13955, j, 8);
                long jM40011 = C16961.m40011(0, bArrM34025);
                int iM40001 = C16961.m40001(4, bArrM34025);
                if (jM40011 == 1) {
                    if (j + 16 > j2) {
                        throw new C25167();
                    }
                    jM39994 = C16961.m39994(0, C13955.m34025(c13955, j4, 8));
                    j3 = 16;
                } else {
                    if (jM40011 == 0) {
                        throw new C25167();
                    }
                    jM39994 = jM40011;
                }
                long jM39972 = C16961.m39972(j, jM39994);
                if (jM39994 < j3 || jM39972 > j2) {
                    throw new C25167();
                }
                return new C7244(j, jM39994, j3, jM39972, iM40001);
            }
        }
        throw new C25167();
    }
}
