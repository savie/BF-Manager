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

/* JADX INFO: renamed from: l.ܰ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14DT */
/* JADX INFO: loaded from: classes5.dex */
public final class C14600 extends AbstractC8416 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC4225 f45988;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f45989;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Socket f45991;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22478 f45993;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC25000 f45994;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC11573 f45995;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Socket f45996;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C5717 f45997;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19273 f45999;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f46000;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7208 f46001;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f45998 = 1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45990 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f45992 = C25227.FOREVER_NS;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35243(int i, int i2, int i3, int i4, boolean z, AbstractC19887 abstractC19887) throws Throwable {
        if (this.f45988 != null) {
            throw new IllegalStateException("already connected");
        }
        List listM32871 = this.f46001.m19793().m32871();
        C4160 c4160 = new C4160(listM32871);
        if (this.f46001.m19793().m32867() == null) {
            if (!listM32871.contains(C1374.f4901)) {
                throw new C21314(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strM39872 = this.f46001.m19793().m32873().m39872();
            if (!C9052.m24178().mo24184(strM39872)) {
                throw new C21314(new UnknownServiceException(C14442.m34865("CLEARTEXT communication to ", strM39872, " not permitted by network security policy")));
            }
        } else if (this.f46001.m19793().m32870().contains(EnumC4225.H2_PRIOR_KNOWLEDGE)) {
            throw new C21314(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        C21314 c21314 = null;
        while (true) {
            try {
                if (this.f46001.m19794()) {
                    m35238(i, i2, i3, abstractC19887);
                    if (this.f45991 != null) {
                        break;
                    } else {
                        break;
                    }
                }
                m35239(i, i2, abstractC19887);
                m35240(c4160, i4, abstractC19887);
                this.f46001.getClass();
                this.f46001.getClass();
                abstractC19887.getClass();
                break;
            } catch (IOException e) {
                C19822.m45603(this.f45996);
                C19822.m45603(this.f45991);
                this.f45996 = null;
                this.f45991 = null;
                this.f45994 = null;
                this.f45995 = null;
                this.f45997 = null;
                this.f45988 = null;
                this.f45993 = null;
                this.f46001.getClass();
                this.f46001.getClass();
                abstractC19887.getClass();
                if (c21314 == null) {
                    c21314 = new C21314(e);
                } else {
                    c21314.m48551(e);
                }
                if (!z) {
                    throw c21314;
                }
                if (!c4160.m13323(e)) {
                    throw c21314;
                }
            }
        }
        if (this.f46001.m19794() && this.f45991 == null) {
            throw new C21314(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (this.f45993 != null) {
            synchronized (this.f45999) {
                this.f45998 = this.f45993.m50690();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35239(int i, int i2, AbstractC19887 abstractC19887) throws IOException {
        Socket socketCreateSocket;
        C7208 c7208 = this.f46001;
        Proxy proxyM19795 = c7208.m19795();
        C13306 c13306M19793 = c7208.m19793();
        if (proxyM19795.type() == Proxy.Type.DIRECT || proxyM19795.type() == Proxy.Type.HTTP) {
            socketCreateSocket = c13306M19793.m32862().createSocket();
        } else {
            socketCreateSocket = new Socket(proxyM19795);
        }
        this.f45991 = socketCreateSocket;
        abstractC19887.getClass();
        this.f45991.setSoTimeout(i2);
        try {
            C9052.m24178().mo24182(this.f45991, c7208.m19796(), i);
            try {
                this.f45994 = C14556.m35108(C14556.m35110(this.f45991));
                this.f45995 = C14556.m35106(C14556.m35105(this.f45991));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + c7208.m19796());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35240(C4160 c4160, int i, AbstractC19887 abstractC19887) throws Throwable {
        SSLSocket sSLSocket;
        EnumC4225 enumC4225M13485;
        C7208 c7208 = this.f46001;
        if (c7208.m19793().m32867() == null) {
            List listM32870 = c7208.m19793().m32870();
            EnumC4225 enumC4225 = EnumC4225.H2_PRIOR_KNOWLEDGE;
            if (listM32870.contains(enumC4225)) {
                this.f45996 = this.f45991;
                this.f45988 = enumC4225;
                m35237(i);
                return;
            } else {
                this.f45996 = this.f45991;
                this.f45988 = EnumC4225.HTTP_1_1;
                return;
            }
        }
        abstractC19887.getClass();
        C13306 c13306M19793 = c7208.m19793();
        try {
            try {
                sSLSocket = (SSLSocket) c13306M19793.m32867().createSocket(this.f45991, c13306M19793.m32873().m39872(), c13306M19793.m32873().m39880(), true);
                try {
                    C1374 c1374M13322 = c4160.m13322(sSLSocket);
                    if (c1374M13322.m5054()) {
                        C9052.m24178().mo1206(sSLSocket, c13306M19793.m32873().m39872(), c13306M19793.m32870());
                    }
                    sSLSocket.startHandshake();
                    SSLSession session = sSLSocket.getSession();
                    C5717 c5717M16749 = C5717.m16749(session);
                    if (!c13306M19793.m32872().verify(c13306M19793.m32873().m39872(), session)) {
                        List listM16752 = c5717M16749.m16752();
                        if (!listM16752.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) listM16752.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + c13306M19793.m32873().m39872() + " not verified:\n    certificate: " + C21511.m48918(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C4862.m14901(x509Certificate));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + c13306M19793.m32873().m39872() + " not verified (no certificates)");
                    }
                    c13306M19793.m32863().m48920(c13306M19793.m32873().m39872(), c5717M16749.m16752());
                    String strMo1208 = c1374M13322.m5054() ? C9052.m24178().mo1208(sSLSocket) : null;
                    this.f45996 = sSLSocket;
                    this.f45994 = C14556.m35108(C14556.m35110(sSLSocket));
                    this.f45995 = C14556.m35106(C14556.m35105(this.f45996));
                    this.f45997 = c5717M16749;
                    if (strMo1208 != null) {
                        enumC4225M13485 = EnumC4225.m13485(strMo1208);
                    } else {
                        enumC4225M13485 = EnumC4225.HTTP_1_1;
                    }
                    this.f45988 = enumC4225M13485;
                    C9052.m24178().mo24183(sSLSocket);
                    if (this.f45988 == EnumC4225.HTTP_2) {
                        m35237(i);
                    }
                } catch (AssertionError e) {
                    e = e;
                    if (!C19822.m45604(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    if (sSLSocket != null) {
                        C9052.m24178().mo24183(sSLSocket);
                    }
                    C19822.m45603((Socket) sSLSocket);
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
    private void m35237(int i) throws SocketException {
        this.f45996.setSoTimeout(0);
        C0959 c0959 = new C0959();
        c0959.m3830(this.f45996, this.f46001.m19793().m32873().m39872(), this.f45994, this.f45995);
        c0959.m3831(this);
        c0959.m3829(i);
        C22478 c22478M3828 = c0959.m3828();
        this.f45993 = c22478M3828;
        c22478M3828.m50702();
    }

    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [l.ᩳ۫ۨ, l.᩺ܳۨ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35238(int i, int i2, int i3, AbstractC19887 abstractC19887) throws IOException {
        int i4;
        C0496 c0496 = new C0496();
        C7208 c7208 = this.f46001;
        c0496.m2395(c7208.m19793().m32873());
        Object obj = null;
        c0496.m2392("CONNECT", (AbstractC10190) null);
        boolean z = true;
        c0496.m2398("Host", C19822.m45594(c7208.m19793().m32873(), true));
        c0496.m2398("Proxy-Connection", "Keep-Alive");
        c0496.m2398("User-Agent", "okhttp/3.12.13");
        C7954 c7954M2389 = c0496.m2389();
        C1242 c1242 = new C1242();
        c1242.m4485(c7954M2389);
        c1242.m4483(EnumC4225.HTTP_1_1);
        c1242.m4480(407);
        c1242.m4492("Preemptive Authenticate");
        c1242.m4486(C19822.f63717);
        c1242.m4491(-1L);
        c1242.m4481(-1L);
        c1242.m4490();
        C7954 c7954Mo7307 = c7208.m19793().m32868().mo7307(c1242.m4479());
        if (c7954Mo7307 != null) {
            c7954M2389 = c7954Mo7307;
        }
        C16903 c16903M21649 = c7954M2389.m21649();
        int i5 = 0;
        while (i5 < 21) {
            m35239(i, i2, abstractC19887);
            String str = "CONNECT " + C19822.m45594(c16903M21649, z) + " HTTP/1.1";
            ?? r5 = obj;
            while (true) {
                InterfaceC25000 interfaceC25000 = this.f45994;
                C16620 c16620 = new C16620(r5, r5, interfaceC25000, this.f45995);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                interfaceC25000.mo4181().mo15814(i2);
                this.f45995.mo6067().mo15814(i3);
                str = str;
                c16620.m39319(c7954M2389.m21648(), str);
                c16620.mo8830();
                C1242 c1242Mo8827 = c16620.mo8827(false);
                c1242Mo8827.m4485(c7954M2389);
                C9444 c9444M4479 = c1242Mo8827.m4479();
                long jM33800 = C13854.m33800(c9444M4479);
                if (jM33800 == -1) {
                    jM33800 = 0;
                }
                i4 = i5;
                InterfaceC13810 interfaceC13810M39318 = c16620.m39318(jM33800);
                C19822.m45606(interfaceC13810M39318, Integer.MAX_VALUE);
                interfaceC13810M39318.close();
                int iM24820 = c9444M4479.m24820();
                if (iM24820 == 200) {
                    if (!this.f45994.mo4172().mo4182() || !this.f45995.mo29106().mo4182()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    c7954M2389 = null;
                    break;
                }
                if (iM24820 == 407) {
                    C7954 c7954Mo7308 = c7208.m19793().m32868().mo7307(c9444M4479);
                    if (c7954Mo7308 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                    if ("close".equalsIgnoreCase(c9444M4479.m24817("Connection"))) {
                        c7954M2389 = c7954Mo7308;
                        break;
                    } else {
                        i5 = i4;
                        c7954M2389 = c7954Mo7308;
                        r5 = 0;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c9444M4479.m24820());
                }
            }
            if (c7954M2389 == null) {
                return;
            }
            C19822.m45603(this.f45991);
            this.f45991 = null;
            this.f45995 = null;
            this.f45994 = null;
            i5 = i4 + 1;
            obj = null;
            z = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35244(C13306 c13306, C7208 c7208) {
        if (this.f45990.size() >= this.f45998 || this.f45989) {
            return false;
        }
        AbstractC4906 abstractC4906 = AbstractC4906.f17137;
        C7208 c7209 = this.f46001;
        if (!abstractC4906.mo15058(c7209.m19793(), c13306)) {
            return false;
        }
        if (c13306.m32873().m39872().equals(c7209.m19793().m32873().m39872())) {
            return true;
        }
        if (this.f45993 == null || c7208 == null) {
            return false;
        }
        Proxy.Type type = c7208.m19795().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || c7209.m19795().type() != type2 || !c7209.m19796().equals(c7208.m19796()) || c7208.m19793().m32872() != C4862.f16958 || !m35245(c13306.m32873())) {
            return false;
        }
        try {
            c13306.m32863().m48920(c13306.m32873().m39872(), this.f45997.m16752());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35245(C16903 c16903) {
        int iM39880 = c16903.m39880();
        C7208 c7208 = this.f46001;
        if (iM39880 == c7208.m19793().m32873().m39880()) {
            if (c16903.m39872().equals(c7208.m19793().m32873().m39872())) {
                return true;
            }
            if (this.f45997 != null) {
                if (C4862.m14903((X509Certificate) this.f45997.m16752().get(0), c16903.m39872())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2668 m35241(C24363 c24363, C4688 c4688, C19076 c19076) throws SocketException {
        if (this.f45993 != null) {
            return new C3942(c24363, c4688, c19076, this.f45993);
        }
        this.f45996.setSoTimeout(c4688.m14559());
        C22411 c22411Mo4181 = this.f45994.mo4181();
        long jM14559 = c4688.m14559();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c22411Mo4181.mo15814(jM14559);
        this.f45995.mo6067().mo15814(c4688.m14552());
        return new C16620(c24363, c19076, this.f45994, this.f45995);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7208 m35250() {
        return this.f46001;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35242() {
        C19822.m45603(this.f45991);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Socket m35248() {
        return this.f45996;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35246(boolean z) {
        if (!this.f45996.isClosed() && !this.f45996.isInputShutdown() && !this.f45996.isOutputShutdown()) {
            C22478 c22478 = this.f45993;
            if (c22478 != null) {
                return c22478.m50706(System.nanoTime());
            }
            if (z) {
                try {
                    int soTimeout = this.f45996.getSoTimeout();
                    try {
                        this.f45996.setSoTimeout(1);
                        if (this.f45994.mo4182()) {
                            this.f45996.setSoTimeout(soTimeout);
                            return false;
                        }
                        this.f45996.setSoTimeout(soTimeout);
                        return true;
                    } catch (Throwable th) {
                        this.f45996.setSoTimeout(soTimeout);
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

    @Override // l.AbstractC8416
    /* JADX INFO: renamed from: ۙ */
    public final void mo8275(C11289 c11289) {
        c11289.m28536(EnumC15874.REFUSED_STREAM);
    }

    @Override // l.AbstractC8416
    /* JADX INFO: renamed from: ۙ */
    public final void mo22609(C22478 c22478) {
        synchronized (this.f45999) {
            this.f45998 = c22478.m50690();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5717 m35249() {
        return this.f45997;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m35247() {
        return this.f45993 != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        C7208 c7208 = this.f46001;
        sb.append(c7208.m19793().m32873().m39872());
        sb.append(":");
        sb.append(c7208.m19793().m32873().m39880());
        sb.append(", proxy=");
        sb.append(c7208.m19795());
        sb.append(" hostAddress=");
        sb.append(c7208.m19796());
        sb.append(" cipherSuite=");
        C5717 c5717 = this.f45997;
        sb.append(c5717 != null ? c5717.m16751() : "none");
        sb.append(" protocol=");
        sb.append(this.f45988);
        sb.append('}');
        return sb.toString();
    }

    public C14600(C19273 c19273, C7208 c7208) {
        this.f45999 = c19273;
        this.f46001 = c7208;
    }
}
