package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩺ۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC22761 {
    public static final EnumC22761 DOUBLE_VALUE;
    public static final EnumC22761 INT_VALUE;
    public static final EnumC22761 LONG_VALUE;
    public static final EnumC22761 REFERENCE;
    public static final /* synthetic */ EnumC22761[] a;

    public static EnumC22761 valueOf(String str) {
        return (EnumC22761) Enum.valueOf(EnumC22761.class, str);
    }

    public static EnumC22761[] values() {
        return (EnumC22761[]) a.clone();
    }

    static {
        EnumC22761 enumC22761 = new EnumC22761("REFERENCE", 0);
        REFERENCE = enumC22761;
        EnumC22761 enumC22762 = new EnumC22761("INT_VALUE", 1);
        INT_VALUE = enumC22762;
        EnumC22761 enumC22763 = new EnumC22761("LONG_VALUE", 2);
        LONG_VALUE = enumC22763;
        EnumC22761 enumC22764 = new EnumC22761("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC22764;
        a = new EnumC22761[]{enumC22761, enumC22762, enumC22763, enumC22764};
    }
}
