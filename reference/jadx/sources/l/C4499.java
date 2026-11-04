package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۘ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4499 extends AbstractC13448 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1516 f16069;

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C4499(C1516 c1516) {
        this.f16069 = c1516;
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6036 iterator() {
        return new C24637(this.f16069);
    }

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15949 spliterator() {
        return new C14939(this.f16069);
    }

    @Override // l.AbstractC6957, l.InterfaceC20206
    public final void forEach(IntConsumer intConsumer) {
        C1516 c1516 = this.f16069;
        int[] iArr = c1516.f5295;
        if (c1516.f5294) {
            intConsumer.accept(iArr[c1516.f5288]);
        }
        int i = c1516.f5288;
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
        return this.f16069.f5292;
    }

    @Override // l.InterfaceC1340
    public final boolean contains(int i) {
        return this.f16069.mo5392(i);
    }

    @Override // l.AbstractC13448
    public final boolean remove(int i) {
        C1516 c1516 = this.f16069;
        int i2 = c1516.f5292;
        c1516.remove(i);
        return c1516.f5292 != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f16069.clear();
    }
}
