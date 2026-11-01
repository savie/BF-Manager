package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۠۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5QL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8049 extends AbstractC8755 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC19338 f28190;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Iterator f28191;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f28192;

    public C8049(AbstractC19338 abstractC19338, int i, Iterator it) {
        this.f28190 = abstractC19338;
        this.f28192 = i - 1;
        this.f28191 = it;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f28191 == null) {
            try {
                this.f28191 = AbstractC19338.m44323(this.f28190, this.f28192 + 1);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException();
            }
        }
        return this.f28191.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (this.f28191 == null) {
            try {
                this.f28191 = AbstractC19338.m44323(this.f28190, this.f28192 + 1);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException();
            }
        }
        Object next = this.f28191.next();
        this.f28192++;
        return next;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f28192 >= 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f28192 + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        this.f28191 = null;
        try {
            AbstractC19338 abstractC19338 = this.f28190;
            int i = this.f28192;
            this.f28192 = i - 1;
            return AbstractC19338.m44323(abstractC19338, i).next();
        } catch (IndexOutOfBoundsException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f28192;
    }
}
