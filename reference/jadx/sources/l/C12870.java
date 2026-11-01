package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۬ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes4.dex */
public final class C12870 extends AbstractC23496 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7931 f42813;

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C12870(C7931 c7931) {
        this.f42813 = c7931;
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC13431 iterator() {
        return new C0874(this.f42813);
    }

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C3696(this.f42813);
    }

    @Override // l.AbstractC15735, l.InterfaceC22603
    public final void forEach(IntConsumer intConsumer) {
        C7931 c7931 = this.f42813;
        int[] iArr = c7931.f26054;
        if (c7931.f26053) {
            intConsumer.accept(iArr[c7931.f26057]);
        }
        int i = c7931.f26057;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int i3 = iArr[i2];
            if (i3 != 0) {
                intConsumer.accept(i3);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f42813.f26052;
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        return this.f42813.mo8945(i);
    }

    @Override // l.AbstractC23496
    public final boolean remove(int i) {
        C7931 c7931 = this.f42813;
        int i2 = c7931.f26052;
        c7931.remove(i);
        return c7931.f26052 != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f42813.clear();
    }
}
