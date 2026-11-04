package l;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: l.ۚܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4CZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5717 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0628 f19720;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f19721;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f19722;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC13919 f19723;

    public C5717(EnumC13919 enumC13919, C0628 c0628, List list, List list2) {
        this.f19723 = enumC13919;
        this.f19720 = c0628;
        this.f19721 = list;
        this.f19722 = list2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5717 m16749(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        List listM45598;
        List listM45599;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        C0628 c0628M2776 = C0628.m2776(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC13919 enumC13919M33899 = EnumC13919.m33899(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        if (peerCertificates != null) {
            listM45598 = C19822.m45598(peerCertificates);
        } else {
            listM45598 = Collections.EMPTY_LIST;
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listM45599 = C19822.m45598(localCertificates);
        } else {
            listM45599 = Collections.EMPTY_LIST;
        }
        return new C5717(enumC13919M33899, c0628M2776, listM45598, listM45599);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5717 m16750(EnumC13919 enumC13919, C0628 c0628, List list, List list2) {
        if (enumC13919 == null) {
            throw new NullPointerException("tlsVersion == null");
        }
        return new C5717(enumC13919, c0628, C19822.m45597(list), C19822.m45597(list2));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC13919 m16754() {
        return this.f19723;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0628 m16751() {
        return this.f19720;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m16752() {
        return this.f19721;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m16753() {
        return this.f19722;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5717)) {
            return false;
        }
        C5717 c5717 = (C5717) obj;
        return this.f19723.equals(c5717.f19723) && this.f19720.equals(c5717.f19720) && this.f19721.equals(c5717.f19721) && this.f19722.equals(c5717.f19722);
    }

    public final int hashCode() {
        return this.f19722.hashCode() + ((this.f19721.hashCode() + ((this.f19720.hashCode() + ((this.f19723.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
