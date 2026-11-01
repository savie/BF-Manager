package l;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۨ۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11710 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f39356 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5359 f39357;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C13827 m29249(String str) {
        C13827 c13827;
        c13827 = (C13827) this.f39356.get(str);
        if (c13827 != null) {
            if (!(c13827.f45637 != null)) {
                while (!c13827.f45636.f18518) {
                    try {
                        if (c13827.f45635.await(1L, TimeUnit.SECONDS)) {
                            break;
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } else {
            c13827 = new C13827(this.f39357);
            this.f39356.put(str, c13827);
        }
        return c13827;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m29250() {
        this.f39356.clear();
    }

    public C11710(C5359 c5359) {
        this.f39357 = c5359;
    }
}
