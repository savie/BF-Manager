package l;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩸ۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes.dex */
public final class C22567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f72920 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15107 f72921;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C10632 m50793(String str) {
        C10632 c10632;
        c10632 = (C10632) this.f72920.get(str);
        if (c10632 != null) {
            if (!(c10632.f33722 != null)) {
                while (!c10632.f33721.f49308) {
                    try {
                        if (c10632.f33720.await(1L, TimeUnit.SECONDS)) {
                            break;
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } else {
            c10632 = new C10632(this.f72921);
            this.f72920.put(str, c10632);
        }
        return c10632;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m50794() {
        this.f72920.clear();
    }

    public C22567(C15107 c15107) {
        this.f72921 = c15107;
    }
}
