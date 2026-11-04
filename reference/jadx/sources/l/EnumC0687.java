package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֡᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0687 {
    public static final EnumC0687 END_DIRECTORY;
    public static final EnumC0687 ENTRY;
    public static final EnumC0687 START_DIRECTORY;
    public static final /* synthetic */ EnumC0687[] a;

    public static EnumC0687 valueOf(String str) {
        return (EnumC0687) Enum.valueOf(EnumC0687.class, str);
    }

    public static EnumC0687[] values() {
        return (EnumC0687[]) a.clone();
    }

    static {
        EnumC0687 enumC0687 = new EnumC0687("START_DIRECTORY", 0);
        START_DIRECTORY = enumC0687;
        EnumC0687 enumC0688 = new EnumC0687("END_DIRECTORY", 1);
        END_DIRECTORY = enumC0688;
        EnumC0687 enumC0689 = new EnumC0687("ENTRY", 2);
        ENTRY = enumC0689;
        a = new EnumC0687[]{enumC0687, enumC0688, enumC0689};
    }
}
