package l;

/* JADX INFO: renamed from: l.᩶ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20318 {
    public static C1642 a(Object[] objArr, int i, int i2) {
        C19988.a(((Object[]) C13638.requireNonNull(objArr)).length, i, i2);
        return new C1642(objArr, i, i2, 1040);
    }

    public static InterfaceC5046 stream(Object[] objArr) {
        return stream(objArr, 0, objArr.length);
    }

    public static InterfaceC5046 stream(Object[] objArr, int i, int i2) {
        return C21980.stream(a(objArr, i, i2), false);
    }

    public static InterfaceC13514 stream(int[] iArr) {
        return C21980.a(C19988.spliterator(iArr, 0, iArr.length, 1040));
    }
}
