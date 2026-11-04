package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C64A */
/* JADX INFO: loaded from: classes4.dex */
public final class C15414 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36893(C13791 c13791) {
        C22874.m51595(c13791);
        ArrayList arrayList = c13791.f43751;
        C22874.m51596(c13791, (InterfaceC7343) null);
        ArrayList arrayList2 = c13791.f43748;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C13397 c13397 = (C13397) it.next();
                AbstractC12563 abstractC12563M31273 = c13397.f42695;
                while (true) {
                    if (abstractC12563M31273 != c13397.f42694) {
                        if (!abstractC12563M31273.f40348 || !C22874.m51599(abstractC12563M31273)) {
                            abstractC12563M31273 = abstractC12563M31273.m31273();
                        } else {
                            boolean z = true;
                            boolean z2 = true;
                            for (C11817 c11817 : c13397.f42696) {
                                if (c11817.f40348) {
                                    z = false;
                                } else {
                                    z2 = false;
                                }
                            }
                            if (z) {
                                it.remove();
                                break;
                            }
                            c13397.f42695.f40348 = true;
                            c13397.f42694.f40348 = true;
                            if (!z2) {
                                ArrayList arrayList3 = new ArrayList(c13397.f42696.length);
                                ArrayList arrayList4 = new ArrayList(c13397.f42696.length);
                                int i = 0;
                                while (true) {
                                    C11817[] c11817Arr = c13397.f42696;
                                    if (i >= c11817Arr.length) {
                                        break;
                                    }
                                    arrayList4.add(c11817Arr[i]);
                                    arrayList3.add(c13397.f42697[i]);
                                    i++;
                                }
                                c13397.f42696 = (C11817[]) arrayList4.toArray(new C11817[arrayList4.size()]);
                                c13397.f42697 = (String[]) arrayList3.toArray(new String[arrayList3.size()]);
                                break;
                            }
                            break;
                        }
                    } else {
                        it.remove();
                        break;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = c13791.f43750.iterator();
        while (it2.hasNext()) {
            AbstractC12563 abstractC12563 = (AbstractC12563) it2.next();
            if (!abstractC12563.f40348) {
                it2.remove();
            } else {
                EnumC20768 enumC20768 = abstractC12563.f40344;
                if (enumC20768 == EnumC20768.ASSIGN || enumC20768 == EnumC20768.IDENTITY) {
                    if (abstractC12563.mo11730().f34921 == EnumC22260.LOCAL) {
                        hashSet.add((C4448) abstractC12563.mo11730());
                    }
                }
            }
        }
        ArrayList arrayList5 = c13791.f43754;
        if (arrayList5 != null) {
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                C11817 c11818 = (C11817) it3.next();
                if (!c11818.f40348) {
                    it3.remove();
                } else {
                    ArrayList arrayList6 = c11818.f38143;
                    if (arrayList6 != null) {
                        Iterator it4 = arrayList6.iterator();
                        while (it4.hasNext()) {
                            hashSet.add((C4448) ((C20022) it4.next()).f12388);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        arrayList.addAll(hashSet);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList7 = c13791.f43754;
        if (arrayList7 != null) {
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                ArrayList arrayList8 = ((C11817) it5.next()).f38143;
                if (arrayList8 != null) {
                    Iterator it6 = arrayList8.iterator();
                    while (it6.hasNext()) {
                        C18618 c18618 = (C18618) ((C20022) it6.next()).f12387;
                        for (AbstractC11071 abstractC11071 : c18618.f17809) {
                            if (!hashSet.contains(abstractC11071)) {
                                for (AbstractC11071 abstractC11072 : c18618.f17809) {
                                    if (hashSet.contains(abstractC11072)) {
                                        hashSet2.add(abstractC11072);
                                    }
                                }
                                c18618.f17809 = (AbstractC11071[]) hashSet2.toArray(new AbstractC11071[hashSet2.size()]);
                                hashSet2.clear();
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
