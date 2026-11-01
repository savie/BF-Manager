package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BAS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5106 extends AbstractC23721 {
    /* JADX INFO: renamed from: ۜ */
    public abstract void mo12266();

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo14219() {
        Collection collectionMo12263 = mo12263();
        int size = collectionMo12263.size();
        if (size == 0) {
            return 0;
        }
        return ((AbstractC21603) collectionMo12263.iterator().next()).mo9739() * size;
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo14222() {
        C4669 c4669M52251 = m52251();
        mo12266();
        Iterator it = mo12263().iterator();
        while (it.hasNext()) {
            ((AbstractC21603) it.next()).mo4171(c4669M52251);
        }
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo14221(C2718 c2718) {
        C4669 c4669M52251 = m52251();
        int iM52244 = m52244();
        Iterator it = mo12263().iterator();
        while (it.hasNext()) {
            ((AbstractC21603) it.next()).mo9738(c4669M52251, c2718);
            c2718.m8282(iM52244);
        }
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo14220(AbstractC21603 abstractC21603) {
        AbstractC15254 abstractC15254 = (AbstractC15254) abstractC21603;
        return m52245(abstractC15254.mo9739() * abstractC15254.m36534());
    }
}
