package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۬᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC14154 {
    public static final EnumC14154 DOUBLE_VALUE;
    public static final EnumC14154 INT_VALUE;
    public static final EnumC14154 LONG_VALUE;
    public static final EnumC14154 REFERENCE;
    public static final /* synthetic */ EnumC14154[] a;

    public static EnumC14154 valueOf(String str) {
        return (EnumC14154) Enum.valueOf(EnumC14154.class, str);
    }

    public static EnumC14154[] values() {
        return (EnumC14154[]) a.clone();
    }

    static {
        EnumC14154 enumC14154 = new EnumC14154("REFERENCE", 0);
        REFERENCE = enumC14154;
        EnumC14154 enumC14155 = new EnumC14154("INT_VALUE", 1);
        INT_VALUE = enumC14155;
        EnumC14154 enumC14156 = new EnumC14154("LONG_VALUE", 2);
        LONG_VALUE = enumC14156;
        EnumC14154 enumC14157 = new EnumC14154("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC14157;
        a = new EnumC14154[]{enumC14154, enumC14155, enumC14156, enumC14157};
    }
}
