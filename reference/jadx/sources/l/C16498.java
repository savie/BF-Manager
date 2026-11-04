package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܺ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes5.dex */
public final class C16498 implements InterfaceC15970 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC15970 f53464;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15752 f53465;

    public C16498(C15752 c15752, InterfaceC15970 interfaceC15970) {
        this.f53465 = c15752;
        this.f53464 = interfaceC15970;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f53464.nextIndex() - this.f53465.f51221;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f53464.previousIndex() - this.f53465.f51221;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f53464.nextIndex() < this.f53465.f51222;
    }

    @Override // l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f53464.previousIndex() >= this.f53465.f51221;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f53464.next();
    }

    @Override // l.InterfaceC6847, java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f53464.previous();
    }

    @Override // l.InterfaceC15970, java.util.ListIterator
    public final void add(Object obj) {
        this.f53464.add(obj);
    }

    @Override // l.InterfaceC15970, java.util.ListIterator
    public final void set(Object obj) {
        this.f53464.set(obj);
    }

    @Override // l.InterfaceC15970, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        this.f53464.remove();
    }
}
