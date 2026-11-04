package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۚ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5683 {
    public static final EnumC5683 EXECUTE;
    public static final EnumC5683 READ;
    public static final EnumC5683 WRITE;
    public static final /* synthetic */ EnumC5683[] a;

    public static EnumC5683 valueOf(String str) {
        return (EnumC5683) Enum.valueOf(EnumC5683.class, str);
    }

    public static EnumC5683[] values() {
        return (EnumC5683[]) a.clone();
    }

    static {
        EnumC5683 enumC5683 = new EnumC5683("READ", 0);
        READ = enumC5683;
        EnumC5683 enumC5684 = new EnumC5683("WRITE", 1);
        WRITE = enumC5684;
        EnumC5683 enumC5685 = new EnumC5683("EXECUTE", 2);
        EXECUTE = enumC5685;
        a = new EnumC5683[]{enumC5683, enumC5684, enumC5685};
    }
}
