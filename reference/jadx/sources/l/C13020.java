package l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: renamed from: l.۫ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AKO */
/* JADX INFO: loaded from: classes4.dex */
public final class C13020 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InetAddress f41693;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ServerSocket f41694 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f41695;

    public C13020() {
        m32445();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m32445() {
        ServerSocket serverSocket = this.f41694;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused) {
            }
        }
        this.f41694 = null;
        this.f41693 = null;
        this.f41695 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m32449() {
        m32445();
        try {
            ServerSocket serverSocket = new ServerSocket(0, 5);
            this.f41694 = serverSocket;
            serverSocket.setSoTimeout(30000);
            return this.f41694.getLocalPort();
        } catch (IOException unused) {
            m32445();
            return 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32447(InetAddress inetAddress, int i) {
        m32445();
        this.f41693 = inetAddress;
        this.f41695 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Socket m32448() {
        ServerSocket serverSocket = this.f41694;
        Socket socketAccept = null;
        if (serverSocket == null) {
            if (this.f41693 == null || this.f41695 == 0) {
                m32445();
                return null;
            }
            try {
                Socket socket = new Socket(this.f41693, this.f41695);
                try {
                    socket.setSoTimeout(30000);
                    return socket;
                } catch (Exception unused) {
                    m32445();
                    return null;
                }
            } catch (IOException unused2) {
                m32445();
                return null;
            }
        }
        try {
            socketAccept = serverSocket.accept();
        } catch (Exception unused3) {
        }
        m32445();
        return socketAccept;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32446() {
        m32445();
    }
}
