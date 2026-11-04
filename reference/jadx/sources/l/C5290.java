package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۚ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5290 implements InterfaceC8273, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f18618;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11255 f18619;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo12329((Integer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6036, l.InterfaceC20343, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12001.m30186(this, consumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo12332((Integer) obj);
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo12329(Integer num) {
        C2307.m7790((InterfaceC8273) this, num);
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo12332(Integer num) {
        C2307.m7793((InterfaceC8273) this, num);
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Integer.valueOf(mo12330());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C12001.m30185(this);
    }

    public C5290(C11255 c11255, int i) {
        this.f18619 = c11255;
        this.f18618 = i + c11255.f35538;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f18618 < this.f18619.f35535;
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f18618 > this.f18619.f35538;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f18619.f35536;
        int i = this.f18618;
        this.f18618 = i + 1;
        return iArr[i];
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ܽۙ */
    public final int mo12330() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f18619.f35536;
        int i = this.f18618 - 1;
        this.f18618 = i;
        return iArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18618 - this.f18619.f35538;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.f18618 - this.f18619.f35538) - 1;
    }

    @Override // l.InterfaceC24073
    public final void forEachRemaining(IntConsumer intConsumer) {
        C11255 c11255 = this.f18619;
        int[] iArr = c11255.f35536;
        while (true) {
            int i = this.f18618;
            if (i >= c11255.f35535) {
                return;
            }
            this.f18618 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }

    @Override // l.InterfaceC8273
    public final void add(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ۙ */
    public final void mo12327(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC8273, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
