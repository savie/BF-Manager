package l;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5329 extends AbstractMap {
    /* JADX INFO: renamed from: ۙ */
    public abstract Iterator mo7724();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C12786(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Iterator itMo7724 = mo7724();
        itMo7724.getClass();
        while (itMo7724.hasNext()) {
            itMo7724.next();
            itMo7724.remove();
        }
    }
}
