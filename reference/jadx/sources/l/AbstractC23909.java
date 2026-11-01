package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩻᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1FB */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23909 extends AbstractC11209 implements InterfaceC13722, InterfaceC6206 {
    /* JADX INFO: renamed from: ۙ */
    public abstract void mo33877(int i, Object obj);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo33878(int i, Object obj);

    @Override // l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f37929 > 0;
    }

    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f37929 - 1;
        this.f37929 = i;
        this.f37928 = i;
        return mo28153(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f37929;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f37929 - 1;
    }

    @Override // l.InterfaceC13722, java.util.ListIterator
    public void add(Object obj) {
        int i = this.f37929;
        this.f37929 = i + 1;
        mo33877(i, obj);
        this.f37928 = -1;
    }

    @Override // l.InterfaceC13722, java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f37928;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo33878(i, obj);
    }
}
