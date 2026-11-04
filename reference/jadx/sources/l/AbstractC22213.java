package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ܿۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8YL */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22213 implements InterfaceC21907 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char f71556;

    @Override // l.InterfaceC21907
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2908() {
        return 1;
    }

    public AbstractC22213(char c) {
        this.f71556 = c;
    }

    @Override // l.InterfaceC21907
    /* JADX INFO: renamed from: ۤ */
    public final char mo2907() {
        return this.f71556;
    }

    @Override // l.InterfaceC21907
    /* JADX INFO: renamed from: ۙ */
    public final char mo2904() {
        return this.f71556;
    }

    @Override // l.InterfaceC21907
    /* JADX INFO: renamed from: ۙ */
    public final int mo2905(C2711 c2711, C2711 c2712) {
        AbstractC4534 c21467;
        ArrayList arrayList = c2712.f9055;
        if ((c2711.m9029() || c2712.m9032()) && c2712.m9033() % 3 != 0) {
            if ((c2712.m9033() + c2711.m9033()) % 3 == 0) {
                return 0;
            }
        }
        int size = c2711.f9055.size();
        char c = this.f71556;
        int i = 2;
        if (size < 2 || arrayList.size() < 2) {
            String.valueOf(c);
            c21467 = new C21467();
            i = 1;
        } else {
            String.valueOf(c);
            c21467 = new C11245();
        }
        C1551 c1551 = new C1551();
        c1551.m5482(c2711.m9031(i));
        C24672 c24672M9030 = c2711.m9030();
        for (AbstractC4534 abstractC4534 : C22434.m50585(c24672M9030, (C24672) arrayList.get(0))) {
            c21467.m14256(abstractC4534);
            c1551.m5481(abstractC4534.m14263());
        }
        c1551.m5482(c2712.m9028(i));
        c21467.m14255(c1551.m5480());
        c24672M9030.m14266(c21467);
        return i;
    }
}
