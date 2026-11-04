package l;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.᩺۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24175 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13753 f78297;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19106 f78298;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f78299;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f78300;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f78301;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FutureC23690 f78302;

    public RunnableC24175(C24132 c24132, FutureC23690 futureC23690, InterfaceC19106 interfaceC19106, AbstractC13753 abstractC13753, int i, long j) {
        this.f78299 = c24132;
        this.f78302 = futureC23690;
        this.f78298 = interfaceC19106;
        this.f78297 = abstractC13753;
        this.f78301 = i;
        this.f78300 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        C24132 c24132 = this.f78299;
        C1314 c1314 = c24132.f78033;
        FutureC23690 futureC23690 = this.f78302;
        if (futureC23690.isDone()) {
            return;
        }
        try {
            InterfaceC19106 interfaceC19106 = c24132.f78058;
            InterfaceC19106 interfaceC19107 = this.f78298;
            if (interfaceC19106 == interfaceC19107) {
                AbstractC13753 abstractC13753 = c24132.f78022;
                AbstractC13753 abstractC13754 = this.f78297;
                if (abstractC13753 == abstractC13754 && interfaceC19107.mo15344() == this.f78301) {
                    if (c24132.isAttachedToWindow() && c24132.f78066.f45755 && c1314.m4816() && interfaceC19107.length() != 0) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        long j = this.f78300;
                        if (jUptimeMillis < j) {
                            if (c24132.m53878() && ((!abstractC13754.mo25237() || c24132.m53985(abstractC13754)) && (c24132.f78021 == null || c24132.m53985(abstractC13754)))) {
                                int iMax = Math.max(0, c24132.m54026());
                                int iMax2 = Math.max(1, c24132.m53993());
                                long jMo25230 = abstractC13754.mo25230(iMax, iMax2);
                                if (jMo25230 >= 0) {
                                    int i2 = (int) (jMo25230 >>> 32);
                                    int i3 = (int) jMo25230;
                                    c1314.m4838(interfaceC19107, i2, i3);
                                    if (c1314.m4821(i2, i3)) {
                                        i = i3;
                                        long jMo25240 = abstractC13754.mo25240(iMax, iMax2);
                                        if (jMo25240 != 0) {
                                            c1314.m4814(interfaceC19107, (int) (jMo25240 >>> 32), (int) jMo25240);
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    if (c1314.m4827(i2, i)) {
                                        futureC23690.m52935((Object) null);
                                        return;
                                    }
                                }
                            }
                            C21576.m49069(this, Math.min(10L, Math.max(1L, j - SystemClock.uptimeMillis())));
                            return;
                        }
                    }
                    futureC23690.m52935((Object) null);
                    return;
                }
            }
            throw new CancellationException("Initial highlight preparation was superseded");
        } catch (Throwable th) {
            futureC23690.m52937(th);
        }
    }
}
