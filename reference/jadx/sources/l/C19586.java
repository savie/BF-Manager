package l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩵ܽۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4RU */
/* JADX INFO: loaded from: classes4.dex */
public final class C19586 implements ListIterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC23114 f62916;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC23114 f62917;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9003 f62918;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC23114 f62919;

    public C19586(C9003 c9003) {
        this.f62918 = c9003;
        if (c9003.size() < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (c9003.size() == 0) {
            this.f62917 = null;
            this.f62919 = c9003.getLast();
        } else {
            AbstractC23114 first = c9003.getFirst();
            this.f62917 = first;
            this.f62919 = first.f75075;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f62917 != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        AbstractC23114 abstractC23114 = this.f62917;
        if (abstractC23114 == null) {
            throw new NoSuchElementException();
        }
        this.f62919 = abstractC23114;
        this.f62917 = abstractC23114.f75076;
        this.f62916 = abstractC23114;
        return abstractC23114;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        AbstractC23114 abstractC23114 = this.f62916;
        if (abstractC23114 != null) {
            AbstractC23114 abstractC23115 = this.f62917;
            if (abstractC23114 == abstractC23115) {
                this.f62917 = abstractC23115.f75076;
            } else {
                this.f62919 = this.f62919.f75075;
            }
            this.f62918.m23319(abstractC23114);
            this.f62916 = null;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f62919 != null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        AbstractC23114 abstractC23114 = this.f62919;
        if (abstractC23114 == null) {
            throw new NoSuchElementException();
        }
        this.f62917 = abstractC23114;
        this.f62919 = abstractC23114.f75075;
        this.f62916 = abstractC23114;
        return abstractC23114;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        AbstractC23114 abstractC23114 = this.f62917;
        C9003 c9003 = this.f62918;
        if (abstractC23114 == null) {
            return c9003.size();
        }
        if (c9003.f30795 == null) {
            c9003.f30795 = c9003.toArray();
        }
        return this.f62917.f75074;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        if (this.f62919 == null) {
            return -1;
        }
        C9003 c9003 = this.f62918;
        if (c9003.f30795 == null) {
            c9003.f30795 = c9003.toArray();
        }
        return this.f62919.f75074;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        AbstractC23114 abstractC23114 = this.f62917;
        C9003 c9003 = this.f62918;
        if (abstractC23114 != null) {
            c9003.m23320(abstractC23114, (AbstractC23114) obj);
        } else {
            AbstractC23114 abstractC23115 = this.f62919;
            if (abstractC23115 != null) {
                c9003.m23316(abstractC23115, (AbstractC23114) obj);
            } else {
                c9003.m23315((AbstractC23114) obj);
            }
        }
        this.f62919 = (AbstractC23114) obj;
        this.f62916 = null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        AbstractC23114 abstractC23114 = this.f62916;
        if (abstractC23114 != null) {
            AbstractC23114 abstractC23115 = (AbstractC23114) obj;
            this.f62918.m23317(abstractC23114, abstractC23115);
            if (this.f62916 == this.f62919) {
                this.f62919 = abstractC23115;
                return;
            } else {
                this.f62917 = abstractC23115;
                return;
            }
        }
        throw new IllegalStateException();
    }
}
