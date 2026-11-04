package l;

/* JADX INFO: renamed from: l.ۘܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes3.dex */
public final class C4257 extends AbstractC5312 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22377 f15493;

    public C4257(C22377 c22377) {
        this.f15493 = c22377;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C5223(this.f15493);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f15493.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f15493.f72458;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f15493.clear();
    }
}
