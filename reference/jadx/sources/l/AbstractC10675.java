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

/* JADX INFO: renamed from: l.ۤۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I59O */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10675 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f33888;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f33889 = 60000;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public OutputStream f33890;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f33891;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Socket f33892;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public SocketFactory f33893;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InputStream f33894;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ServerSocketFactory f33895;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final SocketFactory f33887 = SocketFactory.getDefault();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ServerSocketFactory f33886 = ServerSocketFactory.getDefault();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public abstract C21864 mo27212();

    public AbstractC10675() {
        Charset.defaultCharset();
        this.f33892 = null;
        this.f33888 = null;
        this.f33894 = null;
        this.f33890 = null;
        this.f33891 = 0;
        this.f33893 = f33887;
        this.f33895 = f33886;
    }

    /* JADX INFO: renamed from: ۗ */
    public void mo6092() throws SocketException {
        m27210();
        this.f33894 = this.f33892.getInputStream();
        this.f33890 = this.f33892.getOutputStream();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m27210() throws SocketException {
        this.f33892.setSoTimeout(this.f33891);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27200(int i, String str) throws IOException {
        this.f33888 = str;
        InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i);
        Socket socketCreateSocket = this.f33893.createSocket();
        this.f33892 = socketCreateSocket;
        socketCreateSocket.connect(inetSocketAddress, this.f33889);
        mo6092();
    }

    /* JADX INFO: renamed from: ᩻ */
    public void mo6118() {
        C5125.m15494(this.f33892);
        C5125.m15494((Closeable) this.f33894);
        C5125.m15494(this.f33890);
        this.f33892 = null;
        this.f33888 = null;
        this.f33894 = null;
        this.f33890 = null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m27205() {
        mo27212().m49557();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m27204() {
        mo27212().m49558();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InetAddress m27199() {
        return this.f33892.getLocalAddress();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InetAddress m27206() {
        return this.f33892.getInetAddress();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m27207() {
        if (m27208()) {
            try {
                if (this.f33892.getInetAddress() != null && this.f33892.getPort() != 0 && this.f33892.getRemoteSocketAddress() != null && !this.f33892.isClosed() && !this.f33892.isInputShutdown() && !this.f33892.isOutputShutdown()) {
                    this.f33892.getInputStream();
                    this.f33892.getOutputStream();
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m27208() {
        Socket socket = this.f33892;
        if (socket == null) {
            return false;
        }
        return socket.isConnected();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m27211() {
        this.f33889 = b.j0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m27209() {
        this.f33891 = 60000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27202(C12167 c12167) {
        if (c12167 == null) {
            this.f33895 = f33886;
        } else {
            this.f33895 = c12167;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27201(C6202 c6202) {
        if (c6202 == null) {
            this.f33893 = f33887;
        } else {
            this.f33893 = c6202;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27203(Socket socket) {
        return socket != null && C17359.equals(socket.getInetAddress(), this.f33892.getInetAddress());
    }
}
