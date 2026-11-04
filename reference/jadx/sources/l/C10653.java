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

/* JADX INFO: renamed from: l.ۤۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4CY */
/* JADX INFO: loaded from: classes4.dex */
public final class C10653 implements InterfaceC17649 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f33772;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24363 f33773;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f33774;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C19076 f33775;

    public C10653(C24363 c24363) {
        this.f33773 = c24363;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27158() {
        this.f33774 = true;
        C19076 c19076 = this.f33775;
        if (c19076 != null) {
            c19076.m44178();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m27160() {
        return this.f33774;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27159(Object obj) {
        this.f33772 = obj;
    }

    @Override // l.InterfaceC17649
    /* JADX INFO: renamed from: ۙ */
    public final C9444 mo19233(C4688 c4688) throws IOException {
        C7954 c7954M14558 = c4688.m14558();
        InterfaceC6595 interfaceC6595M14553 = c4688.m14553();
        AbstractC19887 abstractC19887M14562 = c4688.m14562();
        C19076 c19076 = new C19076(this.f33773.m54460(), m27155(c7954M14558.m21649()), interfaceC6595M14553, abstractC19887M14562, this.f33772);
        this.f33775 = c19076;
        int i = 0;
        C9444 c9444 = null;
        while (!this.f33774) {
            try {
                try {
                    C9444 c9444M14555 = c4688.m14555(c7954M14558, c19076, null, null);
                    if (c9444 != null) {
                        C1242 c1242M24824 = c9444M14555.m24824();
                        C1242 c1242M24825 = c9444.m24824();
                        c1242M24825.m4486((AbstractC8699) null);
                        c1242M24824.m4489(c1242M24825.m4479());
                        c9444M14555 = c1242M24824.m4479();
                    }
                    try {
                        C7954 c7954M27154 = m27154(c9444M14555, c19076.m44183());
                        if (c7954M27154 == null) {
                            c19076.m44184();
                            return c9444M14555;
                        }
                        C19822.m45601(c9444M14555.m24818());
                        int i2 = i + 1;
                        if (i2 > 20) {
                            c19076.m44184();
                            throw new ProtocolException(C13645.m33382(i2, "Too many follow-up requests: "));
                        }
                        if (c7954M27154.m21647() instanceof InterfaceC19604) {
                            c19076.m44184();
                            throw new HttpRetryException("Cannot retry streamed HTTP body", c9444M14555.m24820());
                        }
                        if (!m27157(c9444M14555, c7954M27154.m21649())) {
                            c19076.m44184();
                            c19076 = new C19076(this.f33773.m54460(), m27155(c7954M27154.m21649()), interfaceC6595M14553, abstractC19887M14562, this.f33772);
                            this.f33775 = c19076;
                        } else if (c19076.m44186() != null) {
                            throw new IllegalStateException("Closing the body of " + c9444M14555 + " didn't close its backing stream. Bad interceptor?");
                        }
                        c9444 = c9444M14555;
                        c7954M14558 = c7954M27154;
                        i = i2;
                    } catch (IOException e) {
                        c19076.m44184();
                        throw e;
                    }
                } catch (IOException e2) {
                    if (!m27156(e2, c19076, !(e2 instanceof C17366), c7954M14558)) {
                        throw e2;
                    }
                } catch (C21314 e3) {
                    if (!m27156(e3.m48552(), c19076, false, c7954M14558)) {
                        throw e3.m48550();
                    }
                }
            } catch (Throwable th) {
                c19076.m44179((IOException) null);
                c19076.m44184();
                throw th;
            }
        }
        c19076.m44184();
        throw new IOException("Canceled");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C13306 m27155(C16903 c16903) {
        SSLSocketFactory sSLSocketFactoryM54448;
        HostnameVerifier hostnameVerifierM54458;
        C21511 c21511M54463;
        boolean zM39871 = c16903.m39871();
        C24363 c24363 = this.f33773;
        if (zM39871) {
            sSLSocketFactoryM54448 = c24363.m54448();
            hostnameVerifierM54458 = c24363.m54458();
            c21511M54463 = c24363.m54463();
        } else {
            sSLSocketFactoryM54448 = null;
            hostnameVerifierM54458 = null;
            c21511M54463 = null;
        }
        return new C13306(c16903.m39872(), c16903.m39880(), c24363.m54446(), c24363.m54464(), sSLSocketFactoryM54448, hostnameVerifierM54458, c21511M54463, c24363.m54447(), null, c24363.m54457(), c24363.m54456(), c24363.m54461());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0045 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m27156(IOException iOException, C19076 c19076, boolean z, C7954 c7954) {
        c19076.m44179(iOException);
        if (!this.f33773.m54452() || ((z && ((c7954.m21647() instanceof InterfaceC19604) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if ((iOException instanceof SocketTimeoutException) && !z) {
                if (!c19076.m44187()) {
                    return true;
                }
            }
        } else {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            if (!c19076.m44187()) {
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
    private C7954 m27154(C9444 c9444, C7208 c7208) throws ProtocolException {
        String strM24817;
        C16903 c16903M39867;
        C0496 c0496M21650;
        boolean zEquals;
        int iM24820 = c9444.m24820();
        String strM21651 = c9444.m24826().m21651();
        C24363 c24363 = this.f33773;
        if (iM24820 == 307 || iM24820 == 308) {
            if (strM21651.equals("GET") || strM21651.equals("HEAD")) {
                if (c24363.m54454() && (strM24817 = c9444.m24817("Location")) != null && (c16903M39867 = c9444.m24826().m21649().m39867(strM24817)) != null && (c16903M39867.m39873().equals(c9444.m24826().m21649().m39873()) || c24363.m54465())) {
                    c0496M21650 = c9444.m24826().m21650();
                    if (C15407.m36887(strM21651)) {
                        zEquals = strM21651.equals("PROPFIND");
                        if (!strM21651.equals("PROPFIND")) {
                            c0496M21650.m2392("GET", (AbstractC10190) null);
                        } else {
                            c0496M21650.m2392(strM21651, zEquals ? c9444.m24826().m21647() : null);
                        }
                        if (!zEquals) {
                            c0496M21650.m2390("Transfer-Encoding");
                            c0496M21650.m2390("Content-Length");
                            c0496M21650.m2390("Content-Type");
                        }
                    }
                    if (!m27157(c9444, c16903M39867)) {
                        c0496M21650.m2390("Authorization");
                    }
                    c0496M21650.m2395(c16903M39867);
                    return c0496M21650.m2389();
                }
            }
        } else {
            if (iM24820 == 401) {
                return c24363.m54449().mo7307(c9444);
            }
            int iIntValue = Integer.MAX_VALUE;
            if (iM24820 != 503) {
                if (iM24820 == 407) {
                    if (c7208.m19795().type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    return c24363.m54447().mo7307(c9444);
                }
                if (iM24820 != 408) {
                    switch (iM24820) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            if (c24363.m54454()) {
                                c0496M21650 = c9444.m24826().m21650();
                                if (C15407.m36887(strM21651)) {
                                    zEquals = strM21651.equals("PROPFIND");
                                    if (!strM21651.equals("PROPFIND")) {
                                        c0496M21650.m2392("GET", (AbstractC10190) null);
                                    } else {
                                        c0496M21650.m2392(strM21651, zEquals ? c9444.m24826().m21647() : null);
                                    }
                                    if (!zEquals) {
                                        c0496M21650.m2390("Transfer-Encoding");
                                        c0496M21650.m2390("Content-Length");
                                        c0496M21650.m2390("Content-Type");
                                    }
                                }
                                if (!m27157(c9444, c16903M39867)) {
                                    c0496M21650.m2390("Authorization");
                                }
                                c0496M21650.m2395(c16903M39867);
                                return c0496M21650.m2389();
                            }
                        default:
                            return null;
                    }
                } else if (c24363.m54452() && !(c9444.m24826().m21647() instanceof InterfaceC19604) && (c9444.m24828() == null || c9444.m24828().m24820() != 408)) {
                    String strM24818 = c9444.m24817("Retry-After");
                    if (strM24818 == null) {
                        iIntValue = 0;
                    } else if (strM24818.matches("\\d+")) {
                        iIntValue = Integer.valueOf(strM24818).intValue();
                    }
                    if (iIntValue <= 0) {
                        return c9444.m24826();
                    }
                }
            } else if (c9444.m24828() == null || c9444.m24828().m24820() != 503) {
                String strM24819 = c9444.m24817("Retry-After");
                if (strM24819 != null && strM24819.matches("\\d+")) {
                    iIntValue = Integer.valueOf(strM24819).intValue();
                }
                if (iIntValue == 0) {
                    return c9444.m24826();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27157(C9444 c9444, C16903 c16903) {
        C16903 c16903M21649 = c9444.m24826().m21649();
        return c16903M21649.m39872().equals(c16903.m39872()) && c16903M21649.m39880() == c16903.m39880() && c16903M21649.m39873().equals(c16903.m39873());
    }
}
