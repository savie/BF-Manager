package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K79T */
/* JADX INFO: loaded from: classes3.dex */
public final class C7680 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20919(C4245 c4245, C18459 c18459, int i, int i2, ArrayList arrayList) {
        arrayList.clear();
        if (i2 <= 0) {
            return;
        }
        int iMin = Math.min(i, c18459.length());
        boolean zM20920 = false;
        int iMax = Math.max(0, iMin);
        if (iMax <= 0) {
            zM20920 = m20920(c4245);
        } else if (c4245.find(iMax)) {
            zM20920 = c4245.start() != c4245.end() ? true : m20920(c4245);
        }
        while (zM20920 && arrayList.size() < i2) {
            arrayList.add(new C0222(c4245.start(), c4245.end()));
            if (arrayList.size() >= i2) {
                return;
            } else {
                zM20920 = m20920(c4245);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20920(C4245 c4245) {
        while (c4245.find()) {
            if (c4245.start() != c4245.end()) {
                return true;
            }
        }
        return false;
    }
}
