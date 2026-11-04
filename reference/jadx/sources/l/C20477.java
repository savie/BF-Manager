package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: H403 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20477 extends ArrayList {
    @Override // java.util.ArrayList
    public final Object clone() {
        C20477 c20477 = new C20477(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            c20477.add(((C15496) it.next()).mo5153clone());
        }
        return c20477;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbM2898 = C0669.m2898();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            C15496 c15496 = (C15496) it.next();
            if (sbM2898.length() != 0) {
                sbM2898.append("\n");
            }
            sbM2898.append(c15496.mo15298());
        }
        return C0669.m2896(sbM2898);
    }
}
