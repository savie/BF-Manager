package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8221 implements InterfaceC20921, Serializable, Cloneable, InterfaceC6206 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo19148((Character) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
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
        mo19149((Character) obj);
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo19148(Character ch) {
        C7515.m20022((InterfaceC20921) this, ch);
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ void mo19149(Character ch) {
        C7515.m20024((InterfaceC20921) this, ch);
    }

    @Override // l.InterfaceC15277
    /* JADX INFO: renamed from: ܰ */
    public final void forEachRemaining(InterfaceC1164 interfaceC1164) {
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ۖ */
    public final void mo19147(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        mo19146();
        throw null;
    }

    @Override // l.InterfaceC3758
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ܰ */
    public final void mo19150(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC15277
    /* JADX INFO: renamed from: ᩵ܰ */
    public final char mo1416() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ֫ۙ */
    public final char mo19146() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC20921, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C19510.f62751;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C23038.m50970(this);
    }

    private Object readResolve() {
        return C19510.f62751;
    }
}
