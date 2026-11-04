package l;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 76EN */
/* JADX INFO: loaded from: classes2.dex */
public final class C5615 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Set f19446;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C11580 c11580 = (C11580) obj;
        C11580 c11581 = (C11580) obj2;
        boolean z = true;
        boolean z2 = m16595(c11580.m29115()) || m16595(c11580.m29113());
        if (!m16595(c11581.m29115()) && !m16595(c11581.m29113())) {
            z = false;
        }
        return -Boolean.compare(z2, z);
    }

    public C5615(List list) {
        this.f19446 = (Set) C1170.stream(list).map(new C10346(5)).collect(C2025.toSet());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m16595(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (this.f19446.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
