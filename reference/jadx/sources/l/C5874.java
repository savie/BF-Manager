package l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۛۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5874 implements ListIterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ListIterator f20059;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f20060;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10814 f20061;

    public C5874(C10814 c10814, ListIterator listIterator) {
        this.f20059 = listIterator;
        this.f20061 = c10814;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f20059;
        listIterator.add(obj);
        listIterator.previous();
        this.f20060 = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f20059.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f20059;
        if (!listIterator.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f20060 = true;
        return listIterator.previous();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20059.hasNext();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f20059;
        if (!listIterator.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20060 = true;
        return listIterator.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20061.m27119(this.f20059.nextIndex());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        C18304.m42522("no calls to next() since the last call to remove()", this.f20060);
        this.f20059.remove();
        this.f20060 = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        C18304.m42523(this.f20060);
        this.f20059.set(obj);
    }
}
