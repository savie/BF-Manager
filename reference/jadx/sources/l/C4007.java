package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۘܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4007 implements InterfaceC7945 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11770 f14852;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f14853;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f14854 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile BitSet f14855;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17684 f14856;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11503(long j) {
        return j >= 0 && j <= 2147483647L;
    }

    public C4007(C17684 c17684, C11770 c11770, int i) {
        this.f14856 = c17684;
        this.f14852 = c11770;
        this.f14853 = i;
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo11507() {
        int i = this.f14854;
        if (i != -1) {
            return i;
        }
        int iM42183 = this.f14856.m41166().m42183(this.f14853);
        this.f14854 = iM42183;
        return iM42183;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11509() {
        return this.f14856.m41166().mo9809(this.f14853 + 12);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m11505() {
        int i = this.f14853 + 16;
        int iM11509 = m11509();
        BitSet bitSet = new BitSet();
        if (iM11509 > 0) {
            int i2 = (iM11509 * 2) + i;
            C18825 c18825M42184 = this.f14856.m41166().m42184(i);
            try {
                C7474 c7474Mo34147 = this.f14856.mo34147();
                ArrayList arrayList = new ArrayList(mo11511());
                C15070 c15070 = new C15070();
                BitSet bitSet2 = new BitSet();
                c15070.add(0);
                while (!c15070.isEmpty()) {
                    m11501(c7474Mo34147, c18825M42184, i, i2, c15070, bitSet, bitSet2);
                    if (arrayList.isEmpty()) {
                        break;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C15298 c15298 = (C15298) it.next();
                        int iMo18941 = c15298.mo18941();
                        if (m11503(iMo18941) && bitSet2.get(iMo18941)) {
                            it.remove();
                            Iterator it2 = c15298.mo18943().iterator();
                            while (it2.hasNext()) {
                                m11502(c15070, bitSet2, ((AbstractC6395) it2.next()).mo6346());
                            }
                        }
                    }
                }
                c18825M42184.m43450();
            } catch (Throwable th) {
                c18825M42184.m43450();
                throw th;
            }
        }
        this.f14855 = bitSet;
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Iterable mo11508() {
        int iM11509 = m11509();
        int i = this.f14853 + 16;
        return new C5419(this, i, (iM11509 * 2) + i, this.f14856.m41184() ? m11500() : null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11501(C7474 c7474, C18825 c18825, int i, int i2, C15070 c15070, BitSet bitSet, BitSet bitSet2) {
        int iM43443;
        int iM43430;
        int iM43431;
        int iM43447;
        while (!c15070.isEmpty()) {
            int iM27092 = c15070.m27092();
            if (m11503(iM27092)) {
                int i3 = (iM27092 * 2) + i;
                if (!bitSet2.get(iM27092)) {
                    c18825.m43435(i3);
                    while (true) {
                        if (c18825.m43447() < i2) {
                            int iM43439 = c18825.m43439();
                            if (iM43439 == 0) {
                                iM43439 = c18825.m43454();
                            }
                            EnumC10297 enumC10297M19966 = c7474.m19966(iM43439);
                            if (enumC10297M19966 != null) {
                                int i4 = 0;
                                switch (C13181.f43877[enumC10297M19966.f35328.ordinal()]) {
                                    case 1:
                                        iM43443 = c18825.m43443();
                                        break;
                                    case 2:
                                    case 3:
                                    case 4:
                                        iM43443 = c18825.m43432();
                                        break;
                                    case 5:
                                    case 6:
                                        iM43443 = c18825.m43448(2);
                                        break;
                                    default:
                                        iM43443 = 0;
                                        break;
                                }
                                if (iM43443 != 0) {
                                    m11502(c15070, bitSet2, ((long) ((c18825.m43447() - i) / 2)) + ((long) iM43443));
                                }
                                int i5 = C13181.f43878[enumC10297M19966.ordinal()];
                                if (i5 != 1) {
                                    if (i5 == 2) {
                                        int iM43448 = c18825.m43447();
                                        long jM43447 = (c18825.m43447() - i) / 2;
                                        long j = ((long) iM43443) + jM43447;
                                        if (m11503(j)) {
                                            c18825.m43435((((int) j) * 2) + i);
                                            int iM434310 = c18825.m43439();
                                            if (iM434310 == 0) {
                                                iM434310 = c18825.m43454();
                                            }
                                            if (c7474.m19966(iM434310) == EnumC10297.f35054) {
                                                int iM43432 = c18825.m43430();
                                                while (i4 < iM43432) {
                                                    m11502(c15070, bitSet2, ((long) c18825.m43448((i4 * 4) + 8)) + jM43447);
                                                    i4++;
                                                }
                                            }
                                            c18825.m43435(iM43448);
                                        }
                                        iM43431 = enumC10297M19966.f35328.f57758 / 2;
                                    } else if (i5 == 3) {
                                        int iM43449 = c18825.m43447();
                                        long jM43448 = (c18825.m43447() - i) / 2;
                                        long j2 = ((long) iM43443) + jM43448;
                                        if (m11503(j2)) {
                                            c18825.m43435((((int) j2) * 2) + i);
                                            int iM434311 = c18825.m43439();
                                            if (iM434311 == 0) {
                                                iM434311 = c18825.m43454();
                                            }
                                            if (c7474.m19966(iM434311) == EnumC10297.f35081) {
                                                int iM43433 = c18825.m43430();
                                                int i6 = (iM43433 * 4) + 4;
                                                while (i4 < iM43433) {
                                                    m11502(c15070, bitSet2, ((long) c18825.m43448((i4 * 4) + i6)) + jM43448);
                                                    i4++;
                                                }
                                            }
                                            c18825.m43435(iM43449);
                                        }
                                        iM43431 = enumC10297M19966.f35328.f57758 / 2;
                                    } else if (i5 != 4) {
                                        iM43431 = i5 != 5 ? enumC10297M19966.f35328.f57758 / 2 : (c18825.m43430() * 4) + 2;
                                    } else {
                                        iM43430 = c18825.m43430() * 2;
                                    }
                                    iM43447 = (c18825.m43447() - i) / 2;
                                    int i7 = iM43447 + iM43431;
                                    if (!m11503(iM43447) && i7 >= iM43447) {
                                        bitSet.set(iM43447);
                                        bitSet2.set(iM43447, i7);
                                        if (!enumC10297M19966.m26111()) {
                                            break;
                                        } else {
                                            c18825.m43437(iM43431 * 2);
                                        }
                                    }
                                } else {
                                    int iM43434 = c18825.m43430();
                                    int iM434410 = c18825.m43448(4);
                                    if (iM434410 >= 0 && ((iM43434 == 1 || iM43434 == 2 || iM43434 == 4 || iM43434 == 8) && ((long) iM43434) * ((long) iM434410) <= 2147483647L)) {
                                        iM43430 = ((iM43434 * iM434410) + 1) / 2;
                                    }
                                }
                                iM43431 = iM43430 + 4;
                                iM43447 = (c18825.m43447() - i) / 2;
                                int i8 = iM43447 + iM43431;
                                if (!m11503(iM43447)) {
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
    public static void m11502(C15070 c15070, BitSet bitSet, long j) {
        if (m11503(j)) {
            int i = (int) j;
            if (bitSet.get(i)) {
                return;
            }
            c15070.add(i);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private BitSet m11500() {
        BitSet bitSet;
        BitSet bitSet2 = this.f14855;
        if (bitSet2 != null) {
            return bitSet2;
        }
        synchronized (this) {
            bitSet = this.f14855;
            if (bitSet == null) {
                m11505();
                bitSet = this.f14855;
            }
        }
        return bitSet;
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List mo11511() {
        AbstractC18119 abstractC18119M41166 = this.f14856.m41166();
        int i = this.f14853;
        int iM42183 = abstractC18119M41166.m42183(i + 6);
        if (iM42183 > 0) {
            int iM5620 = C1694.m5620(m11509(), 2, i + 16, 3) & (-4);
            return new C1185(this, iM5620, (iM42183 * 8) + iM5620, iM42183);
        }
        return AbstractC22433.of();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private AbstractC3676 m11506() {
        C17684 c17684 = this.f14856;
        int iMo5859 = c17684.m41166().mo5859(this.f14853 + 8);
        if (iMo5859 == -1 || iMo5859 == 0) {
            return AbstractC3676.m10847(c17684, 0, this);
        }
        C11770 c11770 = this.f14852;
        if (iMo5859 < 0) {
            System.err.printf("%s: Invalid debug offset%n", c11770);
            return AbstractC3676.m10847(c17684, 0, this);
        }
        if (iMo5859 >= c17684.m41166().length()) {
            System.err.printf("%s: Invalid debug offset%n", c11770);
            return AbstractC3676.m10847(c17684, 0, this);
        }
        return AbstractC3676.m10847(c17684, iMo5859, this);
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Iterable mo11510() {
        final BitSet bitSetM11500 = m11500();
        return C22808.m50474(m11506(), new InterfaceC19010() { // from class: l.ۖܳ᩵
            @Override // l.InterfaceC19010
            public final boolean apply(Object obj) {
                return C4007.m11504(bitSetM11500, (InterfaceC7239) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m11504(BitSet bitSet, InterfaceC7239 interfaceC7239) {
        if (interfaceC7239.mo1599() != 10) {
            return true;
        }
        int iMo17670 = interfaceC7239.mo17670();
        if (m11503(iMo17670) && bitSet.get(iMo17670)) {
            return true;
        }
        if (!(interfaceC7239 instanceof C8617)) {
            return false;
        }
        ((C8617) interfaceC7239).m22393();
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Iterator m11512() {
        return m11506().mo3467();
    }
}
