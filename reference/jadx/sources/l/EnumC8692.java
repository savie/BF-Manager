package l;

import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NANO_OF_SECOND' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.۠ܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC8692 implements InterfaceC16831 {
    public static final EnumC8692 ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final EnumC8692 ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final EnumC8692 ALIGNED_WEEK_OF_MONTH;
    public static final EnumC8692 ALIGNED_WEEK_OF_YEAR;
    public static final EnumC8692 AMPM_OF_DAY;
    public static final EnumC8692 CLOCK_HOUR_OF_AMPM;
    public static final EnumC8692 CLOCK_HOUR_OF_DAY;
    public static final EnumC8692 DAY_OF_MONTH;
    public static final EnumC8692 DAY_OF_WEEK;
    public static final EnumC8692 DAY_OF_YEAR;
    public static final EnumC8692 EPOCH_DAY;
    public static final EnumC8692 ERA;
    public static final EnumC8692 HOUR_OF_AMPM;
    public static final EnumC8692 HOUR_OF_DAY;
    public static final EnumC8692 INSTANT_SECONDS;
    public static final EnumC8692 MICRO_OF_DAY;
    public static final EnumC8692 MICRO_OF_SECOND;
    public static final EnumC8692 MILLI_OF_DAY;
    public static final EnumC8692 MILLI_OF_SECOND;
    public static final EnumC8692 MINUTE_OF_DAY;
    public static final EnumC8692 MINUTE_OF_HOUR;
    public static final EnumC8692 MONTH_OF_YEAR;
    public static final EnumC8692 NANO_OF_DAY;
    public static final EnumC8692 NANO_OF_SECOND;
    public static final EnumC8692 OFFSET_SECONDS;
    public static final EnumC8692 PROLEPTIC_MONTH;
    public static final EnumC8692 SECOND_OF_DAY;
    public static final EnumC8692 SECOND_OF_MINUTE;
    public static final EnumC8692 YEAR;
    public static final EnumC8692 YEAR_OF_ERA;
    public static final /* synthetic */ EnumC8692[] c;
    public final String a;
    public final C23545 b;

    @Override // l.InterfaceC16831
    public final /* synthetic */ InterfaceC9437 k(Map map, C14790 c14790, EnumC18520 enumC18520) {
        return null;
    }

    public static EnumC8692 valueOf(String str) {
        return (EnumC8692) Enum.valueOf(EnumC8692.class, str);
    }

    public static EnumC8692[] values() {
        return (EnumC8692[]) c.clone();
    }

    static {
        EnumC10183 enumC10183 = EnumC10183.NANOS;
        EnumC10183 enumC10184 = EnumC10183.SECONDS;
        EnumC8692 enumC8692 = new EnumC8692("NANO_OF_SECOND", 0, "NanoOfSecond", enumC10183, enumC10184, C23545.f(0L, 999999999L));
        NANO_OF_SECOND = enumC8692;
        EnumC10183 enumC10185 = EnumC10183.DAYS;
        EnumC8692 enumC8693 = new EnumC8692("NANO_OF_DAY", 1, "NanoOfDay", enumC10183, enumC10185, C23545.f(0L, 86399999999999L));
        NANO_OF_DAY = enumC8693;
        EnumC10183 enumC10186 = EnumC10183.MICROS;
        EnumC8692 enumC8694 = new EnumC8692("MICRO_OF_SECOND", 2, "MicroOfSecond", enumC10186, enumC10184, C23545.f(0L, 999999L));
        MICRO_OF_SECOND = enumC8694;
        EnumC8692 enumC8695 = new EnumC8692("MICRO_OF_DAY", 3, "MicroOfDay", enumC10186, enumC10185, C23545.f(0L, 86399999999L));
        MICRO_OF_DAY = enumC8695;
        EnumC10183 enumC10187 = EnumC10183.MILLIS;
        EnumC8692 enumC8696 = new EnumC8692("MILLI_OF_SECOND", 4, "MilliOfSecond", enumC10187, enumC10184, C23545.f(0L, 999L));
        MILLI_OF_SECOND = enumC8696;
        EnumC8692 enumC8697 = new EnumC8692("MILLI_OF_DAY", 5, "MilliOfDay", enumC10187, enumC10185, C23545.f(0L, 86399999L));
        MILLI_OF_DAY = enumC8697;
        EnumC10183 enumC10188 = EnumC10183.MINUTES;
        EnumC8692 enumC8698 = new EnumC8692("SECOND_OF_MINUTE", 6, "SecondOfMinute", enumC10184, enumC10188, C23545.f(0L, 59L), 0);
        SECOND_OF_MINUTE = enumC8698;
        EnumC8692 enumC8699 = new EnumC8692("SECOND_OF_DAY", 7, "SecondOfDay", enumC10184, enumC10185, C23545.f(0L, 86399L));
        SECOND_OF_DAY = enumC8699;
        EnumC10183 enumC10189 = EnumC10183.HOURS;
        EnumC8692 enumC86910 = new EnumC8692("MINUTE_OF_HOUR", 8, "MinuteOfHour", enumC10188, enumC10189, C23545.f(0L, 59L), 0);
        MINUTE_OF_HOUR = enumC86910;
        EnumC8692 enumC86911 = new EnumC8692("MINUTE_OF_DAY", 9, "MinuteOfDay", enumC10188, enumC10185, C23545.f(0L, 1439L));
        MINUTE_OF_DAY = enumC86911;
        EnumC10183 enumC101810 = EnumC10183.HALF_DAYS;
        EnumC8692 enumC86912 = new EnumC8692("HOUR_OF_AMPM", 10, "HourOfAmPm", enumC10189, enumC101810, C23545.f(0L, 11L));
        HOUR_OF_AMPM = enumC86912;
        EnumC8692 enumC86913 = new EnumC8692("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", enumC10189, enumC101810, C23545.f(1L, 12L));
        CLOCK_HOUR_OF_AMPM = enumC86913;
        EnumC8692 enumC86914 = new EnumC8692("HOUR_OF_DAY", 12, "HourOfDay", enumC10189, enumC10185, C23545.f(0L, 23L), 0);
        HOUR_OF_DAY = enumC86914;
        EnumC8692 enumC86915 = new EnumC8692("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", enumC10189, enumC10185, C23545.f(1L, 24L));
        CLOCK_HOUR_OF_DAY = enumC86915;
        EnumC8692 enumC86916 = new EnumC8692("AMPM_OF_DAY", 14, "AmPmOfDay", enumC101810, enumC10185, C23545.f(0L, 1L), 0);
        AMPM_OF_DAY = enumC86916;
        EnumC10183 enumC101811 = EnumC10183.WEEKS;
        EnumC8692 enumC86917 = new EnumC8692("DAY_OF_WEEK", 15, "DayOfWeek", enumC10185, enumC101811, C23545.f(1L, 7L), 0);
        DAY_OF_WEEK = enumC86917;
        EnumC8692 enumC86918 = new EnumC8692("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", enumC10185, enumC101811, C23545.f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = enumC86918;
        EnumC8692 enumC86919 = new EnumC8692("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", enumC10185, enumC101811, C23545.f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = enumC86919;
        EnumC10183 enumC101812 = EnumC10183.MONTHS;
        EnumC8692 enumC86920 = new EnumC8692("DAY_OF_MONTH", 18, "DayOfMonth", enumC10185, enumC101812, C23545.g(1L, 28L, 31L), 0);
        DAY_OF_MONTH = enumC86920;
        EnumC10183 enumC101813 = EnumC10183.YEARS;
        EnumC8692 enumC86921 = new EnumC8692("DAY_OF_YEAR", 19, "DayOfYear", enumC10185, enumC101813, C23545.g(1L, 365L, 366L));
        DAY_OF_YEAR = enumC86921;
        EnumC10183 enumC101814 = EnumC10183.FOREVER;
        EnumC8692 enumC86922 = new EnumC8692("EPOCH_DAY", 20, "EpochDay", enumC10185, enumC101814, C23545.f(-365243219162L, 365241780471L));
        EPOCH_DAY = enumC86922;
        EnumC8692 enumC86923 = new EnumC8692("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", enumC101811, enumC101812, C23545.g(1L, 4L, 5L));
        ALIGNED_WEEK_OF_MONTH = enumC86923;
        EnumC8692 enumC86924 = new EnumC8692("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", enumC101811, enumC101813, C23545.f(1L, 53L));
        ALIGNED_WEEK_OF_YEAR = enumC86924;
        EnumC8692 enumC86925 = new EnumC8692("MONTH_OF_YEAR", 23, "MonthOfYear", enumC101812, enumC101813, C23545.f(1L, 12L), 0);
        MONTH_OF_YEAR = enumC86925;
        EnumC8692 enumC86926 = new EnumC8692("PROLEPTIC_MONTH", 24, "ProlepticMonth", enumC101812, enumC101814, C23545.f(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = enumC86926;
        EnumC8692 enumC86927 = new EnumC8692("YEAR_OF_ERA", 25, "YearOfEra", enumC101813, enumC101814, C23545.g(1L, 999999999L, 1000000000L));
        YEAR_OF_ERA = enumC86927;
        EnumC8692 enumC86928 = new EnumC8692("YEAR", 26, "Year", enumC101813, enumC101814, C23545.f(-999999999L, 999999999L), 0);
        YEAR = enumC86928;
        EnumC8692 enumC86929 = new EnumC8692("ERA", 27, "Era", EnumC10183.ERAS, enumC101814, C23545.f(0L, 1L), 0);
        ERA = enumC86929;
        EnumC8692 enumC86930 = new EnumC8692("INSTANT_SECONDS", 28, "InstantSeconds", enumC10184, enumC101814, C23545.f(Long.MIN_VALUE, C25227.FOREVER_NS));
        INSTANT_SECONDS = enumC86930;
        EnumC8692 enumC86931 = new EnumC8692("OFFSET_SECONDS", 29, "OffsetSeconds", enumC10184, enumC101814, C23545.f(-64800L, 64800L));
        OFFSET_SECONDS = enumC86931;
        c = new EnumC8692[]{enumC8692, enumC8693, enumC8694, enumC8695, enumC8696, enumC8697, enumC8698, enumC8699, enumC86910, enumC86911, enumC86912, enumC86913, enumC86914, enumC86915, enumC86916, enumC86917, enumC86918, enumC86919, enumC86920, enumC86921, enumC86922, enumC86923, enumC86924, enumC86925, enumC86926, enumC86927, enumC86928, enumC86929, enumC86930, enumC86931};
    }

    public EnumC8692(String str, int i, String str2, EnumC10183 enumC10183, EnumC10183 enumC10184, C23545 c23545) {
        super(str, i);
        this.a = str2;
        this.b = c23545;
    }

    public EnumC8692(String str, int i, String str2, EnumC10183 enumC10183, EnumC10183 enumC10184, C23545 c23545, int i2) {
        super(str, i);
        this.a = str2;
        this.b = c23545;
    }

    public final void P(long j) {
        this.b.b(j, this);
    }

    @Override // l.InterfaceC16831
    public final C23545 p() {
        return this.b;
    }

    @Override // l.InterfaceC16831
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean R() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // l.InterfaceC16831
    public final boolean i(InterfaceC9437 interfaceC9437) {
        return interfaceC9437.d(this);
    }

    @Override // l.InterfaceC16831
    public final C23545 j(InterfaceC9437 interfaceC9437) {
        return interfaceC9437.k(this);
    }

    @Override // l.InterfaceC16831
    public final long z(InterfaceC9437 interfaceC9437) {
        return interfaceC9437.C(this);
    }

    @Override // l.InterfaceC16831
    public final InterfaceC1235 C(InterfaceC1235 interfaceC1235, long j) {
        return interfaceC1235.b(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
