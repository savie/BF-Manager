package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܺۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes5.dex */
public final class C16586 extends AbstractC13448 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24046 f53665;

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C16586(C24046 c24046) {
        this.f53665 = c24046;
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6036 iterator() {
        return new C24792(this.f53665);
    }

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15949 spliterator() {
        return new C17332(this.f53665);
    }

    @Override // l.AbstractC6957, l.InterfaceC20206
    public final void forEach(IntConsumer intConsumer) {
        C24046 c24046 = this.f53665;
        int[] iArr = c24046.f77781;
        if (c24046.f77780) {
            intConsumer.accept(iArr[c24046.f77774]);
        }
        int i = c24046.f77774;
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
        return this.f53665.f77778;
    }

    @Override // l.InterfaceC1340
    public final boolean contains(int i) {
        return this.f53665.mo9815(i);
    }

    @Override // l.AbstractC13448
    public final boolean remove(int i) {
        C24046 c24046 = this.f53665;
        int i2 = c24046.f77778;
        c24046.remove(i);
        return c24046.f77778 != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f53665.clear();
    }
}
