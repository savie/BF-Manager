package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֨ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1247 {
    public static final EnumC1247 ALWAYS;
    public static final EnumC1247 EXCEEDS_PAD;
    public static final EnumC1247 NEVER;
    public static final EnumC1247 NORMAL;
    public static final EnumC1247 NOT_NEGATIVE;
    public static final /* synthetic */ EnumC1247[] a;

    public static EnumC1247 valueOf(String str) {
        return (EnumC1247) Enum.valueOf(EnumC1247.class, str);
    }

    public static EnumC1247[] values() {
        return (EnumC1247[]) a.clone();
    }

    static {
        EnumC1247 enumC1247 = new EnumC1247("NORMAL", 0);
        NORMAL = enumC1247;
        EnumC1247 enumC1248 = new EnumC1247("ALWAYS", 1);
        ALWAYS = enumC1248;
        EnumC1247 enumC1249 = new EnumC1247("NEVER", 2);
        NEVER = enumC1249;
        EnumC1247 enumC12410 = new EnumC1247("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = enumC12410;
        EnumC1247 enumC12411 = new EnumC1247("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = enumC12411;
        a = new EnumC1247[]{enumC1247, enumC1248, enumC1249, enumC12410, enumC12411};
    }
}
