package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7615 implements InterfaceC8360, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] f25139;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f25140;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25141;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo1358((Character) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C14326.m34753(this, consumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo1360((Character) obj);
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo1358(Character ch) {
        C2394.m8136((InterfaceC8360) this, ch);
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ void mo1360(Character ch) {
        C2394.m8138((InterfaceC8360) this, ch);
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1362(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Character.valueOf(mo1359());
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۙ */
    public final void mo1356(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC8360, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C14326.m34752(this);
    }

    public C7615(char[] cArr, int i) {
        this.f25139 = cArr;
        this.f25140 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f25141 < this.f25140;
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f25141 > 0;
    }

    @Override // l.InterfaceC21040
    /* JADX INFO: renamed from: ᩵᩷ */
    public final char mo5320() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f25141;
        this.f25141 = i + 1;
        return this.f25139[i];
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۠ۙ */
    public final char mo1359() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f25141 - 1;
        this.f25141 = i;
        return this.f25139[i];
    }

    @Override // l.InterfaceC24073
    /* JADX INFO: renamed from: ᩷ */
    public final void forEachRemaining(InterfaceC12089 interfaceC12089) {
        C17359.requireNonNull(interfaceC12089);
        while (true) {
            int i = this.f25141;
            if (i >= this.f25140) {
                return;
            }
            interfaceC12089.mo10258(this.f25139[i]);
            this.f25141++;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25141;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f25141 - 1;
    }
}
