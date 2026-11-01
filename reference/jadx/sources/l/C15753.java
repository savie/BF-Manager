package l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.ܺۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes4.dex */
public final class C15753 extends AbstractC0477 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final PriorityQueue f51060;

    public C15753(Iterable iterable, final Comparator comparator) {
        this.f51060 = new PriorityQueue(2, new Comparator() { // from class: l.۟ۛܶ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C20691 c20691 = (C20691) obj;
                C20691 c20692 = (C20691) obj2;
                return AbstractC13116.m32469().mo4145(((C19986) c20691.f67291).peek(), ((C19986) c20692.f67291).peek(), comparator).mo4143(c20691.f67290, c20692.f67290).mo4142();
            }
        });
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Iterator it2 = (Iterator) it.next();
            if (it2.hasNext()) {
                this.f51060.add(new C20691(C16458.m38722(it2), i));
                i++;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f51060.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        PriorityQueue priorityQueue = this.f51060;
        C20691 c20691 = (C20691) priorityQueue.remove();
        C19986 c19986 = (C19986) c20691.f67291;
        Object next = c19986.next();
        if (c19986.hasNext()) {
            priorityQueue.add(c20691);
        }
        return next;
    }
}
