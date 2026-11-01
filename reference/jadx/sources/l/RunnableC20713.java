package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: renamed from: l.᩷ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20713 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15775 f67347;

    public /* synthetic */ RunnableC20713(C15775 c15775) {
        this.f67347 = c15775;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C15775 c15775 = this.f67347;
        C3073 c3073 = c15775.f51092;
        C0168 c0168 = c3073.f11634;
        c15775.f51089 = new RunnableC20713(c15775);
        while (c15775.f51089 != null) {
            try {
                Socket socketAccept = c15775.f51095.accept();
                socketAccept.setTcpNoDelay(true);
                InputStream inputStream = socketAccept.getInputStream();
                OutputStream outputStream = socketAccept.getOutputStream();
                C7142 c7142 = (C7142) c3073.m9246("direct-tcpip");
                if (c7142 != null) {
                    C7930 c7930 = c7142.f25826;
                    c7930.f26044 = inputStream;
                    c7930.f26045 = outputStream;
                    c7142.f23878 = c15775.f51094;
                    c7142.f23880 = c15775.f51090;
                    c7142.f23881 = socketAccept.getInetAddress().getHostAddress();
                    c7142.f23879 = socketAccept.getPort();
                    c7142.mo19045(0);
                } else {
                    try {
                        socketAccept.close();
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        c0168.m1333().getClass();
                        throw th;
                    }
                    c0168.m1333().getClass();
                }
            } catch (Exception unused2) {
            }
        }
        c15775.f51089 = null;
        try {
            ServerSocket serverSocket = c15775.f51095;
            if (serverSocket != null) {
                serverSocket.close();
            }
            c15775.f51095 = null;
        } catch (Exception unused3) {
        }
    }
}
