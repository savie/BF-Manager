package l;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1JW */
/* JADX INFO: loaded from: classes.dex */
public final class C23551 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f76076 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52754(AbstractActivityC17204 abstractActivityC17204, int i) {
        C16091 c16091;
        ArrayList arrayList = this.f76076;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                c16091 = null;
                break;
            }
            c16091 = (C16091) it.next();
        } while (c16091.f52131 != i);
        if (c16091 == null) {
            c16091 = new C16091(i);
            arrayList.add(c16091);
        }
        if (c16091.f52132 == null) {
            c16091.f52132 = abstractActivityC17204.m40395(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m52753(int i) {
        for (C16091 c16091 : this.f76076) {
            if (c16091.f52131 == i) {
                View view = c16091.f52132;
                if (view == null) {
                    break;
                }
                c16091.f52132 = null;
                return view;
            }
        }
        return null;
    }
}
