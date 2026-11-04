package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.۫᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC13462 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Socket f42856;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1530 f42857;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InputStream f42858;

    public RunnableC13462(AbstractC1530 abstractC1530, InputStream inputStream, Socket socket) {
        this.f42857 = abstractC1530;
        this.f42858 = inputStream;
        this.f42856 = socket;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33110() {
        AbstractC1530.m5432(this.f42858);
        AbstractC1530.m5432(this.f42856);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        OutputStream outputStream;
        Exception e;
        InputStream inputStream = this.f42858;
        AbstractC1530 abstractC1530 = this.f42857;
        Socket socket = this.f42856;
        try {
            try {
                outputStream = socket.getOutputStream();
                try {
                    InterfaceC10478 unused = abstractC1530.f5323;
                    C3767 c3767 = new C3767(abstractC1530, new C16445(), this.f42858, outputStream, socket.getInetAddress());
                    c3767.f12892 = new RunnableC13526(1, this);
                    while (!socket.isClosed()) {
                        c3767.m12231();
                    }
                } catch (Exception e2) {
                    e = e2;
                    if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                        AbstractC1530.f5318.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                AbstractC1530.m5432((Object) null);
                AbstractC1530.m5432(inputStream);
                AbstractC1530.m5432(socket);
                abstractC1530.f5321.m56758(this);
                throw th;
            }
        } catch (Exception e3) {
            outputStream = null;
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            AbstractC1530.m5432((Object) null);
            AbstractC1530.m5432(inputStream);
            AbstractC1530.m5432(socket);
            abstractC1530.f5321.m56758(this);
            throw th;
        }
        AbstractC1530.m5432(outputStream);
        AbstractC1530.m5432(inputStream);
        AbstractC1530.m5432(socket);
        abstractC1530.f5321.m56758(this);
    }
}
