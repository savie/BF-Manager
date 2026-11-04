package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۚ۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1FB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5530 extends AbstractC12987 implements InterfaceC15970, InterfaceC19597 {
    /* JADX INFO: renamed from: ۙ */
    public abstract void mo1292(int i, Object obj);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo1295(int i, Object obj);

    @Override // l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f41623 > 0;
    }

    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f41623 - 1;
        this.f41623 = i;
        this.f41622 = i;
        return mo1294(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f41623;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f41623 - 1;
    }

    @Override // l.InterfaceC15970, java.util.ListIterator
    public void add(Object obj) {
        int i = this.f41623;
        this.f41623 = i + 1;
        mo1292(i, obj);
        this.f41622 = -1;
    }

    @Override // l.InterfaceC15970, java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f41622;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo1295(i, obj);
    }
}
