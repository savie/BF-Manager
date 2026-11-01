package l;

/* JADX INFO: renamed from: l.֨᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1453 extends AbstractC22433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient int f5935;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final transient Object[] f5936;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient int f5937;

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo5042() {
        return true;
    }

    public C1453(int i, int i2, Object[] objArr) {
        this.f5936 = objArr;
        this.f5935 = i;
        this.f5937 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C18304.m42510(i, this.f5937);
        Object obj = this.f5936[(i * 2) + this.f5935];
        C13638.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5937;
    }

    @Override // l.AbstractC22433, l.AbstractC1826
    public Object writeReplace() {
        return super.writeReplace();
    }
}
