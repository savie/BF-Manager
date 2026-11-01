package l;

/* JADX INFO: renamed from: l.ۧۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66JZ */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10977 {
    AOSP(64, "aosp"),
    MOTOROLA_76(76, "motorola76");


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f37393;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f37394;

    EnumC10977(int i, String str) {
        this.f37393 = i;
        this.f37394 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10977 m27726(String str) {
        for (EnumC10977 enumC10977 : values()) {
            if (enumC10977.f37394.equals(str)) {
                return enumC10977;
            }
        }
        throw new IllegalArgumentException(C0252.m1693("Unknown config layout: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m27728() {
        return this == MOTOROLA_76 ? 1835008 : 0;
    }
}
