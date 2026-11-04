package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6239 implements InterfaceC21155 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f21176;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Collection mo17868(InterfaceC24139 interfaceC24139);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC24139[] mo17870();

    public AbstractC6239(Object obj) {
        this.f21176 = obj;
    }

    public String toString() {
        return this.f21176.toString();
    }

    @Override // l.InterfaceC21155
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17869(AbstractC18171 abstractC18171, Object obj) {
        abstractC18171.mo6217(this, obj);
        for (InterfaceC24139 interfaceC24139 : mo17870()) {
            Iterator it = new ArrayList(mo17868(interfaceC24139)).iterator();
            while (it.hasNext()) {
                abstractC18171.mo6218(interfaceC24139, this, (AbstractC6239) it.next(), obj);
            }
        }
    }
}
