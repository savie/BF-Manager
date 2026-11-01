package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܰ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC13824 implements InterfaceC21584, InterfaceC12413 {
    public static final EnumC13824 APRIL;
    public static final EnumC13824 AUGUST;
    public static final EnumC13824 DECEMBER;
    public static final EnumC13824 FEBRUARY;
    public static final EnumC13824 JANUARY;
    public static final EnumC13824 JULY;
    public static final EnumC13824 JUNE;
    public static final EnumC13824 MARCH;
    public static final EnumC13824 MAY;
    public static final EnumC13824 NOVEMBER;
    public static final EnumC13824 OCTOBER;
    public static final EnumC13824 SEPTEMBER;
    public static final EnumC13824[] a;
    public static final /* synthetic */ EnumC13824[] b;

    public static EnumC13824 valueOf(String str) {
        return (EnumC13824) Enum.valueOf(EnumC13824.class, str);
    }

    public static EnumC13824[] values() {
        return (EnumC13824[]) b.clone();
    }

    static {
        EnumC13824 enumC13824 = new EnumC13824("JANUARY", 0);
        JANUARY = enumC13824;
        EnumC13824 enumC13825 = new EnumC13824("FEBRUARY", 1);
        FEBRUARY = enumC13825;
        EnumC13824 enumC13826 = new EnumC13824("MARCH", 2);
        MARCH = enumC13826;
        EnumC13824 enumC13827 = new EnumC13824("APRIL", 3);
        APRIL = enumC13827;
        EnumC13824 enumC13828 = new EnumC13824("MAY", 4);
        MAY = enumC13828;
        EnumC13824 enumC13829 = new EnumC13824("JUNE", 5);
        JUNE = enumC13829;
        EnumC13824 enumC138210 = new EnumC13824("JULY", 6);
        JULY = enumC138210;
        EnumC13824 enumC138211 = new EnumC13824("AUGUST", 7);
        AUGUST = enumC138211;
        EnumC13824 enumC138212 = new EnumC13824("SEPTEMBER", 8);
        SEPTEMBER = enumC138212;
        EnumC13824 enumC138213 = new EnumC13824("OCTOBER", 9);
        OCTOBER = enumC138213;
        EnumC13824 enumC138214 = new EnumC13824("NOVEMBER", 10);
        NOVEMBER = enumC138214;
        EnumC13824 enumC138215 = new EnumC13824("DECEMBER", 11);
        DECEMBER = enumC138215;
        b = new EnumC13824[]{enumC13824, enumC13825, enumC13826, enumC13827, enumC13828, enumC13829, enumC138210, enumC138211, enumC138212, enumC138213, enumC138214, enumC138215};
        a = values();
    }

    public static EnumC13824 Y(int i) {
        if (i < 1 || i > 12) {
            throw new C15464("Invalid value for MonthOfYear: " + i);
        }
        return a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return interfaceC11002 == EnumC18762.MONTH_OF_YEAR;
        }
        return interfaceC11002 != null && interfaceC11002.l(this);
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 == EnumC18762.MONTH_OF_YEAR) {
            return interfaceC11002.s();
        }
        return AbstractC23702.d(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final int l(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 == EnumC18762.MONTH_OF_YEAR) {
            return getValue();
        }
        return AbstractC23702.a(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 == EnumC18762.MONTH_OF_YEAR) {
            return getValue();
        }
        if (interfaceC11002 instanceof EnumC18762) {
            throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
        return interfaceC11002.C(this);
    }

    public final int W(boolean z) {
        int i = AbstractC4650.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return z ? 29 : 28;
    }

    public final int X() {
        int i = AbstractC4650.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int V(boolean z) {
        switch (AbstractC4650.a[ordinal()]) {
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

    @Override // l.InterfaceC21584
    public final Object T(C22935 c22935) {
        if (c22935 == AbstractC23702.b) {
            return C7122.c;
        }
        if (c22935 == AbstractC23702.c) {
            return EnumC22996.MONTHS;
        }
        return AbstractC23702.c(this, c22935);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        if (!AbstractC14884.r(interfaceC15235).equals(C7122.c)) {
            throw new C15464("Adjustment only supported on ISO date-time");
        }
        return interfaceC15235.c(getValue(), EnumC18762.MONTH_OF_YEAR);
    }
}
