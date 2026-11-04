package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۙ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64HS */
/* JADX INFO: loaded from: classes2.dex */
public class C5194 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f18114 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashMap f18115 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11817 mo15614(C11817 c11817) {
        HashMap map = this.f18114;
        C11817 c11818 = (C11817) map.get(c11817);
        if (c11818 != null) {
            return c11818;
        }
        C11817 c11819 = new C11817();
        map.put(c11817, c11819);
        return c11819;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4448 m15613(C4448 c4448) {
        HashMap map = this.f18115;
        C4448 c4449 = (C4448) map.get(c4448);
        if (c4449 != null) {
            return c4449;
        }
        C4448 c44410 = (C4448) c4448.clone();
        map.put(c4448, c44410);
        return c44410;
    }
}
