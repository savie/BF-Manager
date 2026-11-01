package l;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6724 extends AbstractMap {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Iterator mo18156();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C3901(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Iterator itMo18156 = mo18156();
        itMo18156.getClass();
        while (itMo18156.hasNext()) {
            itMo18156.next();
            itMo18156.remove();
        }
    }
}
