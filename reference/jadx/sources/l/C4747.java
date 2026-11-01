package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H403 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4747 extends ArrayList {
    @Override // java.util.ArrayList
    public final Object clone() {
        C4747 c4747 = new C4747(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            c4747.add(((C0617) it.next()).mo2874clone());
        }
        return c4747;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbM11782 = C4145.m11782();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            C0617 c0617 = (C0617) it.next();
            if (sbM11782.length() != 0) {
                sbM11782.append("\n");
            }
            sbM11782.append(c0617.mo26643());
        }
        return C4145.m11780(sbM11782);
    }
}
