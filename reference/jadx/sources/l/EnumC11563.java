package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۨ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC11563 {
    public static final EnumC11563 CONTINUE;
    public static final EnumC11563 SKIP_SIBLINGS;
    public static final EnumC11563 SKIP_SUBTREE;
    public static final EnumC11563 TERMINATE;
    public static final /* synthetic */ EnumC11563[] a;

    public static EnumC11563 valueOf(String str) {
        return (EnumC11563) Enum.valueOf(EnumC11563.class, str);
    }

    public static EnumC11563[] values() {
        return (EnumC11563[]) a.clone();
    }

    static {
        EnumC11563 enumC11563 = new EnumC11563("CONTINUE", 0);
        CONTINUE = enumC11563;
        EnumC11563 enumC11564 = new EnumC11563("TERMINATE", 1);
        TERMINATE = enumC11564;
        EnumC11563 enumC11565 = new EnumC11563("SKIP_SUBTREE", 2);
        SKIP_SUBTREE = enumC11565;
        EnumC11563 enumC11566 = new EnumC11563("SKIP_SIBLINGS", 3);
        SKIP_SIBLINGS = enumC11566;
        a = new EnumC11563[]{enumC11563, enumC11564, enumC11565, enumC11566};
    }
}
