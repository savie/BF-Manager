package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۢۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9301 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m23875(ArrayList arrayList, EnumC8678 enumC8678) {
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C1538((CharSequence) it.next(), enumC8678));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13409 m23876(ArrayList arrayList, ArrayList arrayList2, EnumC8678 enumC8678, C16936 c16936) {
        c16936.m39631();
        List listM23875 = m23875(arrayList, enumC8678);
        List listM23876 = m23875(arrayList2, enumC8678);
        c16936.m39631();
        EnumC8678 enumC8679 = EnumC8678.IGNORE_WHITESPACES;
        if (enumC8678 != enumC8679) {
            InterfaceC13409 interfaceC13409M42950 = new C21377(listM23875, listM23876, m23877(m23874(listM23875, enumC8679), m23874(listM23876, enumC8679), c16936)).m42950();
            C22581 c22581 = new C22581(listM23875, listM23876);
            new C10712(interfaceC13409M42950, listM23875, listM23876, c22581).m26945();
            return C1413.m4944(c22581.m8577());
        }
        InterfaceC13409 interfaceC13409M42951 = new C21377(listM23875, listM23876, m23877(listM23875, listM23876, c16936)).m42950();
        ArrayList arrayList3 = new ArrayList();
        Iterator itMo11890 = interfaceC13409M42951.mo11886().f31762.mo11890();
        while (itMo11890.hasNext()) {
            C20464 c20464 = (C20464) itMo11890.next();
            C20464 c20464M30310 = C12206.m30310(listM23875, listM23876, c20464.f66401, c20464.f66399, c20464.f66400, c20464.f66402);
            if (!c20464M30310.m46276()) {
                arrayList3.add(c20464M30310);
            }
        }
        return C1413.m4944(C1413.m4941(arrayList3, listM23875.size(), listM23876.size()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13409 m23877(List list, List list2, C16936 c16936) {
        C17641 c17641M23878 = m23878(list);
        C17641 c17641M23879 = m23878(list2);
        return new C22789((C15070) c17641M23878.f56077, (C15070) c17641M23879.f56077, list, list2, C1413.m4943((List) c17641M23878.f56076, (List) c17641M23879.f56076, c16936), c16936).m36014();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17641 m23878(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        C15070 c15070 = new C15070(list.size());
        for (int i = 0; i < list.size(); i++) {
            C1538 c1538 = (C1538) list.get(i);
            if (c1538.m5313() > 3) {
                arrayList.add(c1538);
                c15070.add(i);
            }
        }
        return new C17641(arrayList, c15070);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m23874(List list, EnumC8678 enumC8678) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1538 c1538 = (C1538) it.next();
            if (c1538.f6255 != enumC8678) {
                c1538 = new C1538(c1538.m5312(), enumC8678);
            }
            arrayList.add(c1538);
        }
        return arrayList;
    }
}
