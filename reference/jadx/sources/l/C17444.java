package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: renamed from: l.ܿܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D99I */
/* JADX INFO: loaded from: classes5.dex */
public final class C17444 implements InterfaceC16739 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Socket f55545;

    @Override // l.InterfaceC16739
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo39298() {
        return false;
    }

    @Override // l.InterfaceC16739
    /* JADX INFO: renamed from: ܳܰ */
    public final boolean mo39299() {
        return true;
    }

    public C17444(Socket socket) {
        this.f55545 = socket;
        try {
            socket.setTcpNoDelay(true);
        } catch (SocketException unused) {
        }
        try {
            int sendBufferSize = socket.getSendBufferSize();
            if (sendBufferSize < 1024 || sendBufferSize > 262144) {
                socket.setSendBufferSize(262144);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // l.InterfaceC16739
    public final InputStream getInputStream() {
        return this.f55545.getInputStream();
    }

    @Override // l.InterfaceC16739
    public final OutputStream getOutputStream() {
        return this.f55545.getOutputStream();
    }

    @Override // l.InterfaceC16739
    public final int getSendBufferSize() {
        return Math.min(this.f55545.getSendBufferSize(), 262144);
    }

    @Override // l.InterfaceC16739
    /* JADX INFO: renamed from: ᩴۙ */
    public final int mo39300() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f55545.close();
    }
}
