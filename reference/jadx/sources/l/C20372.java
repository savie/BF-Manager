package l;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;

/* JADX INFO: renamed from: l.᩵ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 42VH */
/* JADX INFO: loaded from: classes5.dex */
public class C20372 extends C1727 {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f65332 = {"C", "E", "S", "P"};

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public Socket f65333;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean f65334;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public SSLContext f65338;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f65339 = "TLS";

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f65336 = true;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f65337 = true;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public TrustManager f65340 = C2252.m7669();

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final String f65335 = "TLS";

    /* JADX INFO: renamed from: ᩷ */
    public void mo8151(Socket socket) {
        throw null;
    }

    public C20372(boolean z) {
        this.f65334 = z;
    }

    @Override // l.C1727, l.AbstractC10675
    /* JADX INFO: renamed from: ۗ */
    public final void mo6092() throws IOException {
        boolean z = this.f65334;
        if (z) {
            m27210();
            m46788();
        }
        super.mo6092();
        if (z) {
            return;
        }
        int iMo3694 = mo3694("AUTH", this.f65339);
        if (334 == iMo3694 || 234 == iMo3694) {
            m46788();
            return;
        }
        throw new SSLException(m36450());
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m46790() throws IOException {
        for (int i = 0; i < 4; i++) {
            if (f65332[i].equals("P")) {
                if (200 != mo3694("PROT", "P")) {
                    throw new SSLException(m36450());
                }
                if ("C".equals("P")) {
                    m27201((C6202) null);
                    m27202((C12167) null);
                    return;
                } else {
                    m27201(new C6202(this.f65338));
                    m27202(new C12167(this.f65338));
                    m46786();
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // l.C1727, l.C15150, l.AbstractC10675
    /* JADX INFO: renamed from: ᩻ */
    public final void mo6118() {
        super.mo6118();
        Socket socket = this.f65333;
        if (socket != null) {
            socket.close();
        }
        m27201((C6202) null);
        m27202((C12167) null);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m46789() throws SSLException {
        if (200 != mo3694("PBSZ", String.valueOf(0L))) {
            throw new SSLException(m36450());
        }
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    private void m46786() throws IOException {
        if (this.f65338 == null) {
            String str = this.f65335;
            TrustManager trustManager = this.f65340;
            TrustManager[] trustManagerArr = trustManager == null ? null : new TrustManager[]{trustManager};
            try {
                SSLContext sSLContext = SSLContext.getInstance(str);
                sSLContext.init(null, trustManagerArr, null);
                this.f65338 = sSLContext;
            } catch (GeneralSecurityException e) {
                throw new IOException("Could not initialize SSL context", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006e A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:15:0x0048, B:21:0x006e, B:23:0x0076, B:25:0x0080, B:30:0x0093, B:31:0x0096, B:33:0x009c, B:18:0x005b), top: B:78:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[Catch: all -> 0x00a4, TRY_ENTER, TryCatch #0 {all -> 0x00a4, blocks: (B:15:0x0048, B:21:0x006e, B:23:0x0076, B:25:0x0080, B:30:0x0093, B:31:0x0096, B:33:0x009c, B:18:0x005b), top: B:78:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009c A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #0 {all -> 0x00a4, blocks: (B:15:0x0048, B:21:0x006e, B:23:0x0076, B:25:0x0080, B:30:0x0093, B:31:0x0096, B:33:0x009c, B:18:0x005b), top: B:78:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    @Override // l.C1727
    /* JADX INFO: renamed from: ᩴ */
    public Socket mo6108(String str, String str2) throws IOException {
        Socket socketAccept;
        Socket socket = null;
        if (m6099() == 0 || m6099() == 2) {
            boolean z = m27206() instanceof Inet6Address;
            long millis = m6107().toMillis();
            int iMin = (int) (millis > 0 ? Math.min(millis, 2147483647L) : Math.max(millis, -2147483648L));
            if (m6099() == 0) {
                ServerSocket serverSocketCreateServerSocket = this.f33895.createServerSocket(0, 1, m27199());
                try {
                    if (z) {
                        if (C24087.m53643(m36445(m27199(), serverSocketCreateServerSocket.getLocalPort()))) {
                            if ((m6101() > 0 || m6112(m6101())) && C24087.m53644(mo3694(str, str2))) {
                                if (iMin >= 0) {
                                    serverSocketCreateServerSocket.setSoTimeout(iMin);
                                }
                                socketAccept = serverSocketCreateServerSocket.accept();
                                if (iMin >= 0) {
                                    socketAccept.setSoTimeout(iMin);
                                }
                                serverSocketCreateServerSocket.close();
                                if (!m6091() && !m27203(socketAccept)) {
                                    InetAddress inetAddress = socketAccept.getInetAddress();
                                    Closeable[] closeableArr = {socketAccept, null};
                                    byte[] bArr = C5125.f17846;
                                    C19295.m44661(new C6421(), closeableArr);
                                    throw new IOException("Host attempting data connection " + inetAddress.getHostAddress() + " is not same as server " + m27206().getHostAddress());
                                }
                                socket = socketAccept;
                            } else if (serverSocketCreateServerSocket != null) {
                            }
                        }
                    } else if (C24087.m53643(m36452(m27199(), serverSocketCreateServerSocket.getLocalPort()))) {
                        if (m6101() > 0) {
                            if (iMin >= 0) {
                                serverSocketCreateServerSocket.setSoTimeout(iMin);
                            }
                            socketAccept = serverSocketCreateServerSocket.accept();
                            if (iMin >= 0) {
                                socketAccept.setSoTimeout(iMin);
                            }
                            serverSocketCreateServerSocket.close();
                            if (!m6091()) {
                            }
                            socket = socketAccept;
                        } else {
                            if (iMin >= 0) {
                                serverSocketCreateServerSocket.setSoTimeout(iMin);
                            }
                            socketAccept = serverSocketCreateServerSocket.accept();
                            if (iMin >= 0) {
                                socketAccept.setSoTimeout(iMin);
                            }
                            serverSocketCreateServerSocket.close();
                            if (!m6091()) {
                            }
                            socket = socketAccept;
                        }
                        if (serverSocketCreateServerSocket != null) {
                        }
                    }
                    serverSocketCreateServerSocket.close();
                } catch (Throwable th) {
                    if (serverSocketCreateServerSocket != null) {
                        try {
                            serverSocketCreateServerSocket.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                ArrayList arrayList = this.f49434;
                if (z && m36446(EnumC24848.EPSV, (String) null) == 229) {
                    m6104((String) arrayList.get(0));
                } else if (!z && m36446(EnumC24848.PASV, (String) null) == 227) {
                    m6119((String) arrayList.get(0));
                }
                Socket socketCreateSocket = this.f33893.createSocket();
                if (iMin >= 0) {
                    socketCreateSocket.setSoTimeout(iMin);
                }
                socketCreateSocket.connect(new InetSocketAddress(m6102(), m6089()), this.f33889);
                if ((m6101() > 0 && !m6112(m6101())) || !C24087.m53644(mo3694(str, str2))) {
                    byte[] bArr2 = C5125.f17846;
                    C19295.m44661(new C6421(), socketCreateSocket, null);
                } else {
                    socketAccept = socketCreateSocket;
                    if (!m6091()) {
                    }
                    socket = socketAccept;
                }
            }
        }
        mo8151(socket);
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            boolean z2 = this.f65337;
            sSLSocket.setUseClientMode(z2);
            sSLSocket.setEnableSessionCreation(this.f65336);
            if (!z2) {
                sSLSocket.setNeedClientAuth(false);
                sSLSocket.setWantClientAuth(false);
            }
            sSLSocket.startHandshake();
        }
        return socket;
    }

    @Override // l.C15150, l.InterfaceC0916
    /* JADX INFO: renamed from: ۤ */
    public int mo3694(String str, String str2) throws IOException {
        int iMo3694 = super.mo3694(str, str2);
        if (!"CCC".equals(str)) {
            return iMo3694;
        }
        if (200 != iMo3694) {
            throw new SSLException(m36450());
        }
        this.f33892.close();
        this.f33892 = this.f65333;
        this.f49433 = new BufferedReader(new InputStreamReader(this.f33892.getInputStream(), this.f49432));
        this.f49431 = new BufferedWriter(new OutputStreamWriter(this.f33892.getOutputStream(), this.f49432));
        return iMo3694;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46787(boolean z) {
        this.f65336 = z;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m46788() throws IOException {
        this.f65333 = this.f33892;
        m46786();
        Socket socket = this.f33892;
        SSLSocket sSLSocket = socket != null ? (SSLSocket) this.f65338.getSocketFactory().createSocket(socket, this.f33888, socket.getPort(), false) : null;
        sSLSocket.setEnableSessionCreation(this.f65336);
        boolean z = this.f65337;
        sSLSocket.setUseClientMode(z);
        if (!z) {
            sSLSocket.setNeedClientAuth(false);
            sSLSocket.setWantClientAuth(false);
        }
        sSLSocket.startHandshake();
        this.f33892 = sSLSocket;
        this.f49433 = new BufferedReader(new InputStreamReader(sSLSocket.getInputStream(), this.f49432));
        this.f49431 = new BufferedWriter(new OutputStreamWriter(sSLSocket.getOutputStream(), this.f49432));
    }
}
