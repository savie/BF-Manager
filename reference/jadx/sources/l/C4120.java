package l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: l.ۘۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 418A */
/* JADX INFO: loaded from: classes2.dex */
public final class C4120 extends SocketFactory {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public SocketFactory f13988 = SocketFactory.getDefault();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f13987 = 65536;

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.f13988.createSocket();
        socketCreateSocket.setSendBufferSize(this.f13987);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f13988.createSocket(str, i);
        socketCreateSocket.setSendBufferSize(this.f13987);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f13988.createSocket(inetAddress, i);
        socketCreateSocket.setSendBufferSize(this.f13987);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.f13988.createSocket(str, i, inetAddress, i2);
        socketCreateSocket.setSendBufferSize(this.f13987);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.f13988.createSocket(inetAddress, i, inetAddress2, i2);
        socketCreateSocket.setSendBufferSize(this.f13987);
        return socketCreateSocket;
    }
}
