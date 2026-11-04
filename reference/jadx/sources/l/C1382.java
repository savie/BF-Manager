package l;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.֨ᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 763M */
/* JADX INFO: loaded from: classes2.dex */
public final class C1382 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HandlerC18535 f4933;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public IOException f4934;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceExecutorC22879 f4935;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C21519 f4930 = new C21519(0, -9223372036854775807L);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C21519 f4932 = new C21519(2, -9223372036854775807L);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C21519 f4931 = new C21519(3, -9223372036854775807L);

    /* JADX WARN: Illegal instructions before constructor call */
    public C1382(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = C7116.f23455;
        this(C22133.m50098(Executors.newSingleThreadExecutor(new ThreadFactoryC2641(strConcat)), new C7376()));
    }

    public C1382(InterfaceExecutorC22879 interfaceExecutorC22879) {
        this.f4935 = interfaceExecutorC22879;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21519 m5076(long j, boolean z) {
        return new C21519(z ? 1 : 0, j);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m5084() {
        return this.f4934 != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5085() {
        this.f4934 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5082(InterfaceC0636 interfaceC0636, InterfaceC14805 interfaceC14805, int i) {
        Looper looperMyLooper = Looper.myLooper();
        C20782.m47566(looperMyLooper);
        this.f4934 = null;
        new HandlerC18535(this, looperMyLooper, interfaceC0636, interfaceC14805, i, SystemClock.elapsedRealtime()).m43114(0L);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m5086() {
        return this.f4933 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5080() {
        HandlerC18535 handlerC18535 = this.f4933;
        C20782.m47566(handlerC18535);
        handlerC18535.m43115(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5083(InterfaceC8094 interfaceC8094) {
        HandlerC18535 handlerC18535 = this.f4933;
        if (handlerC18535 != null) {
            handlerC18535.m43115(true);
        }
        InterfaceExecutorC22879 interfaceExecutorC22879 = this.f4935;
        if (interfaceC8094 != null) {
            interfaceExecutorC22879.execute(new RunnableC19281(interfaceC8094));
        }
        interfaceExecutorC22879.mo27772();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5081(int i) {
        IOException iOException = this.f4934;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC18535 handlerC18535 = this.f4933;
        if (handlerC18535 != null) {
            if (i == Integer.MIN_VALUE) {
                i = handlerC18535.f60231;
            }
            handlerC18535.m43113(i);
        }
    }
}
