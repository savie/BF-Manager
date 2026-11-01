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

/* JADX INFO: renamed from: l.ܽ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O4DV */
/* JADX INFO: loaded from: classes4.dex */
public final class C16328 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC17033 f52595;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HostnameVerifier f52596;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final SocketFactory f52597;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1032 f52598;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f52599;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final SSLSocketFactory f52600;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7383 f52601;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ProxySelector f52602;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f52603;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Proxy f52604;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C14440 f52605;

    public C16328(String str, int i, InterfaceC7383 interfaceC7383, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C1032 c1032, InterfaceC17033 interfaceC17033, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        C23612 c23612 = new C23612();
        String str2 = sSLSocketFactory != null ? b.a : a.s;
        if (str2.equalsIgnoreCase(a.s)) {
            c23612.f76508 = a.s;
        } else {
            if (!str2.equalsIgnoreCase(b.a)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c23612.f76508 = b.a;
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String strM1223 = C0140.m1223(C14440.m34728(str, 0, str.length(), false));
        if (strM1223 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c23612.f76510 = strM1223;
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException(C8479.m22141(i, "unexpected port: "));
        }
        c23612.f76503 = i;
        this.f52605 = c23612.m52085();
        if (interfaceC7383 == null) {
            throw new NullPointerException("dns == null");
        }
        this.f52601 = interfaceC7383;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f52597 = socketFactory;
        if (interfaceC17033 == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f52595 = interfaceC17033;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f52599 = C0140.m1227(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f52603 = C0140.m1227(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f52602 = proxySelector;
        this.f52604 = proxy;
        this.f52600 = sSLSocketFactory;
        this.f52596 = hostnameVerifier;
        this.f52598 = c1032;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C14440 m38507() {
        return this.f52605;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7383 m38503() {
        return this.f52601;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final SocketFactory m38498() {
        return this.f52597;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC17033 m38496() {
        return this.f52595;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m38501() {
        return this.f52599;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m38505() {
        return this.f52603;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ProxySelector m38504() {
        return this.f52602;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Proxy m38506() {
        return this.f52604;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final SSLSocketFactory m38502() {
        return this.f52600;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HostnameVerifier m38497() {
        return this.f52596;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1032 m38499() {
        return this.f52598;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16328)) {
            return false;
        }
        C16328 c16328 = (C16328) obj;
        return this.f52605.equals(c16328.f52605) && m38500(c16328);
    }

    public final int hashCode() {
        int iHashCode = (this.f52602.hashCode() + ((this.f52603.hashCode() + ((this.f52599.hashCode() + ((this.f52595.hashCode() + ((this.f52601.hashCode() + ((this.f52605.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f52604;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f52600;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f52596;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C1032 c1032 = this.f52598;
        return iHashCode4 + (c1032 != null ? c1032.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38500(C16328 c16328) {
        return this.f52601.equals(c16328.f52601) && this.f52595.equals(c16328.f52595) && this.f52599.equals(c16328.f52599) && this.f52603.equals(c16328.f52603) && this.f52602.equals(c16328.f52602) && C0140.m1235(this.f52604, c16328.f52604) && C0140.m1235(this.f52600, c16328.f52600) && C0140.m1235(this.f52596, c16328.f52596) && C0140.m1235(this.f52598, c16328.f52598) && this.f52605.f47336 == c16328.f52605.f47336;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C14440 c14440 = this.f52605;
        sb.append(c14440.f47339);
        sb.append(":");
        sb.append(c14440.f47336);
        Proxy proxy = this.f52604;
        if (proxy != null) {
            sb.append(", proxy=");
            sb.append(proxy);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f52602);
        }
        sb.append(l.d);
        return sb.toString();
    }
}
