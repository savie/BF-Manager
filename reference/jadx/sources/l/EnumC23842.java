package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩹᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3M1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC23842 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC23842 f77212;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC23842 f77214;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC23842 f77215;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC23842 f77216;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC23842 f77211 = new C11907("EXPLICIT", 0);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC23842[] f77213 = m53191();

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo29788();

    public static EnumC23842 valueOf(String str) {
        return (EnumC23842) Enum.valueOf(EnumC23842.class, str);
    }

    public static EnumC23842[] values() {
        return (EnumC23842[]) f77213.clone();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC23842[] m53191() {
        return new EnumC23842[]{f77211, f77212, f77216, f77214, f77215};
    }

    public EnumC23842(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC23842(String str, int i, C11907 c11907) {
        this(str, i);
    }

    static {
        final String str = "REPLACED";
        final int i = 1;
        f77212 = new EnumC23842(str, i) { // from class: l.᩻᩸ܽ
            @Override // l.EnumC23842
            /* JADX INFO: renamed from: ۙ */
            public boolean mo29788() {
                return false;
            }

            {
                C11907 c11907 = null;
            }
        };
        final String str2 = "COLLECTED";
        final int i2 = 2;
        f77216 = new EnumC23842(str2, i2) { // from class: l.ܺ᩸ܽ
            @Override // l.EnumC23842
            /* JADX INFO: renamed from: ۙ */
            public boolean mo29788() {
                return true;
            }

            {
                C11907 c11907 = null;
            }
        };
        final String str3 = "EXPIRED";
        final int i3 = 3;
        f77214 = new EnumC23842(str3, i3) { // from class: l.ܽ᩸ܽ
            @Override // l.EnumC23842
            /* JADX INFO: renamed from: ۙ */
            public boolean mo29788() {
                return true;
            }

            {
                C11907 c11907 = null;
            }
        };
        final String str4 = "SIZE";
        final int i4 = 4;
        f77215 = new EnumC23842(str4, i4) { // from class: l.ܶ᩸ܽ
            @Override // l.EnumC23842
            /* JADX INFO: renamed from: ۙ */
            public boolean mo29788() {
                return true;
            }

            {
                C11907 c11907 = null;
            }
        };
    }
}
