package l;

/* JADX INFO: renamed from: l.ۙۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G552 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4867 extends AbstractC1928 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC1928 f16966 = new C4867(0, new Object[0]);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final transient Object[] f16967;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final transient int f16968;

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo14905() {
        return false;
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo14906() {
        return 0;
    }

    public C4867(int i, Object[] objArr) {
        this.f16967 = objArr;
        this.f16968 = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16968;
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object[] mo14904() {
        return this.f16967;
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo14907() {
        return this.f16968;
    }

    @Override // l.AbstractC1928, l.AbstractC4911
    /* JADX INFO: renamed from: ۙ */
    public final int mo6619(int i, Object[] objArr) {
        Object[] objArr2 = this.f16967;
        int i2 = this.f16968;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C12128.m30302(i, this.f16968);
        Object obj = this.f16967[i];
        C17359.requireNonNull(obj);
        return obj;
    }

    @Override // l.AbstractC1928, l.AbstractC4911
    public Object writeReplace() {
        return super.writeReplace();
    }
}
