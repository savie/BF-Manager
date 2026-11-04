package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GIUH */
/* JADX INFO: loaded from: classes4.dex */
public final class C11384 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f35838;

    @Override // l.AbstractC16700, l.InterfaceC13673
    public final String getName() {
        return "ProcessMethodsForInline";
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        this.f35838 = c1610.m5681().m17703();
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        if (!this.f35838) {
            return false;
        }
        for (C2551 c2551 : c24927.getMethods()) {
            if (!c2551.m8524() && !c2551.mo17865(EnumC1763.DONT_GENERATE)) {
                C10293 c10293Mo8547 = c2551.mo8547();
                if (c10293Mo8547.m26528() || c2551.getName().contains("$")) {
                    if (c10293Mo8547.m26540() || (c2551.m8529() && c2551.mo8527().m5681().m17694())) {
                        c2551.mo17866(EnumC1763.METHOD_CANDIDATE_FOR_INLINE);
                        C24927 c24927M8516 = c2551.m8516();
                        Iterator it = c2551.m8514().iterator();
                        while (it.hasNext()) {
                            C24927 c24927M8517 = ((C2551) it.next()).m8516();
                            if (c24927M8517 != c24927M8516) {
                                c24927M8516.m55581(c24927M8517);
                                c24927M8517.m55546(c24927M8516);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
