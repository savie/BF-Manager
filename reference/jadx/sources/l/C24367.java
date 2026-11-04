package l;

import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩺ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V3XC */
/* JADX INFO: loaded from: classes.dex */
public final class C24367 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TreeMap f79069 = new TreeMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f79071 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC5509 f79070 = C24901.f80578;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54476(C21383 c21383) {
        this.f79069.put(c21383.m13516(), c21383);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54477(String str) {
        return this.f79069.containsKey(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC4229 m54479(String str) {
        return (AbstractC4229) this.f79069.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54474(InterfaceC5656 interfaceC5656) {
        Iterator it = this.f79069.values().iterator();
        while (it.hasNext()) {
            ((AbstractC4229) it.next()).mo13506(interfaceC5656);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54475(C12966 c12966) {
        this.f79070 = c12966;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5509 m54473() {
        return this.f79070;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m54478(String str) {
        if (str == null) {
            return null;
        }
        ConcurrentMapC17249 concurrentMapC17249 = this.f79071;
        String str2 = (String) concurrentMapC17249.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) concurrentMapC17249.putIfAbsent(str, str);
        return str3 == null ? str : str3;
    }
}
