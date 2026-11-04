package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۠ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8382 extends AbstractC13448 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15399 f27488;

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C8382(C15399 c15399) {
        this.f27488 = c15399;
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6036 iterator() {
        return new C2416(this.f27488);
    }

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15949 spliterator() {
        return new C6891(this.f27488);
    }

    @Override // l.AbstractC6957, l.InterfaceC20206
    public final void forEach(IntConsumer intConsumer) {
        C15399 c15399 = this.f27488;
        int[] iArr = c15399.f50196;
        if (c15399.f50203) {
            intConsumer.accept(iArr[c15399.f50194]);
        }
        int i = c15399.f50194;
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
        return this.f27488.f50197;
    }

    @Override // l.InterfaceC1340
    public final boolean contains(int i) {
        return this.f27488.mo34770(i);
    }

    @Override // l.AbstractC13448
    public final boolean remove(int i) {
        C15399 c15399 = this.f27488;
        int i2 = c15399.f50197;
        c15399.remove(i);
        return c15399.f50197 != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f27488.clear();
    }
}
