package l;

/* JADX INFO: renamed from: l.۫۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBP8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12434 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m30905(InterfaceC17372 interfaceC17372, Integer num, Object obj) {
        int iIntValue = num.intValue();
        boolean zMo8945 = interfaceC17372.mo8945(iIntValue);
        Object objMo8944 = interfaceC17372.mo8944(iIntValue, obj);
        if (zMo8945) {
            return objMo8944;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m30908(InterfaceC17372 interfaceC17372, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = interfaceC17372.get(iIntValue);
        if (obj2 != interfaceC17372.mo10756() || interfaceC17372.mo8945(iIntValue)) {
            return obj2;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Object m30907(InterfaceC17372 interfaceC17372, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (interfaceC17372.mo8945(iIntValue)) {
            return interfaceC17372.remove(iIntValue);
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30906(InterfaceC17372 interfaceC17372, Object obj) {
        if (obj == null) {
            return false;
        }
        return interfaceC17372.mo8945(((Integer) obj).intValue());
    }
}
