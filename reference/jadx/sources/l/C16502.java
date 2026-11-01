package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܽ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16502 implements Comparable {
    public final TimeUnit a;
    public final long b;
    public C18285 c;
    public String d;

    public static long n(long j, long j2, long j3) {
        if (j > j3) {
            return C17492.FOREVER_NS;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    public C16502(long j, TimeUnit timeUnit, C18285 c18285) {
        this.b = j;
        this.a = timeUnit;
        this.c = c18285;
    }

    public static C16502 from(long j, TimeUnit timeUnit) {
        C13638.requireNonNull(timeUnit, "unit");
        return new C16502(j, timeUnit, null);
    }

    public static C16502 fromMillis(long j) {
        return new C16502(j, TimeUnit.MILLISECONDS, null);
    }

    public static C16502 from(C18285 c18285) {
        C13638.requireNonNull(c18285, "instant");
        return new C16502(0L, null, c18285);
    }

    public long to(TimeUnit timeUnit) {
        C13638.requireNonNull(timeUnit, "unit");
        TimeUnit timeUnit2 = this.a;
        if (timeUnit2 != null) {
            return timeUnit.convert(this.b, timeUnit2);
        }
        long jConvert = timeUnit.convert(this.c.getEpochSecond(), TimeUnit.SECONDS);
        if (jConvert == Long.MIN_VALUE || jConvert == C17492.FOREVER_NS) {
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
        return C17492.FOREVER_NS;
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
        return C17492.FOREVER_NS;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:22:0x009c  */
    public C18285 toInstant() {
        long jN;
        int iO;
        if (this.c == null) {
            switch (AbstractC9135.a[this.a.ordinal()]) {
                case 1:
                    jN = n(this.b, 86400L, 106751991167300L);
                    iO = 0;
                    if (jN <= -31557014167219200L) {
                        this.c = C18285.c;
                    } else if (jN >= 31556889864403199L) {
                        this.c = C18285.d;
                    } else {
                        this.c = C18285.ofEpochSecond(jN, iO);
                    }
                    break;
                case 2:
                    jN = n(this.b, 3600L, 2562047788015215L);
                    iO = 0;
                    if (jN <= -31557014167219200L) {
                        this.c = C18285.c;
                    } else if (jN >= 31556889864403199L) {
                        this.c = C18285.d;
                    } else {
                        this.c = C18285.ofEpochSecond(jN, iO);
                    }
                    break;
                case 3:
                    jN = n(this.b, 60L, 153722867280912930L);
                    iO = 0;
                    if (jN <= -31557014167219200L) {
                        this.c = C18285.c;
                    } else if (jN >= 31556889864403199L) {
                        this.c = C18285.d;
                    } else {
                        this.c = C18285.ofEpochSecond(jN, iO);
                    }
                    break;
                case 4:
                    jN = this.b;
                    iO = 0;
                    if (jN <= -31557014167219200L) {
                        this.c = C18285.c;
                    } else if (jN >= 31556889864403199L) {
                        this.c = C18285.d;
                    } else {
                        this.c = C18285.ofEpochSecond(jN, iO);
                    }
                    break;
                case 5:
                    jN = AbstractC1726.z(this.b, 1000L);
                    iO = ((int) AbstractC1726.O(this.b, 1000L)) * BasicLabelFormatter.MILLION;
                    if (jN <= -31557014167219200L) {
                        this.c = C18285.c;
                    } else if (jN >= 31556889864403199L) {
                        this.c = C18285.d;
                    } else {
                        this.c = C18285.ofEpochSecond(jN, iO);
                    }
                    break;
                case 6:
                    jN = AbstractC1726.z(this.b, 1000000L);
                    iO = ((int) AbstractC1726.O(this.b, 1000000L)) * 1000;
                    if (jN <= -31557014167219200L) {
                        this.c = C18285.c;
                    } else if (jN >= 31556889864403199L) {
                        this.c = C18285.d;
                    } else {
                        this.c = C18285.ofEpochSecond(jN, iO);
                    }
                    break;
                case 7:
                    jN = AbstractC1726.z(this.b, 1000000000L);
                    iO = (int) AbstractC1726.O(this.b, 1000000000L);
                    if (jN <= -31557014167219200L) {
                        this.c = C18285.c;
                    } else if (jN >= 31556889864403199L) {
                        this.c = C18285.d;
                    } else {
                        this.c = C18285.ofEpochSecond(jN, iO);
                    }
                    break;
                default:
                    throw new AssertionError("Unit not handled");
            }
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16502) && compareTo((C16502) obj) == 0;
    }

    public final int hashCode() {
        return toInstant().hashCode();
    }

    public final long s(long j) {
        TimeUnit timeUnit = this.a;
        if (timeUnit != null) {
            return timeUnit.toNanos(this.b - timeUnit.convert(j, TimeUnit.DAYS));
        }
        return TimeUnit.SECONDS.toNanos(toInstant().getEpochSecond() - TimeUnit.DAYS.toSeconds(j));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C16502 c16502) {
        long days;
        long days2;
        TimeUnit timeUnit = this.a;
        if (timeUnit != null && timeUnit == c16502.a) {
            return Long.compare(this.b, c16502.b);
        }
        long epochSecond = toInstant().getEpochSecond();
        int iCompare = Long.compare(epochSecond, c16502.toInstant().getEpochSecond());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(toInstant().getNano(), c16502.toInstant().getNano());
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
        TimeUnit timeUnit3 = c16502.a;
        if (timeUnit3 != null) {
            days2 = timeUnit3.toDays(c16502.b);
        } else {
            days2 = TimeUnit.SECONDS.toDays(c16502.toInstant().getEpochSecond());
        }
        if (days == days2) {
            return Long.compare(s(days), c16502.s(days2));
        }
        return Long.compare(days, days2);
    }

    public static void l(StringBuilder sb, int i, int i2) {
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
        C1952 c1952Z;
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
                jZ = AbstractC1726.z(j, 315569520000L) + 1;
                c1952Z = C1952.Z(AbstractC1726.O(j, 315569520000L) - 62167219200L, nano, C2678.f);
            } else {
                long j2 = epochSecond + 62167219200L;
                jZ = j2 / 315569520000L;
                c1952Z = C1952.Z((j2 % 315569520000L) - 62167219200L, nano, C2678.f);
            }
            int i = (((int) jZ) * 10000) + c1952Z.a.a;
            if (i <= 0) {
                i--;
            }
            int i2 = c1952Z.b.d;
            StringBuilder sb = new StringBuilder(64);
            sb.append(i < 0 ? "-" : "");
            int iAbs = Math.abs(i);
            if (iAbs < 10000) {
                l(sb, 1000, Math.abs(iAbs));
            } else {
                sb.append(String.valueOf(iAbs));
            }
            sb.append('-');
            l(sb, 10, c1952Z.a.b);
            sb.append('-');
            l(sb, 10, c1952Z.a.c);
            sb.append('T');
            l(sb, 10, c1952Z.b.a);
            sb.append(':');
            l(sb, 10, c1952Z.b.b);
            sb.append(':');
            l(sb, 10, c1952Z.b.c);
            if (i2 != 0) {
                sb.append('.');
                int i3 = 100000000;
                while (i2 % 10 == 0) {
                    i2 /= 10;
                    i3 /= 10;
                }
                l(sb, i3, i2);
            }
            sb.append('Z');
            this.d = sb.toString();
        }
        return this.d;
    }
}
