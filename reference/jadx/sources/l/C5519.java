package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ۚᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TF */
/* JADX INFO: loaded from: classes2.dex */
public final class C5519 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f18940 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17888 m15225(C14984 c14984) {
        return m15224(c14984, true, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17888 m15223(InterfaceC7222 interfaceC7222, boolean z) {
        return m15224(interfaceC7222, false, z);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x012b  */
    /* JADX WARN: Code duplicated, block: B:85:0x012e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0134  */
    /* JADX WARN: Code duplicated, block: B:90:0x0137  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17888 m15224(InterfaceC7222 interfaceC7222, boolean z, boolean z2) {
        InterfaceC17888 interfaceC17888;
        boolean z3;
        int i;
        long j;
        boolean z4;
        int[] iArr;
        long length = interfaceC7222.getLength();
        long j2 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        long j3 = -1;
        if (length != -1 && length <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            j2 = length;
        }
        int i2 = (int) j2;
        C2460 c2460 = new C2460(64);
        int i3 = 0;
        int i4 = 0;
        boolean z5 = false;
        while (true) {
            if (i4 < i2) {
                c2460.m7517(8);
                if (interfaceC7222.mo19219(true, i3, 8, c2460.m7518())) {
                    long jM7532 = c2460.m7532();
                    int iM7499 = c2460.m7499();
                    if (jM7532 == 1) {
                        interfaceC7222.mo19210(8, 8, c2460.m7518());
                        i = 16;
                        c2460.m7501(16);
                        jM7532 = c2460.m7529();
                    } else {
                        if (jM7532 == 0) {
                            long length2 = interfaceC7222.getLength();
                            if (length2 != j3) {
                                jM7532 = (length2 - interfaceC7222.mo19213()) + ((long) 8);
                            }
                        }
                        i = 8;
                    }
                    long j4 = jM7532;
                    long j5 = i;
                    if (j4 < j5) {
                        return new C1791();
                    }
                    i4 += i;
                    if (iM7499 == 1836019574) {
                        i2 += (int) j4;
                        if (length != -1 && i2 > length) {
                            i2 = (int) length;
                        }
                        j = length;
                    } else if (iM7499 == 1836019558 || iM7499 == 1836475768) {
                        z3 = true;
                        interfaceC17888 = null;
                    } else {
                        if (iM7499 == 1835295092) {
                            z5 = true;
                        }
                        j = length;
                        boolean z6 = z5;
                        if ((((long) i4) + j4) - j5 >= i2) {
                            z5 = z6;
                            interfaceC17888 = null;
                            z3 = false;
                        } else {
                            int i5 = (int) (j4 - j5);
                            i4 += i5;
                            if (iM7499 != 1718909296) {
                                if (i5 != 0) {
                                    interfaceC7222.mo19209(i5);
                                }
                                z5 = z6;
                            } else {
                                if (i5 < 8) {
                                    return new C1791();
                                }
                                c2460.m7517(i5);
                                interfaceC7222.mo19210(0, i5, c2460.m7518());
                                boolean z7 = m15226(c2460.m7499(), z2) ? true : z6;
                                c2460.m7535(4);
                                int iM7503 = c2460.m7503() / 4;
                                if (!z7 && iM7503 > 0) {
                                    iArr = new int[iM7503];
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= iM7503) {
                                            z4 = z7;
                                            break;
                                        }
                                        int iM74910 = c2460.m7499();
                                        iArr[i6] = iM74910;
                                        if (m15226(iM74910, z2)) {
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
                                    C13012 c13012 = new C13012();
                                    if (iArr != null) {
                                        C16334.m38508(iArr);
                                        return c13012;
                                    }
                                    int i7 = C16334.f52619;
                                    return c13012;
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
                    return C3506.f12860;
                }
                if (z != z3) {
                    return interfaceC17888;
                }
                if (z3) {
                    return C6329.f21371;
                }
                return C6329.f21372;
            }
            interfaceC17888 = null;
            z3 = false;
            if (!z5) {
                return C3506.f12860;
            }
            if (z != z3) {
                return interfaceC17888;
            }
            if (z3) {
                return C6329.f21371;
            }
            return C6329.f21372;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15226(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (f18940[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
