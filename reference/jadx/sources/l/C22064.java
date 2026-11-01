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

/* JADX INFO: renamed from: l.᩹ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4D7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22064 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f71489 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f71490;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f71491;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f71492;

    public C22064(List list) {
        this.f71490 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21494 m49002(SSLSocket sSLSocket) throws UnknownServiceException {
        boolean z;
        C21494 c21494;
        int i = this.f71489;
        List list = this.f71490;
        int size = list.size();
        while (true) {
            z = true;
            if (i >= size) {
                c21494 = null;
                break;
            }
            c21494 = (C21494) list.get(i);
            if (c21494.m48133(sSLSocket)) {
                this.f71489 = i + 1;
                break;
            }
            i++;
        }
        if (c21494 == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f71492 + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        for (int i2 = this.f71489; i2 < list.size(); i2++) {
            if (((C21494) list.get(i2)).m48133(sSLSocket)) {
                this.f71491 = z;
                AbstractC7196.f24003.mo19139(c21494, sSLSocket, this.f71492);
                return c21494;
            }
        }
        z = false;
        this.f71491 = z;
        AbstractC7196.f24003.mo19139(c21494, sSLSocket, this.f71492);
        return c21494;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49003(IOException iOException) {
        this.f71492 = true;
        if (!this.f71491 || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
