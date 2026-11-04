package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.y.l;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: l.۫ᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O4DV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13306 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SocketFactory f42469;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21511 f42470;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ProxySelector f42471;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4971 f42472;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final SSLSocketFactory f42473;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2120 f42474;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Proxy f42475;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f42476;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f42477;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HostnameVerifier f42478;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16903 f42479;

    public C13306(String str, int i, InterfaceC4971 interfaceC4971, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C21511 c21511, InterfaceC2120 interfaceC2120, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        C25109 c25109 = new C25109();
        String str2 = sSLSocketFactory != null ? b.a : a.s;
        if (str2.equalsIgnoreCase(a.s)) {
            c25109.f81196 = a.s;
        } else {
            if (!str2.equalsIgnoreCase(b.a)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c25109.f81196 = b.a;
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String strM45593 = C19822.m45593(C16903.m39857(str, 0, str.length(), false));
        if (strM45593 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c25109.f81199 = strM45593;
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException(C13645.m33382(i, "unexpected port: "));
        }
        c25109.f81198 = i;
        this.f42479 = c25109.m55964();
        if (interfaceC4971 == null) {
            throw new NullPointerException("dns == null");
        }
        this.f42472 = interfaceC4971;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f42469 = socketFactory;
        if (interfaceC2120 == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f42474 = interfaceC2120;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f42476 = C19822.m45597(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f42477 = C19822.m45597(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f42471 = proxySelector;
        this.f42475 = proxy;
        this.f42473 = sSLSocketFactory;
        this.f42478 = hostnameVerifier;
        this.f42470 = c21511;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16903 m32873() {
        return this.f42479;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4971 m32866() {
        return this.f42472;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SocketFactory m32862() {
        return this.f42469;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2120 m32868() {
        return this.f42474;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m32870() {
        return this.f42476;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m32871() {
        return this.f42477;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ProxySelector m32865() {
        return this.f42471;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Proxy m32869() {
        return this.f42475;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final SSLSocketFactory m32867() {
        return this.f42473;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HostnameVerifier m32872() {
        return this.f42478;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21511 m32863() {
        return this.f42470;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13306)) {
            return false;
        }
        C13306 c13306 = (C13306) obj;
        return this.f42479.equals(c13306.f42479) && m32864(c13306);
    }

    public final int hashCode() {
        int iHashCode = (this.f42471.hashCode() + ((this.f42477.hashCode() + ((this.f42476.hashCode() + ((this.f42474.hashCode() + ((this.f42472.hashCode() + ((this.f42479.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f42475;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f42473;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f42478;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C21511 c21511 = this.f42470;
        return iHashCode4 + (c21511 != null ? c21511.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32864(C13306 c13306) {
        return this.f42472.equals(c13306.f42472) && this.f42474.equals(c13306.f42474) && this.f42476.equals(c13306.f42476) && this.f42477.equals(c13306.f42477) && this.f42471.equals(c13306.f42471) && C19822.m45605(this.f42475, c13306.f42475) && C19822.m45605(this.f42473, c13306.f42473) && C19822.m45605(this.f42478, c13306.f42478) && C19822.m45605(this.f42470, c13306.f42470) && this.f42479.f55275 == c13306.f42479.f55275;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C16903 c16903 = this.f42479;
        sb.append(c16903.f55276);
        sb.append(":");
        sb.append(c16903.f55275);
        Proxy proxy = this.f42475;
        if (proxy != null) {
            sb.append(", proxy=");
            sb.append(proxy);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f42471);
        }
        sb.append(l.d);
        return sb.toString();
    }
}
