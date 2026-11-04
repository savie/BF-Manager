package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6I5 */
/* JADX INFO: loaded from: classes.dex */
public final class C24160 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Map f78176;

    static {
        C16980.m40037(C24160.class);
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        c1610.m5681().getClass();
        this.f78176 = Collections.EMPTY_MAP;
        c1610.m5675(new C12225(0));
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        List list;
        Map map = this.f78176;
        if (map == null || (list = (List) map.get(c24927.m55571().m4966())) == null) {
            list = Collections.EMPTY_LIST;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                ((InterfaceC6874) it.next()).m19133();
                int[] iArr = C6260.f21235;
                throw null;
            }
        }
        C4937.forEach(c24927.m55534(), new C23567(1, this));
        return false;
    }
}
