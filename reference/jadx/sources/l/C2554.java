package l;

/* JADX INFO: renamed from: l.ۖ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes3.dex */
public final class C2554 extends AbstractC14695 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6788 f10104;

    public C2554(C6788 c6788) {
        this.f10104 = c6788;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C3965(this.f10104);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10104.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f10104.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f10104.clear();
    }
}
