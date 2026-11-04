package l;

import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H76E */
/* JADX INFO: loaded from: classes3.dex */
public final class C9225 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f30050 = {"call", "jump", e.m, "unknown"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24404(Iterable iterable) {
        if (iterable == null) {
            throw new NullPointerException("referenceKinds is null");
        }
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            int iM24405 = m24405((String) it.next());
            if (iM24405 == 0) {
                throw new IllegalArgumentException("Invalid referenceKind");
            }
            if ((i & iM24405) != 0) {
                throw new IllegalArgumentException("Duplicate referenceKind");
            }
            i |= iM24405;
        }
        m24407(i);
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m24407(int i) {
        if (i == 0 || (i & (-16)) != 0) {
            throw new IllegalArgumentException("Invalid referenceKind mask");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m24406(int i) {
        m24407(i);
        ArrayList arrayList = new ArrayList(4);
        if ((i & 1) != 0) {
            arrayList.add("call");
        }
        if ((i & 2) != 0) {
            arrayList.add("jump");
        }
        if ((i & 4) != 0) {
            arrayList.add(e.m);
        }
        if ((i & 8) != 0) {
            arrayList.add("unknown");
        }
        return C4681.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24405(String str) {
        if ("call".equals(str)) {
            return 1;
        }
        if ("jump".equals(str)) {
            return 2;
        }
        if (e.m.equals(str)) {
            return 4;
        }
        return "unknown".equals(str) ? 8 : 0;
    }
}
