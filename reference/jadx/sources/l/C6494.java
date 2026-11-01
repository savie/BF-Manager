package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: R790 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6494 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f21901 = C17492.FOREVER_NS;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f21902;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5083 f21903;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C12845 f21904;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C0849 f21905;

    public C6494(InterfaceC3153 interfaceC3153) {
        this.f21903 = new C5083(interfaceC3153);
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
    /* JADX WARN: Type inference failed for: r19v1, types: [l.᩸ۗ۬] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [l.᩸ۗ۬] */
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
    /* JADX WARN: Type inference failed for: r4v33, types: [l.ۘۘܰ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3693 m17691() {
        C0849 c0849;
        C0849 c08410;
        long jM44059;
        long jM440510;
        int i;
        ArrayList arrayListM31860;
        ArrayList arrayListM31861;
        C21311 c21311;
        ?? r1;
        List<C22723> list;
        C0849 c08411;
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
        C0849 c08412;
        long[] jArr3;
        long[] jArr4;
        Iterator it2;
        C21311 c21312;
        C5083 c5083 = this.f21903;
        this.f21902 = C5083.m14176(c5083);
        this.f21901 = C17492.FOREVER_NS;
        C12845 c12845M17696 = m17696();
        this.f21904 = c12845M17696;
        if (c12845M17696 == null || C12845.m31858(c12845M17696)) {
            return null;
        }
        long j2 = this.f21902;
        int i5 = 1;
        if (j2 >= 16) {
            C2260 c2260M17689 = m17689(j2 - 16, j2);
            if (c2260M17689.f8098 == C19195.f62002 && c2260M17689.f8093 == 16) {
                long j3 = c2260M17689.f8094;
                long j4 = this.f21902;
                if (j3 != j4) {
                    c0849 = null;
                } else {
                    long jM440511 = C19195.m44059(0, C5083.m14177(c5083, j4 - 4, 4));
                    if (jM440511 <= 0 || jM440511 > 4194304) {
                        c0849 = null;
                    } else {
                        long j5 = this.f21902;
                        if (jM440511 > j5) {
                            c0849 = null;
                        } else {
                            long j6 = j5 - jM440511;
                            C2260 c2260M176810 = m17689(j6, j5);
                            if (c2260M176810.f8098 == C19195.f62007 && c2260M176810.f8094 == this.f21902) {
                                byte[] bArrM14177 = C5083.m14177(c5083, c2260M176810.f8096, (int) C2260.m6939(c2260M176810));
                                C0849 c08413 = new C0849(j6);
                                int i6 = 4096;
                                int i7 = 2;
                                for (C11434 c11434 : C19195.m44090(0, bArrM14177.length, bArrM14177)) {
                                    if (c11434.f38485 == C19195.f61974) {
                                        int i8 = c11434.f38486;
                                        int i9 = bArrM14177[i8] & 255;
                                        if (i9 != 0 && i9 != i5) {
                                            throw new C7906();
                                        }
                                        int iM44072 = C19195.m44072(i8 + 4, bArrM14177);
                                        byte b = bArrM14177[i8 + 11];
                                        int i10 = b & 255;
                                        int i11 = ((i10 >> 4) & 3) + 1;
                                        int i12 = ((i10 >> i7) & 3) + i5;
                                        int i13 = (b & 3) + i5;
                                        int iM44073 = C19195.m44072(i8 + 12, bArrM14177);
                                        int i14 = i8 + 16;
                                        if (iM44073 < 0 || iM44073 > i6) {
                                            throw new C7906();
                                        }
                                        List list2 = (List) C9735.computeIfAbsent(c08413.f3492, Integer.valueOf(iM44072), new C7777(1));
                                        int i15 = 0;
                                        while (i15 < iM44073) {
                                            if (i9 == i5) {
                                                jM44059 = C19195.m44103(i14, bArrM14177);
                                                jM440510 = C19195.m44103(i14 + 8, bArrM14177);
                                                i = i14 + 16;
                                            } else {
                                                jM44059 = C19195.m44059(i14, bArrM14177);
                                                jM440510 = C19195.m44059(i14 + 4, bArrM14177);
                                                i = i14 + 8;
                                            }
                                            long j7 = jM44059;
                                            long j8 = jM440510;
                                            int iM44058 = C19195.m44058(i, i11, bArrM14177);
                                            int i16 = i + i11;
                                            int iM44059 = C19195.m44058(i16, i12, bArrM14177);
                                            int i17 = i16 + i12;
                                            int iM440510 = C19195.m44058(i17, i13, bArrM14177);
                                            i14 = i17 + i13;
                                            if (j7 < 0 || j8 < 0 || iM44058 <= 0 || iM44059 <= 0 || iM440510 <= 0) {
                                                throw new C7906();
                                            }
                                            list2.add(new C22723(j7, iM44058 - 1, iM44059 - 1, iM440510 - 1, j8));
                                            i15++;
                                            i5 = 1;
                                        }
                                    }
                                    i6 = 4096;
                                    i7 = 2;
                                    i5 = 1;
                                }
                                c0849 = c08413;
                            } else {
                                c0849 = null;
                            }
                        }
                    }
                }
            } else {
                c0849 = null;
            }
            c08410 = c0849;
            this.f21905 = c0849;
            if (c0849 == null) {
                r1 = c21311;
                r1 = c21312;
                r1 = c21312;
                r1 = c21312;
                r1 = c21312;
                c08411 = c08410;
            } else {
                arrayListM31860 = C12845.m31860(this.f21904, 1);
                if (!arrayListM31860.isEmpty()) {
                    arrayListM31861 = C12845.m31860(this.f21904, 2);
                    if (arrayListM31861.size() == 1 || !m17695((C21311) arrayListM31861.get(0))) {
                        r1 = c08410;
                    } else {
                        c21311 = (C21311) arrayListM31861.get(0);
                    }
                } else if (arrayListM31860.size() == 1 || !m17695((C21311) arrayListM31860.get(0))) {
                    r1 = c08410;
                } else {
                    c21312 = (C21311) arrayListM31860.get(0);
                }
                if (r1 == 0) {
                    r1 = c21311;
                    r1 = c21312;
                    r1 = c21312;
                    r1 = c21312;
                    r1 = c21312;
                    c08411 = c08410;
                } else {
                    r1 = c21311;
                    list = (List) this.f21905.f3492.get(Integer.valueOf(r1.f69336));
                    if (list != null || list.isEmpty() || list.size() > 4096) {
                        r1 = c21311;
                        r1 = c21312;
                        r1 = c21312;
                        r1 = c21312;
                        r1 = c21312;
                        c08411 = c08410;
                    } else {
                        r1 = c21312;
                        ArrayList arrayList = new ArrayList();
                        long j9 = Long.MIN_VALUE;
                        long j10 = Long.MIN_VALUE;
                        for (C22723 c22723 : list) {
                            if (c22723.f74030 <= j9 || c22723.f74028 <= 0 || c22723.f74028 >= this.f21905.f3493) {
                                throw new C7906();
                            }
                            if (c22723.f74028 < j10) {
                                throw new C7906();
                            }
                            j9 = c22723.f74030;
                            if (c22723.f74028 != j10) {
                                arrayList.add(c22723);
                                j10 = c22723.f74028;
                            }
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            C19195.m44089(((C22723) it3.next()).f74030, r1.f69339);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int[] iArr3 = new int[size];
                            long[] jArr5 = new long[size];
                            long[] jArr6 = new long[size];
                            long[] jArr7 = new long[size];
                            HashMap map4 = new HashMap();
                            long jMin = C17492.FOREVER_NS;
                            for (Iterator it4 = this.f21904.m31853().iterator(); it4.hasNext(); it4 = it2) {
                                C21311 c21313 = (C21311) it4.next();
                                if (c21313.f69336 == r1.f69336) {
                                    C22723 c22723M17698 = m17698(c21313);
                                    if (c22723M17698 == null) {
                                        throw new C7906();
                                    }
                                    c08412 = c08410;
                                    jArr3 = jArr6;
                                    jArr4 = jArr7;
                                    it2 = it4;
                                    map4.put(Integer.valueOf(c21313.f69336), new C14962(c21313, c22723M17698.f74028, 0));
                                    jMin = Math.min(jMin, c22723M17698.f74028);
                                } else {
                                    c08412 = c08410;
                                    jArr3 = jArr6;
                                    jArr4 = jArr7;
                                    it2 = it4;
                                    long j11 = c21313.f69335;
                                    if (j11 > 0) {
                                        map4.put(Integer.valueOf(c21313.f69336), C14962.m35942(c21313, j11));
                                    } else {
                                        C22723 c22723M17699 = m17698(c21313);
                                        if (c22723M17699 == null) {
                                            throw new C7906();
                                        }
                                        map4.put(Integer.valueOf(c21313.f69336), new C14962(c21313, c22723M17699.f74028, 0));
                                        jMin = Math.min(jMin, c22723M17699.f74028);
                                    }
                                    c08410 = c08412;
                                    jArr6 = jArr3;
                                    jArr7 = jArr4;
                                }
                                c08410 = c08412;
                                jArr6 = jArr3;
                                jArr7 = jArr4;
                            }
                            c08411 = c08410;
                            long[] jArr8 = jArr6;
                            long[] jArr9 = jArr7;
                            int i18 = 0;
                            ?? r2 = r1;
                            if (jMin != C17492.FOREVER_NS) {
                                while (jMin < this.f21905.f3493) {
                                    C2260 c2260M176811 = m17689(jMin, this.f21905.f3493);
                                    if (c2260M176811.f8098 == C19195.f61986) {
                                        C3671 c3671M17690 = m17690(jMin);
                                        Iterator it5 = map4.values().iterator();
                                        ?? r3 = r2;
                                        while (it5.hasNext()) {
                                            C14962 c14962 = (C14962) it5.next();
                                            if (!C14962.m35944(c14962) || jMin < c14962.f48861) {
                                                r111 = r3;
                                                i4 = size;
                                                it = it5;
                                                map3 = map4;
                                                j = jMin;
                                            } else {
                                                List list3 = (List) c3671M17690.f13430.get(Integer.valueOf(c14962.f48860.f69336));
                                                if (list3 == null || list3.size() != 1) {
                                                    throw new C7906();
                                                }
                                                C17783 c17783 = (C17783) list3.get(i18);
                                                if (!c17783.f56391) {
                                                    throw new C7906();
                                                }
                                                long j12 = c14962.f48858;
                                                Iterator it6 = ((ArrayList) c17783.f56389).iterator();
                                                long jMax = Long.MIN_VALUE;
                                                ?? r4 = r3;
                                                while (it6.hasNext()) {
                                                    C18489 c18489 = (C18489) it6.next();
                                                    ?? r112 = r4;
                                                    int i19 = size;
                                                    C17783 c17784 = c17783;
                                                    Iterator it7 = it5;
                                                    long jM44064 = C19195.m44064(c17783.f56386, c18489.f58929);
                                                    int i20 = 0;
                                                    while (i20 < c18489.f58927) {
                                                        jMax = Math.max(jMax, C19195.m44064(C19195.m44064(jM44064, c18489.f58925[i20]), c18489.f58924[i20]));
                                                        jM44064 = C19195.m44064(jM44064, c18489.f58924[i20]);
                                                        i20++;
                                                        map4 = map4;
                                                        it6 = it6;
                                                        jMin = jMin;
                                                    }
                                                    r4 = r112;
                                                    size = i19;
                                                    it5 = it7;
                                                    c17783 = c17784;
                                                }
                                                r111 = r4;
                                                i4 = size;
                                                it = it5;
                                                map3 = map4;
                                                j = jMin;
                                                if (jMax < 0) {
                                                    throw new C7906();
                                                }
                                                c14962.f48858 = Math.max(j12, jMax);
                                                i18 = 0;
                                            }
                                            c3671M17690 = c3671M17690;
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
                                        int unused = C19195.f61978;
                                    }
                                    jMin = c2260M176811.f8094;
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
                                if (jMin != this.f21905.f3493) {
                                    throw new C7906();
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
                                long jM35940 = C14962.m35940((C14962) it8.next());
                                if (jM35940 <= 0) {
                                    throw new C7906();
                                }
                                jMax2 = Math.max(jMax2, jM35940);
                            }
                            int i21 = 0;
                            int i22 = i2;
                            while (i21 < i22) {
                                C22723 c22724 = (C22723) arrayList.get(i21);
                                int i23 = i21 + 1;
                                long j13 = i23 < i22 ? ((C22723) arrayList.get(i23)).f74028 : this.f21905.f3493;
                                long j14 = j13 - c22724.f74028;
                                if (j14 > 0 && j14 <= 2147483647L) {
                                    C3671 c3671M17691 = m17690(c22724.f74028);
                                    if (c22724.f74027 < 0 || c22724.f74027 >= c3671M17691.f13431.size()) {
                                        throw new C7906();
                                    }
                                    C17783 c17785 = (C17783) c3671M17691.f13431.get(c22724.f74027);
                                    if (c17785.f56384 != r19.f69336) {
                                        throw new C7906();
                                    }
                                    List list4 = (List) c3671M17691.f13430.get(Integer.valueOf(r19.f69336));
                                    if (list4 == null || list4.size() != 1) {
                                        throw new C7906();
                                    }
                                    if (c22724.f74029 < 0 || c22724.f74029 >= ((ArrayList) c17785.f56389).size()) {
                                        throw new C7906();
                                    }
                                    C18489 c184810 = (C18489) ((ArrayList) c17785.f56389).get(c22724.f74029);
                                    if (c22724.f74031 < 0 || c22724.f74031 >= c184810.f58927) {
                                        throw new C7906();
                                    }
                                    m17694(c17785, c22724.f74028, j13);
                                    if (!c184810.f58923[c22724.f74031]) {
                                        throw new C7906();
                                    }
                                    jArr[i21] = c22724.f74028;
                                    iArr[i21] = (int) j14;
                                    long jM44089 = C19195.m44089(c22724.f74030, r19.f69339);
                                    jArr8[i21] = jM44089;
                                    if (i21 <= 0 || jM44089 > jArr8[i21 - 1]) {
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
                            return new C3693(iArr, jArr, jArr9, jArr8);
                        }
                        r1 = c21311;
                        r1 = c21312;
                        r1 = c21312;
                        r1 = c21312;
                        r1 = c21312;
                        c08411 = c08410;
                    }
                }
            }
            return c08411;
        }
        c0849 = null;
        c08410 = null;
        this.f21905 = c0849;
        if (c0849 == null) {
            r1 = c21311;
            r1 = c21312;
            r1 = c21312;
            r1 = c21312;
            r1 = c21312;
            c08411 = c08410;
        } else {
            arrayListM31860 = C12845.m31860(this.f21904, 1);
            if (!arrayListM31860.isEmpty()) {
                arrayListM31861 = C12845.m31860(this.f21904, 2);
                if (arrayListM31861.size() == 1) {
                    r1 = c08410;
                } else {
                    r1 = c08410;
                }
            } else if (arrayListM31860.size() == 1) {
                r1 = c08410;
            } else {
                r1 = c08410;
            }
            if (r1 == 0) {
                r1 = c21311;
                r1 = c21312;
                r1 = c21312;
                r1 = c21312;
                r1 = c21312;
                c08411 = c08410;
            } else {
                r1 = c21311;
                list = (List) this.f21905.f3492.get(Integer.valueOf(r1.f69336));
                if (list != null) {
                    r1 = c21311;
                    r1 = c21312;
                    r1 = c21312;
                    r1 = c21312;
                    r1 = c21312;
                    c08411 = c08410;
                } else {
                    r1 = c21311;
                    r1 = c21312;
                    r1 = c21312;
                    r1 = c21312;
                    r1 = c21312;
                    c08411 = c08410;
                }
            }
        }
        return c08411;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C13551 m17697(C6494 c6494) {
        C3693 c3693M17691 = c6494.m17691();
        if (c3693M17691 == null || c3693M17691.f13477 == 0) {
            return null;
        }
        long j = c3693M17691.f13474[0];
        if (j <= 0 || j > 16777216) {
            return null;
        }
        return new C13551(c3693M17691, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8612 m17693(C6494 c6494, long j) {
        List list;
        ArrayList arrayList;
        long j2;
        C6494 c6495 = c6494;
        long j3 = j;
        long jM14176 = C5083.m14176(c6495.f21903);
        c6495.f21902 = jM14176;
        if (j3 <= 0 || j3 >= jM14176 || j3 > 16777216) {
            return null;
        }
        c6495.f21901 = j3;
        C12845 c12845M17696 = c6494.m17696();
        c6495.f21904 = c12845M17696;
        if (c12845M17696 == null || C12845.m31858(c12845M17696)) {
            return null;
        }
        ArrayList arrayListM31860 = C12845.m31860(c6495.f21904, 1);
        if (arrayListM31860.size() != 1) {
            return null;
        }
        C21311 c21311 = (C21311) arrayListM31860.get(0);
        c6495.f21905 = new C0849(c6495.f21902);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        while (true) {
            long j4 = c6495.f21902;
            if (j3 < j4) {
                C2260 c2260M17689 = c6495.m17689(j3, j4);
                if (c2260M17689.f8098 == C19195.f61986) {
                    arrayList2.add(Long.valueOf(j3));
                } else if (c2260M17689.f8098 == C19195.f61978) {
                    arrayList3.add(c2260M17689);
                } else if (c2260M17689.f8098 != C19195.f61983) {
                    return null;
                }
                j3 = c2260M17689.f8094;
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
                    long jLongValue2 = i2 < arrayList2.size() ? ((Long) arrayList2.get(i2)).longValue() : c6495.f21902;
                    long j6 = j5;
                    long j7 = jLongValue2 - jLongValue;
                    if (j7 <= 0 || j7 > 2147483647L || (list = (List) c6495.m17690(jLongValue).f13430.get(Integer.valueOf(c21311.f69336))) == null) {
                        return null;
                    }
                    ArrayList arrayList7 = arrayList2;
                    if (list.size() != 1) {
                        return null;
                    }
                    C17783 c17783 = (C17783) list.get(0);
                    if (!c17783.f56391 || !c17783.f56387) {
                        return null;
                    }
                    m17694(c17783, jLongValue, jLongValue2);
                    Iterator it = ((ArrayList) c17783.f56389).iterator();
                    while (it.hasNext()) {
                        C18489 c18489 = (C18489) it.next();
                        Iterator it2 = it;
                        ArrayList arrayList8 = arrayList6;
                        int i3 = 0;
                        long j8 = j7;
                        long j9 = c18489.f58928;
                        while (i3 < c18489.f58927) {
                            int i4 = i2;
                            long jM44064 = C19195.m44064(j9, c18489.f58926[i3]);
                            Iterator it3 = arrayList3.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    throw new C7906();
                                }
                                C2260 c2260 = (C2260) it3.next();
                                if (c2260.f8095 < jLongValue || c2260.f8094 > jLongValue2 || j9 < c2260.f8096 || jM44064 > c2260.f8094) {
                                }
                            }
                            i3++;
                            j9 = jM44064;
                            i2 = i4;
                        }
                        arrayList6 = arrayList8;
                        j7 = j8;
                        it = it2;
                    }
                    ArrayList arrayList9 = arrayList6;
                    long j10 = j7;
                    int i5 = i2;
                    Iterator it4 = ((ArrayList) c17783.f56389).iterator();
                    j5 = j6;
                    while (it4.hasNext()) {
                        C18489 c184810 = (C18489) it4.next();
                        ArrayList arrayList10 = arrayList3;
                        long jM44065 = C19195.m44064(c17783.f56386, c184810.f58929);
                        int i6 = 0;
                        while (i6 < c184810.f58927) {
                            if (c184810.f58923[i6]) {
                                long jM44089 = C19195.m44089(C19195.m44064(jM44065, c184810.f58925[i6]), c21311.f69339);
                                if (jM44089 <= j5) {
                                    return null;
                                }
                                arrayList4.add(Long.valueOf(jM44089));
                                arrayList5.add(l2);
                                j2 = j10;
                                arrayList = arrayList9;
                                arrayList.add(Integer.valueOf((int) j2));
                                j5 = jM44089;
                            } else {
                                arrayList = arrayList9;
                                j2 = j10;
                            }
                            jM44065 = C19195.m44064(jM44065, c184810.f58924[i6]);
                            i6++;
                            it4 = it4;
                            j10 = j2;
                            c21311 = c21311;
                            arrayList9 = arrayList;
                        }
                        arrayList3 = arrayList10;
                    }
                    c6495 = c6494;
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
                return new C8612(jArr, jArr2, iArr);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C12845 m17696() {
        long jMin = Math.min(Math.min(this.f21902, 16777216L), this.f21901);
        long j = 0;
        while (j < jMin) {
            C2260 c2260M17689 = m17689(j, this.f21902);
            if (c2260M17689.f8098 == C19195.f61985) {
                return null;
            }
            if (c2260M17689.f8098 == C19195.f62004) {
                if (C2260.m6939(c2260M17689) > 4194304) {
                    return null;
                }
                byte[] bArrM14177 = C5083.m14177(this.f21903, c2260M17689.f8096, (int) C2260.m6939(c2260M17689));
                C12845 c12845 = new C12845();
                int i = 0;
                for (C11434 c11434 : C19195.m44090(0, bArrM14177.length, bArrM14177)) {
                    int i2 = 1;
                    if (c11434.f38485 == C19195.f61989) {
                        int i3 = c11434.f38486;
                        int i4 = bArrM14177[i3] & 255;
                        if (i4 != 0 && i4 != 1) {
                            throw new C7906();
                        }
                        if (i4 == 1) {
                            c12845.f42741 = C19195.m44059(i3 + 20, bArrM14177);
                        } else {
                            c12845.f42741 = C19195.m44059(i3 + 12, bArrM14177);
                        }
                    } else if (c11434.f38485 == C19195.f61980) {
                        C21311 c21311 = new C21311(i);
                        for (C11434 c11435 : C19195.m44090(c11434.f38486, c11434.f38484, bArrM14177)) {
                            int i5 = 8;
                            int i6 = 4;
                            if (c11435.f38485 == C19195.f61988) {
                                int i7 = c11435.f38486;
                                int i8 = bArrM14177[i7] & 255;
                                if (i8 != 0 && i8 != i2) {
                                    throw new C7906();
                                }
                                if (i8 == i2) {
                                    c21311.f69336 = C19195.m44072(i7 + 20, bArrM14177);
                                    c21311.f69332 = C19195.m44084(i7 + 28, 8, bArrM14177);
                                } else {
                                    c21311.f69336 = C19195.m44072(i7 + 12, bArrM14177);
                                    c21311.f69332 = C19195.m44084(i7 + 20, 4, bArrM14177);
                                }
                            } else if (c11435.f38485 == C19195.f62009) {
                                for (C11434 c11436 : C19195.m44090(c11435.f38486, c11435.f38484, bArrM14177)) {
                                    if (c11436.f38485 == C19195.f61984) {
                                        int i9 = c11436.f38486;
                                        int i10 = bArrM14177[i9] & 255;
                                        if (i10 != 0 && i10 != i2) {
                                            throw new C7906();
                                        }
                                        if (i10 == i2) {
                                            c21311.f69339 = C19195.m44059(i9 + 20, bArrM14177);
                                            c21311.f69333 = C19195.m44084(i9 + 24, i5, bArrM14177);
                                        } else {
                                            c21311.f69339 = C19195.m44059(i9 + 12, bArrM14177);
                                            c21311.f69333 = C19195.m44084(i9 + 16, i6, bArrM14177);
                                        }
                                    } else if (c11436.f38485 == C19195.f61994) {
                                        int iM44072 = C19195.m44072(c11436.f38486 + i5, bArrM14177);
                                        if (iM44072 == C19195.f61982) {
                                            c21311.f69337 = i2;
                                        } else if (iM44072 == C19195.f62000) {
                                            c21311.f69337 = 2;
                                        }
                                    } else if (c11436.f38485 == C19195.f62003) {
                                        for (C11434 c11437 : C19195.m44090(c11436.f38486, c11436.f38484, bArrM14177)) {
                                            if (c11437.f38485 == C19195.f61993) {
                                                for (C11434 c11438 : C19195.m44090(c11437.f38486, c11437.f38484, bArrM14177)) {
                                                    if (c11438.f38485 == C19195.f62001) {
                                                        int i11 = c11438.f38486;
                                                        int iM44073 = C19195.m44072(i11 + 4, bArrM14177);
                                                        int i12 = i11 + i5;
                                                        for (int i13 = 0; i13 < iM44073 && i12 < c11438.f38484; i13++) {
                                                            C11434 c11434M44073 = C19195.m44073(i12, c11438.f38484, bArrM14177);
                                                            if (c11434M44073.f38485 == C19195.f61973 || c11434M44073.f38485 == C19195.f62008 || C19195.m44069(c11434M44073.f38486, bArrM14177, c11434M44073.f38484, C19195.f61972) || C19195.m44069(c11434M44073.f38486, bArrM14177, c11434M44073.f38484, C19195.f61990)) {
                                                                c21311.f69334 = true;
                                                            }
                                                            i12 = c11434M44073.f38484;
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
                            } else if (c11435.f38485 == C19195.f61975 || c11435.f38485 == C19195.f61981) {
                                c21311.f69338 = true;
                            }
                            i2 = 1;
                        }
                        if (c21311.f69336 == 0 || c21311.f69337 == 0) {
                            c21311 = null;
                        }
                        if (c21311 != null) {
                            C12845.m31857(c12845, c21311);
                        }
                    } else if (c11434.f38485 == C19195.f61987) {
                        for (C11434 c11439 : C19195.m44090(c11434.f38486, c11434.f38484, bArrM14177)) {
                            if (c11439.f38485 == C19195.f61998) {
                                int i14 = c11439.f38486;
                                int i15 = bArrM14177[i14] & 255;
                                if (i15 != 0 && i15 != 1) {
                                    throw new C7906();
                                }
                                int i16 = i14 + 4;
                                c12845.f42744 = i15 == 1 ? C19195.m44103(i16, bArrM14177) : C19195.m44059(i16, bArrM14177);
                            } else if (c11439.f38485 == C19195.f61996) {
                                int i17 = c11439.f38486;
                                c12845.f42742.put(Integer.valueOf(C19195.m44072(i17 + 4, bArrM14177)), new C22017(C19195.m44072(i17 + 8, bArrM14177) - 1, C19195.m44083(i17 + 12, bArrM14177), C19195.m44083(i17 + 16, bArrM14177), C19195.m44072(i17 + 20, bArrM14177)));
                            }
                        }
                    } else if (c11434.f38485 == C19195.f61985) {
                        c12845.f42745 = true;
                    }
                    i = 0;
                }
                C12845.m31852(c12845);
                return c12845;
            }
            j = c2260M17689.f8094;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m17695(C21311 c21311) {
        List list = (List) this.f21905.f3492.get(Integer.valueOf(c21311.f69336));
        return (list == null || list.isEmpty() || list.size() > 4096) ? false : true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C22723 m17698(C21311 c21311) {
        List list = (List) this.f21905.f3492.get(Integer.valueOf(c21311.f69336));
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (C22723) C3012.m8974(1, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17694(C17783 c17783, long j, long j2) {
        for (C18489 c18489 : (ArrayList) c17783.f56389) {
            long j3 = c18489.f58928;
            int i = 0;
            while (i < c18489.f58927) {
                long j4 = c18489.f58926[i];
                long jM44064 = C19195.m44064(j3, j4);
                if (j3 < j || j4 < 0 || jM44064 > j2) {
                    throw new C7906();
                }
                i++;
                j3 = jM44064;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3671 m17690(long j) {
        C17783 c17783M41359;
        C6494 c6494 = this;
        long j2 = j;
        C2260 c2260M17689 = c6494.m17689(j2, c6494.f21902);
        if (c2260M17689.f8098 != C19195.f61986 || C2260.m6939(c2260M17689) > 4194304 || c2260M17689.f8094 > c6494.f21905.f3493) {
            throw new C7906();
        }
        byte[] bArrM14177 = C5083.m14177(c6494.f21903, j2, (int) c2260M17689.f8093);
        C3671 c3671 = new C3671();
        Iterator it = C19195.m44090((int) c2260M17689.f8097, bArrM14177.length, bArrM14177).iterator();
        while (it.hasNext()) {
            C11434 c11434 = (C11434) it.next();
            if (c11434.f38485 == C19195.f61977) {
                ArrayList<C11434> arrayList = new ArrayList();
                C11434 c11435 = null;
                C11434 c11436 = null;
                for (C11434 c11437 : C19195.m44090(c11434.f38486, c11434.f38484, bArrM14177)) {
                    if (c11437.f38485 == C19195.f61997) {
                        c11435 = c11437;
                    } else if (c11437.f38485 == C19195.f62010) {
                        c11436 = c11437;
                    } else if (c11437.f38485 == C19195.f61992) {
                        arrayList.add(c11437);
                    } else if (C19195.m44068(c11437.f38485) || (c11437.f38485 == C19195.f61976 && C19195.m44070(bArrM14177, c11437))) {
                        throw new C7906();
                    }
                }
                if (c11435 == null || arrayList.isEmpty()) {
                    throw new C7906();
                }
                int i = c11435.f38486;
                int iM44072 = C19195.m44072(i, bArrM14177);
                int iM44073 = C19195.m44072(i + 4, bArrM14177);
                int i2 = i + 8;
                C21311 c21311 = (C21311) c6494.f21904.f42743.get(Integer.valueOf(iM44073));
                if (c21311 == null) {
                    c17783M41359 = C17783.m41359(iM44073);
                } else {
                    C22017 c22017M31855 = C12845.m31855(c6494.f21904, iM44073);
                    if (c22017M31855 == null) {
                        throw new C7906();
                    }
                    long unused = c21311.f69339;
                    C17783 c17783 = new C17783(iM44073, 0);
                    c17783.f56390 = j2;
                    int i3 = iM44072 & 1;
                    if (i3 != 0) {
                        c17783.f56390 = C19195.m44103(i2, bArrM14177);
                        i2 = i + 16;
                    }
                    c17783.f56387 = i3 == 0 && (131072 & iM44072) != 0;
                    int iM44074 = c22017M31855.f71377;
                    int iM44083 = c22017M31855.f71376;
                    int iM44084 = c22017M31855.f71375;
                    int iM44075 = c22017M31855.f71378;
                    if ((iM44072 & 2) != 0) {
                        iM44074 = C19195.m44072(i2, bArrM14177) - 1;
                        i2 += 4;
                    }
                    if ((iM44072 & 8) != 0) {
                        iM44083 = C19195.m44083(i2, bArrM14177);
                        i2 += 4;
                    }
                    if ((iM44072 & 16) != 0) {
                        iM44084 = C19195.m44083(i2, bArrM14177);
                        i2 += 4;
                    }
                    if ((iM44072 & 32) != 0) {
                        iM44075 = C19195.m44072(i2, bArrM14177);
                    }
                    c17783.f56388 = new C22017(iM44074, iM44083, iM44084, iM44075);
                    c17783M41359 = c17783;
                }
                if (!c17783M41359.f56385) {
                    if (c11436 != null) {
                        c17783M41359.f56391 = true;
                        int i4 = c11436.f38486;
                        int i5 = bArrM14177[i4] & 255;
                        if (i5 != 0 && i5 != 1) {
                            throw new C7906();
                        }
                        int i6 = i4 + 4;
                        c17783M41359.f56386 = i5 == 1 ? C19195.m44103(i6, bArrM14177) : C19195.m44059(i6, bArrM14177);
                    }
                    long jM44064 = 0;
                    int i7 = 0;
                    for (C11434 c11438 : arrayList) {
                        int iM44085 = C19195.m44083(c11438.f38486 + 4, bArrM14177);
                        if (iM44085 <= 0 || iM44085 > 4096 || i7 > 4096 - iM44085) {
                            throw new C7906();
                        }
                        int i8 = c11438.f38486;
                        int iM44076 = C19195.m44072(i8, bArrM14177);
                        int iM44086 = C19195.m44083(i8 + 4, bArrM14177);
                        int i9 = i8 + 8;
                        if (iM44086 <= 0 || iM44086 > 4096) {
                            throw new C7906();
                        }
                        C18489 c18489 = new C18489(iM44086);
                        c18489.f58929 = jM44064;
                        c18489.f58928 = c17783M41359.f56390;
                        if ((iM44076 & 1) != 0) {
                            c18489.f58928 = C19195.m44064(c18489.f58928, C19195.m44072(i9, bArrM14177));
                            i9 = i8 + 12;
                        }
                        boolean z = (iM44076 & 4) != 0;
                        int iM44077 = c17783M41359.f56388.f71378;
                        if (z) {
                            iM44077 = C19195.m44072(i9, bArrM14177);
                            i9 += 4;
                        }
                        boolean z2 = (iM44076 & 256) != 0;
                        boolean z3 = (iM44076 & 512) != 0;
                        boolean z4 = (iM44076 & 1024) != 0;
                        boolean z5 = (iM44076 & 2048) != 0;
                        int i10 = iM44077;
                        for (int i11 = 0; i11 < iM44086; i11++) {
                            c18489.f58924[i11] = z2 ? C19195.m44083(i9, bArrM14177) : c17783M41359.f56388.f71376;
                            if (z2) {
                                i9 += 4;
                            }
                            c18489.f58926[i11] = z3 ? C19195.m44083(i9, bArrM14177) : c17783M41359.f56388.f71375;
                            if (z3) {
                                i9 += 4;
                            }
                            int iM44078 = z4 ? C19195.m44072(i9, bArrM14177) : (i7 + i11 == 0 && z) ? i10 : c17783M41359.f56388.f71378;
                            if (z4) {
                                i9 += 4;
                            }
                            if (z5) {
                                c18489.f58925[i11] = C19195.m44072(i9, bArrM14177);
                                i9 += 4;
                            }
                            c18489.f58923[i11] = ((iM44078 >> 16) & 1) == 0;
                        }
                        jM44064 = C19195.m44064(jM44064, C18489.m42876(c18489));
                        i7 += c18489.f58927;
                        ((ArrayList) c17783M41359.f56389).add(c18489);
                        it = it;
                    }
                }
                Iterator it2 = it;
                c3671.f13431.add(c17783M41359);
                if (!c17783M41359.f56385) {
                    ((List) C9735.computeIfAbsent(c3671.f13430, Integer.valueOf(c17783M41359.f56384), new C21745(2))).add(c17783M41359);
                }
                c6494 = this;
                j2 = j;
                it = it2;
            }
        }
        return c3671;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C2260 m17689(long j, long j2) {
        long jM44103;
        if (j >= 0) {
            long j3 = 8;
            long j4 = j + 8;
            if (j4 <= j2) {
                C5083 c5083 = this.f21903;
                byte[] bArrM14177 = C5083.m14177(c5083, j, 8);
                long jM44059 = C19195.m44059(0, bArrM14177);
                int iM44072 = C19195.m44072(4, bArrM14177);
                if (jM44059 == 1) {
                    if (j + 16 > j2) {
                        throw new C7906();
                    }
                    jM44103 = C19195.m44103(0, C5083.m14177(c5083, j4, 8));
                    j3 = 16;
                } else {
                    if (jM44059 == 0) {
                        throw new C7906();
                    }
                    jM44103 = jM44059;
                }
                long jM44064 = C19195.m44064(j, jM44103);
                if (jM44103 < j3 || jM44064 > j2) {
                    throw new C7906();
                }
                return new C2260(j, jM44103, j3, jM44064, iM44072);
            }
        }
        throw new C7906();
    }
}
