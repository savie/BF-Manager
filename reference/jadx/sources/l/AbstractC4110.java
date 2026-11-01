package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2GI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4110 extends AbstractC13284 implements InterfaceC18222, InterfaceC6206 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo11696(int i, long j);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract void mo11698(int i, long j);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Long) obj).longValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo11695(((Long) obj).longValue());
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        return Long.valueOf(mo11697());
    }

    @Override // l.AbstractC0500, java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f44123 > 0;
    }

    @Override // l.InterfaceC18222
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public long mo11697() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f44123 - 1;
        this.f44123 = i;
        this.f44122 = i;
        return mo17137(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f44123;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f44123 - 1;
    }

    @Override // l.InterfaceC18222
    public void add(long j) {
        int i = this.f44123;
        this.f44123 = i + 1;
        mo11696(i, j);
        this.f44122 = -1;
    }

    @Override // l.InterfaceC18222
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo11695(long j) {
        int i = this.f44122;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo11698(i, j);
    }
}
