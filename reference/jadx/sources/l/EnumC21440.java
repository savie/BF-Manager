package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩸۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC21440 implements InterfaceC1767 {
    public static final EnumC21440 ATOMIC_MOVE;
    public static final EnumC21440 COPY_ATTRIBUTES;
    public static final EnumC21440 REPLACE_EXISTING;
    public static final /* synthetic */ EnumC21440[] a;

    public static EnumC21440 valueOf(String str) {
        return (EnumC21440) Enum.valueOf(EnumC21440.class, str);
    }

    public static EnumC21440[] values() {
        return (EnumC21440[]) a.clone();
    }

    static {
        EnumC21440 enumC21440 = new EnumC21440("REPLACE_EXISTING", 0);
        REPLACE_EXISTING = enumC21440;
        EnumC21440 enumC21441 = new EnumC21440("COPY_ATTRIBUTES", 1);
        COPY_ATTRIBUTES = enumC21441;
        EnumC21440 enumC21442 = new EnumC21440("ATOMIC_MOVE", 2);
        ATOMIC_MOVE = enumC21442;
        a = new EnumC21440[]{enumC21440, enumC21441, enumC21442};
    }
}
