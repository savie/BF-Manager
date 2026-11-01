package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ۨ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC12002 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16940 f40226;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Socket f40227;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InputStream f40228;

    public RunnableC12002(AbstractC16940 abstractC16940, InputStream inputStream, Socket socket) {
        this.f40226 = abstractC16940;
        this.f40228 = inputStream;
        this.f40227 = socket;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29893() {
        AbstractC16940.m39647(this.f40228);
        AbstractC16940.m39647(this.f40227);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        OutputStream outputStream;
        Throwable th;
        Exception e;
        InputStream inputStream = this.f40228;
        AbstractC16940 abstractC16940 = this.f40226;
        Socket socket = this.f40227;
        try {
            outputStream = socket.getOutputStream();
            try {
                try {
                    InterfaceC0711 unused = abstractC16940.f54144;
                    C15530 c15530 = new C15530(abstractC16940, new C7062(), this.f40228, outputStream, socket.getInetAddress());
                    while (!socket.isClosed()) {
                        c15530.m37133();
                    }
                } catch (Exception e2) {
                    e = e2;
                    if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                        AbstractC16940.f54139.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                AbstractC16940.m39647(outputStream);
                AbstractC16940.m39647(inputStream);
                AbstractC16940.m39647(socket);
                abstractC16940.f54143.m4957(this);
                throw th;
            }
        } catch (Exception e3) {
            outputStream = null;
            e = e3;
        } catch (Throwable th3) {
            outputStream = null;
            th = th3;
            AbstractC16940.m39647(outputStream);
            AbstractC16940.m39647(inputStream);
            AbstractC16940.m39647(socket);
            abstractC16940.f54143.m4957(this);
            throw th;
        }
        AbstractC16940.m39647(outputStream);
        AbstractC16940.m39647(inputStream);
        AbstractC16940.m39647(socket);
        abstractC16940.f54143.m4957(this);
    }
}
