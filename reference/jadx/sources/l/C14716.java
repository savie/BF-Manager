package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܳᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C14716 extends AbstractC15735 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6644 f48133;

    @Override // l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C14716(C6644 c6644) {
        this.f48133 = c6644;
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC13431 iterator() {
        return new C12995(this.f48133);
    }

    @Override // l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C3821(this.f48133);
    }

    @Override // l.AbstractC15735, l.InterfaceC22603
    public final void forEach(IntConsumer intConsumer) {
        C6644 c6644 = this.f48133;
        Object[] objArr = c6644.f22442;
        int[] iArr = c6644.f22435;
        if (c6644.f22441) {
            intConsumer.accept(iArr[c6644.f22445]);
        }
        int i = c6644.f22445;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (objArr[i2] != null) {
                intConsumer.accept(iArr[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f48133.f22440;
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        return this.f48133.mo17316(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f48133.clear();
    }
}
