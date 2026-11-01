package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: MO8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20590 extends AbstractC7184 implements InterfaceC12124, InterfaceC6206 {
    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23006(float f, int i);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo23007(float f, int i);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo2132(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        return Float.valueOf(mo2134());
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f23981 > 0;
    }

    /* JADX INFO: renamed from: ᩶ */
    public float mo2134() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f23981 - 1;
        this.f23981 = i;
        this.f23980 = i;
        return mo19119(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23981;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23981 - 1;
    }

    @Override // l.InterfaceC12124
    public void add(float f) {
        int i = this.f23981;
        this.f23981 = i + 1;
        mo23006(f, i);
        this.f23980 = -1;
    }

    @Override // l.InterfaceC12124
    /* JADX INFO: renamed from: ۨ */
    public final void mo2132(float f) {
        int i = this.f23980;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo23007(f, i);
    }
}
