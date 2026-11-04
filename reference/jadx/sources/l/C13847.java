package l;

/* JADX INFO: renamed from: l.۬۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13847 {
    public static C1588 a(Object[] objArr, int i, int i2) {
        C13629.a(((Object[]) C17359.requireNonNull(objArr)).length, i, i2);
        return new C1588(objArr, i, i2, 1040);
    }

    public static InterfaceC20670 stream(Object[] objArr) {
        return stream(objArr, 0, objArr.length);
    }

    public static InterfaceC20670 stream(Object[] objArr, int i, int i2) {
        return C12465.stream(a(objArr, i, i2), false);
    }

    public static InterfaceC17686 stream(int[] iArr) {
        return C12465.a(C13629.spliterator(iArr, 0, iArr.length, 1040));
    }
}
