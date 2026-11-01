package l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: renamed from: l.᩶ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AKO */
/* JADX INFO: loaded from: classes4.dex */
public final class C20329 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InetAddress f65844;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ServerSocket f65845 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f65846;

    public C20329() {
        m45889();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m45889() {
        ServerSocket serverSocket = this.f65845;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused) {
            }
        }
        this.f65845 = null;
        this.f65844 = null;
        this.f65846 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m45893() {
        m45889();
        try {
            ServerSocket serverSocket = new ServerSocket(0, 5);
            this.f65845 = serverSocket;
            serverSocket.setSoTimeout(30000);
            return this.f65845.getLocalPort();
        } catch (IOException unused) {
            m45889();
            return 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45891(InetAddress inetAddress, int i) {
        m45889();
        this.f65844 = inetAddress;
        this.f65846 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Socket m45892() {
        ServerSocket serverSocket = this.f65845;
        Socket socketAccept = null;
        if (serverSocket == null) {
            if (this.f65844 == null || this.f65846 == 0) {
                m45889();
                return null;
            }
            try {
                Socket socket = new Socket(this.f65844, this.f65846);
                try {
                    socket.setSoTimeout(30000);
                    return socket;
                } catch (Exception unused) {
                    m45889();
                    return null;
                }
            } catch (IOException unused2) {
                m45889();
                return null;
            }
        }
        try {
            socketAccept = serverSocket.accept();
        } catch (Exception unused3) {
        }
        m45889();
        return socketAccept;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45890() {
        m45889();
    }
}
