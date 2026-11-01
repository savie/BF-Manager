package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۠֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7849 extends AbstractC15735 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10672 f25828;

    @Override // l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C7849(C10672 c10672) {
        this.f25828 = c10672;
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC13431 iterator() {
        return new C17021(this.f25828);
    }

    @Override // l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C5732(this.f25828);
    }

    @Override // l.AbstractC15735, l.InterfaceC22603
    public final void forEach(IntConsumer intConsumer) {
        C10672 c10672 = this.f25828;
        int[] iArr = c10672.f36415;
        int[] iArr2 = c10672.f36413;
        if (c10672.f36419) {
            intConsumer.accept(iArr2[c10672.f36416]);
        }
        int i = c10672.f36416;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                intConsumer.accept(iArr2[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f25828.f36410;
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        return this.f25828.m26877(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f25828.clear();
    }
}
