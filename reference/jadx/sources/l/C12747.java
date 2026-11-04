package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۫֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12747 implements InterfaceC8273, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f40812;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16476 f40813;

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

    public C12747(C16476 c16476, int i) {
        this.f40813 = c16476;
        this.f40812 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f40812 < this.f40813.f53438.length;
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f40812 > 0;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        if (hasNext()) {
            int[] iArr = this.f40813.f53438;
            int i = this.f40812;
            this.f40812 = i + 1;
            return iArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ܽۙ */
    public final int mo12330() {
        if (hasPrevious()) {
            int[] iArr = this.f40813.f53438;
            int i = this.f40812 - 1;
            this.f40812 = i;
            return iArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40812;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40812 - 1;
    }

    @Override // l.InterfaceC24073
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f40813.f53438;
        while (true) {
            int i = this.f40812;
            if (i >= iArr.length) {
                return;
            }
            this.f40812 = i + 1;
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
