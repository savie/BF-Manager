package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.᩻ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2NA */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC25180 extends AbstractC16228 implements Runnable {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f81389 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C5591 f81390;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceFutureC14736 f81391;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC14736 interfaceFutureC14736 = this.f81391;
        C5591 c5591 = this.f81390;
        if (((this.f6857 instanceof C1291) | (interfaceFutureC14736 == null)) || (c5591 == null)) {
            return;
        }
        this.f81391 = null;
        ((C24434) interfaceFutureC14736).getClass();
        try {
            Object objM44537 = C19212.m44537(interfaceFutureC14736);
            try {
                c5591.apply(objM44537);
                this.f81390 = null;
                ((C11753) this).mo2583(objM44537);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    mo2584(th);
                } finally {
                    this.f81390 = null;
                }
            }
        } catch (Error e) {
            mo2584((Throwable) e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            mo2584(e2.getCause());
        } catch (Exception e3) {
            mo2584((Throwable) e3);
        }
    }

    @Override // l.AbstractC22196
    /* JADX INFO: renamed from: ᩸ */
    public final void mo50211() {
        InterfaceFutureC14736 interfaceFutureC14736 = this.f81391;
        if ((interfaceFutureC14736 != null) & (this.f6857 instanceof C1291)) {
            Object obj = this.f6857;
            if (obj instanceof C1291) {
                boolean z = ((C1291) obj).f4611;
            }
            interfaceFutureC14736.getClass();
        }
        this.f81391 = null;
        this.f81390 = null;
    }

    @Override // l.AbstractC22196
    /* JADX INFO: renamed from: ᩴ */
    public final String mo50210() {
        String str;
        InterfaceFutureC14736 interfaceFutureC14736 = this.f81391;
        C5591 c5591 = this.f81390;
        String strMo50210 = super.mo50210();
        if (interfaceFutureC14736 != null) {
            str = "inputFuture=[" + interfaceFutureC14736 + "], ";
        } else {
            str = "";
        }
        if (c5591 == null) {
            if (strMo50210 != null) {
                return C14483.m34972(str, strMo50210);
            }
            return null;
        }
        return str + "function=[" + c5591 + "]";
    }
}
