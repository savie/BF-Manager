package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7SG */
/* JADX INFO: loaded from: classes2.dex */
public final class C1551 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f5356;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m5480() {
        ArrayList arrayList = this.f5356;
        return arrayList != null ? arrayList : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5482(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m5481(((AbstractC4534) it.next()).m14263());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5481(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f5356 == null) {
            this.f5356 = new ArrayList();
        }
        if (this.f5356.isEmpty()) {
            this.f5356.addAll(list);
            return;
        }
        int size = this.f5356.size() - 1;
        C5280 c5280 = (C5280) this.f5356.get(size);
        C5280 c5281 = (C5280) list.get(0);
        if (c5280.m15870() + c5280.m15871() == c5281.m15871()) {
            this.f5356.set(size, C5280.m15866(c5280.m15872(), c5280.m15867(), c5280.m15871(), c5281.m15870() + c5280.m15870()));
            this.f5356.addAll(list.subList(1, list.size()));
            return;
        }
        this.f5356.addAll(list);
    }
}
