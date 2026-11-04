package l;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O878 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6207 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22615 f21121;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC17567 f21122;

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        Collection collection = (Collection) obj;
        if (collection == null) {
            c21362.m48598();
            return;
        }
        c21362.m48585();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f21122.mo3723(c21362, it.next());
        }
        c21362.m48594();
    }

    public C6207(AbstractC17567 abstractC17567, InterfaceC22615 interfaceC22615) {
        this.f21122 = abstractC17567;
        this.f21121 = interfaceC22615;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        Collection collection = (Collection) this.f21121.construct();
        c4208.m13441();
        while (c4208.m13457()) {
            collection.add(this.f21122.mo3722(c4208));
        }
        c4208.m13449();
        return collection;
    }
}
