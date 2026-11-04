package l;

import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.֫֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1595 extends C15302 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11289 f5494;

    public C1595(C11289 c11289) {
        this.f5494 = c11289;
    }

    @Override // l.C15302
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5606() {
        EnumC15874 enumC15874 = EnumC15874.CANCEL;
        C11289 c11289 = this.f5494;
        c11289.m28545(enumC15874);
        c11289.f35604.m50704();
    }

    @Override // l.C15302
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IOException mo5607(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(b.n0);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m5608() throws IOException {
        if (m36748()) {
            throw mo5607((IOException) null);
        }
    }
}
