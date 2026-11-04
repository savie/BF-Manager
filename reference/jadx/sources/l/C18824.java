package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩳۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18824 extends AbstractC6957 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15399 f61180;

    @Override // l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C18824(C15399 c15399) {
        this.f61180 = c15399;
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6036 iterator() {
        return new C22859(this.f61180);
    }

    @Override // l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15949 spliterator() {
        return new C19875(this.f61180);
    }

    @Override // l.AbstractC6957, l.InterfaceC20206
    public final void forEach(IntConsumer intConsumer) {
        C15399 c15399 = this.f61180;
        int[] iArr = c15399.f50196;
        int[] iArr2 = c15399.f50195;
        if (c15399.f50203) {
            intConsumer.accept(iArr2[c15399.f50194]);
        }
        int i = c15399.f50194;
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
        return this.f61180.f50197;
    }

    @Override // l.InterfaceC1340
    public final boolean contains(int i) {
        return this.f61180.m36871(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f61180.clear();
    }
}
