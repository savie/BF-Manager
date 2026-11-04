package l;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A41S */
/* JADX INFO: loaded from: classes4.dex */
public final class C18499 extends AbstractQueue {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f60185;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f60186;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14769 f60187;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14769 f60188;

    public C18499() {
        clear();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f60188 = C14769.m35543();
        this.f60187 = null;
        this.f60186 = 0;
        this.f60185 = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m43094() {
        return this.f60186;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f60186;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return this.f60188.toArray(new Object[this.f60186]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f60186 == 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m43096() {
        return this.f60186 != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43095(Object obj) {
        C14769 c14769 = this.f60188;
        c14769.getClass();
        C14769 c147610 = new C14769(obj, c14769);
        this.f60188 = c147610;
        if (this.f60187 == null) {
            this.f60187 = c147610;
        }
        this.f60186++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43089(Object obj) {
        C11972.m30021(obj);
        if (this.f60185 && this.f60188.m35550()) {
            C14769 c14769 = this.f60188;
            C14769 c14769Of = C14769.of(c14769.f48335);
            this.f60187 = c14769Of;
            this.f60188 = c14769Of;
            while (true) {
                c14769 = c14769.f48336;
                if (!c14769.m35550()) {
                    break;
                }
                this.f60187.f48336 = C14769.of(c14769.f48335);
                this.f60187 = this.f60187.f48336;
            }
        }
        C14769 c14769Of2 = C14769.of(obj);
        C14769 c147610 = this.f60187;
        if (c147610 != null) {
            c147610.f48336 = c14769Of2;
            this.f60187 = c14769Of2;
        } else {
            this.f60187 = c14769Of2;
            this.f60188 = c14769Of2;
        }
        this.f60186++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43090(C14769 c14769) {
        while (c14769.m35550()) {
            m43089(c14769.f48335);
            c14769 = c14769.f48336;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43091(C18499 c18499) {
        c18499.f60185 = true;
        m43090(c18499.f60188);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14769 m43093() {
        this.f60185 = true;
        return this.f60188;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f60188.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f60188.toArray(objArr);
    }

    public final Object first() {
        return this.f60188.f48335;
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.f60188.f48335;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m43092() {
        C14769 c14769 = this.f60188;
        Object obj = c14769.f48335;
        if (!c14769.isEmpty()) {
            C14769 c147610 = this.f60188.f48336;
            this.f60188 = c147610;
            if (c147610.isEmpty()) {
                this.f60187 = null;
            }
            this.f60186--;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C21483 c21483 = new C21483();
        c21483.f68693 = this.f60188;
        return c21483;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        m43089(obj);
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
            if (!this.f60188.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m43089(it.next());
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
        m43089(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object poll() {
        return m43092();
    }

    public final Object last() {
        C14769 c14769 = this.f60187;
        if (c14769 != null) {
            return c14769.f48335;
        }
        return null;
    }
}
