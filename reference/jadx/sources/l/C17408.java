package l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: l.ܽۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9AT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17408 extends SocketFactory {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SocketFactory f56606 = SocketFactory.getDefault();

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.f56606.createSocket();
        socketCreateSocket.setTcpNoDelay(true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f56606.createSocket(str, i);
        socketCreateSocket.setTcpNoDelay(true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.f56606.createSocket(str, i, inetAddress, i2);
        socketCreateSocket.setTcpNoDelay(true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f56606.createSocket(inetAddress, i);
        socketCreateSocket.setTcpNoDelay(true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.f56606.createSocket(inetAddress, i, inetAddress2, i2);
        socketCreateSocket.setTcpNoDelay(true);
        return socketCreateSocket;
    }
}
