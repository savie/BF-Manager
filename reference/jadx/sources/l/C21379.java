package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.᩶ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4FN */
/* JADX INFO: loaded from: classes5.dex */
public final class C21379 extends AbstractRunnableC22060 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18395 f68077;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC24495 f68078;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21379(C18395 c18395, InterfaceC24495 interfaceC24495) {
        super("OkHttp %s", c18395.f59912.f26430.m39875());
        this.f68077 = c18395;
        this.f68078 = interfaceC24495;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48613(ExecutorService executorService) {
        C18395 c18395 = this.f68077;
        C24363 c24363 = c18395.f59914;
        try {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                c18395.f59917.getClass();
                this.f68078.mo50423(interruptedIOException);
                c24363.f79037.m20151(this);
            }
        } catch (Throwable th) {
            c24363.f79037.m20151(this);
            throw th;
        }
    }

    @Override // l.AbstractRunnableC22060
    /* JADX INFO: renamed from: ۙ */
    public final void mo1658() {
        InterfaceC24495 interfaceC24495 = this.f68078;
        C18395 c18395 = this.f68077;
        C24363 c24363 = c18395.f59914;
        c18395.f59916.m36749();
        boolean z = false;
        try {
            try {
                try {
                    interfaceC24495.mo50424(c18395.m42902());
                } catch (IOException e) {
                    e = e;
                    z = true;
                    IOException iOExceptionM42901 = c18395.m42901(e);
                    if (z) {
                        C9052 c9052M24178 = C9052.m24178();
                        StringBuilder sb = new StringBuilder("Callback failure for ");
                        StringBuilder sb2 = new StringBuilder();
                        C22121.m50078(sb2, c18395.f59913.m27160() ? "canceled " : "", "call", " to ");
                        sb2.append(c18395.f59912.f26430.m39875());
                        sb.append(sb2.toString());
                        c9052M24178.mo24180(4, sb.toString(), iOExceptionM42901);
                    } else {
                        c18395.f59917.getClass();
                        interfaceC24495.mo50423(iOExceptionM42901);
                    }
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    c18395.cancel();
                    if (!z) {
                        interfaceC24495.mo50423(new IOException("canceled due to " + th));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                c24363.f79037.m20151(this);
                throw th2;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
        }
        c24363.f79037.m20151(this);
    }
}
