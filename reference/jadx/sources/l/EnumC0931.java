package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֨ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC0931 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC21461 f3454;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0931 f3452 = new C7643(EnumC21461.f68543);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC0931 f3450 = new C18830(EnumC21461.f68495);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC0931 f3451 = new C9879(EnumC21461.f68481);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC0931[] f3453 = m3734();

    public /* synthetic */ EnumC0931(String str, int i, int i2, EnumC21461 enumC21461) {
        this(str, i, enumC21461);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC8036 mo3735(AbstractC8036 abstractC8036);

    public static EnumC0931 valueOf(String str) {
        return (EnumC0931) Enum.valueOf(EnumC0931.class, str);
    }

    public static EnumC0931[] values() {
        return (EnumC0931[]) f3453.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC0931[] m3734() {
        return new EnumC0931[]{f3452, f3450, f3451};
    }

    public EnumC0931(String str, int i, EnumC21461 enumC21461) {
        super(str, i);
        this.f3454 = enumC21461;
    }
}
