package l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.۫ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C650 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12913 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1727 f41287;

    public C12913(C1727 c1727) {
        this.f41287 = c1727;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m31966(String str) {
        if (!InetAddress.getByName(str).isSiteLocalAddress()) {
            return str;
        }
        InetAddress inetAddressM27206 = this.f41287.m27206();
        return !inetAddressM27206.isSiteLocalAddress() ? inetAddressM27206.getHostAddress() : str;
    }
}
