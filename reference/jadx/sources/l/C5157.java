package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5157 extends AbstractC5312 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22311 f17998;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C5157(C22311 c22311) {
        this.f17998 = c22311;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f17998.containsValue(obj);
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C7196(this);
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C7196(this);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C13907(this, 0, this.f17998.f72228);
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C22311 c22311 = this.f17998;
        Object[] objArr = c22311.f72229;
        int i = c22311.f72228;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(objArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f17998.f72228;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f17998.clear();
    }
}
