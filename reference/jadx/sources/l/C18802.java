package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18802 implements InterfaceC8360, Serializable, Cloneable, InterfaceC19597 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo1358((Character) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
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

    @Override // l.InterfaceC21040
    /* JADX INFO: renamed from: ᩷ */
    public final void forEachRemaining(InterfaceC12089 interfaceC12089) {
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1362(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        mo1359();
        throw null;
    }

    @Override // l.InterfaceC24073
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۙ */
    public final void mo1356(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC21040
    /* JADX INFO: renamed from: ᩵᩷ */
    public final char mo5320() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۠ۙ */
    public final char mo1359() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC8360, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C9851.f31712;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C14326.m34752(this);
    }

    private Object readResolve() {
        return C9851.f31712;
    }
}
