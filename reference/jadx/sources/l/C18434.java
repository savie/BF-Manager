package l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܿܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O965 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18434 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f60029;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8398 f60030 = new C8398();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f60028 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f60027 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42961() {
        if (this.f60029) {
            return;
        }
        this.f60029 = true;
        synchronized (this.f60030) {
            Iterator it = this.f60028.values().iterator();
            while (it.hasNext()) {
                m42960((AutoCloseable) it.next());
            }
            Iterator it2 = this.f60027.iterator();
            while (it2.hasNext()) {
                m42960((AutoCloseable) it2.next());
            }
            this.f60027.clear();
            C11471 c11471 = C11471.f36082;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42962(C9725 c9725) {
        AutoCloseable autoCloseable;
        if (this.f60029) {
            m42960((AutoCloseable) c9725);
            return;
        }
        synchronized (this.f60030) {
            autoCloseable = (AutoCloseable) this.f60028.put("androidx.lifecycle.savedstate.vm.tag", c9725);
        }
        m42960(autoCloseable);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AutoCloseable m42963() {
        AutoCloseable autoCloseable;
        synchronized (this.f60030) {
            autoCloseable = (AutoCloseable) this.f60028.get("androidx.lifecycle.savedstate.vm.tag");
        }
        return autoCloseable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42960(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                C20196.m46453(autoCloseable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
