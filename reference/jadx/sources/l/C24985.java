package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZIV7 */
/* JADX INFO: loaded from: classes.dex */
public final class C24985 extends AbstractC4847 {
    @Override // l.AbstractC4847
    /* JADX INFO: renamed from: ᩷ */
    public final List mo6399() {
        C9320 c9320;
        C7830 c7830M14886 = m14886();
        AbstractC1118 abstractC1118M21353 = c7830M14886.m21353();
        AbstractC1118 abstractC1118M21356 = c7830M14886.m21356();
        EnumC10066 enumC10066Mo4155 = abstractC1118M21353.mo4155();
        EnumC10066 enumC10066 = EnumC10066.READY_TO_COMPARE;
        boolean z = enumC10066Mo4155 == enumC10066;
        boolean z2 = abstractC1118M21356.mo4155() == enumC10066;
        if (!z || !z2) {
            if (z) {
                c9320 = (C9320) abstractC1118M21353;
            } else {
                C9320 c9321 = (C9320) abstractC1118M21356;
                abstractC1118M21356 = abstractC1118M21353;
                c9320 = c9321;
            }
            List listM24556 = c9320.m24556();
            ArrayList arrayList = new ArrayList(listM24556.size());
            Iterator it = listM24556.iterator();
            while (it.hasNext()) {
                AbstractC14124 abstractC14124M11053 = C3355.m11053(c9320.m4153(), new C19017((C21943) it.next(), 0, 0));
                C7413 c7413 = new C7413(abstractC1118M21356);
                C7830 c7830M21346 = c7830M14886.m21346();
                arrayList.add(z ? C7830.m21345(c7830M21346, abstractC14124M11053, c7413) : C7830.m21345(c7830M21346, c7413, abstractC14124M11053));
            }
            return arrayList;
        }
        List listM24557 = ((C9320) abstractC1118M21353).m24556();
        List listM24558 = ((C9320) abstractC1118M21356).m24556();
        int size = listM24557.size();
        int size2 = listM24558.size();
        if (size2 % size != 0 || size2 != size) {
            EnumC14541 enumC14541 = EnumC14541.UNMERGEABLE_STATE;
            Object[] objArr = {C7830.m21345(m14886(), C21255.m48442(enumC14541), C21255.m48442(enumC14541))};
            ArrayList arrayList2 = new ArrayList(1);
            Object obj = objArr[0];
            return C24579.m54899(obj, arrayList2, obj, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(listM24557);
        ArrayList arrayList4 = new ArrayList(listM24558);
        int i = size2 / size;
        ArrayList arrayList5 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList6 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList6.add((C21943) arrayList4.get((i2 * size) + i3));
            }
            C7830 c7830M14887 = m14886();
            C2551 c2551M39889 = m14886().m21352().m39889();
            AbstractC1118 abstractC1118M21354 = c7830M14887.m21353();
            AbstractC1118 abstractC1118M21357 = c7830M14887.m21356();
            C9649 c9649M21347 = c7830M14887.m21347(abstractC1118M21354);
            C0701 c0701M4153 = abstractC1118M21354.m4153();
            c9649M21347.getClass();
            AbstractC14124 abstractC14124M38191 = C16033.m38191(c0701M4153, arrayList3, C23231.m52160(c2551M39889, arrayList3));
            C9649 c9649M21348 = c7830M14887.m21347(abstractC1118M21357);
            C0701 c0701M4154 = abstractC1118M21357.m4153();
            c9649M21348.getClass();
            arrayList5.add(C7830.m21345(c7830M14887, abstractC14124M38191, C16033.m38191(c0701M4154, arrayList6, C23231.m52160(c2551M39889, arrayList6))));
        }
        return arrayList5;
    }
}
