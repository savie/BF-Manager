package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۟ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7598 implements InterfaceC22415 {
    public static final EnumC7598 INSENSITIVE;
    public static final EnumC7598 LENIENT;
    public static final EnumC7598 SENSITIVE;
    public static final EnumC7598 STRICT;
    public static final /* synthetic */ EnumC7598[] a;

    @Override // l.InterfaceC22415
    public final boolean l(C11126 c11126, StringBuilder sb) {
        return true;
    }

    public static EnumC7598 valueOf(String str) {
        return (EnumC7598) Enum.valueOf(EnumC7598.class, str);
    }

    public static EnumC7598[] values() {
        return (EnumC7598[]) a.clone();
    }

    static {
        EnumC7598 enumC7598 = new EnumC7598("SENSITIVE", 0);
        SENSITIVE = enumC7598;
        EnumC7598 enumC7599 = new EnumC7598("INSENSITIVE", 1);
        INSENSITIVE = enumC7599;
        EnumC7598 enumC75910 = new EnumC7598("STRICT", 2);
        STRICT = enumC75910;
        EnumC7598 enumC75911 = new EnumC7598("LENIENT", 3);
        LENIENT = enumC75911;
        a = new EnumC7598[]{enumC7598, enumC7599, enumC75910, enumC75911};
    }

    @Override // l.InterfaceC22415
    public final int m(C12537 c12537, CharSequence charSequence, int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            c12537.b = true;
            return i;
        }
        if (iOrdinal == 1) {
            c12537.b = false;
            return i;
        }
        if (iOrdinal == 2) {
            c12537.c = true;
            return i;
        }
        if (iOrdinal != 3) {
            return i;
        }
        c12537.c = false;
        return i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
