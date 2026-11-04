package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֨֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC0816 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0816 f3093 = new C7528();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC0816 f3094 = new C18715();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC0816 f3091 = new C9764();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC0816[] f3092 = m3283();

    public /* synthetic */ EnumC0816(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract EnumC0816 mo3284();

    public EnumC0816(String str, int i) {
        super(str, i);
    }

    public static EnumC0816 valueOf(String str) {
        return (EnumC0816) Enum.valueOf(EnumC0816.class, str);
    }

    public static EnumC0816[] values() {
        return (EnumC0816[]) f3092.clone();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC0816[] m3283() {
        return new EnumC0816[]{f3093, f3094, f3091};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m3285(EnumC0816 enumC0816) {
        int iOrdinal;
        if (enumC0816 != this && (iOrdinal = enumC0816.ordinal()) != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return true;
                }
                C11972.m30024("Cannot get here!");
                throw null;
            }
            if (this != f3091) {
                return true;
            }
        }
        return false;
    }
}
