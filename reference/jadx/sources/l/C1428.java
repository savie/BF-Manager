package l;

/* JADX INFO: renamed from: l.֨᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes3.dex */
public final class C1428 extends AbstractC5312 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11780 f5023;

    public C1428(C11780 c11780) {
        this.f5023 = c11780;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C2086(this.f5023);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5023.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f5023.f38062;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f5023.clear();
    }
}
