package l;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۘ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4280 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Future f15421;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ExecutorService f15422;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16667 f15423;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21920 f15424;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC2557 f15425 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC10983 f15426;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1914 f15427;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f15428;

    public RunnableC4280(C21920 c21920, C16667 c16667, ExecutorService executorService, InterfaceC1914 interfaceC1914) {
        this.f15424 = c21920;
        this.f15423 = c16667;
        this.f15422 = executorService;
        this.f15427 = interfaceC1914;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1914 interfaceC1914 = this.f15427;
        ExecutorService executorService = this.f15422;
        try {
            try {
                try {
                    C2189.m6799(this.f15423.keySet(), new C13454(this, this.f15424));
                    executorService.shutdown();
                    executorService.awaitTermination(1L, TimeUnit.HOURS);
                } catch (InterruptedException unused) {
                }
            } catch (IOException e) {
                if (!interfaceC1914.mo2357()) {
                    interfaceC1914.mo6227(e);
                }
                executorService.shutdown();
                executorService.awaitTermination(1L, TimeUnit.HOURS);
            } catch (Exception e2) {
                if (!interfaceC1914.mo2357()) {
                    interfaceC1914.mo6227(new IOException(e2));
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
