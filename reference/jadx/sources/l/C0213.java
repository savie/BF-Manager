package l;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O878 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0213 extends AbstractC7186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3740 f1388;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC7186 f1389;

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        Collection collection = (Collection) obj;
        if (collection == null) {
            c1145.m4214();
            return;
        }
        c1145.m4200();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f1389.mo1572(c1145, it.next());
        }
        c1145.m4199();
    }

    public C0213(AbstractC7186 abstractC7186, InterfaceC3740 interfaceC3740) {
        this.f1389 = abstractC7186;
        this.f1388 = interfaceC3740;
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        Collection collection = (Collection) this.f1388.mo1620();
        c5379.m14913();
        while (c5379.m14924()) {
            collection.add(this.f1389.mo1571(c5379));
        }
        c5379.m14929();
        return collection;
    }
}
