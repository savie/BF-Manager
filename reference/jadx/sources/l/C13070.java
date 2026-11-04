package l;

/* JADX INFO: renamed from: l.۫ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J58E */
/* JADX INFO: loaded from: classes4.dex */
public final class C13070 extends AbstractC8639 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Object[] f41805;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C13070 f41806;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final transient Object[] f41807;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final transient Object[] f41808;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final transient int f41809;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final transient int f41810;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final transient int f41811;

    @Override // l.AbstractC8639
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo23283() {
        return true;
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo14905() {
        return false;
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ᩴ */
    public final int mo14906() {
        return 0;
    }

    static {
        Object[] objArr = new Object[0];
        f41805 = objArr;
        f41806 = new C13070(0, 0, 0, objArr, objArr);
    }

    public C13070(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f41807 = objArr;
        this.f41809 = i;
        this.f41808 = objArr2;
        this.f41811 = i2;
        this.f41810 = i3;
    }

    @Override // l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f41808;
            if (objArr.length != 0) {
                int iM4502 = C1247.m4502(obj);
                while (true) {
                    int i = iM4502 & this.f41811;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM4502 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41810;
    }

    @Override // l.AbstractC8639, l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final AbstractC4516 iterator() {
        return mo6621().listIterator(0);
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ۤ */
    public final Object[] mo14904() {
        return this.f41807;
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ᩸ */
    public final int mo14907() {
        return this.f41810;
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ۙ */
    public final int mo6619(int i, Object[] objArr) {
        Object[] objArr2 = this.f41807;
        int i2 = this.f41810;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // l.AbstractC8639
    /* JADX INFO: renamed from: ۫ */
    public final AbstractC1928 mo23284() {
        return AbstractC1928.m6618(this.f41810, this.f41807);
    }

    @Override // l.AbstractC8639, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f41809;
    }

    @Override // l.AbstractC8639, l.AbstractC4911
    public Object writeReplace() {
        return super.writeReplace();
    }
}
