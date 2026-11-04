package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.۟᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8242 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public IOException f27103;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1530 f27104;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f27105 = false;

    public RunnableC8242(AbstractC1530 abstractC1530) {
        this.f27104 = abstractC1530;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1530 abstractC1530 = this.f27104;
        try {
            try {
                abstractC1530.f5322.bind(new InetSocketAddress(abstractC1530.f5324));
                this.f27105 = true;
                do {
                    try {
                        Socket socketAccept = abstractC1530.f5322.accept();
                        socketAccept.setSoTimeout(OpenAuthTask.Duplex);
                        abstractC1530.f5321.m56759(new RunnableC13462(abstractC1530, socketAccept.getInputStream(), socketAccept));
                    } catch (IOException e) {
                        AbstractC1530.f5318.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                    }
                } while (!abstractC1530.f5322.isClosed());
            } catch (IOException e2) {
                this.f27103 = e2;
            }
        } catch (Throwable th) {
            C20653.m47272("NanoHTTPD listener thread failed: port=" + abstractC1530.f5324 + ", listeningPort=" + abstractC1530.m5433(), th);
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw new RuntimeException(th);
        }
    }
}
