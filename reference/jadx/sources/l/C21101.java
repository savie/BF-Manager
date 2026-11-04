package l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.᩶ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21101 extends AbstractC4516 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final PriorityQueue f67390;

    public C21101(Iterable iterable, final Comparator comparator) {
        this.f67390 = new PriorityQueue(2, new Comparator() { // from class: l.ۘۚܽ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C14387 c14387 = (C14387) obj;
                C14387 c14388 = (C14387) obj2;
                return AbstractC25114.m55993().mo6827(((C18117) c14387.f45343).peek(), ((C18117) c14388.f45343).peek(), comparator).mo6825(c14387.f45342, c14388.f45342).mo6824();
            }
        });
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Iterator it2 = (Iterator) it.next();
            if (it2.hasNext()) {
                this.f67390.add(new C14387(C7676.m20913(it2), i));
                i++;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f67390.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        PriorityQueue priorityQueue = this.f67390;
        C14387 c14387 = (C14387) priorityQueue.remove();
        C18117 c18117 = (C18117) c14387.f45343;
        Object next = c18117.next();
        if (c18117.hasNext()) {
            priorityQueue.add(c14387);
        }
        return next;
    }
}
