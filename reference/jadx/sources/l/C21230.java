package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩶ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21230 extends AbstractC10041 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet f67744;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f67745;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f67746;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final BitSet f67747;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f67748;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f67749;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C4339 f67750;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TreeMap f67751;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final BitSet f67752;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48389(int i) {
        return (i & 1) == 0;
    }

    public C21230(C24960 c24960, C0347 c0347) {
        super(c24960, c0347);
        this.f67747 = new BitSet(c24960.m55737());
        this.f67750 = new C4339(c0347, c24960.m55737());
        int iM55741 = c24960.m55741();
        this.f67748 = iM55741;
        int i = iM55741 * 2;
        BitSet bitSet = new BitSet(i);
        this.f67744 = bitSet;
        bitSet.set(0, iM55741);
        this.f67752 = new BitSet(i);
        this.f67751 = new TreeMap();
        this.f67749 = new ArrayList();
        this.f67746 = new ArrayList();
        this.f67745 = new ArrayList();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m48393(int i) {
        C18708 c18708Mo4988;
        AbstractC5568 abstractC5568M55738 = this.f32177.m55738(i);
        if (abstractC5568M55738 == null || (c18708Mo4988 = abstractC5568M55738.mo4988()) == null || c18708Mo4988.m43509() != 3) {
            return -1;
        }
        return ((C15943) ((AbstractC12741) abstractC5568M55738.mo4993()).m31552()).mo17877();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m48390(int i, int i2, ArrayList arrayList, boolean z) {
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C20946 c20946 = (C20946) it.next();
            if (!this.f67747.get(c20946.m47903())) {
                boolean zM48391 = m48391(c20946, i, i2);
                z2 = !zM48391 || z2;
                if (zM48391 && z) {
                    this.f67744.set(i, c20946.m47901() + i, true);
                }
            }
        }
        return !z2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m48391(C20946 c20946, int i, int i2) {
        if (c20946.m47901() > i2 || this.f67747.get(c20946.m47903()) || !m48395(i, c20946)) {
            return false;
        }
        m48388(i, c20946);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m48384(int i, int i2) {
        EnumC4076 enumC4076 = EnumC4076.f13919;
        if (i2 == 2) {
            if ((this.f67748 & 1) == 0) {
                enumC4076 = EnumC4076.f13922;
            } else {
                enumC4076 = EnumC4076.f13921;
            }
        }
        return m48385(i, i2, enumC4076);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m48385(int i, int i2, EnumC4076 enumC4076) {
        BitSet bitSet = this.f67744;
        int iMo13160 = enumC4076.mo13160(bitSet, i);
        while (true) {
            int i3 = 1;
            while (i3 < i2 && !bitSet.get(iMo13160 + i3)) {
                i3++;
            }
            if (i3 == i2) {
                return iMo13160;
            }
            iMo13160 = enumC4076.mo13160(bitSet, iMo13160 + i3);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m48395(int i, C20946 c20946) {
        int iM47901 = c20946.m47901();
        int i2 = this.f67748;
        if (i < i2 && iM47901 + i > i2) {
            return false;
        }
        C4339 c4339 = this.f67750;
        c4339.getClass();
        return !c4339.m13843(c20946.m47903(), i, c20946.m47901());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4339 m48397() {
        BitSet bitSet;
        C4339 c4339;
        int i;
        Iterator it;
        BitSet bitSet2;
        C3046 c3046;
        EnumC4076 enumC4076;
        int iM51868;
        int i2;
        int i3;
        int iM47901;
        C20484 c20484 = new C20484(this);
        C24960 c24960 = this.f32177;
        c24960.m55733(c20484);
        TreeMap treeMap = this.f67751;
        for (ArrayList arrayList : treeMap.values()) {
            int size = arrayList.size();
            int i4 = -1;
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    iM47901 = 0;
                    break;
                }
                C20946 c20946 = (C20946) arrayList.get(i5);
                int iM48393 = m48393(c20946.m47903());
                if (iM48393 >= 0) {
                    iM47901 = c20946.m47901();
                    m48388(iM48393, c20946);
                    i4 = iM48393;
                    break;
                }
                i5++;
                i4 = iM48393;
            }
            if (i4 >= 0) {
                m48390(i4, iM47901, arrayList, true);
            }
        }
        int iM55737 = c24960.m55737();
        int i6 = 0;
        while (true) {
            bitSet = this.f67747;
            if (i6 >= iM55737) {
                break;
            }
            if (!bitSet.get(i6)) {
                int iM48394 = m48393(i6);
                AbstractC5568 abstractC5568M55738 = c24960.m55738(i6);
                C20946 c20946M16508 = abstractC5568M55738 == null ? null : abstractC5568M55738.m16508();
                if (iM48394 >= 0) {
                    m48388(iM48394, c20946M16508);
                }
            }
            i6++;
        }
        Iterator it2 = this.f67746.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            c4339 = this.f67750;
            i = this.f67748;
            if (!zHasNext) {
                break;
            }
            C1356 c1356 = (C1356) it2.next();
            C0063 c0063Mo4992 = c1356.mo4992();
            int size2 = c0063Mo4992.size();
            int[] iArr = new int[size2];
            int i7 = 0;
            for (int i8 = 0; i8 < size2; i8++) {
                int iM47902 = c0063Mo4992.m31619get(i8).m47901();
                iArr[i8] = iM47902;
                i7 += iM47902;
            }
            int i9 = Integer.MIN_VALUE;
            int i10 = 0;
            int i11 = 0;
            int iM48385 = -1;
            BitSet bitSet3 = null;
            while (true) {
                if (i10 >= size2) {
                    it = it2;
                    break;
                }
                it = it2;
                int iM47903 = c0063Mo4992.m31619get(i10).m47903();
                if (i10 != 0) {
                    i11 -= iArr[i10 - 1];
                }
                if (bitSet.get(iM47903) && (iM51868 = c4339.m51868(iM47903) + i11) >= 0) {
                    i2 = i11;
                    if (iM51868 >= i || iM51868 + i7 <= i) {
                        BitSet bitSet4 = new BitSet(size2);
                        i3 = iM48385;
                        int iM48386 = m48386(iM51868, c1356, iArr, bitSet4);
                        if (iM48386 >= 0) {
                            int iCardinality = iM48386 - bitSet4.cardinality();
                            if (iCardinality > i9) {
                                i9 = iCardinality;
                                bitSet3 = bitSet4;
                                i3 = iM51868;
                            }
                            if (iM48386 == i7) {
                                iM48385 = i3;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    iM48385 = i3;
                    i10++;
                    i11 = i2;
                    it2 = it;
                } else {
                    i2 = i11;
                }
                i3 = iM48385;
                iM48385 = i3;
                i10++;
                i11 = i2;
                it2 = it;
            }
            if (iM48385 == -1) {
                bitSet2 = new BitSet(size2);
                EnumC4076 enumC4077 = EnumC4076.f13919;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i12 < size2) {
                    EnumC4076 enumC4078 = enumC4077;
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
                    enumC4077 = enumC4078;
                    size2 = i16;
                }
                EnumC4076 enumC4079 = enumC4077;
                if (i13 > i14) {
                    enumC4076 = (i & 1) == 0 ? EnumC4076.f13921 : EnumC4076.f13922;
                } else if (i14 > 0) {
                    enumC4076 = (i & 1) == 0 ? EnumC4076.f13922 : EnumC4076.f13921;
                } else {
                    enumC4076 = enumC4079;
                }
                while (true) {
                    iM48385 = m48385(i, i7, enumC4076);
                    if (m48386(iM48385, c1356, iArr, bitSet2) >= 0) {
                        break;
                    }
                    i = iM48385 + 1;
                    bitSet2.clear();
                }
            } else {
                bitSet2 = bitSet3;
            }
            for (int iNextSetBit = bitSet2.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet2.nextSetBit(iNextSetBit + 1)) {
                c1356.m4985(iNextSetBit, m25893(c1356, c0063Mo4992.m31619get(iNextSetBit)));
            }
            C0063 c0063Mo4993 = c1356.mo4992();
            int size3 = c0063Mo4993.size();
            int i17 = 0;
            while (i17 < size3) {
                C20946 c20946M31619get = c0063Mo4993.m31619get(i17);
                int iM47904 = c20946M31619get.m47903();
                int iM47905 = c20946M31619get.m47901();
                int i18 = iM48385 + iM47905;
                if (!bitSet.get(iM47904)) {
                    Iterator it3 = treeMap.entrySet().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            c3046 = null;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Iterator it4 = ((ArrayList) entry.getValue()).iterator();
                        while (it4.hasNext()) {
                            if (((C20946) it4.next()).m47903() == iM47904) {
                                c3046 = (C3046) entry.getKey();
                                break;
                            }
                        }
                    }
                    m48388(iM48385, c20946M31619get);
                    if (c3046 != null) {
                        this.f67744.set(iM48385, i18, true);
                        ArrayList arrayList2 = (ArrayList) treeMap.get(c3046);
                        int size4 = arrayList2.size();
                        for (int i19 = 0; i19 < size4; i19++) {
                            C20946 c20947 = (C20946) arrayList2.get(i19);
                            if (-1 == c0063Mo4993.m1041(c20947.m47903())) {
                                m48391(c20947, iM48385, iM47905);
                            }
                        }
                    }
                }
                i17++;
                iM48385 = i18;
            }
            it2 = it;
        }
        for (ArrayList arrayList3 : treeMap.values()) {
            boolean zM48390 = false;
            int i20 = i;
            do {
                int size5 = arrayList3.size();
                int i21 = 1;
                for (int i22 = 0; i22 < size5; i22++) {
                    C20946 c20948 = (C20946) arrayList3.get(i22);
                    int iM47906 = c20948.m47901();
                    if (!bitSet.get(c20948.m47903()) && iM47906 > i21) {
                        i21 = iM47906;
                    }
                }
                EnumC4076 enumC40710 = EnumC4076.f13919;
                if (i21 == 2) {
                    enumC40710 = (i & 1) == 0 ? EnumC4076.f13922 : EnumC4076.f13921;
                }
                BitSet bitSet5 = this.f67752;
                int iMo13160 = enumC40710.mo13160(bitSet5, i20);
                while (true) {
                    int i23 = 1;
                    while (i23 < i21 && !bitSet5.get(iMo13160 + i23)) {
                        i23++;
                    }
                    if (i23 == i21) {
                        break;
                    }
                    iMo13160 = enumC40710.mo13160(bitSet5, iMo13160 + i23);
                }
                Iterator it5 = arrayList3.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        zM48390 = m48390(iMo13160, i21, arrayList3, true);
                        break;
                    }
                    C20946 c20949 = (C20946) it5.next();
                    if (!bitSet.get(c20949.m47903()) && !m48395(iMo13160, c20949)) {
                        break;
                    }
                }
                i20 = iMo13160 + 1;
            } while (!zM48390);
        }
        for (C1356 c1357 : this.f67749) {
            C20946 c20946M16509 = c1357.m16508();
            int iM47907 = c20946M16509.m47903();
            BitSet bitSetM45465 = c1357.m16506().m45465();
            if (bitSetM45465.cardinality() == 1) {
                AbstractC5568 abstractC5568 = (AbstractC5568) j$$ExternalSyntheticOutline0.m(((C19738) c24960.m55749().get(bitSetM45465.nextSetBit(0))).m45460(), 1);
                if (abstractC5568.mo4988().m43509() == 43) {
                    C20946 c20946M31619get2 = abstractC5568.mo4992().m31619get(0);
                    int iM47908 = c20946M31619get2.m47903();
                    int iM47909 = c20946M31619get2.m47901();
                    boolean zM48391 = bitSet.get(iM47907);
                    boolean zM48392 = bitSet.get(iM47908);
                    if ((!zM48392) & zM48391) {
                        zM48392 = m48391(c20946M31619get2, c4339.m51868(iM47907), iM47909);
                    }
                    if ((!zM48391) & zM48392) {
                        zM48391 = m48391(c20946M16509, c4339.m51868(iM47908), iM47909);
                    }
                    if (!zM48391 || !zM48392) {
                        int iM48384 = m48384(i, iM47909);
                        ArrayList arrayList4 = new ArrayList(2);
                        arrayList4.add(c20946M16509);
                        arrayList4.add(c20946M31619get2);
                        while (!m48390(iM48384, iM47909, arrayList4, false)) {
                            iM48384 = m48384(iM48384 + 1, iM47909);
                        }
                    }
                    boolean z = abstractC5568.mo4993().mo7781().size() != 0;
                    int iM51869 = c4339.m51868(iM47907);
                    if (iM51869 != c4339.m51868(iM47908) && !z) {
                        ((C1356) abstractC5568).m4985(0, m25893(abstractC5568, c20946M31619get2));
                        m48388(iM51869, abstractC5568.mo4992().m31619get(0));
                    }
                }
            }
        }
        for (C14033 c14033 : this.f67745) {
            C20946 c20946M165010 = c14033.m16508();
            int iM479010 = c20946M165010.m47903();
            int iM479011 = c20946M165010.m47901();
            C0063 c0063Mo4994 = c14033.mo4992();
            int size6 = c0063Mo4994.size();
            ArrayList arrayList5 = new ArrayList();
            C14516 c14516 = new C14516(size6 + 1);
            if (bitSet.get(iM479010)) {
                c14516.m35034(c4339.m51868(iM479010));
            } else {
                arrayList5.add(c20946M165010);
            }
            for (int i24 = 0; i24 < size6; i24++) {
                C20946 c20946M165011 = c24960.m55738(c0063Mo4994.m31619get(i24).m47903()).m16508();
                int iM479012 = c20946M165011.m47903();
                if (bitSet.get(iM479012)) {
                    c14516.m35034(c4339.m51868(iM479012));
                } else {
                    arrayList5.add(c20946M165011);
                }
            }
            for (int i25 = 0; i25 < c14516.m35035(); i25++) {
                m48390(c14516.m35033(), iM479011, arrayList5, false);
            }
            int iM48387 = m48384(i, iM479011);
            while (!m48390(iM48387, iM479011, arrayList5, false)) {
                iM48387 = m48384(iM48387 + 1, iM479011);
            }
        }
        int iM55738 = c24960.m55737();
        for (int i26 = 0; i26 < iM55738; i26++) {
            if (!bitSet.get(i26)) {
                AbstractC5568 abstractC5568M55739 = c24960.m55738(i26);
                C20946 c20946M165012 = abstractC5568M55739 == null ? null : abstractC5568M55739.m16508();
                if (c20946M165012 != null) {
                    int iM479013 = c20946M165012.m47901();
                    int iM48388 = m48384(i, iM479013);
                    while (!m48395(iM48388, c20946M165012)) {
                        iM48388 = m48384(iM48388 + 1, iM479013);
                    }
                    m48388(iM48388, c20946M165012);
                }
            }
        }
        return c4339;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48388(int i, C20946 c20946) {
        int iM47903 = c20946.m47903();
        BitSet bitSet = this.f67747;
        if (bitSet.get(iM47903) || !m48395(i, c20946)) {
            throw new RuntimeException("attempt to add invalid register mapping");
        }
        int iM47901 = c20946.m47901();
        this.f67750.mo13841(c20946.m47903(), i, iM47901);
        bitSet.set(iM47903);
        this.f67752.set(i, iM47901 + i);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m48386(int i, C1356 c1356, int[] iArr, BitSet bitSet) {
        C24960 c24960;
        C0063 c0063Mo4992 = c1356.mo4992();
        int size = c0063Mo4992.size();
        InterfaceC16492 interfaceC16492M45476 = c1356.m16506().m45476();
        C0063 c0063 = new C0063(interfaceC16492M45476.elements());
        InterfaceC11271 it = interfaceC16492M45476.iterator();
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            c24960 = this.f32177;
            if (!zHasNext) {
                break;
            }
            int i3 = i2 + 1;
            AbstractC5568 abstractC5568M55738 = c24960.m55738(it.next());
            c0063.m31604(i2, abstractC5568M55738 == null ? null : abstractC5568M55738.m16508());
            i2 = i3;
        }
        BitSet bitSet2 = new BitSet(c24960.m55737());
        int i4 = i;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            C20946 c20946M31619get = c0063Mo4992.m31619get(i6);
            int iM47903 = c20946M31619get.m47903();
            int i7 = iArr[i6];
            if (i6 != 0) {
                i4 += iArr[i6 - 1];
            }
            BitSet bitSet3 = this.f67747;
            boolean z = bitSet3.get(iM47903);
            C4339 c4339 = this.f67750;
            if (z && c4339.m51868(iM47903) == i4) {
                i5 += i7;
            } else {
                for (int i8 = i4; i8 < i4 + i7; i8++) {
                    if (this.f67744.get(i8)) {
                        return -1;
                    }
                }
                if (bitSet3.get(iM47903) || !m48395(i4, c20946M31619get) || bitSet2.get(iM47903)) {
                    if (c4339.m13842(c0063, i4, i7) || c4339.m13842(c0063Mo4992, i4, i7)) {
                        return -1;
                    }
                    bitSet.set(i6);
                } else {
                    i5 += i7;
                }
            }
            bitSet2.set(iM47903);
        }
        return i5;
    }
}
