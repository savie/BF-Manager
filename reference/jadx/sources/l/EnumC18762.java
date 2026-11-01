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
/* JADX INFO: renamed from: l.ᩴ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC18762 implements InterfaceC11002 {
    public static final EnumC18762 ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final EnumC18762 ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final EnumC18762 ALIGNED_WEEK_OF_MONTH;
    public static final EnumC18762 ALIGNED_WEEK_OF_YEAR;
    public static final EnumC18762 AMPM_OF_DAY;
    public static final EnumC18762 CLOCK_HOUR_OF_AMPM;
    public static final EnumC18762 CLOCK_HOUR_OF_DAY;
    public static final EnumC18762 DAY_OF_MONTH;
    public static final EnumC18762 DAY_OF_WEEK;
    public static final EnumC18762 DAY_OF_YEAR;
    public static final EnumC18762 EPOCH_DAY;
    public static final EnumC18762 ERA;
    public static final EnumC18762 HOUR_OF_AMPM;
    public static final EnumC18762 HOUR_OF_DAY;
    public static final EnumC18762 INSTANT_SECONDS;
    public static final EnumC18762 MICRO_OF_DAY;
    public static final EnumC18762 MICRO_OF_SECOND;
    public static final EnumC18762 MILLI_OF_DAY;
    public static final EnumC18762 MILLI_OF_SECOND;
    public static final EnumC18762 MINUTE_OF_DAY;
    public static final EnumC18762 MINUTE_OF_HOUR;
    public static final EnumC18762 MONTH_OF_YEAR;
    public static final EnumC18762 NANO_OF_DAY;
    public static final EnumC18762 NANO_OF_SECOND;
    public static final EnumC18762 OFFSET_SECONDS;
    public static final EnumC18762 PROLEPTIC_MONTH;
    public static final EnumC18762 SECOND_OF_DAY;
    public static final EnumC18762 SECOND_OF_MINUTE;
    public static final EnumC18762 YEAR;
    public static final EnumC18762 YEAR_OF_ERA;
    public static final /* synthetic */ EnumC18762[] c;
    public final String a;
    public final C1828 b;

    @Override // l.InterfaceC11002
    public final /* synthetic */ InterfaceC21584 n(Map map, C11832 c11832, EnumC5481 enumC5481) {
        return null;
    }

    public static EnumC18762 valueOf(String str) {
        return (EnumC18762) Enum.valueOf(EnumC18762.class, str);
    }

    public static EnumC18762[] values() {
        return (EnumC18762[]) c.clone();
    }

    static {
        EnumC22996 enumC22996 = EnumC22996.NANOS;
        EnumC22996 enumC22997 = EnumC22996.SECONDS;
        EnumC18762 enumC18762 = new EnumC18762("NANO_OF_SECOND", 0, "NanoOfSecond", enumC22996, enumC22997, C1828.f(0L, 999999999L));
        NANO_OF_SECOND = enumC18762;
        EnumC22996 enumC22998 = EnumC22996.DAYS;
        EnumC18762 enumC18763 = new EnumC18762("NANO_OF_DAY", 1, "NanoOfDay", enumC22996, enumC22998, C1828.f(0L, 86399999999999L));
        NANO_OF_DAY = enumC18763;
        EnumC22996 enumC22999 = EnumC22996.MICROS;
        EnumC18762 enumC18764 = new EnumC18762("MICRO_OF_SECOND", 2, "MicroOfSecond", enumC22999, enumC22997, C1828.f(0L, 999999L));
        MICRO_OF_SECOND = enumC18764;
        EnumC18762 enumC18765 = new EnumC18762("MICRO_OF_DAY", 3, "MicroOfDay", enumC22999, enumC22998, C1828.f(0L, 86399999999L));
        MICRO_OF_DAY = enumC18765;
        EnumC22996 enumC229910 = EnumC22996.MILLIS;
        EnumC18762 enumC18766 = new EnumC18762("MILLI_OF_SECOND", 4, "MilliOfSecond", enumC229910, enumC22997, C1828.f(0L, 999L));
        MILLI_OF_SECOND = enumC18766;
        EnumC18762 enumC18767 = new EnumC18762("MILLI_OF_DAY", 5, "MilliOfDay", enumC229910, enumC22998, C1828.f(0L, 86399999L));
        MILLI_OF_DAY = enumC18767;
        EnumC22996 enumC229911 = EnumC22996.MINUTES;
        EnumC18762 enumC18768 = new EnumC18762("SECOND_OF_MINUTE", 6, "SecondOfMinute", enumC22997, enumC229911, C1828.f(0L, 59L), 0);
        SECOND_OF_MINUTE = enumC18768;
        EnumC18762 enumC18769 = new EnumC18762("SECOND_OF_DAY", 7, "SecondOfDay", enumC22997, enumC22998, C1828.f(0L, 86399L));
        SECOND_OF_DAY = enumC18769;
        EnumC22996 enumC229912 = EnumC22996.HOURS;
        EnumC18762 enumC187610 = new EnumC18762("MINUTE_OF_HOUR", 8, "MinuteOfHour", enumC229911, enumC229912, C1828.f(0L, 59L), 0);
        MINUTE_OF_HOUR = enumC187610;
        EnumC18762 enumC187611 = new EnumC18762("MINUTE_OF_DAY", 9, "MinuteOfDay", enumC229911, enumC22998, C1828.f(0L, 1439L));
        MINUTE_OF_DAY = enumC187611;
        EnumC22996 enumC229913 = EnumC22996.HALF_DAYS;
        EnumC18762 enumC187612 = new EnumC18762("HOUR_OF_AMPM", 10, "HourOfAmPm", enumC229912, enumC229913, C1828.f(0L, 11L));
        HOUR_OF_AMPM = enumC187612;
        EnumC18762 enumC187613 = new EnumC18762("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", enumC229912, enumC229913, C1828.f(1L, 12L));
        CLOCK_HOUR_OF_AMPM = enumC187613;
        EnumC18762 enumC187614 = new EnumC18762("HOUR_OF_DAY", 12, "HourOfDay", enumC229912, enumC22998, C1828.f(0L, 23L), 0);
        HOUR_OF_DAY = enumC187614;
        EnumC18762 enumC187615 = new EnumC18762("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", enumC229912, enumC22998, C1828.f(1L, 24L));
        CLOCK_HOUR_OF_DAY = enumC187615;
        EnumC18762 enumC187616 = new EnumC18762("AMPM_OF_DAY", 14, "AmPmOfDay", enumC229913, enumC22998, C1828.f(0L, 1L), 0);
        AMPM_OF_DAY = enumC187616;
        EnumC22996 enumC229914 = EnumC22996.WEEKS;
        EnumC18762 enumC187617 = new EnumC18762("DAY_OF_WEEK", 15, "DayOfWeek", enumC22998, enumC229914, C1828.f(1L, 7L), 0);
        DAY_OF_WEEK = enumC187617;
        EnumC18762 enumC187618 = new EnumC18762("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", enumC22998, enumC229914, C1828.f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = enumC187618;
        EnumC18762 enumC187619 = new EnumC18762("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", enumC22998, enumC229914, C1828.f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = enumC187619;
        EnumC22996 enumC229915 = EnumC22996.MONTHS;
        EnumC18762 enumC187620 = new EnumC18762("DAY_OF_MONTH", 18, "DayOfMonth", enumC22998, enumC229915, C1828.g(1L, 28L, 31L), 0);
        DAY_OF_MONTH = enumC187620;
        EnumC22996 enumC229916 = EnumC22996.YEARS;
        EnumC18762 enumC187621 = new EnumC18762("DAY_OF_YEAR", 19, "DayOfYear", enumC22998, enumC229916, C1828.g(1L, 365L, 366L));
        DAY_OF_YEAR = enumC187621;
        EnumC22996 enumC229917 = EnumC22996.FOREVER;
        EnumC18762 enumC187622 = new EnumC18762("EPOCH_DAY", 20, "EpochDay", enumC22998, enumC229917, C1828.f(-365243219162L, 365241780471L));
        EPOCH_DAY = enumC187622;
        EnumC18762 enumC187623 = new EnumC18762("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", enumC229914, enumC229915, C1828.g(1L, 4L, 5L));
        ALIGNED_WEEK_OF_MONTH = enumC187623;
        EnumC18762 enumC187624 = new EnumC18762("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", enumC229914, enumC229916, C1828.f(1L, 53L));
        ALIGNED_WEEK_OF_YEAR = enumC187624;
        EnumC18762 enumC187625 = new EnumC18762("MONTH_OF_YEAR", 23, "MonthOfYear", enumC229915, enumC229916, C1828.f(1L, 12L), 0);
        MONTH_OF_YEAR = enumC187625;
        EnumC18762 enumC187626 = new EnumC18762("PROLEPTIC_MONTH", 24, "ProlepticMonth", enumC229915, enumC229917, C1828.f(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = enumC187626;
        EnumC18762 enumC187627 = new EnumC18762("YEAR_OF_ERA", 25, "YearOfEra", enumC229916, enumC229917, C1828.g(1L, 999999999L, 1000000000L));
        YEAR_OF_ERA = enumC187627;
        EnumC18762 enumC187628 = new EnumC18762("YEAR", 26, "Year", enumC229916, enumC229917, C1828.f(-999999999L, 999999999L), 0);
        YEAR = enumC187628;
        EnumC18762 enumC187629 = new EnumC18762("ERA", 27, "Era", EnumC22996.ERAS, enumC229917, C1828.f(0L, 1L), 0);
        ERA = enumC187629;
        EnumC18762 enumC187630 = new EnumC18762("INSTANT_SECONDS", 28, "InstantSeconds", enumC22997, enumC229917, C1828.f(Long.MIN_VALUE, C17492.FOREVER_NS));
        INSTANT_SECONDS = enumC187630;
        EnumC18762 enumC187631 = new EnumC18762("OFFSET_SECONDS", 29, "OffsetSeconds", enumC22997, enumC229917, C1828.f(-64800L, 64800L));
        OFFSET_SECONDS = enumC187631;
        c = new EnumC18762[]{enumC18762, enumC18763, enumC18764, enumC18765, enumC18766, enumC18767, enumC18768, enumC18769, enumC187610, enumC187611, enumC187612, enumC187613, enumC187614, enumC187615, enumC187616, enumC187617, enumC187618, enumC187619, enumC187620, enumC187621, enumC187622, enumC187623, enumC187624, enumC187625, enumC187626, enumC187627, enumC187628, enumC187629, enumC187630, enumC187631};
    }

    public EnumC18762(String str, int i, String str2, EnumC22996 enumC22996, EnumC22996 enumC22997, C1828 c1828) {
        super(str, i);
        this.a = str2;
        this.b = c1828;
    }

    public EnumC18762(String str, int i, String str2, EnumC22996 enumC22996, EnumC22996 enumC22997, C1828 c1828, int i2) {
        super(str, i);
        this.a = str2;
        this.b = c1828;
    }

    public final void T(long j) {
        this.b.b(j, this);
    }

    @Override // l.InterfaceC11002
    public final C1828 s() {
        return this.b;
    }

    @Override // l.InterfaceC11002
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean V() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // l.InterfaceC11002
    public final boolean l(InterfaceC21584 interfaceC21584) {
        return interfaceC21584.e(this);
    }

    @Override // l.InterfaceC11002
    public final C1828 m(InterfaceC21584 interfaceC21584) {
        return interfaceC21584.n(this);
    }

    @Override // l.InterfaceC11002
    public final long C(InterfaceC21584 interfaceC21584) {
        return interfaceC21584.G(this);
    }

    @Override // l.InterfaceC11002
    public final InterfaceC15235 G(InterfaceC15235 interfaceC15235, long j) {
        return interfaceC15235.c(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
