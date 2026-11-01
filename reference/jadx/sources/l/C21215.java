package l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: l.᩷᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 418A */
/* JADX INFO: loaded from: classes4.dex */
public final class C21215 extends SocketFactory {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public SocketFactory f69117 = SocketFactory.getDefault();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f69116 = 65536;

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.f69117.createSocket();
        socketCreateSocket.setSendBufferSize(this.f69116);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f69117.createSocket(str, i);
        socketCreateSocket.setSendBufferSize(this.f69116);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f69117.createSocket(inetAddress, i);
        socketCreateSocket.setSendBufferSize(this.f69116);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.f69117.createSocket(str, i, inetAddress, i2);
        socketCreateSocket.setSendBufferSize(this.f69116);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.f69117.createSocket(inetAddress, i, inetAddress2, i2);
        socketCreateSocket.setSendBufferSize(this.f69116);
        return socketCreateSocket;
    }
}
