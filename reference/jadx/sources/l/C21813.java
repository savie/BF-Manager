package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩷ۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C21813 implements Comparable {
    public final TimeUnit a;
    public final long b;
    public C0358 c;
    public String d;

    public static long k(long j, long j2, long j3) {
        if (j > j3) {
            return C25227.FOREVER_NS;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    public C21813(long j, TimeUnit timeUnit, C0358 c0358) {
        this.b = j;
        this.a = timeUnit;
        this.c = c0358;
    }

    public static C21813 from(long j, TimeUnit timeUnit) {
        C17359.requireNonNull(timeUnit, "unit");
        return new C21813(j, timeUnit, null);
    }

    public static C21813 fromMillis(long j) {
        return new C21813(j, TimeUnit.MILLISECONDS, null);
    }

    public static C21813 from(C0358 c0358) {
        C17359.requireNonNull(c0358, "instant");
        return new C21813(0L, null, c0358);
    }

    public long to(TimeUnit timeUnit) {
        C17359.requireNonNull(timeUnit, "unit");
        TimeUnit timeUnit2 = this.a;
        if (timeUnit2 != null) {
            return timeUnit.convert(this.b, timeUnit2);
        }
        long jConvert = timeUnit.convert(this.c.getEpochSecond(), TimeUnit.SECONDS);
        if (jConvert == Long.MIN_VALUE || jConvert == C25227.FOREVER_NS) {
            return jConvert;
        }
        long jConvert2 = timeUnit.convert(this.c.getNano(), TimeUnit.NANOSECONDS);
        long j = jConvert + jConvert2;
        if (((jConvert2 ^ j) & (jConvert ^ j)) >= 0) {
            return j;
        }
        if (jConvert < 0) {
            return Long.MIN_VALUE;
        }
        return C25227.FOREVER_NS;
    }

    public long toMillis() {
        TimeUnit timeUnit = this.a;
        if (timeUnit != null) {
            return timeUnit.toMillis(this.b);
        }
        long epochSecond = this.c.getEpochSecond();
        int nano = this.c.getNano();
        long j = epochSecond * 1000;
        if (((Math.abs(epochSecond) | 1000) >>> 31) == 0 || j / 1000 == epochSecond) {
            return j + ((long) (nano / BasicLabelFormatter.MILLION));
        }
        if (epochSecond < 0) {
            return Long.MIN_VALUE;
        }
        return C25227.FOREVER_NS;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:22:0x009c  */
    public C0358 toInstant() {
        long jK;
        int iO;
        if (this.c == null) {
            switch (AbstractC0930.a[this.a.ordinal()]) {
                case 1:
                    jK = k(this.b, 86400L, 106751991167300L);
                    iO = 0;
                    if (jK <= -31557014167219200L) {
                        this.c = C0358.c;
                    } else if (jK >= 31556889864403199L) {
                        this.c = C0358.d;
                    } else {
                        this.c = C0358.ofEpochSecond(jK, iO);
                    }
                    break;
                case 2:
                    jK = k(this.b, 3600L, 2562047788015215L);
                    iO = 0;
                    if (jK <= -31557014167219200L) {
                        this.c = C0358.c;
                    } else if (jK >= 31556889864403199L) {
                        this.c = C0358.d;
                    } else {
                        this.c = C0358.ofEpochSecond(jK, iO);
                    }
                    break;
                case 3:
                    jK = k(this.b, 60L, 153722867280912930L);
                    iO = 0;
                    if (jK <= -31557014167219200L) {
                        this.c = C0358.c;
                    } else if (jK >= 31556889864403199L) {
                        this.c = C0358.d;
                    } else {
                        this.c = C0358.ofEpochSecond(jK, iO);
                    }
                    break;
                case 4:
                    jK = this.b;
                    iO = 0;
                    if (jK <= -31557014167219200L) {
                        this.c = C0358.c;
                    } else if (jK >= 31556889864403199L) {
                        this.c = C0358.d;
                    } else {
                        this.c = C0358.ofEpochSecond(jK, iO);
                    }
                    break;
                case 5:
                    jK = AbstractC1758.z(this.b, 1000L);
                    iO = ((int) AbstractC1758.O(this.b, 1000L)) * BasicLabelFormatter.MILLION;
                    if (jK <= -31557014167219200L) {
                        this.c = C0358.c;
                    } else if (jK >= 31556889864403199L) {
                        this.c = C0358.d;
                    } else {
                        this.c = C0358.ofEpochSecond(jK, iO);
                    }
                    break;
                case 6:
                    jK = AbstractC1758.z(this.b, 1000000L);
                    iO = ((int) AbstractC1758.O(this.b, 1000000L)) * 1000;
                    if (jK <= -31557014167219200L) {
                        this.c = C0358.c;
                    } else if (jK >= 31556889864403199L) {
                        this.c = C0358.d;
                    } else {
                        this.c = C0358.ofEpochSecond(jK, iO);
                    }
                    break;
                case 7:
                    jK = AbstractC1758.z(this.b, 1000000000L);
                    iO = (int) AbstractC1758.O(this.b, 1000000000L);
                    if (jK <= -31557014167219200L) {
                        this.c = C0358.c;
                    } else if (jK >= 31556889864403199L) {
                        this.c = C0358.d;
                    } else {
                        this.c = C0358.ofEpochSecond(jK, iO);
                    }
                    break;
                default:
                    throw new AssertionError("Unit not handled");
            }
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C21813) && compareTo((C21813) obj) == 0;
    }

    public final int hashCode() {
        return toInstant().hashCode();
    }

    public final long p(long j) {
        TimeUnit timeUnit = this.a;
        if (timeUnit != null) {
            return timeUnit.toNanos(this.b - timeUnit.convert(j, TimeUnit.DAYS));
        }
        return TimeUnit.SECONDS.toNanos(toInstant().getEpochSecond() - TimeUnit.DAYS.toSeconds(j));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C21813 c21813) {
        long days;
        long days2;
        TimeUnit timeUnit = this.a;
        if (timeUnit != null && timeUnit == c21813.a) {
            return Long.compare(this.b, c21813.b);
        }
        long epochSecond = toInstant().getEpochSecond();
        int iCompare = Long.compare(epochSecond, c21813.toInstant().getEpochSecond());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(toInstant().getNano(), c21813.toInstant().getNano());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        if (epochSecond != 31556889864403199L && epochSecond != -31557014167219200L) {
            return 0;
        }
        TimeUnit timeUnit2 = this.a;
        if (timeUnit2 != null) {
            days = timeUnit2.toDays(this.b);
        } else {
            days = TimeUnit.SECONDS.toDays(toInstant().getEpochSecond());
        }
        TimeUnit timeUnit3 = c21813.a;
        if (timeUnit3 != null) {
            days2 = timeUnit3.toDays(c21813.b);
        } else {
            days2 = TimeUnit.SECONDS.toDays(c21813.toInstant().getEpochSecond());
        }
        if (days == days2) {
            return Long.compare(p(days), c21813.p(days2));
        }
        return Long.compare(days, days2);
    }

    public static void i(StringBuilder sb, int i, int i2) {
        while (i > 0) {
            sb.append((char) ((i2 / i) + 48));
            i2 %= i;
            i /= 10;
        }
    }

    public final String toString() {
        long epochSecond;
        int nano;
        long jZ;
        C19003 c19003U;
        if (this.d == null) {
            if (this.c == null && this.a.compareTo(TimeUnit.SECONDS) >= 0) {
                epochSecond = this.a.toSeconds(this.b);
                nano = 0;
            } else {
                epochSecond = toInstant().getEpochSecond();
                nano = toInstant().getNano();
            }
            if (epochSecond >= -62167219200L) {
                long j = epochSecond - 253402300800L;
                jZ = AbstractC1758.z(j, 315569520000L) + 1;
                c19003U = C19003.U(AbstractC1758.O(j, 315569520000L) - 62167219200L, nano, C11149.f);
            } else {
                long j2 = epochSecond + 62167219200L;
                jZ = j2 / 315569520000L;
                c19003U = C19003.U((j2 % 315569520000L) - 62167219200L, nano, C11149.f);
            }
            int year = (((int) jZ) * 10000) + c19003U.a.getYear();
            if (year <= 0) {
                year--;
            }
            int nano2 = c19003U.b.getNano();
            StringBuilder sb = new StringBuilder(64);
            sb.append(year < 0 ? "-" : "");
            int iAbs = Math.abs(year);
            if (iAbs < 10000) {
                i(sb, 1000, Math.abs(iAbs));
            } else {
                sb.append(String.valueOf(iAbs));
            }
            sb.append('-');
            i(sb, 10, c19003U.a.getMonthValue());
            sb.append('-');
            i(sb, 10, c19003U.a.getDayOfMonth());
            sb.append('T');
            i(sb, 10, c19003U.b.getHour());
            sb.append(':');
            i(sb, 10, c19003U.b.getMinute());
            sb.append(':');
            i(sb, 10, c19003U.b.getSecond());
            if (nano2 != 0) {
                sb.append('.');
                int i = 100000000;
                while (nano2 % 10 == 0) {
                    nano2 /= 10;
                    i /= 10;
                }
                i(sb, i, nano2);
            }
            sb.append('Z');
            this.d = sb.toString();
        }
        return this.d;
    }
}
