package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܶ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC16123 {
    public static final EnumC16123 CONTINUE;
    public static final EnumC16123 SKIP_SIBLINGS;
    public static final EnumC16123 SKIP_SUBTREE;
    public static final EnumC16123 TERMINATE;
    public static final /* synthetic */ EnumC16123[] a;

    public static EnumC16123 valueOf(String str) {
        return (EnumC16123) Enum.valueOf(EnumC16123.class, str);
    }

    public static EnumC16123[] values() {
        return (EnumC16123[]) a.clone();
    }

    static {
        EnumC16123 enumC16123 = new EnumC16123("CONTINUE", 0);
        CONTINUE = enumC16123;
        EnumC16123 enumC16124 = new EnumC16123("TERMINATE", 1);
        TERMINATE = enumC16124;
        EnumC16123 enumC16125 = new EnumC16123("SKIP_SUBTREE", 2);
        SKIP_SUBTREE = enumC16125;
        EnumC16123 enumC16126 = new EnumC16123("SKIP_SIBLINGS", 3);
        SKIP_SIBLINGS = enumC16126;
        a = new EnumC16123[]{enumC16123, enumC16124, enumC16125, enumC16126};
    }
}
