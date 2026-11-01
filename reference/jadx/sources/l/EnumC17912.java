package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ᩳ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC17912 implements InterfaceC0978 {
    public static final EnumC17912 APPEND;
    public static final EnumC17912 CREATE;
    public static final EnumC17912 CREATE_NEW;
    public static final EnumC17912 DELETE_ON_CLOSE;
    public static final EnumC17912 DSYNC;
    public static final EnumC17912 READ;
    public static final EnumC17912 SPARSE;
    public static final EnumC17912 SYNC;
    public static final EnumC17912 TRUNCATE_EXISTING;
    public static final EnumC17912 WRITE;
    public static final /* synthetic */ EnumC17912[] a;

    public static EnumC17912 valueOf(String str) {
        return (EnumC17912) Enum.valueOf(EnumC17912.class, str);
    }

    public static EnumC17912[] values() {
        return (EnumC17912[]) a.clone();
    }

    static {
        EnumC17912 enumC17912 = new EnumC17912("READ", 0);
        READ = enumC17912;
        EnumC17912 enumC17913 = new EnumC17912("WRITE", 1);
        WRITE = enumC17913;
        EnumC17912 enumC17914 = new EnumC17912("APPEND", 2);
        APPEND = enumC17914;
        EnumC17912 enumC17915 = new EnumC17912("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = enumC17915;
        EnumC17912 enumC17916 = new EnumC17912("CREATE", 4);
        CREATE = enumC17916;
        EnumC17912 enumC17917 = new EnumC17912("CREATE_NEW", 5);
        CREATE_NEW = enumC17917;
        EnumC17912 enumC17918 = new EnumC17912("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = enumC17918;
        EnumC17912 enumC17919 = new EnumC17912("SPARSE", 7);
        SPARSE = enumC17919;
        EnumC17912 enumC179110 = new EnumC17912("SYNC", 8);
        SYNC = enumC179110;
        EnumC17912 enumC179111 = new EnumC17912("DSYNC", 9);
        DSYNC = enumC179111;
        a = new EnumC17912[]{enumC17912, enumC17913, enumC17914, enumC17915, enumC17916, enumC17917, enumC17918, enumC17919, enumC179110, enumC179111};
    }
}
