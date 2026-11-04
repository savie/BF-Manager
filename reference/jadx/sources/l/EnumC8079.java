package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۟ᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8079 {
    public static final EnumC8079 ALWAYS;
    public static final EnumC8079 EXCEEDS_PAD;
    public static final EnumC8079 NEVER;
    public static final EnumC8079 NORMAL;
    public static final EnumC8079 NOT_NEGATIVE;
    public static final /* synthetic */ EnumC8079[] a;

    public static EnumC8079 valueOf(String str) {
        return (EnumC8079) Enum.valueOf(EnumC8079.class, str);
    }

    public static EnumC8079[] values() {
        return (EnumC8079[]) a.clone();
    }

    static {
        EnumC8079 enumC8079 = new EnumC8079("NORMAL", 0);
        NORMAL = enumC8079;
        EnumC8079 enumC80710 = new EnumC8079("ALWAYS", 1);
        ALWAYS = enumC80710;
        EnumC8079 enumC80711 = new EnumC8079("NEVER", 2);
        NEVER = enumC80711;
        EnumC8079 enumC80712 = new EnumC8079("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = enumC80712;
        EnumC8079 enumC80713 = new EnumC8079("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = enumC80713;
        a = new EnumC8079[]{enumC8079, enumC80710, enumC80711, enumC80712, enumC80713};
    }
}
