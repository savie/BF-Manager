package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X65X */
/* JADX INFO: loaded from: classes5.dex */
public final class C19890 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45788(C13791 c13791) {
        HashSet hashSet = new HashSet();
        ArrayList<C13397> arrayList = c13791.f43748;
        if (arrayList != null) {
            for (C13397 c13397 : arrayList) {
                hashSet.add(c13397.f42695);
                hashSet.add(c13397.f42694);
                for (C11817 c11817 : c13397.f42696) {
                    hashSet.add(c11817);
                }
            }
        }
        ArrayList arrayList2 = c13791.f43752;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((C22348) it.next()).getClass();
                hashSet.add(null);
                hashSet.add(null);
            }
        }
        for (AbstractC12563 first = c13791.f43750.getFirst(); first != null; first = first.m31273()) {
            if (first instanceof InterfaceC2123) {
                hashSet.add(((InterfaceC2123) first).mo7315());
            } else if (first instanceof AbstractC15546) {
                AbstractC15546 abstractC15546 = (AbstractC15546) first;
                hashSet.add(abstractC15546.f50567);
                for (C11817 c11818 : abstractC15546.f50568) {
                    hashSet.add(c11818);
                }
            }
        }
        ArrayList arrayList3 = c13791.f43754;
        if (arrayList3 != null) {
            hashSet.addAll(arrayList3);
        }
        C24498 c24498 = c13791.f43750;
        AbstractC12563 first2 = c24498.getFirst();
        while (first2 != null) {
            if (first2.f40344 == EnumC20768.LABEL && ((C11817) first2).f38145 < 0 && !hashSet.contains(first2)) {
                AbstractC12563 abstractC12563M31273 = first2.m31273();
                c24498.m54761(first2);
                first2 = abstractC12563M31273;
            } else {
                first2 = first2.m31273();
            }
        }
    }
}
