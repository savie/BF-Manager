package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֨ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes3.dex */
public final class C0957 implements InterfaceC21191, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15070 f3771;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f3772 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f3773;

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
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo3717(Integer num) {
        C7786.m20457((InterfaceC21191) this, num);
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
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

    public C0957(int i, C15070 c15070) {
        this.f3771 = c15070;
        this.f3773 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3773 < this.f3771.f49126;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f3773 > 0;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f3771.f49125;
        int i = this.f3773;
        this.f3773 = i + 1;
        this.f3772 = i;
        return iArr[i];
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final int mo3719() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f3771.f49125;
        int i = this.f3773 - 1;
        this.f3773 = i;
        this.f3772 = i;
        return iArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3773;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3773 - 1;
    }

    @Override // l.InterfaceC21191
    public final void add(int i) {
        int i2 = this.f3773;
        this.f3773 = i2 + 1;
        this.f3771.add(i2, i);
        this.f3772 = -1;
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3716(int i) {
        int i2 = this.f3772;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        this.f3771.set(i2, i);
    }

    @Override // l.InterfaceC21191, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f3772;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f3771.mo3180(i);
        int i2 = this.f3772;
        int i3 = this.f3773;
        if (i2 < i3) {
            this.f3773 = i3 - 1;
        }
        this.f3772 = -1;
    }

    @Override // l.InterfaceC3758
    public final void forEachRemaining(IntConsumer intConsumer) {
        C15070 c15070 = this.f3771;
        int[] iArr = c15070.f49125;
        while (true) {
            int i = this.f3773;
            if (i >= c15070.f49126) {
                return;
            }
            this.f3773 = i + 1;
            this.f3772 = i;
            intConsumer.accept(iArr[i]);
        }
    }
}
