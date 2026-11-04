package l;

/* JADX INFO: renamed from: l.ۛۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5AZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6359 extends AbstractC8639 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final transient Object f21488;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo14905() {
        return false;
    }

    public C6359(Object obj) {
        obj.getClass();
        this.f21488 = obj;
    }

    @Override // l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f21488.equals(obj);
    }

    @Override // l.AbstractC8639, l.AbstractC4911
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC1928 mo6621() {
        return AbstractC1928.of(this.f21488);
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ۙ */
    public final int mo6619(int i, Object[] objArr) {
        objArr[i] = this.f21488;
        return i + 1;
    }

    @Override // l.AbstractC8639, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f21488.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f21488.toString() + ']';
    }

    @Override // l.AbstractC8639, l.AbstractC4911
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // l.AbstractC8639, l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final AbstractC4516 iterator() {
        return new C0218(this.f21488);
    }
}
