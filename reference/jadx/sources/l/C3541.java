package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: EIS7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3541 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17711 m11566(C7972 c7972, C24272 c24272, ArrayList arrayList) throws C10186 {
        int i;
        int i2;
        int i3;
        ArrayList arrayList2;
        InterfaceC7206 interfaceC7206;
        ArrayList arrayList3;
        BitSet bitSet;
        BitSet bitSet2;
        C24272 c24273 = c24272;
        ArrayList arrayList4 = c24273.f78581;
        if (arrayList4.isEmpty() || arrayList4.size() > 200) {
            throw C10186.m26298(null, "INVALID_ARGUMENT", "deletes must contain between 1 and 200 targets.", "warning");
        }
        InterfaceC7206 interfaceC7206M27783 = c7972.m21757().m27783();
        ArrayList arrayList5 = new ArrayList();
        HashMap map = new HashMap();
        int i4 = 0;
        while (i4 < arrayList4.size()) {
            C6372 c6372 = (C6372) arrayList4.get(i4);
            try {
                String str = c6372.f21518;
                String str2 = c6372.f21520;
                boolean zEquals = "type_variant".equals(str);
                boolean zEquals2 = "resource".equals(c6372.f21518);
                if (zEquals) {
                    i2 = 65535;
                    try {
                        i3 = (c6372.f21522 << 16) | (c6372.f21521 << 24);
                    } catch (C10186 e) {
                        e = e;
                    }
                } else {
                    i2 = 65535;
                    i3 = (int) Long.parseLong(c6372.f21519.substring(2), 16);
                }
                int i5 = i3 >>> 24;
                int i6 = (i3 >>> 16) & 255;
                Iterator it = interfaceC7206M27783.mo15672().iterator();
                InterfaceC15344 interfaceC15344 = null;
                while (true) {
                    arrayList2 = arrayList4;
                    interfaceC7206 = interfaceC7206M27783;
                    if (it.hasNext()) {
                        InterfaceC10869 interfaceC10869 = (InterfaceC10869) it.next();
                        Iterator it2 = it;
                        if (interfaceC10869.mo27607() == i5) {
                            for (InterfaceC15344 interfaceC15345 : interfaceC10869.mo19822()) {
                                int i7 = i5;
                                if (interfaceC15345.mo35833() == i6) {
                                    if (interfaceC15344 != null) {
                                        throw C10186.m26298(null, "RESOURCE_TARGET_AMBIGUOUS", "The resource deletion target does not have a unique identity.", "warning");
                                    }
                                    interfaceC15344 = interfaceC15345;
                                }
                                i5 = i7;
                            }
                        }
                        arrayList4 = arrayList2;
                        interfaceC7206M27783 = interfaceC7206;
                        it = it2;
                        i5 = i5;
                    }
                    c24273 = c24272;
                    i4 = i;
                    C15561.m37286(e, c24273, i4);
                    throw e;
                }
                String str3 = zEquals ? "RESOURCE_TYPE_VARIANT_NOT_FOUND" : zEquals2 ? "RESOURCE_NOT_FOUND" : "RESOURCE_VARIANT_NOT_FOUND";
                if (interfaceC15344 == null) {
                    throw C10186.m26298(null, str3, "Resource deletion target does not exist.", "warning");
                }
                if (i4 == 0 && zEquals) {
                    try {
                        C10801.m27508(interfaceC15344.getTypeName(), str2);
                    } catch (C10186 e2) {
                        e = e2;
                        c24273 = c24272;
                    }
                }
                int i8 = (-65536) & i3;
                C23679 c23679 = (C23679) map.get(Integer.valueOf(i8));
                if (c23679 == null) {
                    Integer numValueOf = Integer.valueOf(i8);
                    C23679 c236710 = new C23679(interfaceC15344);
                    map.put(numValueOf, c236710);
                    c23679 = c236710;
                }
                BitSet bitSet3 = c23679.f76782;
                HashMap map2 = map;
                HashSet hashSet = c23679.f76784;
                HashMap map3 = c23679.f76785;
                String str4 = str3;
                C16219 c16219 = new C16219(interfaceC15344, i3, zEquals);
                ArrayList arrayList6 = c16219.f52703;
                i = i4;
                try {
                    HashMap map4 = new HashMap();
                    ArrayList arrayList7 = arrayList5;
                    String str5 = null;
                    for (InterfaceC2731 interfaceC2731 : interfaceC15344.mo33925()) {
                        C16219 c162110 = c16219;
                        ArrayList arrayList8 = arrayList6;
                        String strM26337 = C10208.m26337(interfaceC2731);
                        Integer num = (Integer) map4.get(strM26337);
                        BitSet bitSet4 = bitSet3;
                        map4.put(strM26337, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                        if (!zEquals) {
                            int i9 = i3 & i2;
                            if (interfaceC2731.mo9075(i9)) {
                                String strMo9070 = interfaceC2731.mo9070(i9);
                                if (str5 != null && !str5.equals(strMo9070)) {
                                    throw C10186.m26298(null, "RESOURCE_TARGET_AMBIGUOUS", "The resource deletion target does not have a unique identity.", "warning");
                                }
                                str5 = strMo9070;
                            } else {
                                continue;
                            }
                        }
                        arrayList6 = arrayList8;
                        c16219 = c162110;
                        bitSet3 = bitSet4;
                    }
                    C16219 c162111 = c16219;
                    ArrayList arrayList9 = arrayList6;
                    BitSet bitSet5 = bitSet3;
                    Iterator it3 = interfaceC15344.mo33925().iterator();
                    while (it3.hasNext()) {
                        InterfaceC2731 interfaceC2732 = (InterfaceC2731) it3.next();
                        String strM26338 = C10208.m26337(interfaceC2732);
                        if (zEquals2 || strM26338.equals(str2)) {
                            if (zEquals || interfaceC2732.mo9075(i3 & i2)) {
                                if (((Integer) map4.get(strM26338)).intValue() != 1) {
                                    throw C10186.m26298(null, "RESOURCE_TARGET_AMBIGUOUS", "The resource deletion target does not have a unique identity.", "warning");
                                }
                                BitSet bitSet6 = (BitSet) map3.get(strM26338);
                                if (bitSet6 == null) {
                                    bitSet6 = new BitSet();
                                    map3.put(strM26338, bitSet6);
                                }
                                HashMap map5 = map3;
                                if (!zEquals) {
                                    arrayList3 = arrayList9;
                                    bitSet = bitSet5;
                                    int i10 = i3 & i2;
                                    if (bitSet6.get(i10) || hashSet.contains(strM26338)) {
                                        throw C10186.m26298(null, "RESOURCE_DELETE_OVERLAP", "Deletion targets overlap; submit each resource value or type variant once.", "warning");
                                    }
                                    bitSet6.set(i10);
                                    bitSet.set(i10);
                                    arrayList3.add(interfaceC2732);
                                } else {
                                    if (!hashSet.add(strM26338) || !bitSet6.isEmpty()) {
                                        throw C10186.m26298(null, "RESOURCE_DELETE_OVERLAP", "Deletion targets overlap; submit each resource value or type variant once.", "warning");
                                    }
                                    int i11 = 0;
                                    while (i11 <= interfaceC2732.mo9069()) {
                                        if (interfaceC2732.mo9075(i11)) {
                                            bitSet6.set(i11);
                                            bitSet2 = bitSet5;
                                            bitSet2.set(i11);
                                        } else {
                                            bitSet2 = bitSet5;
                                        }
                                        i11++;
                                        bitSet5 = bitSet2;
                                    }
                                    ArrayList arrayList10 = arrayList9;
                                    arrayList10.add(interfaceC2732);
                                    bitSet = bitSet5;
                                    arrayList3 = arrayList10;
                                }
                                map3 = map5;
                                zEquals = zEquals;
                                bitSet5 = bitSet;
                                it3 = it3;
                                arrayList9 = arrayList3;
                                map4 = map4;
                            }
                        }
                    }
                    if (arrayList9.isEmpty()) {
                        throw C10186.m26298(null, str4, "Resource deletion target does not exist.", "warning");
                    }
                    arrayList7.add(c162111);
                    i4 = i + 1;
                    map = map2;
                    c24273 = c24272;
                    arrayList5 = arrayList7;
                    arrayList4 = arrayList2;
                    interfaceC7206M27783 = interfaceC7206;
                } catch (C10186 e3) {
                    e = e3;
                }
            } catch (C10186 e4) {
                e = e4;
                i = i4;
            }
        }
        ArrayList<C16219> arrayList11 = arrayList5;
        HashMap map6 = map;
        C17711 c17711 = new C17711();
        for (C23679 c236711 : map6.values()) {
            int i12 = c17711.f58198;
            HashSet hashSet2 = c236711.f76784;
            BitSet bitSet7 = c236711.f76782;
            HashMap map7 = c236711.f76785;
            c17711.f58198 = hashSet2.size() + i12;
            Iterator it4 = map7.values().iterator();
            while (it4.hasNext()) {
                c17711.f58196 = ((BitSet) it4.next()).cardinality() + c17711.f58196;
            }
            int i13 = 0;
            while (true) {
                int iNextSetBit = bitSet7.nextSetBit(i13);
                if (iNextSetBit >= 0) {
                    Iterator it5 = c236711.f76783.mo33925().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            c17711.f58195++;
                            break;
                        }
                        InterfaceC2731 interfaceC2733 = (InterfaceC2731) it5.next();
                        BitSet bitSet8 = (BitSet) map7.get(C10208.m26337(interfaceC2733));
                        if (interfaceC2733.mo9075(iNextSetBit) && (bitSet8 == null || !bitSet8.get(iNextSetBit))) {
                            break;
                        }
                    }
                    i13 = iNextSetBit + 1;
                }
            }
        }
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            C1260 c1260 = (C1260) it6.next();
            int i14 = c1260.f4547;
            String str6 = c1260.f4549;
            HashMap map8 = map6;
            C23679 c236712 = (C23679) map8.get(Integer.valueOf(i14 & (-65536)));
            if (c236712 != null) {
                BitSet bitSet9 = (BitSet) c236712.f76785.get(str6);
                if (c236712.f76784.contains(str6) || (!c1260.m4580() && bitSet9 != null && bitSet9.get(c1260.f4547 & 65535))) {
                    c17711.f58197.add(c1260.f4542);
                }
            }
            map6 = map8;
        }
        for (C16219 c162112 : arrayList11) {
            ArrayList<InterfaceC2731> arrayList12 = c162112.f52703;
            InterfaceC15344 interfaceC15346 = c162112.f52706;
            int i15 = c162112.f52705;
            for (InterfaceC2731 interfaceC2734 : arrayList12) {
                String strM26339 = C10208.m26337(interfaceC2734);
                c17711.f58199.add(c162112.f52704 ? C1260.m4567(strM26339, i15, interfaceC15346.mo4328(), interfaceC15346.getTypeName()) : C1260.m4568(strM26339, i15, interfaceC15346.getTypeName(), interfaceC2734.mo9070(i15 & 65535)));
            }
        }
        return c17711;
    }
}
