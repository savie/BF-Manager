package l;

import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.ۛܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6105 extends C16627 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11045 f20674;

    public C6105(C11045 c11045) {
        this.f20674 = c11045;
    }

    @Override // l.C16627
    /* JADX INFO: renamed from: ۘ */
    public final void mo3458() {
        EnumC9365 enumC9365 = EnumC9365.CANCEL;
        C11045 c11045 = this.f20674;
        c11045.m27863(enumC9365);
        c11045.f37516.m45702();
    }

    @Override // l.C16627
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IOException mo16598(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(b.n0);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m16599() throws IOException {
        if (m39094()) {
            throw mo16598((IOException) null);
        }
    }
}
