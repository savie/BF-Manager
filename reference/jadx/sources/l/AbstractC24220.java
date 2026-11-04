package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩺ۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 2GI */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC24220 extends AbstractC6320 implements InterfaceC0353, InterfaceC19597 {
    /* JADX INFO: renamed from: ۙ */
    public abstract void mo20101(int i, long j);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo20102(int i, long j);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Long) obj).longValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo2124(((Long) obj).longValue());
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Long.valueOf(mo2123());
    }

    @Override // l.AbstractC5091, java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f21423 > 0;
    }

    /* JADX INFO: renamed from: ᩴۙ */
    public long mo2123() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f21423 - 1;
        this.f21423 = i;
        this.f21422 = i;
        return mo18041(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21423;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21423 - 1;
    }

    @Override // l.InterfaceC0353
    public void add(long j) {
        int i = this.f21423;
        this.f21423 = i + 1;
        mo20101(i, j);
        this.f21422 = -1;
    }

    @Override // l.InterfaceC0353
    /* JADX INFO: renamed from: ᩸ */
    public final void mo2124(long j) {
        int i = this.f21422;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo20102(i, j);
    }
}
