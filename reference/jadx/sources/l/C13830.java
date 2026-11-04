package l;

/* JADX INFO: renamed from: l.۬ۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C13830 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char f43897;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f43898;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f43899;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC2885 f43900;

    public C13830(char c, int i) {
        this.f43898 = i;
        this.f43899 = true;
        this.f43897 = c;
        this.f43900 = null;
    }

    public C13830(int i, InterfaceC2885 interfaceC2885) {
        this.f43898 = i;
        this.f43899 = false;
        this.f43897 = (char) 0;
        this.f43900 = interfaceC2885;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13830 m33754(C0407 c0407, InterfaceC2885 interfaceC2885, int i) {
        while (true) {
            C13830 c13830 = null;
            if (c0407 == null) {
                break;
            }
            int i2 = 0;
            if (c0407 instanceof C19624) {
                C19624 c19624 = (C19624) c0407;
                int[] iArr = c19624.f19048;
                while (i2 < iArr.length) {
                    int i3 = iArr[i2];
                    if (i3 > 65535) {
                        return null;
                    }
                    if (!interfaceC2885.mo1303(i3)) {
                        return new C13830((char) i3, i + i2);
                    }
                    i2++;
                }
                i += iArr.length;
                c0407 = c19624.f1952;
            } else {
                if (!(c0407 instanceof C6615)) {
                    break;
                }
                C6615 c6615 = (C6615) c0407;
                InterfaceC2885 interfaceC2886 = c6615.f71066;
                int iM33756 = m33756(interfaceC2886);
                if (iM33756 >= 0 && !interfaceC2885.mo1303(iM33756)) {
                    return new C13830((char) iM33756, i);
                }
                int i4 = 0;
                while (true) {
                    if (i2 >= 128) {
                        if (i4 == 0) {
                            break;
                        }
                        c13830 = new C13830(i, interfaceC2886);
                        break;
                    }
                    if (interfaceC2886.mo1303(i2) && (interfaceC2885.mo1303(i2) || (i4 = i4 + 1) > 16)) {
                        break;
                    }
                    i2++;
                }
                if (c13830 != null) {
                    return c13830;
                }
                i++;
                c0407 = c6615.f1952;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13830 m33757(C0407 c0407) {
        C22782 c22782;
        int i;
        C13830 c13830 = null;
        int length = 0;
        while (c0407 != null) {
            if (c0407.getClass() == C19624.class) {
                C19624 c19624 = (C19624) c0407;
                int[] iArr = c19624.f19048;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    int i3 = iArr[i2];
                    if (i3 > 65535) {
                        return c13830;
                    }
                    c13830 = new C13830((char) i3, length + i2);
                }
                length += iArr.length;
                c0407 = c19624.f1952;
            } else if (!(c0407 instanceof C6615)) {
                if (!(c0407 instanceof C22782) || (i = (c22782 = (C22782) c0407).f73902) <= 0 || i != c22782.f73899) {
                    break;
                }
                C0407 c0408 = c22782.f73901;
                if (!(c0408 instanceof C6615)) {
                    break;
                }
                int iM33756 = m33756(((C6615) c0408).f71066);
                if (iM33756 >= 0) {
                    c13830 = new C13830((char) iM33756, (length + i) - 1);
                }
                length += i;
                c0407 = c22782.f1952;
            } else {
                C6615 c6615 = (C6615) c0407;
                int iM33757 = m33756(c6615.f71066);
                if (iM33757 >= 0) {
                    c13830 = new C13830((char) iM33757, length);
                }
                length++;
                c0407 = c6615.f1952;
            }
        }
        return c13830;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13830 m33753(C0407 c0407) {
        int length;
        C13830 c13830M33752;
        int i;
        C13830 c13830 = null;
        int length2 = 0;
        boolean z = false;
        while (c0407 != null) {
            if (c0407.getClass() == C19624.class) {
                C19624 c19624 = (C19624) c0407;
                int[] iArr = c19624.f19048;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    int i3 = iArr[i2];
                    if (i3 > 65535) {
                        return c13830;
                    }
                    if (z) {
                        c13830 = new C13830((char) i3, length2 + i2);
                    }
                }
                length2 += iArr.length;
                c0407 = c19624.f1952;
            } else {
                if (!(c0407 instanceof C6615)) {
                    if (c0407 instanceof C22782) {
                        C22782 c22782 = (C22782) c0407;
                        int i4 = c22782.f73902;
                        C0407 c0408 = c22782.f73901;
                        if (i4 > 0 && i4 == c22782.f73899) {
                            boolean z2 = true;
                            if (c0408.getClass() == C19624.class) {
                                length = ((C19624) c0408).f19048.length;
                            } else {
                                length = c0408 instanceof C6615 ? 1 : -1;
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
                                if (c0408 instanceof C6615) {
                                    C6615 c6615 = (C6615) c0408;
                                    if (i4 <= 1 || m33752(0, c6615.f71066) != null) {
                                        z2 = false;
                                    }
                                } else {
                                    z2 = false;
                                }
                            }
                            if (z2) {
                                int i5 = length2 - length;
                                if (c0408.getClass() == C19624.class) {
                                    int[] iArr2 = ((C19624) c0408).f19048;
                                    for (int i6 = 0; i6 < iArr2.length && (i = iArr2[i6]) <= 65535; i6++) {
                                        c13830 = new C13830((char) i, i5 + i6);
                                    }
                                } else if ((c0408 instanceof C6615) && (c13830M33752 = m33752(i5, ((C6615) c0408).f71066)) != null) {
                                    c13830 = c13830M33752;
                                }
                            }
                            z |= z2;
                            c0407 = c22782.f1952;
                        }
                    }
                    if (!(c0407 instanceof C24515)) {
                        break;
                    }
                    C24515 c24515 = (C24515) c0407;
                    if (c24515.f34348 <= 0) {
                        break;
                    }
                    C13830 c13830M33753 = m33752(length2, c24515.f34347);
                    if (!z || c13830M33753 == null) {
                        break;
                    }
                    return c13830M33753;
                }
                C6615 c6616 = (C6615) c0407;
                C13830 c13830M33754 = m33752(length2, c6616.f71066);
                if (z && c13830M33754 != null) {
                    c13830 = c13830M33754;
                }
                length2++;
                c0407 = c6616.f1952;
            }
        }
        return c13830;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13830 m33752(int i, InterfaceC2885 interfaceC2885) {
        int iM33756 = m33756(interfaceC2885);
        if (iM33756 >= 0) {
            return new C13830((char) iM33756, i);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 128; i3++) {
            if (interfaceC2885.mo1303(i3) && (i2 = i2 + 1) > 16) {
                return null;
            }
        }
        if (i2 == 0) {
            return null;
        }
        return new C13830(i, interfaceC2885);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m33751(C6615 c6615) {
        return m33756(c6615.f71066);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m33756(InterfaceC2885 interfaceC2885) {
        if (interfaceC2885 instanceof C22608) {
            return ((C22608) interfaceC2885).f73066;
        }
        return -1;
    }
}
