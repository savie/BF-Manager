package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֫ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1663 implements InterfaceC21191, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f6630;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3074 f6631;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo3717((Integer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC13431, l.InterfaceC22104, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo3718((Integer) obj);
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3717(Integer num) {
        C7786.m20457((InterfaceC21191) this, num);
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo3718(Integer num) {
        C7786.m20460((InterfaceC21191) this, num);
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        return Integer.valueOf(mo3719());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C1435.m5011(this);
    }

    public C1663(C3074 c3074, int i) {
        this.f6631 = c3074;
        this.f6630 = i + c3074.f11642;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f6630 < this.f6631.f11641;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f6630 > this.f6631.f11642;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f6631.f11640;
        int i = this.f6630;
        this.f6630 = i + 1;
        return iArr[i];
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ᩸ۙ */
    public final int mo3719() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f6631.f11640;
        int i = this.f6630 - 1;
        this.f6630 = i;
        return iArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6630 - this.f6631.f11642;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.f6630 - this.f6631.f11642) - 1;
    }

    @Override // l.InterfaceC3758
    public final void forEachRemaining(IntConsumer intConsumer) {
        C3074 c3074 = this.f6631;
        int[] iArr = c3074.f11640;
        while (true) {
            int i = this.f6630;
            if (i >= c3074.f11641) {
                return;
            }
            this.f6630 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }

    @Override // l.InterfaceC21191
    public final void add(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ۙ */
    public final void mo3716(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC21191, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
