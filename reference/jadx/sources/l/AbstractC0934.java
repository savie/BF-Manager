package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.֨ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95IB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0934 extends AbstractC23844 implements NavigableSet, InterfaceC20504, InterfaceC15049 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient AbstractC0934 f3734;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final transient Comparator f3735;

    @Override // java.util.NavigableSet
    public abstract AbstractC0477 descendingIterator();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC0934 mo3686(Object obj, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC0934 mo3687(Object obj, boolean z, Object obj2, boolean z2);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC0934 mo3688();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC0934 mo3689(Object obj, boolean z);

    @Override // l.AbstractC23844, l.AbstractC1826, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static AbstractC0934 of() {
        return C7098.f23785;
    }

    public static AbstractC0934 copyOf(Collection collection) {
        return m3683(collection, C17308.f55088);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0934 m3682(Iterable iterable) {
        return m3683(iterable, C17308.f55088);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7098 m3685(Comparator comparator) {
        if (C17308.f55088.equals(comparator)) {
            return C7098.f23785;
        }
        return new C7098(C12038.f40301, comparator);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0934 m3684(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return m3685(comparator);
        }
        C6019.m16341(i, objArr);
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
        return new C7098(AbstractC22433.m49802(i2, objArr), comparator);
    }

    public AbstractC0934(Comparator comparator) {
        this.f3735 = comparator;
    }

    @Override // java.util.SortedSet, l.InterfaceC20504
    public final Comparator comparator() {
        return this.f3735;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.SortedSet
    public Object last() {
        return ((AbstractC19115) descendingIterator()).next();
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
        AbstractC0934 abstractC0934 = this.f3734;
        if (abstractC0934 != null) {
            return abstractC0934;
        }
        AbstractC0934 abstractC0934Mo3688 = mo3688();
        this.f3734 = abstractC0934Mo3688;
        abstractC0934Mo3688.f3734 = this;
        return abstractC0934Mo3688;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // l.AbstractC23844, l.AbstractC1826
    public Object writeReplace() {
        return new C22102(this.f3735, toArray());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0934 m3683(Iterable iterable, Comparator comparator) {
        comparator.getClass();
        if (C0747.m3242(iterable, comparator) && (iterable instanceof AbstractC0934)) {
            AbstractC0934 abstractC0934 = (AbstractC0934) iterable;
            if (!abstractC0934.mo5042()) {
                return abstractC0934;
            }
        }
        Object[] objArrM50471 = C22808.m50471(iterable);
        return m3684(comparator, objArrM50471.length, objArrM50471);
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        obj.getClass();
        return C16458.m38718(mo3689(obj, true).iterator(), (String) null);
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        obj.getClass();
        return C16458.m38718(mo3686(obj, true).descendingIterator(), (String) null);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        return mo3686(obj, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        return mo3686(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        obj.getClass();
        return C16458.m38718(mo3689(obj, false).iterator(), (String) null);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        obj.getClass();
        return C16458.m38718(mo3686(obj, false).descendingIterator(), (String) null);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        C18304.m42517(this.f3735.compare(obj, obj2) <= 0);
        return mo3687(obj, z, obj2, z2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        C18304.m42517(this.f3735.compare(obj, obj2) <= 0);
        return mo3687(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return mo3689(obj, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        return mo3689(obj, true);
    }
}
