package l;

import android.app.Application;
import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֫֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18PZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1569 implements InterfaceC0686 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f5442;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9771 f5444;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14902 f5445;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5054 f5446;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f5447;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final RunnableC19468 f5448;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C14902 f5449;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f5450;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21569 f5451;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile int f5452;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f5454;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f5453 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f5443 = new AtomicInteger();

    /* JADX WARN: Type inference failed for: r5v1, types: [l.ᩴ֨ۚ] */
    public C1569(AbstractC7629 abstractC7629, C9771 c9771, InterfaceC21569 interfaceC21569) {
        this.f5451 = interfaceC21569;
        this.f5444 = c9771;
        Application applicationM49084 = C21576.m49084();
        C24534 c24534 = new C24534(applicationM49084);
        c24534.m54814();
        C13644 c13644 = new C13644();
        c13644.m33381();
        C12131 c12131 = new C12131(c9771, c13644);
        C7379 c7379 = new C7379(applicationM49084);
        c7379.m20266(c12131);
        c7379.m20267(c24534);
        InterfaceC5054 interfaceC5054M20265 = c7379.m20265();
        this.f5446 = interfaceC5054M20265;
        interfaceC5054M20265.mo23545(0);
        interfaceC5054M20265.mo23554(false);
        interfaceC5054M20265.mo23577(new C5298(this, interfaceC21569, c9771, abstractC7629));
        this.f5448 = new Runnable() { // from class: l.ᩴ֨ۚ
            @Override // java.lang.Runnable
            public final void run() {
                C1569.m5578(this.f62898);
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5578(C1569 c1569) {
        InterfaceC19533 interfaceC19533 = c1569.f5446;
        if (((AbstractC7971) interfaceC19533).isPlaying()) {
            int currentPosition = (int) interfaceC19533.getCurrentPosition();
            if (currentPosition != c1569.f5453) {
                c1569.f5453 = currentPosition;
                c1569.f5451.mo35786(currentPosition);
            }
            Handler handlerM49077 = C21576.m49077();
            RunnableC19468 runnableC19468 = c1569.f5448;
            handlerM49077.postAtTime(runnableC19468, runnableC19468, SystemClock.uptimeMillis() + 10);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m5595(C1569 c1569) {
        int currentPosition = (int) c1569.f5446.getCurrentPosition();
        if (currentPosition != c1569.f5453) {
            c1569.f5453 = currentPosition;
            c1569.f5451.mo35786(currentPosition);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m5589(C1569 c1569) {
        Handler handlerM49077 = C21576.m49077();
        RunnableC19468 runnableC19468 = c1569.f5448;
        handlerM49077.postAtTime(runnableC19468, runnableC19468, SystemClock.uptimeMillis() + 10);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m5590(C1569 c1569) {
        C21576.m49077().removeCallbacksAndMessages(c1569.f5448);
    }

    @Override // l.InterfaceC0686
    public final void reset() {
        this.f5452 = 0;
        this.f5443.incrementAndGet();
        this.f5454 = false;
        this.f5442 = false;
        this.f5449 = null;
        this.f5445 = null;
        C21576.m49077().removeCallbacksAndMessages(this.f5448);
        this.f5446.stop();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m5593(final C1569 c1569, final int i, final C14902 c14902, final C19093 c19093, final long j) {
        if (C22415.m50557()) {
            if (c1569.m5582(i)) {
                c1569.f5451.mo19389(c14902, c19093, j);
                return;
            }
            return;
        }
        C21576.m49068(new Runnable() { // from class: l.ܳ֨ۚ
            @Override // java.lang.Runnable
            public final void run() {
                C1569.m5579(this.f48991, i, c14902, c19093, j);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5579(C1569 c1569, int i, C14902 c14902, C19093 c19093, long j) {
        if (c1569.m5582(i)) {
            c1569.f5451.mo19389(c14902, c19093, j);
        }
    }

    @Override // l.InterfaceC0686
    public final int getCurrentPosition() {
        if (this.f5442) {
            return (int) Math.min(Math.max(this.f5446.getCurrentPosition(), 0L), 2147483647L);
        }
        return 0;
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۙ */
    public final void mo2978(float f) {
        if (this.f5442) {
            InterfaceC5054 interfaceC5054 = this.f5446;
            if (interfaceC5054.mo23563().f24500 != f) {
                interfaceC5054.mo23551(new C7445(f));
            }
        }
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۙ */
    public final void mo2979(int i, RunnableC11872 runnableC11872) {
        if (this.f5442) {
            ((AbstractC7971) this.f5446).seekTo(i);
            runnableC11872.run();
        }
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo2981() {
        return this.f5442;
    }

    @Override // l.InterfaceC0686
    public final void pause() {
        if (this.f5454) {
            return;
        }
        if (!this.f5442) {
            throw new IllegalStateException("MusicPlayer is not prepared");
        }
        this.f5447 = true;
        ((AbstractC7971) this.f5446).mo23554(false);
        this.f5451.mo35787(false);
    }

    @Override // l.InterfaceC0686
    public final void start() {
        if (this.f5454) {
            return;
        }
        if (!this.f5442) {
            throw new IllegalStateException("MusicPlayer is not prepared");
        }
        this.f5447 = false;
        ((AbstractC7971) this.f5446).mo23554(true);
        mo2978(C11369.f35782[C11369.m28682()]);
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۙ */
    public final void mo2980(C14902 c14902) {
        if (this.f5454 || this.f5450) {
            throw new IllegalStateException();
        }
        this.f5454 = true;
        this.f5442 = false;
        this.f5445 = null;
        C21576.m49077().removeCallbacksAndMessages(this.f5448);
        this.f5446.stop();
        this.f5452 = this.f5443.incrementAndGet();
        this.f5449 = c14902;
        ((AbstractC7971) this.f5446).m21694(c14902);
        this.f5446.mo23574();
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2983() {
        return this.f5454;
    }

    @Override // l.InterfaceC0686
    public final boolean isPlaying() {
        return this.f5446.isPlaying();
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2984() {
        AbstractC7971 abstractC7971 = (AbstractC7971) this.f5446;
        abstractC7971.seekTo(0L);
        if (this.f5447) {
            abstractC7971.mo23554(false);
        }
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ᩸ */
    public final void mo2985() {
        AbstractC7971 abstractC7971 = (AbstractC7971) this.f5446;
        abstractC7971.seekTo(0L);
        abstractC7971.mo23554(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۙ */
    public final void mo2977() {
        InterfaceC5054 interfaceC5054 = this.f5446;
        if (this.f5450) {
            return;
        }
        this.f5452 = 0;
        this.f5443.incrementAndGet();
        C21576.m49077().removeCallbacksAndMessages(this.f5448);
        if (((AbstractC7971) interfaceC5054).isPlaying()) {
            interfaceC5054.stop();
        }
        this.f5454 = false;
        this.f5442 = false;
        this.f5449 = null;
        this.f5445 = null;
        interfaceC5054.mo15286();
        C9771 c9771 = this.f5444;
        c9771.m25476();
        c9771.m25474();
        this.f5450 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m5582(int i) {
        return i != 0 && !this.f5450 && i == this.f5452 && i == this.f5443.get();
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo2982() {
        return this.f5450;
    }
}
