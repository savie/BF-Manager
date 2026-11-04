package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩸ۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC22559 {
    public static final EnumC22559 GROUP_EXECUTE;
    public static final EnumC22559 GROUP_READ;
    public static final EnumC22559 GROUP_WRITE;
    public static final EnumC22559 OTHERS_EXECUTE;
    public static final EnumC22559 OTHERS_READ;
    public static final EnumC22559 OTHERS_WRITE;
    public static final EnumC22559 OWNER_EXECUTE;
    public static final EnumC22559 OWNER_READ;
    public static final EnumC22559 OWNER_WRITE;
    public static final /* synthetic */ EnumC22559[] a;

    public static EnumC22559 valueOf(String str) {
        return (EnumC22559) Enum.valueOf(EnumC22559.class, str);
    }

    public static EnumC22559[] values() {
        return (EnumC22559[]) a.clone();
    }

    static {
        EnumC22559 enumC22559 = new EnumC22559("OWNER_READ", 0);
        OWNER_READ = enumC22559;
        EnumC22559 enumC225510 = new EnumC22559("OWNER_WRITE", 1);
        OWNER_WRITE = enumC225510;
        EnumC22559 enumC225511 = new EnumC22559("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = enumC225511;
        EnumC22559 enumC225512 = new EnumC22559("GROUP_READ", 3);
        GROUP_READ = enumC225512;
        EnumC22559 enumC225513 = new EnumC22559("GROUP_WRITE", 4);
        GROUP_WRITE = enumC225513;
        EnumC22559 enumC225514 = new EnumC22559("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = enumC225514;
        EnumC22559 enumC225515 = new EnumC22559("OTHERS_READ", 6);
        OTHERS_READ = enumC225515;
        EnumC22559 enumC225516 = new EnumC22559("OTHERS_WRITE", 7);
        OTHERS_WRITE = enumC225516;
        EnumC22559 enumC225517 = new EnumC22559("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = enumC225517;
        a = new EnumC22559[]{enumC22559, enumC225510, enumC225511, enumC225512, enumC225513, enumC225514, enumC225515, enumC225516, enumC225517};
    }
}
