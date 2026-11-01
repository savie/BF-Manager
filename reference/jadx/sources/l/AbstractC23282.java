package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩺᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23282 {
    /* JADX INFO: renamed from: ۙ */
    public boolean mo15528() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51358(StringBuilder sb, String str, List list, String str2) {
        sb.append(str);
        Iterator it = list.iterator();
        String str3 = "";
        while (it.hasNext()) {
            AbstractC23282 abstractC23282 = (AbstractC23282) it.next();
            sb.append(str3);
            sb.append(abstractC23282);
            str3 = ", ";
        }
        sb.append(str2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m51359(StringBuilder sb, String str, List list, String str2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        m51358(sb, str, list, str2);
    }
}
