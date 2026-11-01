package l;

/* JADX INFO: renamed from: l.֫֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes3.dex */
public final class C1498 extends AbstractC14695 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21605 f6052;

    public C1498(C21605 c21605) {
        this.f6052 = c21605;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C15256(this.f6052);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f6052.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f6052.f70078;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f6052.clear();
    }
}
