package l;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩻֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 041Z */
/* JADX INFO: loaded from: classes.dex */
public class EnumC24688 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC24688 f79880 = new EnumC24688("PUBLIC", 0);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC24688 f79874 = new EnumC24688("PROTECTED", 1);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC24688 f79881 = new EnumC24688("PRIVATE", 2);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC24688 f79886 = new EnumC24688("ABSTRACT", 3);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC24688 f79884 = new EnumC24688("DEFAULT", 4);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumC24688 f79879 = new EnumC24688("STATIC", 5);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC24688 f79875 = new EnumC24688("SEALED", 6);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC24688 f79885 = new C11261();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC24688 f79873 = new EnumC24688("FINAL", 8);

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC24688 f79876 = new EnumC24688("TRANSIENT", 9);

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC24688 f79887 = new EnumC24688("VOLATILE", 10);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC24688 f79882 = new EnumC24688("SYNCHRONIZED", 11);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC24688 f79878 = new EnumC24688("NATIVE", 12);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC24688 f79877 = new EnumC24688("STRICTFP", 13);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC24688[] f79883 = m55027();

    public /* synthetic */ EnumC24688(String str, int i, int i2) {
        this(str, i);
    }

    public EnumC24688(String str, int i) {
        super(str, i);
    }

    public static EnumC24688 valueOf(String str) {
        return (EnumC24688) Enum.valueOf(EnumC24688.class, str);
    }

    public static EnumC24688[] values() {
        return (EnumC24688[]) f79883.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC24688[] m55027() {
        return new EnumC24688[]{f79880, f79874, f79881, f79886, f79884, f79879, f79875, f79885, f79873, f79876, f79887, f79882, f79878, f79877};
    }

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase(Locale.US);
    }
}
