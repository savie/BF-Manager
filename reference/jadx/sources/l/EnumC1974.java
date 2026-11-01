package l;

/* JADX INFO: renamed from: l.֫ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9K4 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1974 {
    UNIVERSAL(0),
    APPLICATION(64),
    CONTEXT_SPECIFIC(128),
    PRIVATE(192);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f7410;

    EnumC1974(int i) {
        this.f7410 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC1974 m6348(byte b) {
        int i = b & 192;
        for (EnumC1974 enumC1974 : values()) {
            if (enumC1974.f7410 == i) {
                return enumC1974;
            }
        }
        throw new IllegalStateException("Could not parse ASN.1 Tag Class (should be impossible)");
    }

    public int getValue() {
        return this.f7410;
    }
}
