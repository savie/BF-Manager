package l;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;

/* JADX INFO: renamed from: l.ۙ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B2VY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4922 extends SocketFactory {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SSLContext f17241;

    public C4922(SSLContext sSLContext) {
        this.f17241 = sSLContext;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return this.f17241.getSocketFactory().createSocket();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return this.f17241.getSocketFactory().createSocket(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return this.f17241.getSocketFactory().createSocket(inetAddress, i, inetAddress2, i2);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return this.f17241.getSocketFactory().createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return this.f17241.getSocketFactory().createSocket(str, i, inetAddress, i2);
    }
}
