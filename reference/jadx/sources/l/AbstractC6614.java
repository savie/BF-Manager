package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6614 implements InterfaceC17903 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f22269;

    /* JADX INFO: renamed from: ۙ */
    public abstract Collection mo3679(InterfaceC22843 interfaceC22843);

    /* JADX INFO: renamed from: ܰ */
    public abstract InterfaceC22843[] mo3681();

    public AbstractC6614(Object obj) {
        this.f22269 = obj;
    }

    public String toString() {
        return this.f22269.toString();
    }

    @Override // l.InterfaceC17903
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17946(AbstractC18609 abstractC18609, Object obj) {
        abstractC18609.mo9567(this, obj);
        for (InterfaceC22843 interfaceC22843 : mo3681()) {
            Iterator it = new ArrayList(mo3679(interfaceC22843)).iterator();
            while (it.hasNext()) {
                abstractC18609.mo9568(interfaceC22843, this, (AbstractC6614) it.next(), obj);
            }
        }
    }
}
