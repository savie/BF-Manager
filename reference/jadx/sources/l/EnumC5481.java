package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۚܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5481 {
    public static final EnumC5481 LENIENT;
    public static final EnumC5481 SMART;
    public static final EnumC5481 STRICT;
    public static final /* synthetic */ EnumC5481[] a;

    public static EnumC5481 valueOf(String str) {
        return (EnumC5481) Enum.valueOf(EnumC5481.class, str);
    }

    public static EnumC5481[] values() {
        return (EnumC5481[]) a.clone();
    }

    static {
        EnumC5481 enumC5481 = new EnumC5481("STRICT", 0);
        STRICT = enumC5481;
        EnumC5481 enumC5482 = new EnumC5481("SMART", 1);
        SMART = enumC5482;
        EnumC5481 enumC5483 = new EnumC5481("LENIENT", 2);
        LENIENT = enumC5483;
        a = new EnumC5481[]{enumC5481, enumC5482, enumC5483};
    }
}
