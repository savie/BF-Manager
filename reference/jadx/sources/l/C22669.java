package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X202 */
/* JADX INFO: loaded from: classes.dex */
public final class C22669 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f73823 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50201(String str, String str2, InterfaceC6440 interfaceC6440) {
        HashMap map = f73823;
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(str, map2);
        }
        map2.put(str2, interfaceC6440);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC4674 m50200(C21422 c21422) {
        InterfaceC6440 interfaceC6440;
        AbstractC11462 abstractC11462M47960 = c21422.m47960();
        AbstractC11462 abstractC11462M28817 = c21422.m47970().m28817();
        Map map = (Map) f73823.get(abstractC11462M47960.mo13039());
        if (map != null && (interfaceC6440 = (InterfaceC6440) map.get(abstractC11462M28817.mo13039())) != null) {
            return interfaceC6440.create();
        }
        return C20075.m45445();
    }
}
