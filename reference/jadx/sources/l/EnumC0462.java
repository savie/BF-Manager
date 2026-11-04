package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֡۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0462 implements InterfaceC12394 {
    public static final EnumC0462 APPEND;
    public static final EnumC0462 CREATE;
    public static final EnumC0462 CREATE_NEW;
    public static final EnumC0462 DELETE_ON_CLOSE;
    public static final EnumC0462 DSYNC;
    public static final EnumC0462 READ;
    public static final EnumC0462 SPARSE;
    public static final EnumC0462 SYNC;
    public static final EnumC0462 TRUNCATE_EXISTING;
    public static final EnumC0462 WRITE;
    public static final /* synthetic */ EnumC0462[] a;

    public static EnumC0462 valueOf(String str) {
        return (EnumC0462) Enum.valueOf(EnumC0462.class, str);
    }

    public static EnumC0462[] values() {
        return (EnumC0462[]) a.clone();
    }

    static {
        EnumC0462 enumC0462 = new EnumC0462("READ", 0);
        READ = enumC0462;
        EnumC0462 enumC0463 = new EnumC0462("WRITE", 1);
        WRITE = enumC0463;
        EnumC0462 enumC0464 = new EnumC0462("APPEND", 2);
        APPEND = enumC0464;
        EnumC0462 enumC0465 = new EnumC0462("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = enumC0465;
        EnumC0462 enumC0466 = new EnumC0462("CREATE", 4);
        CREATE = enumC0466;
        EnumC0462 enumC0467 = new EnumC0462("CREATE_NEW", 5);
        CREATE_NEW = enumC0467;
        EnumC0462 enumC0468 = new EnumC0462("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = enumC0468;
        EnumC0462 enumC0469 = new EnumC0462("SPARSE", 7);
        SPARSE = enumC0469;
        EnumC0462 enumC04610 = new EnumC0462("SYNC", 8);
        SYNC = enumC04610;
        EnumC0462 enumC04611 = new EnumC0462("DSYNC", 9);
        DSYNC = enumC04611;
        a = new EnumC0462[]{enumC0462, enumC0463, enumC0464, enumC0465, enumC0466, enumC0467, enumC0468, enumC0469, enumC04610, enumC04611};
    }
}
