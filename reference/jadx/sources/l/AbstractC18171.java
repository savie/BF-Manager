package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18171 {
    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6217(AbstractC6239 abstractC6239, Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6218(InterfaceC24139 interfaceC24139, AbstractC6239 abstractC6239, AbstractC6239 abstractC62310, Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m42341(Collection collection, StringBuilder sb) {
        Iterator it = new ArrayList(collection).iterator();
        while (it.hasNext()) {
            ((InterfaceC21155) it.next()).mo17869(this, sb);
        }
    }
}
