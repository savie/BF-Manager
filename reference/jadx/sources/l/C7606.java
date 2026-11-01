package l;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1JW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7606 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f25162 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20142(AbstractActivityC12483 abstractActivityC12483, int i) {
        C10429 c10429;
        ArrayList arrayList = this.f25162;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                c10429 = null;
                break;
            }
            c10429 = (C10429) it.next();
        } while (c10429.f35631 != i);
        if (c10429 == null) {
            c10429 = new C10429(i);
            arrayList.add(c10429);
        }
        if (c10429.f35632 == null) {
            c10429.f35632 = abstractActivityC12483.m30995(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m20141(int i) {
        for (C10429 c10429 : this.f25162) {
            if (c10429.f35631 == i) {
                View view = c10429.f35632;
                if (view == null) {
                    break;
                }
                c10429.f35632 = null;
                return view;
            }
        }
        return null;
    }
}
