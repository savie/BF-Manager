package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.۬ۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G4FN */
/* JADX INFO: loaded from: classes4.dex */
public final class C12841 extends AbstractRunnableC20602 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3667 f42714;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC2443 f42715;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12841(C3667 c3667, InterfaceC2443 interfaceC2443) {
        super("OkHttp %s", c3667.f13419.f74015.m34744());
        this.f42714 = c3667;
        this.f42715 = interfaceC2443;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31834(ExecutorService executorService) {
        C3667 c3667 = this.f42714;
        C5079 c5079 = c3667.f13418;
        try {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                c3667.f13421.getClass();
                this.f42715.mo7424(interruptedIOException);
                c5079.f17711.m22920(this);
            }
        } catch (Throwable th) {
            c5079.f17711.m22920(this);
            throw th;
        }
    }

    @Override // l.AbstractRunnableC20602
    /* JADX INFO: renamed from: ۙ */
    public final void mo4299() {
        InterfaceC2443 interfaceC2443 = this.f42715;
        C3667 c3667 = this.f42714;
        C5079 c5079 = c3667.f13418;
        c3667.f13420.m39092();
        boolean z = false;
        try {
            try {
                try {
                    interfaceC2443.mo7425(c3667.m10829());
                } catch (IOException e) {
                    e = e;
                    z = true;
                    IOException iOExceptionM10828 = c3667.m10828(e);
                    if (z) {
                        C18743 c18743M43294 = C18743.m43294();
                        StringBuilder sb = new StringBuilder("Callback failure for ");
                        StringBuilder sb2 = new StringBuilder();
                        C0219.m1594(sb2, c3667.f13417.m37424() ? "canceled " : "", "call", " to ");
                        sb2.append(c3667.f13419.f74015.m34744());
                        sb.append(sb2.toString());
                        c18743M43294.mo11390(4, sb.toString(), iOExceptionM10828);
                    } else {
                        c3667.f13421.getClass();
                        interfaceC2443.mo7424(iOExceptionM10828);
                    }
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    c3667.cancel();
                    if (!z) {
                        interfaceC2443.mo7424(new IOException("canceled due to " + th));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                c5079.f17711.m22920(this);
                throw th2;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
        }
        c5079.f17711.m22920(this);
    }
}
