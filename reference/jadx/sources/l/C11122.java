package l;

/* JADX INFO: renamed from: l.ۤ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OBP8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11122 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m28072(InterfaceC23057 interfaceC23057, Integer num, Object obj) {
        int iIntValue = num.intValue();
        boolean zMo13467 = interfaceC23057.mo13467(iIntValue);
        Object objMo13466 = interfaceC23057.mo13466(iIntValue, obj);
        if (zMo13467) {
            return objMo13466;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m28075(InterfaceC23057 interfaceC23057, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = interfaceC23057.get(iIntValue);
        if (obj2 != interfaceC23057.mo18702() || interfaceC23057.mo13467(iIntValue)) {
            return obj2;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Object m28074(InterfaceC23057 interfaceC23057, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (interfaceC23057.mo13467(iIntValue)) {
            return interfaceC23057.remove(iIntValue);
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28073(InterfaceC23057 interfaceC23057, Object obj) {
        if (obj == null) {
            return false;
        }
        return interfaceC23057.mo13467(((Integer) obj).intValue());
    }
}
