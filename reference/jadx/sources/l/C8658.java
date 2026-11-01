package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes4.dex */
public final class C8658 implements InterfaceC20921, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19947 f29848;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f29849 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f29850;

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

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        return Character.valueOf(mo19146());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C23038.m50970(this);
    }

    public C8658(C19947 c19947, int i) {
        this.f29848 = c19947;
        this.f29850 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f29850 < this.f29848.f63896;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f29850 > 0;
    }

    @Override // l.InterfaceC15277
    /* JADX INFO: renamed from: ᩵ܰ */
    public final char mo1416() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f29848.f63895;
        int i = this.f29850;
        this.f29850 = i + 1;
        this.f29849 = i;
        return cArr[i];
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ֫ۙ */
    public final char mo19146() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f29848.f63895;
        int i = this.f29850 - 1;
        this.f29850 = i;
        this.f29849 = i;
        return cArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f29850;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f29850 - 1;
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ܰ */
    public final void mo19150(char c) {
        int i = this.f29850;
        this.f29850 = i + 1;
        this.f29848.mo26241(c, i);
        this.f29849 = -1;
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ۖ */
    public final void mo19147(char c) {
        int i = this.f29849;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f29848.mo26237(c, i);
    }

    @Override // l.InterfaceC20921, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f29849;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f29848.mo26242(i);
        int i2 = this.f29849;
        int i3 = this.f29850;
        if (i2 < i3) {
            this.f29850 = i3 - 1;
        }
        this.f29849 = -1;
    }

    @Override // l.InterfaceC3758
    /* JADX INFO: renamed from: ܰ */
    public final void forEachRemaining(InterfaceC1164 interfaceC1164) {
        C19947 c19947 = this.f29848;
        char[] cArr = c19947.f63895;
        while (true) {
            int i = this.f29850;
            if (i >= c19947.f63896) {
                return;
            }
            this.f29850 = i + 1;
            this.f29849 = i;
            interfaceC1164.mo4297(cArr[i]);
        }
    }
}
