package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes5.dex */
public final class C21018 implements InterfaceC15970, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f67182 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9829 f67183;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f67184;

    public C21018(C9829 c9829, int i) {
        this.f67183 = c9829;
        this.f67184 = i;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f67184 < this.f67183.f31644;
    }

    @Override // l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f67184 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f67183.f31642;
        int i = this.f67184;
        this.f67184 = i + 1;
        this.f67182 = i;
        return objArr[i];
    }

    @Override // l.InterfaceC6847, java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f67183.f31642;
        int i = this.f67184 - 1;
        this.f67184 = i;
        this.f67182 = i;
        return objArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f67184;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f67184 - 1;
    }

    @Override // l.InterfaceC15970, java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f67184;
        this.f67184 = i + 1;
        this.f67183.add(i, obj);
        this.f67182 = -1;
    }

    @Override // l.InterfaceC15970, java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f67182;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f67183.set(i, obj);
    }

    @Override // l.InterfaceC15970, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        int i = this.f67182;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f67183.remove(i);
        int i2 = this.f67182;
        int i3 = this.f67184;
        if (i2 < i3) {
            this.f67184 = i3 - 1;
        }
        this.f67182 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C9829 c9829 = this.f67183;
        Object[] objArr = c9829.f31642;
        while (true) {
            int i = this.f67184;
            if (i >= c9829.f31644) {
                return;
            }
            this.f67184 = i + 1;
            this.f67182 = i;
            consumer.accept(objArr[i]);
        }
    }
}
