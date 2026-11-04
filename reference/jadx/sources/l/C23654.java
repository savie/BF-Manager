package l;

/* JADX INFO: renamed from: l.᩹ܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23654 {
    public static InterfaceC20670 empty() {
        return C12465.stream(C13629.a, false);
    }

    public static InterfaceC20670 of(Object obj) {
        C4131 c4131 = new C4131();
        c4131.b = obj;
        c4131.a = -2;
        return C12465.stream(c4131, false);
    }

    public static InterfaceC20670 of(Object... objArr) {
        return C13847.stream(objArr);
    }
}
