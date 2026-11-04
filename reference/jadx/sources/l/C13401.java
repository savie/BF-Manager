package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1IXX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13401 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f42707;

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        c1610.m5681().getClass();
        this.f42707 = true;
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        InterfaceC10161 interfaceC10161M55561;
        C12597 c12597;
        C6632 c6632;
        if (this.f42707 && (interfaceC10161M55561 = c24927.m55561()) != null && (c12597 = (C12597) c24927.mo17862(C25278.f81641)) != null && (c6632 = (C6632) c12597.m31307().get(interfaceC10161M55561.getType())) != null) {
            C10293 c10293 = new C10293(c6632.m18566(), EnumC19244.CLASS);
            if (!c24927.mo8547().equals(c10293)) {
                c24927.mo8501(c10293);
                c24927.m31133("Apply access flags from 'inner classes' attribute");
            }
            if (!c24927.mo8547().m26540() && c6632.m18567() != null) {
                AbstractC1566 abstractC1566M5538 = AbstractC1566.m5538(c6632.m18567());
                Iterator it = c24927.getMethods().iterator();
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    if (!it.hasNext()) {
                        z = z2;
                        break;
                    }
                    C21965 c21965Mo8532 = ((C2551) it.next()).mo8532();
                    if (c21965Mo8532.m49703()) {
                        List listM49702 = c21965Mo8532.m49702();
                        if (!listM49702.isEmpty() && ((AbstractC1566) listM49702.get(0)).equals(abstractC1566M5538)) {
                            break;
                        }
                        z2 = true;
                    }
                }
                if (z) {
                    c24927.mo8501(c24927.mo8547().m26530());
                    c24927.m31137("Make member class 'static'");
                }
            }
        }
        return true;
    }
}
