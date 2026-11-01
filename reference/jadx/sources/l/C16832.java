package l;

/* JADX INFO: renamed from: l.ܽᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91N0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16832 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m39481(InterfaceC6248 interfaceC6248, Object obj, Integer num) {
        boolean zContainsKey = interfaceC6248.containsKey(obj);
        int iMo18019 = interfaceC6248.mo18019(num.intValue(), obj);
        if (zContainsKey) {
            return Integer.valueOf(iMo18019);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39480(InterfaceC6248 interfaceC6248, Object obj, C22112 c22112) {
        int iMo18022 = interfaceC6248.mo18022(obj);
        if (iMo18022 != 0 || interfaceC6248.containsKey(obj)) {
            return iMo18022;
        }
        int iMo18023 = c22112.mo18022(obj);
        interfaceC6248.mo18019(iMo18023, obj);
        return iMo18023;
    }
}
