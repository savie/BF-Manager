package l;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: renamed from: l.᩷᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7KC */
/* JADX INFO: loaded from: classes.dex */
public final class C22273 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final BitSet f72124;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final BitSet f72125;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final BitSet f72126;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final BitSet f72127;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final BitSet f72128;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final BitSet f72129;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9002 f72130;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C5119 f72131;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14764 f72132;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15252 f72133;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11172 f72134;

    public C22273(C11172 c11172, C9002 c9002, C15252 c15252, C14764 c14764) {
        this.f72134 = c11172;
        this.f72130 = c9002;
        this.f72133 = c15252;
        this.f72132 = c14764;
    }

    static {
        BitSet bitSet = new BitSet();
        f72128 = bitSet;
        BitSet bitSet2 = new BitSet();
        f72127 = bitSet2;
        BitSet bitSet3 = new BitSet();
        f72125 = bitSet3;
        BitSet bitSet4 = new BitSet();
        f72126 = bitSet4;
        BitSet bitSet5 = new BitSet();
        f72129 = bitSet5;
        BitSet bitSet6 = new BitSet();
        f72124 = bitSet6;
        bitSet.set(7);
        bitSet2.set(3, 9);
        bitSet3.set(19);
        bitSet4.set(20);
        bitSet5.set(1);
        bitSet6.set(12);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24550 m50337(int i) {
        return (C24550) this.f72131.m15480(f72128, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m50336(int i, InterfaceC10777 interfaceC10777) {
        return m50338(this.f72130.m24023(this.f72131.m15479(i)), interfaceC10777);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m50344(int i, InterfaceC10777 interfaceC10777) {
        return m50338(this.f72130.m24023(this.f72131.m15479(i)), interfaceC10777);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2920 m50339(int i) {
        return (C2920) this.f72131.m15480(f72125, i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14106 m50341(int i) {
        return (C14106) this.f72131.m15480(f72126, i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 m50345(int i) {
        return (AbstractC19728) this.f72131.m15480(f72129, i);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m50340(int i) {
        AbstractC19728 abstractC19728M50345 = m50345(i);
        C11172 c11172 = this.f72134;
        C17359.requireNonNull(c11172);
        byte[] bArrMo42394 = abstractC19728M50345.mo42394();
        int iMo42398 = abstractC19728M50345.mo42398();
        int iMo42395 = abstractC19728M50345.mo42395();
        c11172.f35191 = bArrMo42394;
        c11172.f35207 = iMo42398;
        c11172.f35211 = iMo42398 + iMo42395;
        return c11172.m28134();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6853 m50342(int i) {
        return (C6853) this.f72131.m15480(f72124, i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m50343(int i) {
        return this.f72131.m15480(f72127, i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m50338(int i, InterfaceC10777 interfaceC10777) {
        int iM15481 = this.f72131.m15481(i);
        int iM15479 = this.f72131.m15479(i);
        if (iM15481 == 1) {
            return interfaceC10777.mo27471(iM15479 + 2, this.f72131.f17830.m24023(iM15479), this.f72131.f17830.f29317);
        }
        throw this.f72134.m28121("unexpected.const.pool.tag.at", Integer.toString(iM15481), Integer.toString(iM15479 - 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m50333(C22273 c22273, C9002 c9002, int i, int i2) {
        C15252 c15252 = c22273.f72133;
        C14764 c14764 = c22273.f72132;
        C11172 c11172 = c22273.f72134;
        if (i == 1) {
            return c15252.f49864.mo2068(i2 + 2, c9002.m24023(i2), c9002.f29317);
        }
        if (i == 12) {
            return new C6853(c22273.m50345(c9002.m24023(i2)), c22273.m50340(c9002.m24023(i2 + 2)));
        }
        if (i == 19) {
            return c14764.m35515(c22273.m50345(c9002.m24023(i2)));
        }
        if (i != 20) {
            switch (i) {
                case 3:
                    return Integer.valueOf(c9002.m24021(i2));
                case 4:
                    c9002.getClass();
                    try {
                        return Float.valueOf(new DataInputStream(new ByteArrayInputStream(c9002.f29317, i2, 4)).readFloat());
                    } catch (IOException e) {
                        throw new AssertionError(e);
                    }
                case 5:
                    c9002.getClass();
                    try {
                        return Long.valueOf(new DataInputStream(new ByteArrayInputStream(c9002.f29317, i2, 8)).readLong());
                    } catch (IOException e2) {
                        throw new AssertionError(e2);
                    }
                case 6:
                    c9002.getClass();
                    try {
                        return Double.valueOf(new DataInputStream(new ByteArrayInputStream(c9002.f29317, i2, 8)).readDouble());
                    } catch (IOException e3) {
                        throw new AssertionError(e3);
                    }
                case 7:
                    AbstractC19728 abstractC19728M50345 = c22273.m50345(c9002.m24023(i2));
                    return c14764.m35517(c11172.f35175, c15252.m36600(C20693.m47329(abstractC19728M50345.mo42398(), abstractC19728M50345.mo42395(), abstractC19728M50345.mo42394())));
                case 8:
                    return c22273.m50345(c9002.m24023(i2)).toString();
                default:
                    throw c11172.m28121("unexpected.const.pool.tag.at", Integer.toString(i), Integer.toString(i2 - 1));
            }
        }
        AbstractC19728 abstractC19728M50346 = c22273.m50345(c9002.m24023(i2));
        return c14764.m35529(c11172.f35175, c15252.m36600(C20693.m47329(abstractC19728M50346.mo42398(), abstractC19728M50346.mo42395(), abstractC19728M50346.mo42394())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50335(C9002 c9002, int i) {
        int iM24023 = c9002.m24023(i);
        int iM24024 = i + 2;
        int[] iArr = new int[iM24023];
        int i2 = 1;
        while (i2 < iM24023) {
            int i3 = iM24024 + 1;
            byte b = c9002.f29317[iM24024];
            iArr[i2] = i3;
            switch (b) {
                case 1:
                    iM24024 = c9002.m24023(i3) + 2 + i3;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw this.f72134.m28121("bad.const.pool.tag.at", Byte.toString(b), Integer.toString(iM24024));
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                case 17:
                case 18:
                    iM24024 += 5;
                    break;
                case 5:
                case 6:
                    iM24024 += 9;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    iM24024 += 3;
                    break;
                case 15:
                    iM24024 += 4;
                    break;
            }
            i2 += (b == 5 || b == 6) ? 2 : 1;
        }
        this.f72131 = new C5119(this, c9002, iArr);
        return iM24024;
    }
}
