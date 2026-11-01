package l;

import bin.mt.json.JSONArray;

/* JADX INFO: renamed from: l.ۙᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4840 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11897 m13432(C17367 c17367) {
        C11897 c11897 = new C11897(c17367.m40458(), c17367.m40458());
        long position = c17367.getPosition();
        if (c17367.available() > 10 && c17367.m40452(0)) {
            String strM40458 = c17367.m40458();
            if (strM40458.startsWith("[") && C12529.m31139(strM40458, "]", false)) {
                c11897.m29667(new C5546(new JSONArray(strM40458)));
                return c11897;
            }
            c17367.seek(position);
        }
        return c11897;
    }
}
