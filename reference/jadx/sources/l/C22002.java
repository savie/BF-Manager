package l;

import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.᩹ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes.dex */
public final class C22002 extends C16627 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Socket f71343;

    public C22002(Socket socket) {
        this.f71343 = socket;
    }

    @Override // l.C16627
    /* JADX INFO: renamed from: ۙ */
    public final IOException mo16598(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(b.n0);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // l.C16627
    /* JADX INFO: renamed from: ۘ */
    public final void mo3458() {
        Socket socket = this.f71343;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (e.getCause() != null && e.getMessage() != null && e.getMessage().contains("getsockname failed")) {
                C0834.f3467.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            C0834.f3467.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
