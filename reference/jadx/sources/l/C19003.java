package l;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A41S */
/* JADX INFO: loaded from: classes4.dex */
public final class C19003 extends AbstractQueue {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C21825 f61509;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f61510;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f61511;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C21825 f61512;

    public C19003() {
        clear();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f61512 = C21825.m48588();
        this.f61509 = null;
        this.f61510 = 0;
        this.f61511 = false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m43728() {
        return this.f61510;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f61510;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return this.f61512.toArray(new Object[this.f61510]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f61510 == 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m43722() {
        return this.f61510 != 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m43729(Object obj) {
        C21825 c21825 = this.f61512;
        c21825.getClass();
        C21825 c21826 = new C21825(obj, c21825);
        this.f61512 = c21826;
        if (this.f61509 == null) {
            this.f61509 = c21826;
        }
        this.f61510++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43723(Object obj) {
        C6171.m17171(obj);
        if (this.f61511 && this.f61512.m48595()) {
            C21825 c21825 = this.f61512;
            C21825 c21825Of = C21825.of(c21825.f70876);
            this.f61509 = c21825Of;
            this.f61512 = c21825Of;
            while (true) {
                c21825 = c21825.f70877;
                if (!c21825.m48595()) {
                    break;
                }
                this.f61509.f70877 = C21825.of(c21825.f70876);
                this.f61509 = this.f61509.f70877;
            }
        }
        C21825 c21825Of2 = C21825.of(obj);
        C21825 c21826 = this.f61509;
        if (c21826 != null) {
            c21826.f70877 = c21825Of2;
            this.f61509 = c21825Of2;
        } else {
            this.f61509 = c21825Of2;
            this.f61512 = c21825Of2;
        }
        this.f61510++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43725(C21825 c21825) {
        while (c21825.m48595()) {
            m43723(c21825.f70876);
            c21825 = c21825.f70877;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43724(C19003 c19003) {
        c19003.f61511 = true;
        m43725(c19003.f61512);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21825 m43726() {
        this.f61511 = true;
        return this.f61512;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f61512.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f61512.toArray(objArr);
    }

    public final Object first() {
        return this.f61512.f70876;
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.f61512.f70876;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m43727() {
        C21825 c21825 = this.f61512;
        Object obj = c21825.f70876;
        if (!c21825.isEmpty()) {
            C21825 c21826 = this.f61512.f70877;
            this.f61512 = c21826;
            if (c21826.isEmpty()) {
                this.f61509 = null;
            }
            this.f61510--;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C18297 c18297 = new C18297();
        c18297.f58384 = this.f61512;
        return c18297;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        m43723(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f61512.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m43723(it.next());
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        m43723(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object poll() {
        return m43727();
    }

    public final Object last() {
        C21825 c21825 = this.f61509;
        if (c21825 != null) {
            return c21825.f70876;
        }
        return null;
    }
}
