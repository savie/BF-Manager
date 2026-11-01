package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B8B */
/* JADX INFO: loaded from: classes2.dex */
public final class C2012 extends AbstractC23886 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f7522;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f7524;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f7525 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f7523 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f7526 = new HashMap();

    public C2012(String str, String str2) {
        this.f7522 = str2;
        this.f7524 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2012 m6479(C22165 c22165) {
        boolean zM49176 = c22165.m49176();
        AbstractC5231 abstractC5231 = c22165.f72502;
        if (zM49176) {
            this.f7525.put((C11582) abstractC5231, c22165);
            return this;
        }
        this.f7523.put((C13699) abstractC5231, c22165);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4525 m6480() {
        Map map;
        HashMap map2 = this.f7526;
        if (map2.isEmpty()) {
            map = Collections.EMPTY_MAP;
        } else {
            HashMap map3 = new HashMap(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                map3.put((String) entry.getKey(), new C3423((List) entry.getValue()));
            }
            map = map3;
        }
        return new C4525(this.f7524, this.f7522, this.f7525, this.f7523, map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6481(C3819 c3819, C11582 c11582, Object obj, String str) {
        ((List) C9735.computeIfAbsent(this.f7526, str, new C1443(5))).add(new C9775(c3819, c11582, obj, str));
    }
}
