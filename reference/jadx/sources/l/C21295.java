package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9F9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21295 implements InterfaceC23642 {
    @Override // l.InterfaceC23642
    public final Long apply(Object obj) {
        Iterator it = ((List) obj).iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Long) it.next()).longValue();
        }
        return Long.valueOf(jLongValue);
    }
}
