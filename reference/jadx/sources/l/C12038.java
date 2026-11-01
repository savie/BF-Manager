package l;

/* JADX INFO: renamed from: l.ۨ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: G552 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12038 extends AbstractC22433 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22433 f40301 = new C12038(0, new Object[0]);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient int f40302;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final transient Object[] f40303;

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۚ */
    public final int mo5969() {
        return 0;
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5042() {
        return false;
    }

    public C12038(int i, Object[] objArr) {
        this.f40303 = objArr;
        this.f40302 = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40302;
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۨ */
    public final Object[] mo5970() {
        return this.f40303;
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۖ */
    public final int mo5967() {
        return this.f40302;
    }

    @Override // l.AbstractC22433, l.AbstractC1826
    /* JADX INFO: renamed from: ۙ */
    public final int mo5968(int i, Object[] objArr) {
        Object[] objArr2 = this.f40303;
        int i2 = this.f40302;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C18304.m42510(i, this.f40302);
        Object obj = this.f40303[i];
        C13638.requireNonNull(obj);
        return obj;
    }

    @Override // l.AbstractC22433, l.AbstractC1826
    public Object writeReplace() {
        return super.writeReplace();
    }
}
