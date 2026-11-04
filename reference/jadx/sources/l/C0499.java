package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֡ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C0499 extends AbstractC8909 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20528 f2174;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20528 f2175;

    public C0499() {
        super(2);
        this.f2174 = new C20528();
        this.f2175 = new C20528();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2459(C13791 c13791) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        C20528 c20528 = this.f2175;
        List arrayList2 = (List) c20528.m47061();
        C20528 c20529 = this.f2174;
        Map map = (Map) c20529.m47061();
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        if (map == null) {
            map = new HashMap();
        }
        for (AbstractC12563 first = c13791.f43750.getFirst(); first != null; first = first.m31273()) {
            if (first.f40344 == EnumC20768.ASSIGN) {
                C20022 c20022 = (C20022) first;
                AbstractC11071 abstractC11071 = c20022.f12388;
                EnumC22260 enumC22260 = abstractC11071.f34921;
                EnumC22260 enumC22261 = EnumC22260.LOCAL;
                if (enumC22260 == enumC22261) {
                    AbstractC11071 abstractC11072 = c20022.f12387;
                    EnumC22260 enumC22262 = abstractC11072.f34921;
                    if (enumC22262 == EnumC22260.CONSTANT) {
                        arrayList2.add(c20022);
                        map.put((C4448) c20022.f12388, ((C16380) c20022.f12387).f53172);
                    } else if (enumC22262 == enumC22261) {
                        map.put((C4448) abstractC11071, abstractC11072);
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            arrayList2.clear();
            map.clear();
            c20528.m47060(arrayList2);
            c20529.m47060(map);
            return false;
        }
        C1245.m4498(map);
        HashMap map2 = new HashMap();
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = c13791.f43754;
        if (arrayList3 != null) {
            z = false;
            for (boolean z3 = true; z3; z3 = z2) {
                hashSet.clear();
                Iterator it = arrayList3.iterator();
                z2 = false;
                while (it.hasNext()) {
                    C11817 c11817 = (C11817) it.next();
                    ArrayList arrayList4 = c11817.f38143;
                    if (arrayList4 != null) {
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            C20022 c20023 = (C20022) it2.next();
                            AbstractC11071[] abstractC11071ArrMo15448 = c20023.f12387.mo15448();
                            int length = abstractC11071ArrMo15448.length;
                            ArrayList arrayList5 = arrayList3;
                            Object obj = null;
                            boolean z4 = z;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    map.put((C4448) c20023.f12388, obj);
                                    if (obj instanceof C4448) {
                                        c20023.f12387 = (AbstractC11071) obj;
                                    } else {
                                        c20023.f12387 = new C16380(obj);
                                        arrayList2.add(c20023);
                                    }
                                    it2.remove();
                                    c13791.f43750.m54759(c11817, c20023);
                                    z2 = true;
                                    z = true;
                                    break;
                                }
                                int i2 = length;
                                Object obj2 = map.get(abstractC11071ArrMo15448[i]);
                                if (obj2 != null) {
                                    if (obj == null) {
                                        obj = obj2;
                                    } else if (!obj.equals(obj2)) {
                                    }
                                    i++;
                                    length = i2;
                                }
                                hashSet.addAll(Arrays.asList(c20023.f12387.mo15448()));
                                z = z4;
                                break;
                            }
                            arrayList3 = arrayList5;
                        }
                        arrayList = arrayList3;
                        boolean z5 = z;
                        if (c11817.f38143.size() == 0) {
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
            C20022 c20024 = (C20022) it3.next();
            if (!hashSet.contains(c20024.f12388)) {
                it3.remove();
                c13791.f43750.m54761(c20024);
                c13791.f43751.remove(c20024.f12388);
                z = true;
            }
            map2.put((C4448) c20024.f12388, c20024.f12387);
        }
        C24498 c24498 = c13791.f43750;
        C18398 c18398 = new C18398(map2);
        for (AbstractC12563 first2 = c24498.getFirst(); first2 != null; first2 = first2.m31273()) {
            C22874.m51602(first2, c18398, false);
        }
        arrayList2.clear();
        map.clear();
        c20528.m47060(arrayList2);
        c20529.m47060(map);
        return z;
    }
}
