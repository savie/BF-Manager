package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: MAYX */
/* JADX INFO: loaded from: classes.dex */
public final class C23550 implements Collection {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object[] f76269;

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C13465.m32966(objArr, "array");
        return C14750.m35368(this, objArr);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        C13465.m32966(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public C23550(Object[] objArr) {
        this.f76269 = objArr;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f76269.length;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f76269.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return C16866.m39530(this.f76269);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f76269;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        C13465.m32967(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i;
        Object[] objArr = this.f76269;
        C13465.m32966(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] != null) {
                    i++;
                }
            }
            i = -1;
        } else {
            int length2 = objArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (obj.equals(objArr[i2])) {
                    i = i2;
                }
            }
            i = -1;
        }
        return i >= 0;
    }
}
