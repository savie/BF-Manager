package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5WP */
/* JADX INFO: loaded from: classes.dex */
public final class C24005 implements Collection {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14307 f77656;

    public C24005(C14307 c14307) {
        this.f77656 = c14307;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f77656.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f77656.m24218(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f77656.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3867(this.f77656);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C14307 c14307 = this.f77656;
        int iM24218 = c14307.m24218(obj);
        if (iM24218 < 0) {
            return false;
        }
        c14307.m24222(iM24218);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C14307 c14307 = this.f77656;
        int size = c14307.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (collection.contains(c14307.m24221(i))) {
                c14307.m24222(i);
                i--;
                size--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C14307 c14307 = this.f77656;
        int size = c14307.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (!collection.contains(c14307.m24221(i))) {
                c14307.m24222(i);
                i--;
                size--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f77656.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C14307 c14307 = this.f77656;
        int size = c14307.size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            objArr[i] = c14307.m24221(i);
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C14307 c14307 = this.f77656;
        int size = c14307.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = c14307.m24221(i);
        }
        return objArr;
    }
}
