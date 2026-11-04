package l;

import com.alipay.sdk.m.y.l;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۜۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BDR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6951 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19242(int i) {
        return i == (i & 255);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m19246(int i) {
        return i == (65535 & i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m19249(int i) {
        return i == (i & 15);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo3133();

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo3134(AbstractC2476 abstractC2476);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3136(C15000 c15000, AbstractC2476 abstractC2476);

    /* JADX INFO: renamed from: ۙ */
    public boolean mo16072(C24631 c24631) {
        return this instanceof C19564;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract String mo3137(AbstractC2476 abstractC2476);

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo3138(AbstractC18884 abstractC18884);

    /* JADX INFO: renamed from: ۙ */
    public BitSet mo3135(AbstractC18884 abstractC18884) {
        return new BitSet();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m19248(C0063 c0063) {
        int size = c0063.size();
        StringBuilder sb = new StringBuilder((size * 5) + 2);
        sb.append('{');
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c0063.m31619get(i).m47904());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m19244(C0063 c0063) {
        int size = c0063.size();
        StringBuilder sbM3018 = C0703.m3018(30, "{");
        if (size != 0) {
            if (size != 1) {
                C20946 c20946M31619get = c0063.m31619get(size - 1);
                if (c20946M31619get.m47901() == 2) {
                    c20946M31619get = c20946M31619get.m47890(1);
                }
                sbM3018.append(c0063.m31619get(0).m47904());
                sbM3018.append("..");
                sbM3018.append(c20946M31619get.m47904());
            } else {
                sbM3018.append(c0063.m31619get(0).m47904());
            }
        }
        sbM3018.append(l.d);
        return sbM3018.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m19235(AbstractC24149 abstractC24149) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('#');
        if (abstractC24149 instanceof C20419) {
            sb.append("null");
        } else {
            sb.append(abstractC24149.mo1845());
            sb.append(' ');
            sb.append(abstractC24149.mo1843());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m19236(AbstractC24149 abstractC24149, int i) {
        StringBuilder sbM3018 = C0703.m3018(20, "#");
        long jMo17876 = abstractC24149 instanceof AbstractC6249 ? ((AbstractC6249) abstractC24149).mo17876() : abstractC24149.mo17877();
        if (i == 4) {
            sbM3018.append(C5306.m15935((int) jMo17876));
        } else if (i == 8) {
            sbM3018.append(C5306.m15936((int) jMo17876));
        } else if (i == 16) {
            sbM3018.append(C5306.m15934((int) jMo17876));
        } else if (i == 32) {
            sbM3018.append(C5306.m15938((int) jMo17876));
        } else {
            if (i != 64) {
                throw new RuntimeException("shouldn't happen");
            }
            sbM3018.append(C5306.m15937(jMo17876));
        }
        return sbM3018.toString();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m19250(AbstractC2476 abstractC2476) {
        int iM54968 = ((C24631) abstractC2476).m54968();
        return iM54968 == ((char) iM54968) ? C5306.m15934(iM54968) : C5306.m15938(iM54968);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m19245(AbstractC2476 abstractC2476) {
        int iM54970 = ((C24631) abstractC2476).m54970();
        if (iM54970 == ((short) iM54970)) {
            char[] cArr = new char[5];
            if (iM54970 < 0) {
                cArr[0] = '-';
                iM54970 = -iM54970;
            } else {
                cArr[0] = '+';
            }
            for (int i = 0; i < 4; i++) {
                cArr[4 - i] = Character.forDigit(iM54970 & 15, 16);
                iM54970 >>= 4;
            }
            return new String(cArr);
        }
        return C5306.m15933(iM54970);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19243(C0063 c0063) {
        int size = c0063.size();
        if (size < 2) {
            return true;
        }
        int iM47903 = c0063.m31619get(0).m47903();
        for (int i = 0; i < size; i++) {
            C20946 c20946M31619get = c0063.m31619get(i);
            if (c20946M31619get.m47903() != iM47903) {
                return false;
            }
            iM47903 += c20946M31619get.m47901();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static short m19239(AbstractC18884 abstractC18884, int i) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("arg out of range 0..255");
        }
        int iM3867 = abstractC18884.m43802().m3867();
        if ((iM3867 & 255) == iM3867) {
            return (short) (iM3867 | (i << 8));
        }
        throw new IllegalArgumentException("opcode out of range 0..255");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static short m19237(int i, int i2) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("low out of range 0..255");
        }
        if ((i2 & 255) == i2) {
            return (short) (i | (i2 << 8));
        }
        throw new IllegalArgumentException("high out of range 0..255");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static short m19238(int i, int i2, int i3, int i4) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m19247(int i, int i2) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("low out of range 0..15");
        }
        if ((i2 & 15) == i2) {
            return i | (i2 << 4);
        }
        throw new IllegalArgumentException("high out of range 0..15");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19240(InterfaceC8550 interfaceC8550, short s, short s2) {
        C15000 c15000 = (C15000) interfaceC8550;
        c15000.m36123(s);
        c15000.m36123(s2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19241(C15000 c15000, short s, int i) {
        c15000.m36123(s);
        c15000.m36123((short) i);
        c15000.m36123((short) (i >> 16));
    }
}
