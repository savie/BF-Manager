package l;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۙ᩶۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 041Z */
/* JADX INFO: loaded from: classes2.dex */
public class EnumC4870 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC4870 f17141 = new EnumC4870("PUBLIC", 0);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC4870 f17133 = new EnumC4870("PROTECTED", 1);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC4870 f17131 = new EnumC4870("PRIVATE", 2);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC4870 f17140 = new EnumC4870("ABSTRACT", 3);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC4870 f17127 = new EnumC4870("DEFAULT", 4);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC4870 f17128 = new EnumC4870("STATIC", 5);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC4870 f17136 = new EnumC4870("SEALED", 6);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC4870 f17139 = new C3334();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC4870 f17138 = new EnumC4870("FINAL", 8);

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC4870 f17130 = new EnumC4870("TRANSIENT", 9);

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC4870 f17135 = new EnumC4870("VOLATILE", 10);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC4870 f17129 = new EnumC4870("SYNCHRONIZED", 11);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC4870 f17134 = new EnumC4870("NATIVE", 12);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC4870 f17132 = new EnumC4870("STRICTFP", 13);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC4870[] f17137 = m13574();

    public /* synthetic */ EnumC4870(String str, int i, int i2) {
        this(str, i);
    }

    public EnumC4870(String str, int i) {
        super(str, i);
    }

    public static EnumC4870 valueOf(String str) {
        return (EnumC4870) Enum.valueOf(EnumC4870.class, str);
    }

    public static EnumC4870[] values() {
        return (EnumC4870[]) f17137.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC4870[] m13574() {
        return new EnumC4870[]{f17141, f17133, f17131, f17140, f17127, f17128, f17136, f17139, f17138, f17130, f17135, f17129, f17134, f17132};
    }

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase(Locale.US);
    }
}
