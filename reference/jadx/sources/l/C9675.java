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

/* JADX INFO: renamed from: l.ۢܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 42VH */
/* JADX INFO: loaded from: classes4.dex */
public class C9675 extends C16730 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f32610 = {"C", "E", "S", "P"};

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public Socket f32613;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public SSLContext f32614;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f32616;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public String f32612 = "TLS";

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f32611 = true;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f32617 = true;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public TrustManager f32618 = C16917.m39606();

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final String f32615 = "TLS";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo24610(Socket socket) {
        throw null;
    }

    public C9675(boolean z) {
        this.f32616 = z;
    }

    @Override // l.C16730, l.AbstractC8969
    /* JADX INFO: renamed from: ۠ */
    public final void mo23277() throws IOException {
        boolean z = this.f32616;
        if (z) {
            m23283();
            m24607();
        }
        super.mo23277();
        if (z) {
            return;
        }
        int iMo17115 = mo17115("AUTH", this.f32612);
        if (334 == iMo17115 || 234 == iMo17115) {
            m24607();
            return;
        }
        throw new SSLException(m47142());
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m24605() throws IOException {
        for (int i = 0; i < 4; i++) {
            if (f32610[i].equals("P")) {
                if (200 != mo17115("PROT", "P")) {
                    throw new SSLException(m47142());
                }
                if ("C".equals("P")) {
                    m23274((C4922) null);
                    m23273((C3323) null);
                    return;
                } else {
                    m23274(new C4922(this.f32614));
                    m23273(new C3323(this.f32614));
                    m24604();
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // l.C16730, l.C20963, l.AbstractC8969
    /* JADX INFO: renamed from: ᩺ */
    public final void mo23286() throws IOException {
        super.mo23286();
        Socket socket = this.f32613;
        if (socket != null) {
            socket.close();
        }
        m23274((C4922) null);
        m23273((C3323) null);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m24609() throws SSLException {
        if (200 != mo17115("PBSZ", String.valueOf(0L))) {
            throw new SSLException(m47142());
        }
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    private void m24604() throws IOException {
        if (this.f32614 == null) {
            String str = this.f32615;
            TrustManager trustManager = this.f32618;
            TrustManager[] trustManagerArr = trustManager == null ? null : new TrustManager[]{trustManager};
            try {
                SSLContext sSLContext = SSLContext.getInstance(str);
                sSLContext.init(null, trustManagerArr, null);
                this.f32614 = sSLContext;
            } catch (GeneralSecurityException e) {
                throw new IOException("Could not initialize SSL context", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006e A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:15:0x0048, B:21:0x006e, B:23:0x0076, B:27:0x0083, B:32:0x0096, B:33:0x0099, B:35:0x009f, B:18:0x005b), top: B:82:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #0 {all -> 0x00a7, blocks: (B:15:0x0048, B:21:0x006e, B:23:0x0076, B:27:0x0083, B:32:0x0096, B:33:0x0099, B:35:0x009f, B:18:0x005b), top: B:82:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0096 A[Catch: all -> 0x00a7, TRY_ENTER, TryCatch #0 {all -> 0x00a7, blocks: (B:15:0x0048, B:21:0x006e, B:23:0x0076, B:27:0x0083, B:32:0x0096, B:33:0x0099, B:35:0x009f, B:18:0x005b), top: B:82:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #0 {all -> 0x00a7, blocks: (B:15:0x0048, B:21:0x006e, B:23:0x0076, B:27:0x0083, B:32:0x0096, B:33:0x0099, B:35:0x009f, B:18:0x005b), top: B:82:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    @Override // l.C16730
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Socket mo24608(String str, String str2) throws IOException {
        Socket socketAccept;
        Socket socket = null;
        if (m39235() == 0 || m39235() == 2) {
            boolean z = m23281() instanceof Inet6Address;
            long millis = m39240().toMillis();
            int iMin = (int) (millis > 0 ? Math.min(millis, 2147483647L) : Math.max(millis, -2147483648L));
            if (m39235() == 0) {
                ServerSocket serverSocketCreateServerSocket = this.f30721.createServerSocket(0, 1, m23285());
                try {
                    if (z) {
                        if (C13571.m33171(m47135(m23285(), serverSocketCreateServerSocket.getLocalPort()))) {
                            if (m39243() > 0 || m39237(m39243())) {
                                if (C13571.m33177(mo17115(str, str2))) {
                                    if (iMin >= 0) {
                                        serverSocketCreateServerSocket.setSoTimeout(iMin);
                                    }
                                    socketAccept = serverSocketCreateServerSocket.accept();
                                    if (iMin >= 0) {
                                        socketAccept.setSoTimeout(iMin);
                                    }
                                    serverSocketCreateServerSocket.close();
                                    if (!m39239() && !m23275(socketAccept)) {
                                        InetAddress inetAddress = socketAccept.getInetAddress();
                                        Closeable[] closeableArr = {socketAccept, null};
                                        byte[] bArr = C20010.f64054;
                                        C8493.m22191(new C7309(), closeableArr);
                                        throw new IOException("Host attempting data connection " + inetAddress.getHostAddress() + " is not same as server " + m23281().getHostAddress());
                                    }
                                    socket = socketAccept;
                                } else if (serverSocketCreateServerSocket != null) {
                                }
                            } else if (serverSocketCreateServerSocket != null) {
                            }
                        }
                    } else if (C13571.m33171(m47140(m23285(), serverSocketCreateServerSocket.getLocalPort()))) {
                        if (m39243() > 0) {
                            if (C13571.m33177(mo17115(str, str2))) {
                                if (iMin >= 0) {
                                    serverSocketCreateServerSocket.setSoTimeout(iMin);
                                }
                                socketAccept = serverSocketCreateServerSocket.accept();
                                if (iMin >= 0) {
                                    socketAccept.setSoTimeout(iMin);
                                }
                                serverSocketCreateServerSocket.close();
                                if (!m39239()) {
                                }
                                socket = socketAccept;
                            } else if (serverSocketCreateServerSocket != null) {
                            }
                        } else if (C13571.m33177(mo17115(str, str2))) {
                            if (iMin >= 0) {
                                serverSocketCreateServerSocket.setSoTimeout(iMin);
                            }
                            socketAccept = serverSocketCreateServerSocket.accept();
                            if (iMin >= 0) {
                                socketAccept.setSoTimeout(iMin);
                            }
                            serverSocketCreateServerSocket.close();
                            if (!m39239()) {
                            }
                            socket = socketAccept;
                        } else if (serverSocketCreateServerSocket != null) {
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
                ArrayList arrayList = this.f68303;
                if (z && m47136(EnumC17435.EPSV, (String) null) == 229) {
                    m39231((String) arrayList.get(0));
                } else if (!z && m47136(EnumC17435.PASV, (String) null) == 227) {
                    m39242((String) arrayList.get(0));
                }
                Socket socketCreateSocket = this.f30723.createSocket();
                if (iMin >= 0) {
                    socketCreateSocket.setSoTimeout(iMin);
                }
                socketCreateSocket.connect(new InetSocketAddress(m39230(), m39233()), this.f30725);
                if (m39243() > 0 && !m39237(m39243())) {
                    byte[] bArr2 = C20010.f64054;
                    C8493.m22191(new C7309(), socketCreateSocket, null);
                } else if (!C13571.m33177(mo17115(str, str2))) {
                    byte[] bArr3 = C20010.f64054;
                    C8493.m22191(new C7309(), socketCreateSocket, null);
                } else {
                    socketAccept = socketCreateSocket;
                    if (!m39239()) {
                    }
                    socket = socketAccept;
                }
            }
        }
        mo24610(socket);
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            boolean z2 = this.f32617;
            sSLSocket.setUseClientMode(z2);
            sSLSocket.setEnableSessionCreation(this.f32611);
            if (!z2) {
                sSLSocket.setNeedClientAuth(false);
                sSLSocket.setWantClientAuth(false);
            }
            sSLSocket.startHandshake();
        }
        return socket;
    }

    @Override // l.C20963, l.InterfaceC17419
    /* JADX INFO: renamed from: ۨ */
    public int mo17115(String str, String str2) throws IOException {
        int iMo17115 = super.mo17115(str, str2);
        if (!"CCC".equals(str)) {
            return iMo17115;
        }
        if (200 != iMo17115) {
            throw new SSLException(m47142());
        }
        this.f30727.close();
        this.f30727 = this.f32613;
        this.f68304 = new BufferedReader(new InputStreamReader(this.f30727.getInputStream(), this.f68300));
        this.f68301 = new BufferedWriter(new OutputStreamWriter(this.f30727.getOutputStream(), this.f68300));
        return iMo17115;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24606(boolean z) {
        this.f32611 = z;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m24607() throws IOException {
        this.f32613 = this.f30727;
        m24604();
        Socket socket = this.f30727;
        SSLSocket sSLSocket = socket != null ? (SSLSocket) this.f32614.getSocketFactory().createSocket(socket, this.f30722, socket.getPort(), false) : null;
        sSLSocket.setEnableSessionCreation(this.f32611);
        boolean z = this.f32617;
        sSLSocket.setUseClientMode(z);
        if (!z) {
            sSLSocket.setNeedClientAuth(false);
            sSLSocket.setWantClientAuth(false);
        }
        sSLSocket.startHandshake();
        this.f30727 = sSLSocket;
        this.f68304 = new BufferedReader(new InputStreamReader(sSLSocket.getInputStream(), this.f68300));
        this.f68301 = new BufferedWriter(new OutputStreamWriter(sSLSocket.getOutputStream(), this.f68300));
    }
}
