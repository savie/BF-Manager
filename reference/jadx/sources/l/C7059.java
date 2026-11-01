package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7059 extends AbstractC23496 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9177 f23702;

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C7059(C9177 c9177) {
        this.f23702 = c9177;
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC13431 iterator() {
        return new C4236(this.f23702);
    }

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C23288(this.f23702);
    }

    @Override // l.AbstractC15735, l.InterfaceC22603
    public final void forEach(IntConsumer intConsumer) {
        C9177 c9177 = this.f23702;
        int[] iArr = c9177.f31228;
        if (c9177.f31234) {
            intConsumer.accept(iArr[c9177.f31231]);
        }
        int i = c9177.f31231;
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
        return this.f23702.f31238;
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        return this.f23702.mo9047(i);
    }

    @Override // l.AbstractC23496
    public final boolean remove(int i) {
        C9177 c9177 = this.f23702;
        int i2 = c9177.f31238;
        c9177.remove(i);
        return c9177.f31238 != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f23702.clear();
    }
}
