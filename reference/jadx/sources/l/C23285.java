package l;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.᩺᩹ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 763M */
/* JADX INFO: loaded from: classes.dex */
public final class C23285 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HandlerC22579 f75526;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public IOException f75527;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceExecutorC7762 f75528;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C5645 f75525 = new C5645(0, -9223372036854775807L);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C5645 f75523 = new C5645(2, -9223372036854775807L);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C5645 f75524 = new C5645(3, -9223372036854775807L);

    /* JADX WARN: Illegal instructions before constructor call */
    public C23285(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = C17983.f57504;
        this(C9174.m23586(Executors.newSingleThreadExecutor(new ThreadFactoryC15162(strConcat)), new C11996()));
    }

    public C23285(InterfaceExecutorC7762 interfaceExecutorC7762) {
        this.f75528 = interfaceExecutorC7762;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5645 m51360(long j, boolean z) {
        return new C5645(z ? 1 : 0, j);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m51370() {
        return this.f75527 != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51371() {
        this.f75527 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51368(InterfaceC1411 interfaceC1411, InterfaceC2822 interfaceC2822, int i) {
        Looper looperMyLooper = Looper.myLooper();
        C2023.m6508(looperMyLooper);
        this.f75527 = null;
        new HandlerC22579(this, looperMyLooper, interfaceC1411, interfaceC2822, i, SystemClock.elapsedRealtime()).m50085(0L);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m51365() {
        return this.f75526 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51366() {
        HandlerC22579 handlerC22579 = this.f75526;
        C2023.m6508(handlerC22579);
        handlerC22579.m50086(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51369(InterfaceC13407 interfaceC13407) {
        HandlerC22579 handlerC22579 = this.f75526;
        if (handlerC22579 != null) {
            handlerC22579.m50086(true);
        }
        InterfaceExecutorC7762 interfaceExecutorC7762 = this.f75528;
        if (interfaceC13407 != null) {
            interfaceExecutorC7762.execute(new RunnableC4233(interfaceC13407));
        }
        interfaceExecutorC7762.mo20430();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51367(int i) throws IOException {
        IOException iOException = this.f75527;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC22579 handlerC22579 = this.f75526;
        if (handlerC22579 != null) {
            if (i == Integer.MIN_VALUE) {
                i = handlerC22579.f73598;
            }
            handlerC22579.m50084(i);
        }
    }
}
