package l;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۟۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes4.dex */
public final class C7892 extends AbstractC8909 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21431(C13791 c13791, HashMap map) {
        HashSet hashSet;
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C4448) it.next()).f15916 = i;
            i++;
        }
        ArrayList arrayList = new ArrayList();
        C22874.m51597(c13791.f43750, new C4163(i, arrayList, map));
        HashSet<C0434> hashSet2 = new HashSet(arrayList.size() / 2);
        C17587 c17587 = new C17587();
        c17587.addAll(arrayList);
        arrayList.clear();
        while (!c17587.isEmpty()) {
            C0434 c0434 = (C0434) c17587.poll();
            if (c0434.f1997 && !hashSet2.contains(c0434)) {
                hashSet2.add(c0434);
                C0434 c0435 = c0434.f2000;
                if (c0435 != null && !c0435.f1997) {
                    c0435.f1997 = true;
                    c17587.add(c0435);
                }
                HashSet<C0434> hashSet3 = c0434.f1996;
                if (hashSet3 != null) {
                    for (C0434 c0436 : hashSet3) {
                        if (!c0436.f1997) {
                            c0436.f1997 = true;
                            c17587.add(c0436);
                        }
                    }
                }
            }
        }
        for (C0434 c0437 : hashSet2) {
            C18333 c18333 = c0437.f1995;
            C4448 c4448 = c0437.f1999;
            if (c18333.f59799.size() > 1) {
                map.remove(c4448);
            } else {
                C0434 c0438 = c0437.f2000;
                if (c0438 != null && (hashSet = c0437.f1996) != null) {
                    BitSet bitSet = c0438.f1998;
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        if (!bitSet.equals(((C0434) it2.next()).f1998)) {
                            map.remove(c4448);
                            break;
                        }
                    }
                }
            }
        }
        Iterator it3 = map.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            C4448 c4449 = (C4448) entry.getKey();
            C18333 c18334 = (C18333) entry.getValue();
            Iterator it4 = c18334.f59799.iterator();
            while (it4.hasNext()) {
                BitSet bitSet2 = ((C0434[]) ((AbstractC12563) it4.next()).f40353)[c4449.f15916].f1998;
                int iNextClearBit = bitSet2.nextClearBit(0);
                int i2 = c18334.f59798;
                if (iNextClearBit < i2 || bitSet2.nextSetBit(i2) >= 0) {
                    it3.remove();
                    break;
                }
            }
        }
        Iterator it5 = c13791.f43750.iterator();
        while (it5.hasNext()) {
            ((AbstractC12563) it5.next()).f40353 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21432(C13791 c13791) {
        HashMap map = new HashMap();
        ArrayList arrayList = c13791.f43751;
        if (arrayList.size() != 0) {
            C22874.m51595(c13791);
            C22874.m51596(c13791, new C14603(map));
            if (map.size() > 0) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = c13791.f43754;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ArrayList<C20022> arrayList3 = ((C11817) it.next()).f38143;
                        if (arrayList3 != null) {
                            for (C20022 c20022 : arrayList3) {
                                hashSet.add((C4448) c20022.f12388);
                                for (AbstractC11071 abstractC11071 : c20022.f12387.mo15448()) {
                                    hashSet.add((C4448) abstractC11071);
                                }
                            }
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        map.remove((C4448) it2.next());
                    }
                }
            }
        }
        if (map.size() != 0) {
            BitSet bitSet = new BitSet();
            Iterator it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                C18333 c18333 = (C18333) ((Map.Entry) it3.next()).getValue();
                Iterator it4 = c18333.f59800.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        AbstractC12563 abstractC12563 = (AbstractC12563) it4.next();
                        if (abstractC12563.f40344 == EnumC20768.FILL_ARRAY_DATA) {
                            int length = Array.getLength(((C16380) abstractC12563.mo11728()).f53172);
                            int iNextSetBit = bitSet.nextSetBit(0);
                            if (iNextSetBit < 0 || iNextSetBit >= length) {
                                bitSet.set(0, length);
                            }
                        } else {
                            int iIntValue = ((Number) ((C16380) ((C25332) abstractC12563.mo11730()).f44725).f53172).intValue();
                            if (!bitSet.get(iIntValue)) {
                                bitSet.set(iIntValue);
                            }
                        }
                    } else {
                        int iNextClearBit = bitSet.nextClearBit(0);
                        int i = c18333.f59798;
                        if (iNextClearBit >= i && bitSet.nextSetBit(i) < 0) {
                            break;
                        }
                    }
                    it3.remove();
                    break;
                }
                bitSet.clear();
            }
            if (map.size() != 0) {
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    ((C4448) it5.next()).f15916 = -1;
                }
                if (map.size() < 50) {
                    m21431(c13791, map);
                } else {
                    HashMap map2 = new HashMap();
                    HashMap map3 = new HashMap();
                    ArrayList arrayList4 = new ArrayList(50);
                    Iterator it6 = map.entrySet().iterator();
                    while (it6.hasNext()) {
                        for (int i2 = 0; i2 < 50 && it6.hasNext(); i2++) {
                            Map.Entry entry = (Map.Entry) it6.next();
                            map3.put((C4448) entry.getKey(), (C18333) entry.getValue());
                            it6.remove();
                            arrayList4.add((C4448) entry.getKey());
                        }
                        m21431(c13791, map3);
                        Iterator it7 = arrayList4.iterator();
                        while (it7.hasNext()) {
                            ((C4448) it7.next()).f15916 = -1;
                        }
                        arrayList4.clear();
                        map2.putAll(map3);
                        map3.clear();
                    }
                    map.putAll(map2);
                }
                C22874.m51600(c13791);
                if (map.size() != 0) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Map.Entry entry2 : map.entrySet()) {
                        C4448 c4448 = (C4448) entry2.getKey();
                        C18333 c18334 = (C18333) entry2.getValue();
                        int i3 = c18334.f59798;
                        ArrayList<AbstractC12563> arrayList6 = c18334.f59800;
                        ArrayList arrayList7 = c18334.f59799;
                        AbstractC11071[] abstractC11071Arr = new AbstractC11071[i3];
                        for (AbstractC12563 abstractC12564 : arrayList6) {
                            if (abstractC12564.f40344 == EnumC20768.FILL_ARRAY_DATA) {
                                if (((C4448) abstractC12564.mo11730()) == c4448) {
                                    Object obj = ((C16380) abstractC12564.mo11728()).f53172;
                                    int length2 = Array.getLength(obj);
                                    for (int i4 = 0; i4 < length2; i4++) {
                                        abstractC11071Arr[i4] = new C16380(Array.get(obj, i4));
                                    }
                                }
                            } else {
                                C25332 c25332 = (C25332) abstractC12564.mo11730();
                                if (((C4448) c25332.f44724) == c4448) {
                                    int iIntValue2 = ((Number) ((C16380) c25332.f44725).f53172).intValue();
                                    AbstractC11071 abstractC11071Mo11728 = abstractC12564.mo11728();
                                    EnumC22260 enumC22260 = abstractC11071Mo11728.f34921;
                                    if (enumC22260 != EnumC22260.LOCAL && enumC22260 != EnumC22260.CONSTANT) {
                                        C4448 c4449 = new C4448(-1);
                                        arrayList.add(c4449);
                                        c13791.f43750.m54765(abstractC12564, C4360.m13864(c4449, abstractC11071Mo11728));
                                        abstractC11071Mo11728 = c4449;
                                    }
                                    abstractC11071Arr[iIntValue2] = abstractC11071Mo11728;
                                }
                            }
                        }
                        arrayList.remove(c4448);
                        c13791.f43750.m54761(c18334.f59797);
                        Iterator it8 = arrayList6.iterator();
                        while (it8.hasNext()) {
                            c13791.f43750.m54761((AbstractC12563) it8.next());
                        }
                        C24301 c24301 = new C24301(c4448, c18334, abstractC11071Arr, arrayList5);
                        if (arrayList7.size() == 1) {
                            AbstractC12563 abstractC12565 = (AbstractC12563) arrayList7.get(0);
                            if (c13791.f43750.m54760(abstractC12565)) {
                                C22874.m51602(abstractC12565, c24301, false);
                            } else {
                                int size = arrayList5.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    C22874.m51601((AbstractC11071) arrayList5.get(i5), c24301);
                                }
                            }
                        } else if (arrayList7.size() != 0) {
                            throw new RuntimeException("array is used multiple times");
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
