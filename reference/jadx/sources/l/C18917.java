package l;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: renamed from: l.ᩳ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18917 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m43925(AbstractCollection abstractCollection) {
        C0272 c0272 = new C0272();
        c0272.f1566 = 0;
        c0272.f1568 = new C18499();
        c0272.f1567 = new C18499();
        return C0272.m1795(c0272, abstractCollection);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43924(Collection collection, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("digraph " + str + " {\n");
        sb.append("label = " + ("\"" + str2 + "\"").replaceAll("\n", "") + ";\n");
        new C4001().m42341(collection, sb);
        sb.append("}\n");
        return sb.toString();
    }
}
