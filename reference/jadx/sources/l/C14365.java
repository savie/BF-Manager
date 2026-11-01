package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܳۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14365 implements InterfaceC21191, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f47103;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14137 f47104;

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

    public C14365(C14137 c14137, int i) {
        this.f47104 = c14137;
        this.f47103 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f47103 < this.f47104.f46397.length;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f47103 > 0;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        if (hasNext()) {
            int[] iArr = this.f47104.f46397;
            int i = this.f47103;
            this.f47103 = i + 1;
            return iArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ᩸ۙ */
    public final int mo3719() {
        if (hasPrevious()) {
            int[] iArr = this.f47104.f46397;
            int i = this.f47103 - 1;
            this.f47103 = i;
            return iArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f47103;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f47103 - 1;
    }

    @Override // l.InterfaceC3758
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f47104.f46397;
        while (true) {
            int i = this.f47103;
            if (i >= iArr.length) {
                return;
            }
            this.f47103 = i + 1;
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
