package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۚ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC5909 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC5909 f20225 = new C20079();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC5909 f20224 = new C15603();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC5909 f20222 = new C13366();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC5909[] f20223 = m17149();

    public /* synthetic */ EnumC5909(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract EnumC5909 mo17151(EnumC5909 enumC5909);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract EnumC5909 mo17153(EnumC5909 enumC5909);

    public EnumC5909(String str, int i) {
        super(str, i);
    }

    public static EnumC5909 valueOf(String str) {
        return (EnumC5909) Enum.valueOf(EnumC5909.class, str);
    }

    public static EnumC5909[] values() {
        return (EnumC5909[]) f20223.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC5909[] m17149() {
        return new EnumC5909[]{f20225, f20224, f20222};
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC5909 m17154(boolean z) {
        return mo17153(m17150(z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC5909 m17152(boolean z) {
        return mo17151(m17150(z));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static EnumC5909 m17150(boolean z) {
        return z ? f20225 : f20224;
    }
}
