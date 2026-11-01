package l;

import com.alipay.sdk.m.o.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.Charset;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: l.ۡܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I59O */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8969 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f30720;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ServerSocketFactory f30721;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f30722;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public SocketFactory f30723;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public OutputStream f30724;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f30725 = 60000;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InputStream f30726;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Socket f30727;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final SocketFactory f30719 = SocketFactory.getDefault();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final ServerSocketFactory f30718 = ServerSocketFactory.getDefault();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public abstract C19552 mo23276();

    public AbstractC8969() {
        Charset.defaultCharset();
        this.f30727 = null;
        this.f30722 = null;
        this.f30726 = null;
        this.f30724 = null;
        this.f30720 = 0;
        this.f30723 = f30719;
        this.f30721 = f30718;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public void mo23277() throws SocketException {
        m23283();
        this.f30726 = this.f30727.getInputStream();
        this.f30724 = this.f30727.getOutputStream();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m23283() throws SocketException {
        this.f30727.setSoTimeout(this.f30720);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23272(int i, String str) throws IOException {
        this.f30722 = str;
        InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i);
        Socket socketCreateSocket = this.f30723.createSocket();
        this.f30727 = socketCreateSocket;
        socketCreateSocket.connect(inetSocketAddress, this.f30725);
        mo23277();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void mo23286() {
        C20010.m45299(this.f30727);
        C20010.m45299((Closeable) this.f30726);
        C20010.m45299(this.f30724);
        this.f30727 = null;
        this.f30722 = null;
        this.f30726 = null;
        this.f30724 = null;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m23278() {
        mo23276().m44642();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23279() {
        mo23276().m44643();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InetAddress m23285() {
        return this.f30727.getLocalAddress();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InetAddress m23281() {
        return this.f30727.getInetAddress();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m23282() {
        if (m23280()) {
            try {
                if (this.f30727.getInetAddress() == null || this.f30727.getPort() == 0 || this.f30727.getRemoteSocketAddress() == null || this.f30727.isClosed() || this.f30727.isInputShutdown() || this.f30727.isOutputShutdown()) {
                    return false;
                }
                this.f30727.getInputStream();
                this.f30727.getOutputStream();
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m23280() {
        Socket socket = this.f30727;
        if (socket == null) {
            return false;
        }
        return socket.isConnected();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m23284() {
        this.f30725 = b.j0;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m23271() {
        this.f30720 = 60000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23273(C3323 c3323) {
        if (c3323 == null) {
            this.f30721 = f30718;
        } else {
            this.f30721 = c3323;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23274(C4922 c4922) {
        if (c4922 == null) {
            this.f30723 = f30719;
        } else {
            this.f30723 = c4922;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23275(Socket socket) {
        return socket != null && C13638.equals(socket.getInetAddress(), this.f30727.getInetAddress());
    }
}
