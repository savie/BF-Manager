package l;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۚᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5850 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC11573 f20079;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22311 f20080;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17036 f20081;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ExecutorService f20082;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC2386 f20083 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Future f20084;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC0171 f20085;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f20086;

    public RunnableC5850(C17036 c17036, C22311 c22311, ExecutorService executorService, InterfaceC0171 interfaceC0171) {
        this.f20081 = c17036;
        this.f20080 = c22311;
        this.f20082 = executorService;
        this.f20085 = interfaceC0171;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0171 interfaceC0171 = this.f20085;
        ExecutorService executorService = this.f20082;
        try {
            try {
                try {
                    C22069.m49901(this.f20080.keySet(), new C13307(this, this.f20081));
                    executorService.shutdown();
                    executorService.awaitTermination(1L, TimeUnit.HOURS);
                } catch (InterruptedException unused) {
                }
            } catch (IOException e) {
                if (!interfaceC0171.mo924()) {
                    interfaceC0171.mo1453(e);
                }
                executorService.shutdown();
                executorService.awaitTermination(1L, TimeUnit.HOURS);
            } catch (Exception e2) {
                if (!interfaceC0171.mo924()) {
                    interfaceC0171.mo1453(new IOException(e2));
                }
                executorService.shutdown();
                executorService.awaitTermination(1L, TimeUnit.HOURS);
            }
        } catch (Throwable th) {
            executorService.shutdown();
            try {
                executorService.awaitTermination(1L, TimeUnit.HOURS);
            } catch (InterruptedException unused2) {
            }
            throw th;
        }
    }
}
