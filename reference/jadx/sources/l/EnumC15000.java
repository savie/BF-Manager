package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܶۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC15000 {
    public static final EnumC15000 MAYBE_MORE;
    public static final EnumC15000 NO_MORE;
    public static final EnumC15000 UNLIMITED;
    public static final /* synthetic */ EnumC15000[] a;

    static {
        EnumC15000 enumC15000 = new EnumC15000("NO_MORE", 0);
        NO_MORE = enumC15000;
        EnumC15000 enumC15001 = new EnumC15000("MAYBE_MORE", 1);
        MAYBE_MORE = enumC15001;
        EnumC15000 enumC15002 = new EnumC15000("UNLIMITED", 2);
        UNLIMITED = enumC15002;
        a = new EnumC15000[]{enumC15000, enumC15001, enumC15002};
    }

    public static EnumC15000 valueOf(String str) {
        return (EnumC15000) Enum.valueOf(EnumC15000.class, str);
    }

    public static EnumC15000[] values() {
        return (EnumC15000[]) a.clone();
    }
}
