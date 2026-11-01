package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۤ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 64HS */
/* JADX INFO: loaded from: classes3.dex */
public class C10527 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f36034 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f36035 = new HashMap();

    /* JADX INFO: renamed from: ۙ */
    public C17002 mo2550(C17002 c17002) {
        HashMap map = this.f36034;
        C17002 c17003 = (C17002) map.get(c17002);
        if (c17003 != null) {
            return c17003;
        }
        C17002 c17004 = new C17002();
        map.put(c17002, c17004);
        return c17004;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2184 m26669(C2184 c2184) {
        HashMap map = this.f36035;
        C2184 c2185 = (C2184) map.get(c2184);
        if (c2185 != null) {
            return c2185;
        }
        C2184 c2186 = (C2184) c2184.clone();
        map.put(c2184, c2186);
        return c2186;
    }
}
