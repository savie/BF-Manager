package l;

/* JADX INFO: renamed from: l.᩷ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 91N0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21960 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m49689(InterfaceC19722 interfaceC19722, Object obj, Integer num) {
        boolean zContainsKey = interfaceC19722.containsKey(obj);
        int iMo7845 = interfaceC19722.mo7845(num.intValue(), obj);
        if (zContainsKey) {
            return Integer.valueOf(iMo7845);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m49688(InterfaceC19722 interfaceC19722, Object obj, C7924 c7924) {
        int iMo7848 = interfaceC19722.mo7848(obj);
        if (iMo7848 != 0 || interfaceC19722.containsKey(obj)) {
            return iMo7848;
        }
        int iMo7849 = c7924.mo7848(obj);
        interfaceC19722.mo7845(iMo7849, obj);
        return iMo7849;
    }
}
