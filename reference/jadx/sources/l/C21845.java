package l;

import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H76E */
/* JADX INFO: loaded from: classes4.dex */
public final class C21845 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f70913 = {"call", "jump", e.m, "unknown"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48620(Iterable iterable) {
        if (iterable == null) {
            throw new NullPointerException("referenceKinds is null");
        }
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            int iM48621 = m48621((String) it.next());
            if (iM48621 == 0) {
                throw new IllegalArgumentException("Invalid referenceKind");
            }
            if ((i & iM48621) != 0) {
                throw new IllegalArgumentException("Duplicate referenceKind");
            }
            i |= iM48621;
        }
        m48623(i);
        return i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m48623(int i) {
        if (i == 0 || (i & (-16)) != 0) {
            throw new IllegalArgumentException("Invalid referenceKind mask");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m48622(int i) {
        m48623(i);
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
        return C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48621(String str) {
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
