package l;

import com.alipay.sdk.m.y.l;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ܳۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BDR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14322 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34568(int i) {
        return i == (i & 255);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m34572(int i) {
        return i == (65535 & i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m34575(int i) {
        return i == (i & 15);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo3096();

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo3097(AbstractC10794 abstractC10794);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3099(C2718 c2718, AbstractC10794 abstractC10794);

    /* JADX INFO: renamed from: ۙ */
    public boolean mo10389(C9175 c9175) {
        return this instanceof C11375;
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract String mo3100(AbstractC10794 abstractC10794);

    /* JADX INFO: renamed from: ܰ */
    public abstract boolean mo3101(AbstractC16438 abstractC16438);

    /* JADX INFO: renamed from: ۙ */
    public BitSet mo3098(AbstractC16438 abstractC16438) {
        return new BitSet();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m34574(C0727 c0727) {
        int size = c0727.size();
        StringBuilder sb = new StringBuilder((size * 5) + 2);
        sb.append('{');
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c0727.m15275get(i).m38392());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m34570(C0727 c0727) {
        int size = c0727.size();
        StringBuilder sbM40152 = C17214.m40152(30, "{");
        if (size != 0) {
            if (size != 1) {
                C16251 c16251M15275get = c0727.m15275get(size - 1);
                if (c16251M15275get.m38396() == 2) {
                    c16251M15275get = c16251M15275get.m38389(1);
                }
                sbM40152.append(c0727.m15275get(0).m38392());
                sbM40152.append("..");
                sbM40152.append(c16251M15275get.m38392());
            } else {
                sbM40152.append(c0727.m15275get(0).m38392());
            }
        }
        sbM40152.append(l.d);
        return sbM40152.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34561(AbstractC10377 abstractC10377) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('#');
        if (abstractC10377 instanceof C8260) {
            sb.append("null");
        } else {
            sb.append(abstractC10377.mo2375());
            sb.append(' ');
            sb.append(abstractC10377.mo2376());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34562(AbstractC10377 abstractC10377, int i) {
        StringBuilder sbM40152 = C17214.m40152(20, "#");
        long jMo21659 = abstractC10377 instanceof AbstractC8966 ? ((AbstractC8966) abstractC10377).mo21659() : abstractC10377.mo21658();
        if (i == 4) {
            sbM40152.append(C22475.m49981((int) jMo21659));
        } else if (i == 8) {
            sbM40152.append(C22475.m49983((int) jMo21659));
        } else if (i == 16) {
            sbM40152.append(C22475.m49982((int) jMo21659));
        } else if (i == 32) {
            sbM40152.append(C22475.m49978((int) jMo21659));
        } else {
            if (i != 64) {
                throw new RuntimeException("shouldn't happen");
            }
            sbM40152.append(C22475.m49980(jMo21659));
        }
        return sbM40152.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m34560(AbstractC10794 abstractC10794) {
        int iM23588 = ((C9175) abstractC10794).m23588();
        return iM23588 == ((char) iM23588) ? C22475.m49982(iM23588) : C22475.m49978(iM23588);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m34571(AbstractC10794 abstractC10794) {
        int iM23589 = ((C9175) abstractC10794).m23589();
        if (iM23589 == ((short) iM23589)) {
            char[] cArr = new char[5];
            if (iM23589 < 0) {
                cArr[0] = '-';
                iM23589 = -iM23589;
            } else {
                cArr[0] = '+';
            }
            for (int i = 0; i < 4; i++) {
                cArr[4 - i] = Character.forDigit(iM23589 & 15, 16);
                iM23589 >>= 4;
            }
            return new String(cArr);
        }
        return C22475.m49979(iM23589);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34569(C0727 c0727) {
        int size = c0727.size();
        if (size < 2) {
            return true;
        }
        int iM38400 = c0727.m15275get(0).m38400();
        for (int i = 0; i < size; i++) {
            C16251 c16251M15275get = c0727.m15275get(i);
            if (c16251M15275get.m38400() != iM38400) {
                return false;
            }
            iM38400 += c16251M15275get.m38396();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static short m34565(AbstractC16438 abstractC16438, int i) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("arg out of range 0..255");
        }
        int iM40071 = abstractC16438.m38693().m40071();
        if ((iM40071 & 255) == iM40071) {
            return (short) (iM40071 | (i << 8));
        }
        throw new IllegalArgumentException("opcode out of range 0..255");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static short m34563(int i, int i2) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("low out of range 0..255");
        }
        if ((i2 & 255) == i2) {
            return (short) (i | (i2 << 8));
        }
        throw new IllegalArgumentException("high out of range 0..255");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static short m34564(int i, int i2, int i3, int i4) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("n0 out of range 0..15");
        }
        if ((i2 & 15) != i2) {
            throw new IllegalArgumentException("n1 out of range 0..15");
        }
        if ((i3 & 15) != i3) {
            throw new IllegalArgumentException("n2 out of range 0..15");
        }
        if ((i4 & 15) == i4) {
            return (short) (i | (i2 << 4) | (i3 << 8) | (i4 << 12));
        }
        throw new IllegalArgumentException("n3 out of range 0..15");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m34573(int i, int i2) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("low out of range 0..15");
        }
        if ((i2 & 15) == i2) {
            return i | (i2 << 4);
        }
        throw new IllegalArgumentException("high out of range 0..15");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34567(InterfaceC23865 interfaceC23865, short s, short s2) {
        C2718 c2718 = (C2718) interfaceC23865;
        c2718.m8297(s);
        c2718.m8297(s2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34566(C2718 c2718, short s, int i) {
        c2718.m8297(s);
        c2718.m8297((short) i);
        c2718.m8297((short) (i >> 16));
    }
}
