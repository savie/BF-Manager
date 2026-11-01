package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ᩳܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC18160 {
    public static final EnumC18160 END_DIRECTORY;
    public static final EnumC18160 ENTRY;
    public static final EnumC18160 START_DIRECTORY;
    public static final /* synthetic */ EnumC18160[] a;

    public static EnumC18160 valueOf(String str) {
        return (EnumC18160) Enum.valueOf(EnumC18160.class, str);
    }

    public static EnumC18160[] values() {
        return (EnumC18160[]) a.clone();
    }

    static {
        EnumC18160 enumC18160 = new EnumC18160("START_DIRECTORY", 0);
        START_DIRECTORY = enumC18160;
        EnumC18160 enumC18161 = new EnumC18160("END_DIRECTORY", 1);
        END_DIRECTORY = enumC18161;
        EnumC18160 enumC18162 = new EnumC18160("ENTRY", 2);
        ENTRY = enumC18162;
        a = new EnumC18160[]{enumC18160, enumC18161, enumC18162};
    }
}
