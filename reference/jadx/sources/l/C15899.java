package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15899 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m37875(ArrayList arrayList, EnumC6950 enumC6950) {
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C17391((CharSequence) it.next(), enumC6950));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21646 m37877(ArrayList arrayList, ArrayList arrayList2, EnumC6950 enumC6950, C15087 c15087) {
        c15087.m36345();
        List listM37875 = m37875(arrayList, enumC6950);
        List listM37876 = m37875(arrayList2, enumC6950);
        c15087.m36345();
        EnumC6950 enumC6951 = EnumC6950.IGNORE_WHITESPACES;
        if (enumC6950 != enumC6951) {
            InterfaceC21646 interfaceC21646M24309 = new C9932(listM37875, listM37876, m37878(m37874(listM37875, enumC6951), m37874(listM37876, enumC6951), c15087)).m24309();
            C4492 c4492 = new C4492(listM37875, listM37876);
            new C11424(interfaceC21646M24309, listM37875, listM37876, c4492).m28779();
            return C14932.m35915(c4492.m18810());
        }
        InterfaceC21646 interfaceC21646M243010 = new C9932(listM37875, listM37876, m37878(listM37875, listM37876, c15087)).m24309();
        ArrayList arrayList3 = new ArrayList();
        Iterator itMo3129 = interfaceC21646M243010.mo3127().f53297.mo3129();
        while (itMo3129.hasNext()) {
            C22547 c22547 = (C22547) itMo3129.next();
            C22547 c22547M33070 = C13441.m33070(listM37875, listM37876, c22547.f72892, c22547.f72894, c22547.f72891, c22547.f72893);
            if (!c22547M33070.m50782()) {
                arrayList3.add(c22547M33070);
            }
        }
        return C14932.m35915(C14932.m35912(arrayList3, listM37875.size(), listM37876.size()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21646 m37878(List list, List list2, C15087 c15087) {
        C5393 c5393M37876 = m37876(list);
        C5393 c5393M37877 = m37876(list2);
        return new C7696((C14763) c5393M37876.f18885, (C14763) c5393M37877.f18885, list, list2, C14932.m35914((List) c5393M37876.f18884, (List) c5393M37877.f18884, c15087), c15087).m43793();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5393 m37876(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        C14763 c14763 = new C14763(list.size());
        for (int i = 0; i < list.size(); i++) {
            C17391 c17391 = (C17391) list.get(i);
            if (c17391.m40851() > 3) {
                arrayList.add(c17391);
                c14763.add(i);
            }
        }
        return new C5393(arrayList, c14763);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m37874(List list, EnumC6950 enumC6950) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17391 c17391 = (C17391) it.next();
            if (c17391.f56561 != enumC6950) {
                c17391 = new C17391(c17391.m40850(), enumC6950);
            }
            arrayList.add(c17391);
        }
        return arrayList;
    }
}
