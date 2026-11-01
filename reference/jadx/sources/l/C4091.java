package l;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4091 extends AbstractC10872 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11630(C9116 c9116, HashMap map) {
        HashSet hashSet;
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C2184) it.next()).f7921 = i;
            i++;
        }
        ArrayList arrayList = new ArrayList();
        C21005.m47170(c9116.f31045, new C2680(i, arrayList, map));
        HashSet<C13265> hashSet2 = new HashSet(arrayList.size() / 2);
        C23704 c23704 = new C23704();
        c23704.addAll(arrayList);
        arrayList.clear();
        while (!c23704.isEmpty()) {
            C13265 c13265 = (C13265) c23704.poll();
            if (c13265.f44049 && !hashSet2.contains(c13265)) {
                hashSet2.add(c13265);
                C13265 c13266 = c13265.f44044;
                if (c13266 != null && !c13266.f44049) {
                    c13266.f44049 = true;
                    c23704.add(c13266);
                }
                HashSet<C13265> hashSet3 = c13265.f44047;
                if (hashSet3 != null) {
                    for (C13265 c13267 : hashSet3) {
                        if (!c13267.f44049) {
                            c13267.f44049 = true;
                            c23704.add(c13267);
                        }
                    }
                }
            }
        }
        for (C13265 c13268 : hashSet2) {
            C1269 c1269 = c13268.f44045;
            C2184 c2184 = c13268.f44048;
            if (c1269.f5496.size() > 1) {
                map.remove(c2184);
            } else {
                C13265 c13269 = c13268.f44044;
                if (c13269 != null && (hashSet = c13268.f44047) != null) {
                    BitSet bitSet = c13269.f44046;
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        if (!bitSet.equals(((C13265) it2.next()).f44046)) {
                            map.remove(c2184);
                            break;
                        }
                    }
                }
            }
        }
        Iterator it3 = map.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            C2184 c2185 = (C2184) entry.getKey();
            C1269 c12610 = (C1269) entry.getValue();
            Iterator it4 = c12610.f5496.iterator();
            while (it4.hasNext()) {
                BitSet bitSet2 = ((C13265[]) ((AbstractC4777) it4.next()).f16794)[c2185.f7921].f44046;
                int iNextClearBit = bitSet2.nextClearBit(0);
                int i2 = c12610.f5497;
                if (iNextClearBit < i2 || bitSet2.nextSetBit(i2) >= 0) {
                    it3.remove();
                    break;
                }
            }
        }
        Iterator it5 = c9116.f31045.iterator();
        while (it5.hasNext()) {
            ((AbstractC4777) it5.next()).f16794 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11631(C9116 c9116) {
        HashMap map = new HashMap();
        ArrayList arrayList = c9116.f31044;
        if (arrayList.size() != 0) {
            C21005.m47168(c9116);
            C21005.m47169(c9116, new C5503(map));
            if (map.size() > 0) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = c9116.f31047;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ArrayList<C15592> arrayList3 = ((C17002) it.next()).f54351;
                        if (arrayList3 != null) {
                            for (C15592 c15592 : arrayList3) {
                                hashSet.add((C2184) c15592.f31402);
                                for (AbstractC7124 abstractC7124 : c15592.f31401.mo19023()) {
                                    hashSet.add((C2184) abstractC7124);
                                }
                            }
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        map.remove((C2184) it2.next());
                    }
                }
            }
        }
        if (map.size() != 0) {
            BitSet bitSet = new BitSet();
            Iterator it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                C1269 c1269 = (C1269) ((Map.Entry) it3.next()).getValue();
                Iterator it4 = c1269.f5498.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        AbstractC4777 abstractC4777 = (AbstractC4777) it4.next();
                        if (abstractC4777.f16795 == EnumC2890.FILL_ARRAY_DATA) {
                            int length = Array.getLength(((C14760) abstractC4777.mo13245()).f48276);
                            int iNextSetBit = bitSet.nextSetBit(0);
                            if (iNextSetBit < 0 || iNextSetBit >= length) {
                                bitSet.set(0, length);
                            }
                        } else {
                            int iIntValue = ((Number) ((C14760) ((C6292) abstractC4777.mo13244()).f61771).f48276).intValue();
                            if (!bitSet.get(iIntValue)) {
                                bitSet.set(iIntValue);
                            }
                        }
                    } else {
                        int iNextClearBit = bitSet.nextClearBit(0);
                        int i = c1269.f5497;
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
                    ((C2184) it5.next()).f7921 = -1;
                }
                if (map.size() < 50) {
                    m11630(c9116, map);
                } else {
                    HashMap map2 = new HashMap();
                    HashMap map3 = new HashMap();
                    ArrayList arrayList4 = new ArrayList(50);
                    Iterator it6 = map.entrySet().iterator();
                    while (it6.hasNext()) {
                        for (int i2 = 0; i2 < 50 && it6.hasNext(); i2++) {
                            Map.Entry entry = (Map.Entry) it6.next();
                            map3.put((C2184) entry.getKey(), (C1269) entry.getValue());
                            it6.remove();
                            arrayList4.add((C2184) entry.getKey());
                        }
                        m11630(c9116, map3);
                        Iterator it7 = arrayList4.iterator();
                        while (it7.hasNext()) {
                            ((C2184) it7.next()).f7921 = -1;
                        }
                        arrayList4.clear();
                        map2.putAll(map3);
                        map3.clear();
                    }
                    map.putAll(map2);
                }
                C21005.m47173(c9116);
                if (map.size() != 0) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Map.Entry entry2 : map.entrySet()) {
                        C2184 c2184 = (C2184) entry2.getKey();
                        C1269 c12610 = (C1269) entry2.getValue();
                        int i3 = c12610.f5497;
                        ArrayList<AbstractC4777> arrayList6 = c12610.f5498;
                        ArrayList arrayList7 = c12610.f5496;
                        AbstractC7124[] abstractC7124Arr = new AbstractC7124[i3];
                        for (AbstractC4777 abstractC4778 : arrayList6) {
                            if (abstractC4778.f16795 == EnumC2890.FILL_ARRAY_DATA) {
                                if (((C2184) abstractC4778.mo13244()) == c2184) {
                                    Object obj = ((C14760) abstractC4778.mo13245()).f48276;
                                    int length2 = Array.getLength(obj);
                                    for (int i4 = 0; i4 < length2; i4++) {
                                        abstractC7124Arr[i4] = new C14760(Array.get(obj, i4));
                                    }
                                }
                            } else {
                                C6292 c6292 = (C6292) abstractC4778.mo13244();
                                if (((C2184) c6292.f61770) == c2184) {
                                    int iIntValue2 = ((Number) ((C14760) c6292.f61771).f48276).intValue();
                                    AbstractC7124 abstractC7124Mo13245 = abstractC4778.mo13245();
                                    EnumC9947 enumC9947 = abstractC7124Mo13245.f23823;
                                    if (enumC9947 != EnumC9947.LOCAL && enumC9947 != EnumC9947.CONSTANT) {
                                        C2184 c2185 = new C2184(-1);
                                        arrayList.add(c2185);
                                        c9116.f31045.m29526(abstractC4778, C2660.m8188(c2185, abstractC7124Mo13245));
                                        abstractC7124Mo13245 = c2185;
                                    }
                                    abstractC7124Arr[iIntValue2] = abstractC7124Mo13245;
                                }
                            }
                        }
                        arrayList.remove(c2184);
                        c9116.f31045.m29522(c12610.f5495);
                        Iterator it8 = arrayList6.iterator();
                        while (it8.hasNext()) {
                            c9116.f31045.m29522((AbstractC4777) it8.next());
                        }
                        C11854 c11854 = new C11854(c2184, c12610, abstractC7124Arr, arrayList5);
                        if (arrayList7.size() == 1) {
                            AbstractC4777 abstractC4779 = (AbstractC4777) arrayList7.get(0);
                            if (c9116.f31045.m29521(abstractC4779)) {
                                C21005.m47175(abstractC4779, c11854, false);
                            } else {
                                int size = arrayList5.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    C21005.m47174((AbstractC7124) arrayList5.get(i5), c11854);
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
