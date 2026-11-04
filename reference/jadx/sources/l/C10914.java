package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8YZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10914 implements InterfaceC21907 {
    @Override // l.InterfaceC21907
    /* JADX INFO: renamed from: ۙ */
    public final char mo2904() {
        return '~';
    }

    @Override // l.InterfaceC21907
    /* JADX INFO: renamed from: ۤ */
    public final char mo2907() {
        return '~';
    }

    @Override // l.InterfaceC21907
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2908() {
        return 1;
    }

    @Override // l.InterfaceC21907
    /* JADX INFO: renamed from: ۙ */
    public final int mo2905(C2711 c2711, C2711 c2712) {
        ArrayList arrayList = c2711.f9055;
        int size = arrayList.size();
        ArrayList arrayList2 = c2712.f9055;
        if (size != arrayList2.size() || arrayList.size() > 2) {
            return 0;
        }
        C24672 c24672M9030 = c2711.m9030();
        if (arrayList.size() == 1) {
            c24672M9030.getClass();
        } else {
            c24672M9030.getClass();
        }
        C13592 c13592 = new C13592();
        C1551 c1551 = new C1551();
        c1551.m5482(c2711.m9031(arrayList.size()));
        for (AbstractC4534 abstractC4534 : C22434.m50585(c24672M9030, (C24672) arrayList2.get(0))) {
            c13592.m14256(abstractC4534);
            c1551.m5481(abstractC4534.m14263());
        }
        c1551.m5482(c2712.m9028(arrayList2.size()));
        c13592.m14255(c1551.m5480());
        c24672M9030.m14266(c13592);
        return arrayList.size();
    }
}
