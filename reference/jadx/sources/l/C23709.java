package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K79T */
/* JADX INFO: loaded from: classes.dex */
public final class C23709 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52202(C6222 c6222, C14795 c14795, int i, int i2, ArrayList arrayList) {
        arrayList.clear();
        if (i2 <= 0) {
            return;
        }
        int iMin = Math.min(i, c14795.length());
        boolean zM52203 = false;
        int iMax = Math.max(0, iMin);
        if (iMax <= 0) {
            zM52203 = m52203(c6222);
        } else if (c6222.find(iMax)) {
            zM52203 = c6222.start() != c6222.end() ? true : m52203(c6222);
        }
        while (zM52203 && arrayList.size() < i2) {
            arrayList.add(new C11009(c6222.start(), c6222.end()));
            if (arrayList.size() >= i2) {
                return;
            } else {
                zM52203 = m52203(c6222);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52203(C6222 c6222) {
        while (c6222.find()) {
            if (c6222.start() != c6222.end()) {
                return true;
            }
        }
        return false;
    }
}
