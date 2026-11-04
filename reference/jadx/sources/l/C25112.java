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

/* JADX INFO: renamed from: l.᩻ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XL */
/* JADX INFO: loaded from: classes.dex */
public final class C25112 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Comparator f81214 = new C1991();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20528 f81216 = new C20528();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20528 f81215 = new C20528(200);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55983(C13791 c13791) {
        C11685[] c11685Arr;
        int i;
        int i2;
        C20528 c20528;
        C11685[] c11685Arr2;
        Iterator it;
        Iterator it2;
        C11685[] c11685Arr3;
        Iterator it3;
        C6401 c6401;
        ArrayList<C4448> arrayList = c13791.f43751;
        if (arrayList.size() == 0) {
            return;
        }
        C12366 c12366 = new C12366(c13791);
        c12366.m47168();
        int iM30844 = c12366.m30844();
        C11685[] c11685Arr4 = new C11685[iM30844];
        for (C4448 c4448 : arrayList) {
            C11685 c11685 = new C11685();
            char cCharAt = c4448.f34923.charAt(0);
            if (cCharAt == '[') {
                cCharAt = 'L';
            }
            c11685.f37848 = cCharAt;
            c4448.f34924 = c11685;
            c11685Arr4[c4448.f15916] = c11685;
        }
        if (c13791.f43756) {
            c11685Arr = new C11685[c13791.f43749.length];
        } else {
            c11685Arr = new C11685[c13791.f43749.length + 1];
        }
        HashSet hashSet = new HashSet();
        for (AbstractC12563 abstractC12563 : c13791.f43750) {
            EnumC20768 enumC20768 = abstractC12563.f40344;
            if (enumC20768 == EnumC20768.ASSIGN || enumC20768 == EnumC20768.IDENTITY) {
                if (abstractC12563.mo11730().f34921 == EnumC22260.LOCAL) {
                    C4448 c4449 = (C4448) abstractC12563.mo11730();
                    AbstractC11071 abstractC11071Mo11728 = abstractC12563.mo11728();
                    int i3 = c4449.f15916;
                    C11685 c11686 = c11685Arr4[i3];
                    C22874.m51593(abstractC12563, hashSet);
                    Iterator it4 = hashSet.iterator();
                    while (it4.hasNext()) {
                        C6401[] c6401Arr = (C6401[]) ((AbstractC12563) it4.next()).f40353;
                        if (c6401Arr != null) {
                            for (int i4 = 0; i4 < c6401Arr.length; i4++) {
                                if (i4 != i3 && (c6401 = c6401Arr[i4]) != null && c6401.f21602) {
                                    C11685 c11687 = c11685Arr4[i4];
                                    c11686.f37845.add(c11687);
                                    c11687.f37845.add(c11686);
                                }
                            }
                        }
                    }
                    hashSet.clear();
                    if (abstractC11071Mo11728.f34921 == EnumC22260.LOCAL) {
                        C11685 c11688 = c11685Arr4[((C4448) abstractC11071Mo11728).f15916];
                        c11686.f37847.add(c11688);
                        c11688.f37847.add(c11686);
                    }
                    EnumC22260 enumC22260 = abstractC11071Mo11728.f34921;
                    if (enumC22260 == EnumC22260.THIS_REF) {
                        c11685Arr[0] = c11686;
                    } else if (enumC22260 == EnumC22260.PARAMETER_REF) {
                        int i5 = ((C8177) abstractC11071Mo11728).f26965;
                        if (c13791.f43756) {
                            c11685Arr[i5] = c11686;
                        } else {
                            c11685Arr[i5 + 1] = c11686;
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < iM30844; i6++) {
            C11685 c11689 = c11685Arr4[i6];
            c11689.f37845.remove(c11689);
            c11689.f37847.remove(c11689);
        }
        if (!c13791.f43756) {
            C11685 c116810 = c11685Arr[0];
            for (int i7 = 0; i7 < iM30844; i7++) {
                C11685 c116811 = c11685Arr4[i7];
                if (c116811 != c116810) {
                    c116811.f37845.add(c116810);
                    c116810.f37845.add(c116811);
                }
            }
        }
        if (c13791.f43756) {
            i = 0;
            i2 = 0;
        } else {
            c11685Arr[0].f37846 = 0;
            i = 1;
            i2 = 1;
        }
        int i8 = 0;
        while (true) {
            String[] strArr = c13791.f43749;
            if (i8 >= strArr.length) {
                break;
            }
            int i9 = i + 1;
            C11685 c116812 = c11685Arr[i];
            String str = strArr[i8];
            if (c116812 == null) {
                i2++;
            } else {
                c116812.f37846 = i2;
                i2++;
            }
            if ("J".equals(str) || "D".equals(str)) {
                i2++;
            }
            i8++;
            i = i9;
        }
        C20528 c20529 = this.f81216;
        Map map = (Map) c20529.m47061();
        if (map == null) {
            map = new HashMap();
        }
        int i10 = 0;
        while (true) {
            c20528 = this.f81215;
            if (i10 >= iM30844) {
                break;
            }
            C11685 c116813 = c11685Arr4[i10];
            char c = c116813.f37848;
            List list = (List) map.get(Character.valueOf(c));
            if (list == null) {
                List arrayList2 = (List) c20528.m47061();
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                list = arrayList2;
                map.put(Character.valueOf(c), list);
            }
            list.add(c116813);
            Iterator it5 = c116813.f37845.iterator();
            while (it5.hasNext()) {
                if (((C11685) it5.next()).f37848 != c116813.f37848) {
                    it5.remove();
                }
            }
            Iterator it6 = c116813.f37847.iterator();
            while (it6.hasNext()) {
                if (((C11685) it6.next()).f37848 != c116813.f37848) {
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
            Collections.sort(list2, f81214);
            char cCharValue = ((Character) entry.getKey()).charValue();
            boolean z = cCharValue == 'J' || cCharValue == 'D';
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                C11685 c116814 = (C11685) it8.next();
                if (c116814.f37846 < 0) {
                    bitSet.clear();
                    Iterator it9 = c116814.f37845.iterator();
                    while (it9.hasNext()) {
                        Iterator it10 = it9;
                        C11685 c116815 = (C11685) it9.next();
                        Iterator it11 = it7;
                        int i11 = c116815.f37846;
                        if (i11 >= 0) {
                            bitSet.set(i11);
                            char c2 = c116815.f37848;
                            it3 = it8;
                            if (c2 == 'J' || c2 == 'D') {
                                bitSet.set(c116815.f37846 + 1);
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
                    int length = c11685Arr.length;
                    int i12 = 0;
                    while (i12 < length) {
                        C11685 c116816 = c11685Arr[i12];
                        int i13 = length;
                        if (c116816.f37848 != cCharValue) {
                            bitSet.set(c116816.f37846);
                            char c3 = c116816.f37848;
                            c11685Arr3 = c11685Arr;
                            if (c3 == 'J' || c3 == 'D') {
                                bitSet.set(c116816.f37846 + 1);
                            }
                        } else {
                            c11685Arr3 = c11685Arr;
                        }
                        i12++;
                        length = i13;
                        c11685Arr = c11685Arr3;
                    }
                    c11685Arr2 = c11685Arr;
                    bitSet.or(bitSet3);
                    bitSet2.clear();
                    Iterator it12 = c116814.f37847.iterator();
                    while (it12.hasNext()) {
                        int i14 = ((C11685) it12.next()).f37846;
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
                                c116814.f37846 = iNextSetBit;
                                break;
                            }
                            i15 = iNextSetBit + 1;
                        } else {
                            if (!bitSet.get(iNextSetBit)) {
                                c116814.f37846 = iNextSetBit;
                                break;
                            }
                            i15 = iNextSetBit + 1;
                        }
                    }
                    if (c116814.f37846 < 0) {
                        if (z) {
                            int iNextClearBit = -1;
                            do {
                                iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1);
                            } while (bitSet.get(iNextClearBit + 1));
                            c116814.f37846 = iNextClearBit;
                        } else {
                            c116814.f37846 = bitSet.nextClearBit(0);
                        }
                    }
                } else {
                    c11685Arr2 = c11685Arr;
                    it = it7;
                    it2 = it8;
                }
                bitSet4.set(c116814.f37846);
                if (z) {
                    bitSet4.set(c116814.f37846 + 1);
                }
                it7 = it;
                it8 = it2;
                c11685Arr = c11685Arr2;
            }
            bitSet3.or(bitSet4);
            bitSet4.clear();
        }
        for (C4448 c44410 : arrayList) {
            c44410.f15916 = ((C11685) c44410.f34924).f37846;
            c44410.f34924 = null;
        }
        Iterator it13 = c13791.f43750.iterator();
        while (it13.hasNext()) {
            ((AbstractC12563) it13.next()).f40353 = null;
        }
        for (List list3 : map.values()) {
            list3.clear();
            c20528.m47060(list3);
        }
        map.clear();
        c20529.m47060(map);
    }
}
