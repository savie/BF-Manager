package l;

import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15328 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f50076 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16820 f50077;

    public C15328(C16820 c16820) {
        this.f50077 = c16820;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13091 m36777(C5085 c5085) {
        HashMap map = this.f50076;
        C13091 c13091 = (C13091) map.get(c5085);
        if (c13091 != null) {
            return c13091;
        }
        C13091 c13092 = new C13091(this.f50077.f54267.mo6562(), c5085);
        map.put(c5085, c13092);
        return c13092;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection m36776() {
        return this.f50076.values();
    }
}
