package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܿ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC17207 {
    public static final EnumC17207 GROUP_EXECUTE;
    public static final EnumC17207 GROUP_READ;
    public static final EnumC17207 GROUP_WRITE;
    public static final EnumC17207 OTHERS_EXECUTE;
    public static final EnumC17207 OTHERS_READ;
    public static final EnumC17207 OTHERS_WRITE;
    public static final EnumC17207 OWNER_EXECUTE;
    public static final EnumC17207 OWNER_READ;
    public static final EnumC17207 OWNER_WRITE;
    public static final /* synthetic */ EnumC17207[] a;

    public static EnumC17207 valueOf(String str) {
        return (EnumC17207) Enum.valueOf(EnumC17207.class, str);
    }

    public static EnumC17207[] values() {
        return (EnumC17207[]) a.clone();
    }

    static {
        EnumC17207 enumC17207 = new EnumC17207("OWNER_READ", 0);
        OWNER_READ = enumC17207;
        EnumC17207 enumC17208 = new EnumC17207("OWNER_WRITE", 1);
        OWNER_WRITE = enumC17208;
        EnumC17207 enumC17209 = new EnumC17207("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = enumC17209;
        EnumC17207 enumC172010 = new EnumC17207("GROUP_READ", 3);
        GROUP_READ = enumC172010;
        EnumC17207 enumC172011 = new EnumC17207("GROUP_WRITE", 4);
        GROUP_WRITE = enumC172011;
        EnumC17207 enumC172012 = new EnumC17207("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = enumC172012;
        EnumC17207 enumC172013 = new EnumC17207("OTHERS_READ", 6);
        OTHERS_READ = enumC172013;
        EnumC17207 enumC172014 = new EnumC17207("OTHERS_WRITE", 7);
        OTHERS_WRITE = enumC172014;
        EnumC17207 enumC172015 = new EnumC17207("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = enumC172015;
        a = new EnumC17207[]{enumC17207, enumC17208, enumC17209, enumC172010, enumC172011, enumC172012, enumC172013, enumC172014, enumC172015};
    }
}
