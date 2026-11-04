package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X202 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19540 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f63013 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45072(String str, String str2, InterfaceC22524 interfaceC22524) {
        HashMap map = f63013;
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(str, map2);
        }
        map2.put(str2, interfaceC22524);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC9843 m45071(C12915 c12915) {
        InterfaceC22524 interfaceC22524;
        AbstractC7364 abstractC7364M31987 = c12915.m31987();
        AbstractC7364 abstractC7364M23213 = c12915.m31974().m23213();
        Map map = (Map) f63013.get(abstractC7364M31987.mo10164());
        if (map != null && (interfaceC22524 = (InterfaceC22524) map.get(abstractC7364M23213.mo10164())) != null) {
            return interfaceC22524.create();
        }
        return C12540.m31154();
    }
}
