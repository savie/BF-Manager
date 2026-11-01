package l;

/* JADX INFO: renamed from: l.ۨ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11397 {
    public static InterfaceC5046 empty() {
        return C21980.stream(C19988.a, false);
    }

    public static InterfaceC5046 of(Object obj) {
        C1800 c1800 = new C1800();
        c1800.b = obj;
        c1800.a = -2;
        return C21980.stream(c1800, false);
    }

    public static InterfaceC5046 of(Object... objArr) {
        return C20318.stream(objArr);
    }
}
