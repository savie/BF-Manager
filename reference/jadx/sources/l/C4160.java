package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ۘ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4D7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4160 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f14123;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f14124;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f14125;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f14126 = 0;

    public C4160(List list) {
        this.f14123 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1374 m13322(SSLSocket sSLSocket) throws UnknownServiceException {
        boolean z;
        C1374 c1374;
        int i = this.f14126;
        List list = this.f14123;
        int size = list.size();
        while (true) {
            z = true;
            if (i >= size) {
                c1374 = null;
                break;
            }
            c1374 = (C1374) list.get(i);
            if (c1374.m5055(sSLSocket)) {
                this.f14126 = i + 1;
                break;
            }
            i++;
        }
        if (c1374 == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f14125 + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        for (int i2 = this.f14126; i2 < list.size(); i2++) {
            if (((C1374) list.get(i2)).m5055(sSLSocket)) {
                this.f14124 = z;
                AbstractC4906.f17137.mo15055(c1374, sSLSocket, this.f14125);
                return c1374;
            }
        }
        z = false;
        this.f14124 = z;
        AbstractC4906.f17137.mo15055(c1374, sSLSocket, this.f14125);
        return c1374;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13323(IOException iOException) {
        this.f14125 = true;
        if (!this.f14124 || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
