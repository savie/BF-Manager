package l;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢ֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: EIXC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9768 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14505 m25438(C2551 c2551, InterfaceC7377 interfaceC7377, boolean z, List list) {
        InterfaceC8670 interfaceC8670 = (InterfaceC8670) ((C15580) list.get(0)).m37318();
        String str = (String) ((C15580) list.get(1)).m37318();
        InterfaceC7179 interfaceC7179 = (InterfaceC7179) ((C15580) list.get(2)).m37318();
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        C1610 c1610Mo8527 = c2551.mo8527();
        arrayList.add(C6077.m17591(c1610Mo8527));
        for (int i = 1; i < size; i++) {
            C15580 c15580 = (C15580) list.get(i);
            try {
                arrayList.add(C6077.m17590(c1610Mo8527, c15580));
            } catch (Exception e) {
                c2551.m31134("Failed to build arg in invoke-custom insn: " + c15580, e);
                arrayList.add(AbstractC16481.m39112(new C5557(c15580.toString())));
            }
        }
        if (interfaceC8670.getType().m50355()) {
            throw new C8597("Field handle not yet supported");
        }
        C1610 c1610Mo8528 = c2551.mo8527();
        final C21219 c21219 = new C21219(C21965.m49693(c1610Mo8528, interfaceC8670.mo5148()), C9023.m24075(interfaceC8670.getType()), arrayList.size());
        C4937.forEach(arrayList, new Consumer() { // from class: l.ᩳ֨ۗ
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                c21219.mo44014((AbstractC16481) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }
        });
        C14505 c14505 = new C14505(c21219, C21965.m49692(c1610Mo8528, C1345.m4955(c1610Mo8528, AbstractC1566.f5426), str, interfaceC7179), interfaceC7377, z);
        c14505.m35016(list);
        return c14505;
    }
}
