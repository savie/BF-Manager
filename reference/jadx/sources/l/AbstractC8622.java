package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۠ۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: MO8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8622 extends AbstractC2656 implements InterfaceC10685, InterfaceC19597 {
    /* JADX INFO: renamed from: ۙ */
    public abstract void mo5140(float f, int i);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo5143(float f, int i);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo15018(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Float.valueOf(mo15019());
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f8467 > 0;
    }

    @Override // l.InterfaceC10685
    /* JADX INFO: renamed from: ᩶ */
    public float mo15019() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f8467 - 1;
        this.f8467 = i;
        this.f8466 = i;
        return mo5142(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8467;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8467 - 1;
    }

    @Override // l.InterfaceC10685
    public void add(float f) {
        int i = this.f8467;
        this.f8467 = i + 1;
        mo5140(f, i);
        this.f8466 = -1;
    }

    @Override // l.InterfaceC10685
    /* JADX INFO: renamed from: ۤ */
    public final void mo15018(float f) {
        int i = this.f8466;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo5143(f, i);
    }
}
