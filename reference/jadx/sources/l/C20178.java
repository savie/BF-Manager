package l;

import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩶۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: V3XC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20178 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TreeMap f65499 = new TreeMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f65501 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC14842 f65500 = C3551.f13068;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45606(C12417 c12417) {
        this.f65499.put(c12417.m2211(), c12417);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45609(String str) {
        return this.f65499.containsKey(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC0421 m45611(String str) {
        return (AbstractC0421) this.f65499.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45607(InterfaceC23145 interfaceC23145) {
        Iterator it = this.f65499.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0421) it.next()).mo2201(interfaceC23145);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45608(C24014 c24014) {
        this.f65500 = c24014;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14842 m45605() {
        return this.f65500;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m45610(String str) {
        if (str == null) {
            return null;
        }
        ConcurrentMapC13783 concurrentMapC13783 = this.f65501;
        String str2 = (String) concurrentMapC13783.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) concurrentMapC13783.putIfAbsent(str, str);
        return str3 == null ? str : str3;
    }
}
