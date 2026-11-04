package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: renamed from: l.ܿܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D99I */
/* JADX INFO: loaded from: classes5.dex */
public final class C18489 implements InterfaceC14759 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Socket f60166;

    @Override // l.InterfaceC14759
    /* JADX INFO: renamed from: ۖ᩷ */
    public final boolean mo35490() {
        return true;
    }

    @Override // l.InterfaceC14759
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo35492() {
        return false;
    }

    public C18489(Socket socket) {
        this.f60166 = socket;
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

    @Override // l.InterfaceC14759
    public final InputStream getInputStream() {
        return this.f60166.getInputStream();
    }

    @Override // l.InterfaceC14759
    public final OutputStream getOutputStream() {
        return this.f60166.getOutputStream();
    }

    @Override // l.InterfaceC14759
    public final int getSendBufferSize() {
        return Math.min(this.f60166.getSendBufferSize(), 262144);
    }

    @Override // l.InterfaceC14759
    /* JADX INFO: renamed from: ᩹ۙ */
    public final int mo35491() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f60166.close();
    }
}
