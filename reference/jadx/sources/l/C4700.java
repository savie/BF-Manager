package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 46P2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4700 extends C25153 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f16588;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC7440 f16589;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f16590;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharSequence f16591;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14612 f16593;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f16594;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f16595;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long[] f16597;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f16598;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f16596 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f16587 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f16592 = -1;

    public C4700(CharSequence charSequence, C3523 c3523, EnumC7440 enumC7440, int i, C14612 c14612) {
        this.f16591 = charSequence;
        ArrayList arrayListM11539 = c3523.m11539();
        this.f16598 = arrayListM11539;
        this.f16589 = enumC7440;
        this.f16593 = c14612;
        this.f16588 = c14612 == null && enumC7440 != EnumC7440.JSON && C14612.m35252(arrayListM11539);
        this.f16594 = i;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x017f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0191  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01af  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:124:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:142:0x0205  */
    /* JADX WARN: Code duplicated, block: B:145:0x020c  */
    /* JADX WARN: Code duplicated, block: B:150:0x022a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0232  */
    /* JADX WARN: Code duplicated, block: B:156:0x0236  */
    /* JADX WARN: Code duplicated, block: B:160:0x023d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0245  */
    /* JADX WARN: Code duplicated, block: B:163:0x0247  */
    /* JADX WARN: Code duplicated, block: B:166:0x024c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x0261  */
    /* JADX WARN: Code duplicated, block: B:171:0x0264  */
    /* JADX WARN: Code duplicated, block: B:172:0x0266  */
    /* JADX WARN: Code duplicated, block: B:175:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x0281  */
    /* JADX WARN: Code duplicated, block: B:186:0x0286 A[LOOP:4: B:184:0x0282->B:186:0x0286, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:195:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:198:0x02b0 A[LOOP:3: B:196:0x02ac->B:198:0x02b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:211:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:213:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:216:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:218:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:220:0x0302  */
    /* JADX WARN: Code duplicated, block: B:223:0x0308  */
    /* JADX WARN: Code duplicated, block: B:230:0x0338  */
    /* JADX WARN: Code duplicated, block: B:231:0x033a  */
    /* JADX WARN: Code duplicated, block: B:235:0x0342  */
    /* JADX WARN: Code duplicated, block: B:237:0x0350  */
    /* JADX WARN: Code duplicated, block: B:239:0x0355  */
    /* JADX WARN: Code duplicated, block: B:242:0x035c  */
    /* JADX WARN: Code duplicated, block: B:245:0x0367  */
    /* JADX WARN: Code duplicated, block: B:247:0x0375 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x0377  */
    /* JADX WARN: Code duplicated, block: B:250:0x037e  */
    /* JADX WARN: Code duplicated, block: B:267:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:325:0x04cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:327:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:330:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:368:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:76:0x0102  */
    /* JADX WARN: Code duplicated, block: B:83:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0129  */
    /* JADX WARN: Code duplicated, block: B:94:0x0138 A[LOOP:6: B:92:0x0132->B:94:0x0138, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0147  */
    /* JADX WARN: Code duplicated, block: B:97:0x0151  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14589(List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        C2680 c2680;
        int i5;
        int i6;
        long[] jArr;
        int i7;
        int i8;
        int iM8847;
        int i9;
        int iM8848;
        int i10;
        int iM8849;
        int iM88410;
        int iM88411;
        int iM88412;
        int iM88413;
        int i11;
        int iM88414;
        int iM88415;
        int iM14592;
        boolean z2;
        int i12;
        boolean z3;
        int i13;
        long[] jArr2;
        boolean z4;
        boolean z5;
        long[] jArr3;
        int iM14593;
        int i14;
        int i15;
        int i16;
        int type;
        int i17;
        int i18;
        ArrayList arrayList3 = this.f16598;
        int i19 = 1;
        int size = arrayList3.size() + 1;
        this.f16590 = new byte[size];
        this.f16595 = new int[size];
        this.f16597 = new long[size];
        int i20 = 0;
        while (i20 < arrayList3.size()) {
            C7155.m19727();
            InterfaceC8743 interfaceC8743 = (InterfaceC8743) arrayList3.get(i20);
            long[] jArr4 = this.f16597;
            int i21 = i20 + 1;
            jArr4[i21] = jArr4[i20] + ((interfaceC8743.getType() == 141 || interfaceC8743.getType() == -1) ? 0L : ((long) (interfaceC8743.mo23440() - interfaceC8743.mo23442())) + 2);
            i20 = i21;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2680 c2681 = (C2680) it.next();
            C7155.m19727();
            int i22 = c2681.f8521;
            int i23 = c2681.f8527;
            int i24 = c2681.f8519;
            int i25 = c2681.f8522;
            if (i25 == 72 && i22 >= 0 && i22 < arrayList3.size()) {
                if (((InterfaceC8743) arrayList3.get(i22)).getType() == 93) {
                    m14583(i22, 8);
                } else {
                    int iM14594 = m14592(i22);
                    if (iM14594 >= 0) {
                        m14583(iM14594, 4);
                    }
                    m14586(i22);
                }
            }
            if (i22 >= 0 && i24 >= i22 && i24 < arrayList3.size()) {
                int i26 = this.f16594;
                if (i25 == -3 || i25 == -2) {
                    z = true;
                    c2680 = null;
                } else {
                    if (i25 == i19) {
                        m14586(i22);
                        if (i25 != 1 && i23 != -1 && i23 != 0) {
                            if (i23 == 2 || i23 == 24) {
                            }
                            i12 = 1;
                            if (i25 == 1) {
                                if (i23 != 21 || i23 == 22) {
                                    if (c2681.m8848(93, arrayList3) >= 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (!c2681.f8520 || z3) {
                                        if (z3) {
                                            i13 = 3;
                                        } else {
                                            i13 = 1;
                                        }
                                        m14582(i22, i13);
                                    } else {
                                        int[] iArr = this.f16595;
                                        iArr[i22] = iArr[i22] + 1;
                                        int iM14595 = m14593(i24);
                                        iArr[iM14595] = iArr[iM14595] - 1;
                                    }
                                }
                                i12 = 1;
                            }
                            if (i25 == i12 && i23 == i12) {
                                m14582(i22, i12);
                            }
                        }
                        iM14592 = m14592(i22);
                        if (iM14592 >= 0 || ((InterfaceC8743) arrayList3.get(iM14592)).getType() == 91 || ((InterfaceC8743) arrayList3.get(iM14592)).getType() == 95) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        m14581(iM14592, i22, z2, true);
                        i12 = 1;
                        if (i25 == 1) {
                            if (i23 != 21) {
                                if (c2681.m8848(93, arrayList3) >= 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!c2681.f8520) {
                                    if (z3) {
                                        i13 = 3;
                                    } else {
                                        i13 = 1;
                                    }
                                    m14582(i22, i13);
                                } else {
                                    if (z3) {
                                        i13 = 3;
                                    } else {
                                        i13 = 1;
                                    }
                                    m14582(i22, i13);
                                }
                            } else {
                                if (c2681.m8848(93, arrayList3) >= 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!c2681.f8520) {
                                    if (z3) {
                                        i13 = 3;
                                    } else {
                                        i13 = 1;
                                    }
                                    m14582(i22, i13);
                                } else {
                                    if (z3) {
                                        i13 = 3;
                                    } else {
                                        i13 = 1;
                                    }
                                    m14582(i22, i13);
                                }
                            }
                            i12 = 1;
                        }
                        if (i25 == i12) {
                            m14582(i22, i12);
                        }
                    } else {
                        if (i25 != 2) {
                            if (i25 == 8) {
                                jArr2 = this.f16597;
                                if (jArr2[i24 + 1] - jArr2[i22] <= i26 || m14587(i22, i24)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                m14580(i22, i24, z4, c2681);
                            } else if (i25 == 9) {
                                if (i25 != 51) {
                                    jArr3 = this.f16597;
                                    if (jArr3[i24 + 1] - jArr3[i22] <= i26 / 2 || m14587(i22, i24)) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                } else {
                                    z5 = true;
                                }
                                m14580(i22, i24, z5, c2681);
                            } else if (i25 != 14) {
                                if (i25 != 24) {
                                    if (i25 == 30) {
                                        jArr2 = this.f16597;
                                        if (jArr2[i24 + 1] - jArr2[i22] <= i26) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                        }
                                        m14580(i22, i24, z4, c2681);
                                    } else if (i25 == 40 || i25 == 43) {
                                        m14584(i22);
                                        m14584(m14593(i24));
                                        for (int i27 = i22 + 1; i27 <= i24; i27++) {
                                            m14582(i27, 3);
                                        }
                                    } else if (i25 == 47) {
                                        jArr2 = this.f16597;
                                        if (jArr2[i24 + 1] - jArr2[i22] <= i26) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                        }
                                        m14580(i22, i24, z4, c2681);
                                    } else if (i25 == 57) {
                                        iM14593 = m14592(i22);
                                        if (m14588(i22) != 2) {
                                            if (iM14593 >= 0 || !(((InterfaceC8743) arrayList3.get(iM14593)).getType() == 135 || ((InterfaceC8743) arrayList3.get(iM14593)).getType() == 29 || ((InterfaceC8743) arrayList3.get(iM14593)).getType() == 28)) {
                                                i14 = 3;
                                            } else {
                                                i14 = 1;
                                            }
                                            m14582(i22, i14);
                                        }
                                        m14582(m14593(i22), 3);
                                        m14582(i24, 3);
                                        if (c2681.f8523) {
                                            m14585(i24, m14593(i24));
                                        }
                                    } else if (i25 == 66) {
                                        jArr2 = this.f16597;
                                        if (jArr2[i24 + 1] - jArr2[i22] <= i26) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                        }
                                        m14580(i22, i24, z4, c2681);
                                    } else if (i25 == 68) {
                                        for (i15 = i22; i15 <= i24; i15++) {
                                            type = ((InterfaceC8743) arrayList3.get(i15)).getType();
                                            if (type != 145 || type == 143) {
                                                i17 = 144;
                                                i18 = 64;
                                            } else {
                                                i17 = 144;
                                                i18 = 64;
                                                if (type == 144) {
                                                }
                                                if (type != 7 || type == 145 || type == i17) {
                                                    m14583(i15 + 1, i18);
                                                }
                                            }
                                            m14583(i15, i18);
                                            if (type != 7) {
                                                m14583(i15 + 1, i18);
                                            } else {
                                                m14583(i15 + 1, i18);
                                            }
                                        }
                                        for (i16 = 0; i16 < c2681.f8524; i16++) {
                                            int iM88416 = c2681.m8847(i16);
                                            m14583(iM88416, 64);
                                            m14583(iM88416 + 1, 64);
                                        }
                                    } else if (i25 != 17) {
                                        if (i25 != 18) {
                                            if (i25 == 50) {
                                                jArr2 = this.f16597;
                                                if (jArr2[i24 + 1] - jArr2[i22] <= i26) {
                                                    z4 = true;
                                                } else {
                                                    z4 = true;
                                                }
                                                m14580(i22, i24, z4, c2681);
                                            } else if (i25 == 51) {
                                                if (i25 != 51) {
                                                    jArr3 = this.f16597;
                                                    if (jArr3[i24 + 1] - jArr3[i22] <= i26 / 2) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = true;
                                                    }
                                                } else {
                                                    z5 = true;
                                                }
                                                m14580(i22, i24, z5, c2681);
                                            } else if (i25 == 54) {
                                                while (i15 <= i24) {
                                                    type = ((InterfaceC8743) arrayList3.get(i15)).getType();
                                                    if (type != 145) {
                                                        i17 = 144;
                                                        i18 = 64;
                                                        m14583(i15, i18);
                                                    } else {
                                                        i17 = 144;
                                                        i18 = 64;
                                                        m14583(i15, i18);
                                                    }
                                                    if (type != 7) {
                                                        m14583(i15 + 1, i18);
                                                    } else {
                                                        m14583(i15 + 1, i18);
                                                    }
                                                }
                                                while (i16 < c2681.f8524) {
                                                    int iM88417 = c2681.m8847(i16);
                                                    m14583(iM88417, 64);
                                                    m14583(iM88417 + 1, 64);
                                                }
                                            } else if (i25 == 55) {
                                                iM14593 = m14592(i22);
                                                if (m14588(i22) != 2) {
                                                    if (iM14593 >= 0) {
                                                        i14 = 3;
                                                    } else {
                                                        i14 = 3;
                                                    }
                                                    m14582(i22, i14);
                                                }
                                                m14582(m14593(i22), 3);
                                                m14582(i24, 3);
                                                if (c2681.f8523) {
                                                    m14585(i24, m14593(i24));
                                                }
                                            } else if (i25 != 63) {
                                                if (i25 != 64) {
                                                }
                                            }
                                        }
                                    }
                                }
                                m14586(i22);
                                if (i25 != 1) {
                                    iM14592 = m14592(i22);
                                    if (iM14592 >= 0) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    m14581(iM14592, i22, z2, true);
                                } else {
                                    iM14592 = m14592(i22);
                                    if (iM14592 >= 0) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    m14581(iM14592, i22, z2, true);
                                }
                                i12 = 1;
                                if (i25 == 1) {
                                    if (i23 != 21) {
                                        if (c2681.m8848(93, arrayList3) >= 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (!c2681.f8520) {
                                            if (z3) {
                                                i13 = 3;
                                            } else {
                                                i13 = 1;
                                            }
                                            m14582(i22, i13);
                                        } else {
                                            if (z3) {
                                                i13 = 3;
                                            } else {
                                                i13 = 1;
                                            }
                                            m14582(i22, i13);
                                        }
                                    } else {
                                        if (c2681.m8848(93, arrayList3) >= 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (!c2681.f8520) {
                                            if (z3) {
                                                i13 = 3;
                                            } else {
                                                i13 = 1;
                                            }
                                            m14582(i22, i13);
                                        } else {
                                            if (z3) {
                                                i13 = 3;
                                            } else {
                                                i13 = 1;
                                            }
                                            m14582(i22, i13);
                                        }
                                    }
                                    i12 = 1;
                                }
                                if (i25 == i12) {
                                    m14582(i22, i12);
                                }
                            } else {
                                jArr2 = this.f16597;
                                if (jArr2[i24 + 1] - jArr2[i22] <= i26) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                m14580(i22, i24, z4, c2681);
                            }
                        }
                        z = true;
                        c2680 = null;
                    }
                    if (i25 != 41 || i25 == 58) {
                        for (i5 = 0; i5 < c2681.f8524; i5++) {
                            m14584(c2681.m8847(i5));
                            m14584(m14593(c2681.m8847(i5)));
                        }
                    }
                    if (i25 != 15 || i25 == 64 || i25 == 18 || i25 == 67) {
                        for (i6 = 0; i6 < c2681.f8524; i6++) {
                            m14582(c2681.m8847(i6), 3);
                        }
                    }
                    if (i25 == 34 && c2681.m8848(43, arrayList3) >= 0) {
                        iM88414 = c2681.m8848(91, arrayList3);
                        iM88415 = c2681.m8848(92, arrayList3);
                        if (iM88414 >= 0 && iM88415 >= 0) {
                            m14580(iM88414, iM88415, true, c2681);
                        }
                    }
                    if (i25 != 59 || i25 == 60) {
                        jArr = this.f16597;
                        if (jArr[i24 + 1] - jArr[i22] > i26) {
                            i7 = -1;
                            for (i8 = 0; i8 < c2681.f8524; i8++) {
                                iM8847 = c2681.m8847(i8);
                                if (iM8847 >= 0) {
                                    m14586(iM8847);
                                    if (i7 < 0) {
                                        i7 = iM8847;
                                    }
                                }
                            }
                            if (i7 >= 0) {
                                int[] iArr2 = this.f16595;
                                iArr2[i7] = iArr2[i7] + 1;
                                int iM14596 = m14593(i24);
                                iArr2[iM14596] = iArr2[iM14596] - 1;
                            }
                        }
                    }
                    if (i25 == 21 && (iM88413 = c2681.m8848(18, arrayList3)) >= 0) {
                        if (((InterfaceC8743) arrayList3.get(m14592(iM88413))).getType() == 92) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        m14582(iM88413, i11);
                    }
                    if (i25 == 25) {
                        iM88411 = c2681.m8848(10, arrayList3);
                        iM88412 = c2681.m8848(21, arrayList3);
                        if (iM88411 >= 0) {
                            m14584(iM88411);
                        }
                        if (iM88412 >= 0) {
                            m14584(iM88412);
                        }
                    }
                    if (i25 == 20) {
                        m14586(m14593(i24));
                    }
                    if (i25 == 23) {
                        iM8849 = c2681.m8848(91, arrayList3);
                        iM88410 = c2681.m8848(92, arrayList3);
                        if (iM8849 >= 0) {
                            if (iM88410 < 0) {
                                iM88410 = i24;
                            }
                            i9 = 1;
                            m14580(iM8849, iM88410, true, (C2680) null);
                        } else {
                            i9 = 1;
                        }
                    } else {
                        i9 = 1;
                    }
                    if (i25 == 24 && (i10 = c2681.f8526) >= 0) {
                        int[] iArr3 = this.f16595;
                        iArr3[i10] = iArr3[i10] + i9;
                        int iM14597 = m14593(i24);
                        iArr3[iM14597] = iArr3[iM14597] - i9;
                    }
                    if (i25 == 22 && c2681.m8848(17, arrayList3) >= 0 && (iM8848 = c2681.m8848(38, arrayList3)) >= 0) {
                        m14584(iM8848);
                    }
                    if (i25 != 72 || i25 == 65) {
                        m14586(m14593(i24));
                    }
                }
                m14580(i22, i24, z, c2680);
                if (i25 != 41) {
                    while (i5 < c2681.f8524) {
                        m14584(c2681.m8847(i5));
                        m14584(m14593(c2681.m8847(i5)));
                    }
                } else {
                    while (i5 < c2681.f8524) {
                        m14584(c2681.m8847(i5));
                        m14584(m14593(c2681.m8847(i5)));
                    }
                }
                if (i25 != 15) {
                    while (i6 < c2681.f8524) {
                        m14582(c2681.m8847(i6), 3);
                    }
                } else {
                    while (i6 < c2681.f8524) {
                        m14582(c2681.m8847(i6), 3);
                    }
                }
                if (i25 == 34) {
                    iM88414 = c2681.m8848(91, arrayList3);
                    iM88415 = c2681.m8848(92, arrayList3);
                    if (iM88414 >= 0) {
                        m14580(iM88414, iM88415, true, c2681);
                    }
                }
                if (i25 != 59) {
                    jArr = this.f16597;
                    if (jArr[i24 + 1] - jArr[i22] > i26) {
                        i7 = -1;
                        while (i8 < c2681.f8524) {
                            iM8847 = c2681.m8847(i8);
                            if (iM8847 >= 0) {
                                m14586(iM8847);
                                if (i7 < 0) {
                                    i7 = iM8847;
                                }
                            }
                        }
                        if (i7 >= 0) {
                            int[] iArr4 = this.f16595;
                            iArr4[i7] = iArr4[i7] + 1;
                            int iM14598 = m14593(i24);
                            iArr4[iM14598] = iArr4[iM14598] - 1;
                        }
                    }
                } else {
                    jArr = this.f16597;
                    if (jArr[i24 + 1] - jArr[i22] > i26) {
                        i7 = -1;
                        while (i8 < c2681.f8524) {
                            iM8847 = c2681.m8847(i8);
                            if (iM8847 >= 0) {
                                m14586(iM8847);
                                if (i7 < 0) {
                                    i7 = iM8847;
                                }
                            }
                        }
                        if (i7 >= 0) {
                            int[] iArr5 = this.f16595;
                            iArr5[i7] = iArr5[i7] + 1;
                            int iM14599 = m14593(i24);
                            iArr5[iM14599] = iArr5[iM14599] - 1;
                        }
                    }
                }
                if (i25 == 21) {
                    if (((InterfaceC8743) arrayList3.get(m14592(iM88413))).getType() == 92) {
                        i11 = 1;
                    } else {
                        i11 = 2;
                    }
                    m14582(iM88413, i11);
                }
                if (i25 == 25) {
                    iM88411 = c2681.m8848(10, arrayList3);
                    iM88412 = c2681.m8848(21, arrayList3);
                    if (iM88411 >= 0) {
                        m14584(iM88411);
                    }
                    if (iM88412 >= 0) {
                        m14584(iM88412);
                    }
                }
                if (i25 == 20) {
                    m14586(m14593(i24));
                }
                if (i25 == 23) {
                    iM8849 = c2681.m8848(91, arrayList3);
                    iM88410 = c2681.m8848(92, arrayList3);
                    if (iM8849 >= 0) {
                        if (iM88410 < 0) {
                            iM88410 = i24;
                        }
                        i9 = 1;
                        m14580(iM8849, iM88410, true, (C2680) null);
                    } else {
                        i9 = 1;
                    }
                } else {
                    i9 = 1;
                }
                if (i25 == 24) {
                    int[] iArr6 = this.f16595;
                    iArr6[i10] = iArr6[i10] + i9;
                    int iM145910 = m14593(i24);
                    iArr6[iM145910] = iArr6[iM145910] - i9;
                }
                if (i25 == 22) {
                    m14584(iM8848);
                }
                if (i25 != 72) {
                    m14586(m14593(i24));
                } else {
                    m14586(m14593(i24));
                }
            }
            i19 = 1;
        }
        int size2 = arrayList3.size() - 1;
        int iM145911 = m14592(size2);
        m14581(iM145911, size2, iM145911 >= 0, false);
        if (this.f16589 == EnumC7440.TYPESCRIPT) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C2680 c2682 = (C2680) it2.next();
                C7155.m19727();
                if (c2682.f8522 == 58 && c2682.f8527 == 42 && (i3 = c2682.f8521) >= 0 && (i4 = c2682.f8519) >= i3 && i4 < arrayList3.size()) {
                    int iM145912 = m14593(c2682.f8519);
                    if (((InterfaceC8743) arrayList3.get(iM145912)).getType() == 115 && m14585(c2682.f8519, iM145912)) {
                        int i28 = c2682.f8519;
                        byte[] bArr = this.f16590;
                        bArr[i28] = (byte) (bArr[i28] & ((byte) (-5)));
                    }
                }
            }
        }
        int i29 = 0;
        while (true) {
            arrayList = this.f16596;
            int size3 = arrayList.size();
            arrayList2 = this.f16587;
            if (i29 >= size3) {
                break;
            }
            C7998 c7998 = (C7998) arrayList.get(i29);
            int iMax = Math.max(0, Math.max(c7998.f26549.mo23438(), ((Integer) arrayList2.get(i29)).intValue()));
            InterfaceC8743 interfaceC8744 = c7998.f26548;
            int size4 = interfaceC8744 == null ? arrayList3.size() - 1 : interfaceC8744.mo23438();
            for (int i30 = iMax; i30 <= Math.min(arrayList3.size() - 1, size4 + 1); i30++) {
                m14583(i30, 16);
            }
            for (int iMax2 = Math.max(0, iMax - 1); iMax2 <= Math.min(arrayList3.size() - 1, size4); iMax2++) {
                byte[] bArr2 = this.f16590;
                bArr2[iMax2] = (byte) (bArr2[iMax2] & ((byte) (-5)));
            }
            i29++;
        }
        for (int i31 = 0; i31 < arrayList3.size(); i31++) {
            int type2 = ((InterfaceC8743) arrayList3.get(i31)).getType();
            if (type2 != 145) {
                i = 144;
                if (type2 != 143) {
                    i2 = 64;
                    if (type2 == 144) {
                    }
                    if (type2 != 145 || type2 == 7 || type2 == i) {
                        m14583(i31 + 1, i2);
                    }
                    if (type2 == 142) {
                        m14583(i31, 16);
                        m14583(i31 + 1, 16);
                    }
                }
                m14583(i31, i2);
                if (type2 != 145) {
                    m14583(i31 + 1, i2);
                } else {
                    m14583(i31 + 1, i2);
                }
                if (type2 == 142) {
                    m14583(i31, 16);
                    m14583(i31 + 1, 16);
                }
            } else {
                i = 144;
            }
            i2 = 64;
            m14583(i31, i2);
            if (type2 != 145) {
                m14583(i31 + 1, i2);
            } else {
                m14583(i31 + 1, i2);
            }
            if (type2 == 142) {
                m14583(i31, 16);
                m14583(i31 + 1, 16);
            }
        }
        for (int i32 = 0; i32 < arrayList3.size(); i32++) {
            C7155.m19727();
            if (m14591(i32, 4) || m14591(i32, 8)) {
                int iM145913 = m14593(i32);
                int type3 = ((InterfaceC8743) arrayList3.get(iM145913)).getType();
                boolean z6 = type3 == 92 || type3 == -1;
                for (int i33 = i32; z6 && i33 <= iM145913; i33++) {
                    z6 = !m14591(i33, 16);
                }
                if (!z6) {
                    byte[] bArr3 = this.f16590;
                    bArr3[i32] = (byte) (bArr3[i32] & ((byte) (-9)));
                }
                if (z6) {
                    byte[] bArr4 = this.f16590;
                    bArr4[i32] = (byte) (bArr4[i32] & ((byte) (-5)));
                }
            }
        }
        this.f16597 = null;
        arrayList.clear();
        arrayList2.clear();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    @Override // l.InterfaceC2032
    /* JADX INFO: renamed from: ۙ */
    public final void mo2202(AbstractC9488 abstractC9488, Object obj, int i, int i2, String str, C10234 c10234) {
        int iValueOf;
        boolean z = this.f16588;
        ArrayList arrayList = this.f16587;
        ArrayList arrayList2 = this.f16596;
        if (z && (obj instanceof InterfaceC8743)) {
            InterfaceC8743 interfaceC8743 = (InterfaceC8743) obj;
            if (interfaceC8743.mo23438() > this.f16592) {
                this.f16592 = interfaceC8743.mo23438();
                arrayList2.clear();
                arrayList.clear();
            }
        }
        if (arrayList2.size() >= 64) {
            throw new C13866();
        }
        C7998 c7998M2522 = ((AbstractC11629) abstractC9488).m2522();
        C7998 c7998 = c7998M2522;
        while (true) {
            if (c7998M2522 == null) {
                c7998M2522 = c7998;
                break;
            } else {
                if ((c7998M2522 instanceof C6475) || (c7998M2522 instanceof C24507) || (c7998M2522 instanceof C2745)) {
                    break;
                }
                c7998 = c7998M2522;
                c7998M2522 = c7998M2522.f9157;
            }
        }
        if (c7998M2522 != null) {
            arrayList2.add(c7998M2522);
            if (this.f16589 == EnumC7440.JSON && (obj instanceof InterfaceC8743)) {
                InterfaceC8743 interfaceC8744 = (InterfaceC8743) obj;
                if (interfaceC8744.getType() == -1) {
                    iValueOf = Integer.valueOf(interfaceC8744.mo23438());
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
    public final int m14588(int i) {
        return this.f16590[i] & 3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m14582(int i, int i2) {
        byte[] bArr = this.f16590;
        bArr[i] = (byte) (i2 | (bArr[i] & (-4)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14591(int i, int i2) {
        return (this.f16590[i] & i2) != 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m14583(int i, int i2) {
        byte[] bArr = this.f16590;
        bArr[i] = (byte) (((byte) i2) | bArr[i]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14590(C14612 c14612) {
        if (c14612 == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f16598;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC8743 interfaceC8743 = (InterfaceC8743) arrayList.get(i);
            if (interfaceC8743.getType() == 44 && c14612.m35257(interfaceC8743.mo23442())) {
                m14585(i, m14593(i));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m14585(int i, int i2) {
        boolean z = false;
        for (int i3 = i + 1; i3 < i2; i3++) {
            InterfaceC8743 interfaceC8743 = (InterfaceC8743) this.f16598.get(i3);
            if (C22600.m50934(interfaceC8743.getText())) {
                if (interfaceC8743.getType() == 141) {
                    m14583(i3 + 1, 16);
                } else if (interfaceC8743.getType() == 4) {
                    m14583(i3, 32);
                }
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14580(int i, int i2, boolean z, C2680 c2680) {
        ArrayList arrayList = this.f16598;
        int type = ((InterfaceC8743) arrayList.get(i)).getType();
        boolean z2 = ((InterfaceC8743) arrayList.get(i2)).getType() == (type == 91 ? 92 : type == 89 ? 90 : 88);
        int i3 = 3;
        if (z2 && m14593(i) == i2) {
            m14581(i, i2, false, false);
            if (m14594(i, i2)) {
                InterfaceC8743 interfaceC8743 = (InterfaceC8743) arrayList.get(i2 - 1);
                if (interfaceC8743.getType() == 141 && C22600.m50934(interfaceC8743.getText())) {
                    i3 = 2;
                }
                m14582(i2, i3);
                return;
            }
            if (m14587(i, i2)) {
                int i4 = i + 1;
                while (i4 < i2 && ((InterfaceC8743) arrayList.get(i4)).getType() == 141) {
                    i4++;
                }
                int[] iArr = this.f16595;
                iArr[i4] = iArr[i4] + 1;
                iArr[i2] = iArr[i2] - 1;
                m14586(i2);
                return;
            }
            m14582(i2, 3);
            return;
        }
        boolean z3 = type == 91;
        int i5 = 94;
        if (z) {
            m14581(i, m14593(i), false, true);
            if (z2) {
                m14581(m14592(i2), i2, true, false);
            }
            if (c2680 != null) {
                int i6 = 0;
                while (i6 < c2680.f8524) {
                    int iM8847 = c2680.m8847(i6);
                    if (((InterfaceC8743) arrayList.get(iM8847)).getType() == i5) {
                        int iM14593 = m14593(iM8847);
                        m14581(iM8847, iM14593, true, (z2 && iM14593 == i2) ? false : true);
                    }
                    i6++;
                    i5 = 94;
                }
            }
            m14586(m14593(i));
            int[] iArr2 = this.f16595;
            int iM14594 = m14593(i);
            iArr2[iM14594] = iArr2[iM14594] + 1;
            if (z2) {
                m14586(i2);
                int[] iArr3 = this.f16595;
                iArr3[i2] = iArr3[i2] - 1;
            }
        } else {
            m14582(m14593(i), z3 ? 1 : 3);
            if (z2) {
                m14582(i2, z3 ? 1 : 3);
            }
        }
        int i7 = 0;
        for (int i8 = i + 1; i8 < i2; i8++) {
            int type2 = ((InterfaceC8743) arrayList.get(i8)).getType();
            if (type2 == 91 || type2 == 89 || type2 == 87) {
                i7++;
            }
            if (type2 == 92 || type2 == 90 || type2 == 88) {
                i7--;
            }
            if (i7 == 0 && (type2 == 94 || type2 == 93)) {
                int iM14595 = m14593(i8);
                if (z) {
                    m14586(iM14595);
                } else {
                    m14584(iM14595);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14581(int i, int i2, boolean z, boolean z2) {
        if (this.f16589 == EnumC7440.JSON) {
            return;
        }
        while (true) {
            i++;
            if (i > i2) {
                return;
            }
            C7155.m19727();
            if (((InterfaceC8743) this.f16598.get(i)).getType() != 141) {
                if (z && (i != i2 || z2)) {
                    m14583(i, 128);
                }
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m14593(int i) {
        ArrayList arrayList;
        do {
            i++;
            arrayList = this.f16598;
            if (i >= arrayList.size()) {
                break;
            }
        } while (((InterfaceC8743) arrayList.get(i)).mo23441() != 0);
        return Math.min(i, arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m14592(int i) {
        do {
            i--;
            if (i < 0) {
                break;
            }
        } while (((InterfaceC8743) this.f16598.get(i)).mo23441() != 0);
        return i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m14586(int i) {
        if (i < 0 || i >= this.f16590.length) {
            return;
        }
        m14582(i, 2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m14584(int i) {
        if (i < 0 || i >= this.f16590.length || m14588(i) == 2) {
            return;
        }
        m14582(i, 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m14594(int i, int i2) {
        for (int i3 = i + 1; i3 < i2; i3++) {
            InterfaceC8743 interfaceC8743 = (InterfaceC8743) this.f16598.get(i3);
            int type = interfaceC8743.getType();
            if (type == 4 || type == 3) {
                String text = interfaceC8743.getText();
                if (text.contains("@ts-") || text.contains("#__PURE__") || text.contains("@__PURE__") || text.contains("sourceURL=") || text.contains("sourceMappingURL=") || text.contains("eslint") || text.contains("prettier") || text.contains("istanbul")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m14587(int i, int i2) {
        for (int i3 = i + 1; i3 < i2; i3++) {
            int type = ((InterfaceC8743) this.f16598.get(i3)).getType();
            if (type == 3 || type == 4 || type == 2) {
                return true;
            }
        }
        return false;
    }
}
