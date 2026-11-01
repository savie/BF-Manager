package l;

/* JADX INFO: renamed from: l.ܺ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5AZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16271 extends AbstractC23844 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final transient Object f52436;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5042() {
        return false;
    }

    public C16271(Object obj) {
        obj.getClass();
        this.f52436 = obj;
    }

    @Override // l.AbstractC1826, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f52436.equals(obj);
    }

    @Override // l.AbstractC23844, l.AbstractC1826
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC22433 mo5971() {
        return AbstractC22433.of(this.f52436);
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۙ */
    public final int mo5968(int i, Object[] objArr) {
        objArr[i] = this.f52436;
        return i + 1;
    }

    @Override // l.AbstractC23844, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f52436.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f52436.toString() + ']';
    }

    @Override // l.AbstractC23844, l.AbstractC1826
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // l.AbstractC23844, l.AbstractC1826, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final AbstractC0477 iterator() {
        return new C0229(this.f52436);
    }
}
