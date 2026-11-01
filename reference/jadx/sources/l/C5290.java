package l;

/* JADX INFO: renamed from: l.ۚۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C5290 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13717 f18300;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char f18301;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f18302;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f18303;

    public C5290(char c, int i) {
        this.f18302 = i;
        this.f18303 = true;
        this.f18301 = c;
        this.f18300 = null;
    }

    public C5290(int i, InterfaceC13717 interfaceC13717) {
        this.f18302 = i;
        this.f18303 = false;
        this.f18301 = (char) 0;
        this.f18300 = interfaceC13717;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5290 m14661(C23595 c23595, InterfaceC13717 interfaceC13717, int i) {
        while (true) {
            C5290 c5290 = null;
            if (c23595 == null) {
                break;
            }
            int i2 = 0;
            if (c23595 instanceof C6701) {
                C6701 c6701 = (C6701) c23595;
                int[] iArr = c6701.f69912;
                while (i2 < iArr.length) {
                    int i3 = iArr[i2];
                    if (i3 > 65535) {
                        return null;
                    }
                    if (!interfaceC13717.mo1813(i3)) {
                        return new C5290((char) i3, i + i2);
                    }
                    i2++;
                }
                i += iArr.length;
                c23595 = c6701.f76439;
            } else {
                if (!(c23595 instanceof C0619)) {
                    break;
                }
                C0619 c0619 = (C0619) c23595;
                InterfaceC13717 interfaceC13718 = c0619.f4704;
                int iM14663 = m14663(interfaceC13718);
                if (iM14663 >= 0 && !interfaceC13717.mo1813(iM14663)) {
                    return new C5290((char) iM14663, i);
                }
                int i4 = 0;
                while (true) {
                    if (i2 >= 128) {
                        if (i4 == 0) {
                            break;
                        }
                        c5290 = new C5290(i, interfaceC13718);
                        break;
                    }
                    if (interfaceC13718.mo1813(i2) && (interfaceC13717.mo1813(i2) || (i4 = i4 + 1) > 16)) {
                        break;
                    }
                    i2++;
                }
                if (c5290 != null) {
                    return c5290;
                }
                i++;
                c23595 = c0619.f76439;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C5290 m14664(C23595 c23595) {
        C3837 c3837;
        int i;
        C5290 c5290 = null;
        int length = 0;
        while (c23595 != null) {
            if (c23595.getClass() == C6701.class) {
                C6701 c6701 = (C6701) c23595;
                int[] iArr = c6701.f69912;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    int i3 = iArr[i2];
                    if (i3 > 65535) {
                        return c5290;
                    }
                    c5290 = new C5290((char) i3, length + i2);
                }
                length += iArr.length;
                c23595 = c6701.f76439;
            } else if (!(c23595 instanceof C0619)) {
                if (!(c23595 instanceof C3837) || (i = (c3837 = (C3837) c23595).f14305) <= 0 || i != c3837.f14307) {
                    break;
                }
                C23595 c23596 = c3837.f14308;
                if (!(c23596 instanceof C0619)) {
                    break;
                }
                int iM14663 = m14663(((C0619) c23596).f4704);
                if (iM14663 >= 0) {
                    c5290 = new C5290((char) iM14663, (length + i) - 1);
                }
                length += i;
                c23595 = c3837.f76439;
            } else {
                C0619 c0619 = (C0619) c23595;
                int iM14664 = m14663(c0619.f4704);
                if (iM14664 >= 0) {
                    c5290 = new C5290((char) iM14664, length);
                }
                length++;
                c23595 = c0619.f76439;
            }
        }
        return c5290;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5290 m14660(C23595 c23595) {
        int length;
        C5290 c5290M14659;
        int i;
        C5290 c5290 = null;
        int length2 = 0;
        boolean z = false;
        while (c23595 != null) {
            if (c23595.getClass() == C6701.class) {
                C6701 c6701 = (C6701) c23595;
                int[] iArr = c6701.f69912;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    int i3 = iArr[i2];
                    if (i3 > 65535) {
                        return c5290;
                    }
                    if (z) {
                        c5290 = new C5290((char) i3, length2 + i2);
                    }
                }
                length2 += iArr.length;
                c23595 = c6701.f76439;
            } else {
                if (!(c23595 instanceof C0619)) {
                    if (c23595 instanceof C3837) {
                        C3837 c3837 = (C3837) c23595;
                        int i4 = c3837.f14305;
                        C23595 c23596 = c3837.f14308;
                        if (i4 > 0 && i4 == c3837.f14307) {
                            boolean z2 = true;
                            if (c23596.getClass() == C6701.class) {
                                length = ((C6701) c23596).f69912.length;
                            } else {
                                length = c23596 instanceof C0619 ? 1 : -1;
                            }
                            if (length < 0) {
                                break;
                            }
                            long j = (((long) length) * ((long) i4)) + ((long) length2);
                            length2 = j > 2147483647L ? -1 : (int) j;
                            if (length2 < 0) {
                                break;
                            }
                            if (!z) {
                                if (c23596 instanceof C0619) {
                                    C0619 c0619 = (C0619) c23596;
                                    if (i4 <= 1 || m14659(0, c0619.f4704) != null) {
                                        z2 = false;
                                    }
                                } else {
                                    z2 = false;
                                }
                            }
                            if (z2) {
                                int i5 = length2 - length;
                                if (c23596.getClass() == C6701.class) {
                                    int[] iArr2 = ((C6701) c23596).f69912;
                                    for (int i6 = 0; i6 < iArr2.length && (i = iArr2[i6]) <= 65535; i6++) {
                                        c5290 = new C5290((char) i, i5 + i6);
                                    }
                                } else if ((c23596 instanceof C0619) && (c5290M14659 = m14659(i5, ((C0619) c23596).f4704)) != null) {
                                    c5290 = c5290M14659;
                                }
                            }
                            z |= z2;
                            c23595 = c3837.f76439;
                        }
                    }
                    if (!(c23595 instanceof C16848)) {
                        break;
                    }
                    C16848 c16848 = (C16848) c23595;
                    if (c16848.f43383 <= 0) {
                        break;
                    }
                    C5290 c5290M146510 = m14659(length2, c16848.f43382);
                    if (!z || c5290M146510 == null) {
                        break;
                    }
                    return c5290M146510;
                }
                C0619 c06110 = (C0619) c23595;
                C5290 c5290M146511 = m14659(length2, c06110.f4704);
                if (z && c5290M146511 != null) {
                    c5290 = c5290M146511;
                }
                length2++;
                c23595 = c06110.f76439;
            }
        }
        return c5290;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5290 m14659(int i, InterfaceC13717 interfaceC13717) {
        int iM14663 = m14663(interfaceC13717);
        if (iM14663 >= 0) {
            return new C5290((char) iM14663, i);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 128; i3++) {
            if (interfaceC13717.mo1813(i3) && (i2 = i2 + 1) > 16) {
                return null;
            }
        }
        if (i2 == 0) {
            return null;
        }
        return new C5290(i, interfaceC13717);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m14657(C0619 c0619) {
        return m14663(c0619.f4704);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m14663(InterfaceC13717 interfaceC13717) {
        if (interfaceC13717 instanceof C3878) {
            return ((C3878) interfaceC13717).f14501;
        }
        return -1;
    }
}
