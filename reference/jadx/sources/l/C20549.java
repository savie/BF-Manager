package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩷֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20549 extends AbstractC23496 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10672 f66547;

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C20549(C10672 c10672) {
        this.f66547 = c10672;
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC13431 iterator() {
        return new C7143(this.f66547);
    }

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C15611(this.f66547);
    }

    @Override // l.AbstractC15735, l.InterfaceC22603
    public final void forEach(IntConsumer intConsumer) {
        C10672 c10672 = this.f66547;
        int[] iArr = c10672.f36415;
        if (c10672.f36419) {
            intConsumer.accept(iArr[c10672.f36416]);
        }
        int i = c10672.f36416;
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
        return this.f66547.f36410;
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        return this.f66547.mo26879(i);
    }

    @Override // l.AbstractC23496
    public final boolean remove(int i) {
        C10672 c10672 = this.f66547;
        int i2 = c10672.f36410;
        c10672.remove(i);
        return c10672.f36410 != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f66547.clear();
    }
}
