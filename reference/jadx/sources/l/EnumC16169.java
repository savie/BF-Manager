package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܺ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC16169 implements InterfaceC21584, InterfaceC12413 {
    public static final EnumC16169 FRIDAY;
    public static final EnumC16169 MONDAY;
    public static final EnumC16169 SATURDAY;
    public static final EnumC16169 SUNDAY;
    public static final EnumC16169 THURSDAY;
    public static final EnumC16169 TUESDAY;
    public static final EnumC16169 WEDNESDAY;
    public static final EnumC16169[] a;
    public static final /* synthetic */ EnumC16169[] b;

    public static EnumC16169 valueOf(String str) {
        return (EnumC16169) Enum.valueOf(EnumC16169.class, str);
    }

    public static EnumC16169[] values() {
        return (EnumC16169[]) b.clone();
    }

    static {
        EnumC16169 enumC16169 = new EnumC16169("MONDAY", 0);
        MONDAY = enumC16169;
        EnumC16169 enumC161610 = new EnumC16169("TUESDAY", 1);
        TUESDAY = enumC161610;
        EnumC16169 enumC161611 = new EnumC16169("WEDNESDAY", 2);
        WEDNESDAY = enumC161611;
        EnumC16169 enumC161612 = new EnumC16169("THURSDAY", 3);
        THURSDAY = enumC161612;
        EnumC16169 enumC161613 = new EnumC16169("FRIDAY", 4);
        FRIDAY = enumC161613;
        EnumC16169 enumC161614 = new EnumC16169("SATURDAY", 5);
        SATURDAY = enumC161614;
        EnumC16169 enumC161615 = new EnumC16169("SUNDAY", 6);
        SUNDAY = enumC161615;
        b = new EnumC16169[]{enumC16169, enumC161610, enumC161611, enumC161612, enumC161613, enumC161614, enumC161615};
        a = values();
    }

    public static EnumC16169 V(int i) {
        if (i < 1 || i > 7) {
            throw new C15464("Invalid value for DayOfWeek: " + i);
        }
        return a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return interfaceC11002 == EnumC18762.DAY_OF_WEEK;
        }
        return interfaceC11002 != null && interfaceC11002.l(this);
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 == EnumC18762.DAY_OF_WEEK) {
            return interfaceC11002.s();
        }
        return AbstractC23702.d(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final int l(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 == EnumC18762.DAY_OF_WEEK) {
            return getValue();
        }
        return AbstractC23702.a(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 == EnumC18762.DAY_OF_WEEK) {
            return getValue();
        }
        if (interfaceC11002 instanceof EnumC18762) {
            throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
        return interfaceC11002.C(this);
    }

    @Override // l.InterfaceC21584
    public final Object T(C22935 c22935) {
        if (c22935 == AbstractC23702.c) {
            return EnumC22996.DAYS;
        }
        return AbstractC23702.c(this, c22935);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        return interfaceC15235.c(getValue(), EnumC18762.DAY_OF_WEEK);
    }
}
