package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۫᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC13387 implements InterfaceC9437, InterfaceC1916 {
    public static final EnumC13387 FRIDAY;
    public static final EnumC13387 MONDAY;
    public static final EnumC13387 SATURDAY;
    public static final EnumC13387 SUNDAY;
    public static final EnumC13387 THURSDAY;
    public static final EnumC13387 TUESDAY;
    public static final EnumC13387 WEDNESDAY;
    public static final EnumC13387[] a;
    public static final /* synthetic */ EnumC13387[] b;

    public static EnumC13387 valueOf(String str) {
        return (EnumC13387) Enum.valueOf(EnumC13387.class, str);
    }

    public static EnumC13387[] values() {
        return (EnumC13387[]) b.clone();
    }

    static {
        EnumC13387 enumC13387 = new EnumC13387("MONDAY", 0);
        MONDAY = enumC13387;
        EnumC13387 enumC13388 = new EnumC13387("TUESDAY", 1);
        TUESDAY = enumC13388;
        EnumC13387 enumC13389 = new EnumC13387("WEDNESDAY", 2);
        WEDNESDAY = enumC13389;
        EnumC13387 enumC133810 = new EnumC13387("THURSDAY", 3);
        THURSDAY = enumC133810;
        EnumC13387 enumC133811 = new EnumC13387("FRIDAY", 4);
        FRIDAY = enumC133811;
        EnumC13387 enumC133812 = new EnumC13387("SATURDAY", 5);
        SATURDAY = enumC133812;
        EnumC13387 enumC133813 = new EnumC13387("SUNDAY", 6);
        SUNDAY = enumC133813;
        b = new EnumC13387[]{enumC13387, enumC13388, enumC13389, enumC133810, enumC133811, enumC133812, enumC133813};
        a = values();
    }

    public static EnumC13387 R(int i) {
        if (i < 1 || i > 7) {
            throw new C21241("Invalid value for DayOfWeek: " + i);
        }
        return a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return interfaceC16831 == EnumC8692.DAY_OF_WEEK;
        }
        return interfaceC16831 != null && interfaceC16831.i(this);
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 == EnumC8692.DAY_OF_WEEK) {
            return interfaceC16831.p();
        }
        return AbstractC17577.d(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final int i(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 == EnumC8692.DAY_OF_WEEK) {
            return getValue();
        }
        return AbstractC17577.a(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 == EnumC8692.DAY_OF_WEEK) {
            return getValue();
        }
        if (interfaceC16831 instanceof EnumC8692) {
            throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
        return interfaceC16831.z(this);
    }

    @Override // l.InterfaceC9437
    public final Object P(C14435 c14435) {
        if (c14435 == AbstractC17577.c) {
            return EnumC10183.DAYS;
        }
        return AbstractC17577.c(this, c14435);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        return interfaceC1235.b(getValue(), EnumC8692.DAY_OF_WEEK);
    }
}
