package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes5.dex */
public final class C20731 implements InterfaceC8273, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f66432 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14763 f66433;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f66434;

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

    public C20731(int i, C14763 c14763) {
        this.f66433 = c14763;
        this.f66434 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f66434 < this.f66433.f48234;
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f66434 > 0;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f66433.f48233;
        int i = this.f66434;
        this.f66434 = i + 1;
        this.f66432 = i;
        return iArr[i];
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ܽۙ */
    public final int mo12330() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f66433.f48233;
        int i = this.f66434 - 1;
        this.f66434 = i;
        this.f66432 = i;
        return iArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f66434;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f66434 - 1;
    }

    @Override // l.InterfaceC8273
    public final void add(int i) {
        int i2 = this.f66434;
        this.f66434 = i2 + 1;
        this.f66433.add(i2, i);
        this.f66432 = -1;
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ۙ */
    public final void mo12327(int i) {
        int i2 = this.f66432;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        this.f66433.set(i2, i);
    }

    @Override // l.InterfaceC8273, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f66432;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f66433.mo14697(i);
        int i2 = this.f66432;
        int i3 = this.f66434;
        if (i2 < i3) {
            this.f66434 = i3 - 1;
        }
        this.f66432 = -1;
    }

    @Override // l.InterfaceC24073
    public final void forEachRemaining(IntConsumer intConsumer) {
        C14763 c14763 = this.f66433;
        int[] iArr = c14763.f48233;
        while (true) {
            int i = this.f66434;
            if (i >= c14763.f48234) {
                return;
            }
            this.f66434 = i + 1;
            this.f66432 = i;
            intConsumer.accept(iArr[i]);
        }
    }
}
