package l;

import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.֨ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 14DT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0896 extends AbstractC19511 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22906 f3606;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public EnumC22013 f3607;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C17261 f3608;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Socket f3609;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f3611;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC10983 f3613;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC23683 f3614;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f3615;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Socket f3616;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C20217 f3617;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C8608 f3618;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f3612 = 1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f3610 = new ArrayList();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f3605 = C17492.FOREVER_NS;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3579(int i, int i2, int i3, int i4, boolean z, AbstractC0327 abstractC0327) throws Throwable {
        if (this.f3607 != null) {
            throw new IllegalStateException("already connected");
        }
        List listM38505 = this.f3618.m22383().m38505();
        C22064 c22064 = new C22064(listM38505);
        if (this.f3618.m22383().m38502() == null) {
            if (!listM38505.contains(C21494.f69844)) {
                throw new C12892(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strM34748 = this.f3618.m22383().m38507().m34748();
            if (!C18743.m43294().mo11394(strM34748)) {
                throw new C12892(new UnknownServiceException(C16523.m38890("CLEARTEXT communication to ", strM34748, " not permitted by network security policy")));
            }
        } else if (this.f3618.m22383().m38501().contains(EnumC22013.H2_PRIOR_KNOWLEDGE)) {
            throw new C12892(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        C12892 c12892 = null;
        while (true) {
            try {
                if (this.f3618.m22384()) {
                    m3573(i, i2, i3, abstractC0327);
                    if (this.f3609 != null) {
                        break;
                    } else {
                        break;
                    }
                }
                m3574(i, i2, abstractC0327);
                m3575(c22064, i4, abstractC0327);
                this.f3618.getClass();
                this.f3618.getClass();
                abstractC0327.getClass();
                break;
            } catch (IOException e) {
                C0140.m1233(this.f3616);
                C0140.m1233(this.f3609);
                this.f3616 = null;
                this.f3609 = null;
                this.f3614 = null;
                this.f3613 = null;
                this.f3608 = null;
                this.f3607 = null;
                this.f3617 = null;
                this.f3618.getClass();
                this.f3618.getClass();
                abstractC0327.getClass();
                if (c12892 == null) {
                    c12892 = new C12892(e);
                } else {
                    c12892.m31965(e);
                }
                if (!z) {
                    throw c12892;
                }
                if (!c22064.m49003(e)) {
                    throw c12892;
                }
            }
        }
        if (this.f3618.m22384() && this.f3609 == null) {
            throw new C12892(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (this.f3617 != null) {
            synchronized (this.f3606) {
                this.f3612 = this.f3617.m45690();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3574(int i, int i2, AbstractC0327 abstractC0327) throws IOException {
        Socket socketCreateSocket;
        C8608 c8608 = this.f3618;
        Proxy proxyM22385 = c8608.m22385();
        C16328 c16328M22383 = c8608.m22383();
        if (proxyM22385.type() == Proxy.Type.DIRECT || proxyM22385.type() == Proxy.Type.HTTP) {
            socketCreateSocket = c16328M22383.m38498().createSocket();
        } else {
            socketCreateSocket = new Socket(proxyM22385);
        }
        this.f3609 = socketCreateSocket;
        abstractC0327.getClass();
        this.f3609.setSoTimeout(i2);
        try {
            C18743.m43294().mo11392(this.f3609, c8608.m22382(), i);
            try {
                this.f3614 = C0834.m3437(C0834.m3439(this.f3609));
                this.f3613 = C0834.m3436(C0834.m3434(this.f3609));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + c8608.m22382());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3575(C22064 c22064, int i, AbstractC0327 abstractC0327) throws Throwable {
        SSLSocket sSLSocket;
        EnumC22013 enumC22013M48900;
        C8608 c8608 = this.f3618;
        if (c8608.m22383().m38502() == null) {
            List listM38501 = c8608.m22383().m38501();
            EnumC22013 enumC22013 = EnumC22013.H2_PRIOR_KNOWLEDGE;
            if (listM38501.contains(enumC22013)) {
                this.f3616 = this.f3609;
                this.f3607 = enumC22013;
                m3572(i);
                return;
            } else {
                this.f3616 = this.f3609;
                this.f3607 = EnumC22013.HTTP_1_1;
                return;
            }
        }
        abstractC0327.getClass();
        C16328 c16328M22383 = c8608.m22383();
        try {
            try {
                sSLSocket = (SSLSocket) c16328M22383.m38502().createSocket(this.f3609, c16328M22383.m38507().m34748(), c16328M22383.m38507().m34740(), true);
                try {
                    C21494 c21494M49002 = c22064.m49002(sSLSocket);
                    if (c21494M49002.m48132()) {
                        C18743.m43294().mo11393(sSLSocket, c16328M22383.m38507().m34748(), c16328M22383.m38501());
                    }
                    sSLSocket.startHandshake();
                    SSLSession session = sSLSocket.getSession();
                    C17261 c17261M40226 = C17261.m40226(session);
                    if (!c16328M22383.m38497().verify(c16328M22383.m38507().m34748(), session)) {
                        List listM40230 = c17261M40226.m40230();
                        if (!listM40230.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) listM40230.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + c16328M22383.m38507().m34748() + " not verified:\n    certificate: " + C1032.m3876(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C7454.m19934(x509Certificate));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + c16328M22383.m38507().m34748() + " not verified (no certificates)");
                    }
                    c16328M22383.m38499().m3878(c16328M22383.m38507().m34748(), c17261M40226.m40230());
                    String strMo11396 = c21494M49002.m48132() ? C18743.m43294().mo11396(sSLSocket) : null;
                    this.f3616 = sSLSocket;
                    this.f3614 = C0834.m3437(C0834.m3439(sSLSocket));
                    this.f3613 = C0834.m3436(C0834.m3434(this.f3616));
                    this.f3608 = c17261M40226;
                    if (strMo11396 != null) {
                        enumC22013M48900 = EnumC22013.m48900(strMo11396);
                    } else {
                        enumC22013M48900 = EnumC22013.HTTP_1_1;
                    }
                    this.f3607 = enumC22013M48900;
                    C18743.m43294().mo43295(sSLSocket);
                    if (this.f3607 == EnumC22013.HTTP_2) {
                        m3572(i);
                    }
                } catch (AssertionError e) {
                    e = e;
                    if (!C0140.m1234(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    if (sSLSocket != null) {
                        C18743.m43294().mo43295(sSLSocket);
                    }
                    C0140.m1233((Socket) sSLSocket);
                    throw th;
                }
            } catch (AssertionError e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3572(int i) throws SocketException {
        this.f3616.setSoTimeout(0);
        C18099 c18099 = new C18099();
        c18099.m42106(this.f3616, this.f3618.m22383().m38507().m34748(), this.f3614, this.f3613);
        c18099.m42107(this);
        c18099.m42105(i);
        C20217 c20217M42104 = c18099.m42104();
        this.f3617 = c20217M42104;
        c20217M42104.m45688();
    }

    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [l.ۚۗ۠, l.ܶۙ᩵] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3573(int i, int i2, int i3, AbstractC0327 abstractC0327) throws IOException {
        int i4;
        C6490 c6490 = new C6490();
        C8608 c8608 = this.f3618;
        c6490.m17684(c8608.m22383().m38507());
        Object obj = null;
        c6490.m17681("CONNECT", (AbstractC21307) null);
        boolean z = true;
        c6490.m17687("Host", C0140.m1224(c8608.m22383().m38507(), true));
        c6490.m17687("Proxy-Connection", "Keep-Alive");
        c6490.m17687("User-Agent", "okhttp/3.12.13");
        C22719 c22719M17678 = c6490.m17678();
        C17779 c17779 = new C17779();
        c17779.m41349(c22719M17678);
        c17779.m41348(EnumC22013.HTTP_1_1);
        c17779.m41341(407);
        c17779.m41353("Preemptive Authenticate");
        c17779.m41347(C0140.f1173);
        c17779.m41352(-1L);
        c17779.m41342(-1L);
        c17779.m41351();
        C22719 c22719Mo30085 = c8608.m22383().m38496().mo30085(c17779.m41340());
        if (c22719Mo30085 != null) {
            c22719M17678 = c22719Mo30085;
        }
        C14440 c14440M50355 = c22719M17678.m50355();
        int i5 = 0;
        while (i5 < 21) {
            m3574(i, i2, abstractC0327);
            String str = "CONNECT " + C0140.m1224(c14440M50355, z) + " HTTP/1.1";
            ?? r5 = obj;
            while (true) {
                InterfaceC23683 interfaceC23683 = this.f3614;
                C14304 c14304 = new C14304(r5, r5, interfaceC23683, this.f3613);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                interfaceC23683.mo2292().mo9654(i2);
                this.f3613.mo5902().mo9654(i3);
                str = str;
                c14304.m34532(c22719M17678.m50360(), str);
                c14304.mo20990();
                C17779 c17779Mo20988 = c14304.mo20988(false);
                c17779Mo20988.m41349(c22719M17678);
                C18485 c18485M41340 = c17779Mo20988.m41340();
                long jM25481 = C10070.m25481(c18485M41340);
                if (jM25481 == -1) {
                    jM25481 = 0;
                }
                i4 = i5;
                InterfaceC10008 interfaceC10008M34531 = c14304.m34531(jM25481);
                C0140.m1236(interfaceC10008M34531, Integer.MAX_VALUE);
                interfaceC10008M34531.close();
                int iM42858 = c18485M41340.m42858();
                if (iM42858 == 200) {
                    if (!this.f3614.mo16399().mo16415() || !this.f3613.mo16399().mo16415()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    c22719M17678 = null;
                    break;
                }
                if (iM42858 == 407) {
                    C22719 c22719Mo30086 = c8608.m22383().m38496().mo30085(c18485M41340);
                    if (c22719Mo30086 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                    if ("close".equalsIgnoreCase(c18485M41340.m42859("Connection"))) {
                        c22719M17678 = c22719Mo30086;
                        break;
                    } else {
                        i5 = i4;
                        c22719M17678 = c22719Mo30086;
                        r5 = 0;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c18485M41340.m42858());
                }
            }
            if (c22719M17678 == null) {
                return;
            }
            C0140.m1233(this.f3609);
            this.f3609 = null;
            this.f3613 = null;
            this.f3614 = null;
            i5 = i4 + 1;
            obj = null;
            z = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3583(C16328 c16328, C8608 c8608) {
        if (this.f3610.size() >= this.f3612 || this.f3611) {
            return false;
        }
        AbstractC7196 abstractC7196 = AbstractC7196.f24003;
        C8608 c8609 = this.f3618;
        if (!abstractC7196.mo19140(c8609.m22383(), c16328)) {
            return false;
        }
        if (c16328.m38507().m34748().equals(c8609.m22383().m38507().m34748())) {
            return true;
        }
        if (this.f3617 == null || c8608 == null) {
            return false;
        }
        Proxy.Type type = c8608.m22385().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || c8609.m22385().type() != type2 || !c8609.m22382().equals(c8608.m22382()) || c8608.m22383().m38497() != C7454.f24839 || !m3582(c16328.m38507())) {
            return false;
        }
        try {
            c16328.m38499().m3878(c16328.m38507().m34748(), this.f3608.m40230());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3582(C14440 c14440) {
        int iM34740 = c14440.m34740();
        C8608 c8608 = this.f3618;
        if (iM34740 == c8608.m22383().m38507().m34740()) {
            if (c14440.m34748().equals(c8608.m22383().m38507().m34748())) {
                return true;
            }
            if (this.f3608 != null) {
                if (C7454.m19936((X509Certificate) this.f3608.m40230().get(0), c14440.m34748())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7953 m3577(C5079 c5079, C7247 c7247, C15009 c15009) throws SocketException {
        if (this.f3617 != null) {
            return new C22333(c5079, c7247, c15009, this.f3617);
        }
        this.f3616.setSoTimeout(c7247.m19376());
        C20591 c20591Mo2292 = this.f3614.mo2292();
        long jM19376 = c7247.m19376();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c20591Mo2292.mo9654(jM19376);
        this.f3613.mo5902().mo9654(c7247.m19368());
        return new C14304(c5079, c15009, this.f3614, this.f3613);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C8608 m3576() {
        return this.f3618;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3578() {
        C0140.m1233(this.f3609);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Socket m3585() {
        return this.f3616;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3584(boolean z) {
        if (!this.f3616.isClosed() && !this.f3616.isInputShutdown() && !this.f3616.isOutputShutdown()) {
            C20217 c20217 = this.f3617;
            if (c20217 != null) {
                return c20217.m45705(System.nanoTime());
            }
            if (z) {
                try {
                    int soTimeout = this.f3616.getSoTimeout();
                    try {
                        this.f3616.setSoTimeout(1);
                        if (this.f3614.mo16415()) {
                            this.f3616.setSoTimeout(soTimeout);
                            return false;
                        }
                        this.f3616.setSoTimeout(soTimeout);
                        return true;
                    } catch (Throwable th) {
                        this.f3616.setSoTimeout(soTimeout);
                        throw th;
                    }
                } catch (SocketTimeoutException unused) {
                } catch (IOException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.AbstractC19511
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3580(C11045 c11045) {
        c11045.m27856(EnumC9365.REFUSED_STREAM);
    }

    @Override // l.AbstractC19511
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3581(C20217 c20217) {
        synchronized (this.f3606) {
            this.f3612 = c20217.m45690();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17261 m3587() {
        return this.f3608;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m3586() {
        return this.f3617 != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        C8608 c8608 = this.f3618;
        sb.append(c8608.m22383().m38507().m34748());
        sb.append(":");
        sb.append(c8608.m22383().m38507().m34740());
        sb.append(", proxy=");
        sb.append(c8608.m22385());
        sb.append(" hostAddress=");
        sb.append(c8608.m22382());
        sb.append(" cipherSuite=");
        C17261 c17261 = this.f3608;
        sb.append(c17261 != null ? c17261.m40229() : "none");
        sb.append(" protocol=");
        sb.append(this.f3607);
        sb.append('}');
        return sb.toString();
    }

    public C0896(C22906 c22906, C8608 c8608) {
        this.f3606 = c22906;
        this.f3618 = c8608;
    }
}
