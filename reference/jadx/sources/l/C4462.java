package l;

/* JADX INFO: renamed from: l.ۙۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C4462 extends AbstractC15378 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2345 f15875;

    public C4462(C2345 c2345) {
        this.f15875 = c2345;
    }

    @Override // l.AbstractC23844, l.AbstractC1826, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final AbstractC0477 iterator() {
        return mo5971().listIterator(0);
    }

    @Override // l.AbstractC23844
    /* JADX INFO: renamed from: ֨ */
    public final AbstractC22433 mo12084() {
        return new C3381(this);
    }

    @Override // l.AbstractC15378
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2345 mo12442() {
        return this.f15875;
    }

    @Override // l.AbstractC15378, l.AbstractC23844, l.AbstractC1826
    public Object writeReplace() {
        return super.writeReplace();
    }
}
