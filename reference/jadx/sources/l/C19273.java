package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46P2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19273 extends C23497 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long[] f62221;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f62223;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f62224;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final CharSequence f62225;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f62226;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC18877 f62227;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f62229;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2338 f62230;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f62231;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f62228 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f62222 = new ArrayList();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f62220 = -1;

    public C19273(CharSequence charSequence, C4943 c4943, EnumC18877 enumC18877, int i, C2338 c2338) {
        this.f62225 = charSequence;
        ArrayList arrayListM13723 = c4943.m13723();
        this.f62231 = arrayListM13723;
        this.f62227 = enumC18877;
        this.f62230 = c2338;
        this.f62223 = c2338 == null && enumC18877 != EnumC18877.JSON && C2338.m7092(arrayListM13723);
        this.f62229 = i;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x017f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0191  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:124:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:152:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x0230  */
    /* JADX WARN: Code duplicated, block: B:225:0x0333  */
    /* JADX WARN: Code duplicated, block: B:296:0x0470  */
    /* JADX WARN: Code duplicated, block: B:299:0x0479  */
    /* JADX WARN: Code duplicated, block: B:368:0x0481 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:76:0x0102  */
    /* JADX WARN: Code duplicated, block: B:83:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0129  */
    /* JADX WARN: Code duplicated, block: B:94:0x0138 A[LOOP:6: B:92:0x0132->B:94:0x0138, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0147  */
    /* JADX WARN: Code duplicated, block: B:97:0x0151  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44244(List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        int i2;
        int i3;
        int i4;
        int iM47937;
        int i5;
        int iM47938;
        int i6;
        long[] jArr;
        boolean z;
        boolean z2;
        long[] jArr2;
        int iM44247;
        int i7;
        int i8;
        int i9;
        int type;
        int i10;
        int i11;
        ArrayList arrayList3 = this.f62231;
        int i12 = 1;
        int size = arrayList3.size() + 1;
        this.f62226 = new byte[size];
        this.f62224 = new int[size];
        this.f62221 = new long[size];
        int i13 = 0;
        while (i13 < arrayList3.size()) {
            C18567.m42975();
            InterfaceC19761 interfaceC19761 = (InterfaceC19761) arrayList3.get(i13);
            long[] jArr3 = this.f62221;
            int i14 = i13 + 1;
            jArr3[i14] = jArr3[i13] + ((interfaceC19761.getType() == 141 || interfaceC19761.getType() == -1) ? 0L : ((long) (interfaceC19761.mo22510() - interfaceC19761.mo22508())) + 2);
            i13 = i14;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21389 c21389 = (C21389) it.next();
            C18567.m42975();
            int i15 = c21389.f69548;
            int i16 = c21389.f69543;
            int i17 = c21389.f69544;
            int i18 = c21389.f69547;
            if (i18 == 72 && i15 >= 0 && i15 < arrayList3.size()) {
                if (((InterfaceC19761) arrayList3.get(i15)).getType() == 93) {
                    m44242(i15, 8);
                } else {
                    int iM44248 = m44247(i15);
                    if (iM44248 >= 0) {
                        m44242(iM44248, 4);
                    }
                    m44236(i15);
                }
            }
            if (i15 >= 0 && i17 >= i15 && i17 < arrayList3.size()) {
                int i19 = this.f62229;
                if (i18 == -3 || i18 == -2) {
                    m44238(i15, i17, true);
                } else if (i18 == i12) {
                    m44236(i15);
                    if (i18 == 1 || !(i16 == 21 || i16 == 22)) {
                        i6 = 1;
                    } else {
                        boolean z3 = c21389.m47937(93, arrayList3) >= 0;
                        if (c21389.f69545 || z3) {
                            i6 = 1;
                            m44241(i15, z3 ? 3 : 1);
                        } else {
                            int[] iArr = this.f62224;
                            i6 = 1;
                            iArr[i15] = iArr[i15] + 1;
                            int iM44249 = m44248(i17);
                            iArr[iM44249] = iArr[iM44249] - 1;
                        }
                    }
                    if (i18 == i6 && i16 == i6) {
                        m44241(i15, i6);
                    }
                } else if (i18 == 2) {
                    m44238(i15, i17, true);
                } else if (i18 == 8) {
                    jArr = this.f62221;
                    if (jArr[i17 + 1] - jArr[i15] <= i19 || m44237(i15, i17)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m44238(i15, i17, z);
                } else if (i18 == 9) {
                    if (i18 != 51) {
                        jArr2 = this.f62221;
                        if (jArr2[i17 + 1] - jArr2[i15] <= i19 / 2 || m44237(i15, i17)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = true;
                    }
                    m44238(i15, i17, z2);
                } else if (i18 == 14) {
                    jArr = this.f62221;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m44238(i15, i17, z);
                } else if (i18 == 24) {
                    m44236(i15);
                    if (i18 == 1) {
                        i6 = 1;
                    } else {
                        i6 = 1;
                    }
                    if (i18 == i6) {
                        m44241(i15, i6);
                    }
                } else if (i18 == 30) {
                    jArr = this.f62221;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m44238(i15, i17, z);
                } else if (i18 == 40 || i18 == 43) {
                    m44239(i15);
                    m44239(m44248(i17));
                    for (int i20 = i15 + 1; i20 <= i17; i20++) {
                        m44241(i20, 3);
                    }
                } else if (i18 == 47) {
                    jArr = this.f62221;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m44238(i15, i17, z);
                } else if (i18 == 57) {
                    iM44247 = m44247(i15);
                    if (m44243(i15) != 2) {
                        if (iM44247 >= 0 || !(((InterfaceC19761) arrayList3.get(iM44247)).getType() == 135 || ((InterfaceC19761) arrayList3.get(iM44247)).getType() == 29 || ((InterfaceC19761) arrayList3.get(iM44247)).getType() == 28)) {
                            i7 = 3;
                        } else {
                            i7 = 1;
                        }
                        m44241(i15, i7);
                    }
                    m44241(m44248(i15), 3);
                    m44241(i17, 3);
                    if (c21389.f69542) {
                        m44240(i17, m44248(i17));
                    }
                } else if (i18 == 66) {
                    jArr = this.f62221;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m44238(i15, i17, z);
                } else if (i18 == 68) {
                    for (i8 = i15; i8 <= i17; i8++) {
                        type = ((InterfaceC19761) arrayList3.get(i8)).getType();
                        if (type != 145 || type == 143) {
                            i10 = 144;
                            i11 = 64;
                        } else {
                            i10 = 144;
                            i11 = 64;
                            if (type == 144) {
                            }
                            if (type != 7 || type == 145 || type == i10) {
                                m44242(i8 + 1, i11);
                            }
                        }
                        m44242(i8, i11);
                        if (type != 7) {
                            m44242(i8 + 1, i11);
                        } else {
                            m44242(i8 + 1, i11);
                        }
                    }
                    for (i9 = 0; i9 < c21389.f69550; i9++) {
                        int iM47936 = c21389.m47936(i9);
                        m44242(iM47936, 64);
                        m44242(iM47936 + 1, 64);
                    }
                } else if (i18 == 17) {
                    m44238(i15, i17, true);
                } else if (i18 == 18) {
                    m44236(i15);
                    if (i18 == 1) {
                        i6 = 1;
                    } else {
                        i6 = 1;
                    }
                    if (i18 == i6) {
                        m44241(i15, i6);
                    }
                } else if (i18 == 50) {
                    jArr = this.f62221;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m44238(i15, i17, z);
                } else if (i18 == 51) {
                    if (i18 != 51) {
                        jArr2 = this.f62221;
                        if (jArr2[i17 + 1] - jArr2[i15] <= i19 / 2) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = true;
                    }
                    m44238(i15, i17, z2);
                } else if (i18 == 54) {
                    while (i8 <= i17) {
                        type = ((InterfaceC19761) arrayList3.get(i8)).getType();
                        if (type != 145) {
                            i10 = 144;
                            i11 = 64;
                            m44242(i8, i11);
                        } else {
                            i10 = 144;
                            i11 = 64;
                            m44242(i8, i11);
                        }
                        if (type != 7) {
                            m44242(i8 + 1, i11);
                        } else {
                            m44242(i8 + 1, i11);
                        }
                    }
                    while (i9 < c21389.f69550) {
                        int iM47939 = c21389.m47936(i9);
                        m44242(iM47939, 64);
                        m44242(iM47939 + 1, 64);
                    }
                } else if (i18 == 55) {
                    iM44247 = m44247(i15);
                    if (m44243(i15) != 2) {
                        if (iM44247 >= 0) {
                            i7 = 3;
                        } else {
                            i7 = 3;
                        }
                        m44241(i15, i7);
                    }
                    m44241(m44248(i15), 3);
                    m44241(i17, 3);
                    if (c21389.f69542) {
                        m44240(i17, m44248(i17));
                    }
                } else if (i18 == 63) {
                    m44238(i15, i17, true);
                } else if (i18 == 64) {
                    m44236(i15);
                    if (i18 == 1) {
                        i6 = 1;
                    } else {
                        i6 = 1;
                    }
                    if (i18 == i6) {
                        m44241(i15, i6);
                    }
                }
                if (i18 == 41 || i18 == 58) {
                    for (int i21 = 0; i21 < c21389.f69550; i21++) {
                        m44239(c21389.m47936(i21));
                        m44239(m44248(c21389.m47936(i21)));
                    }
                }
                if (i18 == 15 || i18 == 64 || i18 == 18 || i18 == 67) {
                    for (int i22 = 0; i22 < c21389.f69550; i22++) {
                        m44241(c21389.m47936(i22), 3);
                    }
                }
                if (i18 == 34 && c21389.m47937(43, arrayList3) >= 0) {
                    int iM479310 = c21389.m47937(91, arrayList3);
                    int iM479311 = c21389.m47937(92, arrayList3);
                    if (iM479310 >= 0 && iM479311 >= 0) {
                        m44238(iM479310, iM479311, true);
                    }
                }
                if (i18 == 59 || i18 == 60) {
                    long[] jArr4 = this.f62221;
                    if (jArr4[i17 + 1] - jArr4[i15] > i19) {
                        int i23 = -1;
                        for (int i24 = 0; i24 < c21389.f69550; i24++) {
                            int iM479312 = c21389.m47936(i24);
                            if (iM479312 >= 0) {
                                m44236(iM479312);
                                if (i23 < 0) {
                                    i23 = iM479312;
                                }
                            }
                        }
                        if (i23 >= 0) {
                            int[] iArr2 = this.f62224;
                            iArr2[i23] = iArr2[i23] + 1;
                            int iM442410 = m44248(i17);
                            iArr2[iM442410] = iArr2[iM442410] - 1;
                        }
                    }
                }
                if (i18 == 21 && (iM47938 = c21389.m47937(18, arrayList3)) >= 0) {
                    m44241(iM47938, ((InterfaceC19761) arrayList3.get(m44247(iM47938))).getType() == 92 ? 1 : 2);
                }
                if (i18 == 25) {
                    int iM479313 = c21389.m47937(10, arrayList3);
                    int iM479314 = c21389.m47937(21, arrayList3);
                    if (iM479313 >= 0) {
                        m44239(iM479313);
                    }
                    if (iM479314 >= 0) {
                        m44239(iM479314);
                    }
                }
                if (i18 == 20) {
                    m44236(m44248(i17));
                }
                if (i18 == 23) {
                    int iM479315 = c21389.m47937(91, arrayList3);
                    int iM479316 = c21389.m47937(92, arrayList3);
                    if (iM479315 >= 0) {
                        if (iM479316 < 0) {
                            iM479316 = i17;
                        }
                        i4 = 1;
                        m44238(iM479315, iM479316, true);
                    } else {
                        i4 = 1;
                    }
                } else {
                    i4 = 1;
                }
                if (i18 == 24 && (i5 = c21389.f69549) >= 0) {
                    int[] iArr3 = this.f62224;
                    iArr3[i5] = iArr3[i5] + i4;
                    int iM442411 = m44248(i17);
                    iArr3[iM442411] = iArr3[iM442411] - i4;
                }
                if (i18 == 22 && c21389.m47937(17, arrayList3) >= 0 && (iM47937 = c21389.m47937(38, arrayList3)) >= 0) {
                    m44239(iM47937);
                }
                if (i18 == 72 || i18 == 65) {
                    m44236(m44248(i17));
                }
            }
            i12 = 1;
        }
        if (this.f62227 == EnumC18877.TYPESCRIPT) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C21389 c213810 = (C21389) it2.next();
                C18567.m42975();
                if (c213810.f69547 == 58 && c213810.f69543 == 42 && (i2 = c213810.f69548) >= 0 && (i3 = c213810.f69544) >= i2 && i3 < arrayList3.size()) {
                    int iM442412 = m44248(c213810.f69544);
                    if (((InterfaceC19761) arrayList3.get(iM442412)).getType() == 115 && m44240(c213810.f69544, iM442412)) {
                        int i25 = c213810.f69544;
                        byte[] bArr = this.f62226;
                        bArr[i25] = (byte) (bArr[i25] & ((byte) (-5)));
                    }
                }
            }
        }
        int i26 = 0;
        while (true) {
            arrayList = this.f62228;
            int size2 = arrayList.size();
            arrayList2 = this.f62222;
            if (i26 >= size2) {
                break;
            }
            C23289 c23289 = (C23289) arrayList.get(i26);
            int iMax = Math.max(0, Math.max(c23289.f75536.mo22511(), ((Integer) arrayList2.get(i26)).intValue()));
            InterfaceC19761 interfaceC19762 = c23289.f75537;
            int size3 = interfaceC19762 == null ? arrayList3.size() - 1 : interfaceC19762.mo22511();
            for (int i27 = iMax; i27 <= Math.min(arrayList3.size() - 1, size3 + 1); i27++) {
                m44242(i27, 16);
            }
            for (int iMax2 = Math.max(0, iMax - 1); iMax2 <= Math.min(arrayList3.size() - 1, size3); iMax2++) {
                byte[] bArr2 = this.f62226;
                bArr2[iMax2] = (byte) (bArr2[iMax2] & ((byte) (-5)));
            }
            i26++;
        }
        for (int i28 = 0; i28 < arrayList3.size(); i28++) {
            int type2 = ((InterfaceC19761) arrayList3.get(i28)).getType();
            if (type2 == 145 || type2 == 143) {
                i = 64;
            } else {
                i = 64;
                if (type2 == 144) {
                }
                if (type2 != 145 || type2 == 7 || type2 == 144) {
                    m44242(i28 + 1, i);
                }
                if (type2 == 142) {
                    m44242(i28, 16);
                    m44242(i28 + 1, 16);
                }
            }
            m44242(i28, i);
            if (type2 != 145) {
                m44242(i28 + 1, i);
            } else {
                m44242(i28 + 1, i);
            }
            if (type2 == 142) {
                m44242(i28, 16);
                m44242(i28 + 1, 16);
            }
        }
        for (int i29 = 0; i29 < arrayList3.size(); i29++) {
            C18567.m42975();
            if (m44246(i29, 4) || m44246(i29, 8)) {
                int iM442413 = m44248(i29);
                int type3 = ((InterfaceC19761) arrayList3.get(iM442413)).getType();
                boolean z4 = type3 == 92 || type3 == -1;
                for (int i30 = i29; z4 && i30 <= iM442413; i30++) {
                    z4 = !m44246(i30, 16);
                }
                if (!z4) {
                    byte[] bArr3 = this.f62226;
                    bArr3[i29] = (byte) (bArr3[i29] & ((byte) (-9)));
                }
                if (z4) {
                    byte[] bArr4 = this.f62226;
                    bArr4[i29] = (byte) (bArr4[i29] & ((byte) (-5)));
                }
            }
        }
        this.f62221 = null;
        arrayList.clear();
        arrayList2.clear();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    @Override // l.InterfaceC5857
    /* JADX INFO: renamed from: ۙ */
    public final void mo11174(AbstractC19055 abstractC19055, Object obj, int i, int i2, String str, C21877 c21877) {
        int iValueOf;
        boolean z = this.f62223;
        ArrayList arrayList = this.f62222;
        ArrayList arrayList2 = this.f62228;
        if (z && (obj instanceof InterfaceC19761)) {
            InterfaceC19761 interfaceC19761 = (InterfaceC19761) obj;
            if (interfaceC19761.mo22511() > this.f62220) {
                this.f62220 = interfaceC19761.mo22511();
                arrayList2.clear();
                arrayList.clear();
            }
        }
        if (arrayList2.size() >= 64) {
            throw new C7984();
        }
        C23289 c23289M18923 = ((AbstractC12548) abstractC19055).m18923();
        C23289 c23289 = c23289M18923;
        while (true) {
            if (c23289M18923 == null) {
                c23289M18923 = c23289;
                break;
            } else {
                if ((c23289M18923 instanceof C4786) || (c23289M18923 instanceof C13815) || (c23289M18923 instanceof C21720)) {
                    break;
                }
                c23289 = c23289M18923;
                c23289M18923 = c23289M18923.f29378;
            }
        }
        if (c23289M18923 != null) {
            arrayList2.add(c23289M18923);
            if (this.f62227 == EnumC18877.JSON && (obj instanceof InterfaceC19761)) {
                InterfaceC19761 interfaceC19762 = (InterfaceC19761) obj;
                if (interfaceC19762.getType() == -1) {
                    iValueOf = Integer.valueOf(interfaceC19762.mo22511());
                } else {
                    iValueOf = -1;
                }
            } else {
                iValueOf = -1;
            }
            arrayList.add(iValueOf);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44243(int i) {
        return this.f62226[i] & 3;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m44241(int i, int i2) {
        byte[] bArr = this.f62226;
        bArr[i] = (byte) (i2 | (bArr[i] & (-4)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44246(int i, int i2) {
        return (this.f62226[i] & i2) != 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m44242(int i, int i2) {
        byte[] bArr = this.f62226;
        bArr[i] = (byte) (((byte) i2) | bArr[i]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44245(C2338 c2338) {
        if (c2338 == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f62231;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC19761 interfaceC19761 = (InterfaceC19761) arrayList.get(i);
            if (interfaceC19761.getType() == 44 && c2338.m7097(interfaceC19761.mo22508())) {
                m44240(i, m44248(i));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m44240(int i, int i2) {
        boolean z = false;
        for (int i3 = i + 1; i3 < i2; i3++) {
            InterfaceC19761 interfaceC19761 = (InterfaceC19761) this.f62231.get(i3);
            if (C7278.m19415(interfaceC19761.getText())) {
                if (interfaceC19761.getType() == 141) {
                    m44242(i3 + 1, 16);
                } else if (interfaceC19761.getType() == 4) {
                    m44242(i3, 32);
                }
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44238(int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = this.f62231;
        int type = ((InterfaceC19761) arrayList.get(i)).getType();
        if (type == 91) {
            i3 = 92;
        } else {
            i3 = type == 89 ? 90 : 88;
        }
        int i4 = 0;
        boolean z2 = ((InterfaceC19761) arrayList.get(i2)).getType() == i3;
        int i5 = 3;
        if (z2 && m44248(i) == i2) {
            if (m44249(i, i2)) {
                InterfaceC19761 interfaceC19761 = (InterfaceC19761) arrayList.get(i2 - 1);
                if (interfaceC19761.getType() == 141 && C7278.m19415(interfaceC19761.getText())) {
                    i5 = 2;
                }
                m44241(i2, i5);
                return;
            }
            if (m44237(i, i2)) {
                do {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } while (((InterfaceC19761) arrayList.get(i)).getType() == 141);
                int[] iArr = this.f62224;
                iArr[i] = iArr[i] + 1;
                iArr[i2] = iArr[i2] - 1;
                m44236(i2);
                return;
            }
            m44241(i2, 3);
            return;
        }
        boolean z3 = type == 91;
        if (z) {
            m44236(m44248(i));
            int[] iArr2 = this.f62224;
            int iM44248 = m44248(i);
            iArr2[iM44248] = iArr2[iM44248] + 1;
            if (z2) {
                m44236(i2);
                int[] iArr3 = this.f62224;
                iArr3[i2] = iArr3[i2] - 1;
            }
        } else {
            m44241(m44248(i), z3 ? 1 : 3);
            if (z2) {
                m44241(i2, z3 ? 1 : 3);
            }
        }
        while (true) {
            i++;
            if (i >= i2) {
                return;
            }
            int type2 = ((InterfaceC19761) arrayList.get(i)).getType();
            if (type2 == 91 || type2 == 89 || type2 == 87) {
                i4++;
            }
            if (type2 == 92 || type2 == 90 || type2 == 88) {
                i4--;
            }
            if (i4 == 0 && (type2 == 94 || type2 == 93)) {
                int iM44249 = m44248(i);
                if (z) {
                    m44236(iM44249);
                } else {
                    m44239(iM44249);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m44248(int i) {
        ArrayList arrayList;
        do {
            i++;
            arrayList = this.f62231;
            if (i >= arrayList.size()) {
                break;
            }
        } while (((InterfaceC19761) arrayList.get(i)).mo22512() != 0);
        return Math.min(i, arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m44247(int i) {
        do {
            i--;
            if (i < 0) {
                break;
            }
        } while (((InterfaceC19761) this.f62231.get(i)).mo22512() != 0);
        return i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m44236(int i) {
        if (i < 0 || i >= this.f62226.length) {
            return;
        }
        m44241(i, 2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m44239(int i) {
        if (i < 0 || i >= this.f62226.length || m44243(i) == 2) {
            return;
        }
        m44241(i, 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m44249(int i, int i2) {
        for (int i3 = i + 1; i3 < i2; i3++) {
            InterfaceC19761 interfaceC19761 = (InterfaceC19761) this.f62231.get(i3);
            int type = interfaceC19761.getType();
            if (type == 4 || type == 3) {
                String text = interfaceC19761.getText();
                if (text.contains("@ts-") || text.contains("#__PURE__") || text.contains("@__PURE__") || text.contains("sourceURL=") || text.contains("sourceMappingURL=") || text.contains("eslint") || text.contains("prettier") || text.contains("istanbul")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m44237(int i, int i2) {
        for (int i3 = i + 1; i3 < i2; i3++) {
            int type = ((InterfaceC19761) this.f62231.get(i3)).getType();
            if (type == 3 || type == 4 || type == 2) {
                return true;
            }
        }
        return false;
    }
}
