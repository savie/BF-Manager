package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۢᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V6HT */
/* JADX INFO: loaded from: classes4.dex */
public final class C10329 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f32932 = C16980.m40037(C10329.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26599(C1381 c1381, ArrayList arrayList) {
        InterfaceC18213 interfaceC18213 = c1381.f4929;
        InterfaceC23435 interfaceC23435 = c1381.f4928;
        HashSet hashSet = new HashSet(arrayList);
        boolean z = false;
        for (InterfaceC6281 interfaceC6281 : interfaceC18213.mo19035()) {
            if (!z && interfaceC6281 == interfaceC23435) {
                z = true;
            }
            if (z) {
                C1170.removeIf(hashSet, new C23941(2, interfaceC6281));
                if (hashSet.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.m8524() || c2551.m8490().isEmpty()) {
            return;
        }
        C24590.m54904(c2551, new C8093(1));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C17973 c17973 : c2551.m8490()) {
            if (!c17973.m41945().m28512()) {
                ((List) C11392.computeIfAbsent(linkedHashMap, c17973.m41945(), new C14062(3))).add(c17973);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C11260 c11260 = (C11260) entry.getKey();
            List list = (List) entry.getValue();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c11260.m28510(((C17973) it.next()).m41945());
            }
            if (list.size() > 1) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((C17973) it2.next()).m41934(c11260);
                }
            }
            c11260.m28507(list);
        }
        ArrayList<C11260> arrayList = new ArrayList(linkedHashMap.keySet());
        if (arrayList.isEmpty()) {
            return;
        }
        int i = 0;
        for (C11260 c11261 : arrayList) {
            AbstractC1566 abstractC1566M28517 = c11261.m28517();
            if (abstractC1566M28517 == null) {
                c11261.m28508(AbstractC1566.f5420);
                i++;
            } else {
                C4937.forEach(c11261.m28519(), new C20473(1, c2551, abstractC1566M28517));
            }
        }
        if (i != 0) {
            c2551.m31136("Unknown variable types count: " + i);
        }
        C0635 c0635 = new C0635();
        C24590.m54904(c2551, c0635);
        LinkedHashMap linkedHashMapM2801 = c0635.m2801();
        if (linkedHashMapM2801.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(arrayList.size());
        for (C11260 c11262 : arrayList) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = c11262.m28519().iterator();
            while (it3.hasNext()) {
                C9583 c9583 = (C9583) linkedHashMapM2801.get((C17973) it3.next());
                if (c9583 != null) {
                    arrayList2.add(c9583);
                }
            }
            linkedHashMap2.put(c11262, C4123.m13230(arrayList2));
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            C11260 c11263 = (C11260) entry2.getKey();
            List<C9583> list2 = (List) entry2.getValue();
            if (!c11263.m28516()) {
                C9583 c9584 = new C9583(null);
                for (C9583 c9585 : list2) {
                    c9584.m25023().addAll(c9585.m25023());
                    c9584.m25025().addAll(c9585.m25025());
                }
                if (!c9584.m25023().isEmpty() || !c9584.m25025().isEmpty()) {
                    if (!c9584.m25023().isEmpty()) {
                        Iterator it4 = list2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                C9583 c9586 = (C9583) it4.next();
                                Iterator it5 = c9586.m25023().iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        C1381 c1381 = (C1381) it5.next();
                                        InterfaceC18213 interfaceC18213 = c1381.f4929;
                                        if (interfaceC18213 instanceof C6831) {
                                            Iterator it6 = c9584.m25023().iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    if (!C20531.m47071((InterfaceC6281) interfaceC18213, ((C1381) it6.next()).f4929)) {
                                                    }
                                                }
                                            }
                                        }
                                        if (!interfaceC18213.mo17865(EnumC1763.ELSE_IF_CHAIN) && m26599(c1381, c9584.m25023()) && m26599(c1381, c9584.m25025())) {
                                            C17973 c17973M25024 = c9586.m25024();
                                            C6041 c6041M41930 = c17973M25024.m41930();
                                            C18959 c18959M39118 = c6041M41930.m39118();
                                            if (c18959M39118 != null && !c18959M39118.mo17865(EnumC1763.WRAPPED) && c18959M39118.getType() != EnumC24203.PHI && c6041M41930.equals(c18959M39118.m44027())) {
                                                c18959M39118.mo17866(EnumC1763.DECLARE_VAR);
                                                c17973M25024.m41945().m28504();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C12050 c12050M8515 = c2551.m8515();
                    if (c11263.m28516()) {
                        f32932.mo13728(c11263, "Try to declare already declared variable: {}");
                    } else {
                        C0271 c0271 = (C0271) c12050M8515.mo17862((InterfaceC2157) C11457.f36026);
                        if (c0271 == null) {
                            c0271 = new C0271();
                            c12050M8515.mo17864(c0271);
                        }
                        c0271.m1793(c11263);
                        c11263.m28504();
                    }
                }
            }
        }
    }
}
