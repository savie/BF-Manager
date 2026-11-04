package l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֨ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0964 implements ListIterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f3521;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ListIterator f3522;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9166 f3523;

    public C0964(C9166 c9166, ListIterator listIterator) {
        this.f3522 = listIterator;
        this.f3523 = c9166;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f3522;
        listIterator.add(obj);
        listIterator.previous();
        this.f3521 = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3522.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f3522;
        if (!listIterator.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f3521 = true;
        return listIterator.previous();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3522.hasNext();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f3522;
        if (!listIterator.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3521 = true;
        return listIterator.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3523.m24297(this.f3522.nextIndex());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        C12128.m30314("no calls to next() since the last call to remove()", this.f3521);
        this.f3522.remove();
        this.f3521 = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        C12128.m30315(this.f3521);
        this.f3522.set(obj);
    }
}
