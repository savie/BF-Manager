package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4621 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final LinkedHashMap f16353;

    static {
        C11035 c11035 = new C11035("", new C3272[0]);
        EnumC15974 enumC15974 = EnumC15974.ARG_MISMATCH;
        C3272 c3272 = new C3272(enumC15974.m37956(), c11035);
        C14563 c14563 = new C14563(enumC15974.m37956(), c11035, c11035);
        c14563.f47670 = new C23735(c14563);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f16353 = linkedHashMap;
        linkedHashMap.put(c3272, new C1861(0));
        linkedHashMap.put(c14563, new C1861(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11948 m12769(C23549 c23549, InterfaceC12260 interfaceC12260, C22137 c22137, EnumC17198 enumC17198, C11948 c11948) {
        for (Map.Entry entry : f16353.entrySet()) {
            if (((C3272) entry.getKey()).mo9752(c11948)) {
                C11948 c11948Mo6061 = ((InterfaceC9624) entry.getValue()).mo6061(c23549, interfaceC12260, c22137, enumC17198, c11948);
                c11948Mo6061.m29766(EnumC0264.COMPRESSED);
                return c11948Mo6061;
            }
        }
        return null;
    }
}
