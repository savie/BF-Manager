package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ܶۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5YY */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC15140 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int[] f49464;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final float[] f49465;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21489 f49466;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 f49467;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile boolean f49468;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14435[] f49469;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6585 f49470;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f49471;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f49472;

    public RunnableC15140(C21489 c21489, int[] iArr, C14435[] c14435Arr) {
        this.f49466 = c21489;
        this.f49467 = c21489.f41297;
        this.f49472 = c21489.m30745();
        this.f49471 = c21489.f69823.get();
        this.f49464 = iArr;
        this.f49469 = c14435Arr;
        this.f49465 = new float[iArr.length];
        synchronized (c21489.f41286) {
            this.f49470 = c21489.f41286.m17872();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m36306() {
        if (this.f49468 || this.f49466.f41325 || this.f49467.mo2395() != this.f49472 || this.f49471 != this.f49466.f69823.get()) {
            throw new CancellationException();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        Runnable runnableC6672;
        final boolean z = false;
        try {
            try {
                m36306();
                C3329 c3329Mo2399 = this.f49467.mo2399();
                try {
                    if (c3329Mo2399.m9896() != this.f49472) {
                        c3329Mo2399.close();
                        runnableC6672 = new Runnable() { // from class: l.ۘۢۖ
                            @Override // java.lang.Runnable
                            public final void run() {
                                RunnableC15140.m36308(this.f14381, false);
                            }
                        };
                    } else {
                        c3329Mo2399.m9894(new RunnableC5302(1, this));
                        C3762 c3762 = new C3762(c3329Mo2399);
                        for (int i = 0; i < this.f49464.length; i++) {
                            m36306();
                            this.f49465[i] = this.f49469[i].m34707(c3762, this.f49470);
                        }
                        c3329Mo2399.close();
                        runnableC6672 = new RunnableC6672(0, this);
                    }
                    C16737.m39273(runnableC6672);
                } catch (Throwable th) {
                    try {
                        c3329Mo2399.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Error | RuntimeException unused) {
                runnable = new Runnable() { // from class: l.᩺ۢۖ
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnableC15140.m36308(this.f74451, z);
                    }
                };
                C16737.m39273(runnable);
            }
        } catch (CancellationException unused2) {
            runnable = new Runnable() { // from class: l.᩺ۢۖ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC15140.m36308(this.f74451, z);
                }
            };
            C16737.m39273(runnable);
        } catch (Throwable th3) {
            C16737.m39273(new Runnable() { // from class: l.᩺ۢۖ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC15140.m36308(this.f74451, z);
                }
            });
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36308(RunnableC15140 runnableC15140, boolean z) {
        if (runnableC15140.f49466.f69830 != runnableC15140) {
            return;
        }
        runnableC15140.f49466.f69830 = null;
        C21489 c21489 = runnableC15140.f49466;
        if (c21489.f41314.f20764 == c21489 && c21489.f41297 == runnableC15140.f49467 && !c21489.f41325) {
            if (runnableC15140.f49468 || !runnableC15140.f49466.m30759() || runnableC15140.f49466.m30745() != runnableC15140.f49472 || runnableC15140.f49471 != runnableC15140.f49466.f69823.get()) {
                runnableC15140.f49466.f41314.invalidate();
                return;
            }
            if (z) {
                if (runnableC15140.f49466.f69820 == null) {
                    C21489 c214810 = runnableC15140.f49466;
                    c214810.f69820 = C11425.m28537(c214810.f69825);
                }
                for (int i = 0; i < runnableC15140.f49464.length; i++) {
                    runnableC15140.f49466.f69825.mo26064(runnableC15140.f49465[i], runnableC15140.f49464[i]);
                    runnableC15140.f49466.f69820.m28541(runnableC15140.f49464[i]);
                    C21489 c214811 = runnableC15140.f49466;
                    c214811.f69836 = Math.max(c214811.f69836, runnableC15140.f49465[i]);
                }
                C21489 c214812 = runnableC15140.f49466;
                c214812.f69832 = c214812.f69820.m28540();
                runnableC15140.f49466.f41314.invalidate();
            }
        }
    }
}
