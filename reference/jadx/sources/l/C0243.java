package l;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: renamed from: l.֡ۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: F7KC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0243 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final BitSet f1443;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final BitSet f1444;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final BitSet f1445;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final BitSet f1446;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final BitSet f1447;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final BitSet f1448;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0429 f1449;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20809 f1450;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3836 f1451;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20000 f1452;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23942 f1453;

    public C0243(C0429 c0429, C20809 c20809, C23942 c23942, C3836 c3836) {
        this.f1449 = c0429;
        this.f1450 = c20809;
        this.f1453 = c23942;
        this.f1451 = c3836;
    }

    static {
        BitSet bitSet = new BitSet();
        f1447 = bitSet;
        BitSet bitSet2 = new BitSet();
        f1443 = bitSet2;
        BitSet bitSet3 = new BitSet();
        f1446 = bitSet3;
        BitSet bitSet4 = new BitSet();
        f1445 = bitSet4;
        BitSet bitSet5 = new BitSet();
        f1448 = bitSet5;
        BitSet bitSet6 = new BitSet();
        f1444 = bitSet6;
        bitSet.set(7);
        bitSet2.set(3, 9);
        bitSet3.set(19);
        bitSet4.set(20);
        bitSet5.set(1);
        bitSet6.set(12);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22492 m1627(int i) {
        return (C22492) this.f1452.m45289(f1447, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m1626(int i, InterfaceC17591 interfaceC17591) {
        return m1629(this.f1450.m46792(this.f1452.m45288(i)), interfaceC17591);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m1632(int i, InterfaceC17591 interfaceC17591) {
        return m1629(this.f1450.m46792(this.f1452.m45288(i)), interfaceC17591);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19670 m1630(int i) {
        return (C19670) this.f1452.m45289(f1446, i);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7675 m1633(int i) {
        return (C7675) this.f1452.m45289(f1445, i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 m1624(int i) {
        return (AbstractC11242) this.f1452.m45289(f1448, i);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m1623(int i) {
        AbstractC11242 abstractC11242M1624 = m1624(i);
        C0429 c0429 = this.f1449;
        C13638.requireNonNull(c0429);
        byte[] bArrMo28214 = abstractC11242M1624.mo28214();
        int iMo28207 = abstractC11242M1624.mo28207();
        int iMo28217 = abstractC11242M1624.mo28217();
        c0429.f1973 = bArrMo28214;
        c0429.f1962 = iMo28207;
        c0429.f1978 = iMo28207 + iMo28217;
        return c0429.m2228();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20705 m1628(int i) {
        return (C20705) this.f1452.m45289(f1444, i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m1631(int i) {
        return this.f1452.m45289(f1443, i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m1629(int i, InterfaceC17591 interfaceC17591) {
        int iM45290 = this.f1452.m45290(i);
        int iM45288 = this.f1452.m45288(i);
        if (iM45290 == 1) {
            return interfaceC17591.mo1012(iM45288 + 2, this.f1452.f64019.m46792(iM45288), this.f1452.f64019.f67645);
        }
        throw this.f1449.m2233("unexpected.const.pool.tag.at", Integer.toString(iM45290), Integer.toString(iM45288 - 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m1621(C0243 c0243, C20809 c20809, int i, int i2) {
        C23942 c23942 = c0243.f1453;
        C3836 c3836 = c0243.f1451;
        C0429 c0429 = c0243.f1449;
        if (i == 1) {
            return c23942.f77631.mo17388(i2 + 2, c20809.m46792(i2), c20809.f67645);
        }
        if (i == 12) {
            return new C20705(c0243.m1624(c20809.m46792(i2)), c0243.m1623(c20809.m46792(i2 + 2)));
        }
        if (i == 19) {
            return c3836.m11146(c0243.m1624(c20809.m46792(i2)));
        }
        if (i != 20) {
            switch (i) {
                case 3:
                    return Integer.valueOf(c20809.m46796(i2));
                case 4:
                    c20809.getClass();
                    try {
                        return Float.valueOf(new DataInputStream(new ByteArrayInputStream(c20809.f67645, i2, 4)).readFloat());
                    } catch (IOException e) {
                        throw new AssertionError(e);
                    }
                case 5:
                    c20809.getClass();
                    try {
                        return Long.valueOf(new DataInputStream(new ByteArrayInputStream(c20809.f67645, i2, 8)).readLong());
                    } catch (IOException e2) {
                        throw new AssertionError(e2);
                    }
                case 6:
                    c20809.getClass();
                    try {
                        return Double.valueOf(new DataInputStream(new ByteArrayInputStream(c20809.f67645, i2, 8)).readDouble());
                    } catch (IOException e3) {
                        throw new AssertionError(e3);
                    }
                case 7:
                    AbstractC11242 abstractC11242M1624 = c0243.m1624(c20809.m46792(i2));
                    return c3836.m11148(c0429.f1957, c23942.m52777(C2194.m6808(abstractC11242M1624.mo28207(), abstractC11242M1624.mo28217(), abstractC11242M1624.mo28214())));
                case 8:
                    return c0243.m1624(c20809.m46792(i2)).toString();
                default:
                    throw c0429.m2233("unexpected.const.pool.tag.at", Integer.toString(i), Integer.toString(i2 - 1));
            }
        }
        AbstractC11242 abstractC11242M1625 = c0243.m1624(c20809.m46792(i2));
        return c3836.m11157(c0429.f1957, c23942.m52777(C2194.m6808(abstractC11242M1625.mo28207(), abstractC11242M1625.mo28217(), abstractC11242M1625.mo28214())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m1625(C20809 c20809, int i) {
        int iM46792 = c20809.m46792(i);
        int iM46793 = i + 2;
        int[] iArr = new int[iM46792];
        int i2 = 1;
        while (i2 < iM46792) {
            int i3 = iM46793 + 1;
            byte b = c20809.f67645[iM46793];
            iArr[i2] = i3;
            switch (b) {
                case 1:
                    iM46793 = c20809.m46792(i3) + 2 + i3;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw this.f1449.m2233("bad.const.pool.tag.at", Byte.toString(b), Integer.toString(iM46793));
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                case 17:
                case 18:
                    iM46793 += 5;
                    break;
                case 5:
                case 6:
                    iM46793 += 9;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    iM46793 += 3;
                    break;
                case 15:
                    iM46793 += 4;
                    break;
            }
            i2 += (b == 5 || b == 6) ? 2 : 1;
        }
        this.f1452 = new C20000(this, c20809, iArr);
        return iM46793;
    }
}
