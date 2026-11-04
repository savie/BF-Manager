package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩷ۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3858 */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC22043 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC22043 f71087;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC22043 f71088 = new C14078("DEFAULT", 0);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC22043[] f71086 = m49831();

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC0655 mo15007(Long l2);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC17567 mo15008();

    public EnumC22043(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC22043(String str, int i, C14078 c14078) {
        this(str, i);
    }

    public static EnumC22043 valueOf(String str) {
        return (EnumC22043) Enum.valueOf(EnumC22043.class, str);
    }

    public static EnumC22043[] values() {
        return (EnumC22043[]) f71086.clone();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC22043[] m49831() {
        return new EnumC22043[]{f71088, f71087};
    }

    static {
        final String str = "STRING";
        final int i = 1;
        f71087 = new EnumC22043(str, i) { // from class: l.ۙۨܽ
            {
                C14078 c14078 = null;
            }

            @Override // l.EnumC22043
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public AbstractC0655 mo15007(Long l2) {
                if (l2 == null) {
                    return C19300.f62377;
                }
                return new C2892(l2.toString());
            }

            @Override // l.EnumC22043
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public AbstractC17567 mo15008() {
                return C22854.f74261;
            }
        };
    }
}
