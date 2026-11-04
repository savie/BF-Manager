package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ֨ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public final class C3061 extends AbstractC0078 {
    public final String toString() {
        return ":only-of-type";
    }

    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        C15496 c15496Mo37068 = c15497.mo37068();
        if (c15496Mo37068 != null && !(c15496Mo37068 instanceof C5056)) {
            Iterator<E> it = c15496Mo37068.m37082().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((C15496) it.next()).m37077().equals(c15497.m37077())) {
                    i++;
                }
            }
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
