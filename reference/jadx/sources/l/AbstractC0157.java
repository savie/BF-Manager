package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0157 extends AbstractC18056 implements InterfaceC8360, InterfaceC19597 {
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo1358((Character) obj);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo1360((Character) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo1357(char c, int i);

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo1358(Character ch) {
        C2394.m8136((InterfaceC8360) this, ch);
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo1360(Character ch) {
        C2394.m8138((InterfaceC8360) this, ch);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo1361(char c, int i);

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Character.valueOf(mo1359());
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        return C14326.m34752(this);
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f59121 > 0;
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public char mo1359() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f59121 - 1;
        this.f59121 = i;
        this.f59120 = i;
        return mo2590(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f59121;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f59121 - 1;
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo1356(char c) {
        int i = this.f59121;
        this.f59121 = i + 1;
        mo1357(c, i);
        this.f59120 = -1;
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo1362(char c) {
        int i = this.f59120;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo1361(c, i);
    }
}
