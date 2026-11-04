package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܺ᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC17138 {
    public static final EnumC17138 OP;
    public static final EnumC17138 SPLITERATOR;
    public static final EnumC17138 STREAM;
    public static final EnumC17138 TERMINAL_OP;
    public static final EnumC17138 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ EnumC17138[] a;

    public static EnumC17138 valueOf(String str) {
        return (EnumC17138) Enum.valueOf(EnumC17138.class, str);
    }

    public static EnumC17138[] values() {
        return (EnumC17138[]) a.clone();
    }

    static {
        EnumC17138 enumC17138 = new EnumC17138("SPLITERATOR", 0);
        SPLITERATOR = enumC17138;
        EnumC17138 enumC17139 = new EnumC17138("STREAM", 1);
        STREAM = enumC17139;
        EnumC17138 enumC171310 = new EnumC17138("OP", 2);
        OP = enumC171310;
        EnumC17138 enumC171311 = new EnumC17138("TERMINAL_OP", 3);
        TERMINAL_OP = enumC171311;
        EnumC17138 enumC171312 = new EnumC17138("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC171312;
        a = new EnumC17138[]{enumC17138, enumC17139, enumC171310, enumC171311, enumC171312};
    }
}
