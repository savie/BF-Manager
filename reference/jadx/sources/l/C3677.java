package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: l.ۘۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M9CP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3677 extends SocketFactory {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f13436 = C13488.m32997(C3677.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Proxy f13438 = Proxy.NO_PROXY;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f13437 = OpenAuthTask.Duplex;

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return new Socket(this.f13438);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return m10848(new InetSocketAddress(str, i), null);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m10848(new InetSocketAddress(str, i), new InetSocketAddress(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m10848(new InetSocketAddress(inetAddress, i), null);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m10848(new InetSocketAddress(inetAddress, i), new InetSocketAddress(inetAddress2, i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Socket m10848(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) throws IOException {
        Socket socket = new Socket(this.f13438);
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        f13436.mo12126(inetSocketAddress, "Connecting to {}");
        socket.connect(inetSocketAddress, this.f13437);
        socket.setTcpNoDelay(true);
        return socket;
    }
}
