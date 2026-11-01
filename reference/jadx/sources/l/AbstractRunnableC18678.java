package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ᩴۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2NA */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractRunnableC18678 extends AbstractC8801 implements Runnable {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f60625 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22517 f60626;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceFutureC12329 f60627;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC12329 interfaceFutureC12329 = this.f60627;
        C22517 c22517 = this.f60626;
        if (((this.f69870 instanceof C1516) | (interfaceFutureC12329 == null)) || (c22517 == null)) {
            return;
        }
        this.f60627 = null;
        ((C0333) interfaceFutureC12329).getClass();
        try {
            Object objM34846 = C14446.m34846(interfaceFutureC12329);
            try {
                c22517.apply(objM34846);
                this.f60626 = null;
                ((C17972) this).mo14563(objM34846);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    mo14564(th);
                } finally {
                    this.f60626 = null;
                }
            }
        } catch (Error e) {
            mo14564((Throwable) e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            mo14564(e2.getCause());
        } catch (Exception e3) {
            mo14564((Throwable) e3);
        }
    }

    @Override // l.AbstractC5272
    /* JADX INFO: renamed from: ۖ */
    public final void mo14562() {
        InterfaceFutureC12329 interfaceFutureC12329 = this.f60627;
        if ((interfaceFutureC12329 != null) & (this.f69870 instanceof C1516)) {
            Object obj = this.f69870;
            if (obj instanceof C1516) {
                boolean z = ((C1516) obj).f6217;
            }
            interfaceFutureC12329.getClass();
        }
        this.f60627 = null;
        this.f60626 = null;
    }

    @Override // l.AbstractC5272
    /* JADX INFO: renamed from: ۚ */
    public final String mo14565() {
        String str;
        InterfaceFutureC12329 interfaceFutureC12329 = this.f60627;
        C22517 c22517 = this.f60626;
        String strMo14565 = super.mo14565();
        if (interfaceFutureC12329 != null) {
            str = "inputFuture=[" + interfaceFutureC12329 + "], ";
        } else {
            str = "";
        }
        if (c22517 == null) {
            if (strMo14565 != null) {
                return C15489.m37076(str, strMo14565);
            }
            return null;
        }
        return str + "function=[" + c22517 + "]";
    }
}
