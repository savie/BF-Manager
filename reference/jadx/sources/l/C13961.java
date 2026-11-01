package l;

/* JADX INFO: renamed from: l.ܰܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AXU */
/* JADX INFO: loaded from: classes3.dex */
public final class C13961 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String m33816(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String m33817(InterfaceC14771 interfaceC14771) {
        Object objM43014;
        if (interfaceC14771 instanceof C14149) {
            return interfaceC14771.toString();
        }
        try {
            objM43014 = interfaceC14771 + '@' + m33816((Object) interfaceC14771);
        } catch (Throwable th) {
            objM43014 = C18610.m43014(th);
        }
        if (C17904.m41594(objM43014) != null) {
            objM43014 = interfaceC14771.getClass().getName() + '@' + m33816((Object) interfaceC14771);
        }
        return (String) objM43014;
    }
}
