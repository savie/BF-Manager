package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N97D */
/* JADX INFO: loaded from: classes2.dex */
public final class C0158 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1237 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f1238 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1260(C15682 c15682) {
        HashMap map = this.f1238;
        if (map.containsKey(c15682)) {
            return;
        }
        map.put(c15682, Integer.valueOf(map.size()));
        this.f1237.add(c15682);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m1256(C15682 c15682) {
        Integer num = (Integer) this.f1238.get(c15682);
        C13638.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1258(C11018 c11018) {
        ArrayList arrayList = this.f1237;
        c11018.m27775(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C15682) it.next()).m37373(c11018);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1259(C17367 c17367) {
        int iM40454 = c17367.m40454();
        ArrayList arrayList = this.f1237;
        arrayList.ensureCapacity(iM40454);
        for (int i = 0; i < iM40454; i++) {
            arrayList.add(C15682.m37366(c17367));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15682 m1257(int i) {
        return (C15682) this.f1237.get(i);
    }
}
