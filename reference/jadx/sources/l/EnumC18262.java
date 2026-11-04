package l;

/* JADX INFO: renamed from: l.ܿۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66JZ */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC18262 {
    AOSP(64, "aosp"),
    MOTOROLA_76(76, "motorola76");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f59590;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f59591;

    EnumC18262(int i, String str) {
        this.f59590 = i;
        this.f59591 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC18262 m42405(String str) {
        for (EnumC18262 enumC18262 : values()) {
            if (enumC18262.f59591.equals(str)) {
                return enumC18262;
            }
        }
        throw new IllegalArgumentException(C25272.m56409("Unknown config layout: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m42407() {
        return this == MOTOROLA_76 ? 1835008 : 0;
    }
}
