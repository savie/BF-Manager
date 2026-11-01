package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩶ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC19905 {
    public static final EnumC19905 OP;
    public static final EnumC19905 SPLITERATOR;
    public static final EnumC19905 STREAM;
    public static final EnumC19905 TERMINAL_OP;
    public static final EnumC19905 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ EnumC19905[] a;

    public static EnumC19905 valueOf(String str) {
        return (EnumC19905) Enum.valueOf(EnumC19905.class, str);
    }

    public static EnumC19905[] values() {
        return (EnumC19905[]) a.clone();
    }

    static {
        EnumC19905 enumC19905 = new EnumC19905("SPLITERATOR", 0);
        SPLITERATOR = enumC19905;
        EnumC19905 enumC19906 = new EnumC19905("STREAM", 1);
        STREAM = enumC19906;
        EnumC19905 enumC19907 = new EnumC19905("OP", 2);
        OP = enumC19907;
        EnumC19905 enumC19908 = new EnumC19905("TERMINAL_OP", 3);
        TERMINAL_OP = enumC19908;
        EnumC19905 enumC19909 = new EnumC19905("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC19909;
        a = new EnumC19905[]{enumC19905, enumC19906, enumC19907, enumC19908, enumC19909};
    }
}
