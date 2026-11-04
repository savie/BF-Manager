package l;

import bin.mt.json.JSONArray;

/* JADX INFO: renamed from: l.ۢ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes3.dex */
public final class C10368 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9622 m26672(C20348 c20348) {
        C9622 c9622 = new C9622(c20348.m46758(), c20348.m46758());
        long position = c20348.getPosition();
        if (c20348.available() > 10 && c20348.m46760(0)) {
            String strM46758 = c20348.m46758();
            if (strM46758.startsWith("[") && C0878.m3579(strM46758, "]", false)) {
                c9622.m25109(new C8877(new JSONArray(strM46758)));
                return c9622;
            }
            c20348.seek(position);
        }
        return c9622;
    }
}
