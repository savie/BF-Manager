package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BAS */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13354 extends AbstractC8681 {
    /* JADX INFO: renamed from: ۧ */
    public abstract void mo3720();

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ֫ */
    public final int mo23358() {
        Collection collectionMo3721 = mo3721();
        int size = collectionMo3721.size();
        if (size == 0) {
            return 0;
        }
        return ((AbstractC23599) collectionMo3721.iterator().next()).mo13418() * size;
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ܳ */
    public final void mo23366() {
        C10918 c10918M23369 = m23369();
        mo3720();
        Iterator it = mo3721().iterator();
        while (it.hasNext()) {
            ((AbstractC23599) it.next()).mo1455(c10918M23369);
        }
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ᩷ */
    public final void mo23370(C15000 c15000) {
        C10918 c10918M23369 = m23369();
        int iM23359 = m23359();
        Iterator it = mo3721().iterator();
        while (it.hasNext()) {
            ((AbstractC23599) it.next()).mo13417(c10918M23369, c15000);
            c15000.m36110(iM23359);
        }
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ۙ */
    public final int mo23361(AbstractC23599 abstractC23599) {
        AbstractC16139 abstractC16139 = (AbstractC16139) abstractC23599;
        return m23360(abstractC16139.mo13418() * abstractC16139.m38321());
    }
}
