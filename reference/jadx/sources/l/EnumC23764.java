package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩻ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC23764 {
    public static final EnumC23764 CONCURRENT;
    public static final EnumC23764 IDENTITY_FINISH;
    public static final EnumC23764 UNORDERED;
    public static final /* synthetic */ EnumC23764[] a;

    public static EnumC23764 valueOf(String str) {
        return (EnumC23764) Enum.valueOf(EnumC23764.class, str);
    }

    public static EnumC23764[] values() {
        return (EnumC23764[]) a.clone();
    }

    static {
        EnumC23764 enumC23764 = new EnumC23764("CONCURRENT", 0);
        CONCURRENT = enumC23764;
        EnumC23764 enumC23765 = new EnumC23764("UNORDERED", 1);
        UNORDERED = enumC23765;
        EnumC23764 enumC23766 = new EnumC23764("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = enumC23766;
        a = new EnumC23764[]{enumC23764, enumC23765, enumC23766};
    }
}
