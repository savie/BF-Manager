package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* JADX INFO: renamed from: l.ᩴۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 196G */
/* JADX INFO: loaded from: classes5.dex */
public final class C19626 extends Socket {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Socket f63243;

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f63243.close();
    }

    @Override // java.net.Socket
    public final synchronized int getReceiveBufferSize() {
        return this.f63243.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public final synchronized int getSendBufferSize() {
        return this.f63243.getSendBufferSize();
    }

    @Override // java.net.Socket
    public final synchronized int getSoTimeout() {
        return this.f63243.getSoTimeout();
    }

    @Override // java.net.Socket
    public final synchronized void setReceiveBufferSize(int i) {
        this.f63243.setReceiveBufferSize(i);
    }

    @Override // java.net.Socket
    public final synchronized void setSendBufferSize(int i) {
        this.f63243.setSendBufferSize(i);
    }

    @Override // java.net.Socket
    public final synchronized void setSoTimeout(int i) {
        this.f63243.setSoTimeout(i);
    }

    public C19626(Socket socket) {
        C17359.requireNonNull(socket, "delegate");
        this.f63243 = socket;
    }

    @Override // java.net.Socket
    public final InputStream getInputStream() {
        return new InflaterInputStream(this.f63243.getInputStream());
    }

    @Override // java.net.Socket
    public final OutputStream getOutputStream() {
        return new DeflaterOutputStream(this.f63243.getOutputStream());
    }

    @Override // java.net.Socket
    public final void bind(SocketAddress socketAddress) throws IOException {
        this.f63243.bind(socketAddress);
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) throws IOException {
        this.f63243.connect(socketAddress);
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress, int i) throws IOException {
        this.f63243.connect(socketAddress, i);
    }

    @Override // java.net.Socket
    public final SocketChannel getChannel() {
        return this.f63243.getChannel();
    }

    @Override // java.net.Socket
    public final InetAddress getInetAddress() {
        return this.f63243.getInetAddress();
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() {
        return this.f63243.getKeepAlive();
    }

    @Override // java.net.Socket
    public final InetAddress getLocalAddress() {
        return this.f63243.getLocalAddress();
    }

    @Override // java.net.Socket
    public final int getLocalPort() {
        return this.f63243.getLocalPort();
    }

    @Override // java.net.Socket
    public final SocketAddress getLocalSocketAddress() {
        return this.f63243.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() {
        return this.f63243.getOOBInline();
    }

    @Override // java.net.Socket
    public final int getPort() {
        return this.f63243.getPort();
    }

    @Override // java.net.Socket
    public final SocketAddress getRemoteSocketAddress() {
        return this.f63243.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() {
        return this.f63243.getReuseAddress();
    }

    @Override // java.net.Socket
    public final int getSoLinger() {
        return this.f63243.getSoLinger();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() {
        return this.f63243.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() {
        return this.f63243.getTrafficClass();
    }

    @Override // java.net.Socket
    public final boolean isBound() {
        return this.f63243.isBound();
    }

    @Override // java.net.Socket
    public final boolean isClosed() {
        return this.f63243.isClosed();
    }

    @Override // java.net.Socket
    public final boolean isConnected() {
        return this.f63243.isConnected();
    }

    @Override // java.net.Socket
    public final boolean isInputShutdown() {
        return this.f63243.isInputShutdown();
    }

    @Override // java.net.Socket
    public final boolean isOutputShutdown() {
        return this.f63243.isOutputShutdown();
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i) throws IOException {
        this.f63243.sendUrgentData(i);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) throws SocketException {
        this.f63243.setKeepAlive(z);
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) throws SocketException {
        this.f63243.setOOBInline(z);
    }

    @Override // java.net.Socket
    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f63243.setPerformancePreferences(i, i2, i3);
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) throws SocketException {
        this.f63243.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int i) throws SocketException {
        this.f63243.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) throws SocketException {
        this.f63243.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i) throws SocketException {
        this.f63243.setTrafficClass(i);
    }

    @Override // java.net.Socket
    public final void shutdownInput() throws IOException {
        this.f63243.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() throws IOException {
        this.f63243.shutdownOutput();
    }

    @Override // java.net.Socket
    public final String toString() {
        return this.f63243.toString();
    }
}
