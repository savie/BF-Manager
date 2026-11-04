package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7820 implements InterfaceC7140 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f26038;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile BitSet f26039;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f26040 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24975 f26041;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4091 f26042;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21292(long j) {
        return j >= 0 && j <= 2147483647L;
    }

    public C7820(C24975 c24975, C4091 c4091, int i) {
        this.f26041 = c24975;
        this.f26042 = c4091;
        this.f26038 = i;
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ۚ */
    public final int mo2841() {
        int i = this.f26040;
        if (i != -1) {
            return i;
        }
        int iM8721 = this.f26041.m55818().m8721(this.f26038);
        this.f26040 = iM8721;
        return iM8721;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m21298() {
        return this.f26041.m55818().mo8719(this.f26038 + 12);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m21294() {
        int i = this.f26038 + 16;
        int iM21298 = m21298();
        BitSet bitSet = new BitSet();
        if (iM21298 > 0) {
            int i2 = (iM21298 * 2) + i;
            C8565 c8565M8724 = this.f26041.m55818().m8724(i);
            try {
                C19647 c19647Mo4326 = this.f26041.mo4326();
                ArrayList arrayList = new ArrayList(mo2839());
                C14763 c14763 = new C14763();
                BitSet bitSet2 = new BitSet();
                c14763.add(0);
                while (!c14763.isEmpty()) {
                    m21291(c19647Mo4326, c8565M8724, i, i2, c14763, bitSet, bitSet2);
                    if (arrayList.isEmpty()) {
                        break;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C1108 c1108 = (C1108) it.next();
                        int iMo4114 = c1108.mo4114();
                        if (m21292(iMo4114) && bitSet2.get(iMo4114)) {
                            it.remove();
                            Iterator it2 = c1108.mo4116().iterator();
                            while (it2.hasNext()) {
                                m21290(c14763, bitSet2, ((AbstractC16769) it2.next()).mo11197());
                            }
                        }
                    }
                }
                c8565M8724.m22995();
            } catch (Throwable th) {
                c8565M8724.m22995();
                throw th;
            }
        }
        this.f26039 = bitSet;
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo2840() {
        int iM21298 = m21298();
        int i = this.f26038 + 16;
        return new C14531(this, i, (iM21298 * 2) + i, this.f26041.m55783() ? m21295() : null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21291(C19647 c19647, C8565 c8565, int i, int i2, C14763 c14763, BitSet bitSet, BitSet bitSet2) {
        int iM22988;
        int iM22991;
        int iM22992;
        int iM23001;
        while (!c14763.isEmpty()) {
            int iM37463 = c14763.m37463();
            if (m21292(iM37463)) {
                int i3 = (iM37463 * 2) + i;
                if (!bitSet2.get(iM37463)) {
                    c8565.m22981(i3);
                    while (true) {
                        if (c8565.m23001() < i2) {
                            int iM22998 = c8565.m22998();
                            if (iM22998 == 0) {
                                iM22998 = c8565.m22993();
                            }
                            EnumC22631 enumC22631M45296 = c19647.m45296(iM22998);
                            if (enumC22631M45296 != null) {
                                int i4 = 0;
                                switch (C0362.f1872[enumC22631M45296.f73508.ordinal()]) {
                                    case 1:
                                        iM22988 = c8565.m22988();
                                        break;
                                    case 2:
                                    case 3:
                                    case 4:
                                        iM22988 = c8565.m23003();
                                        break;
                                    case 5:
                                    case 6:
                                        iM22988 = c8565.m23002(2);
                                        break;
                                    default:
                                        iM22988 = 0;
                                        break;
                                }
                                if (iM22988 != 0) {
                                    m21290(c14763, bitSet2, ((long) ((c8565.m23001() - i) / 2)) + ((long) iM22988));
                                }
                                int i5 = C0362.f1873[enumC22631M45296.ordinal()];
                                if (i5 != 1) {
                                    if (i5 == 2) {
                                        int iM23002 = c8565.m23001();
                                        long jM23001 = (c8565.m23001() - i) / 2;
                                        long j = ((long) iM22988) + jM23001;
                                        if (m21292(j)) {
                                            c8565.m22981((((int) j) * 2) + i);
                                            int iM22999 = c8565.m22998();
                                            if (iM22999 == 0) {
                                                iM22999 = c8565.m22993();
                                            }
                                            if (c19647.m45296(iM22999) == EnumC22631.f73432) {
                                                int iM22993 = c8565.m22991();
                                                while (i4 < iM22993) {
                                                    m21290(c14763, bitSet2, ((long) c8565.m23002((i4 * 4) + 8)) + jM23001);
                                                    i4++;
                                                }
                                            }
                                            c8565.m22981(iM23002);
                                        }
                                        iM22992 = enumC22631M45296.f73508.f23142 / 2;
                                    } else if (i5 == 3) {
                                        int iM23003 = c8565.m23001();
                                        long jM23002 = (c8565.m23001() - i) / 2;
                                        long j2 = ((long) iM22988) + jM23002;
                                        if (m21292(j2)) {
                                            c8565.m22981((((int) j2) * 2) + i);
                                            int iM229910 = c8565.m22998();
                                            if (iM229910 == 0) {
                                                iM229910 = c8565.m22993();
                                            }
                                            if (c19647.m45296(iM229910) == EnumC22631.f73383) {
                                                int iM22994 = c8565.m22991();
                                                int i6 = (iM22994 * 4) + 4;
                                                while (i4 < iM22994) {
                                                    m21290(c14763, bitSet2, ((long) c8565.m23002((i4 * 4) + i6)) + jM23002);
                                                    i4++;
                                                }
                                            }
                                            c8565.m22981(iM23003);
                                        }
                                        iM22992 = enumC22631M45296.f73508.f23142 / 2;
                                    } else if (i5 != 4) {
                                        iM22992 = i5 != 5 ? enumC22631M45296.f73508.f23142 / 2 : (c8565.m22991() * 4) + 2;
                                    } else {
                                        iM22991 = c8565.m22991() * 2;
                                    }
                                    iM23001 = (c8565.m23001() - i) / 2;
                                    int i7 = iM23001 + iM22992;
                                    if (!m21292(iM23001) && i7 >= iM23001) {
                                        bitSet.set(iM23001);
                                        bitSet2.set(iM23001, i7);
                                        if (!enumC22631M45296.m51000()) {
                                            break;
                                        } else {
                                            c8565.m22984(iM22992 * 2);
                                        }
                                    }
                                } else {
                                    int iM22995 = c8565.m22991();
                                    int iM23004 = c8565.m23002(4);
                                    if (iM23004 >= 0 && ((iM22995 == 1 || iM22995 == 2 || iM22995 == 4 || iM22995 == 8) && ((long) iM22995) * ((long) iM23004) <= 2147483647L)) {
                                        iM22991 = ((iM22995 * iM23004) + 1) / 2;
                                    }
                                }
                                iM22992 = iM22991 + 4;
                                iM23001 = (c8565.m23001() - i) / 2;
                                int i8 = iM23001 + iM22992;
                                if (!m21292(iM23001)) {
                                }
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21290(C14763 c14763, BitSet bitSet, long j) {
        if (m21292(j)) {
            int i = (int) j;
            if (bitSet.get(i)) {
                return;
            }
            c14763.add(i);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private BitSet m21295() {
        BitSet bitSet;
        BitSet bitSet2 = this.f26039;
        if (bitSet2 != null) {
            return bitSet2;
        }
        synchronized (this) {
            bitSet = this.f26039;
            if (bitSet == null) {
                m21294();
                bitSet = this.f26039;
            }
        }
        return bitSet;
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ֫ */
    public final List mo2839() {
        AbstractC2599 abstractC2599M55818 = this.f26041.m55818();
        int i = this.f26038;
        int iM8721 = abstractC2599M55818.m8721(i + 6);
        if (iM8721 > 0) {
            int iM31436 = C12669.m31436(m21298(), 2, i + 16, 3) & (-4);
            return new C18261(this, iM31436, (iM8721 * 8) + iM31436, iM8721);
        }
        return AbstractC1928.of();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private AbstractC7951 m21296() {
        C24975 c24975 = this.f26041;
        int iMo8725 = c24975.m55818().mo8725(this.f26038 + 8);
        if (iMo8725 == -1 || iMo8725 == 0) {
            return AbstractC7951.m21645(c24975, 0, this);
        }
        C4091 c4091 = this.f26042;
        if (iMo8725 < 0) {
            System.err.printf("%s: Invalid debug offset%n", c4091);
            return AbstractC7951.m21645(c24975, 0, this);
        }
        if (iMo8725 >= c24975.m55818().length()) {
            System.err.printf("%s: Invalid debug offset%n", c4091);
            return AbstractC7951.m21645(c24975, 0, this);
        }
        return AbstractC7951.m21645(c24975, iMo8725, this);
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ۧ */
    public final Iterable mo2842() {
        return C16625.m39338(m21296(), new C18642(1, m21295()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m21293(BitSet bitSet, InterfaceC10650 interfaceC10650) {
        if (interfaceC10650.mo4171() != 10) {
            return true;
        }
        int iMo15046 = interfaceC10650.mo15046();
        if (m21292(iMo15046) && bitSet.get(iMo15046)) {
            return true;
        }
        if (!(interfaceC10650 instanceof C4903)) {
            return false;
        }
        ((C4903) interfaceC10650).m15045();
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Iterator m21297() {
        return m21296().mo2386();
    }
}
