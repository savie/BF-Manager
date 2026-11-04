package l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷۠ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4RU */
/* JADX INFO: loaded from: classes.dex */
public final class C21925 implements ListIterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10736 f70788;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC9070 f70789;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC9070 f70790;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC9070 f70791;

    public C21925(C10736 c10736) {
        this.f70788 = c10736;
        if (c10736.size() < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (c10736.size() == 0) {
            this.f70789 = null;
            this.f70791 = c10736.getLast();
        } else {
            AbstractC9070 first = c10736.getFirst();
            this.f70789 = first;
            this.f70791 = first.f29486;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f70789 != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        AbstractC9070 abstractC9070 = this.f70789;
        if (abstractC9070 == null) {
            throw new NoSuchElementException();
        }
        this.f70791 = abstractC9070;
        this.f70789 = abstractC9070.f29484;
        this.f70790 = abstractC9070;
        return abstractC9070;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        AbstractC9070 abstractC9070 = this.f70790;
        if (abstractC9070 != null) {
            AbstractC9070 abstractC9071 = this.f70789;
            if (abstractC9070 == abstractC9071) {
                this.f70789 = abstractC9071.f29484;
            } else {
                this.f70791 = this.f70791.f29486;
            }
            this.f70788.m27346(abstractC9070);
            this.f70790 = null;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f70791 != null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        AbstractC9070 abstractC9070 = this.f70791;
        if (abstractC9070 == null) {
            throw new NoSuchElementException();
        }
        this.f70789 = abstractC9070;
        this.f70791 = abstractC9070.f29486;
        this.f70790 = abstractC9070;
        return abstractC9070;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        AbstractC9070 abstractC9070 = this.f70789;
        C10736 c10736 = this.f70788;
        if (abstractC9070 == null) {
            return c10736.size();
        }
        if (c10736.f34093 == null) {
            c10736.f34093 = c10736.toArray();
        }
        return this.f70789.f29483;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        if (this.f70791 == null) {
            return -1;
        }
        C10736 c10736 = this.f70788;
        if (c10736.f34093 == null) {
            c10736.f34093 = c10736.toArray();
        }
        return this.f70791.f29483;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        AbstractC9070 abstractC9070 = this.f70789;
        C10736 c10736 = this.f70788;
        if (abstractC9070 != null) {
            c10736.m27347(abstractC9070, (AbstractC9070) obj);
        } else {
            AbstractC9070 abstractC9071 = this.f70791;
            if (abstractC9071 != null) {
                c10736.m27342(abstractC9071, (AbstractC9070) obj);
            } else {
                c10736.m27341((AbstractC9070) obj);
            }
        }
        this.f70791 = (AbstractC9070) obj;
        this.f70790 = null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        AbstractC9070 abstractC9070 = this.f70790;
        if (abstractC9070 != null) {
            AbstractC9070 abstractC9071 = (AbstractC9070) obj;
            this.f70788.m27344(abstractC9070, abstractC9071);
            if (this.f70790 == this.f70791) {
                this.f70791 = abstractC9071;
                return;
            } else {
                this.f70789 = abstractC9071;
                return;
            }
        }
        throw new IllegalStateException();
    }
}
