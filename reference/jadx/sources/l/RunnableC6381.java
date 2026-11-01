package l;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۛ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6381 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f21684;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2916 f21685;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f21686;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12359 f21687;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21688;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FutureC12075 f21689;

    public RunnableC6381(C6111 c6111, FutureC12075 futureC12075, InterfaceC2916 interfaceC2916, AbstractC12359 abstractC12359, int i, long j) {
        this.f21686 = c6111;
        this.f21689 = futureC12075;
        this.f21685 = interfaceC2916;
        this.f21687 = abstractC12359;
        this.f21688 = i;
        this.f21684 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        C6111 c6111 = this.f21686;
        C13190 c13190 = c6111.f20770;
        FutureC12075 futureC12075 = this.f21689;
        if (futureC12075.isDone()) {
            return;
        }
        try {
            InterfaceC2916 interfaceC2916 = c6111.f20708;
            InterfaceC2916 interfaceC2917 = this.f21685;
            if (interfaceC2916 == interfaceC2917) {
                AbstractC12359 abstractC12359 = c6111.f20764;
                AbstractC12359 abstractC123510 = this.f21687;
                if (abstractC12359 == abstractC123510 && interfaceC2917.mo2395() == this.f21688) {
                    if (c6111.isAttachedToWindow() && c6111.f20794.f6398 && c13190.m32642() && interfaceC2917.length() != 0) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        long j = this.f21684;
                        if (jUptimeMillis < j) {
                            if (c6111.m16968() && ((!abstractC123510.mo14804() || c6111.m16964(abstractC123510)) && (c6111.f20796 == null || c6111.m16964(abstractC123510)))) {
                                int iMax = Math.max(0, c6111.m17066());
                                int iMax2 = Math.max(1, c6111.m16814());
                                long jMo14795 = abstractC123510.mo14795(iMax, iMax2);
                                if (jMo14795 >= 0) {
                                    int i2 = (int) (jMo14795 >>> 32);
                                    int i3 = (int) jMo14795;
                                    c13190.m32621(interfaceC2917, i2, i3);
                                    if (c13190.m32662(i2, i3)) {
                                        i = i3;
                                        long jMo14796 = abstractC123510.mo14796(iMax, iMax2);
                                        if (jMo14796 != 0) {
                                            c13190.m32646(interfaceC2917, (int) (jMo14796 >>> 32), (int) jMo14796);
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    if (c13190.m32641(i2, i)) {
                                        futureC12075.m30019((Object) null);
                                        return;
                                    }
                                }
                            }
                            C16737.m39274(this, Math.min(10L, Math.max(1L, j - SystemClock.uptimeMillis())));
                            return;
                        }
                    }
                    futureC12075.m30019((Object) null);
                    return;
                }
            }
            throw new CancellationException("Initial highlight preparation was superseded");
        } catch (Throwable th) {
            futureC12075.m30021(th);
        }
    }
}
