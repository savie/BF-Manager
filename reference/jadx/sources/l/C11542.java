package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۨۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes4.dex */
public class C11542 implements InterfaceC21191, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C13659 f38782;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22125 f38783;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C13659 f38784;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13659 f38785;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f38786 = 0;

    @Override // l.InterfaceC21191
    public final /* synthetic */ void add(int i) {
        C7786.m20456();
        throw null;
    }

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
    public final /* synthetic */ void mo3716(int i) {
        C7786.m20459();
        throw null;
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

    public C11542(C22125 c22125) {
        this.f38783 = c22125;
        this.f38782 = c22125.f71625;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f38782 != null;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f38785 != null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo7213() {
        this.f38782 = this.f38782.m33357();
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C13659 c13659 = this.f38782;
        this.f38785 = c13659;
        this.f38784 = c13659;
        this.f38786++;
        mo7213();
        return this.f38784.f45048;
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo7214() {
        this.f38785 = this.f38785.m33356();
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ᩸ۙ */
    public final int mo3719() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C13659 c13659 = this.f38785;
        this.f38782 = c13659;
        this.f38784 = c13659;
        this.f38786--;
        mo7214();
        return this.f38784.f45048;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f38786;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f38786 - 1;
    }

    @Override // l.InterfaceC21191, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        C13659 c13659 = this.f38784;
        if (c13659 == null) {
            throw new IllegalStateException();
        }
        if (c13659 == this.f38785) {
            this.f38786--;
        }
        this.f38785 = c13659;
        this.f38782 = c13659;
        mo7214();
        mo7213();
        this.f38783.remove(this.f38784.f45048);
        this.f38784 = null;
    }
}
