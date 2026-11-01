package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۜ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7080 extends AbstractC4257 implements InterfaceC21191, InterfaceC6206 {
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo3717((Integer) obj);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo3718((Integer) obj);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo11025(int i, int i2);

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3717(Integer num) {
        C7786.m20457((InterfaceC21191) this, num);
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo11028(int i, int i2);

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo3718(Integer num) {
        C7786.m20460((InterfaceC21191) this, num);
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        return Integer.valueOf(mo3719());
    }

    @Override // l.AbstractC19968, java.util.Iterator, java.util.ListIterator
    public final Integer next() {
        return C1435.m5011(this);
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f15371 > 0;
    }

    /* JADX INFO: renamed from: ᩸ۙ */
    public int mo3719() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f15371 - 1;
        this.f15371 = i;
        this.f15370 = i;
        return mo11027(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15371;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15371 - 1;
    }

    @Override // l.InterfaceC21191
    public void add(int i) {
        int i2 = this.f15371;
        this.f15371 = i2 + 1;
        mo11025(i2, i);
        this.f15370 = -1;
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ۙ */
    public final void mo3716(int i) {
        int i2 = this.f15370;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        mo11028(i2, i);
    }
}
