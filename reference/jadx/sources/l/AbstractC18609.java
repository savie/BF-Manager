package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18609 {
    /* JADX INFO: renamed from: ۙ */
    public abstract void mo9567(AbstractC6614 abstractC6614, Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo9568(InterfaceC22843 interfaceC22843, AbstractC6614 abstractC6614, AbstractC6614 abstractC6615, Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m43013(Collection collection, StringBuilder sb) {
        Iterator it = new ArrayList(collection).iterator();
        while (it.hasNext()) {
            ((InterfaceC17903) it.next()).mo17946(this, sb);
        }
    }
}
