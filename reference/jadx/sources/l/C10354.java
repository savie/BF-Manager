package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10354 implements InterfaceC10685, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC10685 f32973;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9608 f32974;

    @Override // java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1165.m4306(this, consumer);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo15018(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Float.valueOf(mo15019());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    @Override // l.InterfaceC24073
    /* JADX INFO: renamed from: ۤ */
    public final void forEachRemaining(InterfaceC0419 interfaceC0419) {
        C17359.requireNonNull(interfaceC0419);
        while (hasNext()) {
            interfaceC0419.mo2223(nextFloat());
        }
    }

    public C10354(C9608 c9608, InterfaceC10685 interfaceC10685) {
        this.f32974 = c9608;
        this.f32973 = interfaceC10685;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f32973.nextIndex() - this.f32974.f31088;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f32973.previousIndex() - this.f32974.f31088;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f32973.nextIndex() < this.f32974.f31089;
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f32973.previousIndex() >= this.f32974.f31088;
    }

    @Override // l.InterfaceC9367
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f32973.nextFloat();
    }

    @Override // l.InterfaceC10685
    /* JADX INFO: renamed from: ᩶ */
    public final float mo15019() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f32973.mo15019();
    }

    @Override // l.InterfaceC10685
    public final void add(float f) {
        this.f32973.add(f);
    }

    @Override // l.InterfaceC10685
    /* JADX INFO: renamed from: ۤ */
    public final void mo15018(float f) {
        this.f32973.mo15018(f);
    }

    @Override // l.InterfaceC10685, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f32973.remove();
    }
}
