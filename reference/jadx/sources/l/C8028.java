package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.۟ܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TF */
/* JADX INFO: loaded from: classes3.dex */
public final class C8028 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f26646 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13535 m21894(C9169 c9169) {
        return m21896(c9169, true, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13535 m21895(InterfaceC19502 interfaceC19502, boolean z) {
        return m21896(interfaceC19502, false, z);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x012b  */
    /* JADX WARN: Code duplicated, block: B:85:0x012e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0134  */
    /* JADX WARN: Code duplicated, block: B:90:0x0137  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13535 m21896(InterfaceC19502 interfaceC19502, boolean z, boolean z2) {
        InterfaceC13535 interfaceC13535;
        boolean z3;
        int i;
        long j;
        boolean z4;
        int[] iArr;
        long length = interfaceC19502.getLength();
        long j2 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        long j3 = -1;
        if (length != -1 && length <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            j2 = length;
        }
        int i2 = (int) j2;
        C21287 c21287 = new C21287(64);
        int i3 = 0;
        int i4 = 0;
        boolean z5 = false;
        while (true) {
            if (i4 < i2) {
                c21287.m48496(8);
                if (interfaceC19502.mo10078(true, i3, 8, c21287.m48497())) {
                    long jM48485 = c21287.m48485();
                    int iM48500 = c21287.m48500();
                    if (jM48485 == 1) {
                        interfaceC19502.mo10069(8, 8, c21287.m48497());
                        i = 16;
                        c21287.m48517(16);
                        jM48485 = c21287.m48518();
                    } else {
                        if (jM48485 == 0) {
                            long length2 = interfaceC19502.getLength();
                            if (length2 != j3) {
                                jM48485 = (length2 - interfaceC19502.mo10072()) + ((long) 8);
                            }
                        }
                        i = 8;
                    }
                    long j4 = jM48485;
                    long j5 = i;
                    if (j4 < j5) {
                        return new C6540();
                    }
                    i4 += i;
                    if (iM48500 == 1836019574) {
                        i2 += (int) j4;
                        if (length != -1 && i2 > length) {
                            i2 = (int) length;
                        }
                        j = length;
                    } else if (iM48500 == 1836019558 || iM48500 == 1836475768) {
                        z3 = true;
                        interfaceC13535 = null;
                    } else {
                        if (iM48500 == 1835295092) {
                            z5 = true;
                        }
                        j = length;
                        boolean z6 = z5;
                        if ((((long) i4) + j4) - j5 >= i2) {
                            z5 = z6;
                            interfaceC13535 = null;
                            z3 = false;
                        } else {
                            int i5 = (int) (j4 - j5);
                            i4 += i5;
                            if (iM48500 != 1718909296) {
                                if (i5 != 0) {
                                    interfaceC19502.mo10068(i5);
                                }
                                z5 = z6;
                            } else {
                                if (i5 < 8) {
                                    return new C6540();
                                }
                                c21287.m48496(i5);
                                interfaceC19502.mo10069(0, i5, c21287.m48497());
                                boolean z7 = m21897(c21287.m48500(), z2) ? true : z6;
                                c21287.m48503(4);
                                int iM48486 = c21287.m48486() / 4;
                                if (!z7 && iM48486 > 0) {
                                    iArr = new int[iM48486];
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= iM48486) {
                                            z4 = z7;
                                            break;
                                        }
                                        int iM48501 = c21287.m48500();
                                        iArr[i6] = iM48501;
                                        if (m21897(iM48501, z2)) {
                                            z4 = true;
                                            break;
                                        }
                                        i6++;
                                    }
                                } else {
                                    z4 = z7;
                                    iArr = null;
                                }
                                if (!z4) {
                                    C6544 c6544 = new C6544();
                                    if (iArr != null) {
                                        C14714.m35383(iArr);
                                        return c6544;
                                    }
                                    int i7 = C14714.f48076;
                                    return c6544;
                                }
                                z5 = z4;
                            }
                        }
                    }
                    i3 = 0;
                    length = j;
                    j3 = -1;
                }
                if (!z5) {
                    return C4299.f15585;
                }
                if (z != z3) {
                    return interfaceC13535;
                }
                if (z3) {
                    return C23691.f76818;
                }
                return C23691.f76819;
            }
            interfaceC13535 = null;
            z3 = false;
            if (!z5) {
                return C4299.f15585;
            }
            if (z != z3) {
                return interfaceC13535;
            }
            if (z3) {
                return C23691.f76818;
            }
            return C23691.f76819;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21897(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (f26646[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
