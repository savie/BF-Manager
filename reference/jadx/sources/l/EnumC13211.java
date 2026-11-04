package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۫ܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC13211 {
    public static final EnumC13211 CONCURRENT;
    public static final EnumC13211 IDENTITY_FINISH;
    public static final EnumC13211 UNORDERED;
    public static final /* synthetic */ EnumC13211[] a;

    public static EnumC13211 valueOf(String str) {
        return (EnumC13211) Enum.valueOf(EnumC13211.class, str);
    }

    public static EnumC13211[] values() {
        return (EnumC13211[]) a.clone();
    }

    static {
        EnumC13211 enumC13211 = new EnumC13211("CONCURRENT", 0);
        CONCURRENT = enumC13211;
        EnumC13211 enumC13212 = new EnumC13211("UNORDERED", 1);
        UNORDERED = enumC13212;
        EnumC13211 enumC13213 = new EnumC13211("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = enumC13213;
        a = new EnumC13211[]{enumC13211, enumC13212, enumC13213};
    }
}
