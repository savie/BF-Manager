package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۘܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4280 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo13643() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13641(StringBuilder sb, String str, List list, String str2) {
        sb.append(str);
        Iterator it = list.iterator();
        String str3 = "";
        while (it.hasNext()) {
            AbstractC4280 abstractC4280 = (AbstractC4280) it.next();
            sb.append(str3);
            sb.append(abstractC4280);
            str3 = ", ";
        }
        sb.append(str2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m13642(StringBuilder sb, String str, List list, String str2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        m13641(sb, str, list, str2);
    }
}
