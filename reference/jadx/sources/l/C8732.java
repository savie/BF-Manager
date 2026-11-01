package l;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۡ۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8732 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m22598(AbstractCollection abstractCollection) {
        C8026 c8026 = new C8026();
        c8026.f26281 = 0;
        c8026.f26283 = new C19003();
        c8026.f26282 = new C19003();
        return C8026.m21129(c8026, abstractCollection);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22597(Collection collection, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("digraph " + str + " {\n");
        sb.append("label = " + ("\"" + str2 + "\"").replaceAll("\n", "") + ";\n");
        new C15082().m43013(collection, sb);
        sb.append("}\n");
        return sb.toString();
    }
}
