package l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: l.ܺۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K4CY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15715 implements InterfaceC1738 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile C15009 f51000;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f51001;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5079 f51002;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f51003;

    public C15715(C5079 c5079) {
        this.f51002 = c5079;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37422() {
        this.f51003 = true;
        C15009 c15009 = this.f51000;
        if (c15009 != null) {
            c15009.m35998();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m37424() {
        return this.f51003;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37423(Object obj) {
        this.f51001 = obj;
    }

    @Override // l.InterfaceC1738
    /* JADX INFO: renamed from: ۙ */
    public final C18485 mo5785(C7247 c7247) throws IOException {
        C22719 c22719M19366 = c7247.m19366();
        InterfaceC11617 interfaceC11617M19369 = c7247.m19369();
        AbstractC0327 abstractC0327M19367 = c7247.m19367();
        C15009 c15009 = new C15009(this.f51002.m14159(), m37418(c22719M19366.m50355()), interfaceC11617M19369, abstractC0327M19367, this.f51001);
        this.f51000 = c15009;
        int i = 0;
        C18485 c18485 = null;
        while (!this.f51003) {
            try {
                try {
                    C18485 c18485M19371 = c7247.m19371(c22719M19366, c15009, null, null);
                    if (c18485 != null) {
                        C17779 c17779M42864 = c18485M19371.m42864();
                        C17779 c17779M42865 = c18485.m42864();
                        c17779M42865.m41347((AbstractC19191) null);
                        c17779M42864.m41350(c17779M42865.m41340());
                        c18485M19371 = c17779M42864.m41340();
                    }
                    try {
                        C22719 c22719M37419 = m37419(c18485M19371, c15009.m35994());
                        if (c22719M37419 == null) {
                            c15009.m36005();
                            return c18485M19371;
                        }
                        C0140.m1231(c18485M19371.m42860());
                        int i2 = i + 1;
                        if (i2 > 20) {
                            c15009.m36005();
                            throw new ProtocolException(C8479.m22141(i2, "Too many follow-up requests: "));
                        }
                        if (c22719M37419.m50358() instanceof InterfaceC0191) {
                            c15009.m36005();
                            throw new HttpRetryException("Cannot retry streamed HTTP body", c18485M19371.m42858());
                        }
                        if (!m37421(c18485M19371, c22719M37419.m50355())) {
                            c15009.m36005();
                            c15009 = new C15009(this.f51002.m14159(), m37418(c22719M37419.m50355()), interfaceC11617M19369, abstractC0327M19367, this.f51001);
                            this.f51000 = c15009;
                        } else if (c15009.m36004() != null) {
                            throw new IllegalStateException("Closing the body of " + c18485M19371 + " didn't close its backing stream. Bad interceptor?");
                        }
                        c18485 = c18485M19371;
                        c22719M19366 = c22719M37419;
                        i = i2;
                    } catch (IOException e) {
                        c15009.m36005();
                        throw e;
                    }
                } catch (IOException e2) {
                    if (!m37420(e2, c15009, !(e2 instanceof C1602), c22719M19366)) {
                        throw e2;
                    }
                } catch (C12892 e3) {
                    if (!m37420(e3.m31966(), c15009, false, c22719M19366)) {
                        throw e3.m31964();
                    }
                }
            } catch (Throwable th) {
                c15009.m35999((IOException) null);
                c15009.m36005();
                throw th;
            }
        }
        c15009.m36005();
        throw new IOException("Canceled");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C16328 m37418(C14440 c14440) {
        SSLSocketFactory sSLSocketFactoryM14171;
        HostnameVerifier hostnameVerifierM14167;
        C1032 c1032M14165;
        boolean zM34734 = c14440.m34734();
        C5079 c5079 = this.f51002;
        if (zM34734) {
            sSLSocketFactoryM14171 = c5079.m14171();
            hostnameVerifierM14167 = c5079.m14167();
            c1032M14165 = c5079.m14165();
        } else {
            sSLSocketFactoryM14171 = null;
            hostnameVerifierM14167 = null;
            c1032M14165 = null;
        }
        return new C16328(c14440.m34748(), c14440.m34740(), c5079.m14156(), c5079.m14161(), sSLSocketFactoryM14171, hostnameVerifierM14167, c1032M14165, c5079.m14162(), null, c5079.m14168(), c5079.m14173(), c5079.m14169());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0045 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m37420(IOException iOException, C15009 c15009, boolean z, C22719 c22719) {
        c15009.m35999(iOException);
        if (!this.f51002.m14164() || ((z && ((c22719.m50358() instanceof InterfaceC0191) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if ((iOException instanceof SocketTimeoutException) && !z) {
                if (!c15009.m35995()) {
                    return true;
                }
            }
        } else {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            if (!c15009.m35995()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:82:0x0135  */
    /* JADX WARN: Code duplicated, block: B:83:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0148  */
    /* JADX WARN: Code duplicated, block: B:90:0x015d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22719 m37419(C18485 c18485, C8608 c8608) throws ProtocolException {
        String strM42859;
        C14440 c14440M34738;
        C6490 c6490M50362;
        boolean zEquals;
        int iM42858 = c18485.m42858();
        String strM50359 = c18485.m42866().m50359();
        C5079 c5079 = this.f51002;
        if (iM42858 == 307 || iM42858 == 308) {
            if (strM50359.equals("GET") || strM50359.equals("HEAD")) {
                if (c5079.m14160() && (strM42859 = c18485.m42859("Location")) != null && (c14440M34738 = c18485.m42866().m50355().m34738(strM42859)) != null && (c14440M34738.m34747().equals(c18485.m42866().m50355().m34747()) || c5079.m14174())) {
                    c6490M50362 = c18485.m42866().m50362();
                    if (C12123.m30173(strM50359)) {
                        zEquals = strM50359.equals("PROPFIND");
                        if (!strM50359.equals("PROPFIND")) {
                            c6490M50362.m17681("GET", (AbstractC21307) null);
                        } else {
                            c6490M50362.m17681(strM50359, zEquals ? c18485.m42866().m50358() : null);
                        }
                        if (!zEquals) {
                            c6490M50362.m17679("Transfer-Encoding");
                            c6490M50362.m17679("Content-Length");
                            c6490M50362.m17679("Content-Type");
                        }
                    }
                    if (!m37421(c18485, c14440M34738)) {
                        c6490M50362.m17679("Authorization");
                    }
                    c6490M50362.m17684(c14440M34738);
                    return c6490M50362.m17678();
                }
            }
        } else {
            if (iM42858 == 401) {
                return c5079.m14158().mo30085(c18485);
            }
            int iIntValue = Integer.MAX_VALUE;
            if (iM42858 != 503) {
                if (iM42858 == 407) {
                    if (c8608.m22385().type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    return c5079.m14162().mo30085(c18485);
                }
                if (iM42858 != 408) {
                    switch (iM42858) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            if (c5079.m14160()) {
                                c6490M50362 = c18485.m42866().m50362();
                                if (C12123.m30173(strM50359)) {
                                    zEquals = strM50359.equals("PROPFIND");
                                    if (!strM50359.equals("PROPFIND")) {
                                        c6490M50362.m17681("GET", (AbstractC21307) null);
                                    } else {
                                        c6490M50362.m17681(strM50359, zEquals ? c18485.m42866().m50358() : null);
                                    }
                                    if (!zEquals) {
                                        c6490M50362.m17679("Transfer-Encoding");
                                        c6490M50362.m17679("Content-Length");
                                        c6490M50362.m17679("Content-Type");
                                    }
                                }
                                if (!m37421(c18485, c14440M34738)) {
                                    c6490M50362.m17679("Authorization");
                                }
                                c6490M50362.m17684(c14440M34738);
                                return c6490M50362.m17678();
                            }
                        default:
                            return null;
                    }
                } else if (c5079.m14164() && !(c18485.m42866().m50358() instanceof InterfaceC0191) && (c18485.m42865() == null || c18485.m42865().m42858() != 408)) {
                    String strM428510 = c18485.m42859("Retry-After");
                    if (strM428510 == null) {
                        iIntValue = 0;
                    } else if (strM428510.matches("\\d+")) {
                        iIntValue = Integer.valueOf(strM428510).intValue();
                    }
                    if (iIntValue <= 0) {
                        return c18485.m42866();
                    }
                }
            } else if (c18485.m42865() == null || c18485.m42865().m42858() != 503) {
                String strM428511 = c18485.m42859("Retry-After");
                if (strM428511 != null && strM428511.matches("\\d+")) {
                    iIntValue = Integer.valueOf(strM428511).intValue();
                }
                if (iIntValue == 0) {
                    return c18485.m42866();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37421(C18485 c18485, C14440 c14440) {
        C14440 c14440M50355 = c18485.m42866().m50355();
        return c14440M50355.m34748().equals(c14440.m34748()) && c14440M50355.m34740() == c14440.m34740() && c14440M50355.m34747().equals(c14440.m34747());
    }
}
