package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1UK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19145 extends AbstractC21976 implements InterfaceC5656 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24367[] f61960;

    public C19145(C24367... c24367Arr) {
        this.f61960 = c24367Arr;
    }

    @Override // l.AbstractC21976, l.InterfaceC5656
    /* JADX INFO: renamed from: ۙ */
    public final void mo9647(C21383 c21383) {
        mo27982(c21383);
        String strM48622 = c21383.m48622();
        if (strM48622 != null) {
            AbstractC4229 abstractC4229M44380 = m44380(C18856.m43752(strM48622));
            if (abstractC4229M44380 instanceof C21383) {
                c21383.m48623((C21383) abstractC4229M44380);
            }
        }
    }

    @Override // l.AbstractC21976
    /* JADX INFO: renamed from: ᩷ */
    public final void mo27982(C21383 c21383) {
        AbstractC4229 abstractC4229M44380;
        if (c21383.m13512() != null && (abstractC4229M44380 = m44380(c21383.m13512())) != null) {
            c21383.m13520(abstractC4229M44380);
            abstractC4229M44380.m13510(c21383);
        }
        Iterator<E> it = c21383.m13522().iterator();
        while (it.hasNext()) {
            AbstractC4229 abstractC4229M44381 = m44380((String) it.next());
            if (abstractC4229M44381 != null) {
                c21383.m13505(abstractC4229M44381);
                abstractC4229M44381.m13510(c21383);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private AbstractC4229 m44380(String str) {
        for (C24367 c24367 : this.f61960) {
            AbstractC4229 abstractC4229M54479 = c24367.m54479(str);
            if (abstractC4229M54479 != null) {
                return abstractC4229M54479;
            }
        }
        return null;
    }
}
