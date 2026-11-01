package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۛܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XL */
/* JADX INFO: loaded from: classes2.dex */
public final class C6188 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Comparator f21061 = new C12539();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19805 f21063 = new C19805();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19805 f21062 = new C19805(200);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17188(C9116 c9116) {
        C17477[] c17477Arr;
        int i;
        int i2;
        C19805 c19805;
        C17477[] c17477Arr2;
        Iterator it;
        Iterator it2;
        C17477[] c17477Arr3;
        Iterator it3;
        C13971 c13971;
        ArrayList<C2184> arrayList = c9116.f31044;
        if (arrayList.size() == 0) {
            return;
        }
        C4797 c4797 = new C4797(c9116);
        c4797.m9697();
        int iM13319 = c4797.m13319();
        C17477[] c17477Arr4 = new C17477[iM13319];
        for (C2184 c2184 : arrayList) {
            C17477 c17477 = new C17477();
            char cCharAt = c2184.f23821.charAt(0);
            if (cCharAt == '[') {
                cCharAt = 'L';
            }
            c17477.f55611 = cCharAt;
            c2184.f23824 = c17477;
            c17477Arr4[c2184.f7921] = c17477;
        }
        if (c9116.f31046) {
            c17477Arr = new C17477[c9116.f31041.length];
        } else {
            c17477Arr = new C17477[c9116.f31041.length + 1];
        }
        HashSet hashSet = new HashSet();
        for (AbstractC4777 abstractC4777 : c9116.f31045) {
            EnumC2890 enumC2890 = abstractC4777.f16795;
            if (enumC2890 == EnumC2890.ASSIGN || enumC2890 == EnumC2890.IDENTITY) {
                if (abstractC4777.mo13244().f23823 == EnumC9947.LOCAL) {
                    C2184 c2185 = (C2184) abstractC4777.mo13244();
                    AbstractC7124 abstractC7124Mo13245 = abstractC4777.mo13245();
                    int i3 = c2185.f7921;
                    C17477 c17478 = c17477Arr4[i3];
                    C21005.m47165(abstractC4777, hashSet);
                    Iterator it4 = hashSet.iterator();
                    while (it4.hasNext()) {
                        C13971[] c13971Arr = (C13971[]) ((AbstractC4777) it4.next()).f16794;
                        if (c13971Arr != null) {
                            for (int i4 = 0; i4 < c13971Arr.length; i4++) {
                                if (i4 != i3 && (c13971 = c13971Arr[i4]) != null && c13971.f45950) {
                                    C17477 c17479 = c17477Arr4[i4];
                                    c17478.f55612.add(c17479);
                                    c17479.f55612.add(c17478);
                                }
                            }
                        }
                    }
                    hashSet.clear();
                    if (abstractC7124Mo13245.f23823 == EnumC9947.LOCAL) {
                        C17477 c174710 = c17477Arr4[((C2184) abstractC7124Mo13245).f7921];
                        c17478.f55614.add(c174710);
                        c174710.f55614.add(c17478);
                    }
                    EnumC9947 enumC9947 = abstractC7124Mo13245.f23823;
                    if (enumC9947 == EnumC9947.THIS_REF) {
                        c17477Arr[0] = c17478;
                    } else if (enumC9947 == EnumC9947.PARAMETER_REF) {
                        int i5 = ((C3595) abstractC7124Mo13245).f13228;
                        if (c9116.f31046) {
                            c17477Arr[i5] = c17478;
                        } else {
                            c17477Arr[i5 + 1] = c17478;
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < iM13319; i6++) {
            C17477 c174711 = c17477Arr4[i6];
            c174711.f55612.remove(c174711);
            c174711.f55614.remove(c174711);
        }
        if (!c9116.f31046) {
            C17477 c174712 = c17477Arr[0];
            for (int i7 = 0; i7 < iM13319; i7++) {
                C17477 c174713 = c17477Arr4[i7];
                if (c174713 != c174712) {
                    c174713.f55612.add(c174712);
                    c174712.f55612.add(c174713);
                }
            }
        }
        if (c9116.f31046) {
            i = 0;
            i2 = 0;
        } else {
            c17477Arr[0].f55613 = 0;
            i = 1;
            i2 = 1;
        }
        int i8 = 0;
        while (true) {
            String[] strArr = c9116.f31041;
            if (i8 >= strArr.length) {
                break;
            }
            int i9 = i + 1;
            C17477 c174714 = c17477Arr[i];
            String str = strArr[i8];
            if (c174714 == null) {
                i2++;
            } else {
                c174714.f55613 = i2;
                i2++;
            }
            if ("J".equals(str) || "D".equals(str)) {
                i2++;
            }
            i8++;
            i = i9;
        }
        C19805 c19806 = this.f21063;
        Map map = (Map) c19806.m45009();
        if (map == null) {
            map = new HashMap();
        }
        int i10 = 0;
        while (true) {
            c19805 = this.f21062;
            if (i10 >= iM13319) {
                break;
            }
            C17477 c174715 = c17477Arr4[i10];
            char c = c174715.f55611;
            List list = (List) map.get(Character.valueOf(c));
            if (list == null) {
                List arrayList2 = (List) c19805.m45009();
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                list = arrayList2;
                map.put(Character.valueOf(c), list);
            }
            list.add(c174715);
            Iterator it5 = c174715.f55612.iterator();
            while (it5.hasNext()) {
                if (((C17477) it5.next()).f55611 != c174715.f55611) {
                    it5.remove();
                }
            }
            Iterator it6 = c174715.f55614.iterator();
            while (it6.hasNext()) {
                if (((C17477) it6.next()).f55611 != c174715.f55611) {
                    it6.remove();
                }
            }
            i10++;
        }
        BitSet bitSet = new BitSet();
        BitSet bitSet2 = new BitSet();
        BitSet bitSet3 = new BitSet();
        BitSet bitSet4 = new BitSet();
        Iterator it7 = map.entrySet().iterator();
        while (it7.hasNext()) {
            Map.Entry entry = (Map.Entry) it7.next();
            List list2 = (List) entry.getValue();
            Collections.sort(list2, f21061);
            char cCharValue = ((Character) entry.getKey()).charValue();
            boolean z = cCharValue == 'J' || cCharValue == 'D';
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                C17477 c174716 = (C17477) it8.next();
                if (c174716.f55613 < 0) {
                    bitSet.clear();
                    Iterator it9 = c174716.f55612.iterator();
                    while (it9.hasNext()) {
                        Iterator it10 = it9;
                        C17477 c174717 = (C17477) it9.next();
                        Iterator it11 = it7;
                        int i11 = c174717.f55613;
                        if (i11 >= 0) {
                            bitSet.set(i11);
                            char c2 = c174717.f55611;
                            it3 = it8;
                            if (c2 == 'J' || c2 == 'D') {
                                bitSet.set(c174717.f55613 + 1);
                            }
                        } else {
                            it3 = it8;
                        }
                        it7 = it11;
                        it9 = it10;
                        it8 = it3;
                    }
                    it = it7;
                    it2 = it8;
                    int length = c17477Arr.length;
                    int i12 = 0;
                    while (i12 < length) {
                        C17477 c174718 = c17477Arr[i12];
                        int i13 = length;
                        if (c174718.f55611 != cCharValue) {
                            bitSet.set(c174718.f55613);
                            char c3 = c174718.f55611;
                            c17477Arr3 = c17477Arr;
                            if (c3 == 'J' || c3 == 'D') {
                                bitSet.set(c174718.f55613 + 1);
                            }
                        } else {
                            c17477Arr3 = c17477Arr;
                        }
                        i12++;
                        length = i13;
                        c17477Arr = c17477Arr3;
                    }
                    c17477Arr2 = c17477Arr;
                    bitSet.or(bitSet3);
                    bitSet2.clear();
                    Iterator it12 = c174716.f55614.iterator();
                    while (it12.hasNext()) {
                        int i14 = ((C17477) it12.next()).f55613;
                        if (i14 >= 0) {
                            bitSet2.set(i14);
                        }
                    }
                    int i15 = 0;
                    while (true) {
                        int iNextSetBit = bitSet2.nextSetBit(i15);
                        if (iNextSetBit < 0) {
                            break;
                        }
                        if (z) {
                            if (!bitSet.get(iNextSetBit) && !bitSet.get(iNextSetBit + 1)) {
                                c174716.f55613 = iNextSetBit;
                                break;
                            }
                            i15 = iNextSetBit + 1;
                        } else {
                            if (!bitSet.get(iNextSetBit)) {
                                c174716.f55613 = iNextSetBit;
                                break;
                            }
                            i15 = iNextSetBit + 1;
                        }
                    }
                    if (c174716.f55613 < 0) {
                        if (z) {
                            int iNextClearBit = -1;
                            do {
                                iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1);
                            } while (bitSet.get(iNextClearBit + 1));
                            c174716.f55613 = iNextClearBit;
                        } else {
                            c174716.f55613 = bitSet.nextClearBit(0);
                        }
                    }
                } else {
                    c17477Arr2 = c17477Arr;
                    it = it7;
                    it2 = it8;
                }
                bitSet4.set(c174716.f55613);
                if (z) {
                    bitSet4.set(c174716.f55613 + 1);
                }
                it7 = it;
                it8 = it2;
                c17477Arr = c17477Arr2;
            }
            bitSet3.or(bitSet4);
            bitSet4.clear();
        }
        for (C2184 c2186 : arrayList) {
            c2186.f7921 = ((C17477) c2186.f23824).f55613;
            c2186.f23824 = null;
        }
        Iterator it13 = c9116.f31045.iterator();
        while (it13.hasNext()) {
            ((AbstractC4777) it13.next()).f16794 = null;
        }
        for (List list3 : map.values()) {
            list3.clear();
            c19805.m45011(list3);
        }
        map.clear();
        c19806.m45011(map);
    }
}
