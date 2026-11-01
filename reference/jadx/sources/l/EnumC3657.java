package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۘۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3858 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC3657 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC3657 f13395;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC3657 f13397 = new C0835("DEFAULT", 0);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC3657[] f13396 = m10771();

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC1810 mo3440(Long l2);

    public EnumC3657(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC3657(String str, int i, C0835 c0835) {
        this(str, i);
    }

    public static EnumC3657 valueOf(String str) {
        return (EnumC3657) Enum.valueOf(EnumC3657.class, str);
    }

    public static EnumC3657[] values() {
        return (EnumC3657[]) f13396.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC3657[] m10771() {
        return new EnumC3657[]{f13397, f13395};
    }

    static {
        final String str = "STRING";
        final int i = 1;
        f13395 = new EnumC3657(str, i) { // from class: l.۬ۖ᩸
            {
                C0835 c0835 = null;
            }

            @Override // l.EnumC3657
            /* JADX INFO: renamed from: ۙ */
            public AbstractC1810 mo3440(Long l2) {
                if (l2 == null) {
                    return C3221.f12023;
                }
                return new C2246(l2.toString());
            }
        };
    }
}
