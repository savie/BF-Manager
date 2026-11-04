package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ᩴܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC19880 implements InterfaceC0621 {
    public static final EnumC19880 INSENSITIVE;
    public static final EnumC19880 LENIENT;
    public static final EnumC19880 SENSITIVE;
    public static final EnumC19880 STRICT;
    public static final /* synthetic */ EnumC19880[] a;

    @Override // l.InterfaceC0621
    public final boolean i(C16150 c16150, StringBuilder sb) {
        return true;
    }

    public static EnumC19880 valueOf(String str) {
        return (EnumC19880) Enum.valueOf(EnumC19880.class, str);
    }

    public static EnumC19880[] values() {
        return (EnumC19880[]) a.clone();
    }

    static {
        EnumC19880 enumC19880 = new EnumC19880("SENSITIVE", 0);
        SENSITIVE = enumC19880;
        EnumC19880 enumC19881 = new EnumC19880("INSENSITIVE", 1);
        INSENSITIVE = enumC19881;
        EnumC19880 enumC19882 = new EnumC19880("STRICT", 2);
        STRICT = enumC19882;
        EnumC19880 enumC19883 = new EnumC19880("LENIENT", 3);
        LENIENT = enumC19883;
        a = new EnumC19880[]{enumC19880, enumC19881, enumC19882, enumC19883};
    }

    @Override // l.InterfaceC0621
    public final int j(C25102 c25102, CharSequence charSequence, int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            c25102.b = true;
            return i;
        }
        if (iOrdinal == 1) {
            c25102.b = false;
            return i;
        }
        if (iOrdinal == 2) {
            c25102.c = true;
            return i;
        }
        if (iOrdinal != 3) {
            return i;
        }
        c25102.c = false;
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
