package l;

/* JADX INFO: renamed from: l.ᩴۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19783 extends AbstractC1928 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final transient Object[] f63644;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final transient int f63645;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final transient int f63646;

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo14905() {
        return true;
    }

    public C19783(int i, int i2, Object[] objArr) {
        this.f63644 = objArr;
        this.f63645 = i;
        this.f63646 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C12128.m30302(i, this.f63646);
        Object obj = this.f63644[(i * 2) + this.f63645];
        C17359.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f63646;
    }

    @Override // l.AbstractC1928, l.AbstractC4911
    public Object writeReplace() {
        return super.writeReplace();
    }
}
