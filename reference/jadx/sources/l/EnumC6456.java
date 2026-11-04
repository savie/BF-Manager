package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۛܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6456 implements InterfaceC9437, InterfaceC1916 {
    public static final EnumC6456 APRIL;
    public static final EnumC6456 AUGUST;
    public static final EnumC6456 DECEMBER;
    public static final EnumC6456 FEBRUARY;
    public static final EnumC6456 JANUARY;
    public static final EnumC6456 JULY;
    public static final EnumC6456 JUNE;
    public static final EnumC6456 MARCH;
    public static final EnumC6456 MAY;
    public static final EnumC6456 NOVEMBER;
    public static final EnumC6456 OCTOBER;
    public static final EnumC6456 SEPTEMBER;
    public static final EnumC6456[] a;
    public static final /* synthetic */ EnumC6456[] b;

    public static EnumC6456 valueOf(String str) {
        return (EnumC6456) Enum.valueOf(EnumC6456.class, str);
    }

    public static EnumC6456[] values() {
        return (EnumC6456[]) b.clone();
    }

    static {
        EnumC6456 enumC6456 = new EnumC6456("JANUARY", 0);
        JANUARY = enumC6456;
        EnumC6456 enumC6457 = new EnumC6456("FEBRUARY", 1);
        FEBRUARY = enumC6457;
        EnumC6456 enumC6458 = new EnumC6456("MARCH", 2);
        MARCH = enumC6458;
        EnumC6456 enumC6459 = new EnumC6456("APRIL", 3);
        APRIL = enumC6459;
        EnumC6456 enumC64510 = new EnumC6456("MAY", 4);
        MAY = enumC64510;
        EnumC6456 enumC64511 = new EnumC6456("JUNE", 5);
        JUNE = enumC64511;
        EnumC6456 enumC64512 = new EnumC6456("JULY", 6);
        JULY = enumC64512;
        EnumC6456 enumC64513 = new EnumC6456("AUGUST", 7);
        AUGUST = enumC64513;
        EnumC6456 enumC64514 = new EnumC6456("SEPTEMBER", 8);
        SEPTEMBER = enumC64514;
        EnumC6456 enumC64515 = new EnumC6456("OCTOBER", 9);
        OCTOBER = enumC64515;
        EnumC6456 enumC64516 = new EnumC6456("NOVEMBER", 10);
        NOVEMBER = enumC64516;
        EnumC6456 enumC64517 = new EnumC6456("DECEMBER", 11);
        DECEMBER = enumC64517;
        b = new EnumC6456[]{enumC6456, enumC6457, enumC6458, enumC6459, enumC64510, enumC64511, enumC64512, enumC64513, enumC64514, enumC64515, enumC64516, enumC64517};
        a = values();
    }

    public static EnumC6456 U(int i) {
        if (i < 1 || i > 12) {
            throw new C21241("Invalid value for MonthOfYear: " + i);
        }
        return a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return interfaceC16831 == EnumC8692.MONTH_OF_YEAR;
        }
        return interfaceC16831 != null && interfaceC16831.i(this);
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 == EnumC8692.MONTH_OF_YEAR) {
            return interfaceC16831.p();
        }
        return AbstractC17577.d(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final int i(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 == EnumC8692.MONTH_OF_YEAR) {
            return getValue();
        }
        return AbstractC17577.a(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 == EnumC8692.MONTH_OF_YEAR) {
            return getValue();
        }
        if (interfaceC16831 instanceof EnumC8692) {
            throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
        return interfaceC16831.z(this);
    }

    public final int S(boolean z) {
        int i = AbstractC12421.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return z ? 29 : 28;
    }

    public final int T() {
        int i = AbstractC12421.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int R(boolean z) {
        switch (AbstractC12421.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    @Override // l.InterfaceC9437
    public final Object P(C14435 c14435) {
        if (c14435 == AbstractC17577.b) {
            return C20012.c;
        }
        if (c14435 == AbstractC17577.c) {
            return EnumC10183.MONTHS;
        }
        return AbstractC17577.c(this, c14435);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        if (!AbstractC2946.r(interfaceC1235).equals(C20012.c)) {
            throw new C21241("Adjustment only supported on ISO date-time");
        }
        return interfaceC1235.b(getValue(), EnumC8692.MONTH_OF_YEAR);
    }
}
