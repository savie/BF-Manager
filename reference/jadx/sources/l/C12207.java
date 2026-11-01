package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۫ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes4.dex */
public final class C12207 implements InterfaceC21191, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC21191 f40812;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5856 f40813;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo3717((Integer) obj);
    }

    @Override // l.InterfaceC3758
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC13431, l.InterfaceC22104, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // l.InterfaceC22104
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C5170.$default$forEachRemaining((InterfaceC22104) this, intConsumer);
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

    public C12207(C5856 c5856, InterfaceC21191 interfaceC21191) {
        this.f40813 = c5856;
        this.f40812 = interfaceC21191;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40812.nextIndex() - this.f40813.f20000;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40812.previousIndex() - this.f40813.f20000;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f40812.nextIndex() < this.f40813.f19999;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f40812.previousIndex() >= this.f40813.f20000;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f40812.nextInt();
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ᩸ۙ */
    public final int mo3719() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f40812.mo3719();
    }

    @Override // l.InterfaceC21191
    public final void add(int i) {
        this.f40812.add(i);
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ۙ */
    public final void mo3716(int i) {
        this.f40812.mo3716(i);
    }

    @Override // l.InterfaceC21191, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f40812.remove();
    }
}
