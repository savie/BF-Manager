package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܿ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC18361 implements InterfaceC1954 {
    public static final EnumC18361 ATOMIC_MOVE;
    public static final EnumC18361 COPY_ATTRIBUTES;
    public static final EnumC18361 REPLACE_EXISTING;
    public static final /* synthetic */ EnumC18361[] a;

    public static EnumC18361 valueOf(String str) {
        return (EnumC18361) Enum.valueOf(EnumC18361.class, str);
    }

    public static EnumC18361[] values() {
        return (EnumC18361[]) a.clone();
    }

    static {
        EnumC18361 enumC18361 = new EnumC18361("REPLACE_EXISTING", 0);
        REPLACE_EXISTING = enumC18361;
        EnumC18361 enumC18362 = new EnumC18361("COPY_ATTRIBUTES", 1);
        COPY_ATTRIBUTES = enumC18362;
        EnumC18361 enumC18363 = new EnumC18361("ATOMIC_MOVE", 2);
        ATOMIC_MOVE = enumC18363;
        a = new EnumC18361[]{enumC18361, enumC18362, enumC18363};
    }
}
