package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܳۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC14469 {
    public static final EnumC14469 EXECUTE;
    public static final EnumC14469 READ;
    public static final EnumC14469 WRITE;
    public static final /* synthetic */ EnumC14469[] a;

    public static EnumC14469 valueOf(String str) {
        return (EnumC14469) Enum.valueOf(EnumC14469.class, str);
    }

    public static EnumC14469[] values() {
        return (EnumC14469[]) a.clone();
    }

    static {
        EnumC14469 enumC14469 = new EnumC14469("READ", 0);
        READ = enumC14469;
        EnumC14469 enumC144610 = new EnumC14469("WRITE", 1);
        WRITE = enumC144610;
        EnumC14469 enumC144611 = new EnumC14469("EXECUTE", 2);
        EXECUTE = enumC144611;
        a = new EnumC14469[]{enumC14469, enumC144610, enumC144611};
    }
}
