package l;

/* JADX INFO: renamed from: l.ۤۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C10048 extends AbstractC14695 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2991 f34307;

    public C10048(C2991 c2991) {
        this.f34307 = c2991;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C9343(this.f34307);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f34307.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f34307.f11224;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f34307.clear();
    }
}
