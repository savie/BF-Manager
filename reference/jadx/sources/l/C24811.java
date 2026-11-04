package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩻ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A6D3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24811 extends AbstractC16700 {
    /* JADX WARN: Code duplicated, block: B:17:0x005e A[PHI: r3 r4 r5 r6 r8 r9
      0x005e: PHI (r3v5 int) = (r3v4 int), (r3v4 int), (r3v4 int), (r3v4 int), (r3v4 int), (r3v10 int) binds: [B:12:0x0042, B:14:0x004a, B:16:0x005c, B:19:0x0072, B:28:0x009e, B:122:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r4v5 java.util.Iterator) = 
      (r4v4 java.util.Iterator)
      (r4v4 java.util.Iterator)
      (r4v4 java.util.Iterator)
      (r4v4 java.util.Iterator)
      (r4v4 java.util.Iterator)
      (r4v7 java.util.Iterator)
     binds: [B:12:0x0042, B:14:0x004a, B:16:0x005c, B:19:0x0072, B:28:0x009e, B:122:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r5v3 boolean) = (r5v2 boolean), (r5v2 boolean), (r5v2 boolean), (r5v2 boolean), (r5v2 boolean), (r5v5 boolean) binds: [B:12:0x0042, B:14:0x004a, B:16:0x005c, B:19:0x0072, B:28:0x009e, B:122:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r6v4 l.᩷ۡۗ) = (r6v3 l.᩷ۡۗ), (r6v3 l.᩷ۡۗ), (r6v3 l.᩷ۡۗ), (r6v3 l.᩷ۡۗ), (r6v3 l.᩷ۡۗ), (r6v6 l.᩷ۡۗ) binds: [B:12:0x0042, B:14:0x004a, B:16:0x005c, B:19:0x0072, B:28:0x009e, B:122:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r8v2 int) = (r8v1 int), (r8v1 int), (r8v1 int), (r8v1 int), (r8v1 int), (r8v4 int) binds: [B:12:0x0042, B:14:0x004a, B:16:0x005c, B:19:0x0072, B:28:0x009e, B:122:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:12:0x0042, B:14:0x004a, B:16:0x005c, B:19:0x0072, B:28:0x009e, B:122:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        int i;
        Iterator it;
        boolean z;
        C21943 c21943;
        int i2;
        int i3;
        boolean z2;
        int iM52122;
        int iM47981;
        AbstractC16481 abstractC16481Mo17528;
        InterfaceC4043 interfaceC4043M55537;
        Iterator it2;
        if (!C18170.m42340(c2551, EnumC21154.NEW_ARRAY)) {
            return;
        }
        C9804 c9804 = new C9804(null, c2551);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            Iterator it3 = c2551.m8508().iterator();
            boolean z3 = false;
            while (it3.hasNext()) {
                C21943 c21944 = (C21943) it3.next();
                ArrayList arrayList = (ArrayList) c21944.mo1986();
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    C18959 c18959 = (C18959) arrayList.get(i6);
                    if (c18959.getType() != EnumC24203.NEW_ARRAY || c18959.mo17865(EnumC1763.REMOVE)) {
                        i = i5;
                        it = it3;
                        z = z3;
                        c21943 = c21944;
                        i2 = size;
                        i3 = i6;
                        z2 = false;
                    } else {
                        C7794 c7794 = (C7794) c18959;
                        Object objM22394 = C8314.m22394(c2551.mo8527(), c7794.mo44035(i4));
                        if ((objM22394 instanceof C23195) && (iM52122 = (int) ((C23195) objM22394).m52122()) != 0) {
                            AbstractC1566 abstractC1566M21250 = c7794.m21250();
                            AbstractC1566 abstractC1566Mo5557 = abstractC1566M21250.mo5557();
                            int i7 = (abstractC1566M21250.mo5562() == 1 && abstractC1566Mo5557.m5556()) ? iM52122 / 2 : iM52122;
                            C6041 c6041M44027 = c7794.m44027();
                            ArrayList arrayListM41946 = c6041M44027.m17530().m41946();
                            if (arrayListM41946.size() < i7) {
                                i = i5;
                                it = it3;
                                z = z3;
                                c21943 = c21944;
                                i2 = size;
                                i3 = i6;
                                z2 = false;
                            } else {
                                Iterator it4 = arrayListM41946.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        C18959 c18959M39118 = ((C6041) it4.next()).m39118();
                                        if (c18959M39118 != null) {
                                            it = it3;
                                            EnumC24203 type = c18959M39118.getType();
                                            i2 = size;
                                            if (type == EnumC24203.APUT) {
                                                TreeMap treeMap = new TreeMap();
                                                Iterator it5 = arrayListM41946.iterator();
                                                C18959 c189510 = null;
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        C18959 c18959M39119 = ((C6041) it5.next()).m39118();
                                                        if (c18959M39119 != null) {
                                                            it2 = it5;
                                                            i = i5;
                                                            if (c18959M39119.getType() == EnumC24203.APUT && c6041M44027.m17535(c18959M39119.mo44035(0))) {
                                                                Object objM22395 = C8314.m22394(c2551.mo8527(), c18959M39119.mo44035(1));
                                                                if (objM22395 instanceof C23195) {
                                                                    long jM52122 = ((C23195) objM22395).m52122();
                                                                    i3 = i6;
                                                                    if (jM52122 < iM52122) {
                                                                        if (!treeMap.containsKey(Long.valueOf(jM52122))) {
                                                                            treeMap.put(Long.valueOf(jM52122), c18959M39119);
                                                                        }
                                                                    }
                                                                } else {
                                                                    i3 = i6;
                                                                }
                                                                z = z3;
                                                                c21943 = c21944;
                                                                z2 = false;
                                                            }
                                                            i6 = i3;
                                                            it5 = it2;
                                                            i5 = i;
                                                        } else {
                                                            i = i5;
                                                            it2 = it5;
                                                        }
                                                        i3 = i6;
                                                        if (c189510 == null) {
                                                            c189510 = c18959M39119;
                                                        }
                                                        i6 = i3;
                                                        it5 = it2;
                                                        i5 = i;
                                                    } else {
                                                        i = i5;
                                                        i3 = i6;
                                                    }
                                                    if (treeMap.size() >= i7) {
                                                        ArrayList arrayList2 = new ArrayList(treeMap.values());
                                                        if (arrayList.size() >= arrayList2.size()) {
                                                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                                                            setNewSetFromMap.addAll(arrayList);
                                                            if (setNewSetFromMap.containsAll(arrayList2)) {
                                                                Iterator it6 = arrayList2.iterator();
                                                                while (true) {
                                                                    int i8 = 2;
                                                                    if (it6.hasNext()) {
                                                                        AbstractC16481 abstractC16481Mo44035 = ((C18959) it6.next()).mo44035(2);
                                                                        abstractC16481Mo44035.getClass();
                                                                        if (C8314.m22410(abstractC16481Mo44035, c6041M44027)) {
                                                                        }
                                                                    } else {
                                                                        C24949 c24949 = new C24949(iM52122, abstractC1566Mo5557);
                                                                        c24949.m44031(c6041M44027.mo17528());
                                                                        c24949.m39414((AbstractC16678) c7794);
                                                                        c24949.m16975((AbstractC5820) c7794);
                                                                        c24949.m44021(c7794);
                                                                        c24949.m44024(c7794.getOffset());
                                                                        Iterator it7 = treeMap.entrySet().iterator();
                                                                        long j = -1;
                                                                        while (true) {
                                                                            z = z3;
                                                                            c21943 = c21944;
                                                                            if (!it7.hasNext()) {
                                                                                break;
                                                                            }
                                                                            Map.Entry entry = (Map.Entry) it7.next();
                                                                            long jLongValue = ((Long) entry.getKey()).longValue();
                                                                            if (jLongValue != j) {
                                                                                while (true) {
                                                                                    j++;
                                                                                    if (j >= jLongValue) {
                                                                                        break;
                                                                                    } else {
                                                                                        c24949.mo44014((AbstractC16481) C23195.m52120(0L, abstractC1566Mo5557));
                                                                                    }
                                                                                }
                                                                            }
                                                                            C18959 c189511 = (C18959) entry.getValue();
                                                                            AbstractC16481 abstractC16481Mo44036 = c189511.mo44035(i8);
                                                                            abstractC16481Mo44036.getClass();
                                                                            if (!(abstractC16481Mo44036 instanceof C23195) || (interfaceC4043M55537 = c2551.m8536().m55537((C23195) abstractC16481Mo44036)) == null) {
                                                                                abstractC16481Mo17528 = abstractC16481Mo44036.mo17528();
                                                                            } else {
                                                                                abstractC16481Mo17528 = AbstractC16481.m39112(new C3319(EnumC24203.SGET, interfaceC4043M55537.mo13008(), 0));
                                                                                C18345.m42796(interfaceC4043M55537, c2551);
                                                                            }
                                                                            c24949.mo44014(abstractC16481Mo17528);
                                                                            c9804.m25544(c189511);
                                                                            i8 = 2;
                                                                            c21944 = c21943;
                                                                            z3 = z;
                                                                            j = jLongValue;
                                                                            it7 = it7;
                                                                        }
                                                                        while (true) {
                                                                            j++;
                                                                            if (j >= iM52122) {
                                                                                break;
                                                                            } else {
                                                                                c24949.mo44014((AbstractC16481) C23195.m52120(0L, abstractC1566Mo5557));
                                                                            }
                                                                        }
                                                                        c9804.m25544(c7794);
                                                                        int iM47982 = C20993.m47981(arrayList, (C18959) treeMap.get(treeMap.lastKey()));
                                                                        if (c189510 != null && (iM47981 = C20993.m47981(arrayList, c189510)) != -1) {
                                                                            iM47982 = Math.min(iM47981, iM47982);
                                                                        }
                                                                        arrayList.add(iM47982, c24949);
                                                                        z2 = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z = z3;
                                                    c21943 = c21944;
                                                    z2 = false;
                                                }
                                            }
                                        } else {
                                            it = it3;
                                            i2 = size;
                                        }
                                        i6 = i6;
                                        size = i2;
                                        it3 = it;
                                        c21944 = c21944;
                                        i5 = i5;
                                        z3 = z3;
                                    } else {
                                        i = i5;
                                        it = it3;
                                        z = z3;
                                        c21943 = c21944;
                                        i2 = size;
                                        i3 = i6;
                                        z2 = false;
                                    }
                                }
                            }
                        } else {
                            i = i5;
                            it = it3;
                            z = z3;
                            c21943 = c21944;
                            i2 = size;
                            i3 = i6;
                            z2 = false;
                        }
                    }
                    z3 = z | z2;
                    i6 = i3 + 1;
                    i4 = 0;
                    size = i2;
                    it3 = it;
                    c21944 = c21943;
                    i5 = i;
                }
                c9804.m25545(c21944);
                i4 = 0;
            }
            int i9 = i5;
            if (!z3) {
                return;
            }
            C7347.m20164(c2551);
            i5 = i9 + 1;
            if (i9 > 100) {
                c2551.m31138("Reached limit for ReplaceNewArray iterations");
                return;
            }
            i4 = 0;
        }
    }
}
