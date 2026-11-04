package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܿᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC18520 {
    public static final EnumC18520 LENIENT;
    public static final EnumC18520 SMART;
    public static final EnumC18520 STRICT;
    public static final /* synthetic */ EnumC18520[] a;

    public static EnumC18520 valueOf(String str) {
        return (EnumC18520) Enum.valueOf(EnumC18520.class, str);
    }

    public static EnumC18520[] values() {
        return (EnumC18520[]) a.clone();
    }

    static {
        EnumC18520 enumC18520 = new EnumC18520("STRICT", 0);
        STRICT = enumC18520;
        EnumC18520 enumC18521 = new EnumC18520("SMART", 1);
        SMART = enumC18521;
        EnumC18520 enumC18522 = new EnumC18520("LENIENT", 2);
        LENIENT = enumC18522;
        a = new EnumC18520[]{enumC18520, enumC18521, enumC18522};
    }
}
