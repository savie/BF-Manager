package l;

import com.umeng.analytics.pro.am;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۖۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2Y5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f7782;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC15614 f7783 = AbstractC15614.m37346();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f7784;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m8201() {
        long jNanoTime;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f7782) {
            ((C20090) this.f7783).getClass();
            jNanoTime = System.nanoTime() - this.f7784;
        } else {
            jNanoTime = 0;
        }
        return timeUnit.convert(jNanoTime, timeUnit);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C2433 m8200() {
        return new C2433();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8202() {
        C12128.m30314("This stopwatch is already running.", !this.f7782);
        this.f7782 = true;
        ((C20090) this.f7783).getClass();
        this.f7784 = System.nanoTime();
    }

    public final String toString() {
        long jNanoTime;
        String str;
        if (this.f7782) {
            ((C20090) this.f7783).getClass();
            jNanoTime = System.nanoTime() - this.f7784;
        } else {
            jNanoTime = 0;
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        double dConvert = jNanoTime / timeUnit2.convert(1L, timeUnit);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(dConvert)));
        sb.append(" ");
        switch (C9144.f29717[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = am.aB;
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = am.aG;
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        sb.append(str);
        return sb.toString();
    }
}
