package l;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: l.ܿۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H4CZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17261 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC10019 f55000;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3854 f55001;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f55002;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f55003;

    public C17261(EnumC10019 enumC10019, C3854 c3854, List list, List list2) {
        this.f55000 = enumC10019;
        this.f55001 = c3854;
        this.f55002 = list;
        this.f55003 = list2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17261 m40226(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        List listM1228;
        List listM1229;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        C3854 c3854M11175 = C3854.m11175(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC10019 enumC10019M25293 = EnumC10019.m25293(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        if (peerCertificates != null) {
            listM1228 = C0140.m1228(peerCertificates);
        } else {
            listM1228 = Collections.EMPTY_LIST;
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listM1229 = C0140.m1228(localCertificates);
        } else {
            listM1229 = Collections.EMPTY_LIST;
        }
        return new C17261(enumC10019M25293, c3854M11175, listM1228, listM1229);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17261 m40227(EnumC10019 enumC10019, C3854 c3854, List list, List list2) {
        if (enumC10019 == null) {
            throw new NullPointerException("tlsVersion == null");
        }
        return new C17261(enumC10019, c3854, C0140.m1227(list), C0140.m1227(list2));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC10019 m40228() {
        return this.f55000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3854 m40229() {
        return this.f55001;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m40230() {
        return this.f55002;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m40231() {
        return this.f55003;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17261)) {
            return false;
        }
        C17261 c17261 = (C17261) obj;
        return this.f55000.equals(c17261.f55000) && this.f55001.equals(c17261.f55001) && this.f55002.equals(c17261.f55002) && this.f55003.equals(c17261.f55003);
    }

    public final int hashCode() {
        return this.f55003.hashCode() + ((this.f55002.hashCode() + ((this.f55001.hashCode() + ((this.f55000.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
