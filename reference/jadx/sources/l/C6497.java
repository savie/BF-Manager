package l;

/* JADX INFO: renamed from: l.ۜۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6497 extends AbstractC14695 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16376 f21910;

    public C6497(C16376 c16376) {
        this.f21910 = c16376;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C0147(this.f21910);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f21910.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f21910.f52700;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f21910.clear();
    }
}
