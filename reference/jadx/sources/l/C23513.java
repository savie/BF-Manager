package l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩹ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes.dex */
public final class C23513 extends C16053 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f9445).comparator();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C23513(((SortedSet) this.f9445).subSet(obj, obj2), this.f9444);
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C23513(((SortedSet) this.f9445).headSet(obj), this.f9444);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C23513(((SortedSet) this.f9445).tailSet(obj), this.f9444);
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f9445.iterator();
        it.getClass();
        InterfaceC6163 interfaceC6163 = this.f9444;
        interfaceC6163.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC6163.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f9445;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f9444.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }
}
