package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۠ۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC8112 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC8112 f28425 = new C21517();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC8112 f28428 = new C17989();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC8112 f28427 = new C18695();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC8112[] f28426 = m21370();

    public /* synthetic */ EnumC8112(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract EnumC8112 mo21371();

    public EnumC8112(String str, int i) {
        super(str, i);
    }

    public static EnumC8112 valueOf(String str) {
        return (EnumC8112) Enum.valueOf(EnumC8112.class, str);
    }

    public static EnumC8112[] values() {
        return (EnumC8112[]) f28426.clone();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC8112[] m21370() {
        return new EnumC8112[]{f28425, f28428, f28427};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m21372(EnumC8112 enumC8112) {
        int iOrdinal;
        if (enumC8112 != this && (iOrdinal = enumC8112.ordinal()) != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return true;
                }
                C6171.m17174("Cannot get here!");
                throw null;
            }
            if (this != f28427) {
                return true;
            }
        }
        return false;
    }
}
