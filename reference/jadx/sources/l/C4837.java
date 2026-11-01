package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۙᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes3.dex */
public final class C4837 implements InterfaceC13722 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC13722 f16993;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11894 f16994;

    public C4837(C11894 c11894, InterfaceC13722 interfaceC13722) {
        this.f16994 = c11894;
        this.f16993 = interfaceC13722;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16993.nextIndex() - this.f16994.f39905;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f16993.previousIndex() - this.f16994.f39905;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f16993.nextIndex() < this.f16994.f39904;
    }

    @Override // l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f16993.previousIndex() >= this.f16994.f39905;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f16993.next();
    }

    @Override // l.InterfaceC21086, java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f16993.previous();
    }

    @Override // l.InterfaceC13722, java.util.ListIterator
    public final void add(Object obj) {
        this.f16993.add(obj);
    }

    @Override // l.InterfaceC13722, java.util.ListIterator
    public final void set(Object obj) {
        this.f16993.set(obj);
    }

    @Override // l.InterfaceC13722, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        this.f16993.remove();
    }
}
