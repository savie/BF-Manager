package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A7SG */
/* JADX INFO: loaded from: classes4.dex */
public final class C16545 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f53137;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m38947() {
        ArrayList arrayList = this.f53137;
        return arrayList != null ? arrayList : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38949(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m38948(((AbstractC19367) it.next()).m44394());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38948(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f53137 == null) {
            this.f53137 = new ArrayList();
        }
        if (this.f53137.isEmpty()) {
            this.f53137.addAll(list);
            return;
        }
        int size = this.f53137.size() - 1;
        C0316 c0316 = (C0316) this.f53137.get(size);
        C0316 c0317 = (C0316) list.get(0);
        if (c0316.m1952() + c0316.m1953() == c0317.m1953()) {
            this.f53137.set(size, C0316.m1947(c0316.m1948(), c0316.m1949(), c0316.m1953(), c0317.m1952() + c0316.m1952()));
            this.f53137.addAll(list.subList(1, list.size()));
            return;
        }
        this.f53137.addAll(list);
    }
}
