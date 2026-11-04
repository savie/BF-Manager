package l;

/* JADX INFO: renamed from: l.ۜ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6KB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6790 implements InterfaceC13530, InterfaceC12789 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static int f22641 = -1;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static boolean f22642;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static int f22643;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int f22644;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int f22645;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int f22646;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static long f22647;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static char m18964(int i) {
        int i2 = i & 61440;
        if (i2 == 4096) {
            return 'p';
        }
        if (i2 == 8192) {
            return 'c';
        }
        if (i2 == 16384) {
            return 'd';
        }
        if (i2 == 24576) {
            return 'b';
        }
        if (i2 == 32768) {
            return '-';
        }
        if (i2 != 40960) {
            return i2 != 49152 ? '?' : 's';
        }
        return 'l';
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean[] m18972(int i) {
        return new boolean[]{(i & 256) != 0, (i & 128) != 0, (i & 64) != 0, (i & 32) != 0, (i & 16) != 0, (i & 8) != 0, (i & 4) != 0, (i & 2) != 0, (i & 1) != 0, (i & 2048) != 0, (i & 1024) != 0, (i & 512) != 0};
    }

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ۙ */
    public void mo16659(InterfaceC9060 interfaceC9060) {
    }

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ܳ */
    public void mo16661() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m18955(char c, CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18961(InterfaceC2386 interfaceC2386) {
        return interfaceC2386 != null && interfaceC2386.mo8090() && interfaceC2386.mo8114().startsWith("video/") && !C22337.m50405(interfaceC2386.getName());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m18962(int i) {
        f22641 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m18954() {
        return f22644;
    }

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC22024 mo16658(int i, int i2) {
        return new C4586();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m18970(int i) {
        f22644 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m18965() {
        return f22645;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m18968(int i) {
        f22645 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m18976() {
        return f22646;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18952(int i) {
        f22646 = i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m18971() {
        return f22643;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m18966(int i) {
        f22643 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m18974() {
        return f22647;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18958(long j) {
        f22647 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18960(int i) {
        switch (Character.getType(i)) {
            default:
                if (i != 36 && i != 43 && i != 94 && i != 96 && i != 124 && i != 126) {
                    switch (i) {
                        case 60:
                        case 61:
                        case 62:
                            break;
                        default:
                            return false;
                    }
                }
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                return true;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m18977(int i) {
        StringBuilder sb = new StringBuilder(9);
        sb.append((i & 256) != 0 ? 'r' : '-');
        sb.append((i & 128) != 0 ? 'w' : '-');
        if ((i & 2048) != 0) {
            sb.append((i & 64) != 0 ? 's' : 'S');
        } else {
            sb.append((i & 64) != 0 ? 'x' : '-');
        }
        sb.append((i & 32) != 0 ? 'r' : '-');
        sb.append((i & 16) != 0 ? 'w' : '-');
        if ((i & 1024) != 0) {
            sb.append((i & 8) != 0 ? 's' : 'S');
        } else {
            sb.append((i & 8) != 0 ? 'x' : '-');
        }
        sb.append((i & 4) == 0 ? '-' : 'r');
        sb.append((i & 2) == 0 ? '-' : 'w');
        if ((i & 512) != 0) {
            sb.append((i & 1) != 0 ? 't' : 'T');
        } else {
            sb.append((i & 1) != 0 ? 'x' : '-');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m18967() {
        return f22642;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18959(boolean z) {
        f22642 = z;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m18969() {
        return f22647 < System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18953() {
        return f22641 == -1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m18963() {
        return f22641 == 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m18978() {
        f22641 = -1;
        f22644 = 0;
        f22645 = 0;
        f22646 = 0;
        f22643 = 0;
        f22647 = 0L;
        f22642 = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m18975(int i) {
        return i == 9 || i == 10 || i == 12 || i == 13 || i == 32 || Character.getType(i) == 12;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m18956(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m18957(String str) {
        boolean z;
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        char cCharAt7;
        char cCharAt8;
        if (str.length() != 9) {
            throw new IllegalArgumentException(str);
        }
        int i = 0;
        char cCharAt9 = str.charAt(0);
        boolean z2 = true;
        if (cCharAt9 != 'r') {
            z = cCharAt9 != '-';
            cCharAt = str.charAt(1);
            if (cCharAt == 'w') {
                i |= 128;
            } else if (cCharAt != '-') {
                z = true;
            }
            cCharAt2 = str.charAt(2);
            if (cCharAt2 == 's') {
                i |= 2112;
            } else if (cCharAt2 == 'S') {
                i |= 2048;
            } else if (cCharAt2 == 'x') {
                i |= 64;
            } else if (cCharAt2 != '-') {
                z = true;
            }
            cCharAt3 = str.charAt(3);
            if (cCharAt3 == 'r') {
                i |= 32;
            } else if (cCharAt3 != '-') {
                z = true;
            }
            cCharAt4 = str.charAt(4);
            if (cCharAt4 == 'w') {
                i |= 16;
            } else if (cCharAt4 != '-') {
                z = true;
            }
            cCharAt5 = str.charAt(5);
            if (cCharAt5 == 's') {
                i |= 1032;
            } else if (cCharAt5 == 'S') {
                i |= 1024;
            } else if (cCharAt5 == 'x') {
                i |= 8;
            } else if (cCharAt5 != '-') {
                z = true;
            }
            cCharAt6 = str.charAt(6);
            if (cCharAt6 == 'r') {
                i |= 4;
            } else if (cCharAt6 != '-') {
                z = true;
            }
            cCharAt7 = str.charAt(7);
            if (cCharAt7 == 'w') {
                i |= 2;
            } else if (cCharAt7 != '-') {
                z = true;
            }
            cCharAt8 = str.charAt(8);
            if (cCharAt8 == 't') {
                i |= 513;
            } else if (cCharAt8 == 'T') {
                i |= 512;
            } else {
                if (cCharAt8 == 'x') {
                    if (cCharAt8 == '-') {
                    }
                    if (z2) {
                        throw new IllegalArgumentException(str);
                    }
                    return i;
                }
                i |= 1;
            }
            z2 = z;
            if (z2) {
                return i;
            }
            throw new IllegalArgumentException(str);
        }
        i = 256;
        cCharAt = str.charAt(1);
        if (cCharAt == 'w') {
            i |= 128;
        } else if (cCharAt != '-') {
            z = true;
        }
        cCharAt2 = str.charAt(2);
        if (cCharAt2 == 's') {
            i |= 2112;
        } else if (cCharAt2 == 'S') {
            i |= 2048;
        } else if (cCharAt2 == 'x') {
            i |= 64;
        } else if (cCharAt2 != '-') {
            z = true;
        }
        cCharAt3 = str.charAt(3);
        if (cCharAt3 == 'r') {
            i |= 32;
        } else if (cCharAt3 != '-') {
            z = true;
        }
        cCharAt4 = str.charAt(4);
        if (cCharAt4 == 'w') {
            i |= 16;
        } else if (cCharAt4 != '-') {
            z = true;
        }
        cCharAt5 = str.charAt(5);
        if (cCharAt5 == 's') {
            i |= 1032;
        } else if (cCharAt5 == 'S') {
            i |= 1024;
        } else if (cCharAt5 == 'x') {
            i |= 8;
        } else if (cCharAt5 != '-') {
            z = true;
        }
        cCharAt6 = str.charAt(6);
        if (cCharAt6 == 'r') {
            i |= 4;
        } else if (cCharAt6 != '-') {
            z = true;
        }
        cCharAt7 = str.charAt(7);
        if (cCharAt7 == 'w') {
            i |= 2;
        } else if (cCharAt7 != '-') {
            z = true;
        }
        cCharAt8 = str.charAt(8);
        if (cCharAt8 == 't') {
            i |= 513;
        } else if (cCharAt8 == 'T') {
            i |= 512;
        } else {
            if (cCharAt8 == 'x') {
                if (cCharAt8 == '-') {
                }
                if (z2) {
                    return i;
                }
                throw new IllegalArgumentException(str);
            }
            i |= 1;
        }
        z2 = z;
        if (z2) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m18973(int i, int i2, CharSequence charSequence) {
        while (i >= i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }
}
