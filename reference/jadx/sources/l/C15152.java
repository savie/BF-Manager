package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15152 implements InterfaceC20921, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC20921 f49495;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17973 f49496;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo19148((Character) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23038.m50971(this, consumer);
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

    @Override // l.InterfaceC3758
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void forEachRemaining(InterfaceC1164 interfaceC1164) {
        C23038.m50972((InterfaceC15277) this, interfaceC1164);
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        return Character.valueOf(mo19146());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C23038.m50970(this);
    }

    public C15152(C17973 c17973, InterfaceC20921 interfaceC20921) {
        this.f49496 = c17973;
        this.f49495 = interfaceC20921;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f49495.nextIndex() - this.f49496.f57484;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f49495.previousIndex() - this.f49496.f57484;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f49495.nextIndex() < this.f49496.f57483;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f49495.previousIndex() >= this.f49496.f57484;
    }

    @Override // l.InterfaceC15277
    /* JADX INFO: renamed from: ᩵ܰ */
    public final char mo1416() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f49495.mo1416();
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ֫ۙ */
    public final char mo19146() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f49495.mo19146();
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ܰ */
    public final void mo19150(char c) {
        this.f49495.mo19150(c);
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ۖ */
    public final void mo19147(char c) {
        this.f49495.mo19147(c);
    }

    @Override // l.InterfaceC20921, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f49495.remove();
    }
}
