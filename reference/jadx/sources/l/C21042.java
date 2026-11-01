package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩷ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21042 extends AbstractC12576 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f68546;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TreeMap f68547;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final BitSet f68548;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7742 f68549;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final BitSet f68550;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f68551;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f68552;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f68553;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final BitSet f68554;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47453(int i) {
        return (i & 1) == 0;
    }

    public C21042(C4108 c4108, C20337 c20337) {
        super(c4108, c20337);
        this.f68550 = new BitSet(c4108.m11685());
        this.f68549 = new C7742(c20337, c4108.m11685());
        int iM11665 = c4108.m11665();
        this.f68546 = iM11665;
        int i = iM11665 * 2;
        BitSet bitSet = new BitSet(i);
        this.f68548 = bitSet;
        bitSet.set(0, iM11665);
        this.f68554 = new BitSet(i);
        this.f68547 = new TreeMap();
        this.f68553 = new ArrayList();
        this.f68551 = new ArrayList();
        this.f68552 = new ArrayList();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m47457(int i) {
        C12723 c12723Mo17426;
        AbstractC22454 abstractC22454M11684 = this.f42044.m11684(i);
        if (abstractC22454M11684 == null || (c12723Mo17426 = abstractC22454M11684.mo17426()) == null || c12723Mo17426.m31572() != 3) {
            return -1;
        }
        return ((C21665) ((AbstractC22601) abstractC22454M11684.mo17428()).m50100()).mo21658();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m47454(int i, int i2, ArrayList arrayList, boolean z) {
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C16251 c16251 = (C16251) it.next();
            if (!this.f68550.get(c16251.m38400())) {
                boolean zM47455 = m47455(c16251, i, i2);
                z2 = !zM47455 || z2;
                if (zM47455 && z) {
                    this.f68548.set(i, c16251.m38396() + i, true);
                }
            }
        }
        return !z2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m47455(C16251 c16251, int i, int i2) {
        if (c16251.m38396() > i2 || this.f68550.get(c16251.m38400()) || !m47459(i, c16251)) {
            return false;
        }
        m47452(i, c16251);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m47448(int i, int i2) {
        EnumC10460 enumC10460 = EnumC10460.f35702;
        if (i2 == 2) {
            if ((this.f68546 & 1) == 0) {
                enumC10460 = EnumC10460.f35703;
            } else {
                enumC10460 = EnumC10460.f35700;
            }
        }
        return m47449(i, i2, enumC10460);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m47449(int i, int i2, EnumC10460 enumC10460) {
        BitSet bitSet = this.f68548;
        int iMo21792 = enumC10460.mo21792(bitSet, i);
        while (true) {
            int i3 = 1;
            while (i3 < i2 && !bitSet.get(iMo21792 + i3)) {
                i3++;
            }
            if (i3 == i2) {
                return iMo21792;
            }
            iMo21792 = enumC10460.mo21792(bitSet, iMo21792 + i3);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m47459(int i, C16251 c16251) {
        int iM38396 = c16251.m38396();
        int i2 = this.f68546;
        if (i < i2 && iM38396 + i > i2) {
            return false;
        }
        C7742 c7742 = this.f68549;
        c7742.getClass();
        return !c7742.m20394(c16251.m38400(), i, c16251.m38396());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7742 m47460() {
        BitSet bitSet;
        C7742 c7742;
        int i;
        Iterator it;
        BitSet bitSet2;
        C19073 c19073;
        EnumC10460 enumC10460;
        int iM29785;
        int i2;
        int i3;
        int iM38396;
        C18926 c18926 = new C18926(this);
        C4108 c4108 = this.f42044;
        c4108.m11672(c18926);
        TreeMap treeMap = this.f68547;
        for (ArrayList arrayList : treeMap.values()) {
            int size = arrayList.size();
            int i4 = -1;
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    iM38396 = 0;
                    break;
                }
                C16251 c16251 = (C16251) arrayList.get(i5);
                int iM47457 = m47457(c16251.m38400());
                if (iM47457 >= 0) {
                    iM38396 = c16251.m38396();
                    m47452(iM47457, c16251);
                    i4 = iM47457;
                    break;
                }
                i5++;
                i4 = iM47457;
            }
            if (i4 >= 0) {
                m47454(i4, iM38396, arrayList, true);
            }
        }
        int iM11685 = c4108.m11685();
        int i6 = 0;
        while (true) {
            bitSet = this.f68550;
            if (i6 >= iM11685) {
                break;
            }
            if (!bitSet.get(i6)) {
                int iM47458 = m47457(i6);
                AbstractC22454 abstractC22454M11684 = c4108.m11684(i6);
                C16251 c16251M49955 = abstractC22454M11684 == null ? null : abstractC22454M11684.m49955();
                if (iM47458 >= 0) {
                    m47452(iM47458, c16251M49955);
                }
            }
            i6++;
        }
        Iterator it2 = this.f68551.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            c7742 = this.f68549;
            i = this.f68546;
            if (!zHasNext) {
                break;
            }
            C6330 c6330 = (C6330) it2.next();
            C0727 c0727Mo17429 = c6330.mo17429();
            int size2 = c0727Mo17429.size();
            int[] iArr = new int[size2];
            int i7 = 0;
            for (int i8 = 0; i8 < size2; i8++) {
                int iM38397 = c0727Mo17429.m15275get(i8).m38396();
                iArr[i8] = iM38397;
                i7 += iM38397;
            }
            int i9 = Integer.MIN_VALUE;
            int i10 = 0;
            int i11 = 0;
            int iM47449 = -1;
            BitSet bitSet3 = null;
            while (true) {
                if (i10 >= size2) {
                    it = it2;
                    break;
                }
                it = it2;
                int iM38400 = c0727Mo17429.m15275get(i10).m38400();
                if (i10 != 0) {
                    i11 -= iArr[i10 - 1];
                }
                if (bitSet.get(iM38400) && (iM29785 = c7742.m29785(iM38400) + i11) >= 0) {
                    i2 = i11;
                    if (iM29785 >= i || iM29785 + i7 <= i) {
                        BitSet bitSet4 = new BitSet(size2);
                        i3 = iM47449;
                        int iM47450 = m47450(iM29785, c6330, iArr, bitSet4);
                        if (iM47450 >= 0) {
                            int iCardinality = iM47450 - bitSet4.cardinality();
                            if (iCardinality > i9) {
                                i9 = iCardinality;
                                bitSet3 = bitSet4;
                                i3 = iM29785;
                            }
                            if (iM47450 == i7) {
                                iM47449 = i3;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    iM47449 = i3;
                    i10++;
                    i11 = i2;
                    it2 = it;
                } else {
                    i2 = i11;
                }
                i3 = iM47449;
                iM47449 = i3;
                i10++;
                i11 = i2;
                it2 = it;
            }
            if (iM47449 == -1) {
                bitSet2 = new BitSet(size2);
                EnumC10460 enumC10461 = EnumC10460.f35702;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i12 < size2) {
                    EnumC10460 enumC10462 = enumC10461;
                    int i16 = size2;
                    if (iArr[i12] == 2) {
                        if ((i15 & 1) == 0) {
                            i14++;
                        } else {
                            i13++;
                        }
                        i15 += 2;
                    } else {
                        i15++;
                    }
                    i12++;
                    enumC10461 = enumC10462;
                    size2 = i16;
                }
                EnumC10460 enumC10463 = enumC10461;
                if (i13 > i14) {
                    enumC10460 = (i & 1) == 0 ? EnumC10460.f35700 : EnumC10460.f35703;
                } else if (i14 > 0) {
                    enumC10460 = (i & 1) == 0 ? EnumC10460.f35703 : EnumC10460.f35700;
                } else {
                    enumC10460 = enumC10463;
                }
                while (true) {
                    iM47449 = m47449(i, i7, enumC10460);
                    if (m47450(iM47449, c6330, iArr, bitSet2) >= 0) {
                        break;
                    }
                    i = iM47449 + 1;
                    bitSet2.clear();
                }
            } else {
                bitSet2 = bitSet3;
            }
            for (int iNextSetBit = bitSet2.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet2.nextSetBit(iNextSetBit + 1)) {
                c6330.m17418(iNextSetBit, m31291(c6330, c0727Mo17429.m15275get(iNextSetBit)));
            }
            C0727 c0727Mo174210 = c6330.mo17429();
            int size3 = c0727Mo174210.size();
            int i17 = 0;
            while (i17 < size3) {
                C16251 c16251M15275get = c0727Mo174210.m15275get(i17);
                int iM38401 = c16251M15275get.m38400();
                int iM38398 = c16251M15275get.m38396();
                int i18 = iM47449 + iM38398;
                if (!bitSet.get(iM38401)) {
                    Iterator it3 = treeMap.entrySet().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            c19073 = null;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Iterator it4 = ((ArrayList) entry.getValue()).iterator();
                        while (it4.hasNext()) {
                            if (((C16251) it4.next()).m38400() == iM38401) {
                                c19073 = (C19073) entry.getKey();
                                break;
                            }
                        }
                    }
                    m47452(iM47449, c16251M15275get);
                    if (c19073 != null) {
                        this.f68548.set(iM47449, i18, true);
                        ArrayList arrayList2 = (ArrayList) treeMap.get(c19073);
                        int size4 = arrayList2.size();
                        for (int i19 = 0; i19 < size4; i19++) {
                            C16251 c16252 = (C16251) arrayList2.get(i19);
                            if (-1 == c0727Mo174210.m3152(c16252.m38400())) {
                                m47455(c16252, iM47449, iM38398);
                            }
                        }
                    }
                }
                i17++;
                iM47449 = i18;
            }
            it2 = it;
        }
        for (ArrayList arrayList3 : treeMap.values()) {
            boolean zM47454 = false;
            int i20 = i;
            do {
                int size5 = arrayList3.size();
                int i21 = 1;
                for (int i22 = 0; i22 < size5; i22++) {
                    C16251 c16253 = (C16251) arrayList3.get(i22);
                    int iM38399 = c16253.m38396();
                    if (!bitSet.get(c16253.m38400()) && iM38399 > i21) {
                        i21 = iM38399;
                    }
                }
                EnumC10460 enumC10464 = EnumC10460.f35702;
                if (i21 == 2) {
                    enumC10464 = (i & 1) == 0 ? EnumC10460.f35703 : EnumC10460.f35700;
                }
                BitSet bitSet5 = this.f68554;
                int iMo21792 = enumC10464.mo21792(bitSet5, i20);
                while (true) {
                    int i23 = 1;
                    while (i23 < i21 && !bitSet5.get(iMo21792 + i23)) {
                        i23++;
                    }
                    if (i23 == i21) {
                        break;
                    }
                    iMo21792 = enumC10464.mo21792(bitSet5, iMo21792 + i23);
                }
                Iterator it5 = arrayList3.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        zM47454 = m47454(iMo21792, i21, arrayList3, true);
                        break;
                    }
                    C16251 c16254 = (C16251) it5.next();
                    if (!bitSet.get(c16254.m38400()) && !m47459(iMo21792, c16254)) {
                        break;
                    }
                }
                i20 = iMo21792 + 1;
            } while (!zM47454);
        }
        for (C6330 c6331 : this.f68553) {
            C16251 c16251M49956 = c6331.m49955();
            int iM38402 = c16251M49956.m38400();
            BitSet bitSetM29596 = c6331.m49949().m29596();
            if (bitSetM29596.cardinality() == 1) {
                AbstractC22454 abstractC22454 = (AbstractC22454) C19084.m43861(((C11871) c4108.m11687().get(bitSetM29596.nextSetBit(0))).m29613(), 1);
                if (abstractC22454.mo17426().m31572() == 43) {
                    C16251 c16251M15275get2 = abstractC22454.mo17429().m15275get(0);
                    int iM38403 = c16251M15275get2.m38400();
                    int iM383910 = c16251M15275get2.m38396();
                    boolean zM47455 = bitSet.get(iM38402);
                    boolean zM47456 = bitSet.get(iM38403);
                    if ((!zM47456) & zM47455) {
                        zM47456 = m47455(c16251M15275get2, c7742.m29785(iM38402), iM383910);
                    }
                    if ((!zM47455) & zM47456) {
                        zM47455 = m47455(c16251M49956, c7742.m29785(iM38403), iM383910);
                    }
                    if (!zM47455 || !zM47456) {
                        int iM47448 = m47448(i, iM383910);
                        ArrayList arrayList4 = new ArrayList(2);
                        arrayList4.add(c16251M49956);
                        arrayList4.add(c16251M15275get2);
                        while (!m47454(iM47448, iM383910, arrayList4, false)) {
                            iM47448 = m47448(iM47448 + 1, iM383910);
                        }
                    }
                    boolean z = abstractC22454.mo17428().mo6700().size() != 0;
                    int iM29786 = c7742.m29785(iM38402);
                    if (iM29786 != c7742.m29785(iM38403) && !z) {
                        ((C6330) abstractC22454).m17418(0, m31291(abstractC22454, c16251M15275get2));
                        m47452(iM29786, abstractC22454.mo17429().m15275get(0));
                    }
                }
            }
        }
        for (C9859 c9859 : this.f68552) {
            C16251 c16251M49957 = c9859.m49955();
            int iM38404 = c16251M49957.m38400();
            int iM383911 = c16251M49957.m38396();
            C0727 c0727Mo174211 = c9859.mo17429();
            int size6 = c0727Mo174211.size();
            ArrayList arrayList5 = new ArrayList();
            C7637 c7637 = new C7637(size6 + 1);
            if (bitSet.get(iM38404)) {
                c7637.m20184(c7742.m29785(iM38404));
            } else {
                arrayList5.add(c16251M49957);
            }
            for (int i24 = 0; i24 < size6; i24++) {
                C16251 c16251M49958 = c4108.m11684(c0727Mo174211.m15275get(i24).m38400()).m49955();
                int iM38405 = c16251M49958.m38400();
                if (bitSet.get(iM38405)) {
                    c7637.m20184(c7742.m29785(iM38405));
                } else {
                    arrayList5.add(c16251M49958);
                }
            }
            for (int i25 = 0; i25 < c7637.m20185(); i25++) {
                m47454(c7637.m20183(), iM383911, arrayList5, false);
            }
            int iM474410 = m47448(i, iM383911);
            while (!m47454(iM474410, iM383911, arrayList5, false)) {
                iM474410 = m47448(iM474410 + 1, iM383911);
            }
        }
        int iM11686 = c4108.m11685();
        for (int i26 = 0; i26 < iM11686; i26++) {
            if (!bitSet.get(i26)) {
                AbstractC22454 abstractC22454M11685 = c4108.m11684(i26);
                C16251 c16251M49959 = abstractC22454M11685 == null ? null : abstractC22454M11685.m49955();
                if (c16251M49959 != null) {
                    int iM383912 = c16251M49959.m38396();
                    int iM474411 = m47448(i, iM383912);
                    while (!m47459(iM474411, c16251M49959)) {
                        iM474411 = m47448(iM474411 + 1, iM383912);
                    }
                    m47452(iM474411, c16251M49959);
                }
            }
        }
        return c7742;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47452(int i, C16251 c16251) {
        int iM38400 = c16251.m38400();
        BitSet bitSet = this.f68550;
        if (bitSet.get(iM38400) || !m47459(i, c16251)) {
            throw new RuntimeException("attempt to add invalid register mapping");
        }
        int iM38396 = c16251.m38396();
        this.f68549.mo20392(c16251.m38400(), i, iM38396);
        bitSet.set(iM38400);
        this.f68554.set(i, iM38396 + i);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m47450(int i, C6330 c6330, int[] iArr, BitSet bitSet) {
        C4108 c4108;
        C0727 c0727Mo17429 = c6330.mo17429();
        int size = c0727Mo17429.size();
        InterfaceC6952 interfaceC6952M29597 = c6330.m49949().m29597();
        C0727 c0727 = new C0727(interfaceC6952M29597.elements());
        InterfaceC13303 it = interfaceC6952M29597.iterator();
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            c4108 = this.f42044;
            if (!zHasNext) {
                break;
            }
            int i3 = i2 + 1;
            AbstractC22454 abstractC22454M11684 = c4108.m11684(it.next());
            c0727.m15261(i2, abstractC22454M11684 == null ? null : abstractC22454M11684.m49955());
            i2 = i3;
        }
        BitSet bitSet2 = new BitSet(c4108.m11685());
        int i4 = i;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            C16251 c16251M15275get = c0727Mo17429.m15275get(i6);
            int iM38400 = c16251M15275get.m38400();
            int i7 = iArr[i6];
            if (i6 != 0) {
                i4 += iArr[i6 - 1];
            }
            BitSet bitSet3 = this.f68550;
            boolean z = bitSet3.get(iM38400);
            C7742 c7742 = this.f68549;
            if (z && c7742.m29785(iM38400) == i4) {
                i5 += i7;
            } else {
                for (int i8 = i4; i8 < i4 + i7; i8++) {
                    if (this.f68548.get(i8)) {
                        return -1;
                    }
                }
                if (bitSet3.get(iM38400) || !m47459(i4, c16251M15275get) || bitSet2.get(iM38400)) {
                    if (c7742.m20393(c0727, i4, i7) || c7742.m20393(c0727Mo17429, i4, i7)) {
                        return -1;
                    }
                    bitSet.set(i6);
                } else {
                    i5 += i7;
                }
            }
            bitSet2.set(iM38400);
        }
        return i5;
    }
}
