package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۚۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95IB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5439 extends AbstractC8639 implements NavigableSet, InterfaceC24259, InterfaceC21089 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final transient Comparator f18990;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient AbstractC5439 f18991;

    @Override // java.util.NavigableSet
    public abstract AbstractC4516 descendingIterator();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC5439 mo16231(Object obj, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC5439 mo16232(Object obj, boolean z, Object obj2, boolean z2);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC5439 mo16233();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract AbstractC5439 mo16234(Object obj, boolean z);

    @Override // l.AbstractC8639, l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static AbstractC5439 of() {
        return C5613.f19444;
    }

    public static AbstractC5439 copyOf(Collection collection) {
        return m16228(collection, C0108.f1051);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC5439 m16227(Iterable iterable) {
        return m16228(iterable, C0108.f1051);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5613 m16230(Comparator comparator) {
        if (C0108.f1051.equals(comparator)) {
            return C5613.f19444;
        }
        return new C5613(C4867.f16966, comparator);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC5439 m16229(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return m16230(comparator);
        }
        C7566.m20662(i, objArr);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new C5613(AbstractC1928.m6618(i2, objArr), comparator);
    }

    public AbstractC5439(Comparator comparator) {
        this.f18990 = comparator;
    }

    @Override // java.util.SortedSet, l.InterfaceC24259
    public final Comparator comparator() {
        return this.f18990;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.SortedSet
    public Object last() {
        return ((AbstractC6688) descendingIterator()).next();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        AbstractC5439 abstractC5439 = this.f18991;
        if (abstractC5439 != null) {
            return abstractC5439;
        }
        AbstractC5439 abstractC5439Mo16233 = mo16233();
        this.f18991 = abstractC5439Mo16233;
        abstractC5439Mo16233.f18991 = this;
        return abstractC5439Mo16233;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // l.AbstractC8639, l.AbstractC4911
    public Object writeReplace() {
        return new C12896(this.f18990, toArray());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC5439 m16228(Iterable iterable, Comparator comparator) {
        comparator.getClass();
        if (C4121.m13216(iterable, comparator) && (iterable instanceof AbstractC5439)) {
            AbstractC5439 abstractC5439 = (AbstractC5439) iterable;
            if (!abstractC5439.mo14905()) {
                return abstractC5439;
            }
        }
        Object[] objArrM39337 = C16625.m39337(iterable);
        return m16229(comparator, objArrM39337.length, objArrM39337);
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        obj.getClass();
        return C7676.m20909(mo16234(obj, true).iterator(), (String) null);
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        obj.getClass();
        return C7676.m20909(mo16231(obj, true).descendingIterator(), (String) null);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        return mo16231(obj, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        return mo16231(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        obj.getClass();
        return C7676.m20909(mo16234(obj, false).iterator(), (String) null);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        obj.getClass();
        return C7676.m20909(mo16231(obj, false).descendingIterator(), (String) null);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        C12128.m30309(this.f18990.compare(obj, obj2) <= 0);
        return mo16232(obj, z, obj2, z2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        C12128.m30309(this.f18990.compare(obj, obj2) <= 0);
        return mo16232(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return mo16234(obj, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        return mo16234(obj, true);
    }
}
