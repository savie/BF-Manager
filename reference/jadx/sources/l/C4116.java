package l;

import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ۘۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes3.dex */
public final class C4116 extends C15302 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Socket f13979;

    public C4116(Socket socket) {
        this.f13979 = socket;
    }

    @Override // l.C15302
    /* JADX INFO: renamed from: ۙ */
    public final IOException mo5607(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(b.n0);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // l.C15302
    /* JADX INFO: renamed from: ֫ */
    public final void mo5606() {
        Socket socket = this.f13979;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (e.getCause() != null && e.getMessage() != null && e.getMessage().contains("getsockname failed")) {
                C14556.f45863.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            C14556.f45863.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
