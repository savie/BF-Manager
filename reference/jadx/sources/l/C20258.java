package l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.᩶ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C650 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20258 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16730 f65692;

    public C20258(C16730 c16730) {
        this.f65692 = c16730;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m45760(String str) {
        if (!InetAddress.getByName(str).isSiteLocalAddress()) {
            return str;
        }
        InetAddress inetAddressM23281 = this.f65692.m23281();
        return !inetAddressM23281.isSiteLocalAddress() ? inetAddressM23281.getHostAddress() : str;
    }
}
