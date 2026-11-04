package l;

/* JADX INFO: renamed from: l.᩷ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AXU */
/* JADX INFO: loaded from: classes.dex */
public final class C21892 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String m49586(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String m49587(InterfaceC4825 interfaceC4825) {
        Object objM45347;
        if (interfaceC4825 instanceof C25307) {
            return interfaceC4825.toString();
        }
        try {
            objM45347 = interfaceC4825 + '@' + m49586((Object) interfaceC4825);
        } catch (Throwable th) {
            objM45347 = C19676.m45347(th);
        }
        if (C22660.m51055(objM45347) != null) {
            objM45347 = interfaceC4825.getClass().getName() + '@' + m49586((Object) interfaceC4825);
        }
        return (String) objM45347;
    }
}
