package l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۡ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes4.dex */
public final class C9216 extends C19799 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f21057).comparator();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C9216(((SortedSet) this.f21057).subSet(obj, obj2), this.f21056);
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C9216(((SortedSet) this.f21057).headSet(obj), this.f21056);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C9216(((SortedSet) this.f21057).tailSet(obj), this.f21056);
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f21057.iterator();
        it.getClass();
        InterfaceC19010 interfaceC19010 = this.f21056;
        interfaceC19010.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC19010.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f21057;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f21056.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }
}
