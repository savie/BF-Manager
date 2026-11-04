package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5WP */
/* JADX INFO: loaded from: classes3.dex */
public final class C12070 implements Set {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14307 f38872;

    public C12070(C14307 c14307) {
        this.f38872 = c14307;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f38872.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f38872.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f38872.m34744(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f38872.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C20275(this.f38872);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C14307 c14307 = this.f38872;
        int iM24223 = c14307.m24223(obj);
        if (iM24223 < 0) {
            return false;
        }
        c14307.m24222(iM24223);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f38872.m34746(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f38872.m34745(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f38872.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C14307 c14307 = this.f38872;
        int size = c14307.size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            objArr[i] = c14307.m24220(i);
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C14307 c14307 = this.f38872;
        int size = c14307.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = c14307.m24220(i);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C14307 c14307 = this.f38872;
        int iHashCode = 0;
        for (int size = c14307.size() - 1; size >= 0; size--) {
            Object objM24220 = c14307.m24220(size);
            iHashCode += objM24220 == null ? 0 : objM24220.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C14307 c14307 = this.f38872;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return c14307.size() == set.size() && c14307.m34744((Collection) set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
