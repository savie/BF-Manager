package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X65X */
/* JADX INFO: loaded from: classes4.dex */
public final class C16067 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38070(C9116 c9116) {
        HashSet hashSet = new HashSet();
        ArrayList<C16876> arrayList = c9116.f31040;
        if (arrayList != null) {
            for (C16876 c16876 : arrayList) {
                hashSet.add(c16876.f53976);
                hashSet.add(c16876.f53975);
                for (C17002 c17002 : c16876.f53977) {
                    hashSet.add(c17002);
                }
            }
        }
        ArrayList arrayList2 = c9116.f31043;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((C7704) it.next()).getClass();
                hashSet.add(null);
                hashSet.add(null);
            }
        }
        for (AbstractC4777 first = c9116.f31045.getFirst(); first != null; first = first.m13247()) {
            if (first instanceof InterfaceC12064) {
                hashSet.add(((InterfaceC12064) first).mo986());
            } else if (first instanceof AbstractC19825) {
                AbstractC19825 abstractC19825 = (AbstractC19825) first;
                hashSet.add(abstractC19825.f63629);
                for (C17002 c17003 : abstractC19825.f63630) {
                    hashSet.add(c17003);
                }
            }
        }
        ArrayList arrayList3 = c9116.f31047;
        if (arrayList3 != null) {
            hashSet.addAll(arrayList3);
        }
        C11834 c11834 = c9116.f31045;
        AbstractC4777 first2 = c11834.getFirst();
        while (first2 != null) {
            if (first2.f16795 == EnumC2890.LABEL && ((C17002) first2).f54353 < 0 && !hashSet.contains(first2)) {
                AbstractC4777 abstractC4777M13247 = first2.m13247();
                c11834.m29522(first2);
                first2 = abstractC4777M13247;
            } else {
                first2 = first2.m13247();
            }
        }
    }
}
