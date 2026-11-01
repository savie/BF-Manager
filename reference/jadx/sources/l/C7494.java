package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۟۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7494 extends AbstractC23496 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16667 f24959;

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C7494(C16667 c16667) {
        this.f24959 = c16667;
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        return this.f24959.m39132(i) != -1;
    }

    @Override // l.AbstractC23496
    public final boolean remove(int i) {
        C16667 c16667 = this.f24959;
        int iM39132 = c16667.m39132(i);
        if (iM39132 == -1) {
            return false;
        }
        int i2 = (c16667.f53437 - iM39132) - 1;
        int[] iArr = c16667.f53439;
        int i3 = iM39132 + 1;
        System.arraycopy(iArr, i3, iArr, iM39132, i2);
        Object[] objArr = c16667.f53435;
        System.arraycopy(objArr, i3, objArr, iM39132, i2);
        int i4 = c16667.f53437 - 1;
        c16667.f53437 = i4;
        c16667.f53435[i4] = null;
        return true;
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C8906(this);
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC13431 iterator() {
        return new C8906(this);
    }

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C10317(this, 0, this.f24959.f53437);
    }

    @Override // l.AbstractC15735, l.InterfaceC22603
    public final void forEach(IntConsumer intConsumer) {
        C16667 c16667 = this.f24959;
        int[] iArr = c16667.f53439;
        int i = c16667.f53437;
        for (int i2 = 0; i2 < i; i2++) {
            intConsumer.accept(iArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24959.f53437;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f24959.clear();
    }
}
