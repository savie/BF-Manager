package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۙۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC4615 {
    public static final EnumC4615 MAYBE_MORE;
    public static final EnumC4615 NO_MORE;
    public static final EnumC4615 UNLIMITED;
    public static final /* synthetic */ EnumC4615[] a;

    static {
        EnumC4615 enumC4615 = new EnumC4615("NO_MORE", 0);
        NO_MORE = enumC4615;
        EnumC4615 enumC4616 = new EnumC4615("MAYBE_MORE", 1);
        MAYBE_MORE = enumC4616;
        EnumC4615 enumC4617 = new EnumC4615("UNLIMITED", 2);
        UNLIMITED = enumC4617;
        a = new EnumC4615[]{enumC4615, enumC4616, enumC4617};
    }

    public static EnumC4615 valueOf(String str) {
        return (EnumC4615) Enum.valueOf(EnumC4615.class, str);
    }

    public static EnumC4615[] values() {
        return (EnumC4615[]) a.clone();
    }
}
