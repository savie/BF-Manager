package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3798 extends AbstractC23936 implements InterfaceC8273, InterfaceC19597 {
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo12329((Integer) obj);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo12332((Integer) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo12328(int i, int i2);

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo12329(Integer num) {
        C2307.m7790((InterfaceC8273) this, num);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo12331(int i, int i2);

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo12332(Integer num) {
        C2307.m7793((InterfaceC8273) this, num);
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Integer.valueOf(mo12330());
    }

    @Override // l.AbstractC13668, java.util.Iterator, java.util.ListIterator
    public final Integer next() {
        return C12001.m30185(this);
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f77493 > 0;
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int mo12330() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f77493 - 1;
        this.f77493 = i;
        this.f77492 = i;
        return mo18481(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f77493;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f77493 - 1;
    }

    @Override // l.InterfaceC8273
    public void add(int i) {
        int i2 = this.f77493;
        this.f77493 = i2 + 1;
        mo12328(i2, i);
        this.f77492 = -1;
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12327(int i) {
        int i2 = this.f77492;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        mo12331(i2, i);
    }
}
