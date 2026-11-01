package l;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶᩶۟, reason: contains not printable characters */
/* JADX INFO: compiled from: S403 */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC16741(EnumC12508.RELEASE_6)
public class C20393 extends AbstractC7693 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m46039(List list, Object obj) {
        Iterator it = list.iterator();
        Set setM18692 = null;
        while (it.hasNext()) {
            setM18692 = ((C6945) this).m18692((InterfaceC14625) it.next(), (Set) obj);
        }
        return setM18692;
    }

    @Override // l.AbstractC7693
    /* JADX INFO: renamed from: ۙ */
    public final Object mo20328(C16847 c16847, Object obj) {
        return m46039(c16847.mo2882(), obj);
    }
}
