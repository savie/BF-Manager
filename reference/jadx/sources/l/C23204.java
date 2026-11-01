package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes2.dex */
public final class C23204 implements InterfaceC13722, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8387 f75308;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f75309 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f75310;

    public C23204(C8387 c8387, int i) {
        this.f75308 = c8387;
        this.f75310 = i;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f75310 < this.f75308.f29127;
    }

    @Override // l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f75310 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f75308.f29126;
        int i = this.f75310;
        this.f75310 = i + 1;
        this.f75309 = i;
        return objArr[i];
    }

    @Override // l.InterfaceC21086, java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f75308.f29126;
        int i = this.f75310 - 1;
        this.f75310 = i;
        this.f75309 = i;
        return objArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f75310;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f75310 - 1;
    }

    @Override // l.InterfaceC13722, java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f75310;
        this.f75310 = i + 1;
        this.f75308.add(i, obj);
        this.f75309 = -1;
    }

    @Override // l.InterfaceC13722, java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f75309;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f75308.set(i, obj);
    }

    @Override // l.InterfaceC13722, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        int i = this.f75309;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f75308.remove(i);
        int i2 = this.f75309;
        int i3 = this.f75310;
        if (i2 < i3) {
            this.f75310 = i3 - 1;
        }
        this.f75309 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C8387 c8387 = this.f75308;
        Object[] objArr = c8387.f29126;
        while (true) {
            int i = this.f75310;
            if (i >= c8387.f29127) {
                return;
            }
            this.f75310 = i + 1;
            this.f75309 = i;
            consumer.accept(objArr[i]);
        }
    }
}
