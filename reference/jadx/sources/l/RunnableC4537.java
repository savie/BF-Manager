package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: renamed from: l.ۙ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZM */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4537 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21691 f16133;

    public /* synthetic */ RunnableC4537(C21691 c21691) {
        this.f16133 = c21691;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21691 c21691 = this.f16133;
        C15723 c15723 = c21691.f69229;
        C19978 c19978 = c15723.f51127;
        c21691.f69227 = new RunnableC4537(c21691);
        while (c21691.f69227 != null) {
            try {
                Socket socketAccept = c21691.f69228.accept();
                socketAccept.setTcpNoDelay(true);
                InputStream inputStream = socketAccept.getInputStream();
                OutputStream outputStream = socketAccept.getOutputStream();
                C22106 c22106 = (C22106) c15723.m37624("direct-tcpip");
                if (c22106 != null) {
                    C8878 c8878 = c22106.f27476;
                    c8878.f29002 = inputStream;
                    c8878.f29003 = outputStream;
                    c22106.f71250 = c21691.f69230;
                    c22106.f71249 = c21691.f69231;
                    c22106.f71247 = socketAccept.getInetAddress().getHostAddress();
                    c22106.f71248 = socketAccept.getPort();
                    c22106.mo22538(0);
                } else {
                    try {
                        socketAccept.close();
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        c19978.m45899().getClass();
                        throw th;
                    }
                    c19978.m45899().getClass();
                }
            } catch (Exception unused2) {
            }
        }
        c21691.f69227 = null;
        try {
            ServerSocket serverSocket = c21691.f69228;
            if (serverSocket != null) {
                serverSocket.close();
            }
            c21691.f69228 = null;
        } catch (Exception unused3) {
        }
    }
}
