package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes.dex */
public final class C23218 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final LinkedHashMap f75225;

    static {
        C5318 c5318 = new C5318("", new C15758[0]);
        EnumC4572 enumC4572 = EnumC4572.ARG_MISMATCH;
        C15758 c15758 = new C15758(enumC4572.m14347(), c5318);
        C24710 c24710 = new C24710(enumC4572.m14347(), c5318, c5318);
        c24710.f79984 = new C1589(c24710);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f75225 = linkedHashMap;
        linkedHashMap.put(c15758, new C16504(0));
        linkedHashMap.put(c24710, new C16504(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17007 m52133(C19991 c19991, InterfaceC5075 interfaceC5075, C23393 c23393, EnumC22229 enumC22229, C17007 c17007) {
        for (Map.Entry entry : f75225.entrySet()) {
            if (((C15758) entry.getKey()).mo15967(c17007)) {
                C17007 c17007Mo39143 = ((InterfaceC17250) entry.getValue()).mo39143(c19991, interfaceC5075, c23393, enumC22229, c17007);
                c17007Mo39143.m40092(EnumC6984.COMPRESSED);
                return c17007Mo39143;
            }
        }
        return null;
    }
}
