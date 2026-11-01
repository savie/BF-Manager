package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۬۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I4PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C13120 extends AbstractC10872 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19805 f43697 = new C19805();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19805 f43696 = new C19805();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32477(C9116 c9116) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        C19805 c19805 = this.f43696;
        List arrayList2 = (List) c19805.m45009();
        C19805 c19806 = this.f43697;
        Map map = (Map) c19806.m45009();
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        if (map == null) {
            map = new HashMap();
        }
        for (AbstractC4777 first = c9116.f31045.getFirst(); first != null; first = first.m13247()) {
            if (first.f16795 == EnumC2890.ASSIGN) {
                C15592 c15592 = (C15592) first;
                AbstractC7124 abstractC7124 = c15592.f31402;
                EnumC9947 enumC9947 = abstractC7124.f23823;
                EnumC9947 enumC9948 = EnumC9947.LOCAL;
                if (enumC9947 == enumC9948) {
                    AbstractC7124 abstractC7125 = c15592.f31401;
                    EnumC9947 enumC9949 = abstractC7125.f23823;
                    if (enumC9949 == EnumC9947.CONSTANT) {
                        arrayList2.add(c15592);
                        map.put((C2184) c15592.f31402, ((C14760) c15592.f31401).f48276);
                    } else if (enumC9949 == enumC9948) {
                        map.put((C2184) abstractC7124, abstractC7125);
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            arrayList2.clear();
            map.clear();
            c19805.m45011(arrayList2);
            c19806.m45011(map);
            return false;
        }
        C15237.m36505(map);
        HashMap map2 = new HashMap();
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = c9116.f31047;
        if (arrayList3 != null) {
            z = false;
            for (boolean z3 = true; z3; z3 = z2) {
                hashSet.clear();
                Iterator it = arrayList3.iterator();
                z2 = false;
                while (it.hasNext()) {
                    C17002 c17002 = (C17002) it.next();
                    ArrayList arrayList4 = c17002.f54351;
                    if (arrayList4 != null) {
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            C15592 c15593 = (C15592) it2.next();
                            AbstractC7124[] abstractC7124ArrMo19023 = c15593.f31401.mo19023();
                            int length = abstractC7124ArrMo19023.length;
                            ArrayList arrayList5 = arrayList3;
                            Object obj = null;
                            boolean z4 = z;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    map.put((C2184) c15593.f31402, obj);
                                    if (obj instanceof C2184) {
                                        c15593.f31401 = (AbstractC7124) obj;
                                    } else {
                                        c15593.f31401 = new C14760(obj);
                                        arrayList2.add(c15593);
                                    }
                                    it2.remove();
                                    c9116.f31045.m29520(c17002, c15593);
                                    z2 = true;
                                    z = true;
                                    break;
                                }
                                int i2 = length;
                                Object obj2 = map.get(abstractC7124ArrMo19023[i]);
                                if (obj2 != null) {
                                    if (obj == null) {
                                        obj = obj2;
                                    } else if (!obj.equals(obj2)) {
                                    }
                                    i++;
                                    length = i2;
                                }
                                hashSet.addAll(Arrays.asList(c15593.f31401.mo19023()));
                                z = z4;
                                break;
                            }
                            arrayList3 = arrayList5;
                        }
                        arrayList = arrayList3;
                        boolean z5 = z;
                        if (c17002.f54351.size() == 0) {
                            it.remove();
                        }
                        z = z5;
                    } else {
                        arrayList = arrayList3;
                    }
                    arrayList3 = arrayList;
                }
            }
        } else {
            z = false;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C15592 c15594 = (C15592) it3.next();
            if (!hashSet.contains(c15594.f31402)) {
                it3.remove();
                c9116.f31045.m29522(c15594);
                c9116.f31044.remove(c15594.f31402);
                z = true;
            }
            map2.put((C2184) c15594.f31402, c15594.f31401);
        }
        C11834 c11834 = c9116.f31045;
        C1124 c1124 = new C1124(map2);
        for (AbstractC4777 first2 = c11834.getFirst(); first2 != null; first2 = first2.m13247()) {
            C21005.m47175(first2, c1124, false);
        }
        arrayList2.clear();
        map.clear();
        c19805.m45011(arrayList2);
        c19806.m45011(map);
        return z;
    }
}
