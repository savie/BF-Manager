package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۖܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2721 extends AbstractC13448 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22311 f9080;

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C2721(C22311 c22311) {
        this.f9080 = c22311;
    }

    @Override // l.InterfaceC1340
    public final boolean contains(int i) {
        return this.f9080.m50372(i) != -1;
    }

    @Override // l.AbstractC13448
    public final boolean remove(int i) {
        C22311 c22311 = this.f9080;
        int iM50372 = c22311.m50372(i);
        if (iM50372 == -1) {
            return false;
        }
        int i2 = (c22311.f72228 - iM50372) - 1;
        int[] iArr = c22311.f72233;
        int i3 = iM50372 + 1;
        System.arraycopy(iArr, i3, iArr, iM50372, i2);
        Object[] objArr = c22311.f72229;
        System.arraycopy(objArr, i3, objArr, iM50372, i2);
        int i4 = c22311.f72228 - 1;
        c22311.f72228 = i4;
        c22311.f72229[i4] = null;
        return true;
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1230(this);
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6036 iterator() {
        return new C1230(this);
    }

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15949 spliterator() {
        return new C9432(this, 0, this.f9080.f72228);
    }

    @Override // l.AbstractC6957, l.InterfaceC20206
    public final void forEach(IntConsumer intConsumer) {
        C22311 c22311 = this.f9080;
        int[] iArr = c22311.f72233;
        int i = c22311.f72228;
        for (int i2 = 0; i2 < i; i2++) {
            intConsumer.accept(iArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9080.f72228;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f9080.clear();
    }
}
