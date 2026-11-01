package l;

import android.app.Application;
import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۟᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 18PZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7677 implements InterfaceC8530 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC17693 f25397;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f25399;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7824 f25400;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C13689 f25401;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11601 f25402;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile int f25404;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C13689 f25405;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final RunnableC8383 f25406;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f25407;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f25408;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f25409;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f25398 = -1;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f25403 = new AtomicInteger();

    public C7677(AbstractC9677 abstractC9677, C11601 c11601, InterfaceC7824 interfaceC7824) {
        this.f25400 = interfaceC7824;
        this.f25402 = c11601;
        Application applicationM39277 = C16737.m39277();
        C3455 c3455 = new C3455(applicationM39277);
        c3455.m10162();
        C18511 c18511 = new C18511();
        c18511.m42902();
        C1598 c1598 = new C1598(c11601, c18511);
        C14872 c14872 = new C14872(applicationM39277);
        c14872.m35565(c1598);
        c14872.m35566(c3455);
        InterfaceC17693 interfaceC17693M35564 = c14872.m35564();
        this.f25397 = interfaceC17693M35564;
        interfaceC17693M35564.mo25812(0);
        interfaceC17693M35564.mo25820(false);
        interfaceC17693M35564.mo25839(new C10500(this, interfaceC7824, c11601, abstractC9677));
        this.f25406 = new RunnableC8383(0, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20280(C7677 c7677) {
        InterfaceC10161 interfaceC10161 = c7677.f25397;
        if (((AbstractC22465) interfaceC10161).isPlaying()) {
            int currentPosition = (int) interfaceC10161.getCurrentPosition();
            if (currentPosition != c7677.f25398) {
                c7677.f25398 = currentPosition;
                c7677.f25400.mo20647(currentPosition);
            }
            Handler handlerM39278 = C16737.m39278();
            RunnableC8383 runnableC8383 = c7677.f25406;
            handlerM39278.postAtTime(runnableC8383, runnableC8383, SystemClock.uptimeMillis() + 10);
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static void m20295(C7677 c7677) {
        int currentPosition = (int) c7677.f25397.getCurrentPosition();
        if (currentPosition != c7677.f25398) {
            c7677.f25398 = currentPosition;
            c7677.f25400.mo20647(currentPosition);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m20292(C7677 c7677) {
        Handler handlerM39278 = C16737.m39278();
        RunnableC8383 runnableC8383 = c7677.f25406;
        handlerM39278.postAtTime(runnableC8383, runnableC8383, SystemClock.uptimeMillis() + 10);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m20293(C7677 c7677) {
        C16737.m39278().removeCallbacksAndMessages(c7677.f25406);
    }

    @Override // l.InterfaceC8530
    public final void reset() {
        this.f25404 = 0;
        this.f25403.incrementAndGet();
        this.f25409 = false;
        this.f25399 = false;
        this.f25405 = null;
        this.f25401 = null;
        C16737.m39278().removeCallbacksAndMessages(this.f25406);
        this.f25397.stop();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m20291(final C7677 c7677, final int i, final C13689 c13689, final C20979 c20979, final long j) {
        if (C13890.m33728()) {
            if (c7677.m20284(i)) {
                c7677.f25400.mo18748(c13689, c20979, j);
                return;
            }
            return;
        }
        C16737.m39273(new Runnable() { // from class: l.᩵᩵۬
            @Override // java.lang.Runnable
            public final void run() {
                C7677.m20281(this.f63156, i, c13689, c20979, j);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20281(C7677 c7677, int i, C13689 c13689, C20979 c20979, long j) {
        if (c7677.m20284(i)) {
            c7677.f25400.mo18748(c13689, c20979, j);
        }
    }

    @Override // l.InterfaceC8530
    public final int getCurrentPosition() {
        if (this.f25399) {
            return (int) Math.min(Math.max(this.f25397.getCurrentPosition(), 0L), 2147483647L);
        }
        return 0;
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20299(float f) {
        if (this.f25399) {
            InterfaceC17693 interfaceC17693 = this.f25397;
            if (interfaceC17693.mo25832().f69728 != f) {
                interfaceC17693.mo25819(new C21449(f));
            }
        }
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20300(int i, RunnableC11352 runnableC11352) {
        if (this.f25399) {
            ((AbstractC22465) this.f25397).seekTo(i);
            runnableC11352.run();
        }
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo20303() {
        return this.f25399;
    }

    @Override // l.InterfaceC8530
    public final void pause() {
        if (this.f25409) {
            return;
        }
        if (!this.f25399) {
            throw new IllegalStateException("MusicPlayer is not prepared");
        }
        this.f25408 = true;
        ((AbstractC22465) this.f25397).mo25820(false);
        this.f25400.mo20648(false);
    }

    @Override // l.InterfaceC8530
    public final void start() {
        if (this.f25409) {
            return;
        }
        if (!this.f25399) {
            throw new IllegalStateException("MusicPlayer is not prepared");
        }
        this.f25408 = false;
        ((AbstractC22465) this.f25397).mo25820(true);
        mo20299(C2758.f10570[C2758.m8418()]);
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20301(C13689 c13689) {
        if (this.f25409 || this.f25407) {
            throw new IllegalStateException();
        }
        this.f25409 = true;
        this.f25399 = false;
        this.f25401 = null;
        C16737.m39278().removeCallbacksAndMessages(this.f25406);
        this.f25397.stop();
        this.f25404 = this.f25403.incrementAndGet();
        this.f25405 = c13689;
        ((AbstractC22465) this.f25397).m49966(c13689);
        this.f25397.mo25836();
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo20302() {
        return this.f25409;
    }

    @Override // l.InterfaceC8530
    public final boolean isPlaying() {
        return this.f25397.isPlaying();
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo20304() {
        AbstractC22465 abstractC22465 = (AbstractC22465) this.f25397;
        abstractC22465.seekTo(0L);
        if (this.f25408) {
            abstractC22465.mo25820(false);
        }
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo20297() {
        AbstractC22465 abstractC22465 = (AbstractC22465) this.f25397;
        abstractC22465.seekTo(0L);
        abstractC22465.mo25820(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20298() {
        InterfaceC17693 interfaceC17693 = this.f25397;
        if (this.f25407) {
            return;
        }
        this.f25404 = 0;
        this.f25403.incrementAndGet();
        C16737.m39278().removeCallbacksAndMessages(this.f25406);
        if (((AbstractC22465) interfaceC17693).isPlaying()) {
            interfaceC17693.stop();
        }
        this.f25409 = false;
        this.f25399 = false;
        this.f25405 = null;
        this.f25401 = null;
        interfaceC17693.mo36793();
        C11601 c11601 = this.f25402;
        c11601.m28927();
        c11601.m28928();
        this.f25407 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m20284(int i) {
        return i != 0 && !this.f25407 && i == this.f25404 && i == this.f25403.get();
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean mo20296() {
        return this.f25407;
    }
}
