package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۜܰۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5QL */
/* JADX INFO: loaded from: classes4.dex */
public final class C7183 extends AbstractC5144 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Iterator f23726;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13894 f23727;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f23728;

    public C7183(AbstractC13894 abstractC13894, int i, Iterator it) {
        this.f23727 = abstractC13894;
        this.f23728 = i - 1;
        this.f23726 = it;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f23726 == null) {
            try {
                this.f23726 = AbstractC13894.m33842(this.f23727, this.f23728 + 1);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException();
            }
        }
        return this.f23726.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (this.f23726 == null) {
            try {
                this.f23726 = AbstractC13894.m33842(this.f23727, this.f23728 + 1);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException();
            }
        }
        Object next = this.f23726.next();
        this.f23728++;
        return next;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23728 >= 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23728 + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        this.f23726 = null;
        try {
            AbstractC13894 abstractC13894 = this.f23727;
            int i = this.f23728;
            this.f23728 = i - 1;
            return AbstractC13894.m33842(abstractC13894, i).next();
        } catch (IndexOutOfBoundsException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23728;
    }
}
