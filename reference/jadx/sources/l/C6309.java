package l;

import com.umeng.analytics.pro.am;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۛ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2Y5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6309 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f21334;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC2635 f21335 = AbstractC2635.m8122();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f21336;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m17408() {
        long jNanoTime;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f21334) {
            ((C11809) this.f21335).getClass();
            jNanoTime = System.nanoTime() - this.f21336;
        } else {
            jNanoTime = 0;
        }
        return timeUnit.convert(jNanoTime, timeUnit);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C6309 m17407() {
        return new C6309();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17409() {
        C18304.m42522("This stopwatch is already running.", !this.f21334);
        this.f21334 = true;
        ((C11809) this.f21335).getClass();
        this.f21336 = System.nanoTime();
    }

    public final String toString() {
        long jNanoTime;
        String str;
        if (this.f21334) {
            ((C11809) this.f21335).getClass();
            jNanoTime = System.nanoTime() - this.f21336;
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
        switch (C17598.f55936[timeUnit.ordinal()]) {
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
