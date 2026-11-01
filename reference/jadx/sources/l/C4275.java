package l;

/* JADX INFO: renamed from: l.ۘ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J58E */
/* JADX INFO: loaded from: classes3.dex */
public final class C4275 extends AbstractC23844 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Object[] f15409;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C4275 f15410;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final transient int f15411;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final transient Object[] f15412;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient int f15413;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final transient Object[] f15414;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient int f15415;

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۚ */
    public final int mo5969() {
        return 0;
    }

    @Override // l.AbstractC23844
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean mo12085() {
        return true;
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5042() {
        return false;
    }

    static {
        Object[] objArr = new Object[0];
        f15409 = objArr;
        f15410 = new C4275(0, 0, 0, objArr, objArr);
    }

    public C4275(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f15414 = objArr;
        this.f15413 = i;
        this.f15412 = objArr2;
        this.f15415 = i2;
        this.f15411 = i3;
    }

    @Override // l.AbstractC1826, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f15412;
            if (objArr.length != 0) {
                int iM30863 = C12411.m30863(obj);
                while (true) {
                    int i = iM30863 & this.f15415;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM30863 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15411;
    }

    @Override // l.AbstractC23844, l.AbstractC1826, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final AbstractC0477 iterator() {
        return mo5971().listIterator(0);
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۨ */
    public final Object[] mo5970() {
        return this.f15414;
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۖ */
    public final int mo5967() {
        return this.f15411;
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۙ */
    public final int mo5968(int i, Object[] objArr) {
        Object[] objArr2 = this.f15414;
        int i2 = this.f15411;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // l.AbstractC23844
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 mo12084() {
        return AbstractC22433.m49802(this.f15411, this.f15414);
    }

    @Override // l.AbstractC23844, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15413;
    }

    @Override // l.AbstractC23844, l.AbstractC1826
    public Object writeReplace() {
        return super.writeReplace();
    }
}
