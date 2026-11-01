package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ܺ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16235 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16940 f52375;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public IOException f52376;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f52377 = false;

    public RunnableC16235(AbstractC16940 abstractC16940) {
        this.f52375 = abstractC16940;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC16940 abstractC16940 = this.f52375;
        try {
            try {
                abstractC16940.f54145.bind(new InetSocketAddress(abstractC16940.f54146));
                this.f52377 = true;
                do {
                    try {
                        Socket socketAccept = abstractC16940.f54145.accept();
                        socketAccept.setSoTimeout(OpenAuthTask.Duplex);
                        abstractC16940.f54143.m4958(new RunnableC12002(abstractC16940, socketAccept.getInputStream(), socketAccept));
                    } catch (IOException e) {
                        AbstractC16940.f54139.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                    }
                } while (!abstractC16940.f54145.isClosed());
            } catch (IOException e2) {
                this.f52376 = e2;
            }
        } catch (Throwable th) {
            C0577.m2747("NanoHTTPD listener thread failed: port=" + abstractC16940.f54146 + ", listeningPort=" + abstractC16940.m39650(), th);
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
