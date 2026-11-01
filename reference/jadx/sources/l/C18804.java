package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18804 implements InterfaceC20921, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f60945;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char[] f60946;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f60947;

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

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ۖ */
    public final void mo19147(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        return Character.valueOf(mo19146());
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ܰ */
    public final void mo19150(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC20921, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C23038.m50970(this);
    }

    public C18804(char[] cArr, int i) {
        this.f60946 = cArr;
        this.f60945 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f60947 < this.f60945;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f60947 > 0;
    }

    @Override // l.InterfaceC15277
    /* JADX INFO: renamed from: ᩵ܰ */
    public final char mo1416() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f60947;
        this.f60947 = i + 1;
        return this.f60946[i];
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ֫ۙ */
    public final char mo19146() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f60947 - 1;
        this.f60947 = i;
        return this.f60946[i];
    }

    @Override // l.InterfaceC3758
    /* JADX INFO: renamed from: ܰ */
    public final void forEachRemaining(InterfaceC1164 interfaceC1164) {
        C13638.requireNonNull(interfaceC1164);
        while (true) {
            int i = this.f60947;
            if (i >= this.f60945) {
                return;
            }
            interfaceC1164.mo4297(this.f60946[i]);
            this.f60947++;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f60947;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f60947 - 1;
    }
}
