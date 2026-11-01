package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19448 implements InterfaceC12124, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC12124 f62622;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10276 f62623;

    @Override // java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C8596.m22379(this, consumer);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo2132(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        return Float.valueOf(mo2134());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    @Override // l.InterfaceC3758
    /* JADX INFO: renamed from: ۨ */
    public final void forEachRemaining(InterfaceC17767 interfaceC17767) {
        C13638.requireNonNull(interfaceC17767);
        while (hasNext()) {
            interfaceC17767.mo35707(nextFloat());
        }
    }

    public C19448(C10276 c10276, InterfaceC12124 interfaceC12124) {
        this.f62623 = c10276;
        this.f62622 = interfaceC12124;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f62622.nextIndex() - this.f62623.f35021;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f62622.previousIndex() - this.f62623.f35021;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f62622.nextIndex() < this.f62623.f35020;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f62622.previousIndex() >= this.f62623.f35021;
    }

    @Override // l.InterfaceC10007
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f62622.nextFloat();
    }

    @Override // l.InterfaceC12124
    /* JADX INFO: renamed from: ᩶ */
    public final float mo2134() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f62622.mo2134();
    }

    @Override // l.InterfaceC12124
    public final void add(float f) {
        this.f62622.add(f);
    }

    @Override // l.InterfaceC12124
    /* JADX INFO: renamed from: ۨ */
    public final void mo2132(float f) {
        this.f62622.mo2132(f);
    }

    @Override // l.InterfaceC12124, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f62622.remove();
    }
}
